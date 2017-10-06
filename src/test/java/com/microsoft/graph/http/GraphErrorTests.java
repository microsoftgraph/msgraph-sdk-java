package com.microsoft.graph.http;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.core.GraphErrorCodes;

public class GraphErrorTests {


	@Test
	public void testIsError(){
        String expectedMessage = "test error message";
        GraphError error = new GraphError();
        error.code = GraphErrorCodes.AccessDenied.toString();
        error.message = expectedMessage;
        assertTrue(error.isError(GraphErrorCodes.AccessDenied));
        assertEquals(expectedMessage, error.message);
    }

	@Test
    public void testIsNotError() {
        GraphError error = new GraphError();
        error.code = GraphErrorCodes.AccessDenied.toString();
        assertFalse(error.isError(GraphErrorCodes.Unauthenticated));
    }

}
