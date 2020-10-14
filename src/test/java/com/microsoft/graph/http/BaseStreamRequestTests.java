package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Before;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import static org.mockito.Mockito.*;

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

    private MockBaseClient mBaseClient;

    @Before
    public void setUp() throws Exception {
        mBaseClient = new MockBaseClient();
    }

    @Test
    public void testSend() throws IOException {
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200).message("OK").body(
                   ResponseBody.create(
                        "{ \"id\": \"zzz\" }",
                        MediaType.parse("application/octet-stream")
                ))
                .build();

        final OkHttpClient mockClient = getMockClient(response);
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(null, ""),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<String> request = new BaseStreamRequest<String>("https://a.b.c/", mBaseClient,null, null){};
        request.send();
    }

    @Test
    public void testSendWithCallback() throws IOException {
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200).message("OK").body(
                   ResponseBody.create(
                        "{ \"id\": \"zzz\" }",
                        MediaType.parse("application/json")
                ))
                .build();

        final OkHttpClient mockClient = getMockClient(response);
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(null, ""),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
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
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        request.send(callback);
        assertTrue(success.get());
        assertFalse(failure.get());
    }

    @Test
    public void testSendWithContentAndCallback() throws IOException {
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200).message("OK").body(
                   ResponseBody.create(
                        "{ \"id\": \"zzz\" }",
                        MediaType.parse("application/json")
                ))
                .build();

        final OkHttpClient mockClient = getMockClient(response);
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(null, ""),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
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
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        request.send(new byte[]{1, 2, 3, 4},callback);
        assertTrue(success.get());
        assertFalse(failure.get());
    }

    @Test
    public void testSendWithContent() throws IOException {
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200).message("OK").body(
                   ResponseBody.create(
                        "{ \"id\": \"zzz\" }",
                        MediaType.parse("application/json")
                ))
                .build();

        final OkHttpClient mockClient = getMockClient(response);
        
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(null, ""),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        request.send(new byte[]{1, 2, 3, 4});
    }

    @Test
    public void testBaseMethod() {
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        assertEquals("https://a.b.c/", request.getRequestUrl().toString());
        request.addHeader("header key", "header value");
        assertEquals(2,request.getHeaders().size());
        assertNull(request.getHttpMethod());
        assertEquals(2, request.getOptions().size());
    }
    public static OkHttpClient getMockClient(final Response response) throws IOException {
        final OkHttpClient mockClient = mock(OkHttpClient.class);
        final Call remoteCall = mock(Call.class);
        when(remoteCall.execute()).thenReturn(response);
        when(mockClient.newCall(any())).thenReturn(remoteCall);
        return mockClient;
    }
}
