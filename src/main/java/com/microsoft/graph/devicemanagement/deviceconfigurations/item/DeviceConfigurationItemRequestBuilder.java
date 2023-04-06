package com.microsoft.graph.devicemanagement.deviceconfigurations.item;

import com.microsoft.graph.devicemanagement.deviceconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.assignments.item.DeviceConfigurationAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicesettingstatesummaries.item.SettingStateDeviceSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicestatuses.item.DeviceConfigurationDeviceStatusItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicestatusoverview.DeviceStatusOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.getomasettingplaintextvaluewithsecretreferencevalueid.GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.userstatuses.item.DeviceConfigurationUserStatusItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.userstatusoverview.UserStatusOverviewRequestBuilder;
import com.microsoft.graph.models.DeviceConfiguration;
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
 * Provides operations to manage the deviceConfigurations property of the microsoft.graph.deviceManagement entity.
 */
public class DeviceConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the assign method. */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatusOverview property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public DeviceStatusOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userStatuses property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userStatusOverview property of the microsoft.graph.deviceConfiguration entity. */
    @javax.annotation.Nonnull
    public UserStatusOverviewRequestBuilder userStatusOverview() {
        return new UserStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceConfiguration entity.
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationAssignment%2Did", id);
        return new DeviceConfigurationAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceConfigurationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceConfigurations/{deviceConfiguration%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceConfigurationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceConfigurations/{deviceConfiguration%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property deviceConfigurations for deviceManagement
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
     * Delete navigation property deviceConfigurations for deviceManagement
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
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceConfiguration entity.
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
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceConfiguration entity.
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationDeviceStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationDeviceStatusItemRequestBuilder deviceStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationDeviceStatus%2Did", id);
        return new DeviceConfigurationDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The device configurations.
     * @return a CompletableFuture of deviceConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceConfiguration> executionException = new java.util.concurrent.CompletableFuture<DeviceConfiguration>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The device configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceConfiguration> executionException = new java.util.concurrent.CompletableFuture<DeviceConfiguration>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getOmaSettingPlainTextValue method.
     * @param secretReferenceValueId Usage: secretReferenceValueId='{secretReferenceValueId}'
     * @return a getOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder getOmaSettingPlainTextValueWithSecretReferenceValueId(@javax.annotation.Nonnull final String secretReferenceValueId) {
        Objects.requireNonNull(secretReferenceValueId);
        return new GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder(pathParameters, requestAdapter, secretReferenceValueId);
    }
    /**
     * Update the navigation property deviceConfigurations in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> patch(@javax.annotation.Nonnull final DeviceConfiguration body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceConfiguration> executionException = new java.util.concurrent.CompletableFuture<DeviceConfiguration>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property deviceConfigurations in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> patch(@javax.annotation.Nonnull final DeviceConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceConfiguration> executionException = new java.util.concurrent.CompletableFuture<DeviceConfiguration>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property deviceConfigurations for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property deviceConfigurations for deviceManagement
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
     * The device configurations.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The device configurations.
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
     * Update the navigation property deviceConfigurations in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceConfiguration body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property deviceConfigurations in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the userStatuses property of the microsoft.graph.deviceConfiguration entity.
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationUserStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationUserStatusItemRequestBuilder userStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfigurationUserStatus%2Did", id);
        return new DeviceConfigurationUserStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The device configurations.
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
