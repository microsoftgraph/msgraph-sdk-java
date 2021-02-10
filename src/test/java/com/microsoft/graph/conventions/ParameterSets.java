package com.microsoft.graph.conventions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.functional.TestBase;
import com.microsoft.graph.models.CalendarGetScheduleParameterSet;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.ReportRootGetMailboxUsageStorageParameterSet;
import com.microsoft.graph.requests.CalendarGetScheduleCollectionRequest;

import org.junit.jupiter.api.Test;

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
    @Test
    public void testActionsParamsFromBuilder() throws IOException {
        final TestBase testBase = new TestBase(false);
        final CalendarGetScheduleParameterSet paramSet = new CalendarGetScheduleParameterSet() {{
            this.schedules = Arrays.asList("john@contoso.onmicrosoft.com", "jane@contoso.onmicrosoft.com");
            this.endTime = new DateTimeTimeZone(){{
                this.dateTime = OffsetDateTime.now().plusDays(1).plusHours(8).toLocalDateTime().toString();
                this.timeZone = "Eastern Standard Time";
            }};
            this.startTime = new DateTimeTimeZone(){{
                this.dateTime = OffsetDateTime.now().plusDays(1).toLocalDateTime().toString();
                this.timeZone = "Eastern Standard Time";
            }};
            this.availabilityViewInterval = 60;
        }};
        final CalendarGetScheduleCollectionRequest request = testBase.graphClient.me().calendar().getSchedule(paramSet).buildRequest();
        assertNotNull(request);
        assertNotNull(request.body);
        assertEquals("john@contoso.onmicrosoft.com", request.body.schedules.get(0));
        assertEquals("jane@contoso.onmicrosoft.com", request.body.schedules.get(1));
        assertEquals(60, request.body.availabilityViewInterval);
    }
}
