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

import com.microsoft.graph.serializer.IJsonBackedObject;

import java.util.List;

/**
 * A page of results from a collection
 * 
 * @param <T> the type of the item contained within the collection
 */

public interface IBaseCollectionPage<T> extends IJsonBackedObject {

    /**
     * Gets the raw representation of this class
     * 
     * @return the raw representation of this class
     */
    JsonObject getRawObject();

    /**
     * Gets the next page request builder
     * 
     * @return the next page request builder
     */
    BaseRequestBuilder<T> getNextPage();

    /**
     * Gets the current page
     * 
     * @return the current page
     */
    List<T> getCurrentPage();
}
