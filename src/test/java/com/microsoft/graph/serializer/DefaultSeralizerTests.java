package com.microsoft.graph.serializer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.RecurrenceRangeType;
import com.microsoft.graph.generated.BaseRecurrenceRange;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.model.DateOnly;

public class DefaultSeralizerTests {

	/**
     * Make sure that deserializing a Drive also returns members from BaseDrive
     *
     * @throws Exception If there is an exception during the test
     */
	@Test
    public void testDriveDeserialization() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#drives/$entity\",\"id\":\"8bf6ae90006c4a4c\",\"driveType\":\"personal\",\"owner\":{\"user\":{\"displayName\":\"Peter\",\"id\":\"8bf6ae90006c4a4c\"}},\"quota\":{\"deleted\":1485718314,\"remaining\":983887466461,\"state\":\"normal\",\"total\":1142461300736,\"used\":158573834275}}";
        Drive result = serializer.deserializeObject(source, Drive.class);
        assertNotNull(result);
        assertEquals("personal", result.driveType);
        assertEquals(Long.valueOf(983887466461L), result.quota.remaining);
        assertEquals("8bf6ae90006c4a4c", result.id);

    }

	@Test
    public void testRecurrenceRangeDeserialization() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        String source = "{\n" +
                "    \"type\": \"noEnd\",\n" +
                "    \"startDate\": \"2016-04-27\",\n" +
                "    \"endDate\": \"0001-01-01\",\n" +
                "    \"recurrenceTimeZone\": \"China Standard Time\",\n" +
                "    \"numberOfOccurrences\": 0\n" +
                "}";
        BaseRecurrenceRange baseRecurrenceRange = serializer.deserializeObject(source, BaseRecurrenceRange.class);
        assertNotNull(source);
        assertEquals(baseRecurrenceRange.type, RecurrenceRangeType.NO_END);
        assertEquals("2016-04-27", baseRecurrenceRange.startDate.toString());
        assertEquals("0001-01-01", baseRecurrenceRange.endDate.toString());
        assertEquals("China Standard Time", baseRecurrenceRange.recurrenceTimeZone);
        assertEquals(Integer.valueOf(0), baseRecurrenceRange.numberOfOccurrences);
    }

	@Test
    public void testRecurrenceRangeSerialization() throws Exception {
        final String expected = "{\"type\":\"endDate\",\"startDate\":\"2016-04-25\",\"endDate\":\"2016-05-25\",\"recurrenceTimeZone\":\"PST\",\"numberOfOccurrences\":4}";
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        BaseRecurrenceRange brr = new BaseRecurrenceRange();
        brr.type = RecurrenceRangeType.END_DATE;
        brr.startDate = new DateOnly(2016, 4, 25);
        brr.endDate = new DateOnly(2016, 5, 25);
        brr.recurrenceTimeZone = "PST";
        brr.numberOfOccurrences = 4;
        String jsonOut = serializer.serializeObject(brr);
        assertNotNull(jsonOut);
        assertEquals(jsonOut, expected);
    }

}
