package com.microsoft.graph.identitygovernance.entitlementmanagement;

import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.AccessPackageAssignmentApprovalsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignmentapprovals.item.ApprovalItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.AccessPackagesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.AccessPackageItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentpolicies.AssignmentPoliciesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentpolicies.item.AccessPackageAssignmentPolicyItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.AssignmentRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.item.AccessPackageAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.AccessPackageAssignmentItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.CatalogsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.AccessPackageCatalogItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.ConnectedOrganizationsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.item.ConnectedOrganizationItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.settings.SettingsRequestBuilder;
import com.microsoft.graph.models.EntitlementManagement;
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
/** Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity. */
public class EntitlementManagementRequestBuilder {
    /** Provides operations to manage the accessPackageAssignmentApprovals property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentApprovalsRequestBuilder accessPackageAssignmentApprovals() {
        return new AccessPackageAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the accessPackages property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public AccessPackagesRequestBuilder accessPackages() {
        return new AccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentPolicies property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public AssignmentPoliciesRequestBuilder assignmentPolicies() {
        return new AssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public AssignmentRequestsRequestBuilder assignmentRequests() {
        return new AssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the catalogs property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public CatalogsRequestBuilder catalogs() {
        return new CatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the connectedOrganizations property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public ConnectedOrganizationsRequestBuilder connectedOrganizations() {
        return new ConnectedOrganizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the settings property of the microsoft.graph.entitlementManagement entity. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the accessPackageAssignmentApprovals property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a ApprovalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApprovalItemRequestBuilder accessPackageAssignmentApprovals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("approval%2Did", id);
        return new ApprovalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackages property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageItemRequestBuilder accessPackages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did", id);
        return new AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentPolicies property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageAssignmentPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentPolicyItemRequestBuilder assignmentPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentPolicy%2Did", id);
        return new AccessPackageAssignmentPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageAssignmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentRequestItemRequestBuilder assignmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentRequest%2Did", id);
        return new AccessPackageAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignment%2Did", id);
        return new AccessPackageAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the catalogs property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageCatalogItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageCatalogItemRequestBuilder catalogs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageCatalog%2Did", id);
        return new AccessPackageCatalogItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the connectedOrganizations property of the microsoft.graph.entitlementManagement entity.
     * @param id Unique identifier of the item
     * @return a ConnectedOrganizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConnectedOrganizationItemRequestBuilder connectedOrganizations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connectedOrganization%2Did", id);
        return new ConnectedOrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
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
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EntitlementManagement body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EntitlementManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
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
     * Delete navigation property entitlementManagement for identityGovernance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property entitlementManagement for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @return a CompletableFuture of entitlementManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<EntitlementManagement> executionException = new java.util.concurrent.CompletableFuture<EntitlementManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entitlementManagement from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of entitlementManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<EntitlementManagement> executionException = new java.util.concurrent.CompletableFuture<EntitlementManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @return a CompletableFuture of entitlementManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> patch(@javax.annotation.Nonnull final EntitlementManagement body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<EntitlementManagement> executionException = new java.util.concurrent.CompletableFuture<EntitlementManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property entitlementManagement in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of entitlementManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> patch(@javax.annotation.Nonnull final EntitlementManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EntitlementManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<EntitlementManagement> executionException = new java.util.concurrent.CompletableFuture<EntitlementManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** Get entitlementManagement from identityGovernance */
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
