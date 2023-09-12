package com.microsoft.graph.devicemanagement.devicecompliancepolicies.item;

import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.devicestatusoverview.DeviceStatusOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduleactionsforrules.ScheduleActionsForRulesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.ScheduledActionsForRuleRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.userstatusoverview.UserStatusOverviewRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicy;
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
 * Provides operations to manage the deviceCompliancePolicies property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCompliancePolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatusOverview property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the scheduleActionsForRules method.
     */
    @jakarta.annotation.Nonnull
    public ScheduleActionsForRulesRequestBuilder scheduleActionsForRules() {
        return new ScheduleActionsForRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the scheduledActionsForRule property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public ScheduledActionsForRuleRequestBuilder scheduledActionsForRule() {
        return new ScheduledActionsForRuleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatusOverview property of the microsoft.graph.deviceCompliancePolicy entity.
     */
    @jakarta.annotation.Nonnull
    public UserStatusOverviewRequestBuilder userStatusOverview() {
        return new UserStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DeviceCompliancePolicyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceCompliancePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceCompliancePolicyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceCompliancePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a androidCompliancePolicy.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidcompliancepolicy-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Deletes a androidCompliancePolicy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidcompliancepolicy-delete?view=graph-rest-1.0">Find more info here</a>
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
     * Read properties and relationships of the iosCompliancePolicy object.
     * @return a CompletableFuture of deviceCompliancePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-ioscompliancepolicy-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the iosCompliancePolicy object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceCompliancePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-ioscompliancepolicy-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of a androidCompliancePolicy object.
     * @param body The request body
     * @return a CompletableFuture of deviceCompliancePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidcompliancepolicy-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> patch(@jakarta.annotation.Nonnull final DeviceCompliancePolicy body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a androidCompliancePolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceCompliancePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidcompliancepolicy-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicy> patch(@jakarta.annotation.Nonnull final DeviceCompliancePolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Deletes a androidCompliancePolicy.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a androidCompliancePolicy.
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
     * Read properties and relationships of the iosCompliancePolicy object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the iosCompliancePolicy object.
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
     * Update the properties of a androidCompliancePolicy object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceCompliancePolicy body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a androidCompliancePolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceCompliancePolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a DeviceCompliancePolicyItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceCompliancePolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read properties and relationships of the iosCompliancePolicy object.
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
