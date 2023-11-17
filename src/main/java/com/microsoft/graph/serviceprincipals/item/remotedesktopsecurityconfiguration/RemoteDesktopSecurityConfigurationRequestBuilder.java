package com.microsoft.graph.serviceprincipals.item.remotedesktopsecurityconfiguration;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RemoteDesktopSecurityConfiguration;
import com.microsoft.graph.serviceprincipals.item.remotedesktopsecurityconfiguration.targetdevicegroups.TargetDeviceGroupsRequestBuilder;
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
 * Provides operations to manage the remoteDesktopSecurityConfiguration property of the microsoft.graph.servicePrincipal entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteDesktopSecurityConfigurationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the targetDeviceGroups property of the microsoft.graph.remoteDesktopSecurityConfiguration entity.
     */
    @jakarta.annotation.Nonnull
    public TargetDeviceGroupsRequestBuilder targetDeviceGroups() {
        return new TargetDeviceGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new RemoteDesktopSecurityConfigurationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RemoteDesktopSecurityConfigurationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/remoteDesktopSecurityConfiguration{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RemoteDesktopSecurityConfigurationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RemoteDesktopSecurityConfigurationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/remoteDesktopSecurityConfiguration{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a remoteDesktopSecurityConfiguration object on a servicePrincipal. Removing remoteDesktopSecurityConfiguration object on the servicePrincipal disables the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices, and removes any target device groups that you configured for SSO.
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-delete-remotedesktopsecurityconfiguration?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a remoteDesktopSecurityConfiguration object on a servicePrincipal. Removing remoteDesktopSecurityConfiguration object on the servicePrincipal disables the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices, and removes any target device groups that you configured for SSO.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-delete-remotedesktopsecurityconfiguration?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Read the properties and relationships of a remoteDesktopSecurityConfiguration object on a servicePrincipal. Use this configuration to view the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices. Additionally you can view any targetDeviceGroups that have been configured for SSO.
     * @return a RemoteDesktopSecurityConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/remotedesktopsecurityconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a remoteDesktopSecurityConfiguration object on a servicePrincipal. Use this configuration to view the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices. Additionally you can view any targetDeviceGroups that have been configured for SSO.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RemoteDesktopSecurityConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/remotedesktopsecurityconfiguration-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, RemoteDesktopSecurityConfiguration::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of a remoteDesktopSecurityConfiguration object on the servicePrincipal. Use this configuration to enable or disable the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices.
     * @param body The request body
     * @return a RemoteDesktopSecurityConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/remotedesktopsecurityconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration patch(@jakarta.annotation.Nonnull final RemoteDesktopSecurityConfiguration body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a remoteDesktopSecurityConfiguration object on the servicePrincipal. Use this configuration to enable or disable the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RemoteDesktopSecurityConfiguration
     * @see <a href="https://learn.microsoft.com/graph/api/remotedesktopsecurityconfiguration-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration patch(@jakarta.annotation.Nonnull final RemoteDesktopSecurityConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, RemoteDesktopSecurityConfiguration::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete a remoteDesktopSecurityConfiguration object on a servicePrincipal. Removing remoteDesktopSecurityConfiguration object on the servicePrincipal disables the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices, and removes any target device groups that you configured for SSO.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a remoteDesktopSecurityConfiguration object on a servicePrincipal. Removing remoteDesktopSecurityConfiguration object on the servicePrincipal disables the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices, and removes any target device groups that you configured for SSO.
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
     * Read the properties and relationships of a remoteDesktopSecurityConfiguration object on a servicePrincipal. Use this configuration to view the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices. Additionally you can view any targetDeviceGroups that have been configured for SSO.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a remoteDesktopSecurityConfiguration object on a servicePrincipal. Use this configuration to view the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices. Additionally you can view any targetDeviceGroups that have been configured for SSO.
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
     * Update the properties of a remoteDesktopSecurityConfiguration object on the servicePrincipal. Use this configuration to enable or disable the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RemoteDesktopSecurityConfiguration body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a remoteDesktopSecurityConfiguration object on the servicePrincipal. Use this configuration to enable or disable the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RemoteDesktopSecurityConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a RemoteDesktopSecurityConfigurationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RemoteDesktopSecurityConfigurationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RemoteDesktopSecurityConfigurationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a remoteDesktopSecurityConfiguration object on a servicePrincipal. Use this configuration to view the Microsoft Entra ID Remote Desktop Services (RDS) authentication protocol to authenticate a user to Microsoft Entra joined or Microsoft Entra hybrid joined devices. Additionally you can view any targetDeviceGroups that have been configured for SSO.
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
