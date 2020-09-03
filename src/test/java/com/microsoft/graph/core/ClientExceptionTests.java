package com.microsoft.graph.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ClientExceptionTests {

    private ClientException clientException;
    private String expectMessage = "This is test exception message";
	
	@Before
	public void setUp() throws Exception {
        clientException = new ClientException(expectMessage, null);
	}

	@Test
	public void testNotNull() {
        assertNotNull(clientException);
    }

	@Test
    public void testClientException() {
        assertEquals(expectMessage, clientException.getMessage());
    }

}
