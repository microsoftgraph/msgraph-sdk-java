package com.microsoft.graph.me.outlook;

import com.microsoft.graph.me.outlook.mastercategories.MasterCategoriesRequestBuilder;
import com.microsoft.graph.me.outlook.supportedlanguages.SupportedLanguagesRequestBuilder;
import com.microsoft.graph.me.outlook.supportedtimezones.SupportedTimeZonesRequestBuilder;
import com.microsoft.graph.me.outlook.supportedtimezoneswithtimezonestandard.SupportedTimeZonesWithTimeZoneStandardRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OutlookUser;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the outlook property of the microsoft.graph.user entity.
 */
public class OutlookRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the masterCategories property of the microsoft.graph.outlookUser entity. */
    @javax.annotation.Nonnull
    public MasterCategoriesRequestBuilder masterCategories() {
        return new MasterCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the supportedLanguages method. */
    @javax.annotation.Nonnull
    public SupportedLanguagesRequestBuilder supportedLanguages() {
        return new SupportedLanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the supportedTimeZones method. */
    @javax.annotation.Nonnull
    public SupportedTimeZonesRequestBuilder supportedTimeZones() {
        return new SupportedTimeZonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OutlookRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/outlook{?%24select}", pathParameters);
    }
    /**
     * Instantiates a new OutlookRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/outlook{?%24select}", rawUrl);
    }
    /**
     * Get outlook from me
     * @return a CompletableFuture of outlookUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OutlookUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OutlookUser> executionException = new java.util.concurrent.CompletableFuture<OutlookUser>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get outlook from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of outlookUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OutlookUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OutlookUser> executionException = new java.util.concurrent.CompletableFuture<OutlookUser>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the supportedTimeZones method.
     * @param TimeZoneStandard Usage: TimeZoneStandard='{TimeZoneStandard}'
     * @return a supportedTimeZonesWithTimeZoneStandardRequestBuilder
     */
    @javax.annotation.Nonnull
    public SupportedTimeZonesWithTimeZoneStandardRequestBuilder supportedTimeZonesWithTimeZoneStandard(@javax.annotation.Nonnull final String timeZoneStandard) {
        Objects.requireNonNull(timeZoneStandard);
        return new SupportedTimeZonesWithTimeZoneStandardRequestBuilder(pathParameters, requestAdapter, timeZoneStandard);
    }
    /**
     * Get outlook from me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get outlook from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get outlook from me
     */
    public class GetQueryParameters {
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
