package com.microsoft.graph.http;

import java.io.IOException;
import java.util.Map;

/**
 * Mock for {@see IConnectionFactory}
 */
public class MockConnectionFactory implements IConnectionFactory {

    private final IConnection mConnection;

    public MockConnectionFactory(IConnection connection) {
        mConnection = connection;
    }

    @Override
    public IConnection createFromRequest(IHttpRequest request) throws IOException {
        return mConnection;
    }
}
