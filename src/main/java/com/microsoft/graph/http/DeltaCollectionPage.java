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

import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.ISerializer;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * A page of results from a delta collection
 *
 * @param <T> the type of the item contained within the collection
 */
public class DeltaCollectionPage<T, T2 extends BaseRequestBuilder<T>> extends BaseCollectionPage<T, T2> {
    /**
     * The opaque link to query delta after the 
     * initial request
     */
    @Nullable
    public String deltaLink;

    /**
     * A collection page for the delta response.
     *
     * @param response The serialized delta reponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeltaCollectionPage(@Nonnull final ICollectionResponse<T> response, @Nullable final T2 builder) {
       super(response.values(), builder, response.additionalDataManager());
        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }

    /**
     * Creates the collection page
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeltaCollectionPage(@Nonnull final List<T> pageContents, @Nullable final T2 nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    @Nullable
    public String deltaLink() {
        return deltaLink;
    }

}
