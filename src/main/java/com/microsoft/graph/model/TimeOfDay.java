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
    private final int mHour;

    /**
     * The minute
     */
    private final int mMinute;

    /**
     * The second
     */
    private final int mSecond;

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
        mHour = hour;
        mMinute = minute;
        mSecond = second;
    }

    /**
     * Gets the hour
     *
     * @return the hour
     */
    public int getHour() {
        return mHour;
    }

    /**
     * Gets the minute
     *
     * @return the minute
     */
    public int getMinute() {
        return mMinute;
    }

    /**
     * Gets the second
     *
     * @return the second
     */
    public int getSecond() {
        return mSecond;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ROOT,
                "%02d:%02d:%02d", mHour, mMinute, mSecond
        );
    }
}
