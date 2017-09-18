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

/**
 * Serializes and deserializes items from strings into their types.
 */
public interface ISerializer {

    /**
     * Deserialize an object from the input string.
     * @param inputString The string that stores the representation of the item.
     * @param clazz The .class of the item to be deserialized.
     * @param <T> The type of the item to be deserialized.
     * @return The deserialized item from the input string.
     */
    <T> T deserializeObject(final String inputString, Class<T> clazz);

    /**
     * Serializes an object into a string.
     * @param serializableObject The object to convert into a string.
     * @param <T> The type of the item to be serialized.
     * @return The string representation of that item.
     */
    <T> String serializeObject(final T serializableObject);
}
