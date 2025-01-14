package com.microsoft.graph.devicemanagement.deviceconfigurations.item;

import com.microsoft.graph.devicemanagement.deviceconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.devicestatusoverview.DeviceStatusOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.getomasettingplaintextvaluewithsecretreferencevalueid.GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.userstatusoverview.UserStatusOverviewRequestBuilder;
import com.microsoft.graph.models.DeviceConfiguration;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the deviceConfigurations property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     * @return a {@link AssignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link AssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceSettingStateSummaries property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link DeviceSettingStateSummariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link DeviceStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatusOverview property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link DeviceStatusOverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link UserStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatusOverview property of the microsoft.graph.deviceConfiguration entity.
     * @return a {@link UserStatusOverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserStatusOverviewRequestBuilder userStatusOverview() {
        return new UserStatusOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceConfigurationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceConfigurations/{deviceConfiguration%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceConfigurationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceConfigurations/{deviceConfiguration%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Deletes a sharedPCConfiguration.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-sharedpcconfiguration-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes a sharedPCConfiguration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-sharedpcconfiguration-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read properties and relationships of the androidWorkProfileCustomConfiguration object.
     * @return a {@link DeviceConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidworkprofilecustomconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceConfiguration get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the androidWorkProfileCustomConfiguration object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-androidworkprofilecustomconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getOmaSettingPlainTextValue method.
     * @param secretReferenceValueId Usage: secretReferenceValueId='{secretReferenceValueId}'
     * @return a {@link GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder getOmaSettingPlainTextValueWithSecretReferenceValueId(@jakarta.annotation.Nonnull final String secretReferenceValueId) {
        Objects.requireNonNull(secretReferenceValueId);
        return new GetOmaSettingPlainTextValueWithSecretReferenceValueIdRequestBuilder(pathParameters, requestAdapter, secretReferenceValueId);
    }
    /**
     * Update the properties of a iosGeneralDeviceConfiguration object.
     * @param body The request body
     * @return a {@link DeviceConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-iosgeneraldeviceconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceConfiguration patch(@jakarta.annotation.Nonnull final DeviceConfiguration body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a iosGeneralDeviceConfiguration object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-iosgeneraldeviceconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceConfiguration patch(@jakarta.annotation.Nonnull final DeviceConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Deletes a sharedPCConfiguration.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a sharedPCConfiguration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read properties and relationships of the androidWorkProfileCustomConfiguration object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the androidWorkProfileCustomConfiguration object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a iosGeneralDeviceConfiguration object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceConfiguration body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a iosGeneralDeviceConfiguration object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeviceConfigurationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceConfigurationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read properties and relationships of the androidWorkProfileCustomConfiguration object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
