package com.microsoft.graph.identity;

import com.microsoft.graph.identity.apiconnectors.ApiConnectorsRequestBuilder;
import com.microsoft.graph.identity.authenticationeventlisteners.AuthenticationEventListenersRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.B2xUserFlowsRequestBuilder;
import com.microsoft.graph.identity.conditionalaccess.ConditionalAccessRequestBuilder;
import com.microsoft.graph.identity.customauthenticationextensions.CustomAuthenticationExtensionsRequestBuilder;
import com.microsoft.graph.identity.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identity.userflowattributes.UserFlowAttributesRequestBuilder;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the identityContainer singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the apiConnectors property of the microsoft.graph.identityContainer entity.
     * @return a {@link ApiConnectorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApiConnectorsRequestBuilder apiConnectors() {
        return new ApiConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationEventListeners property of the microsoft.graph.identityContainer entity.
     * @return a {@link AuthenticationEventListenersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationEventListenersRequestBuilder authenticationEventListeners() {
        return new AuthenticationEventListenersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the b2xUserFlows property of the microsoft.graph.identityContainer entity.
     * @return a {@link B2xUserFlowsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public B2xUserFlowsRequestBuilder b2xUserFlows() {
        return new B2xUserFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The conditionalAccess property
     * @return a {@link ConditionalAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConditionalAccessRequestBuilder conditionalAccess() {
        return new ConditionalAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customAuthenticationExtensions property of the microsoft.graph.identityContainer entity.
     * @return a {@link CustomAuthenticationExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomAuthenticationExtensionsRequestBuilder customAuthenticationExtensions() {
        return new CustomAuthenticationExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityProviders property of the microsoft.graph.identityContainer entity.
     * @return a {@link IdentityProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userFlowAttributes property of the microsoft.graph.identityContainer entity.
     * @return a {@link UserFlowAttributesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserFlowAttributesRequestBuilder userFlowAttributes() {
        return new UserFlowAttributesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IdentityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link IdentityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get identity
     * @return a {@link IdentityContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityContainer get() {
        return get(null);
    }
    /**
     * Get identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityContainer get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityContainer::createFromDiscriminatorValue);
    }
    /**
     * Update identity
     * @param body The request body
     * @return a {@link IdentityContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityContainer patch(@jakarta.annotation.Nonnull final IdentityContainer body) {
        return patch(body, null);
    }
    /**
     * Update identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityContainer patch(@jakarta.annotation.Nonnull final IdentityContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityContainer::createFromDiscriminatorValue);
    }
    /**
     * Get identity
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update identity
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityContainer body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link IdentityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IdentityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get identity
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
