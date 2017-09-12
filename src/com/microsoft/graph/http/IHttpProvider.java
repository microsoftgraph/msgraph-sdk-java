// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
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
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.serializer.ISerializer;

/**
 * Sends http requests.
 */
public interface IHttpProvider {

    /**
     * Get the serializer for this http provider.
     *
     * @return The serializer for this provider.
     */
    ISerializer getSerializer();

    /**
     * Sends the http request asynchronously.
     *
     * @param request      The request description.
     * @param callback     The callback to be called after success or failure.
     * @param resultClass  The class of the response from the service.
     * @param serializable The object to send to the service in the body of the request.
     * @param <Result>     The type of the response object.
     * @param <BodyType>   The type of the object to send to the service in the body of the request.
     */
    <Result, BodyType> void send(final IHttpRequest request,
                                 final ICallback<Result> callback,
                                 final Class<Result> resultClass,
                                 final BodyType serializable);


    /**
     * Sends the http request.
     *
     * @param request      The request description.
     * @param resultClass  The class of the response from the service.
     * @param serializable The object to send to the service in the body of the request.
     * @param <Result>     The type of the response object.
     * @param <BodyType>   The type of the object to send to the service in the body of the request.
     * @return The result from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    <Result, BodyType> Result send(final IHttpRequest request,
                                   final Class<Result> resultClass,
                                   final BodyType serializable)
            throws ClientException;

    /**
     * Sends the http request.
     *
     * @param request           The request description.
     * @param resultClass       The class of the response from the service.
     * @param serializable      The object to send to the service in the body of the request.
     * @param handler           The handler for stateful response.
     * @param <Result>          The expected return type return.
     * @param <BodyType>        The type of the object to send to the service in the body of the request.
     * @param <DeserializeType> The type of the http response object.
     * @return The expected result object for the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    <Result, BodyType, DeserializeType> Result send(final IHttpRequest request,
                                                    final Class<Result> resultClass,
                                                    final BodyType serializable,
                                                    final IStatefulResponseHandler<Result, DeserializeType> handler)
            throws ClientException;
}
