package com.microsoft.graph.subscribedskus;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SubscribedSku;
import com.microsoft.graph.models.SubscribedSkuCollectionResponse;
import com.microsoft.graph.subscribedskus.item.SubscribedSkuItemRequestBuilder;
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
 * Provides operations to manage the collection of subscribedSku entities.
 */
public class SubscribedSkusRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     * @param subscribedSkuId Unique identifier of the item
     * @return a SubscribedSkuItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscribedSkuItemRequestBuilder bySubscribedSkuId(@javax.annotation.Nonnull final String subscribedSkuId) {
        Objects.requireNonNull(subscribedSkuId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscribedSku%2Did", subscribedSkuId);
        return new SubscribedSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SubscribedSkusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscribedSkusRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscribedSkus{?%24search,%24orderby,%24select}", pathParameters);
    }
    /**
     * Instantiates a new SubscribedSkusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubscribedSkusRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscribedSkus{?%24search,%24orderby,%24select}", rawUrl);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Azure portal or the Microsoft 365 admin center against their Microsoft Graph **skuId** and **skuPartNumber** properties, see Product names and service plan identifiers for licensing.
     * @return a CompletableFuture of SubscribedSkuCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/subscribedsku-list?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SubscribedSkuCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Azure portal or the Microsoft 365 admin center against their Microsoft Graph **skuId** and **skuPartNumber** properties, see Product names and service plan identifiers for licensing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SubscribedSkuCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/subscribedsku-list?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SubscribedSkuCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<SubscribedSkuCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @return a CompletableFuture of subscribedSku
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> post(@javax.annotation.Nonnull final SubscribedSku body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SubscribedSku::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SubscribedSku> executionException = new java.util.concurrent.CompletableFuture<SubscribedSku>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of subscribedSku
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> post(@javax.annotation.Nonnull final SubscribedSku body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SubscribedSku::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SubscribedSku> executionException = new java.util.concurrent.CompletableFuture<SubscribedSku>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Azure portal or the Microsoft 365 admin center against their Microsoft Graph **skuId** and **skuPartNumber** properties, see Product names and service plan identifiers for licensing.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Azure portal or the Microsoft 365 admin center against their Microsoft Graph **skuId** and **skuPartNumber** properties, see Product names and service plan identifiers for licensing.
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
     * Add new entity to subscribedSkus
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final SubscribedSku body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to subscribedSkus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final SubscribedSku body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the list of commercial subscriptions that an organization has acquired. For the mapping of license names as displayed on the Azure portal or the Microsoft 365 admin center against their Microsoft Graph **skuId** and **skuPartNumber** properties, see Product names and service plan identifiers for licensing.
     */
    public class GetQueryParameters {
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
