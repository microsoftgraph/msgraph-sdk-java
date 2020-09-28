// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management With Reference Request.
 */
public class DeviceManagementWithReferenceRequest extends BaseRequest implements IDeviceManagementWithReferenceRequest {

    /**
     * The request for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagement.class);
    }

    public void post(final DeviceManagement newDeviceManagement, final IJsonBackedObject payload, final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceManagement post(final DeviceManagement newDeviceManagement, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceManagement;
        }
        return null;
    }

    public void get(final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super DeviceManagement> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceManagement sourceDeviceManagement, final ICallback<? super DeviceManagement> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceManagement);
	}

	public DeviceManagement patch(final DeviceManagement sourceDeviceManagement) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceManagement);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceManagementWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementWithReferenceRequest)this;
    }
}
