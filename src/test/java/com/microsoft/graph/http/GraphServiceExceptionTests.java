package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.logger.DefaultLogger;

public class GraphServiceExceptionTests {

	@Test
	public void testError() {
        GraphErrorResponse errorResponse = new GraphErrorResponse();
        GraphError error = new GraphError();
        error.code = GraphErrorCodes.UNAUTHENTICATED.toString();
        errorResponse.error = error;
        GraphServiceException exception = new GraphServiceException(null,null,new ArrayList<String>(),null,401,"Unauthorized",new ArrayList<String>(),errorResponse, false);
        String message = exception.getMessage();
        assertTrue(message.indexOf("Error code: UNAUTHENTICATED") == 0);
        assertTrue(message.indexOf("401 : Unauthorized") > 0);
        assertTrue(message.indexOf("truncated") > 0);
        assertEquals(error,exception.getServiceError());
    }
	
	@Test
	public void testVerboseError() {
		GraphErrorResponse errorResponse = new GraphErrorResponse();
        GraphError error = new GraphError();
        error.code = GraphErrorCodes.UNAUTHENTICATED.toString();
        errorResponse.error = error;
        GraphServiceException exception = new GraphServiceException(null,null,new ArrayList<String>(),null,401,"Unauthorized",new ArrayList<String>(),errorResponse, true);
        String message = exception.getMessage();
        assertTrue(message.indexOf("Error code: UNAUTHENTICATED") == 0);
        assertTrue(message.indexOf("401 : Unauthorized") > 0);
        assertFalse(message.indexOf("truncated") > 0);
        assertEquals(error,exception.getServiceError());
	}

	@Test
    public void testCreateFromConnection() {
		DefaultLogger logger = new DefaultLogger();
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
            exception = GraphServiceException.createFromConnection(new MockHttpRequest(),null,null,new MockConnection(data){},logger);
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
	
	@Test
	public void testNullConnection() {
		DefaultLogger logger = new DefaultLogger();
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
            exception = GraphServiceException.createFromConnection(new MockHttpRequest(),null,null,new MockConnection(data) {
            	@Override
            	public InputStream getInputStream() throws IOException {
                    return null;
                }
            },logger);
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
