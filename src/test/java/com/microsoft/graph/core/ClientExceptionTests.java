package com.microsoft.graph.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientExceptionTests {

	private GraphErrorCodes graphErrorCodes;
    private ClientException clientException;
    private String expectMessage = "This is test exception message";
	
	@Before
	public void setUp() throws Exception {
		graphErrorCodes = GraphErrorCodes.AccessDenied;
        clientException = new ClientException(expectMessage, null, graphErrorCodes);
	}

	@Test
	public void testNotNull() {
        assertNotNull(clientException);
    }

	@Test
    public void testClientException() {
        assertTrue(clientException.isError(graphErrorCodes));
        assertEquals(expectMessage, clientException.getMessage());
    }

}
