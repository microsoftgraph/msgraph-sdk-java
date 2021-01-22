package com.microsoft.graph.telemetry;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.info.Constants;
import com.microsoft.graph.requests.GraphServiceClient;

import org.junit.Test;

public class VersionHeader {
    @Test
    public void testHeader() {
        final BaseRequest<Void> request = new BaseRequest<Void>("https://a.b.c/", GraphServiceClient.builder().authenticationProvider(mock(IAuthenticationProvider.class)).buildClient(), null, null){};
        assertEquals(1, request.getHeaders().size());
        assertEquals("SdkVersion", request.getHeaders().get(0).getName());
        assertEquals(String.format(BaseRequest.REQUEST_STATS_HEADER_VALUE_FORMAT_STRING, Constants.VERSION_NAME), request.getHeaders().get(0).getValue());
    }
}
