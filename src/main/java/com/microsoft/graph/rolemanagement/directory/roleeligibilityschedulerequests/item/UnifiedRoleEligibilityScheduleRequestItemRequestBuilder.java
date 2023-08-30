package com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.appscope.AppScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.directoryscope.DirectoryScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.principal.PrincipalRequestBuilder;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.roledefinition.RoleDefinitionRequestBuilder;
import com.microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.targetschedule.TargetScheduleRequestBuilder;
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
 * Provides operations to manage the roleEligibilityScheduleRequests property of the microsoft.graph.rbacApplication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleEligibilityScheduleRequestItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appScope property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity.
     */
    @jakarta.annotation.Nonnull
    public AppScopeRequestBuilder appScope() {
        return new AppScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cancel method.
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directoryScope property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity.
     */
    @jakarta.annotation.Nonnull
    public DirectoryScopeRequestBuilder directoryScope() {
        return new DirectoryScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the principal property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity.
     */
    @jakarta.annotation.Nonnull
    public PrincipalRequestBuilder principal() {
        return new PrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinition property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity.
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionRequestBuilder roleDefinition() {
        return new RoleDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the targetSchedule property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity.
     */
    @jakarta.annotation.Nonnull
    public TargetScheduleRequestBuilder targetSchedule() {
        return new TargetScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequest%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequest%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
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
     * In PIM, read the details of a request for for a role eligibility request made through the unifiedRoleEligibilityScheduleRequest object.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleeligibilityschedulerequest-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> get() {
        return get(null);
    }
    /**
     * In PIM, read the details of a request for for a role eligibility request made through the unifiedRoleEligibilityScheduleRequest object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleeligibilityschedulerequest-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body The request body
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> patch(@jakarta.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> patch(@jakarta.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * In PIM, read the details of a request for for a role eligibility request made through the unifiedRoleEligibilityScheduleRequest object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In PIM, read the details of a request for for a role eligibility request made through the unifiedRoleEligibilityScheduleRequest object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UnifiedRoleEligibilityScheduleRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * In PIM, read the details of a request for for a role eligibility request made through the unifiedRoleEligibilityScheduleRequest object.
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
