package com.microsoft.graph.sites.item.termstore;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.termstore.Store;
import com.microsoft.graph.sites.item.termstore.groups.GroupsRequestBuilder;
import com.microsoft.graph.sites.item.termstore.groups.item.GroupItemRequestBuilder;
import com.microsoft.graph.sites.item.termstore.sets.item.SetItemRequestBuilder;
import com.microsoft.graph.sites.item.termstore.sets.SetsRequestBuilder;
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
/** Provides operations to manage the termStore property of the microsoft.graph.site entity. */
public class TermStoreRequestBuilder {
    /** The groups property */
    @javax.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The sets property */
    @javax.annotation.Nonnull
    public SetsRequestBuilder sets() {
        return new SetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new TermStoreRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TermStoreRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/sites/{site%2Did}/termStore{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new TermStoreRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TermStoreRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/sites/{site%2Did}/termStore{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property termStore for sites
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property termStore for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TermStoreRequestBuilderDeleteRequestConfiguration requestConfig = new TermStoreRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a store object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a store object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final TermStoreRequestBuilderGetRequestConfiguration requestConfig = new TermStoreRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of a store object.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Store body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a store object.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Store body, @javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final TermStoreRequestBuilderPatchRequestConfiguration requestConfig = new TermStoreRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property termStore for sites
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
     * Delete navigation property termStore for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Read the properties and relationships of a store object.
     * @return a CompletableFuture of store
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Store> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Store::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Store>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Read the properties and relationships of a store object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of store
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Store> get(@javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Store::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Store>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.termStore.groups.item collection
     * @param id Unique identifier of the item
     * @return a GroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of a store object.
     * @param body 
     * @return a CompletableFuture of store
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Store> patch(@javax.annotation.Nonnull final Store body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Store::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Store>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the properties of a store object.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of store
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Store> patch(@javax.annotation.Nonnull final Store body, @javax.annotation.Nullable final java.util.function.Consumer<TermStoreRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Store::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Store>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.termStore.sets.item collection
     * @param id Unique identifier of the item
     * @return a SetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SetItemRequestBuilder sets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("set%2Did", id);
        return new SetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TermStoreRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new termStoreRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TermStoreRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Read the properties and relationships of a store object. */
    public class TermStoreRequestBuilderGetQueryParameters {
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
    public class TermStoreRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public TermStoreRequestBuilderGetQueryParameters queryParameters = new TermStoreRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new termStoreRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TermStoreRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TermStoreRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new termStoreRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TermStoreRequestBuilderPatchRequestConfiguration() {
        }
    }
}
