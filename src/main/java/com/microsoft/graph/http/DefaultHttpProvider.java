// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.google.common.annotations.VisibleForTesting;
import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.DefaultConnectionConfig;
import com.microsoft.graph.core.IConnectionConfig;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.serializer.ISerializer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * HTTP provider based off of URLConnection
 */
public class DefaultHttpProvider implements IHttpProvider {

    /**
     * The content type header
     */
    static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    /**
     * The content type for JSON responses
     */
    static final String JSON_CONTENT_TYPE = "application/json";
    
    /**
     * The encoding type for getBytes
     */
    static final String JSON_ENCODING = "UTF-8";

    /**
     * The serializer
     */
    private final ISerializer serializer;

    /**
     * The authentication provider
     */
    private final IAuthenticationProvider authenticationProvider;

    /**
     * The executors
     */
    private final IExecutors executors;

    /**
     * The logger
     */
    private final ILogger logger;

    /**
     * The connection factory
     */
    private IConnectionFactory connectionFactory;
    
    /**
     * The connection config
     */
    private IConnectionConfig connectionConfig;

    /**
     * Creates the DefaultHttpProvider using a DefaultConnectionFactory.
     *
     * @param serializer             the serializer
     * @param authenticationProvider the authentication provider
     * @param executors              the executors
     * @param logger                 the logger for diagnostic information
     */
    public DefaultHttpProvider(final ISerializer serializer,
                               final IAuthenticationProvider authenticationProvider,
                               final IExecutors executors,
                               final ILogger logger) {
        this(serializer, authenticationProvider, executors, logger, new DefaultConnectionFactory());
    }

    /**
     * Creates the DefaultHttpProvider
     *
     * @param serializer             the serializer
     * @param authenticationProvider the authentication provider
     * @param executors              the executors
     * @param logger                 the logger for diagnostic information
     * @param connectionFactory      an IConnectionFactory to create outgoing connections
     */
    public DefaultHttpProvider(final ISerializer serializer,
                               final IAuthenticationProvider authenticationProvider,
                               final IExecutors executors,
                               final ILogger logger,
                               final IConnectionFactory connectionFactory) {
        this.serializer = serializer;
        this.authenticationProvider = authenticationProvider;
        this.executors = executors;
        this.logger = logger;
        this.connectionFactory = connectionFactory;
    }

