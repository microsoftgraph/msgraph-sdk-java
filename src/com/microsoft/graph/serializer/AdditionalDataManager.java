package com.microsoft.graph.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdditionalDataManager extends HashMap<String, JsonElement> {

    private final IJsonBackedObject jsonBackedObject;

    public AdditionalDataManager(IJsonBackedObject jsonBackedObject) {
        this.jsonBackedObject = jsonBackedObject;
    }

    /**
     * TODO Document
     *
     * @param json
     */
    final void setAdditionalData(JsonObject json) {
        // get the names of all the Fields on this Object's hierarchy
        Set<String> objectFields = getFields();

        // get the keys on this JSON
        Set<String> jsonKeys = getJsonKeys(json);

        // get all keys present in JSON and *NOT* present in Fields
        Set<String> additionalDataKeys = new HashSet<>(jsonKeys);
        additionalDataKeys.removeAll(objectFields);

        // set the additionalData
        for (String jsonKey : additionalDataKeys) {
            put(jsonKey, json.get(jsonKey));
        }
    }

    private Set<String> getJsonKeys(JsonObject json) {
        Set<String> keys = new HashSet<>();
        Set<Map.Entry<String, JsonElement>> entries = json.entrySet();
        for (Map.Entry<String, JsonElement> entry : entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }

    private Set<String> getFields() {
        Field[] fields = jsonBackedObject.getClass().getFields();
        Set<String> serializingFields = new HashSet<>();
        for (Field field : fields) {
            SerializedName serializedName;
            if (null != (serializedName = field.getAnnotation(SerializedName.class))
                    && null != field.getAnnotation(Expose.class)) {
                serializingFields.add(serializedName.value());
            }
        }
        return serializingFields;
    }
}
