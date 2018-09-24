package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.MockBaseClient;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Test cases for {@see BaseStreamRequest}
 */
public class BaseStreamRequestTests {

    private MockAuthenticationProvider mAuthenticationProvider;
    private MockBaseClient mBaseClient;

    @Before
    public void setUp() throws Exception {
        mAuthenticationProvider = new MockAuthenticationProvider();
        mBaseClient = new MockBaseClient();
    }

    @Test
    public void testSend() {
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
        DefaultHttpProvider mProvider = new DefaultHttpProvider(new MockSerializer(null, ""),
                mAuthenticationProvider,
                new MockExecutors(),
                new MockLogger());
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<String> request = new BaseStreamRequest<String>("https://a.b.c", mBaseClient,null, null){};
        request.send();
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testSendWithCallback() {
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
        DefaultHttpProvider mProvider = new DefaultHttpProvider(new MockSerializer(null, ""),
                mAuthenticationProvider,
                new MockExecutors(),
                new MockLogger());
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mBaseClient.setHttpProvider(mProvider);
        final AtomicBoolean success = new AtomicBoolean(false);
        final AtomicBoolean failure = new AtomicBoolean(false);
        final ICallback<InputStream> callback = new ICallback<InputStream>() {
            @Override
            public void success(InputStream inputStream) {
                success.set(true);
            }

            @Override
            public void failure(ClientException ex) {
                failure.set(true);
            }
        };
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c", mBaseClient,null, InputStream.class){};
        request.send(callback);
        assertTrue(success.get());
        assertFalse(failure.get());
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testSendWithContentAndCallback() {
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
        DefaultHttpProvider mProvider = new DefaultHttpProvider(new MockSerializer(null, ""),
                mAuthenticationProvider,
                new MockExecutors(),
                new MockLogger());
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mBaseClient.setHttpProvider(mProvider);
        final AtomicBoolean success = new AtomicBoolean(false);
        final AtomicBoolean failure = new AtomicBoolean(false);
        final ICallback<InputStream> callback = new ICallback<InputStream>() {
            @Override
            public void success(InputStream inputStream) {
                success.set(true);
            }

            @Override
            public void failure(ClientException ex) {
                failure.set(true);
            }
        };
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c", mBaseClient,null, InputStream.class){};
        request.send(new byte[]{1, 2, 3, 4},callback);
        assertTrue(success.get());
        assertFalse(failure.get());
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testSendWithContent() {
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
        DefaultHttpProvider mProvider = new DefaultHttpProvider(new MockSerializer(null, ""),
                mAuthenticationProvider,
                new MockExecutors(),
                new MockLogger());
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c", mBaseClient,null, InputStream.class){};
        request.send(new byte[]{1, 2, 3, 4});
        assertEquals(1, mAuthenticationProvider.getInterceptionCount());
    }

    @Test
    public void testBaseMethod() {
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c", mBaseClient,null, InputStream.class){};
        assertEquals("https://a.b.c", request.getRequestUrl().toString());
        request.addHeader("header key", "header value");
        assertEquals(2,request.getHeaders().size());
        assertNull(request.getHttpMethod());
        assertEquals(2, request.getOptions().size());
    }

}
