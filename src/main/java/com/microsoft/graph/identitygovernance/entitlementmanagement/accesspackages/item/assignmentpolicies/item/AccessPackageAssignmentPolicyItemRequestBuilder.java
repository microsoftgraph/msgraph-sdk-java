package com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.assignmentpolicies.item;

import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.assignmentpolicies.item.accesspackage.AccessPackageRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.assignmentpolicies.item.catalog.CatalogRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.assignmentpolicies.item.customextensionstagesettings.CustomExtensionStageSettingsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.assignmentpolicies.item.questions.QuestionsRequestBuilder;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
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
 * Provides operations to manage the assignmentPolicies property of the microsoft.graph.accessPackage entity.
 */
public class AccessPackageAssignmentPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessPackage property of the microsoft.graph.accessPackageAssignmentPolicy entity.
     */
    @jakarta.annotation.Nonnull
    public AccessPackageRequestBuilder accessPackage() {
        return new AccessPackageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the catalog property of the microsoft.graph.accessPackageAssignmentPolicy entity.
     */
    @jakarta.annotation.Nonnull
    public CatalogRequestBuilder catalog() {
        return new CatalogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customExtensionStageSettings property of the microsoft.graph.accessPackageAssignmentPolicy entity.
     */
    @jakarta.annotation.Nonnull
    public CustomExtensionStageSettingsRequestBuilder customExtensionStageSettings() {
        return new CustomExtensionStageSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the questions property of the microsoft.graph.accessPackageAssignmentPolicy entity.
     */
    @jakarta.annotation.Nonnull
    public QuestionsRequestBuilder questions() {
        return new QuestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AccessPackageAssignmentPolicyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackages/{accessPackage%2Did}/assignmentPolicies/{accessPackageAssignmentPolicy%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AccessPackageAssignmentPolicyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessPackageAssignmentPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackages/{accessPackage%2Did}/assignmentPolicies/{accessPackageAssignmentPolicy%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property assignmentPolicies for identityGovernance
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property assignmentPolicies for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Read-only. Nullable. Supports $expand.
     * @return a CompletableFuture of accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentPolicy> get() {
        return get(null);
    }
    /**
     * Read-only. Nullable. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentPolicy> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageAssignmentPolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property assignmentPolicies in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentPolicy> patch(@jakarta.annotation.Nonnull final AccessPackageAssignmentPolicy body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignmentPolicies in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentPolicy> patch(@jakarta.annotation.Nonnull final AccessPackageAssignmentPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageAssignmentPolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property assignmentPolicies for identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignmentPolicies for identityGovernance
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
     * Read-only. Nullable. Supports $expand.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read-only. Nullable. Supports $expand.
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
     * Update the navigation property assignmentPolicies in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentPolicy body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignmentPolicies in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read-only. Nullable. Supports $expand.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
