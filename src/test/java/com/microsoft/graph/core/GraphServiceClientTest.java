package com.microsoft.graph.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import com.microsoft.graph.concurrency.DefaultExecutors;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.core.GraphServiceClient;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.http.IStatefulResponseHandler;
import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.serializer.ISerializer;

public class GraphServiceClientTest {
    private ICoreAuthenticationProvider getAuthProvider() {
        return new ICoreAuthenticationProvider() {
            @Override
            public Request authenticateRequest(Request request) {
                return request;
            }
        };
    }

    @Test
    public void testClientMethodsReturnStuff() {
        ILogger logger = createLogger();
        IGraphServiceClient client = GraphServiceClient.builder()
                .logger(logger)
                .authenticationProvider(getAuthProvider())
                .buildClient();
        assertNotNull(client.getExecutors());
        assertNotNull(client.getHttpProvider());
        assertNotNull(client.getLogger());
        assertNotNull(client.getSerializer());
    }

    @Test
    public void testOverrideOfDefaultLogger() {
        ILogger logger = createLogger();
        IGraphServiceClient client = GraphServiceClient.builder()
                .logger(logger)
                .authenticationProvider(getAuthProvider())
                .buildClient();
        assertNotNull(client.getExecutors());
        assertNotNull(client.getHttpProvider());
        assertNotNull(client.getLogger());
        assertNotNull(client.getSerializer());
        assertEquals(logger, ((CoreHttpProvider) client.getHttpProvider()).getLogger());
        assertEquals(logger, ((DefaultSerializer) client.getSerializer()).getLogger());
        assertEquals(logger, ((DefaultExecutors) client.getExecutors()).getLogger());
        assertEquals(logger, client.getLogger());
    }

    @Test
    public void testOverrideOfDefaultAuthenticationProvider() {
        IGraphServiceClient client = GraphServiceClient.builder()
                .authenticationProvider(getAuthProvider())
                .buildClient();
        assertNotNull(client.getExecutors());
        assertNotNull(client.getHttpProvider());
        assertNotNull(client.getLogger());
        assertNotNull(client.getSerializer());
    }

    @Test
    public void testOverrideOfDefaultExecutors() {
        IExecutors ex = new IExecutors() {

            @Override
            public void performOnBackground(Runnable runnable) {
                // do nothing
            }

            @Override
            public <Result> void performOnForeground(Result result, ICallback<Result> callback) {
                // do nothing
            }

            @Override
            public <Result> void performOnForeground(int progress, int progressMax,
                    IProgressCallback<Result> callback) {
                // do nothing
            }

            @Override
            public <Result> void performOnForeground(ClientException exception,
                    ICallback<Result> callback) {
                // do nothing
            }
            
            @Override
            public void shutdownBackgroundExecutors() {
            	// do nothing
            }

        };
        IGraphServiceClient client = GraphServiceClient.builder()
                .executors(ex)
                .authenticationProvider(getAuthProvider())
                .buildClient();
        assertEquals(ex, client.getExecutors());
        assertNotNull(client.getHttpProvider());
        assertNotNull(client.getLogger());
        assertNotNull(client.getSerializer());
        assertEquals(ex, ((CoreHttpProvider) client.getHttpProvider()).getExecutors());
    }

    @Test
    public void testOverrideOfSerializer() {
        ISerializer serializer = new ISerializer() {

            @Override
            public <T> String serializeObject(T serializableObject) {
                return null;
            }

            @Override
            public <T> T deserializeObject(String inputString, Class<T> clazz,
                    Map<String, List<String>> responseHeaders) {
                return null;
            }

            @Override
            public <T> T deserializeObject(String inputString, Class<T> clazz) {
                return null;
            }
        };
        IGraphServiceClient client = GraphServiceClient.builder()
                .serializer(serializer)
                .authenticationProvider(getAuthProvider())
                .buildClient();
        assertEquals(serializer, client.getSerializer());
        assertNotNull(client.getHttpProvider());
        assertNotNull(client.getLogger());
        assertNotNull(client.getExecutors());
        assertEquals(serializer, ((CoreHttpProvider) client.getHttpProvider()).getSerializer());
    }

    @Test
    public void testOverrideOfHttpSerializer() {
        IHttpProvider hp = new IHttpProvider() {

            @Override
            public ISerializer getSerializer() {
                return null;
            }

            @Override
            public <Result, BodyType> void send(IHttpRequest request, ICallback<? super Result> callback,
                    Class<Result> resultClass, BodyType serializable) {
                // do nothing
            }

            @Override
            public <Result, BodyType> Result send(IHttpRequest request, Class<Result> resultClass,
                    BodyType serializable) throws ClientException {
                return null;
            }

            @Override
            public <Result, BodyType, DeserializeType> Result send(IHttpRequest request,
                    Class<Result> resultClass, BodyType serializable,
                    IStatefulResponseHandler<Result, DeserializeType> handler)
                    throws ClientException {
                return null;
            }

			@Override
			public <Result, BodyType> Request getHttpRequest(IHttpRequest request, Class<Result> resultClass,
					BodyType serializable, IProgressCallback<? super Result> progress) throws ClientException {
				return null;
			}
        };
        IGraphServiceClient client = GraphServiceClient
                .builder()
                .httpProvider(hp)
                .buildClient();
        assertEquals(hp, client.getHttpProvider());
        assertNotNull(client.getSerializer());
        assertNotNull(client.getLogger());
        assertNotNull(client.getExecutors());
    }

    @Test(expected = NullPointerException.class)
    public void testHttpProviderCannotBeNull() {
        GraphServiceClient.builder().httpProvider(null);
    }

    @Test(expected = NullPointerException.class)
    public void testExecutorsCannotBeNull() {
        GraphServiceClient.builder().executors(null);
    }

    @Test(expected = NullPointerException.class)
    public void testLoggerCannotBeNull() {
        GraphServiceClient.builder().logger(null);
    }
    
    private static ILogger createLogger() {
        return new ILogger() {

            @Override
            public void setLoggingLevel(LoggerLevel level) {
                // do nothing
            }

            @Override
            public LoggerLevel getLoggingLevel() {
                return LoggerLevel.DEBUG;
            }

            @Override
            public void logDebug(String message) {
                // do nothing
            }

            @Override
            public void logError(String message, Throwable throwable) {
                // do nothing
            }
        };
    }

}
