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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.graph.logger.ILogger;

import java.util.Map;

/**
 * The default serializer implementation for the SDK.
 */
public class DefaultSerializer implements ISerializer {

    /**
     * The instance of the internal serializer.
     */
    private final Gson gson;

    /**
     * The logger.
     */
    private final ILogger logger;

    /**
     * Creates a DefaultSerializer.
     *
     * @param logger The logger.
     */
    public DefaultSerializer(final ILogger logger) {
        this.logger = logger;
        this.gson = GsonFactory.getGsonInstance(logger);
    }

    /**
     * Deserialize an object from the input string.
     *
     * @param inputString The string that stores the representation of the item.
     * @param clazz       The .class of the item to be deserialized.
     * @param <T>         The type of the item to be deserialized.
     * @return The deserialized item from the input string.
     */
    @Override
    public <T> T deserializeObject(final String inputString, final Class<T> clazz) {
        final T jsonObject = gson.fromJson(inputString, clazz);

        // Populate the json backed fields for any annotations that are not in the object model
        if (jsonObject instanceof IJsonBackedObject) {
            logger.logDebug("Deserializing type " + clazz.getSimpleName());
            final IJsonBackedObject jsonBackedObject = (IJsonBackedObject) jsonObject;
            final JsonObject rawObject = gson.fromJson(inputString, JsonObject.class);
            jsonBackedObject.setRawObject(this, rawObject);
            jsonBackedObject.additionalDataManager().setAdditionalData(rawObject);
        } else {
            logger.logDebug("Deserializing a non-IJsonBackedObject type " + clazz.getSimpleName());
        }

        return jsonObject;
    }

    /**
     * Serializes an object into a string.
     *
     * @param serializableObject The object to convert into a string.
     * @param <T>                The type of the item to be serialized.
     * @return The string representation of that item.
     */
    @Override
    public <T> String serializeObject(final T serializableObject) {
        logger.logDebug("Serializing type " + serializableObject.getClass().getSimpleName());
        JsonElement outJsonTree = gson.toJsonTree(serializableObject);

        if (serializableObject instanceof IJsonBackedObject) {
            AdditionalDataManager additionalData =
                    ((IJsonBackedObject) serializableObject)
                            .additionalDataManager();
            if (outJsonTree.isJsonObject()) {
                JsonObject outJson = outJsonTree.getAsJsonObject();
                for (Map.Entry<String, JsonElement> entry : additionalData.entrySet()) {
                    if (!fieldIsOdataTransient(entry)) {
                        outJson.add(
                                entry.getKey(),
                                entry.getValue()
                        );
                    }
                }
                outJsonTree = outJson;
            }
        }

        return outJsonTree.toString();
    }

    private boolean fieldIsOdataTransient(Map.Entry<String, JsonElement> entry) {
        return entry.getKey().startsWith("@");
    }
}
