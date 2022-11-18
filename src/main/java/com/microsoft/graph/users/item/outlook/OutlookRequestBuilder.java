package com.microsoft.graph.users.item.outlook;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OutlookUser;
import com.microsoft.graph.users.item.outlook.mastercategories.item.OutlookCategoryItemRequestBuilder;
import com.microsoft.graph.users.item.outlook.mastercategories.MasterCategoriesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedlanguages.SupportedLanguagesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedtimezones.SupportedTimeZonesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedtimezoneswithtimezonestandard.SupportedTimeZonesWithTimeZoneStandardRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the outlook property of the microsoft.graph.user entity. */
public class OutlookRequestBuilder {
    /** Provides operations to manage the masterCategories property of the microsoft.graph.outlookUser entity. */
    @javax.annotation.Nonnull
    public MasterCategoriesRequestBuilder masterCategories() {
        return new MasterCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new OutlookRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/outlook{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new OutlookRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/outlook{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get outlook from users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get outlook from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get outlook from users
     * @return a CompletableFuture of outlookUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OutlookUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<OutlookUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get outlook from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of outlookUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OutlookUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<OutlookUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the masterCategories property of the microsoft.graph.outlookUser entity.
     * @param id Unique identifier of the item
     * @return a OutlookCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OutlookCategoryItemRequestBuilder masterCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("outlookCategory%2Did", id);
        return new OutlookCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the supportedLanguages method.
     * @return a supportedLanguagesRequestBuilder
     */
    @javax.annotation.Nonnull
    public SupportedLanguagesRequestBuilder supportedLanguages() {
        return new SupportedLanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the supportedTimeZones method.
     * @return a supportedTimeZonesRequestBuilder
     */
    @javax.annotation.Nonnull
    public SupportedTimeZonesRequestBuilder supportedTimeZones() {
        return new SupportedTimeZonesRequestBuilder(pathParameters, requestAdapter);
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
    /** Get outlook from users */
    public class GetQueryParameters {
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
}
