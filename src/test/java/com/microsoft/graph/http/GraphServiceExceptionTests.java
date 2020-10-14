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

import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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
    public void testcreateFromResponse() {
		DefaultLogger logger = new DefaultLogger();
        GraphServiceException exception = null;
        Boolean success = false;
        Boolean failure = false;
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(401).message("Unauthorized").body(
                   ResponseBody.create(
                        "{}",
                        MediaType.parse("application/json")
                ))
                .build();
        try{
            exception = GraphServiceException.createFromResponse(new MockHttpRequest(),null,null,response,logger);
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
