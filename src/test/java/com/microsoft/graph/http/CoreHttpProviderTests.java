package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.serializer.MockSerializer;

public class CoreHttpProviderTests {
	
	private MockAuthenticationProvider mAuthenticationProvider;
    private CoreHttpProvider mProvider;

    @Test
    public void testNoContentType() throws Exception {
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        setDefaultHttpProvider(null);

        try {
            mProvider.send(new MockHttpRequest(), Drive.class, null);
            fail("Expected exception");
        } catch (final ClientException ce) {
            if (!(ce.getCause() instanceof NullPointerException)) {
                fail("Wrong inner exception!");
            }
        }
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testPostByte() throws Exception {
        final String itemId = "itemId";
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                final HashMap<String, String> map = new HashMap<>();
                map.put("Content-Type", "application/json");
                return map;
            }
        };
        final DriveItem expectedItem = new DriveItem();
        expectedItem.id = itemId;
        setDefaultHttpProvider(expectedItem);

        final AtomicBoolean progress = new AtomicBoolean(false);
        final AtomicBoolean success = new AtomicBoolean(false);
        final AtomicBoolean failure = new AtomicBoolean(false);
        final IProgressCallback<DriveItem> progressCallback = new IProgressCallback<DriveItem>() {
            @Override
            public void progress(final long current, final long max) {
                progress.set(true);
            }

            @Override
            public void success(final DriveItem item) {
                success.set(true);
            }

            @Override
            public void failure(final ClientException ex) {
                failure.set(true);
            }
        };

        mProvider.send(new MockHttpRequest(), progressCallback, DriveItem.class, new byte[]{1, 2, 3, 4});

        assertTrue(progress.get());
        assertTrue(success.get());
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

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
