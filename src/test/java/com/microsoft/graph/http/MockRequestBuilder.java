package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;

/**
 * Mock for {@see IRequestBuilder}
 */
public class MockRequestBuilder implements IRequestBuilder {

    private String mRequestUrl;
    private IBaseClient mBaseClient;

    public MockRequestBuilder(IBaseClient baseClient, String requestUrl) {
        mBaseClient = baseClient;
        mRequestUrl = requestUrl;
    }

    @Override
    public IBaseClient getClient() {
        return mBaseClient;
    }

    @Override
    public String getRequestUrl() {
        return mRequestUrl;
    }

    @Override
    public String getRequestUrlWithAdditionalSegment(String urlSegment) {
        return mRequestUrl + urlSegment;
    }
}
