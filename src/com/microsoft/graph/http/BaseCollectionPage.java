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

import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.ISerializer;

import java.util.Collections;
import java.util.List;

/**
 * A page of results from a collection.
 *
 * @param <T1> The type of the item contained within the collection.
 * @param <T2> The type of the request builder for the next page in this collection
 */
public abstract class BaseCollectionPage<T1, T2 extends IRequestBuilder> implements IBaseCollectionPage<T1, T2> {

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    /**
     * The contents of this page.
     */
    private final List<T1> mPageContents;

    /**
     * The request builder for the next page.
     */
    private final T2 mRequestBuilder;

    /**
     * The raw representation of this class.
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer.
     */
    private transient ISerializer mSerializer;

    /**
     * Creates the collection page.
     *
     * @param pageContents       The contents of this page.
     * @param nextRequestBuilder The request builder for the next page.
     */
    public BaseCollectionPage(final List<T1> pageContents, final T2 nextRequestBuilder) {
        // CollectionPages are never directly modifiable, either 'update'/'delete' the specific child or 'add' the new
        // object to the 'children' of the collection.
        mPageContents = Collections.unmodifiableList(pageContents);
        mRequestBuilder = nextRequestBuilder;
    }

    /**
     * Gets the next page request builder.
     *
     * @return The next page request builder.
     */
    public T2 getNextPage() {
        return mRequestBuilder;
    }

    /**
     * Gets the current page.
     *
     * @return The current page.
     */
    public List<T1> getCurrentPage() {
        return mPageContents;
    }

    /**
     * Gets the raw representation of this class.
     *
     * @return The raw representation of this class.
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets the serializer.
     *
     * @return The serializer.
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object.
     *
     * @param serializer The serializer.
     * @param json       The json object to set this object to.
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;
    }

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }
}
