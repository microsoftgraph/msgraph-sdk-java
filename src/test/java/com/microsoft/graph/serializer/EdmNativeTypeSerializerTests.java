package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.UUID;

import com.microsoft.graph.logger.DefaultLogger;

import org.junit.Test;

public class EdmNativeTypeSerializerTests {
    @Test
    public void testBoolean() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":true}";
        final Boolean result = serializer.deserializeObject(source, Boolean.class);

        assertEquals(Boolean.valueOf(true), result);
    }
    @Test
    public void testInteger() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":12}";
        final Integer result = serializer.deserializeObject(source, Integer.class);

        assertEquals(Integer.valueOf(12), result);
    }
    @Test
    public void testString() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":\"toto\"}";
        final String result = serializer.deserializeObject(source, String.class);

        assertEquals("toto", result);
    }
    @Test
    public void testFloat() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":12.5}";
        final Float result = serializer.deserializeObject(source, Float.class);

        assertEquals(Float.valueOf("12.5"), result);
    }
    @Test
    public void testLong() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":12}";
        final Long result = serializer.deserializeObject(source, Long.class);

        assertEquals(Long.valueOf(12), result);
    }
    @Test
    public void testBigDecimal() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":12}";
        final BigDecimal result = serializer.deserializeObject(source, BigDecimal.class);

        assertEquals(BigDecimal.valueOf(12), result);
    }
    @Test
    public void testUUID() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());

        final String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#Edm.Null\",\"@odata.null\":\"0E6558C3-9640-4385-860A-2A894AC5C246\"}";
        final UUID result = serializer.deserializeObject(source, UUID.class);

        assertEquals(UUID.fromString("0E6558C3-9640-4385-860A-2A894AC5C246"), result);
    }
}
