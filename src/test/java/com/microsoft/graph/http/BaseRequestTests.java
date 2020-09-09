package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;
//import com.microsoft.graph.BuildConfig;
import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.MockBaseClient;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Test cases for {@see BaseRequest}
 */
public class BaseRequestTests {
    private MockAuthenticationProvider mAuthenticationProvider;
    private MockBaseClient mBaseClient;
    private BaseRequest request;
    private JsonObject callbackJsonObject;

    @Before
    public void setUp() throws Exception {
        mAuthenticationProvider = new MockAuthenticationProvider();
        mBaseClient = new MockBaseClient();
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
        MockHttpProvider mProvider = new MockHttpProvider(new MockSerializer(null, ""),
                mAuthenticationProvider,
                new MockExecutors(),
                new MockLogger());
        mProvider.setConnectionFactory(new MockConnectionFactory(new MockConnection(data)));
        mBaseClient.setHttpProvider(mProvider);
        request = new BaseRequest("https://a.b.c/", mBaseClient, null,null){};
    }

    @Test
    public void testSend() {
        JsonObject result = request.send(HttpMethod.GET, null);
        assertNotNull(result);
        assertEquals("zzz", result.get("id").getAsString());
    }

    @Test
    public void testSendWithCallback() {
        final AtomicBoolean success = new AtomicBoolean(false);
        final AtomicBoolean failure = new AtomicBoolean(false);

		ICallback<Object> callback = new ICallback<Object>() {
            @Override
            public void success(Object o) {
                success.set(true);
                callbackJsonObject = (JsonObject)o;
            }

            @Override
            public void failure(ClientException ex) {
                failure.set(true);
            }
        };
        request.send(HttpMethod.GET, callback,null);
        assertTrue(success.get());
        assertFalse(failure.get());
        assertNotNull(callbackJsonObject);
        assertEquals("zzz", callbackJsonObject.get("id").getAsString());
    }

    @Test
    public void testFunctionParameters() {
        final Option fo1 = new FunctionOption("1", "one");
        final Option fo2 = new FunctionOption("2", null);
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, Arrays.asList(fo1, fo2), null){};
        assertEquals("https://a.b.c/(1='one',2=null)", request.getRequestUrl().toString());
        request.addFunctionOption(new FunctionOption("3","two"));;
        assertEquals("https://a.b.c/(1='one',2=null,3='two')", request.getRequestUrl().toString());
        assertEquals(4, request.getOptions().size());
    }

    @Test
    public void testQueryParameters() {
        final Option q1 = new QueryOption("q1","option1 ");
        final Option q2 = new QueryOption("q2","option2");
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, Arrays.asList(q1, q2), null){};
        assertEquals("https://a.b.c/?q1=option1%20&q2=option2", request.getRequestUrl().toString());
        request.addQueryOption(new QueryOption("q3","option3"));
        assertEquals("https://a.b.c/?q1=option1%20&q2=option2&q3=option3", request.getRequestUrl().toString());
        assertEquals(4,request.getOptions().size());
    }

    @Test
    public void testFunctionAndQueryParameters() {
        final Option f1 = new FunctionOption("f1", "fun1");
        final Option f2 = new FunctionOption("f2", null);
        final Option q1 = new QueryOption("q1","option1 ");
        final Option q2 = new QueryOption("q2","option2");
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, Arrays.asList(f1, f2, q1, q2), null){};
        assertEquals("https://a.b.c/(f1='fun1',f2=null)?q1=option1%20&q2=option2", request.getRequestUrl().toString());
        assertEquals(5, request.getOptions().size());
    }

    @Test
    public void testHttpMethod() {
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, null, null){};
        assertNull(request.getHttpMethod());
        request.setHttpMethod(HttpMethod.GET);
        assertEquals(HttpMethod.GET, request.getHttpMethod());
    }

    @Test
    public void testHeader() {
        String expectedHeader = "header key";
        String expectedValue = "header value";
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, null, null){};
        assertEquals(1, request.getHeaders().size());
        assertEquals("SdkVersion", request.getHeaders().get(0).getName());
        //assertEquals(String.format("graph-android-v%s", BuildConfig.VERSION_NAME), request.getHeaders().get(0).getValue());
        request.addHeader(expectedHeader,expectedValue);
        assertEquals(2,request.getHeaders().size());
    }

    @Test
    public void testProtectedProperties() {
        assertEquals(0, request.functionOptions.size());
        assertEquals(0, request.queryOptions.size());
        final Option q1 = new QueryOption("q1","option1 ");
        final Option f1 = new FunctionOption("f1","option2");
        final BaseRequest request = new BaseRequest("https://a.b.c/", null, Arrays.asList(q1,f1), null){};
        assertEquals(1, request.functionOptions.size());
        assertEquals(1, request.queryOptions.size());
        assertEquals("q1", request.queryOptions.get(0).getName());
        assertEquals("option1 ", request.queryOptions.get(0).getValue());
        assertEquals("f1", request.functionOptions.get(0).getName());
        assertEquals("option2", request.functionOptions.get(0).getValue());
    }
}
