package com.microsoft.graph.http;

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Mock for {@see IHttpRequest}
 */
public class MockHttpRequest implements IHttpRequest {

    private HttpMethod mHttpMethod = HttpMethod.GET;
    private List<HeaderOption> mHeaders = new ArrayList<HeaderOption>();
    private List<Option> mOptions = new ArrayList<Option>();
    private boolean mUseCaches;

    @Override
    public URL getRequestUrl() {
        try {
            return new URL("http://localhost");
        } catch (final MalformedURLException ex) {
            throw new ClientException("Invalid URL", ex, GraphErrorCodes.INVALID_REQUEST);
        }
    }

    @Override
    public HttpMethod getHttpMethod() {
        return mHttpMethod;
    }

    @Override
    public List<HeaderOption> getHeaders() {
        return mHeaders;
    }

    @Override
    public List<Option> getOptions() {
        return mOptions;
    }

    @Override
    public void addHeader(String header, String value) {
        mHeaders.add(new HeaderOption(header, value));
    }

    @Override
    public void setUseCaches(boolean useCaches) {
        mUseCaches = useCaches;
    }

    @Override
    public boolean getUseCaches() {
        return mUseCaches;
    }

    public void setHttpMethod(HttpMethod method) {
        mHttpMethod = method;
    }
}
