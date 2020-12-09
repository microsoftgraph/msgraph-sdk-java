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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.logger.ILogger;

import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Serializes and deserializes EnumSets
 * The Graph service expects a single enum value as a comma-delimited string
 * Here, we flatten the EnumSet to serialize the object
 * and insert the response into an array to deserialize back to an EnumSet
 */
public class EnumSetSerializer {

    private final Gson gson;
    /**
     * Not available for instantiation
     * @param logger logger to use during serialization
     */
    public EnumSetSerializer(final ILogger logger) {
         gson = new GsonBuilder().registerTypeAdapterFactory(new FallbackTypeAdapterFactory(logger)).create();
    }

    /**
     * Deserializes a comma-delimited string of enum values
     *
     * @param type                 the type
     * @param jsonStrToDeserialize the string to deserialize
     * @return                     EnumSet of values
     */
    public EnumSet<?> deserialize(Type type, String jsonStrToDeserialize) {
            final String arrayString = "[" + jsonStrToDeserialize + "]";
            return jsonStrToDeserialize == null ? null : (EnumSet<?>) gson.fromJson(arrayString, type);
    }

    /**
     * Serializes an EnumSet into a comma-delimited string
     *
     * @param src the source EnumSet
     * @return    a comma-delimited string of enum values
     */
    public JsonPrimitive serialize(EnumSet<?> src) {
        final StringBuilder serializedStringBuilder = new StringBuilder();

        final Iterator<?> i = src.iterator();
        while (i.hasNext()) {
            final String jsonValue = gson.toJson(i.next());
            serializedStringBuilder.append(jsonValue.substring(1, jsonValue.length() -1));
            if(i.hasNext()) {
                serializedStringBuilder.append(",");
            }
        }
        return new JsonPrimitive(serializedStringBuilder.toString());
    }
}
