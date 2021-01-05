// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementSettings;
import com.microsoft.graph.models.extensions.IntuneBrand;
import com.microsoft.graph.models.generated.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import com.microsoft.graph.models.extensions.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.ResourceOperation;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management.
 */
public class DeviceManagement extends Entity implements IJsonBackedObject {


    /**
     * The Intune Account Id.
     * Intune Account Id for given tenant
     */
    @SerializedName(value = "intuneAccountId", alternate = {"IntuneAccountId"})
    @Expose
    public java.util.UUID intuneAccountId;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public DeviceManagementSettings settings;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName(value = "intuneBrand", alternate = {"IntuneBrand"})
    @Expose
    public IntuneBrand intuneBrand;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName(value = "subscriptionState", alternate = {"SubscriptionState"})
    @Expose
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName(value = "deviceCompliancePolicies", alternate = {"DeviceCompliancePolicies"})
    @Expose
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName(value = "deviceCompliancePolicyDeviceStateSummary", alternate = {"DeviceCompliancePolicyDeviceStateSummary"})
    @Expose
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationDeviceStateSummaries", alternate = {"DeviceConfigurationDeviceStateSummaries"})
    @Expose
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName(value = "deviceConfigurations", alternate = {"DeviceConfigurations"})
    @Expose
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName(value = "iosUpdateStatuses", alternate = {"IosUpdateStatuses"})
    @Expose
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName(value = "softwareUpdateStatusSummary", alternate = {"SoftwareUpdateStatusSummary"})
    @Expose
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName(value = "complianceManagementPartners", alternate = {"ComplianceManagementPartners"})
    @Expose
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName(value = "deviceCategories", alternate = {"DeviceCategories"})
    @Expose
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName(value = "deviceManagementPartners", alternate = {"DeviceManagementPartners"})
    @Expose
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName(value = "exchangeConnectors", alternate = {"ExchangeConnectors"})
    @Expose
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName(value = "mobileThreatDefenseConnectors", alternate = {"MobileThreatDefenseConnectors"})
    @Expose
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName(value = "applePushNotificationCertificate", alternate = {"ApplePushNotificationCertificate"})
    @Expose
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName(value = "detectedApps", alternate = {"DetectedApps"})
    @Expose
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName(value = "managedDeviceOverview", alternate = {"ManagedDeviceOverview"})
    @Expose
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName(value = "notificationMessageTemplates", alternate = {"NotificationMessageTemplates"})
    @Expose
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName(value = "resourceOperations", alternate = {"ResourceOperations"})
    @Expose
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName(value = "remoteAssistancePartners", alternate = {"RemoteAssistancePartners"})
    @Expose
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName(value = "telecomExpenseManagementPartners", alternate = {"TelecomExpenseManagementPartners"})
    @Expose
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName(value = "troubleshootingEvents", alternate = {"TroubleshootingEvents"})
    @Expose
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionAppLearningSummaries", alternate = {"WindowsInformationProtectionAppLearningSummaries"})
    @Expose
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionNetworkLearningSummaries", alternate = {"WindowsInformationProtectionNetworkLearningSummaries"})
    @Expose
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("termsAndConditions")) {
            termsAndConditions = serializer.deserializeObject(json.get("termsAndConditions").toString(), TermsAndConditionsCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicies")) {
            deviceCompliancePolicies = serializer.deserializeObject(json.get("deviceCompliancePolicies").toString(), DeviceCompliancePolicyCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries").toString(), DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurations")) {
            deviceConfigurations = serializer.deserializeObject(json.get("deviceConfigurations").toString(), DeviceConfigurationCollectionPage.class);
        }

        if (json.has("iosUpdateStatuses")) {
            iosUpdateStatuses = serializer.deserializeObject(json.get("iosUpdateStatuses").toString(), IosUpdateDeviceStatusCollectionPage.class);
        }

        if (json.has("complianceManagementPartners")) {
            complianceManagementPartners = serializer.deserializeObject(json.get("complianceManagementPartners").toString(), ComplianceManagementPartnerCollectionPage.class);
        }

        if (json.has("deviceCategories")) {
            deviceCategories = serializer.deserializeObject(json.get("deviceCategories").toString(), DeviceCategoryCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations").toString(), DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("deviceManagementPartners")) {
            deviceManagementPartners = serializer.deserializeObject(json.get("deviceManagementPartners").toString(), DeviceManagementPartnerCollectionPage.class);
        }

        if (json.has("exchangeConnectors")) {
            exchangeConnectors = serializer.deserializeObject(json.get("exchangeConnectors").toString(), DeviceManagementExchangeConnectorCollectionPage.class);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            mobileThreatDefenseConnectors = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors").toString(), MobileThreatDefenseConnectorCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps").toString(), DetectedAppCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices").toString(), ManagedDeviceCollectionPage.class);
        }

        if (json.has("notificationMessageTemplates")) {
            notificationMessageTemplates = serializer.deserializeObject(json.get("notificationMessageTemplates").toString(), NotificationMessageTemplateCollectionPage.class);
        }

        if (json.has("resourceOperations")) {
            resourceOperations = serializer.deserializeObject(json.get("resourceOperations").toString(), ResourceOperationCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments").toString(), DeviceAndAppManagementRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions").toString(), RoleDefinitionCollectionPage.class);
        }

        if (json.has("remoteAssistancePartners")) {
            remoteAssistancePartners = serializer.deserializeObject(json.get("remoteAssistancePartners").toString(), RemoteAssistancePartnerCollectionPage.class);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            telecomExpenseManagementPartners = serializer.deserializeObject(json.get("telecomExpenseManagementPartners").toString(), TelecomExpenseManagementPartnerCollectionPage.class);
        }

        if (json.has("troubleshootingEvents")) {
            troubleshootingEvents = serializer.deserializeObject(json.get("troubleshootingEvents").toString(), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            windowsInformationProtectionAppLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries").toString(), WindowsInformationProtectionAppLearningSummaryCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            windowsInformationProtectionNetworkLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries").toString(), WindowsInformationProtectionNetworkLearningSummaryCollectionPage.class);
        }
    }
}
