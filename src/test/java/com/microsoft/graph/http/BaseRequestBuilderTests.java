package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for {@see BaseRequestBuilder}
 */
public class BaseRequestBuilderTests {

    private String expectedRequestUrl = "https://a.b.c/";
    private BaseRequestBuilder<String> baseRequestBuilder;

    @Before
    public void setUp() throws Exception {
        baseRequestBuilder = new BaseRequestBuilder<String>(expectedRequestUrl,null,null){};
    }

    @Test
    public void testNotNull() {
        assertNotNull(baseRequestBuilder);
    }

    @Test
    public void testRequestUrlAndOptions() {
        assertEquals(expectedRequestUrl, baseRequestBuilder.getRequestUrl());
        assertEquals(0, baseRequestBuilder.getOptions().size());
        assertEquals(expectedRequestUrl+"/d", baseRequestBuilder.getRequestUrlWithAdditionalSegment("d"));
        assertEquals(expectedRequestUrl + "('version=1.0')", baseRequestBuilder.getRequestUrlWithAdditionalParameter("version=1.0"));
    }
}
