// ------------------------------------------------------------------------------
// Copyright (c) 2021 Microsoft Corporation
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * Serializes and deserializes a string
 *
 */
public final class OffsetDateTimeSerializer {

    /**
     * Not available for instantiation
     */
    private OffsetDateTimeSerializer() {
    }

    /**
     * Deserializes an ISO-8601 formatted date
     *
     * @param strVal the string value
     * @return       the OffsetDateTime
     * @throws java.text.ParseException the parse exception
     */
    @Nullable
    public static OffsetDateTime deserialize(@Nonnull final String strVal) throws ParseException {
        final String[] sections = strVal.split("T");
        return OffsetDateTime.parse(missingColonPattern
                                        .matcher((sections.length == 2 &&
                                                    !sections[1].contains("+") &&
                                                    !sections[1].contains("-") &&
                                                    missingOffsetPattern.matcher(strVal).matches()) ?
                                                            strVal + "Z": // adds a Z to 2019-06-21T17:12:35 only if we don't have a numeric offset
                                                            strVal)
                                        .replaceAll("$1$2:$3"),
                                    DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
    private final static Pattern missingColonPattern = Pattern.compile("([-+])(\\d{2})(\\d{2})"); // + or - with 4 digits
    private final static Pattern missingOffsetPattern = Pattern.compile(".*\\d{2}$"); //ends with 2 digits
    /**
     * Serializes the string
     *
     * @param src the source OffsetDateTime
     * @return    the string
     */
    @Nonnull
    public static String serialize(@Nonnull final OffsetDateTime src) {
        return src.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
