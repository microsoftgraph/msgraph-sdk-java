package com.microsoft.graph.reports.getskypeforbusinessactivityuserdetailwithperiod;

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
 * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param period Usage: period='{period}'
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String period) {
        super(requestAdapter, "{+baseurl}/reports/getSkypeForBusinessActivityUserDetail(period='{period}')", pathParameters);
        this.pathParameters.put("period", period);
    }
    /**
     * Instantiates a new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getSkypeForBusinessActivityUserDetail(period='{period}')", rawUrl);
    }
    /**
     * Invoke function getSkypeForBusinessActivityUserDetail
     * @return a InputStream
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Invoke function getSkypeForBusinessActivityUserDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InputStream
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Invoke function getSkypeForBusinessActivityUserDetail
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getSkypeForBusinessActivityUserDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
