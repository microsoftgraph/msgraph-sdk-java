package com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.UnifiedGroupSource;
import com.microsoft.graph.models.security.UnifiedGroupSourceCollectionResponse;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources.count.CountRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources.item.UnifiedGroupSourceItemRequestBuilder;
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
 * Provides operations to manage the unifiedGroupSources property of the microsoft.graph.security.ediscoveryCustodian entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedGroupSourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the unifiedGroupSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @param unifiedGroupSourceId The unique identifier of unifiedGroupSource
     * @return a UnifiedGroupSourceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedGroupSourceItemRequestBuilder byUnifiedGroupSourceId(@jakarta.annotation.Nonnull final String unifiedGroupSourceId) {
        Objects.requireNonNull(unifiedGroupSourceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedGroupSource%2Did", unifiedGroupSourceId);
        return new UnifiedGroupSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UnifiedGroupSourcesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedGroupSourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}/unifiedGroupSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UnifiedGroupSourcesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedGroupSourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}/unifiedGroupSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of the unifiedGroupSource objects associated with an ediscoveryCustodian.
     * @return a CompletableFuture of unifiedGroupSourceCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-list-unifiedgroupsources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSourceCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get a list of the unifiedGroupSource objects associated with an ediscoveryCustodian.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedGroupSourceCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-list-unifiedgroupsources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSourceCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedGroupSourceCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new unifiedGroupSource object associated with an eDiscovery custodian.
     * @param body The request body
     * @return a CompletableFuture of unifiedGroupSource
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-post-unifiedgroupsources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> post(@jakarta.annotation.Nonnull final UnifiedGroupSource body) {
        return post(body, null);
    }
    /**
     * Create a new unifiedGroupSource object associated with an eDiscovery custodian.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedGroupSource
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-post-unifiedgroupsources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> post(@jakarta.annotation.Nonnull final UnifiedGroupSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedGroupSource::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a list of the unifiedGroupSource objects associated with an ediscoveryCustodian.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the unifiedGroupSource objects associated with an ediscoveryCustodian.
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
     * Create a new unifiedGroupSource object associated with an eDiscovery custodian.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedGroupSource body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new unifiedGroupSource object associated with an eDiscovery custodian.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedGroupSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a unifiedGroupSourcesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedGroupSourcesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UnifiedGroupSourcesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the unifiedGroupSource objects associated with an ediscoveryCustodian.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
