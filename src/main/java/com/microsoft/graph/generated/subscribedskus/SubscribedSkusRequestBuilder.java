package com.microsoft.graph.subscribedskus;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SubscribedSku;
import com.microsoft.graph.models.SubscribedSkuCollectionResponse;
import com.microsoft.graph.subscribedskus.item.SubscribedSkuItemRequestBuilder;
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
 * Provides operations to manage the collection of subscribedSku entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscribedSkusRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     * @param subscribedSkuId The unique identifier of subscribedSku
     * @return a {@link SubscribedSkuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribedSkuItemRequestBuilder bySubscribedSkuId(@jakarta.annotation.Nonnull final String subscribedSkuId) {
        Objects.requireNonNull(subscribedSkuId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscribedSku%2Did", subscribedSkuId);
        return new SubscribedSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubscribedSkusRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscribedSkusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscribedSkus{?%24orderby,%24search,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SubscribedSkusRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscribedSkusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscribedSkus{?%24orderby,%24search,%24select}", rawUrl);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Microsoft Entra admin center or the Microsoft 365 admin center against their Microsoft Graph skuId and skuPartNumber properties, see Product names and service plan identifiers for licensing.
     * @return a {@link SubscribedSkuCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscribedsku-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SubscribedSkuCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Microsoft Entra admin center or the Microsoft 365 admin center against their Microsoft Graph skuId and skuPartNumber properties, see Product names and service plan identifiers for licensing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscribedSkuCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscribedsku-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SubscribedSkuCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscribedSkuCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @return a {@link SubscribedSku}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SubscribedSku post(@jakarta.annotation.Nonnull final SubscribedSku body) {
        return post(body, null);
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscribedSku}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SubscribedSku post(@jakarta.annotation.Nonnull final SubscribedSku body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscribedSku::createFromDiscriminatorValue);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Microsoft Entra admin center or the Microsoft 365 admin center against their Microsoft Graph skuId and skuPartNumber properties, see Product names and service plan identifiers for licensing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Microsoft Entra admin center or the Microsoft 365 admin center against their Microsoft Graph skuId and skuPartNumber properties, see Product names and service plan identifiers for licensing.
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
     * Add new entity to subscribedSkus
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SubscribedSku body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SubscribedSku body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SubscribedSkusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribedSkusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubscribedSkusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Microsoft Entra admin center or the Microsoft 365 admin center against their Microsoft Graph skuId and skuPartNumber properties, see Product names and service plan identifiers for licensing.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
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
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24orderby", orderby);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
