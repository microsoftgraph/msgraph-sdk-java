package com.microsoft.graph.policies.rolemanagementpolicies.item.rules.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRule;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;

import java.util.HashMap;
import java.util.Objects;
/**
 * Provides operations to manage the rules property of the microsoft.graph.unifiedRoleManagementPolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyRuleItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UnifiedRoleManagementPolicyRuleItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleManagementPolicyRuleItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicies/{unifiedRoleManagementPolicy%2Did}/rules/{unifiedRoleManagementPolicyRule%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UnifiedRoleManagementPolicyRuleItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleManagementPolicyRuleItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicies/{unifiedRoleManagementPolicy%2Did}/rules/{unifiedRoleManagementPolicyRule%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property rules for policies
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property rules for policies
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
     * Retrieve a rule or settings defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object:
     * @return a UnifiedRoleManagementPolicyRule
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedrolemanagementpolicyrule-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicyRule get() {
        return get(null);
    }
    /**
     * Retrieve a rule or settings defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object:
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UnifiedRoleManagementPolicyRule
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedrolemanagementpolicyrule-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicyRule get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue);
    }
    /**
     * Update a rule defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object: For more information about rules for Microsoft Entra roles and examples of updating rules, see the following articles:
     * @param body The request body
     * @return a UnifiedRoleManagementPolicyRule
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedrolemanagementpolicyrule-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicyRule patch(@jakarta.annotation.Nonnull final UnifiedRoleManagementPolicyRule body) {
        return patch(body, null);
    }
    /**
     * Update a rule defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object: For more information about rules for Microsoft Entra roles and examples of updating rules, see the following articles:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UnifiedRoleManagementPolicyRule
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedrolemanagementpolicyrule-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicyRule patch(@jakarta.annotation.Nonnull final UnifiedRoleManagementPolicyRule body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property rules for policies
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property rules for policies
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
     * Retrieve a rule or settings defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object:
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a rule or settings defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object:
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
     * Update a rule defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object: For more information about rules for Microsoft Entra roles and examples of updating rules, see the following articles:
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleManagementPolicyRule body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a rule defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object: For more information about rules for Microsoft Entra roles and examples of updating rules, see the following articles:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleManagementPolicyRule body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a UnifiedRoleManagementPolicyRuleItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedRoleManagementPolicyRuleItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UnifiedRoleManagementPolicyRuleItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve a rule or settings defined for a role management policy. The rule can be one of the following types that are derived from the unifiedRoleManagementPolicyRule object:
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
