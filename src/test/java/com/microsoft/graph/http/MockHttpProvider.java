package com.microsoft.graph.http;

import java.io.BufferedInputStream;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.DefaultConnectionConfig;
import com.microsoft.graph.core.IConnectionConfig;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Mock for {@see IHttpProvider}
 */
public class MockHttpProvider implements IHttpProvider {

    private final ISerializer mSerializer;
    private final IAuthenticationProvider mAuthenticationProvider;
    private final IExecutors mExecutors;
    private final ILogger mLogger;
    private IConnectionFactory mConnectionFactory;
    private IConnectionConfig connectionConfig;

    @Override
    public ISerializer getSerializer() {
        return null;
    }

    public MockHttpProvider() {
        mLogger = new MockLogger();
        mSerializer = new MockSerializer(null,"");
        mAuthenticationProvider = new MockAuthenticationProvider();
        mExecutors = new MockExecutors();
        mConnectionFactory = new DefaultConnectionFactory();
    }

    public MockHttpProvider(final ISerializer serializer,
                               final IAuthenticationProvider authenticationProvider,
                               final IExecutors executors,
                               final ILogger logger) {
        mSerializer = serializer;
        mAuthenticationProvider = authenticationProvider;
        mExecutors = executors;
        mLogger = logger;
        mConnectionFactory = new DefaultConnectionFactory();
    }


    @Override
    public <Result, BodyType> void send(IHttpRequest request,
                                        ICallback<Result> callback,
                                        Class<Result> resultClass,
                                        BodyType serializable) {
        Result result = null;
        try{
            IConnection connection = mConnectionFactory.createFromRequest(request);
            if(connection.getResponseCode() == 200) {
                if(connection.getHeaders().containsKey("Content-Type")) {
                    if (connection.getHeaders().get("Content-Type").equals("application/json")){
                        JsonObject jsonObject = JsonParser.parseString(connection.getResponseMessage()).getAsJsonObject();
                        result = (Result) jsonObject;
                    }else if (connection.getHeaders().get("Content-Type").equals("application/octet-stream")) {
                        result = (Result) new BufferedInputStream(connection.getInputStream());
                    }
                }
            }
        } catch (Exception ex){
            final ClientException clientException = new ClientException("Error during http request",
                    ex);
            callback.failure(clientException);
        }
        callback.success(result);
    }

    @Override
    public <Result, BodyType> Result send(IHttpRequest request,
                                          Class<Result> resultClass,
                                          BodyType serializable) throws ClientException {
        try{
            IConnection connection = mConnectionFactory.createFromRequest(request);
            if(connection.getResponseCode() == 200) {
                if(connection.getHeaders().containsKey("Content-Type")) {
                    if (connection.getHeaders().get("Content-Type").equals("application/json")){
                        JsonObject jsonObject = JsonParser.parseString(connection.getResponseMessage()).getAsJsonObject();
                        return (Result) jsonObject;
                    }else if (connection.getHeaders().get("Content-Type").equals("application/octet-stream")) {
                        return (Result) new BufferedInputStream(connection.getInputStream());
                    }
                }
            }
        } catch (Exception ex){
            final ClientException clientException = new ClientException("Error during http request",
                    ex);
            throw clientException;
        }
        return null;
    }

    @Override
    public <Result, BodyType, DeserializeType> Result send(IHttpRequest request, Class<Result> resultClass, BodyType serializable, IStatefulResponseHandler<Result, DeserializeType> handler) throws ClientException {
        return null;
    }

    void setConnectionFactory(final IConnectionFactory factory) {
        mConnectionFactory = factory;
    }
    
    public IConnectionConfig getConnectionConfig() {
    	if(this.connectionConfig == null) {
    		this.connectionConfig = new DefaultConnectionConfig();
    	}
    	return this.connectionConfig;
    }
    
    public void setConnectionConfig(IConnectionConfig connectionConfig) {
    	this.connectionConfig = connectionConfig;
    }
}
