package com.microsoft.graph.rolemanagement.entitlementmanagement;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RbacApplication;
import com.microsoft.graph.rolemanagement.entitlementmanagement.resourcenamespaces.ResourceNamespacesRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentscheduleinstances.RoleAssignmentScheduleInstancesRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedulerequests.RoleAssignmentScheduleRequestsRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.RoleAssignmentSchedulesRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.RoleEligibilityScheduleInstancesRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.RoleEligibilityScheduleRequestsRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.RoleEligibilitySchedulesRequestBuilder;
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
 * Provides operations to manage the entitlementManagement property of the microsoft.graph.roleManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the resourceNamespaces property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public ResourceNamespacesRequestBuilder resourceNamespaces() {
        return new ResourceNamespacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentScheduleInstances property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentScheduleInstancesRequestBuilder roleAssignmentScheduleInstances() {
        return new RoleAssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentScheduleRequests property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentScheduleRequestsRequestBuilder roleAssignmentScheduleRequests() {
        return new RoleAssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentSchedules property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentSchedulesRequestBuilder roleAssignmentSchedules() {
        return new RoleAssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinitions property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilityScheduleInstances property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilityScheduleInstancesRequestBuilder roleEligibilityScheduleInstances() {
        return new RoleEligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilityScheduleRequests property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilityScheduleRequestsRequestBuilder roleEligibilityScheduleRequests() {
        return new RoleEligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilitySchedules property of the microsoft.graph.rbacApplication entity.
     */
    @jakarta.annotation.Nonnull
    public RoleEligibilitySchedulesRequestBuilder roleEligibilitySchedules() {
        return new RoleEligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EntitlementManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @return a CompletableFuture of RbacApplication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RbacApplication> get() {
        return get(null);
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of RbacApplication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RbacApplication> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @return a CompletableFuture of RbacApplication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RbacApplication> patch(@jakarta.annotation.Nonnull final RbacApplication body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of RbacApplication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RbacApplication> patch(@jakarta.annotation.Nonnull final RbacApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json, application/json");
        return requestInfo;
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RbacApplication body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RbacApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a EntitlementManagementRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EntitlementManagementRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EntitlementManagementRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Container for roles and assignments for entitlement management resources.
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
