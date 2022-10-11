package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoverySearch;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.additionalsources.AdditionalSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.addtoreviewsetoperation.AddToReviewSetOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.custodiansources.CustodianSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.custodiansources.item.DataSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.estimatestatistics.EstimateStatisticsRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.lastestimatestatisticsoperation.LastEstimateStatisticsOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.noncustodialsources.item.EdiscoveryNoncustodialDataSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.noncustodialsources.NoncustodialSourcesRequestBuilder;
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
/** Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity. */
public class EdiscoverySearchItemRequestBuilder {
    /** The additionalSources property */
    @javax.annotation.Nonnull
    public AdditionalSourcesRequestBuilder additionalSources() {
        return new AdditionalSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The addToReviewSetOperation property */
    @javax.annotation.Nonnull
    public AddToReviewSetOperationRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The custodianSources property */
    @javax.annotation.Nonnull
    public CustodianSourcesRequestBuilder custodianSources() {
        return new CustodianSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The estimateStatistics property */
    @javax.annotation.Nonnull
    public EstimateStatisticsRequestBuilder estimateStatistics() {
        return new EstimateStatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The lastEstimateStatisticsOperation property */
    @javax.annotation.Nonnull
    public LastEstimateStatisticsOperationRequestBuilder lastEstimateStatisticsOperation() {
        return new LastEstimateStatisticsOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The noncustodialSources property */
    @javax.annotation.Nonnull
    public NoncustodialSourcesRequestBuilder noncustodialSources() {
        return new NoncustodialSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.Microsoft.Graph.security.cases.ediscoveryCases.item.searches.item.additionalSources.item collection
     * @param id Unique identifier of the item
     * @return a DataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.additionalsources.item.DataSourceItemRequestBuilder additionalSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataSource%2Did", id);
        return new com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.additionalsources.item.DataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EdiscoverySearchItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoverySearchItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches/{ediscoverySearch%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EdiscoverySearchItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoverySearchItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches/{ediscoverySearch%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property searches for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property searches for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration requestConfig = new EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of eDiscoverySearch objects associated with this case.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Returns a list of eDiscoverySearch objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final EdiscoverySearchItemRequestBuilderGetRequestConfiguration requestConfig = new EdiscoverySearchItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property searches in security
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoverySearch body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property searches in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoverySearch body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EdiscoverySearchItemRequestBuilderPatchRequestConfiguration requestConfig = new EdiscoverySearchItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.security.cases.ediscoveryCases.item.searches.item.custodianSources.item collection
     * @param id Unique identifier of the item
     * @return a DataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.custodiansources.item.DataSourceItemRequestBuilder custodianSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataSource%2Did", id);
        return new com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.custodiansources.item.DataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property searches for security
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property searches for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Returns a list of eDiscoverySearch objects associated with this case.
     * @return a CompletableFuture of ediscoverySearch
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoverySearch>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Returns a list of eDiscoverySearch objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoverySearch
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> get(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoverySearch>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.security.cases.ediscoveryCases.item.searches.item.noncustodialSources.item collection
     * @param id Unique identifier of the item
     * @return a EdiscoveryNoncustodialDataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryNoncustodialDataSourceItemRequestBuilder noncustodialSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryNoncustodialDataSource%2Did", id);
        return new EdiscoveryNoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property searches in security
     * @param body 
     * @return a CompletableFuture of ediscoverySearch
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> patch(@javax.annotation.Nonnull final EdiscoverySearch body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoverySearch>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property searches in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoverySearch
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> patch(@javax.annotation.Nonnull final EdiscoverySearch body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoverySearchItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoverySearch>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoverySearchItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Returns a list of eDiscoverySearch objects associated with this case. */
    public class EdiscoverySearchItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoverySearchItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EdiscoverySearchItemRequestBuilderGetQueryParameters queryParameters = new EdiscoverySearchItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new EdiscoverySearchItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoverySearchItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoverySearchItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoverySearchItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoverySearchItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
