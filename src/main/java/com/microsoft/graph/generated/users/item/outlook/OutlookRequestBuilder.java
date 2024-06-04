package com.microsoft.graph.users.item.outlook;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OutlookUser;
import com.microsoft.graph.users.item.outlook.mastercategories.MasterCategoriesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedlanguages.SupportedLanguagesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedtimezones.SupportedTimeZonesRequestBuilder;
import com.microsoft.graph.users.item.outlook.supportedtimezoneswithtimezonestandard.SupportedTimeZonesWithTimeZoneStandardRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the outlook property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the masterCategories property of the microsoft.graph.outlookUser entity.
     * @return a {@link MasterCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MasterCategoriesRequestBuilder masterCategories() {
        return new MasterCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the supportedLanguages method.
     * @return a {@link SupportedLanguagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SupportedLanguagesRequestBuilder supportedLanguages() {
        return new SupportedLanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the supportedTimeZones method.
     * @return a {@link SupportedTimeZonesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SupportedTimeZonesRequestBuilder supportedTimeZones() {
        return new SupportedTimeZonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OutlookRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutlookRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link OutlookRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutlookRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get outlook from users
     * @return a {@link OutlookUser}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OutlookUser get() {
        return get(null);
    }
    /**
     * Get outlook from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OutlookUser}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OutlookUser get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OutlookUser::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the supportedTimeZones method.
     * @param TimeZoneStandard Usage: TimeZoneStandard='{TimeZoneStandard}'
     * @return a {@link SupportedTimeZonesWithTimeZoneStandardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SupportedTimeZonesWithTimeZoneStandardRequestBuilder supportedTimeZonesWithTimeZoneStandard(@jakarta.annotation.Nonnull final String TimeZoneStandard) {
        Objects.requireNonNull(TimeZoneStandard);
        return new SupportedTimeZonesWithTimeZoneStandardRequestBuilder(pathParameters, requestAdapter, TimeZoneStandard);
    }
    /**
     * Get outlook from users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get outlook from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OutlookRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutlookRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OutlookRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get outlook from users
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
