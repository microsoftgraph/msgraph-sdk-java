// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.serializer.MockSerializer;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * Test cases for {@see DefaultHttpProvider}
 */
public class DefaultHttpProviderTests {

    private MockAuthenticationProvider mAuthenticationProvider;
    private DefaultHttpProvider mProvider;

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
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

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
    public void testDriveResponse() throws Exception {
        final String driveId = "driveId";
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
        final Drive expectedDrive = new Drive();
        expectedDrive.id = driveId;
        setDefaultHttpProvider(expectedDrive);
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

        final Drive drive = mProvider.send(new MockHttpRequest(), Drive.class, null);

        assertEquals(driveId, drive.id);
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testBinaryResponse() throws Exception {
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
                map.put("Content-Type", "application/octet-stream");
                return map;
            }
        };
        setDefaultHttpProvider(null);
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mProvider.send(new MockHttpRequest(), InputStream.class, null);
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testPostItem() throws Exception {
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
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

        final DriveItem item = mProvider.send(new MockHttpRequest(), DriveItem.class, new DriveItem());

        assertEquals(itemId, item.id);
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
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

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
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

        try {
            mProvider.send(new MockHttpRequest(), DriveItem.class, null);
            fail("Expected exception in previous statement");
        } catch (final GraphServiceException e) {
            assertEquals(expectedMessage, e.getServiceError().message);
        }
    }

    @Test
    public void testBodyLessResponse() throws Exception {
        final int[] codes = new int[] {204, 304 };
        final AtomicInteger currentCode = new AtomicInteger(0);
        setDefaultHttpProvider(null);
        final ITestConnectionData data = new ITestConnectionData() {
            @Override
            public int getRequestCode() {
                return codes[currentCode.get()];
            }

            @Override
            public String getJsonResponse() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));

        for (final int ignored : codes) {
            DriveItem result = mProvider.send(new MockHttpRequest(), DriveItem.class, null);
            currentCode.incrementAndGet();
            assertNull(result);
        }
        assertEquals(codes.length, mAuthenticationProvider.getInterceptionCount());
    }

    /**
     * Configures the http provider for test cases
     * @param toSerialize The object to serialize
     */
    private void setDefaultHttpProvider(final Object toSerialize) {
        mProvider = new DefaultHttpProvider(new MockSerializer(toSerialize, ""),
                mAuthenticationProvider = new MockAuthenticationProvider(),
                new MockExecutors(),
                new MockLogger());
    }
}
