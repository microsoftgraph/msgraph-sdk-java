package com.microsoft.graph.http;

import java.util.Map;

/**
 * Test data to use in configuring the mock connection object
 */
public interface ITestConnectionData {

    int getRequestCode();

    String getJsonResponse();

    Map<String,String> getHeaders();
}

