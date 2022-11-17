package com.microsoft.graph.identity;

import com.microsoft.graph.identity.apiconnectors.ApiConnectorsRequestBuilder;
import com.microsoft.graph.identity.apiconnectors.item.IdentityApiConnectorItemRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.B2xUserFlowsRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.B2xIdentityUserFlowItemRequestBuilder;
import com.microsoft.graph.identity.conditionalaccess.ConditionalAccessRequestBuilder;
import com.microsoft.graph.identity.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identity.identityproviders.item.IdentityProviderBaseItemRequestBuilder;
import com.microsoft.graph.identity.userflowattributes.item.IdentityUserFlowAttributeItemRequestBuilder;
import com.microsoft.graph.identity.userflowattributes.UserFlowAttributesRequestBuilder;
import com.microsoft.graph.models.IdentityContainer;
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
/** Provides operations to manage the identityContainer singleton. */
public class IdentityRequestBuilder {
    /** Provides operations to manage the apiConnectors property of the microsoft.graph.identityContainer entity. */
    @javax.annotation.Nonnull
    public ApiConnectorsRequestBuilder apiConnectors() {
        return new ApiConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the b2xUserFlows property of the microsoft.graph.identityContainer entity. */
    @javax.annotation.Nonnull
    public B2xUserFlowsRequestBuilder b2xUserFlows() {
        return new B2xUserFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the conditionalAccess property of the microsoft.graph.identityContainer entity. */
    @javax.annotation.Nonnull
    public ConditionalAccessRequestBuilder conditionalAccess() {
        return new ConditionalAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the identityProviders property of the microsoft.graph.identityContainer entity. */
    @javax.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userFlowAttributes property of the microsoft.graph.identityContainer entity. */
    @javax.annotation.Nonnull
    public UserFlowAttributesRequestBuilder userFlowAttributes() {
        return new UserFlowAttributesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the apiConnectors property of the microsoft.graph.identityContainer entity.
     * @param id Unique identifier of the item
     * @return a IdentityApiConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityApiConnectorItemRequestBuilder apiConnectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityApiConnector%2Did", id);
        return new IdentityApiConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the b2xUserFlows property of the microsoft.graph.identityContainer entity.
     * @param id Unique identifier of the item
     * @return a B2xIdentityUserFlowItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public B2xIdentityUserFlowItemRequestBuilder b2xUserFlows(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("b2xIdentityUserFlow%2Did", id);
        return new B2xIdentityUserFlowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IdentityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identity{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new IdentityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identity{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get identity
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update identity
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final IdentityContainer body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update identity
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final IdentityContainer body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get identity
     * @return a CompletableFuture of identityContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of identityContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the identityProviders property of the microsoft.graph.identityContainer entity.
     * @param id Unique identifier of the item
     * @return a IdentityProviderBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderBaseItemRequestBuilder identityProviders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProviderBase%2Did", id);
        return new IdentityProviderBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update identity
     * @param body 
     * @return a CompletableFuture of identityContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> patch(@javax.annotation.Nonnull final IdentityContainer body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update identity
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of identityContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> patch(@javax.annotation.Nonnull final IdentityContainer body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the userFlowAttributes property of the microsoft.graph.identityContainer entity.
     * @param id Unique identifier of the item
     * @return a IdentityUserFlowAttributeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityUserFlowAttributeItemRequestBuilder userFlowAttributes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityUserFlowAttribute%2Did", id);
        return new IdentityUserFlowAttributeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get identity */
    public class GetQueryParameters {
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
