package com.microsoft.graph.policies.crosstenantaccesspolicy.defaultescaped;

import com.microsoft.graph.models.CrossTenantAccessPolicyConfigurationDefault;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.policies.crosstenantaccesspolicy.defaultescaped.resettosystemdefault.ResetToSystemDefaultRequestBuilder;
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
 * Provides operations to manage the default property of the microsoft.graph.crossTenantAccessPolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DefaultRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the resetToSystemDefault method.
     */
    @jakarta.annotation.Nonnull
    public ResetToSystemDefaultRequestBuilder resetToSystemDefault() {
        return new ResetToSystemDefaultRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DefaultRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DefaultRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/crossTenantAccessPolicy/default{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DefaultRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DefaultRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/crossTenantAccessPolicy/default{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property default for policies
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property default for policies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the default configuration of a cross-tenant access policy. This default configuration may be the service default assigned by Microsoft Entra ID (isServiceDefault is true) or may be customized in your tenant (isServiceDefault is false). This API is available in the following national cloud deployments.
     * @return a CrossTenantAccessPolicyConfigurationDefault
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantaccesspolicyconfigurationdefault-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault get() {
        return get(null);
    }
    /**
     * Read the default configuration of a cross-tenant access policy. This default configuration may be the service default assigned by Microsoft Entra ID (isServiceDefault is true) or may be customized in your tenant (isServiceDefault is false). This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CrossTenantAccessPolicyConfigurationDefault
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantaccesspolicyconfigurationdefault-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantAccessPolicyConfigurationDefault::createFromDiscriminatorValue);
    }
    /**
     * Update the default configuration of a cross-tenant access policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CrossTenantAccessPolicyConfigurationDefault
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantaccesspolicyconfigurationdefault-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault patch(@jakarta.annotation.Nonnull final CrossTenantAccessPolicyConfigurationDefault body) {
        return patch(body, null);
    }
    /**
     * Update the default configuration of a cross-tenant access policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CrossTenantAccessPolicyConfigurationDefault
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantaccesspolicyconfigurationdefault-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault patch(@jakarta.annotation.Nonnull final CrossTenantAccessPolicyConfigurationDefault body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantAccessPolicyConfigurationDefault::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property default for policies
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property default for policies
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
     * Read the default configuration of a cross-tenant access policy. This default configuration may be the service default assigned by Microsoft Entra ID (isServiceDefault is true) or may be customized in your tenant (isServiceDefault is false). This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the default configuration of a cross-tenant access policy. This default configuration may be the service default assigned by Microsoft Entra ID (isServiceDefault is true) or may be customized in your tenant (isServiceDefault is false). This API is available in the following national cloud deployments.
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
     * Update the default configuration of a cross-tenant access policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CrossTenantAccessPolicyConfigurationDefault body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the default configuration of a cross-tenant access policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CrossTenantAccessPolicyConfigurationDefault body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a DefaultRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DefaultRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DefaultRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the default configuration of a cross-tenant access policy. This default configuration may be the service default assigned by Microsoft Entra ID (isServiceDefault is true) or may be customized in your tenant (isServiceDefault is false). This API is available in the following national cloud deployments.
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
