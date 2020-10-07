package com.microsoft.graph.core;

import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

public class MockBaseClient implements IBaseClient {

	private static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";
    private String mEndpoint;
    private IExecutors mExecutors;
    private IHttpProvider mHttpProvider;
    private ILogger mLogger;
    private ISerializer mSerializer;
	
    @Override
    public String getServiceRoot() {
        if(mEndpoint == null) {
            mEndpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return mEndpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        mEndpoint = value;
    }

    @Override
    public IExecutors getExecutors() {
        return mExecutors;
    }

    @Override
    public IHttpProvider getHttpProvider() {
        return mHttpProvider;
    }

    @Override
    public ILogger getLogger() {
        return mLogger;
    }

    @Override
    public ISerializer getSerializer() {
        return mSerializer;
    }

    @Override
    public void validate() {

    }
    
    public void setLogger(final ILogger logger) {
        mLogger = logger;
    }

    public void setExecutors(final IExecutors executors) {
        mExecutors = executors;
    }

    public void setHttpProvider(final IHttpProvider httpProvider) {
        mHttpProvider = httpProvider;
    }

    public void setSerializer(final ISerializer serializer) {
        mSerializer = serializer;
    }
    
    @Override
    public void shutdown() {
    	
    }

}
