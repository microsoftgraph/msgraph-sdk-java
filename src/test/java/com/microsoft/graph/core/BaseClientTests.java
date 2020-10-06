package com.microsoft.graph.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import okhttp3.OkHttpClient;

import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Test cases for {@see BaseClient}
 */
public class BaseClientTests {
	public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";
    private String mEndpoint = DEFAULT_GRAPH_ENDPOINT;
    private BaseClient baseClient;
    private IExecutors mExecutors;
    private IHttpProvider mHttpProvider;
    private ILogger mLogger;
    private ISerializer mSerializer;

	@Before
	public void setUp() throws Exception {
        baseClient = new BaseClient() {
            @Override
            public String getServiceRoot() {
                return mEndpoint;
            }

            @Override
            public void setServiceRoot(String value) {
                mEndpoint = value;
            }
        };
        mExecutors = new MockExecutors();
        mLogger = new MockLogger();
        mSerializer = new MockSerializer(null, "");
        mHttpProvider = new CoreHttpProvider(mSerializer,
            mExecutors,
            mLogger,
            new OkHttpClient.Builder().build());
	}

	@Test
	public void testNotNull() {
        assertNotNull(baseClient);
        assertNotNull(mExecutors);
        assertNotNull(mHttpProvider);
        assertNotNull(mLogger);
        assertNotNull(mSerializer);
    }

	@Test
    public void testValidateThrowException() {
        Boolean success = false;
        try {
            baseClient.validate();
        }catch (NullPointerException nEx){
            success = true;
        }
        assertTrue(success);
    }

	@Test
    public void testValidateSuccess() throws Exception {
        baseClient.setExecutors(mExecutors);
        baseClient.setHttpProvider(mHttpProvider);
        baseClient.setSerializer(mSerializer);
        baseClient.validate();
    }

	@Test
    public void testEndPoint() {
        assertEquals(DEFAULT_GRAPH_ENDPOINT, baseClient.getServiceRoot());
        String expectedServiceRoot = "https://foo.bar";
        baseClient.setServiceRoot(expectedServiceRoot);
        assertEquals(expectedServiceRoot, baseClient.getServiceRoot());
    }

	@Test
    public void testExecutors() {
        assertNull(baseClient.getExecutors());
        baseClient.setExecutors(mExecutors);
        assertEquals(mExecutors, baseClient.getExecutors());
    }

	@Test
    public void testHttpProvider() {
        assertNull(baseClient.getHttpProvider());
        baseClient.setHttpProvider(mHttpProvider);
        assertEquals(mHttpProvider, baseClient.getHttpProvider());
    }
	
	public void testLogger() {
        assertNull(baseClient.getLogger());
        baseClient.setLogger(mLogger);
        assertEquals(mLogger, baseClient.getLogger());
    }

    @Test
    public void testSerializer() {
        assertNull(baseClient.getSerializer());
        baseClient.setSerializer(mSerializer);
        assertEquals(mSerializer, baseClient.getSerializer());
    }

}
