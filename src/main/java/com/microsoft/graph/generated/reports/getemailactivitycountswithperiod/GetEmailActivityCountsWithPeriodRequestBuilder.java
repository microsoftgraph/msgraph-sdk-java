package com.microsoft.graph.reports.getemailactivitycountswithperiod;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getEmailActivityCounts method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetEmailActivityCountsWithPeriodRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetEmailActivityCountsWithPeriodRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param period Usage: period=&apos;{period}&apos;
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetEmailActivityCountsWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String period) {
        super(requestAdapter, "{+baseurl}/reports/getEmailActivityCounts(period='{period}')", pathParameters);
        this.pathParameters.put("period", period);
    }
    /**
     * Instantiates a new {@link GetEmailActivityCountsWithPeriodRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetEmailActivityCountsWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getEmailActivityCounts(period='{period}')", rawUrl);
    }
    /**
     * Enables you to understand the trends of email activity (like how many were sent, read, and received) in your organization.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getemailactivitycounts?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Enables you to understand the trends of email activity (like how many were sent, read, and received) in your organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getemailactivitycounts?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Enables you to understand the trends of email activity (like how many were sent, read, and received) in your organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Enables you to understand the trends of email activity (like how many were sent, read, and received) in your organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetEmailActivityCountsWithPeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityCountsWithPeriodRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetEmailActivityCountsWithPeriodRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
