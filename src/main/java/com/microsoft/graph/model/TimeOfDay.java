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
 * The time of day
 */
public class TimeOfDay {

    /**
     * The hour
     */
    private final int hour;

    /**
     * The minute
     */
    private final int minute;

    /**
     * The second
     */
    private final int second;

    /**
     * Constructs a timezone-nonspecific DateOnly
     *
     * @param timeStr time string of the form <code>HH:mm:ss</code>
     * @return the parsed DateOnly instance
     * @exception ParseException If there was a failure parsing the dateStr
     */
    public static TimeOfDay parse(final String timeStr) throws ParseException {
        // break the date up into its constituent parts
        String[] timeInfo = timeStr.split(":");

        // validate the split date string
        final int expectedLength = 3;
        if (timeInfo.length != expectedLength) {
            throw new ParseException(
                    "Expected time string format 'HH:mm:ss' but found: " + timeStr, 0
            );
        }

        // array indices for date parsing
        final int indHour = 0;
        final int indMinute = 1;
        final int indSecond = 2;

        // unpack this array
        int hour = Integer.parseInt(timeInfo[indHour]);
        int minute = Integer.parseInt(timeInfo[indMinute]);
        int second = Integer.parseInt(timeInfo[indSecond]);

        return new TimeOfDay(hour, minute, second);
    }

    /**
     * Constructs a TimeOfDay object
     *
     * @param hour   the hour
     * @param minute the minute
     * @param second the second
     */
    public TimeOfDay(final int hour, final int minute, final int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Gets the hour
     *
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Gets the minute
     *
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Gets the second
     *
     * @return the second
     */
    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ROOT,
                "%02d:%02d:%02d", hour, minute, second
        );
    }
}
