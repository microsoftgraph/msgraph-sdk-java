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
package com.microsoft.graph.serializer;

import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;

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

    /**
     * Not available for instantiation.
     */
    private EnumSetSerializer() {
    }

    /**
     * Deserializes a comma-delimited string of enum values
     * @param type The type
     * @param jsonStrToDeserialize The string to deserialize
     * @return EnumSet of values
     */
    public static EnumSet deserialize(Type type, String jsonStrToDeserialize) {
            Gson gson = new Gson();
            String arrayString = "[" + jsonStrToDeserialize + "]";
            return jsonStrToDeserialize == null ? null : (EnumSet) gson.fromJson(arrayString, type);
    }

    /**
     * Serializes an EnumSet into a comma-delimited string
     * @param src The source EnumSet
     * @return A comma-delimited string of enum values
     */
    public static JsonPrimitive serialize(EnumSet<?> src) {
        String serializedString = "";

        Iterator i = src.iterator();
        while (i.hasNext()) {
            serializedString += i.next().toString() + ",";
        }
        serializedString = serializedString.substring(0, serializedString.length()-1);
        return new JsonPrimitive(serializedString);
    }
}
