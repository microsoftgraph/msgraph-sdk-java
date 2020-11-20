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

package com.microsoft.graph.serializer;

import com.google.gson.JsonObject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * An object that was parsed from JSON
 */
public interface IJsonBackedObject {

    /**
     * Sets the raw JSON object this object was parsed from
     *
     * @param serializer the serializer for sub class deserialization
     * @param json       the JSON that this object was derived from
     */
    void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json);

    /**
     * Provides access to objects not anticipated in the model, as well as 
     * request and response data from the HTTP call
     * 
     * @return the AddtionalDataManager
     */
    @Nullable
    AdditionalDataManager additionalDataManager();


    /**
     * Gets the raw JSON object for this object as parsed from
     * @return the JSON that this object was derived from
     */
    @Nullable
    JsonObject getRawObject();

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    ISerializer getSerializer();
}
