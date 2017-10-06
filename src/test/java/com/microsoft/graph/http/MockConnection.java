package com.microsoft.graph.http;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Mock for {@see IConnection}
 */
public class MockConnection implements IConnection {

    private final ITestConnectionData mData;
    private HashMap<String, String> mHeaders = new HashMap<>();
    private Boolean mFollowRedirects;

    public MockConnection(ITestConnectionData data) {
        mData = data;
    }

    @Override
    public void setFollowRedirects(boolean followRedirects) {
        mFollowRedirects = followRedirects;
    }

    @Override
    public void addRequestHeader(String headerName, String headerValue) {
        mHeaders.put(headerName, headerValue);
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return new ByteArrayOutputStream();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(mData.getJsonResponse().getBytes());
    }

    @Override
    public int getResponseCode() throws IOException {
        return mData.getRequestCode();
    }

    @Override
    public String getResponseMessage() throws IOException {
        return mData.getJsonResponse();
    }

    @Override
    public void close() {

    }

    @Override
    public Map<String, String> getHeaders() {
        return mData.getHeaders();
    }

    @Override
    public String getRequestMethod() {
        return "GET";
    }

    @Override
    public int getContentLength() {
        return mData.getJsonResponse().length();
    }

    @Override
    public void setContentLength(int length) {
        // noop
    }

}
