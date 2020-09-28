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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management With Reference Request.
 */
public class DeviceAppManagementWithReferenceRequest extends BaseRequest implements IDeviceAppManagementWithReferenceRequest {

    /**
     * The request for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagement.class);
    }

    public void post(final DeviceAppManagement newDeviceAppManagement, final IJsonBackedObject payload, final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceAppManagement post(final DeviceAppManagement newDeviceAppManagement, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceAppManagement;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceAppManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceAppManagement> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceAppManagement sourceDeviceAppManagement, final ICallback<? super DeviceAppManagement> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceAppManagement);
	}

	public DeviceAppManagement patch(final DeviceAppManagement sourceDeviceAppManagement) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceAppManagement);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAppManagementWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceAppManagementWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAppManagementWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAppManagementWithReferenceRequest)this;
    }
}
