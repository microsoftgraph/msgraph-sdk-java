// Template Source: IBaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Request Builder.
 */
public interface IDeviceManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITermsAndConditionsCollectionRequestBuilder termsAndConditions();

    ITermsAndConditionsRequestBuilder termsAndConditions(final String id);

    IDeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies();

    IDeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(final String id);

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary();

    IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries();

    IDeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the IDeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    IDeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries();

    IDeviceConfigurationCollectionRequestBuilder deviceConfigurations();

    IDeviceConfigurationRequestBuilder deviceConfigurations(final String id);

    IIosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses();

    IIosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(final String id);

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary();

    IComplianceManagementPartnerCollectionRequestBuilder complianceManagementPartners();

    IComplianceManagementPartnerRequestBuilder complianceManagementPartners(final String id);

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the IOnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    IOnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings();

    IDeviceCategoryCollectionRequestBuilder deviceCategories();

    IDeviceCategoryRequestBuilder deviceCategories(final String id);

    IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations();

    IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id);

    IDeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners();

    IDeviceManagementPartnerRequestBuilder deviceManagementPartners(final String id);

    IDeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors();

    IDeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(final String id);

    IMobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors();

    IMobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(final String id);

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the IApplePushNotificationCertificateRequestBuilder instance
     */
    IApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate();

    IDetectedAppCollectionRequestBuilder detectedApps();

    IDetectedAppRequestBuilder detectedApps(final String id);

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the IManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    IManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview();

    IManagedDeviceCollectionRequestBuilder managedDevices();

    IManagedDeviceRequestBuilder managedDevices(final String id);

    INotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates();

    INotificationMessageTemplateRequestBuilder notificationMessageTemplates(final String id);

    IResourceOperationCollectionRequestBuilder resourceOperations();

    IResourceOperationRequestBuilder resourceOperations(final String id);

    IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments();

    IDeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(final String id);

    IRoleDefinitionCollectionRequestBuilder roleDefinitions();

    IRoleDefinitionRequestBuilder roleDefinitions(final String id);

    IRemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners();

    IRemoteAssistancePartnerRequestBuilder remoteAssistancePartners(final String id);

    ITelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners();

    ITelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(final String id);

    IDeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents();

    IDeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(final String id);

    IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries();

    IWindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(final String id);

    IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries();

    IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(final String id);
    IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(final String domainName);

    IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(final String scope);

}