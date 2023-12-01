package com.microsoft.graph.identity.b2xuserflows.item;

import com.microsoft.graph.identity.b2xuserflows.item.apiconnectorconfiguration.ApiConnectorConfigurationRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.languages.LanguagesRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.UserAttributeAssignmentsRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userflowidentityproviders.UserFlowIdentityProvidersRequestBuilder;
import com.microsoft.graph.models.B2xIdentityUserFlow;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the b2xUserFlows property of the microsoft.graph.identityContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2xIdentityUserFlowItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The apiConnectorConfiguration property
     */
    @jakarta.annotation.Nonnull
    public ApiConnectorConfigurationRequestBuilder apiConnectorConfiguration() {
        return new ApiConnectorConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityProviders property of the microsoft.graph.b2xIdentityUserFlow entity.
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the languages property of the microsoft.graph.b2xIdentityUserFlow entity.
     */
    @jakarta.annotation.Nonnull
    public LanguagesRequestBuilder languages() {
        return new LanguagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userAttributeAssignments property of the microsoft.graph.b2xIdentityUserFlow entity.
     */
    @jakarta.annotation.Nonnull
    public UserAttributeAssignmentsRequestBuilder userAttributeAssignments() {
        return new UserAttributeAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userFlowIdentityProviders property of the microsoft.graph.b2xIdentityUserFlow entity.
     */
    @jakarta.annotation.Nonnull
    public UserFlowIdentityProvidersRequestBuilder userFlowIdentityProviders() {
        return new UserFlowIdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new B2xIdentityUserFlowItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2xIdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new B2xIdentityUserFlowItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public B2xIdentityUserFlowItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @return a B2xIdentityUserFlow
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public B2xIdentityUserFlow get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2xIdentityUserFlow
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public B2xIdentityUserFlow get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2xIdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property b2xUserFlows in identity
     * @param body The request body
     * @return a B2xIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public B2xIdentityUserFlow patch(@jakarta.annotation.Nonnull final B2xIdentityUserFlow body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property b2xUserFlows in identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a B2xIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public B2xIdentityUserFlow patch(@jakarta.annotation.Nonnull final B2xIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, B2xIdentityUserFlow::createFromDiscriminatorValue);
    }
    /**
     * Delete a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property b2xUserFlows in identity
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final B2xIdentityUserFlow body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property b2xUserFlows in identity
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final B2xIdentityUserFlow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a B2xIdentityUserFlowItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public B2xIdentityUserFlowItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new B2xIdentityUserFlowItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a b2xIdentityUserFlow object. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
