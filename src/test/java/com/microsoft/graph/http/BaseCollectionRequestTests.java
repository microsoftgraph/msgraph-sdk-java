package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
import com.microsoft.graph.core.IBaseClient;
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
    @SuppressWarnings("unchecked")
    private Class<ICollectionResponse<JsonObject>> jsonObjectCollectionResponseMockClass = (Class<ICollectionResponse<JsonObject>>)mock(ICollectionResponse.class).getClass();
    @SuppressWarnings("unchecked")
    private Class<BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>> jsonObjectCollectionPageMockClass = (Class<BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>>)mock(BaseCollectionPage.class).getClass();
    @SuppressWarnings("unchecked")
    private Class<BaseCollectionRequestBuilder<JsonObject,
                                        BaseRequestBuilder<JsonObject>,
                                        ICollectionResponse<JsonObject>,
                                        BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>,
                                        BaseCollectionRequest<JsonObject, ICollectionResponse<JsonObject>, BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>>>> jsonObjectCollectionRequestBuilderMockClass =
                                        (Class<BaseCollectionRequestBuilder<JsonObject,
                                        BaseRequestBuilder<JsonObject>,
                                        ICollectionResponse<JsonObject>,
                                        BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>,
                                        BaseCollectionRequest<JsonObject, ICollectionResponse<JsonObject>, BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>>>>)
                                        mock(BaseCollectionRequestBuilder.class).getClass();
    private BaseEntityCollectionRequest<JsonObject, ICollectionResponse<JsonObject>, BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>> mRequest;

    @Before
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
        final JsonObject resultobj = new JsonObject();
        resultobj.add("id", new JsonPrimitive("zzz"));
        @SuppressWarnings("unchecked")
        final ICollectionResponse<JsonObject> result = mock(ICollectionResponse.class);
        when(result.values()).thenReturn(new ArrayList<JsonObject>(Arrays.asList(resultobj)));
        CoreHttpProvider mProvider = new CoreHttpProvider(new MockSerializer(result, "[{ \"id\": \"zzz\" }]"),
                new MockExecutors(),
                new MockLogger(),
                mockClient);
        mBaseClient.setHttpProvider(mProvider);
        mRequest = new BaseEntityCollectionRequest<JsonObject,ICollectionResponse<JsonObject>, BaseCollectionPage<JsonObject, BaseRequestBuilder<JsonObject>>>("https://a.b.c/", mBaseClient, null, jsonObjectCollectionResponseMockClass, jsonObjectCollectionPageMockClass, jsonObjectCollectionRequestBuilderMockClass){};
    }

    @Test
    public void testSend() {
        final ICollectionResponse<JsonObject> result = mRequest.send();
        assertNotNull(result);
        assertEquals("zzz", result.values().get(0).get("id").getAsString());
    }

    @Test
    public void testPost() {
        final ICollectionResponse<JsonObject> result = mRequest.post(null);
        assertNotNull(result);
        assertEquals("zzz", result.values().get(0).get("id").getAsString());
    }

    @SuppressWarnings("unchecked")
    private Class<ICollectionResponse<String>> stringCollectionResponseMockClass = (Class<ICollectionResponse<String>>)mock(ICollectionResponse.class).getClass();
    @SuppressWarnings("unchecked")
    private Class<BaseCollectionPage<String, BaseRequestBuilder<String>>> stringCollectionPageMockClass = (Class<BaseCollectionPage<String, BaseRequestBuilder<String>>>)mock(BaseCollectionPage.class).getClass();
    @SuppressWarnings("unchecked")
    private Class<BaseCollectionRequestBuilder<String,
                                        BaseRequestBuilder<String>,
                                        ICollectionResponse<String>,
                                        BaseCollectionPage<String, BaseRequestBuilder<String>>,
                                        BaseCollectionRequest<String, ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>>> stringCollectionRequestBuilderMockClass =
                                        (Class<BaseCollectionRequestBuilder<String,
                                        BaseRequestBuilder<String>,
                                        ICollectionResponse<String>,
                                        BaseCollectionPage<String, BaseRequestBuilder<String>>,
                                        BaseCollectionRequest<String, ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>>>)
                                        mock(BaseCollectionRequestBuilder.class).getClass();
    @Test
    public void testFunctionParameters() {
        final Option f1 = new FunctionOption("1", "one");
        final Option f2 = new FunctionOption("2", null);
        final BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>> request = new BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>("https://a.b.c/", mock(IBaseClient.class), Arrays.asList(f1, f2), stringCollectionResponseMockClass, stringCollectionPageMockClass, stringCollectionRequestBuilderMockClass){};
        assertEquals("https://a.b.c/(1='one',2=null)", request.getRequestUrl().toString());
        request.addFunctionOption(new FunctionOption("3","two"));;
        assertEquals("https://a.b.c/(1='one',2=null,3='two')", request.getRequestUrl().toString());
        assertEquals(4, request.getOptions().size());
    }

    @Test
    public void testQueryParameters() {
        final Option q1 = new QueryOption("q1","option1 ");
        final Option q2 = new QueryOption("q2","option2");
        final BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>> request = new BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>("https://a.b.c/", mock(IBaseClient.class), Arrays.asList(q1, q2), stringCollectionResponseMockClass, stringCollectionPageMockClass, stringCollectionRequestBuilderMockClass){};
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
        final BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>> request = new BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>("https://a.b.c/", mock(IBaseClient.class), Arrays.asList(f1, f2, q1, q2), stringCollectionResponseMockClass, stringCollectionPageMockClass, stringCollectionRequestBuilderMockClass){};
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
        final BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>> request = new BaseCollectionRequest<String,ICollectionResponse<String>, BaseCollectionPage<String, BaseRequestBuilder<String>>>("https://a.b.c/", mock(IBaseClient.class), null, stringCollectionResponseMockClass, stringCollectionPageMockClass, stringCollectionRequestBuilderMockClass){};
        assertEquals(1, request.getHeaders().size());
        request.addHeader(expectedHeader,expectedValue);
        assertEquals(2,request.getHeaders().size());
    }
}
