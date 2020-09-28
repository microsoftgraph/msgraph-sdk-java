
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

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Reference Request Builder.
 */
public class DeviceAppManagementReferenceRequestBuilder extends BaseRequestBuilder implements IDeviceAppManagementReferenceRequestBuilder {

    /**
     * The request builder for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The IDeviceAppManagementReferenceRequest instance
     */
    public IDeviceAppManagementReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementReferenceRequest instance
     */
    public IDeviceAppManagementReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceAppManagementReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
