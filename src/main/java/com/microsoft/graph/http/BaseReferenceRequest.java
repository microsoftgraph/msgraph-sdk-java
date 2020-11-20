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
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.options.Option;

import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * An HTTP request.
 * 
 * @param <T> the response class
 */
public abstract class BaseReferenceRequest<T> extends BaseRequest<T> {

    /**
     * The request for reference
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param entityType     the class for the entity
     */
    public BaseReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final Class<T> entityType) {
        super(requestUrl, client, requestOptions, entityType);
    }

    /**
     * Deletes the entity and invokes the callback
     * @param callback callback to be invoked once the entity is deleted
     */
    public void delete(@Nonnull final ICallback<? super T> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Deletes the entity
     * @return the deleted entity 
     */
    @Nullable
    public T delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }
}
