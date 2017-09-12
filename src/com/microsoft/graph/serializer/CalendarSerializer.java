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
import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Serializes and deserializes a string.
 * https://github.com/MSOpenTech/orc-for-android/blob/master/src/orc-android/
 *  src/main/java/com/microsoft/services/orc/serialization/impl/CalendarSerializer.java
 */
public final class CalendarSerializer {

    /**
     * Not available for instantiation.
     */
    private CalendarSerializer() {
    }

    /**
     * Deserializes an ISO-8601 formatted date.
     * @param strVal The string val.
     * @return The calendar.
     * @throws java.text.ParseException The parse exception.
     */
    public static Calendar deserialize(final String strVal) throws ParseException {
        // Change Z to +0000 to adapt the string to a format
        // that can be parsed in Java
        final boolean hasZ = strVal.indexOf('Z') != -1;
        String modifiedStrVal;
        final String zSuffix;
        if (hasZ) {
            zSuffix = "Z";
            modifiedStrVal = strVal.replace("Z", "+0000");
        } else {
            zSuffix = "";
            modifiedStrVal = strVal;
        }

        // Parse the well-formatted date string.
        final String datePattern;
        if (modifiedStrVal.contains(".")) {
            //SimpleDateFormat only supports 3 milliseconds
            String milliseconds = modifiedStrVal.substring(modifiedStrVal.indexOf(".") + 1,
                                                           modifiedStrVal.indexOf("+"));
            final int millisSegmentLength = 3;
            if (milliseconds.length() > millisSegmentLength) {
                milliseconds = milliseconds.substring(0, millisSegmentLength);
                modifiedStrVal = modifiedStrVal.substring(0,
                    modifiedStrVal.indexOf(".") + 1)
                    + milliseconds
                    + modifiedStrVal.substring(modifiedStrVal.indexOf("+"));
            }

            datePattern = "yyyy-MM-dd'T'HH:mm:ss.SSS" + zSuffix;
        } else {
            datePattern = "yyyy-MM-dd'T'HH:mm:ss" + zSuffix;
        }

        @SuppressLint("SimpleDateFormat")
        final SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setTimeZone(TimeZone.getDefault());

        final Date date = dateFormat.parse(modifiedStrVal);

        final Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * Serializes the string.
     *
     * @param src The src.
     * @return The string.
     */
    public static String serialize(final Calendar src) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS'Z'", Locale.ROOT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(src.getTime());
    }
}
