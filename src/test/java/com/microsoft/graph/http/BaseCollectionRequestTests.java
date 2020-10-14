package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.MockBaseClient;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Test cases for {@see BaseCollectionRequest}
 */
public class BaseCollectionRequestTests {

    private MockBaseClient mBaseClient;
    private BaseCollectionRequest<JsonObject, MockJsonObjectCollectionResponse> mRequest;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {
        mBaseClient = new MockBaseClient();
        final Response response = new Response.Builder()
                .request(new Request.Builder().url("https://a.b.c").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200).message("OK").body(
                   ResponseBody.create(
                        "[{ \"id\": \"zzz\" }]",
                        MediaType.parse("application/json")
                ))
                .addHeader("Content-Type", "application/json")
                .build();
        final OkHttpClient mockClient = BaseStreamRequestTests.getMockClient(response);
        final JsonObject result = new JsonObject();
        result.add("id", new JsonPrimitive("zzz"));
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(result, ""),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        final BaseCollectionPage<JsonObject> jsonObjectPage = new BaseCollectionPage<JsonObject>(new MockJsonObjectCollectionResponse(), null);
        mRequest = new BaseCollectionRequest<JsonObject,MockJsonObjectCollectionResponse>("https://a.b.c/", mBaseClient, null, MockJsonObjectCollectionResponse.class, (Class<BaseCollectionPage<JsonObject>>)jsonObjectPage.getClass()){};
    }

    @Test
    public void testSend() {
        final MockJsonObjectCollectionResponse result = mRequest.send();
        assertNotNull(result);
        assertEquals("zzz", result.values().get(0).get("id").getAsString());
    }

    @Test
    public void testPost() {
        final MockJsonObjectCollectionResponse result = mRequest.post(null);
        assertNotNull(result);
        assertEquals("zzz", result.values().get(0).get("id").getAsString());
    }

    @Test
    public void testFunctionParameters() {
        final Option f1 = new FunctionOption("1", "one");
        final Option f2 = new FunctionOption("2", null);
        final BaseCollectionRequest<String,ICollectionResponse<String>> request = new BaseCollectionRequest<String,ICollectionResponse<String>>("https://a.b.c/", null, Arrays.asList(f1, f2), null,null){};
        assertEquals("https://a.b.c/(1='one',2=null)", request.getRequestUrl().toString());
        request.addFunctionOption(new FunctionOption("3","two"));;
        assertEquals("https://a.b.c/(1='one',2=null,3='two')", request.getRequestUrl().toString());
        assertEquals(4, request.getOptions().size());
    }

    @Test
    public void testQueryParameters() {
        final Option q1 = new QueryOption("q1","option1 ");
        final Option q2 = new QueryOption("q2","option2");
        final BaseCollectionRequest<String,ICollectionResponse<String>> request = new BaseCollectionRequest<String,ICollectionResponse<String>>("https://a.b.c/", null, Arrays.asList(q1, q2), null,null){};
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
        final BaseCollectionRequest<String,ICollectionResponse<String>> request = new BaseCollectionRequest<String,ICollectionResponse<String>>("https://a.b.c/", null, Arrays.asList(f1, f2, q1, q2), null,null){};
        assertEquals("https://a.b.c/(f1='fun1',f2=null)?q1=option1%20&q2=option2", request.getRequestUrl().toString());
        assertEquals(5, request.getOptions().size());
    }

    @Test
    public void testGetMethod() {
        assertNull(mRequest.getHttpMethod());
        mRequest.send();
        assertEquals(HttpMethod.GET, mRequest.getHttpMethod());
    }
    @Test
    public void testPostMethod() {
        assertNull(mRequest.getHttpMethod());
        mRequest.post(null);
        assertEquals(HttpMethod.POST, mRequest.getHttpMethod());
    }

    @Test
    public void testHeader() {
        final String expectedHeader = "header key";
        final String expectedValue = "header value";
        final BaseCollectionRequest<String,ICollectionResponse<String>> request = new BaseCollectionRequest<String,ICollectionResponse<String>>("https://a.b.c/", null, null, null,null){};
        assertEquals(1, request.getHeaders().size());
        request.addHeader(expectedHeader,expectedValue);
        assertEquals(2,request.getHeaders().size());
    }
}
