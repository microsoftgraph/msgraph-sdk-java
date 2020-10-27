// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request Builder.
 */
public class DeviceManagementRequestBuilder extends BaseRequestBuilder<DeviceManagement> {

    /**
     * The request builder for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementRequest instance
     */
    public DeviceManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementRequest instance
     */
    public DeviceManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TermsAndConditions collection
     *
     * @return the collection request builder
     */
    public TermsAndConditionsCollectionRequestBuilder termsAndConditions() {
        return new TermsAndConditionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions"), getClient(), null);
    }

    /**
     * Gets a request builder for the TermsAndConditions item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public TermsAndConditionsRequestBuilder termsAndConditions(final String id) {
        return new TermsAndConditionsRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicy collection
     *
     * @return the collection request builder
     */
    public DeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(final String id) {
        return new DeviceCompliancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the DeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyDeviceStateSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicySettingStateSummary collection
     *
     * @return the collection request builder
     */
    public DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicySettingStateSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(final String id) {
        return new DeviceCompliancePolicySettingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the DeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    public DeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationDeviceStateSummaries"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfiguration collection
     *
     * @return the collection request builder
     */
    public DeviceConfigurationCollectionRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceConfigurationRequestBuilder deviceConfigurations(final String id) {
        return new DeviceConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IosUpdateDeviceStatus collection
     *
     * @return the collection request builder
     */
    public IosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses() {
        return new IosUpdateDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the IosUpdateDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public IosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(final String id) {
        return new IosUpdateDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the SoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    public SoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("softwareUpdateStatusSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ComplianceManagementPartner collection
     *
     * @return the collection request builder
     */
    public ComplianceManagementPartnerCollectionRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("complianceManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the ComplianceManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ComplianceManagementPartnerRequestBuilder complianceManagementPartners(final String id) {
        return new ComplianceManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("complianceManagementPartners") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the OnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    public OnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new OnPremisesConditionalAccessSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessSettings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCategory collection
     *
     * @return the collection request builder
     */
    public DeviceCategoryCollectionRequestBuilder deviceCategories() {
        return new DeviceCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceCategoryRequestBuilder deviceCategories(final String id) {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceEnrollmentConfiguration collection
     *
     * @return the collection request builder
     */
    public DeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceEnrollmentConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id) {
        return new DeviceEnrollmentConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementPartner collection
     *
     * @return the collection request builder
     */
    public DeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceManagementPartnerRequestBuilder deviceManagementPartners(final String id) {
        return new DeviceManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementExchangeConnector collection
     *
     * @return the collection request builder
     */
    public DeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors() {
        return new DeviceManagementExchangeConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementExchangeConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(final String id) {
        return new DeviceManagementExchangeConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileThreatDefenseConnector collection
     *
     * @return the collection request builder
     */
    public MobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileThreatDefenseConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public MobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(final String id) {
        return new MobileThreatDefenseConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the ApplePushNotificationCertificateRequestBuilder instance
     */
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("applePushNotificationCertificate"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DetectedApp collection
     *
     * @return the collection request builder
     */
    public DetectedAppCollectionRequestBuilder detectedApps() {
        return new DetectedAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the DetectedApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DetectedAppRequestBuilder detectedApps(final String id) {
        return new DetectedAppRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the ManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    public ManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDevice collection
     *
     * @return the collection request builder
     */
    public ManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ManagedDeviceRequestBuilder managedDevices(final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the NotificationMessageTemplate collection
     *
     * @return the collection request builder
     */
    public NotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates"), getClient(), null);
    }

    /**
     * Gets a request builder for the NotificationMessageTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public NotificationMessageTemplateRequestBuilder notificationMessageTemplates(final String id) {
        return new NotificationMessageTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ResourceOperation collection
     *
     * @return the collection request builder
     */
    public ResourceOperationCollectionRequestBuilder resourceOperations() {
        return new ResourceOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ResourceOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ResourceOperationRequestBuilder resourceOperations(final String id) {
        return new ResourceOperationRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceAndAppManagementRoleAssignment collection
     *
     * @return the collection request builder
     */
    public DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceAndAppManagementRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(final String id) {
        return new DeviceAndAppManagementRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RoleDefinition collection
     *
     * @return the collection request builder
     */
    public RoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new RoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the RoleDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public RoleDefinitionRequestBuilder roleDefinitions(final String id) {
        return new RoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RemoteAssistancePartner collection
     *
     * @return the collection request builder
     */
    public RemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the RemoteAssistancePartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public RemoteAssistancePartnerRequestBuilder remoteAssistancePartners(final String id) {
        return new RemoteAssistancePartnerRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TelecomExpenseManagementPartner collection
     *
     * @return the collection request builder
     */
    public TelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners"), getClient(), null);
    }

    /**
     * Gets a request builder for the TelecomExpenseManagementPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public TelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(final String id) {
        return new TelecomExpenseManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    public DeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLearningSummary collection
     *
     * @return the collection request builder
     */
    public WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLearningSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(final String id) {
        return new WindowsInformationProtectionAppLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionNetworkLearningSummary collection
     *
     * @return the collection request builder
     */
    public WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionNetworkLearningSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public WindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(final String id) {
        return new WindowsInformationProtectionNetworkLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param domainName the domainName
     */
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(final String domainName) {
        return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verifyWindowsEnrollmentAutoDiscovery"), getClient(), null, domainName);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param scope the scope
     */
    public DeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(final String scope) {
        return new DeviceManagementGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null, scope);
    }
}
