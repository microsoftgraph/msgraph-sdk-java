package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

/**
 * Test cases for calendar serialization and deserialization
 * 
 * @author mobilal
 *
 */
public class CalendarSerializerTests {

	/**
	 * Validate if a calendar date instance could be serialized
	 * @throws Exception if calendar couldn't be serialized
	 */
	@Test
	public void testDateSerialization() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(1561162355000L);
		String expected = "2019-06-22T00:12:35.000Z";
		String actual = CalendarSerializer.serialize(calendar);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	/**
	 * Validate if a date without milliseconds and offset could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testSimpleDateTimeDeserialization() throws Exception {

		String datetime = "2019-06-21T17:12:35";
		TimeZone defaultTimeZone = TimeZone.getDefault();

		// Set timezone to UTC for testing
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());

		// Reset timezone after testing
		TimeZone.setDefault(defaultTimeZone);
	}

	/**
	 * Validate if date with UTC timezone (z) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCSimpleDateTimeDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35Z";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with UTC timezone (z) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeWithMillisDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35.1385912Z";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155138L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with UTC offset (+00:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35+00:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with UTC offset (+00:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeWithMillisAndOffsetDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35.1385912+00:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155138L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with different UTC offset (+0000) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35+0000";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561137155000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with positive timezone offset (+07:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimePositiveOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35+07:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561111955000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with positive timezone offset (+07:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeWithMillisAndPositiveOffsetDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35.1385912+07:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561111955138L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with positive timezone offset in different format (+0700) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardPositiveOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35+0700";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561111955000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with negative timezone offset (-07:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeNegativeOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35-07:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561162355000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with negative timezone offset (-07:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeWithMillisAndNegativeOffsetDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35.1385912-07:00";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561162355138L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

	/**
	 * Validate if date with negative timezone offset in different format (-0700) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardNegativeOffsetFormatDeserialization() throws Exception {
		String datetime = "2019-06-21T17:12:35-0700";
		Calendar expected = java.util.Calendar.getInstance();
		expected.setTimeInMillis(1561162355000L);
		Calendar actual = CalendarSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.getTimeInMillis(), actual.getTimeInMillis());
	}

}
