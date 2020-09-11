package com.microsoft.graph.functional;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;

import okhttp3.Request;

public class TestBaseAuthenticationProvider implements IAuthenticationProvider, ICoreAuthenticationProvider {
    private String _accessToken;
    public TestBaseAuthenticationProvider(String accessToken) {
        _accessToken = accessToken;
    }
    @Override
    public Request authenticateRequest(Request request) {
        return request.newBuilder().addHeader("Authorization", "Bearer " + _accessToken).build();
    }

    @Override
    public void authenticateRequest(IHttpRequest request) {
        request.addHeader("Authorization",
                                "Bearer " + _accessToken);
    }
    
}
