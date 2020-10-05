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

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IConnectionConfig;
import com.microsoft.graph.serializer.ISerializer;

import okhttp3.Request;

/**
 * Sends HTTP requests
 */
public interface IHttpProvider {

    /**
     * Get the serializer for this HTTP provider
     *
     * @return the serializer for this provider
     */
    ISerializer getSerializer();
    
    /**
     * Get connection config for read and connect timeout in requests
     *
     * @return Connection configuration to be used for timeout values
     * 
     */
    public IConnectionConfig getConnectionConfig();
    
    /**
     * Set connection config for read and connect timeout in requests
     *
     * @param connectionConfig Connection configuration to be used for timeout values
     * 
     */
    public void setConnectionConfig(IConnectionConfig connectionConfig);

    /**
     * Sends the HTTP request asynchronously
     *
     * @param request      the request description
     * @param callback     the callback to be called after success or failure
     * @param resultClass  the class of the response from the service
     * @param serializable the object to send to the service in the body of the request
     * @param <Result>     the type of the response object
     * @param <BodyType>   the type of the object to send to the service in the body of the request
     */
    <Result, BodyType> void send(final IHttpRequest request,
                                 final ICallback<? super Result> callback,
                                 final Class<Result> resultClass,
                                 final BodyType serializable);


    /**
     * Sends the HTTP request
     *
     * @param request      the request description
     * @param resultClass  the class of the response from the service
     * @param serializable the object to send to the service in the body of the request
     * @param <Result>     the type of the response object
     * @param <BodyType>   the type of the object to send to the service in the body of the request
     * @return             the result from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    <Result, BodyType> Result send(final IHttpRequest request,
                                   final Class<Result> resultClass,
                                   final BodyType serializable)
            throws ClientException;

    /**
     * Sends the HTTP request
     *
     * @param request           the request description
     * @param resultClass       the class of the response from the service
     * @param serializable      the object to send to the service in the body of the request
     * @param handler           the handler for stateful response
     * @param <Result>          the expected return type return
     * @param <BodyType>        the type of the object to send to the service in the body of the request
     * @param <DeserializeType> the type of the HTTP response object
     * @return                  the expected result object for the request
     * @throws ClientException  this exception occurs if the request was unable to complete for any reason
     */
    <Result, BodyType, DeserializeType> Result send(final IHttpRequest request,
                                                    final Class<Result> resultClass,
                                                    final BodyType serializable,
                                                    final IStatefulResponseHandler<Result, DeserializeType> handler)
            throws ClientException;
    /**
	 * Sends the HTTP request
	 *
	 * @param request           the request description
	 * @param resultClass       the class of the response from the service
	 * @param serializable      the object to send to the service in the body of the request
	 * @param progress          the progress callback for the request
	 * @param <Result>          the type of the response object
	 * @param <BodyType>        the type of the object to send to the service in the body of the request
	 * @return                  the result from the request
	 * @throws ClientException an exception occurs if the request was unable to complete for any reason
	 */
    <Result, BodyType> Request getHttpRequest(final IHttpRequest request,
                                              final Class<Result> resultClass,
                                              final BodyType serializable,
                                              final IProgressCallback<? super Result> progress)
            throws ClientException;
}
