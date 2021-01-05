// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Request Builder.
 */
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder implements IDeviceAppManagementRequestBuilder {

    /**
     * The request builder for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    public IDeviceAppManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    public IDeviceAppManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceAppManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IManagedEBookCollectionRequestBuilder managedEBooks() {
        return new ManagedEBookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks"), getClient(), null);
    }

    public IManagedEBookRequestBuilder managedEBooks(final String id) {
        return new ManagedEBookRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks") + "/" + id, getClient(), null);
    }
    public IMobileAppCategoryCollectionRequestBuilder mobileAppCategories() {
        return new MobileAppCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories"), getClient(), null);
    }

    public IMobileAppCategoryRequestBuilder mobileAppCategories(final String id) {
        return new MobileAppCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations() {
        return new ManagedDeviceMobileAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(final String id) {
        return new ManagedDeviceMobileAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations") + "/" + id, getClient(), null);
    }
    public IMobileAppCollectionRequestBuilder mobileApps() {
        return new MobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps"), getClient(), null);
    }

    public IMobileAppRequestBuilder mobileApps(final String id) {
        return new MobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id, getClient(), null);
    }
    public IMobileLobAppCollectionRequestBuilder mobileAppsAsMobileLobApp() {
        return new MobileLobAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/microsoft.graph.mobileLobApp", getClient(), null);
    }

    public IMobileLobAppRequestBuilder mobileAppsAsMobileLobApp(final String id) {
        return new MobileLobAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id + "/microsoft.graph.mobileLobApp", getClient(), null);
    }
    public IManagedMobileLobAppCollectionRequestBuilder mobileAppsAsManagedMobileLobApp() {
        return new ManagedMobileLobAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/microsoft.graph.managedMobileLobApp", getClient(), null);
    }

    public IManagedMobileLobAppRequestBuilder mobileAppsAsManagedMobileLobApp(final String id) {
        return new ManagedMobileLobAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id + "/microsoft.graph.managedMobileLobApp", getClient(), null);
    }
    public IVppTokenCollectionRequestBuilder vppTokens() {
        return new VppTokenCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens"), getClient(), null);
    }

    public IVppTokenRequestBuilder vppTokens(final String id) {
        return new VppTokenRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens") + "/" + id, getClient(), null);
    }
    public IAndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections"), getClient(), null);
    }

    public IAndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(final String id) {
        return new AndroidManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections") + "/" + id, getClient(), null);
    }
    public IDefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections"), getClient(), null);
    }

    public IDefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(final String id) {
        return new DefaultManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections") + "/" + id, getClient(), null);
    }
    public IIosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections"), getClient(), null);
    }

    public IIosManagedAppProtectionRequestBuilder iosManagedAppProtections(final String id) {
        return new IosManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections") + "/" + id, getClient(), null);
    }
    public IManagedAppPolicyCollectionRequestBuilder managedAppPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies"), getClient(), null);
    }

    public IManagedAppPolicyRequestBuilder managedAppPolicies(final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies") + "/" + id, getClient(), null);
    }
    public IManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    public IManagedAppRegistrationRequestBuilder managedAppRegistrations(final String id) {
        return new ManagedAppRegistrationRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    public IManagedAppStatusCollectionRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses"), getClient(), null);
    }

    public IManagedAppStatusRequestBuilder managedAppStatuses(final String id) {
        return new ManagedAppStatusRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses") + "/" + id, getClient(), null);
    }
    public IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies"), getClient(), null);
    }

    public IMdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(final String id) {
        return new MdmWindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }
    public ITargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations"), getClient(), null);
    }

    public ITargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(final String id) {
        return new TargetedManagedAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies"), getClient(), null);
    }

    public IWindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(final String id) {
        return new WindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }

    public IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncMicrosoftStoreForBusinessApps"), getClient(), null);
    }
}
