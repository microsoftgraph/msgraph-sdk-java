package com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item;

import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatussummary.DeviceStatusSummaryRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.userstatussummary.UserStatusSummaryRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;

import java.util.HashMap;
import java.util.Objects;
/**
 * Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceMobileAppConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatusSummary property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusSummaryRequestBuilder deviceStatusSummary() {
        return new DeviceStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatusSummary property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public UserStatusSummaryRequestBuilder userStatusSummary() {
        return new UserStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a iosMobileAppConfiguration.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-iosmobileappconfiguration-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes a iosMobileAppConfiguration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-iosmobileappconfiguration-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read properties and relationships of the managedDeviceMobileAppConfiguration object.
     * @return a ManagedDeviceMobileAppConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the managedDeviceMobileAppConfiguration object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedDeviceMobileAppConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a iosMobileAppConfiguration object.
     * @param body The request body
     * @return a ManagedDeviceMobileAppConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-iosmobileappconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration patch(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a iosMobileAppConfiguration object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ManagedDeviceMobileAppConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-iosmobileappconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration patch(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Deletes a iosMobileAppConfiguration.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a iosMobileAppConfiguration.
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
     * Read properties and relationships of the managedDeviceMobileAppConfiguration object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the managedDeviceMobileAppConfiguration object.
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
     * Update the properties of a iosMobileAppConfiguration object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a iosMobileAppConfiguration object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ManagedDeviceMobileAppConfigurationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedDeviceMobileAppConfigurationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read properties and relationships of the managedDeviceMobileAppConfiguration object.
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
