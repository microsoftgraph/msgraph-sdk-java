package com.microsoft.graph.directory.administrativeunits;

import com.microsoft.graph.directory.administrativeunits.count.CountRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.delta.DeltaRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.AdministrativeUnitItemRequestBuilder;
import com.microsoft.graph.models.AdministrativeUnit;
import com.microsoft.graph.models.AdministrativeUnitCollectionResponse;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
 */
public class AdministrativeUnitsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
     * @param administrativeUnitId Unique identifier of the item
     * @return a AdministrativeUnitItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AdministrativeUnitItemRequestBuilder byAdministrativeUnitId(@javax.annotation.Nonnull final String administrativeUnitId) {
        Objects.requireNonNull(administrativeUnitId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("administrativeUnit%2Did", administrativeUnitId);
        return new AdministrativeUnitItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AdministrativeUnitsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdministrativeUnitsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AdministrativeUnitsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdministrativeUnitsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of administrativeUnit objects.
     * @return a CompletableFuture of AdministrativeUnitCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/directory-list-administrativeunits?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdministrativeUnitCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve a list of administrativeUnit objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AdministrativeUnitCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/directory-list-administrativeunits?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdministrativeUnitCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<AdministrativeUnitCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Use this API to create a new administrativeUnit.
     * @param body The request body
     * @return a CompletableFuture of administrativeUnit
     * @see <a href="https://docs.microsoft.com/graph/api/directory-post-administrativeunits?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> post(@javax.annotation.Nonnull final AdministrativeUnit body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdministrativeUnit::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdministrativeUnit> executionException = new java.util.concurrent.CompletableFuture<AdministrativeUnit>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Use this API to create a new administrativeUnit.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of administrativeUnit
     * @see <a href="https://docs.microsoft.com/graph/api/directory-post-administrativeunits?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> post(@javax.annotation.Nonnull final AdministrativeUnit body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AdministrativeUnit::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AdministrativeUnit> executionException = new java.util.concurrent.CompletableFuture<AdministrativeUnit>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve a list of administrativeUnit objects.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of administrativeUnit objects.
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
     * Use this API to create a new administrativeUnit.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AdministrativeUnit body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this API to create a new administrativeUnit.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final AdministrativeUnit body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Retrieve a list of administrativeUnit objects.
     */
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
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
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
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
