package com.microsoft.graph.conventions;

import static org.junit.Assert.assertEquals;

import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.functional.TestBase;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageStorageParameterSet;

import org.junit.Test;

import okhttp3.Request;

public class ParameterSets {
    @Test
    public void testFunctionOptionsFromBuilder() {
        final TestBase base = new TestBase(false);
        final Request request = base.graphClient
            .reports()
            .getMailboxUsageStorage(ReportRootGetMailboxUsageStorageParameterSet.newBuilder().withPeriod("somePeriod").build())
            .buildRequest()
            .withHttpMethod(HttpMethod.GET)
            .getHttpRequest();
        assertEquals("https://graph.microsoft.com/v1.0/reports/microsoft.graph.getMailboxUsageStorage(period='somePeriod')", request.url().toString());
    }
}
