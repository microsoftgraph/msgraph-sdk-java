package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.microsoft.graph.core.TimeOfDay;

public class TimeOfDayTests {

	@Test
	public void testTimeOfDaySerializer() throws Exception {
        String strDate = TimeOfDay.parse("12:30:44").toString();
        assertEquals("12:30:44", strDate);
    }

	@Test
    public void testTimeOfDaySerializerIndefinite() throws Exception {
        String strDate = TimeOfDay.parse("01:01:01").toString();
        assertEquals("01:01:01", strDate);
    }

	@Test
    public void testTimeOfDayDeserializer() throws Exception {
        TimeOfDay time = TimeOfDay.parse("12:30:44");
        assertEquals(12, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(44, time.getSecond());
    }

	@Test
    public void testTimeOfDayDeserializerIndefinite() throws Exception{
        TimeOfDay time = TimeOfDay.parse("01:01:01");
        assertEquals(1, time.getHour());
        assertEquals(1, time.getMinute());
        assertEquals(1, time.getSecond());
    }

    @Test
    public void testTimeOfDayDeserializerWithFraction() throws Exception{
        TimeOfDay time = TimeOfDay.parse("12:30:44.0000000");
        assertEquals(12, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(44, time.getSecond());
    }

}
