package com.microsoft.graph.serializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.UUID;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.microsoft.graph.logger.ILogger;

public class EdmNativeTypeSerializer {
    public static <T> T deserialize(final JsonElement json, final Class<T> type, final ILogger logger) throws JsonParseException {
        if (json == null || !(type instanceof Class)) {
			return null;
        } else if(json.isJsonPrimitive()) {
            return getPrimitiveValue(json, type);
		} else if(json.isJsonObject()) {
            final JsonElement element = json.getAsJsonObject().get("@odata.null");
            if(element != null && element.isJsonPrimitive()) {
                return getPrimitiveValue(element, type);
            } else {
                return null;
            }
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    private static <T> T getPrimitiveValue(final JsonElement json, final Class<T> type) {
        if(type == Boolean.class) {
            return (T) Boolean.valueOf(json.getAsBoolean());
        } else if(type == String.class) {
            return (T)json.getAsString();
        } else if(type == Integer.class) {
            return (T) Integer.valueOf(json.getAsInt());
        } else if(type == UUID.class) {
            return (T) UUID.fromString(json.getAsString());
        } else if(type == Long.class) {
            return (T) Long.valueOf(json.getAsLong());
        } else if (type == Float.class) {
            return (T) Float.valueOf(json.getAsFloat());
        } else if (type == BigDecimal.class) {
            return (T) json.getAsBigDecimal();
        } else {
            return null;
        }
    }
}
