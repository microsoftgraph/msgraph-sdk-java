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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.CaseFormat;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.microsoft.graph.logger.ILogger;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * Handles serialization/deserialization for special types (especially of 
 * fields which are not caught by registering a type adapter).
 */
public final class FallbackTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * The unexpected value constant
     */
    private static final String NO_KNOWN_VALUE = "unexpectedValue";

    /**
     * The logger instance
     */
    private final ILogger logger;
    
    /**
     * Serializes an instance of Void (which is always null).
     */
    private static final TypeAdapter<Void> voidAdapter = new TypeAdapter<Void>() {

        @Override
        public void write(JsonWriter out, Void value) throws IOException {
            out.nullValue();
        }

        @Override
        public Void read(JsonReader in) throws IOException {
            return null;
        }
        
    };
    
    /**
     * Instanciates a new type adapter factory
     * 
     * @param logger logger to use for the factory
     */
    public FallbackTypeAdapterFactory(@Nonnull final ILogger logger) {
        this.logger = logger;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Nullable
    public <T> TypeAdapter<T> create(@Nonnull final Gson gson, @Nonnull final TypeToken<T> type) {
        final Class<T> rawType = (Class<T>) type.getRawType();
        if (rawType.isEnum()) {
            return new EnumTypeAdapter<T>(rawType, logger);
        } else if (rawType == Void.class) {
            return (TypeAdapter<T>) voidAdapter;
        }
        else {
            return null;
        }
    }
    
    private static final class EnumTypeAdapter<T> extends TypeAdapter<T> {
        
        private final Map<String, T> enumValues;
        private final ILogger logger;

        EnumTypeAdapter(Class<T> cls, ILogger logger) {
            super();
            this.logger = logger;
            final Map<String, T> enumValues = new HashMap<>();
            for (T constant : cls.getEnumConstants()) {
                enumValues.put(constant.toString(), constant);
            }
            this.enumValues = enumValues;
        }
        
        @Override
        public void write(final JsonWriter out, final T value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, value.toString()));
            }
        }

        @Override
        public T read(final JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            } else {
                String value = reader.nextString();
                T incoming = enumValues.get(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, value));
                if (incoming == null) {
                    logger.logDebug(
                            String.format(
                                    "The following value %s could not be recognized as a member of the enum",
                                    value)
                    );
                    return enumValues.get(NO_KNOWN_VALUE);
                }
                return incoming;
            }
        }
    }

}

