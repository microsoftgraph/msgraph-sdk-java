package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import static org.mockito.Mockito.*;

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
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<String> request = new BaseStreamRequest<String>("https://a.b.c/", mBaseClient,null, null){};
        request.send();
    }

    @Test
    public void testSendWithCallback() throws IOException, InterruptedException, ExecutionException {
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
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        final java.util.concurrent.CompletableFuture<InputStream> result = request.futureSend();
        assertNotNull(result.get());
        assertTrue(result.isDone());
        assertFalse(result.isCancelled());
    }

    @Test
    public void testSendWithContentAndCallback() throws IOException, InterruptedException, ExecutionException {
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
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseStreamRequest<InputStream> request = new BaseStreamRequest<InputStream>("https://a.b.c/", mBaseClient,null, InputStream.class){};
        final java.util.concurrent.CompletableFuture<InputStream> result = request.futureSend(new byte[]{1, 2, 3, 4});
        assertNotNull(result.get());
        assertTrue(result.isDone());
        assertFalse(result.isCancelled());
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
        final Dispatcher dispatcher = new Dispatcher();
        when(remoteCall.execute()).thenReturn(response);
        doAnswer((Answer<Void>) invocation -> {
            Callback callback = invocation.getArgument(0);
            callback.onResponse(null, response);
            return null;
        }).when(remoteCall)
            .enqueue(any(Callback.class));
        when(mockClient.dispatcher()).thenReturn(dispatcher);
        when(mockClient.newCall(any())).thenReturn(remoteCall);
        return mockClient;
    }
}
