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


import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.core.IBaseClient;

/**
 * Builder for a request
 */
public interface IRequestBuilder {

    /**
     * Gets the client for this request builder
     * 
     * @return the client for this request builder
     */
    @Nullable
    IBaseClient getClient();

    /**
     * Gets the request URL
     * 
     * @return the request URL
     */
    @Nullable
    String getRequestUrl();

    /**
     * Gets the request URL with an additional segment
     * 
     * @param urlSegment the segment to add to the URL
     * @return           the new request URL
     */
    @Nonnull
    String getRequestUrlWithAdditionalSegment(@Nonnull final String urlSegment);
}
