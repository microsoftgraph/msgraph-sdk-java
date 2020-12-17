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
import com.microsoft.graph.models.extensions.UserDeltaParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageStorageParameterSet;
import com.microsoft.graph.functional.TestBase;

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
    @Test
    public void testDeltaLinkParsing() {
        final TestBase base = new TestBase(false);
        final Request request = base.graphClient
            .users()
            .delta()
            .buildRequest()
            .deltaLink("https://graph.microsoft.com/v1.0/users/delta?$deltatoken=7ePNoMilh_6jGw8ZCAXfe7DBBYn5cAXbIlHDE9C1NqYBWrAmcZVRZNCeSQrOjsrQboz7DEeiB3ne78Yb6yFn4F49LhMk0eu8SAhfMyDC2yYWXGv1OXt80YGQ-rk-g7xaTcjs9Za6mQ78dwlC4apWq82EcFTjBF5V7rv4R17dMF9b0812qHLWS0aHX92TrmBBI26gLtO-_wAF2rKvltvQ8SNfJpeNyIxYO2t8fnSqaLml-ptZtgvbAPXTsJn9SpI7cDQlrZrWczdGS4yCOMUvpzClHLjb2CuKrxPcG2oD0jinB4IDB4ISC8gzb3Gst8j1cPgWMKC-Q-XVaonjz3hVi4eRVGqLtJefjuSIY8mCQv2tKTaKVfNvVSWvujtfQ6mGzLqeie0jOCI3M-w-U1iMnS3DNx6c-pGT6AmuSDjR_pR8stnqFeWKW_c5Vl8g9dbFefVHfuCelQ0WESf6rkqKReMnFM6WhExFczYCWZ42VnBBs5jEDnQpetkGf1n2x-27QLkwGUge_2cqCec8gU7lP4y43l7zBck5tP9S59TbJVJFtQ_-xw9PqMvFhnOfEciBwMubXXygEjYvltTdwiAwx4Fzaetc96GMG6Qz7SdyoSKqF5FsZvrNMsFcQAd6SjP_423-a-6ssDXeZWGQC0Sr2aLCJrXJPepfft-sTNLuPYL1Y_Pdl2DnCSvusM7tT3ONZNjRxYZhp3sZ56Su_AL0eA1pPcnqTwLpmbp7ifV2vZlG5AcXxTXYpidKjoQ1NRxIMe5ia-73-dszaMlG3wzdE_kqrJISg9UZ42W_5BdLpHNKS-dV4r2SOFzkm0qYlxWI4_p5P200C3dgP4JhODelQdEwFv-tM2NsxuDZ4EFtw2hexvRdkaVGvngqN21e32ZkAgh-aOS0uTDSRD6bE_TgIRoS53h8-Eps59wevGmgHNJUafsNICKU3XUYg0NAxohZ7t7lAsmM8Uu4L2Ex0MshI_SOVRp7Taj37NLWoaV-PYqgZIp9RNDagMYKZI4G4g2dPUIWsLq2g9dBwQNSQC2rX95hQeJAmsuQXJosmgWBn9a5JebhE_hBBiSU2YGAdNFpdBctBzwVfLJJnsNxpVYGAdc0aOa5o75WjM3fHozkMgmjVz7zz8GJLrBgEV7ArkCQNq2QZVMvZH81tLXsU6BtaBDCYH0_HdMjFArn4L3F6fapzv96DsK-ITKTIv5yra0s_u58XlLdGABKMcc5rXTAieH5W9Vio0jk1rohlXl1xwh42fWZBFAtFjEcFJ3XMke1nEqwro0BjmS6ERLJN395Wcsp7QVPisxI4VIx3wIBtdURZv7UDeRa9migUJPRjUgX4T2sHteOCPGWu_eIX6_9rlW0Lj2kfny-CMrn7f4S_jUgVeNdpMiknbRGIw2_8qUud93DEpaOs11vjLJnpCA5OYteyVt5hK5Pjy008R-tgvkYkrmUSwDWh58pWztAw2pK6bONIstjo1jc5hA9p8rcH4RPIbnMFJ2zmG8VbpsnQquPQquIIo0YLAzIeBgGiMwHjiaXPSKI_Ezuc3WsIYKlQkQHUFjI5YQUY9vBDTWzs0sHA3h_Z0jQbOGcekfeiRdFdvg_TjzTneHQG-oK1jqeCESQpb6-Oi-fJasDdjDSbmh_encE1o1OLJpiW3bCgawpgjhsI65Ygmf6CUhLNaIOaQmTtaUloF3xMk4gqtgFDNwPhuWl46U83N4sBlULJRgnuL9Douh6djW777BiU20ADrWdAO8QM0lluE3dD1LcyatAo2V6bfwozkGheYoABaoN-rlg9X2ovc5WluS56FtOs06rY1dUf8mV_qadzIgHdyYTE6qmQfnNHMVgZRxSQc4IRZwaXgT1GFq_A3Gr3bIVLbWkoNpwoITLekG6c6ISVaLNQNQD_-2mfHsvXRNJEJIIShqOL9HhJEARkK7U1yjvvlqjd05oIC65ylX2k6-jfITwAGttDBD177LMYDTJ-65ag4tPMUeZy0nUG9RePqfHs9NxSZmZf4cYct6CgsMEfi8ctUJuKhaA4MhLSKVBYTNkcy8bHAkuA7ROTopSqceWPOBuec1Ze7vp9FOQK6o0zKkgtk4rB6hBTAyGzBZybkqGisczxd-nMBYn8coqa-IiEeGWo85zfXolJBd4TLpjQWbZhUzfHlpAS64mGPDA6knY4B_cU1sLsMyxFU2m7RtlAomO5-B4ciOIebGDJIj5vg_p-6XShs6t3fERo-C43RDVG2dj-kB3Y4TxMhIRrXErdHXzI8d7Z1M6XAObh2JONHr2X48E9GRgexQEg0gRJKcPBeJaM38lt5oKIa9Pfi75ZApZlOUp6bmiJwIDORJ5eTaHzO-50pnZbzyt9uj8DAZnasj3nfrt1jzDWGmmdRqL2wNyWiiwxNWePivtJdCwr86L-qvHyqbQQjRgGpjI3xHAoAvLL717O2V6CDRIf_DGdt0Dct8DUtK9jnIaYSYukDes1FJeDj-KfF-lMdrm1K2EeTlB1pUdG_NaX1bknCmjkXy6lVgP3m3I_d7yNUVVpVsXz9kIbo-voEugmd8uo3tlx2etk_3oNU0WqGPI3xODpp_ENlpwnji1C_UO5eVGo8et9o2j482HpaEb1q-Alql0KlpgnNTb8tqGHLM3H3nf7zPJJ9Rd80tYJIBWQnzaCtLMCsvzqmTwjnOY8F0EQk6ZwLDJsee5xWeCVfpZ6ZzZH5ytcEsUWynoNM4fQvUbtt6yUu11y3AcZMP3vxfmwxou-o6tQXS_u_2W0OVjqgBk4r3FvhE0pmwNDEALIM1vbQoOASIwXBNKkvGL95AVaZZ8gxO9mX13R4KtV2PXt3QzVJOhYe0duB6gTr_Ng45doE6yNWn2tJlws3eywIhmLCh3dAqCHZghsZPltwRoqwY0Ib_JCuAnZsDA-scaRiL7ptFtIOXb1O1cT5ZRnM72lBxfkdEGKuDtv-TPo3okmqigtn4hckzaXeZlC42Ax2U2me5XqBj_Vkc9pSAwUN64-lm5cm_qrVwxy6pERuIGVP6xEh9HMBzDQgemJcurwfmKqZs.f1VLaUpVA-BopcJiSi_pLEUVB2GRt83Cbrw6x2n0Hy8")
            .withHttpMethod(HttpMethod.GET)
            .getHttpRequest();
        assertNotNull(request.url().queryParameter("$deltatoken"));
    }
    @Test
    public void testFunctionOptionsFromBuilder() {
        final TestBase base = new TestBase(false);
        final Request request = base.graphClient
            .reports()
            .getMailboxUsageStorage(ReportRootGetMailboxUsageStorageParameterSet.newBuilder().withPeriod("somePeriod").build())
            .buildRequest()
            .withHttpMethod(HttpMethod.GET)
            .getHttpRequest();
        assertEquals("https://graph.microsoft.com/v1.0/reports/microsoft.graph.getMailboxUsageStorage(period='somePeriod')", request.url().toString());
    }
}
