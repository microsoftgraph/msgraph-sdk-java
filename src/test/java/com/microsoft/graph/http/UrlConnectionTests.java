package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class UrlConnectionTests {

	@Test
	public void testRequestMethod() throws Exception{
        MockHttpRequest request = new MockHttpRequest();
        request.setHttpMethod(HttpMethod.POST);
        UrlConnection connection = new UrlConnection(request);
        assertEquals("POST", connection.getRequestMethod());
    }

	@Test
    public void testRequestProperties() throws Exception {
        MockHttpRequest request = new MockHttpRequest();
        request.addHeader("header1","value1");
        request.addHeader("test-header2","test-value2");
        request.addHeader("test-header2","test-value23");
        UrlConnection connection = new UrlConnection(request);
        Field mConnectionField = UrlConnection.class.getDeclaredField("connection");
        mConnectionField.setAccessible(true);
        HttpURLConnection mConnection = (HttpURLConnection)mConnectionField.get(connection);
        Map<String, List<String>> requestProperties = mConnection.getRequestProperties();
        assertEquals(2, requestProperties.size());
        assertEquals("value1",requestProperties.get("header1").get(0));
        assertEquals("test-value23",requestProperties.get("test-header2").get(0));
        assertEquals("test-value2",requestProperties.get("test-header2").get(1));
    }
}
