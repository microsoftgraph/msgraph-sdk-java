package com.microsoft.graph.devicemanagement.manageddevices.item;

import com.microsoft.graph.devicemanagement.manageddevices.item.bypassactivationlock.BypassActivationLockRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.cleanwindowsdevice.CleanWindowsDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deleteuserfromsharedappledevice.DeleteUserFromSharedAppleDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.devicecategory.DeviceCategoryRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.devicecompliancepolicystates.DeviceCompliancePolicyStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.deviceconfigurationstates.DeviceConfigurationStatesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.disablelostmode.DisableLostModeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.locatedevice.LocateDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.logcollectionrequests.LogCollectionRequestsRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.logoutsharedappledeviceactiveuser.LogoutSharedAppleDeviceActiveUserRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.rebootnow.RebootNowRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.recoverpasscode.RecoverPasscodeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.remotelock.RemoteLockRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.requestremoteassistance.RequestRemoteAssistanceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.resetpasscode.ResetPasscodeRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.retire.RetireRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.shutdown.ShutDownRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.syncdevice.SyncDeviceRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.updatewindowsdeviceaccount.UpdateWindowsDeviceAccountRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.users.UsersRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsdefenderscan.WindowsDefenderScanRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsdefenderupdatesignatures.WindowsDefenderUpdateSignaturesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.windowsprotectionstate.WindowsProtectionStateRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.wipe.WipeRequestBuilder;
import com.microsoft.graph.models.ManagedDevice;
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
 * Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the bypassActivationLock method.
     * @return a {@link BypassActivationLockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BypassActivationLockRequestBuilder bypassActivationLock() {
        return new BypassActivationLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cleanWindowsDevice method.
     * @return a {@link CleanWindowsDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanWindowsDeviceRequestBuilder cleanWindowsDevice() {
        return new CleanWindowsDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deleteUserFromSharedAppleDevice method.
     * @return a {@link DeleteUserFromSharedAppleDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice() {
        return new DeleteUserFromSharedAppleDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCategory property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicyStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceCompliancePolicyStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicyStatesRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurationStates property of the microsoft.graph.managedDevice entity.
     * @return a {@link DeviceConfigurationStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationStatesRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disableLostMode method.
     * @return a {@link DisableLostModeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DisableLostModeRequestBuilder disableLostMode() {
        return new DisableLostModeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the locateDevice method.
     * @return a {@link LocateDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocateDeviceRequestBuilder locateDevice() {
        return new LocateDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the logCollectionRequests property of the microsoft.graph.managedDevice entity.
     * @return a {@link LogCollectionRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogCollectionRequestsRequestBuilder logCollectionRequests() {
        return new LogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logoutSharedAppleDeviceActiveUser method.
     * @return a {@link LogoutSharedAppleDeviceActiveUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new LogoutSharedAppleDeviceActiveUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rebootNow method.
     * @return a {@link RebootNowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RebootNowRequestBuilder rebootNow() {
        return new RebootNowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recoverPasscode method.
     * @return a {@link RecoverPasscodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecoverPasscodeRequestBuilder recoverPasscode() {
        return new RecoverPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the remoteLock method.
     * @return a {@link RemoteLockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoteLockRequestBuilder remoteLock() {
        return new RemoteLockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the requestRemoteAssistance method.
     * @return a {@link RequestRemoteAssistanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new RequestRemoteAssistanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetPasscode method.
     * @return a {@link ResetPasscodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetPasscodeRequestBuilder resetPasscode() {
        return new ResetPasscodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retire method.
     * @return a {@link RetireRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetireRequestBuilder retire() {
        return new RetireRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the shutDown method.
     * @return a {@link ShutDownRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShutDownRequestBuilder shutDown() {
        return new ShutDownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncDevice method.
     * @return a {@link SyncDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SyncDeviceRequestBuilder syncDevice() {
        return new SyncDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateWindowsDeviceAccount method.
     * @return a {@link UpdateWindowsDeviceAccountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount() {
        return new UpdateWindowsDeviceAccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the users property of the microsoft.graph.managedDevice entity.
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderScan method.
     * @return a {@link WindowsDefenderScanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderScanRequestBuilder windowsDefenderScan() {
        return new WindowsDefenderScanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the windowsDefenderUpdateSignatures method.
     * @return a {@link WindowsDefenderUpdateSignaturesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new WindowsDefenderUpdateSignaturesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsProtectionState property of the microsoft.graph.managedDevice entity.
     * @return a {@link WindowsProtectionStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipe method.
     * @return a {@link WipeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeRequestBuilder wipe() {
        return new WipeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ManagedDeviceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ManagedDeviceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagedDeviceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/managedDevices/{managedDevice%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The list of managed devices.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get() {
        return get(null);
    }
    /**
     * The list of managed devices.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property managedDevices in deviceManagement
     * @param body The request body
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property managedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagedDevice}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagedDevice patch(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagedDevice::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managedDevices for deviceManagement
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
     * The list of managed devices.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of managed devices.
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
     * Update the navigation property managedDevices in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagedDevice body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ManagedDeviceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagedDeviceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The list of managed devices.
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
