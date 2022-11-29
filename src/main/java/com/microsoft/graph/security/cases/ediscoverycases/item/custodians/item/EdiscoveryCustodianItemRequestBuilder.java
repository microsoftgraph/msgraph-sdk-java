package com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryCustodian;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.activate.ActivateRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.applyhold.ApplyHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.lastindexoperation.LastIndexOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.release.ReleaseRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.removehold.RemoveHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.sitesources.item.SiteSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.sitesources.SiteSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources.item.UnifiedGroupSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources.UnifiedGroupSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.updateindex.UpdateIndexRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.usersources.item.UserSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.usersources.UserSourcesRequestBuilder;
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
/** Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity. */
public class EdiscoveryCustodianItemRequestBuilder {
    /** Provides operations to call the activate method. */
    @javax.annotation.Nonnull
    public ActivateRequestBuilder activate() {
        return new ActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyHold method. */
    @javax.annotation.Nonnull
    public ApplyHoldRequestBuilder applyHold() {
        return new ApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the lastIndexOperation property of the microsoft.graph.security.ediscoveryCustodian entity. */
    @javax.annotation.Nonnull
    public LastIndexOperationRequestBuilder lastIndexOperation() {
        return new LastIndexOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the release method. */
    @javax.annotation.Nonnull
    public ReleaseRequestBuilder release() {
        return new ReleaseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the removeHold method. */
    @javax.annotation.Nonnull
    public RemoveHoldRequestBuilder removeHold() {
        return new RemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the siteSources property of the microsoft.graph.security.ediscoveryCustodian entity. */
    @javax.annotation.Nonnull
    public SiteSourcesRequestBuilder siteSources() {
        return new SiteSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the unifiedGroupSources property of the microsoft.graph.security.ediscoveryCustodian entity. */
    @javax.annotation.Nonnull
    public UnifiedGroupSourcesRequestBuilder unifiedGroupSources() {
        return new UnifiedGroupSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the updateIndex method. */
    @javax.annotation.Nonnull
    public UpdateIndexRequestBuilder updateIndex() {
        return new UpdateIndexRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userSources property of the microsoft.graph.security.ediscoveryCustodian entity. */
    @javax.annotation.Nonnull
    public UserSourcesRequestBuilder userSources() {
        return new UserSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EdiscoveryCustodianItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCustodianItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EdiscoveryCustodianItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCustodianItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property custodians for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property custodians for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration requestConfig = new EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of case ediscoveryCustodian objects for this case.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Returns a list of case ediscoveryCustodian objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration requestConfig = new EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property custodians in security
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryCustodian body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property custodians in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryCustodian body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration requestConfig = new EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property custodians for security
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
     * Delete navigation property custodians for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Returns a list of case ediscoveryCustodian objects for this case.
     * @return a CompletableFuture of ediscoveryCustodian
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Returns a list of case ediscoveryCustodian objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryCustodian
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> get(@javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property custodians in security
     * @param body 
     * @return a CompletableFuture of ediscoveryCustodian
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> patch(@javax.annotation.Nonnull final EdiscoveryCustodian body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property custodians in security
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryCustodian
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> patch(@javax.annotation.Nonnull final EdiscoveryCustodian body, @javax.annotation.Nullable final java.util.function.Consumer<EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the siteSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @param id Unique identifier of the item
     * @return a SiteSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteSourceItemRequestBuilder siteSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("siteSource%2Did", id);
        return new SiteSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the unifiedGroupSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @param id Unique identifier of the item
     * @return a UnifiedGroupSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedGroupSourceItemRequestBuilder unifiedGroupSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedGroupSource%2Did", id);
        return new UnifiedGroupSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the userSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @param id Unique identifier of the item
     * @return a UserSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserSourceItemRequestBuilder userSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userSource%2Did", id);
        return new UserSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryCustodianItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Returns a list of case ediscoveryCustodian objects for this case. */
    public class EdiscoveryCustodianItemRequestBuilderGetQueryParameters {
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
    public class EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EdiscoveryCustodianItemRequestBuilderGetQueryParameters queryParameters = new EdiscoveryCustodianItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryCustodianItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EdiscoveryCustodianItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