    /**
     * Gets the serializer for this HTTP provider
     *
     * @return the serializer for this provider
     */
    @Override
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sends the HTTP request asynchronously
     *
     * @param request      the request description
     * @param callback     the callback to be called after success or failure
     * @param resultClass  the class of the response from the service
     * @param serializable the object to send to the service in the body of the request
     * @param <Result>     the type of the response object
     * @param <Body>       the type of the object to send to the service in the body of the request
     */
    @Override
    public <Result, Body> void send(final IHttpRequest request,
                                    final ICallback<Result> callback,
                                    final Class<Result> resultClass,
                                    final Body serializable) {
        final IProgressCallback<Result> progressCallback;
        if (callback instanceof IProgressCallback) {
            progressCallback = (IProgressCallback<Result>) callback;
        } else {
            progressCallback = null;
        }

        executors.performOnBackground(new Runnable() {
            @Override
            public void run() {
                try {
                    executors.performOnForeground(sendRequestInternal(request,
                            resultClass,
                            serializable,
                            progressCallback,
                            null),
                            callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
            }
        });
    }

    /**
     * Sends the HTTP request
     *
     * @param request      the request description
     * @param resultClass  the class of the response from the service
     * @param serializable the object to send to the service in the body of the request
     * @param <Result>     the type of the response object
     * @param <Body>       the type of the object to send to the service in the body of the request
     * @return             the result from the request
     * @throws ClientException an exception occurs if the request was unable to complete for any reason
     */
    @Override
    public <Result, Body> Result send(final IHttpRequest request,
                                      final Class<Result> resultClass,
                                      final Body serializable)
            throws ClientException {
        return send(request, resultClass, serializable, null);
    }

    /**
     * Sends the HTTP request
     *
     * @param request           the request description
     * @param resultClass       the class of the response from the service
     * @param serializable      the object to send to the service in the body of the request
     * @param handler           the handler for stateful response
     * @param <Result>          the type of the response object
     * @param <Body>            the type of the object to send to the service in the body of the request
     * @param <DeserializeType> the response handler for stateful response
     * @return                  the result from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public <Result, Body, DeserializeType> Result send(final IHttpRequest request,
                                                       final Class<Result> resultClass,
                                                       final Body serializable,
                                                       final IStatefulResponseHandler<Result, DeserializeType> handler) throws ClientException {
        return sendRequestInternal(request, resultClass, serializable, null, handler);
    }

    /**
     * Sends the HTTP request
     *
     * @param request           the request description
     * @param resultClass       the class of the response from the service
     * @param serializable      the object to send to the service in the body of the request
     * @param progress          the progress callback for the request
     * @param handler           the handler for stateful response
     * @param <Result>          the type of the response object
     * @param <Body>            the type of the object to send to the service in the body of the request
     * @param <DeserializeType> the response handler for stateful response
     * @return                  the result from the request
     * @throws ClientException an exception occurs if the request was unable to complete for any reason
     */
    @SuppressWarnings("unchecked")
    private <Result, Body, DeserializeType> Result sendRequestInternal(final IHttpRequest request,
                                                                       final Class<Result> resultClass,
                                                                       final Body serializable,
                                                                       final IProgressCallback<Result> progress,
                                                                       final IStatefulResponseHandler<Result, DeserializeType> handler)
            throws ClientException {
        final int defaultBufferSize = 4096;
        final String binaryContentType = "application/octet-stream";

        try {
            if (authenticationProvider != null) {
                authenticationProvider.authenticateRequest(request);
            }

            OutputStream out = null;
            InputStream in = null;
            boolean isBinaryStreamInput = false;
            final URL requestUrl = request.getRequestUrl();
            logger.logDebug("Starting to send request, URL " + requestUrl.toString());
            final IConnection connection = connectionFactory.createFromRequest(request);
            if(this.connectionConfig == null) {
                this.connectionConfig = new DefaultConnectionConfig();
            }
            connection.setConnectTimeout(connectionConfig.getConnectTimeout());
            connection.setReadTimeout(connectionConfig.getReadTimeout());

            try {
                logger.logDebug("Request Method " + request.getHttpMethod().toString());
                List<HeaderOption> requestHeaders = request.getHeaders();

                final byte[] bytesToWrite;
                connection.addRequestHeader("Accept", "*/*");
                if (serializable == null) {
                	// Send an empty body through with a POST request
                	// This ensures that the Content-Length header is properly set
                	if (request.getHttpMethod() == HttpMethod.POST) {
                		bytesToWrite = new byte[0];
                	}
                	else {
                		bytesToWrite = null;
                	}
                } else if (serializable instanceof byte[]) {
                    logger.logDebug("Sending byte[] as request body");
                    bytesToWrite = (byte[]) serializable;

                    // If the user hasn't specified a Content-Type for the request
                    if (!hasHeader(requestHeaders, CONTENT_TYPE_HEADER_NAME)) {
                        connection.addRequestHeader(CONTENT_TYPE_HEADER_NAME, binaryContentType);
                    }
                    connection.setContentLength(bytesToWrite.length);
                } else {
                    logger.logDebug("Sending " + serializable.getClass().getName() + " as request body");
                    final String serializeObject = serializer.serializeObject(serializable);
                    bytesToWrite = serializeObject.getBytes(JSON_ENCODING);

                    // If the user hasn't specified a Content-Type for the request
                    if (!hasHeader(requestHeaders, CONTENT_TYPE_HEADER_NAME)) {
                        connection.addRequestHeader(CONTENT_TYPE_HEADER_NAME, JSON_CONTENT_TYPE);
                    }
                    connection.setContentLength(bytesToWrite.length);
                }

                // Handle cases where we've got a body to process.
                if (bytesToWrite != null) {
                    out = connection.getOutputStream();

                    int writtenSoFar = 0;
                    BufferedOutputStream bos = new BufferedOutputStream(out);

                    int toWrite;
                    do {
                        toWrite = Math.min(defaultBufferSize, bytesToWrite.length - writtenSoFar);
                        bos.write(bytesToWrite, writtenSoFar, toWrite);
                        writtenSoFar = writtenSoFar + toWrite;
                        if (progress != null) {
                            executors.performOnForeground(writtenSoFar, bytesToWrite.length,
                                    progress);
                        }
                    } while (toWrite > 0);
                    bos.close();
                }

                if (handler != null) {
                    handler.configConnection(connection);
                }

                logger.logDebug(String.format("Response code %d, %s",
                        connection.getResponseCode(),
                        connection.getResponseMessage()));

                if (handler != null) {
                    logger.logDebug("StatefulResponse is handling the HTTP response.");
                    return handler.generateResult(
                            request, connection, this.getSerializer(), this.logger);
                }

                if (connection.getResponseCode() >= HttpResponseCode.HTTP_CLIENT_ERROR) {
                    logger.logDebug("Handling error response");
                    in = connection.getInputStream();
                    handleErrorResponse(request, serializable, connection);
                }

                if (connection.getResponseCode() == HttpResponseCode.HTTP_NOBODY
                        || connection.getResponseCode() == HttpResponseCode.HTTP_NOT_MODIFIED) {
                    logger.logDebug("Handling response with no body");                  
                    return handleEmptyResponse(connection.getResponseHeaders(), resultClass);
                }

                if (connection.getResponseCode() == HttpResponseCode.HTTP_ACCEPTED) {
                    logger.logDebug("Handling accepted response");
                    return handleEmptyResponse(connection.getResponseHeaders(), resultClass);
                }

                in = new BufferedInputStream(connection.getInputStream());

                final Map<String, String> headers = connection.getHeaders();

                final String contentType = headers.get(CONTENT_TYPE_HEADER_NAME);
                if (contentType.contains(JSON_CONTENT_TYPE)) {
                    logger.logDebug("Response json");
                    return handleJsonResponse(in, connection.getResponseHeaders(), resultClass);
                } else {
                    logger.logDebug("Response binary");
                    isBinaryStreamInput = true;
                    //no inspection unchecked
                    return (Result) handleBinaryStream(in);
                }
            } finally {
                if (out != null) {
                    out.close();
                }
                if (!isBinaryStreamInput && in != null) {
                    in.close();
                    connection.close();
                }
            }
        } catch (final GraphServiceException ex) {
            final boolean shouldLogVerbosely = logger.getLoggingLevel() == LoggerLevel.DEBUG;
            logger.logError("Graph service exception " + ex.getMessage(shouldLogVerbosely), ex);
            throw ex;
        } catch (final UnsupportedEncodingException ex) {
        	final ClientException clientException = new ClientException("Unsupported encoding problem: ",
                    ex);
            logger.logError("Unsupported encoding problem: " + ex.getMessage(), ex);
            throw clientException;
        } catch (final Exception ex) {
            final ClientException clientException = new ClientException("Error during http request",
                    ex);
            logger.logError("Error during http request", clientException);
            throw clientException;
        }
    }

    /**
     * Handles the event of an error response
     *
     * @param request      the request that caused the failed response
     * @param serializable the body of the request
     * @param connection   the URL connection
     * @param <Body>       the type of the request body
     * @throws IOException an exception occurs if there were any problems interacting with the connection object
     */
    private <Body> void handleErrorResponse(final IHttpRequest request,
                                            final Body serializable,
                                            final IConnection connection)
            throws IOException {
        throw GraphServiceException.createFromConnection(request, serializable, serializer,
                connection, logger);
    }

    /**
     * Handles the cause where the response is a binary stream
     *
     * @param in the input stream from the response
     * @return   the input stream to return to the caller
     */
    private InputStream handleBinaryStream(final InputStream in) {
        return in;
    }

    /**
     * Handles the cause where the response is a JSON object
     *
     * @param in              the input stream from the response
     * @param responseHeaders the response header
     * @param clazz           the class of the response object
     * @param <Result>        the type of the response object
     * @return                the JSON object
     */
    private <Result> Result handleJsonResponse(final InputStream in, Map<String, List<String>> responseHeaders, final Class<Result> clazz) {
        if (clazz == null) {
            return null;
        }

        final String rawJson = streamToString(in);
        return getSerializer().deserializeObject(rawJson, clazz, responseHeaders);
    }
    
    /**
     * Handles the case where the response body is empty
     * 
     * @param responseHeaders the response headers
     * @param clazz           the type of the response object
     * @return                the JSON object
     */
    private <Result> Result handleEmptyResponse(Map<String, List<String>> responseHeaders, final Class<Result> clazz) 
    		throws UnsupportedEncodingException{
    	//Create an empty object to attach the response headers to
    	InputStream in = new ByteArrayInputStream("{}".getBytes(JSON_ENCODING));
    	return handleJsonResponse(in, responseHeaders, clazz);
    }

    /**
     * Sets the connection factory for this provider
     *
     * @param factory the new factory
     */
    void setConnectionFactory(final IConnectionFactory factory) {
        connectionFactory = factory;
    }

    /**
     * Reads in a stream and converts it into a string
     *
     * @param input the response body stream
     * @return      the string result
     */
    public static String streamToString(final InputStream input) {
        final String httpStreamEncoding = "UTF-8";
        final String endOfFile = "\\A";
        final Scanner scanner = new Scanner(input, httpStreamEncoding);
        String scannerString = "";
        try {
        	scanner.useDelimiter(endOfFile);
            scannerString = scanner.next();
        } finally {
        	scanner.close();
        }
        return scannerString;
    }

    /**
     * Searches for the given header in a list of HeaderOptions
     *
     * @param headers the list of headers to search through
     * @param header  the header name to search for (case insensitive)
     * @return        true if the header has already been set
     */
    @VisibleForTesting
    static boolean hasHeader(List<HeaderOption> headers, String header) {
        for (HeaderOption option : headers) {
            if (option.getName().equalsIgnoreCase(header)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public ILogger getLogger() {
        return logger;
    }

    @VisibleForTesting
    public IExecutors getExecutors() {
        return executors;
    }

    @VisibleForTesting
    public IAuthenticationProvider getAuthenticationProvider() {
        return authenticationProvider;
    }
    

    /**
     * Get connection config for read and connect timeout in requests
     *
     * @return Connection configuration to be used for timeout values
     */
    public IConnectionConfig getConnectionConfig() {
    	if(this.connectionConfig == null) {
    		this.connectionConfig = new DefaultConnectionConfig();
    	}
        return connectionConfig;
    }
    
    /**
     * Set connection config for read and connect timeout in requests
     *
     * @param connectionConfig Connection configuration to be used for timeout values
     */
    public void setConnectionConfig(IConnectionConfig connectionConfig) {
        this.connectionConfig = connectionConfig;
    }
}
