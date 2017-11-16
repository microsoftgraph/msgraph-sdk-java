package com.microsoft.graph.http;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.core.GraphErrorCodes;

public class GraphServiceExceptionTests {

	@Test
	public void testError() {
        GraphErrorResponse errorResponse = new GraphErrorResponse();
        GraphError error = new GraphError();
        error.code = GraphErrorCodes.UNAUTHENTICATED.toString();
        errorResponse.error = error;
        GraphServiceException exception = new GraphServiceException(null,null,new ArrayList<String>(),null,401,"Unauthorized",new ArrayList<String>(),errorResponse);
        String message = exception.getMessage();
        assertTrue(message.indexOf("Error code: UNAUTHENTICATED") == 0);
        assertTrue(message.indexOf("401 : Unauthorized") > 0);
        assertEquals(error,exception.getServiceError());
        assertTrue(exception.isError(GraphErrorCodes.UNAUTHENTICATED));
    }

	@Test
    public void testCreateFromConnection() {
        GraphServiceException exception = null;
        Boolean success = false;
        Boolean failure = false;
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return 401;
            }

            @Override
            public String getJsonResponse() {
                return "{}";
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        try{
            exception = GraphServiceException.createFromConnection(new MockHttpRequest(),null,null,new MockConnection(data){});
            success = true;
        }catch (IOException ex){
            failure = true;
        }

        assertTrue(success);
        assertFalse(failure);

        String message = exception.getMessage();
        assertTrue(message.indexOf("Error code: Unable to parse error response message") == 0);
        assertTrue(message.indexOf("http://localhost") > 0);
    }

}
