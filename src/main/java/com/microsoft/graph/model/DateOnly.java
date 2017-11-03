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

package com.microsoft.graph.model;


import java.text.ParseException;
import java.util.Locale;

/**
 * A timezone-nonspecific date
 */
public class DateOnly {

    /**
     * The year
     */
    private final int year;

    /**
     * The month
     */
    private final int month;

    /**
     * The day
     */
    private final int day;

    /**
     * Constructs a timezone-nonspecific DateOnly
     *
     * @param dateStr date string of the form <code>yyyy-mm-dd</code>
     * @return the parsed DateOnly instance
     * @exception ParseException If there was a failure parsing the dateStr
     */
    public static DateOnly parse(final String dateStr) throws ParseException {
        // break the date up into its constituent parts
        String[] dateInfo = dateStr.split("-");

        // validate the split date string
        final int expectedLength = 3;
        if (dateInfo.length != expectedLength) {
            throw new ParseException(
                    "Expected datestring format 'yyyy-mm-dd' but found: " + dateStr, 0
            );
        }

        // array indices for date parsing
        final int indYear = 0;
        final int indMonth = 1;
        final int indDay = 2;

        // unpack this array
        int year = Integer.parseInt(dateInfo[indYear]);
        int month = Integer.parseInt(dateInfo[indMonth]);
        int day = Integer.parseInt(dateInfo[indDay]);

        return new DateOnly(year, month, day);
    }

    /**
     * Constructs a timezone-nonspecific DateOnly
     *
     * @param year  the year
     * @param month 1-indexed month value (Jan == 1)
     * @param day   day of the month
     */
    public DateOnly(final int year, final int month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Gets the year
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the month
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the day
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ROOT,
                "%04d-%02d-%02d", year, month, day
        );
    }
}
