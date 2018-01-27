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

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.serializer.ISerializer;

/**
 * An exception from the Graph service.
 */
public class GraphServiceException extends ClientException {

    /**
     * New line delimiter.
     */
    protected static final char NEW_LINE = '\n';

    /**
     * How truncated values are shown.
     */
    protected static final String TRUNCATION_MARKER = "[...]";

    /**
     * The maximum length for a single line string when trying to be brief.
     */
    protected static final int MAX_BREVITY_LENGTH = 50;

    /**
     * The number of bytes to display when showing byte array.
     */
    protected static final int MAX_BYTE_COUNT_BEFORE_TRUNCATION = 8;

    /**
     * The internal server error threshold defined by the HTTP protocol.
     */
    public static final int INTERNAL_SERVER_ERROR = 500;

    /**
     * The GraphError response.
     */
    private final transient GraphErrorResponse error;

    /**
     * The HTTP method.
     */
    private final String method;

    /**
     * The request URL.
     */
    private final String url;

    /**
     * The request headers.
     */
    private final List<String> requestHeaders;

    /**
     * The request body represented as a string.
     */
    private final String requestBody;

    /**
     * The HTTP status code.
     */
    private final int responseCode;

    /**
     * The HTTP status message.
     */
    private final String responseMessage;

    /**
     * The response headers.
     */
    private final List<String> responseHeaders;
    
    /**
     * Whether to log the full error response.
     */
    private final boolean verbose;

    /**
     * Create a Graph service exception.
     *
     * @param method          The method that caused the exception.
     * @param url             The URL.
     * @param requestHeaders  The request headers.
     * @param requestBody     The request body.
     * @param responseCode    The response code.
     * @param responseMessage The response message.
     * @param responseHeaders The response headers.
     * @param error           The error response if available.
     * @param verbose         The error response log level.
     */
    protected GraphServiceException(final String method,
                                    final String url,
                                    final List<String> requestHeaders,
                                    final String requestBody,
                                    final int responseCode,
                                    final String responseMessage,
                                    final List<String> responseHeaders,
                                    final GraphErrorResponse error,
                                    final boolean verbose) {
        super(responseMessage, null);
        this.method = method;
        this.url = url;
        this.requestHeaders = requestHeaders;
        this.requestBody = requestBody;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseHeaders = responseHeaders;
        this.error = error;
        this.verbose = verbose;
    }

    @Override
    public String getMessage() {
        return getMessage(verbose);
    }

    /**
     * Gets the message for this exception.
     *
     * @param verbose If the message should be brief or more verbose.
     * @return The message.
     */
    public String getMessage(final boolean verbose) {
        final StringBuilder sb = new StringBuilder();
        if (error != null && error.error != null) {
            sb.append("Error code: ").append(error.error.code).append(NEW_LINE);
            sb.append("Error message: ").append(error.error.message).append(NEW_LINE);
            sb.append(NEW_LINE);
        }
        // Request information
        sb.append(method).append(' ').append(url).append(NEW_LINE);
        for (final String header : requestHeaders) {
            if (verbose) {
                sb.append(header);
            } else {
                final String truncatedHeader = header.substring(0, Math.min(MAX_BREVITY_LENGTH, header.length()));
                sb.append(truncatedHeader);
                if (truncatedHeader.length() == MAX_BREVITY_LENGTH) {
                    sb.append(TRUNCATION_MARKER);
                }
            }
            sb.append(NEW_LINE);
        }
        if (requestBody != null) {
            if (verbose) {
                sb.append(requestBody);
            } else {
                final int bodyLength = Math.min(MAX_BREVITY_LENGTH, requestBody.length());
                final String truncatedBody = requestBody.substring(0, bodyLength);
                sb.append(truncatedBody);
                if (truncatedBody.length() == MAX_BREVITY_LENGTH) {
                    sb.append(TRUNCATION_MARKER);
                }
            }
        }
        sb.append(NEW_LINE).append(NEW_LINE);

        // Response information
        sb.append(responseCode).append(" : ").append(responseMessage).append(NEW_LINE);
        for (final String header : responseHeaders) {
            if (verbose) {
                sb.append(header).append(NEW_LINE);
            } else {
                if (header.toLowerCase(Locale.ROOT).startsWith("x-throwsite")) {
                    sb.append(header).append(NEW_LINE);
                }
            }
        }
        if (verbose && error != null && error.rawObject != null) {
            try {
                final Gson gson = new GsonBuilder().setPrettyPrinting().create();
                sb.append(gson.toJson(error.rawObject)).append(NEW_LINE);
            } catch (final RuntimeException ignored) {
                sb.append("[Warning: Unable to parse error message body]").append(NEW_LINE);
            }
        } else {
        	if (!verbose) {
        		sb.append(TRUNCATION_MARKER).append(NEW_LINE).append(NEW_LINE);
                sb.append("[Some information was truncated for brevity, enable debug logging for more details]");
        	}
        }
        return sb.toString();
    }

