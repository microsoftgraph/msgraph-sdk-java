package com.microsoft.graph.directory;

import com.microsoft.graph.directory.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.AdministrativeUnitItemRequestBuilder;
import com.microsoft.graph.directory.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.directory.deleteditems.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.directory.federationconfigurations.FederationConfigurationsRequestBuilder;
import com.microsoft.graph.directory.federationconfigurations.item.IdentityProviderBaseItemRequestBuilder;
import com.microsoft.graph.models.Directory;
import com.microsoft.graph.models.odataerrors.ODataError;
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
/** Provides operations to manage the directory singleton. */
public class DirectoryRequestBuilder {
    /** Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deletedItems property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity. */
    @javax.annotation.Nonnull
    public FederationConfigurationsRequestBuilder federationConfigurations() {
        return new FederationConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a AdministrativeUnitItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AdministrativeUnitItemRequestBuilder administrativeUnits(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("administrativeUnit%2Did", id);
        return new AdministrativeUnitItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get directory
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderGetRequestConfiguration requestConfig = new DirectoryRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update directory
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Directory body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update directory
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderPatchRequestConfiguration requestConfig = new DirectoryRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder deletedItems(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity.
     * @param id Unique identifier of the item
     * @return a IdentityProviderBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderBaseItemRequestBuilder federationConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProviderBase%2Did", id);
        return new IdentityProviderBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get directory
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Directory>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Directory>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update directory
     * @param body 
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@javax.annotation.Nonnull final Directory body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Directory>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update directory
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Directory>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Get directory */
    public class DirectoryRequestBuilderGetQueryParameters {
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
    public class DirectoryRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DirectoryRequestBuilderGetQueryParameters queryParameters = new DirectoryRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new directoryRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DirectoryRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new directoryRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DirectoryRequestBuilderPatchRequestConfiguration() {
        }
    }
}
