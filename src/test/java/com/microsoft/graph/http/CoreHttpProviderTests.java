package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.serializer.MockSerializer;

@Ignore
public class CoreHttpProviderTests {
	
	private MockAuthenticationProvider mAuthenticationProvider;
    private CoreHttpProvider mProvider;

    @Test
    public void testErrorResponse() throws Exception {
        final GraphErrorCodes expectedErrorCode = GraphErrorCodes.INVALID_REQUEST;
        final String expectedMessage = "Test error!";
        final GraphErrorResponse toSerialize = new GraphErrorResponse();
        toSerialize.error = new GraphError();
        toSerialize.error.code = expectedErrorCode.toString();
        toSerialize.error.message = expectedMessage;
        toSerialize.error.innererror = null;

        setDefaultHttpProvider(toSerialize);
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return 415;
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

        try {
            mProvider.send(new MockHttpRequest(), DriveItem.class, null);
            fail("Expected exception in previous statement");
        } catch (final GraphServiceException e) {
        	assertTrue(e.getMessage().indexOf("truncated") > 0);
            assertEquals(expectedMessage, e.getServiceError().message);
        }
    }
    
    @Test
    public void testVerboseErrorResponse() throws Exception {
    	final GraphErrorCodes expectedErrorCode = GraphErrorCodes.INVALID_REQUEST;
        final String expectedMessage = "Test error!";
        final GraphErrorResponse toSerialize = new GraphErrorResponse();
        toSerialize.error = new GraphError();
        toSerialize.error.code = expectedErrorCode.toString();
        toSerialize.error.message = expectedMessage;
        toSerialize.error.innererror = null;
        JsonObject raw = new JsonObject();
        raw.add("response", new JsonPrimitive("The raw request was invalid"));
        toSerialize.rawObject = raw;

        MockLogger logger = new MockLogger();
        logger.setLoggingLevel(LoggerLevel.DEBUG);

        mProvider = new CoreHttpProvider(new MockSerializer(toSerialize, ""),
                mAuthenticationProvider = new MockAuthenticationProvider(),
                new MockExecutors(),
                logger);
        
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return 415;
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

        try {
            mProvider.send(new MockHttpRequest(), DriveItem.class, null);
            fail("Expected exception in previous statement");
        } catch (final GraphServiceException e) {
        	assertFalse(e.getMessage().indexOf("truncated") > 0);
        	assertTrue(e.getMessage().indexOf("The raw request was invalid") > 0);
        }
    }
    
    @Test
    public void testHasHeaderReturnsTrue() {
        HeaderOption h = new HeaderOption("name", "value");
        assertTrue(DefaultHttpProvider.hasHeader(Arrays.asList(h), "name"));
    }
    
    @Test
    public void testHasHeaderReturnsTrueWhenDifferentCase() {
        HeaderOption h = new HeaderOption("name", "value");
        assertTrue(DefaultHttpProvider.hasHeader(Arrays.asList(h), "NAME"));
    }
    
    @Test
    public void testHasHeaderReturnsFalse() {
        HeaderOption h = new HeaderOption("name", "value");
        assertFalse(DefaultHttpProvider.hasHeader(Arrays.asList(h), "blah"));
    }
    

    /**
     * Configures the http provider for test cases
     * @param toSerialize The object to serialize
     */
    private void setDefaultHttpProvider(final Object toSerialize) {
        mProvider = new CoreHttpProvider(new MockSerializer(toSerialize, ""),
                mAuthenticationProvider = new MockAuthenticationProvider(),
                new MockExecutors(),
                new MockLogger());
    }

}
