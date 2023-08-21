package com.microsoft.graph.groups.item.sites.item.analytics.alltime;

import com.microsoft.graph.models.ItemActivityStat;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the allTime property of the microsoft.graph.itemAnalytics entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllTimeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AllTimeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllTimeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/analytics/allTime{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AllTimeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllTimeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/analytics/allTime{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get [itemAnalytics][] about the views that took place under this resource.The itemAnalytics resource is a convenient way to get activity stats for allTime and the lastSevenDays.For a custom time range or interval, use the [getActivitiesByInterval][] API.
     * @return a CompletableFuture of itemActivityStat
     * @see <a href="https://learn.microsoft.com/graph/api/itemanalytics-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityStat> get() {
        return get(null);
    }
    /**
     * Get [itemAnalytics][] about the views that took place under this resource.The itemAnalytics resource is a convenient way to get activity stats for allTime and the lastSevenDays.For a custom time range or interval, use the [getActivitiesByInterval][] API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of itemActivityStat
     * @see <a href="https://learn.microsoft.com/graph/api/itemanalytics-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityStat> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ItemActivityStat::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get [itemAnalytics][] about the views that took place under this resource.The itemAnalytics resource is a convenient way to get activity stats for allTime and the lastSevenDays.For a custom time range or interval, use the [getActivitiesByInterval][] API.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get [itemAnalytics][] about the views that took place under this resource.The itemAnalytics resource is a convenient way to get activity stats for allTime and the lastSevenDays.For a custom time range or interval, use the [getActivitiesByInterval][] API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Get [itemAnalytics][] about the views that took place under this resource.The itemAnalytics resource is a convenient way to get activity stats for allTime and the lastSevenDays.For a custom time range or interval, use the [getActivitiesByInterval][] API.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
