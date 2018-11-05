package com.microsoft.graph.http;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Provides an HttpURLConnection
 */
public interface IHttpURLConnectionProvider {
    HttpURLConnection createFromRequest(final IHttpRequest request) throws IOException;
}