    /**
     * Gets the error message from the Graph service object.
     *
     * @return The error message.
     */
    public GraphError getServiceError() {
        return error.error;
    }

    /**
     * Creates a Graph service exception from a given failed HTTP request.
     *
     * @param request      The request that resulted in this failure.
     * @param serializable The serialized object that was sent with this request.
     * @param serializer   The serializer to re-create the option in its over the wire state.
     * @param connection   The connection that was used to extract the response information from.
     * @param <T>          The type of the serializable object.
     * @return The new GraphServiceException instance.
     * @throws IOException An exception occurs if there were any problems processing the connection.
     */
    public static <T> GraphServiceException createFromConnection(final IHttpRequest request,
                                                                 final T serializable,
                                                                 final ISerializer serializer,
                                                                 final IConnection connection,
                                                                 final ILogger logger)
            throws IOException {
        final String method = connection.getRequestMethod();
        final String url = request.getRequestUrl().toString();
        final List<String> requestHeaders = new LinkedList<>();
        for (final HeaderOption option : request.getHeaders()) {
            requestHeaders.add(option.getName() + " : " + option.getValue());
        }
        boolean isVerbose = logger.getLoggingLevel() == LoggerLevel.DEBUG;
        final String requestBody;
        if (serializable instanceof byte[]) {
            final byte[] bytes = (byte[]) serializable;
            StringBuilder sb = new StringBuilder();
            sb.append("byte[").append(bytes.length).append("]");

            sb.append(" {");
            if (isVerbose) {
            	sb.append(bytes);
            } else {
	            for (int i = 0; i < MAX_BYTE_COUNT_BEFORE_TRUNCATION && i < bytes.length; i++) {
	                sb.append(bytes[i]).append(", ");
	            }
	            if (bytes.length > MAX_BYTE_COUNT_BEFORE_TRUNCATION) {
	                sb.append(TRUNCATION_MARKER).append("}");
	            }
            }
            requestBody = sb.toString();
        } else if (serializable != null) {
            requestBody = serializer.serializeObject(serializable);
        } else {
            requestBody = null;
        }

        final int responseCode = connection.getResponseCode();
        final List<String> responseHeaders = new LinkedList<>();
        final Map<String, String> headers = connection.getHeaders();
        for (final String key : headers.keySet()) {
            final String fieldPrefix;
            if (key == null) {
                fieldPrefix = "";
            } else {
                fieldPrefix = key + " : ";
            }
            responseHeaders.add(fieldPrefix + headers.get(key));
        }

        final String responseMessage = connection.getResponseMessage();
        final String rawOutput = DefaultHttpProvider.streamToString(connection.getInputStream());
        GraphErrorResponse error;
        try {
            error = serializer.deserializeObject(rawOutput, GraphErrorResponse.class, connection.getResponseHeaders());
        } catch (final Exception ex) {
            error = new GraphErrorResponse();
            error.error = new GraphError();
            error.error.code = "Unable to parse error response message";
            error.error.message = "Raw error: " + rawOutput;
            error.error.innererror = new GraphInnerError();
            error.error.innererror.code = ex.getMessage();
        }

        if (responseCode >= INTERNAL_SERVER_ERROR) {
            return new GraphFatalServiceException(method,
                    url,
                    requestHeaders,
                    requestBody,
                    responseCode,
                    responseMessage,
                    responseHeaders,
                    error,
                    isVerbose);
        }

        return new GraphServiceException(method,
                url,
                requestHeaders,
                requestBody,
                responseCode,
                responseMessage,
                responseHeaders,
                error,
                isVerbose);
    }
}
