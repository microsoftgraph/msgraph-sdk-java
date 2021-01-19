package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
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
        final OffsetDateTime date = OffsetDateTime.of(5882, 3, 11, 00, 30, 12, 345000000, ZoneOffset.UTC);
        assertEquals("5882-03-11T00:30:12.345Z", OffsetDateTimeSerializer.serialize(date));

        final OffsetDateTime dateNoMillis = OffsetDateTime.of(5882, 3, 11, 00, 30, 12, 0, ZoneOffset.UTC);
        assertEquals("5882-03-11T00:30:12Z", OffsetDateTimeSerializer.serialize(dateNoMillis));
    }

    /**
     * Make sure that dates in string format with and without millis can be converted properly into date objects
     * @throws Exception If there is an exception during the test
     */
	@Test
    public void testToDate() throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("PST"));
        final long toTheSecondDate = 123456789012L;
        final OffsetDateTime dateToSecond = OffsetDateTimeSerializer.deserialize("5882-03-11T00:30:12Z");
        assertEquals(toTheSecondDate, dateToSecond.toInstant().getEpochSecond());

        final OffsetDateTime dateToTheMillisecond = OffsetDateTimeSerializer.deserialize("5882-03-11T00:30:12.345Z");
        assertEquals(toTheSecondDate, dateToTheMillisecond.toInstant().getEpochSecond());
        assertEquals(345000000, dateToTheMillisecond.toInstant().getNano());

        final OffsetDateTime dateToTheExtremeMillisecond = OffsetDateTimeSerializer.deserialize("5882-03-11T00:30:12.3456789Z");
        assertEquals(toTheSecondDate, dateToTheExtremeMillisecond.toInstant().getEpochSecond());
        assertEquals(345678900, dateToTheExtremeMillisecond.toInstant().getNano());
    }
}
