package com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item;

import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.accesspackage.AccessPackageRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.assignmentpolicy.AssignmentPolicyRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.reprocess.ReprocessRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.target.TargetRequestBuilder;
import com.microsoft.graph.models.AccessPackageAssignment;
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
 * Provides operations to manage the assignments property of the microsoft.graph.entitlementManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessPackage property of the microsoft.graph.accessPackageAssignment entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageRequestBuilder accessPackage() {
        return new AccessPackageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentPolicy property of the microsoft.graph.accessPackageAssignment entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentPolicyRequestBuilder assignmentPolicy() {
        return new AssignmentPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprocess method.
     */
    @jakarta.annotation.Nonnull
    public ReprocessRequestBuilder reprocess() {
        return new ReprocessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the target property of the microsoft.graph.accessPackageAssignment entity.
     */
    @jakarta.annotation.Nonnull
    public TargetRequestBuilder target() {
        return new TargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AccessPackageAssignmentItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/{accessPackageAssignment%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AccessPackageAssignmentItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/{accessPackageAssignment%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property assignments for identityGovernance
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property assignments for identityGovernance
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
     * In Microsoft Entra entitlement management, retrieve the properties and relationships of an accessPackageAssignment object. This API is available in the following national cloud deployments.
     * @return a AccessPackageAssignment
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment get() {
        return get(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve the properties and relationships of an accessPackageAssignment object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessPackageAssignment
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignment::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property assignments in identityGovernance
     * @param body The request body
     * @return a AccessPackageAssignment
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment patch(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignments in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessPackageAssignment
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment patch(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignment::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property assignments for identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignments for identityGovernance
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
     * In Microsoft Entra entitlement management, retrieve the properties and relationships of an accessPackageAssignment object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve the properties and relationships of an accessPackageAssignment object. This API is available in the following national cloud deployments.
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
     * Update the navigation property assignments in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignments in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a AccessPackageAssignmentItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessPackageAssignmentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * In Microsoft Entra entitlement management, retrieve the properties and relationships of an accessPackageAssignment object. This API is available in the following national cloud deployments.
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
