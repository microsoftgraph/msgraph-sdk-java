package com.microsoft.graph.devices.item;

import com.microsoft.graph.devices.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.devices.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.devices.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.devices.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.devices.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.devices.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.devices.item.registeredowners.RegisteredOwnersRequestBuilder;
import com.microsoft.graph.devices.item.registeredusers.RegisteredUsersRequestBuilder;
import com.microsoft.graph.devices.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.devices.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.models.Device;
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
 * Provides operations to manage the collection of device entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the checkMemberGroups method.
     * @return a {@link CheckMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     * @return a {@link CheckMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.device entity.
     * @return a {@link ExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     * @return a {@link GetMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     * @return a {@link GetMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.device entity.
     * @return a {@link MemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredOwners property of the microsoft.graph.device entity.
     * @return a {@link RegisteredOwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegisteredOwnersRequestBuilder registeredOwners() {
        return new RegisteredOwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredUsers property of the microsoft.graph.device entity.
     * @return a {@link RegisteredUsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegisteredUsersRequestBuilder registeredUsers() {
        return new RegisteredUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.device entity.
     * @return a {@link TransitiveMemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a registered device.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a registered device.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get the properties and relationships of a device object.
     * @return a {@link Device}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Device get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a device object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Device}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Device get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Device::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a registered device. Only certain properties of a device can be updated through approved Mobile Device Managment (MDM) apps.
     * @param body The request body
     * @return a {@link Device}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Device patch(@jakarta.annotation.Nonnull final Device body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a registered device. Only certain properties of a device can be updated through approved Mobile Device Managment (MDM) apps.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Device}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Device patch(@jakarta.annotation.Nonnull final Device body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Device::createFromDiscriminatorValue);
    }
    /**
     * Delete a registered device.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a registered device.
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
     * Get the properties and relationships of a device object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a device object.
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
     * Update the properties of a registered device. Only certain properties of a device can be updated through approved Mobile Device Managment (MDM) apps.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Device body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a registered device. Only certain properties of a device can be updated through approved Mobile Device Managment (MDM) apps.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Device body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeviceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of a device object.
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
