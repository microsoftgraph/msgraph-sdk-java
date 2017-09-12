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
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.model.DateOnly;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

/**
 * Produce Gson instances that can parse http responses.
 */
final class GsonFactory {

    /**
     * Default constructor.
     */
    private GsonFactory() {
    }

    /**
     * Creates an instance of Gson.
     *
     * @param logger The logger.
     * @return The new instance.
     */
    public static Gson getGsonInstance(final ILogger logger) {

        final JsonSerializer<Calendar> calendarJsonSerializer = new JsonSerializer<Calendar>() {
            @Override
            public JsonElement serialize(final Calendar src,
                                         final Type typeOfSrc,
                                         final JsonSerializationContext context) {
                if (src == null) {
                    return null;
                }
                try {
                    return new JsonPrimitive(CalendarSerializer.serialize(src));
                } catch (final Exception e) {
                    logger.logError("Parsing issue on " + src, e);
                    return null;
                }
            }
        };

        final JsonDeserializer<Calendar> calendarJsonDeserializer = new JsonDeserializer<Calendar>() {
            @Override
            public Calendar deserialize(final JsonElement json,
                                        final Type typeOfT,
                                        final JsonDeserializationContext context) throws JsonParseException {
                if (json == null) {
                    return null;
                }
                try {
                    return CalendarSerializer.deserialize(json.getAsString());
                } catch (final ParseException e) {
                    logger.logError("Parsing issue on " + json.getAsString(), e);
                    return null;
                }
            }
        };

        final JsonSerializer<byte[]> byteArrayJsonSerializer = new JsonSerializer<byte[]>() {
            @Override
            public JsonElement serialize(final byte[] src,
                                         final Type typeOfSrc,
                                         final JsonSerializationContext context) {
                if (src == null) {
                    return null;
                }
                try {
                    return new JsonPrimitive(ByteArraySerializer.serialize(src));
                } catch (final Exception e) {
                    logger.logError("Parsing issue on " + src, e);
                    return null;
                }
            }
        };

        final JsonDeserializer<byte[]> byteArrayJsonDeserializer = new JsonDeserializer<byte[]>() {
            @Override
            public byte[] deserialize(final JsonElement json,
                                      final Type typeOfT,
                                      final JsonDeserializationContext context) throws JsonParseException {
                if (json == null) {
                    return null;
                }
                try {
                    return ByteArraySerializer.deserialize(json.getAsString());
                } catch (final ParseException e) {
                    logger.logError("Parsing issue on " + json.getAsString(), e);
                    return null;
                }
            }
        };

        final JsonSerializer<DateOnly> dateJsonSerializer = new JsonSerializer<DateOnly>() {
            @Override
            public JsonElement serialize(final DateOnly src,
                                         final Type typeOfSrc,
                                         final JsonSerializationContext context) {
                if (src == null) {
                    return null;
                }
                return new JsonPrimitive(src.toString());
            }
        };

        final JsonDeserializer<DateOnly> dateJsonDeserializer = new JsonDeserializer<DateOnly>() {
            @Override
            public DateOnly deserialize(final JsonElement json,
                                        final Type typeOfT,
                                        final JsonDeserializationContext context) throws JsonParseException {
                if (json == null) {
                    return null;
                }

                try {
                    return DateOnly.parse(json.getAsString());
                } catch (final ParseException e) {
                    logger.logError("Parsing issue on " + json.getAsString(), e);
                    return null;
                }
            }
        };

        final JsonSerializer<EnumSet> enumSetJsonSerializer = new JsonSerializer<EnumSet>() {
            @Override
            public JsonElement serialize(final EnumSet src,
                                         final Type typeOfSrc,
                                         final JsonSerializationContext context) {
                if (src == null || src.size() == 0) {
                    return null;
                }

                return EnumSetSerializer.serialize(src);
            }
        };

        final JsonDeserializer<EnumSet> enumSetJsonDeserializer = new JsonDeserializer<EnumSet>() {
            @Override
            public EnumSet deserialize(final JsonElement json,
                                        final Type typeOfT,
                                        final JsonDeserializationContext context) throws JsonParseException {
                if (json == null) {
                    return null;
                }

                return EnumSetSerializer.deserialize(typeOfT, json.getAsString());
            }
        };

        final JsonSerializer<Duration> durationJsonSerializer = new JsonSerializer<Duration>() {
            @Override
            public JsonElement serialize(final Duration src,
                                         final Type typeOfSrc,
                                         final JsonSerializationContext context) {
                return new JsonPrimitive(src.toString());
            }
        };

        final JsonDeserializer<Duration> durationJsonDeserializer = new JsonDeserializer<Duration>() {
            @Override
            public Duration deserialize(final JsonElement json,
                                       final Type typeOfT,
                                       final JsonDeserializationContext context) throws JsonParseException {
                try {
                    return DatatypeFactory.newInstance().newDuration(json.toString());
                } catch (Exception e) {
                    return null;
                }
            }
        };

        return new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .registerTypeAdapter(Calendar.class, calendarJsonSerializer)
                .registerTypeAdapter(Calendar.class, calendarJsonDeserializer)
                .registerTypeAdapter(GregorianCalendar.class, calendarJsonSerializer)
                .registerTypeAdapter(GregorianCalendar.class, calendarJsonDeserializer)
                .registerTypeAdapter(byte[].class, byteArrayJsonDeserializer)
                .registerTypeAdapter(byte[].class, byteArrayJsonSerializer)
                .registerTypeAdapter(DateOnly.class, dateJsonSerializer)
                .registerTypeAdapter(DateOnly.class, dateJsonDeserializer)
                .registerTypeAdapter(EnumSet.class, enumSetJsonSerializer)
                .registerTypeAdapter(EnumSet.class, enumSetJsonDeserializer)
                .registerTypeAdapter(Duration.class, durationJsonSerializer)
                .registerTypeAdapter(Duration.class, durationJsonDeserializer)
                .registerTypeAdapterFactory(new FallBackEnumTypeAdapter())
                .create();
    }
}
