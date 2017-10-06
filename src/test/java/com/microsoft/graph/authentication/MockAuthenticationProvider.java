package com.microsoft.graph.authentication;

import com.microsoft.graph.http.IHttpRequest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Mock authenticationProvider {@see IAuthenticationProvider}
 */
public class MockAuthenticationProvider implements IAuthenticationProvider {

    /**
     * Interception counter
     */
    private AtomicInteger mInterceptionCount = new AtomicInteger(0);

    @Override
    public void authenticateRequest(IHttpRequest request) {
        mInterceptionCount.incrementAndGet();
    }

    /**
     * Gets the number of intercepted requests
     * @return The number of intercepted requests
     */
    public int getInterceptionCount() {
        return mInterceptionCount.get();
    }
}
