package com.microsoft.graph.sites;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SiteCollectionResponse;
import com.microsoft.graph.sites.add.AddRequestBuilder;
import com.microsoft.graph.sites.count.CountRequestBuilder;
import com.microsoft.graph.sites.getallsites.GetAllSitesRequestBuilder;
import com.microsoft.graph.sites.item.SiteItemRequestBuilder;
import com.microsoft.graph.sites.remove.RemoveRequestBuilder;
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
 * Provides operations to manage the collection of site entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SitesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the add method.
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllSites method.
     */
    @jakarta.annotation.Nonnull
    public GetAllSitesRequestBuilder getAllSites() {
        return new GetAllSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the remove method.
     */
    @jakarta.annotation.Nonnull
    public RemoveRequestBuilder remove() {
        return new RemoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     * @param siteId The unique identifier of site
     * @return a SiteItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SiteItemRequestBuilder bySiteId(@jakarta.annotation.Nonnull final String siteId) {
        Objects.requireNonNull(siteId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", siteId);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SitesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SitesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SitesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SitesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Search across a SharePoint tenant for [sites][] that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @return a CompletableFuture of siteCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/site-search?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SiteCollectionResponse> get() {
        return get(null);
    }
    /**
     * Search across a SharePoint tenant for [sites][] that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of siteCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/site-search?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SiteCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SiteCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Search across a SharePoint tenant for [sites][] that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Search across a SharePoint tenant for [sites][] that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
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
     * Search across a SharePoint tenant for [sites][] that match keywords provided. The only property that works for sorting is createdDateTime. The search filter is a free text search that uses multiple properties when retrieving the search results.
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
}
