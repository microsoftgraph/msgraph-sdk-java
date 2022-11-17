package com.microsoft.graph.devicemanagement.devicecompliancepolicies.item;

import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.assignments.item.DeviceCompliancePolicyAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicesettingstatesummaries.item.SettingStateDeviceSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicestatuses.item.DeviceComplianceDeviceStatusItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicestatusoverview.DeviceStatusOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduleactionsforrules.ScheduleActionsForRulesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.item.DeviceComplianceScheduledActionForRuleItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.ScheduledActionsForRuleRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.userstatuses.item.DeviceComplianceUserStatusItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.userstatusoverview.UserStatusOverviewRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicy;
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
/** Provides operations to manage the deviceCompliancePolicies property of the microsoft.graph.deviceManagement entity. */
public class DeviceCompliancePolicyItemRequestBuilder {
    /** Provides operations to call the assign method. */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatusOverview property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public DeviceStatusOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the scheduleActionsForRules method. */
    @javax.annotation.Nonnull
    public ScheduleActionsForRulesRequestBuilder scheduleActionsForRules() {
        return new ScheduleActionsForRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the scheduledActionsForRule property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public ScheduledActionsForRuleRequestBuilder scheduledActionsForRule() {
        return new ScheduledActionsForRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userStatuses property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userStatusOverview property of the microsoft.graph.deviceCompliancePolicy entity. */
    @javax.annotation.Nonnull
    public UserStatusOverviewRequestBuilder userStatusOverview() {
        return new UserStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceCompliancePolicy entity.
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicyAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicyAssignment%2Did", id);
        return new DeviceCompliancePolicyAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceCompliancePolicyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceCompliancePolicyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property deviceCompliancePolicies for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property deviceCompliancePolicies for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
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
     * The device compliance policies.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The device compliance policies.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
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
     * Update the navigation property deviceCompliancePolicies in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceCompliancePolicy body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property deviceCompliancePolicies in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceCompliancePolicy body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
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
     * Delete navigation property deviceCompliancePolicies for deviceManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property deviceCompliancePolicies for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceCompliancePolicy entity.
     * @param id Unique identifier of the item
     * @return a SettingStateDeviceSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SettingStateDeviceSummaryItemRequestBuilder deviceSettingStateSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("settingStateDeviceSummary%2Did", id);
        return new SettingStateDeviceSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceCompliancePolicy entity.
     * @param id Unique identifier of the item
     * @return a DeviceComplianceDeviceStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceComplianceDeviceStatusItemRequestBuilder deviceStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceComplianceDeviceStatus%2Did", id);
        return new DeviceComplianceDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The device compliance policies.
     * @return a CompletableFuture of deviceCompliancePolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicy>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The device compliance policies.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceCompliancePolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicy>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property deviceCompliancePolicies in deviceManagement
     * @param body 
     * @return a CompletableFuture of deviceCompliancePolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> patch(@javax.annotation.Nonnull final DeviceCompliancePolicy body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicy>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property deviceCompliancePolicies in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceCompliancePolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> patch(@javax.annotation.Nonnull final DeviceCompliancePolicy body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicy>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the scheduledActionsForRule property of the microsoft.graph.deviceCompliancePolicy entity.
     * @param id Unique identifier of the item
     * @return a DeviceComplianceScheduledActionForRuleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceComplianceScheduledActionForRuleItemRequestBuilder scheduledActionsForRule(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceComplianceScheduledActionForRule%2Did", id);
        return new DeviceComplianceScheduledActionForRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.deviceCompliancePolicy entity.
     * @param id Unique identifier of the item
     * @return a DeviceComplianceUserStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceComplianceUserStatusItemRequestBuilder userStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceComplianceUserStatus%2Did", id);
        return new DeviceComplianceUserStatusItemRequestBuilder(urlTplParams, requestAdapter);
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
    /** The device compliance policies. */
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
