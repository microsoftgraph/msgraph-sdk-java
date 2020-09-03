package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class ISO8601Test {

	/**
     * Make sure that dates with and without millis can be converted properly into strings
     * @throws Exception If there is an exception during the test
     */
	@Test
    public void testFromDate() throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("PST"));
        final Calendar date = Calendar.getInstance();
        date.setTime(new Date(123456789012345L));
        assertEquals("5882-03-11T00:30:12.345Z", CalendarSerializer.serialize(date));

        final Calendar dateNoMillis = Calendar.getInstance();
        dateNoMillis.setTime(new Date(123456789012000L));
        assertEquals("5882-03-11T00:30:12.000Z", CalendarSerializer.serialize(dateNoMillis));
    }

    /**
     * Make sure that dates in string format with and without millis can be converted properly into date objects
     * @throws Exception If there is an exception during the test
     */
	@Test
    public void testToDate() throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("PST"));
        final long toTheSecondDate = 123456789012000L;
        final Calendar dateToSecond = CalendarSerializer.deserialize("5882-03-11T00:30:12Z");
        assertEquals(toTheSecondDate, dateToSecond.getTimeInMillis());

        final long toTheMillisecondDate = 123456789012345L;
        final Calendar dateToTheMillisecond = CalendarSerializer.deserialize("5882-03-11T00:30:12.345Z");
        assertEquals(toTheMillisecondDate, dateToTheMillisecond.getTimeInMillis());

        final Calendar dateToTheExtremeMillisecond = CalendarSerializer.deserialize("5882-03-11T00:30:12.3456789Z");
        assertEquals(toTheMillisecondDate, dateToTheExtremeMillisecond.getTimeInMillis());
    }
}
