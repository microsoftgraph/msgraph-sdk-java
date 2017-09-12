package com.microsoft.graph.serializer;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.ILogger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * FallBackEnumTypeAdapter class for handling unexpected values
 */
public class FallBackEnumTypeAdapter implements TypeAdapterFactory {

    /**
     * The unexpected value constant
     */
    private static final String NO_KNOWN_VALUE = "unexpectedValue";

    /**
     * The logger instance
     */
    private final ILogger mLogger = new DefaultLogger();

    /**
     * Creates the type adapter
     *
     * @param gson Gson
     * @param type The type.
     * @return <T> The type adapter
     */
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        //noinspection unchecked
        final Class<T> rawType = (Class<T>) type.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }

        final Map<String, T> enumValues = new HashMap<>();
        for (T constant : rawType.getEnumConstants()) {
            enumValues.put(constant.toString(), constant);
        }
        return new TypeAdapter<T>() {
            public void write(final JsonWriter out, final T value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.toString());
                }
            }

            public T read(final JsonReader reader) throws IOException {
                if (reader.peek() == JsonToken.NULL) {
                    reader.nextNull();
                    return null;
                } else {
                    String value = reader.nextString();
                    T incoming = enumValues.get(value);
                    if (incoming == null) {
                        mLogger.logDebug(
                                String.format(
                                        "The following value %s could not be recognized as a member of the enum",
                                        value)
                        );
                        return enumValues.get(NO_KNOWN_VALUE);
                    }
                    return incoming;
                }
            }
        };
    }

}

