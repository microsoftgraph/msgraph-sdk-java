package com.microsoft.graph.http;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class GraphErrorResponseTests {

	@Test
	public void testSetRawObject() {
        JsonObject expectedJson = new JsonObject();
        GraphErrorResponse errorResponse = new GraphErrorResponse();
        errorResponse.setRawObject(null,expectedJson);
        assertEquals(expectedJson, errorResponse.rawObject);
    }

}
