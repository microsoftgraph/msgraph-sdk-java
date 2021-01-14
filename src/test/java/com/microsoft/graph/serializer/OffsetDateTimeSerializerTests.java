package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.TimeZone;

import org.junit.Test;

/**
 * Test cases for offsetDateTime serialization and deserialization
 *
 * @author mobilal
 *
 */
public class OffsetDateTimeSerializerTests {

	/**
	 * Validate if a offsetDateTime date instance could be serialized
	 * @throws Exception if offsetDateTime couldn't be serialized
	 */
	@Test
	public void testDateSerialization() throws Exception {
        final OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561162355000L), ZoneOffset.UTC);
		final String expected = "2019-06-22T00:12:35Z";
		final String actual = OffsetDateTimeSerializer.serialize(offsetDateTime);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	/**
	 * Validate if a date without milliseconds and offset could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testSimpleDateTimeDeserialization() throws Exception {

		final String datetime = "2019-06-21T17:12:35";
		final TimeZone defaultTimeZone = TimeZone.getDefault();

		// Set timezone to UTC for testing
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155000L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());

		// Reset timezone after testing
		TimeZone.setDefault(defaultTimeZone);
	}

	/**
	 * Validate if date with UTC timezone (z) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCSimpleDateTimeDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35Z";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155000L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with UTC timezone (z) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeWithMillisDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35.1385912Z";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155138L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with UTC offset (+00:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35+00:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155000L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with UTC offset (+00:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeWithMillisAndOffsetDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35.1385912+00:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155138L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with different UTC offset (+0000) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35+0000";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561137155000L), ZoneOffset.UTC);
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with positive timezone offset (+07:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimePositiveOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35+07:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561111955000L), ZoneOffset.ofHours(7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with positive timezone offset (+07:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeWithMillisAndPositiveOffsetDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35.1385912+07:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561111955138L), ZoneOffset.ofHours(7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with positive timezone offset in different format (+0700) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardPositiveOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35+0700";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561111955000L), ZoneOffset.ofHours(7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with negative timezone offset (-07:00) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeNegativeOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35-07:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561162355000L), ZoneOffset.ofHours(-7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with negative timezone offset (-07:00) and milliseconds could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testDateTimeWithMillisAndNegativeOffsetDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35.1385912-07:00";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561162355138L), ZoneOffset.ofHours(-7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

	/**
	 * Validate if date with negative timezone offset in different format (-0700) could be deserialized
	 * @throws Exception if date is not parsable
	 */
	@Test
	public void testUTCDateTimeInNonstandardNegativeOffsetFormatDeserialization() throws Exception {
		final String datetime = "2019-06-21T17:12:35-0700";
        final OffsetDateTime expected = OffsetDateTime.ofInstant(Instant.ofEpochMilli(1561162355000L), ZoneOffset.ofHours(-7));
		final OffsetDateTime actual = OffsetDateTimeSerializer.deserialize(datetime);
		assertNotNull(actual);
		assertEquals(expected.toInstant().getEpochSecond(), actual.toInstant().getEpochSecond());
	}

}
