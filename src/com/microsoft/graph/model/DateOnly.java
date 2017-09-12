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
    private final int mYear;

    /**
     * The month
     */
    private final int mMonth;

    /**
     * The day
     */
    private final int mDay;

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
        mYear = year;
        mMonth = month;
        mDay = day;
    }

    /**
     * Gets the year
     *
     * @return the year
     */
    public int getYear() {
        return mYear;
    }

    /**
     * Gets the month
     *
     * @return the month
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * Gets the day
     *
     * @return the day
     */
    public int getDay() {
        return mDay;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ROOT,
                "%04d-%02d-%02d", mYear, mMonth, mDay
        );
    }
}
