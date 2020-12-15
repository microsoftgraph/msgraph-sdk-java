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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A page of results from a collection
 *
 * @param <T1> the type of the item contained within the collection
 * @param <T2> the type of the request builder for the next page in this collection
 */
public abstract class BaseCollectionPage<T1, T2 extends IRequestBuilder> implements IBaseCollectionPage<T1, T2> {

    private AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    /**
     * The contents of this page
     */
    private final List<T1> pageContents;

    /**
     * The request builder for the next page
     */
    private final T2 requestBuilder;

    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Creates the collection page
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BaseCollectionPage(final List<T1> pageContents, final T2 nextRequestBuilder) {
        // CollectionPages are never directly modifiable, either 'update'/'delete' the specific child or 'add' the new
        // object to the 'children' of the collection.
        this.pageContents = Collections.unmodifiableList(pageContents == null ? new ArrayList<T1>() : pageContents);
        requestBuilder = nextRequestBuilder;
    }

    /**
     * Creates the collection page
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     * @param responseAdditionalData the additional data returned by the response
     */
    public BaseCollectionPage(final List<T1> pageContents, final T2 nextRequestBuilder, final AdditionalDataManager responseAdditionalData) {
        this(pageContents, nextRequestBuilder);
        this.additionalDataManager().putAll(responseAdditionalData);
    }

    /**
     * Gets the next page request builder
     *
     * @return the next page request builder
     */
    public T2 getNextPage() {
        return requestBuilder;
    }

    /**
     * Gets the current page
     *
     * @return the current page
     */
    public List<T1> getCurrentPage() {
        return pageContents;
    }

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets the serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json       the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;
    }

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }
}
