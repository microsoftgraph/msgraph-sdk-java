package com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryNoncustodialDataSource;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.applyhold.ApplyHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.datasource.DataSourceRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.lastindexoperation.LastIndexOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.release.ReleaseRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.removehold.RemoveHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.updateindex.UpdateIndexRequestBuilder;
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
/** Provides operations to manage the noncustodialDataSources property of the microsoft.graph.security.ediscoveryCase entity. */
public class EdiscoveryNoncustodialDataSourceItemRequestBuilder {
    /** The applyHold property */
    @javax.annotation.Nonnull
    public ApplyHoldRequestBuilder applyHold() {
        return new ApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dataSource property */
    @javax.annotation.Nonnull
    public DataSourceRequestBuilder dataSource() {
        return new DataSourceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The lastIndexOperation property */
    @javax.annotation.Nonnull
    public LastIndexOperationRequestBuilder lastIndexOperation() {
        return new LastIndexOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The release property */
    @javax.annotation.Nonnull
    public ReleaseRequestBuilder release() {
        return new ReleaseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The removeHold property */
    @javax.annotation.Nonnull
    public RemoveHoldRequestBuilder removeHold() {
        return new RemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The updateIndex property */
    @javax.annotation.Nonnull
    public UpdateIndexRequestBuilder updateIndex() {
        return new UpdateIndexRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new EdiscoveryNoncustodialDataSourceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryNoncustodialDataSourceItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/noncustodialDataSources/{ediscoveryNoncustodialDataSource%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EdiscoveryNoncustodialDataSourceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryNoncustodialDataSourceItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/noncustodialDataSources/{ediscoveryNoncustodialDataSource%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property noncustodialDataSources for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property noncustodialDataSources for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration requestConfig = new EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration requestConfig = new EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property noncustodialDataSources in security
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryNoncustodialDataSource body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property noncustodialDataSources in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryNoncustodialDataSource body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration requestConfig = new EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property noncustodialDataSources for security
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
     * Delete navigation property noncustodialDataSources for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @return a CompletableFuture of ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> get(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property noncustodialDataSources in security
     * @param body 
     * @return a CompletableFuture of ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> patch(@javax.annotation.Nonnull final EdiscoveryNoncustodialDataSource body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property noncustodialDataSources in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> patch(@javax.annotation.Nonnull final EdiscoveryNoncustodialDataSource body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryNoncustodialDataSourceItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Returns a list of case ediscoveryNoncustodialDataSource objects for this case. */
    public class EdiscoveryNoncustodialDataSourceItemRequestBuilderGetQueryParameters {
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
    public class EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EdiscoveryNoncustodialDataSourceItemRequestBuilderGetQueryParameters queryParameters = new EdiscoveryNoncustodialDataSourceItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryNoncustodialDataSourceItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryNoncustodialDataSourceItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
