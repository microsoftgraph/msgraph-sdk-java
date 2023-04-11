package com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item;

import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.accesspackagesincompatiblewith.AccessPackagesIncompatibleWithRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.assignmentpolicies.AssignmentPoliciesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.assignmentpolicies.item.AccessPackageAssignmentPolicyItemRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.catalog.CatalogRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.getapplicablepolicyrequirements.GetApplicablePolicyRequirementsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.incompatibleaccesspackages.IncompatibleAccessPackagesRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.incompatiblegroups.IncompatibleGroupsRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.incompatiblegroups.item.GroupItemRequestBuilder;
import com.microsoft.graph.models.AccessPackage;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the accessPackages property of the microsoft.graph.accessPackageCatalog entity.
 */
public class AccessPackageItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the accessPackagesIncompatibleWith property of the microsoft.graph.accessPackage entity. */
    @javax.annotation.Nonnull
    public AccessPackagesIncompatibleWithRequestBuilder accessPackagesIncompatibleWith() {
        return new AccessPackagesIncompatibleWithRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentPolicies property of the microsoft.graph.accessPackage entity. */
    @javax.annotation.Nonnull
    public AssignmentPoliciesRequestBuilder assignmentPolicies() {
        return new AssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the catalog property of the microsoft.graph.accessPackage entity. */
    @javax.annotation.Nonnull
    public CatalogRequestBuilder catalog() {
        return new CatalogRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getApplicablePolicyRequirements method. */
    @javax.annotation.Nonnull
    public GetApplicablePolicyRequirementsRequestBuilder getApplicablePolicyRequirements() {
        return new GetApplicablePolicyRequirementsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the incompatibleAccessPackages property of the microsoft.graph.accessPackage entity. */
    @javax.annotation.Nonnull
    public IncompatibleAccessPackagesRequestBuilder incompatibleAccessPackages() {
        return new IncompatibleAccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the incompatibleGroups property of the microsoft.graph.accessPackage entity. */
    @javax.annotation.Nonnull
    public IncompatibleGroupsRequestBuilder incompatibleGroups() {
        return new IncompatibleGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the accessPackagesIncompatibleWith property of the microsoft.graph.accessPackage entity.
     * @param id Unique identifier of the item
     * @return a AccessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.accesspackagesincompatiblewith.item.AccessPackageItemRequestBuilder accessPackagesIncompatibleWith(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did1", id);
        return new com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.accesspackagesincompatiblewith.item.AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentPolicies property of the microsoft.graph.accessPackage entity.
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
     * Instantiates a new AccessPackageItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/catalogs/{accessPackageCatalog%2Did}/accessPackages/{accessPackage%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AccessPackageItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/catalogs/{accessPackageCatalog%2Did}/accessPackages/{accessPackage%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property accessPackages for identityGovernance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property accessPackages for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The access packages in this catalog. Read-only. Nullable.
     * @return a CompletableFuture of accessPackage
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackage> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessPackage> executionException = new java.util.concurrent.CompletableFuture<AccessPackage>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The access packages in this catalog. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackage
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackage> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessPackage> executionException = new java.util.concurrent.CompletableFuture<AccessPackage>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.entitlementManagement.catalogs.item.accessPackages.item.incompatibleAccessPackages.item collection
     * @param id Unique identifier of the item
     * @return a AccessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.incompatibleaccesspackages.item.AccessPackageItemRequestBuilder incompatibleAccessPackages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did1", id);
        return new com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.accesspackages.item.incompatibleaccesspackages.item.AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.entitlementManagement.catalogs.item.accessPackages.item.incompatibleGroups.item collection
     * @param id Unique identifier of the item
     * @return a GroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder incompatibleGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property accessPackages in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of accessPackage
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackage> patch(@javax.annotation.Nonnull final AccessPackage body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessPackage> executionException = new java.util.concurrent.CompletableFuture<AccessPackage>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property accessPackages in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackage
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackage> patch(@javax.annotation.Nonnull final AccessPackage body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessPackage> executionException = new java.util.concurrent.CompletableFuture<AccessPackage>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property accessPackages for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property accessPackages for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * The access packages in this catalog. Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The access packages in this catalog. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the navigation property accessPackages in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccessPackage body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property accessPackages in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccessPackage body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * The access packages in this catalog. Read-only. Nullable.
     */
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
