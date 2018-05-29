package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for {@see DefaultConnectionFactory}
 */
public class DefaultConnectionFactoryTests {

    private IConnection mConnection;

    @Before
    public void setUp() throws Exception {
        mConnection = new DefaultConnectionFactory().createFromRequest(new MockHttpRequest());
    }

    @Test
    public void testNotNull() {
        assertNotNull(mConnection);
    }

    @Test
    public void testDefaultRequestMethod() {
        assertEquals("GET", mConnection.getRequestMethod());
    }

}
