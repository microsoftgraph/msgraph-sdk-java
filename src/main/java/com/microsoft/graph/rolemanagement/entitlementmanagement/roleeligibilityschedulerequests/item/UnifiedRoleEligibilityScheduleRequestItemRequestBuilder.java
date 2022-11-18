package com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.appscope.AppScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.directoryscope.DirectoryScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.principal.PrincipalRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.roledefinition.RoleDefinitionRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.targetschedule.TargetScheduleRequestBuilder;
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
/** Provides operations to manage the roleEligibilityScheduleRequests property of the microsoft.graph.rbacApplication entity. */
public class UnifiedRoleEligibilityScheduleRequestItemRequestBuilder {
    /** Provides operations to manage the appScope property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity. */
    @javax.annotation.Nonnull
    public AppScopeRequestBuilder appScope() {
        return new AppScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the cancel method. */
    @javax.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the directoryScope property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity. */
    @javax.annotation.Nonnull
    public DirectoryScopeRequestBuilder directoryScope() {
        return new DirectoryScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the principal property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity. */
    @javax.annotation.Nonnull
    public PrincipalRequestBuilder principal() {
        return new PrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the roleDefinition property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity. */
    @javax.annotation.Nonnull
    public RoleDefinitionRequestBuilder roleDefinition() {
        return new RoleDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the targetSchedule property of the microsoft.graph.unifiedRoleEligibilityScheduleRequest entity. */
    @javax.annotation.Nonnull
    public TargetScheduleRequestBuilder targetSchedule() {
        return new TargetScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/roleManagement/entitlementManagement/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequest%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/roleManagement/entitlementManagement/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequest%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
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
     * Requests for role eligibilities for principals through PIM.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Requests for role eligibilities for principals through PIM.
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
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property roleEligibilityScheduleRequests for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Requests for role eligibilities for principals through PIM.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Requests for role eligibilities for principals through PIM.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body 
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> patch(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property roleEligibilityScheduleRequests in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest> patch(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleRequest body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleRequest>() {{
                this.completeExceptionally(ex);
            }};
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
    /** Requests for role eligibilities for principals through PIM. */
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
