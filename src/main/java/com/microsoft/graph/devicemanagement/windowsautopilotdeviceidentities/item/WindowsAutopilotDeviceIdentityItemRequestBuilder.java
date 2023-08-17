package com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item;

import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item.assignusertodevice.AssignUserToDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item.unassignuserfromdevice.UnassignUserFromDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item.updatedeviceproperties.UpdateDevicePropertiesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;
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
 * Provides operations to manage the windowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity.
 */
public class WindowsAutopilotDeviceIdentityItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assignUserToDevice method.
     */
    @jakarta.annotation.Nonnull
    public AssignUserToDeviceRequestBuilder assignUserToDevice() {
        return new AssignUserToDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unassignUserFromDevice method.
     */
    @jakarta.annotation.Nonnull
    public UnassignUserFromDeviceRequestBuilder unassignUserFromDevice() {
        return new UnassignUserFromDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateDeviceProperties method.
     */
    @jakarta.annotation.Nonnull
    public UpdateDevicePropertiesRequestBuilder updateDeviceProperties() {
        return new UpdateDevicePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WindowsAutopilotDeviceIdentityItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsAutopilotDeviceIdentityItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/windowsAutopilotDeviceIdentities/{windowsAutopilotDeviceIdentity%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WindowsAutopilotDeviceIdentityItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsAutopilotDeviceIdentityItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/windowsAutopilotDeviceIdentities/{windowsAutopilotDeviceIdentity%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a windowsAutopilotDeviceIdentity.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-enrollment-windowsautopilotdeviceidentity-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Deletes a windowsAutopilotDeviceIdentity.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-enrollment-windowsautopilotdeviceidentity-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Read properties and relationships of the windowsAutopilotDeviceIdentity object.
     * @return a CompletableFuture of windowsAutopilotDeviceIdentity
     * @see <a href="https://learn.microsoft.com/graph/api/intune-enrollment-windowsautopilotdeviceidentity-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsAutopilotDeviceIdentity> get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the windowsAutopilotDeviceIdentity object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of windowsAutopilotDeviceIdentity
     * @see <a href="https://learn.microsoft.com/graph/api/intune-enrollment-windowsautopilotdeviceidentity-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsAutopilotDeviceIdentity> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property windowsAutopilotDeviceIdentities in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of windowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsAutopilotDeviceIdentity> patch(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property windowsAutopilotDeviceIdentities in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of windowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsAutopilotDeviceIdentity> patch(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Deletes a windowsAutopilotDeviceIdentity.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a windowsAutopilotDeviceIdentity.
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
     * Read properties and relationships of the windowsAutopilotDeviceIdentity object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the windowsAutopilotDeviceIdentity object.
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
     * Update the navigation property windowsAutopilotDeviceIdentities in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property windowsAutopilotDeviceIdentities in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Read properties and relationships of the windowsAutopilotDeviceIdentity object.
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
