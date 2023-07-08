// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceManagementSettings;
import com.microsoft.graph.models.IntuneBrand;
import com.microsoft.graph.models.DeviceProtectionOverview;
import com.microsoft.graph.models.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.UserExperienceAnalyticsSettings;
import com.microsoft.graph.models.WindowsMalwareOverview;
import com.microsoft.graph.models.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.ApplePushNotificationCertificate;
import com.microsoft.graph.models.ManagedDeviceOverview;
import com.microsoft.graph.models.UserExperienceAnalyticsCategory;
import com.microsoft.graph.models.UserExperienceAnalyticsOverview;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
import com.microsoft.graph.models.DeviceManagementReports;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.AuditEventCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.DetectedAppCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsBaselineCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsModelScoresCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage;
import com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage;
import com.microsoft.graph.requests.WindowsMalwareInformationCollectionPage;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

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
	@Nullable
    public java.util.UUID intuneAccountId;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public DeviceManagementSettings settings;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName(value = "intuneBrand", alternate = {"IntuneBrand"})
    @Expose
	@Nullable
    public IntuneBrand intuneBrand;

    /**
     * The Device Protection Overview.
     * Device protection overview.
     */
    @SerializedName(value = "deviceProtectionOverview", alternate = {"DeviceProtectionOverview"})
    @Expose
	@Nullable
    public DeviceProtectionOverview deviceProtectionOverview;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName(value = "subscriptionState", alternate = {"SubscriptionState"})
    @Expose
	@Nullable
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The User Experience Analytics Settings.
     * User experience analytics device settings
     */
    @SerializedName(value = "userExperienceAnalyticsSettings", alternate = {"UserExperienceAnalyticsSettings"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;

    /**
     * The Windows Malware Overview.
     * Malware overview for windows devices.
     */
    @SerializedName(value = "windowsMalwareOverview", alternate = {"WindowsMalwareOverview"})
    @Expose
	@Nullable
    public WindowsMalwareOverview windowsMalwareOverview;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Audit Events.
     * The Audit Events
     */
    @SerializedName(value = "auditEvents", alternate = {"AuditEvents"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AuditEventCollectionPage auditEvents;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName(value = "deviceCompliancePolicies", alternate = {"DeviceCompliancePolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName(value = "deviceCompliancePolicyDeviceStateSummary", alternate = {"DeviceCompliancePolicyDeviceStateSummary"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationDeviceStateSummaries", alternate = {"DeviceConfigurationDeviceStateSummaries"})
    @Expose
	@Nullable
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName(value = "deviceConfigurations", alternate = {"DeviceConfigurations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName(value = "iosUpdateStatuses", alternate = {"IosUpdateStatuses"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName(value = "softwareUpdateStatusSummary", alternate = {"SoftwareUpdateStatusSummary"})
    @Expose
	@Nullable
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName(value = "complianceManagementPartners", alternate = {"ComplianceManagementPartners"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
	@Nullable
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName(value = "deviceCategories", alternate = {"DeviceCategories"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName(value = "deviceManagementPartners", alternate = {"DeviceManagementPartners"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName(value = "exchangeConnectors", alternate = {"ExchangeConnectors"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName(value = "mobileThreatDefenseConnectors", alternate = {"MobileThreatDefenseConnectors"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName(value = "applePushNotificationCertificate", alternate = {"ApplePushNotificationCertificate"})
    @Expose
	@Nullable
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName(value = "detectedApps", alternate = {"DetectedApps"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DetectedAppCollectionPage detectedApps;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName(value = "managedDeviceOverview", alternate = {"ManagedDeviceOverview"})
    @Expose
	@Nullable
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ManagedDeviceCollectionPage managedDevices;

    /**
     * The Mobile App Troubleshooting Events.
     * The collection property of MobileAppTroubleshootingEvent.
     */
    @SerializedName(value = "mobileAppTroubleshootingEvents", alternate = {"MobileAppTroubleshootingEvents"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionPage mobileAppTroubleshootingEvents;

    /**
     * The User Experience Analytics App Health Application Performance.
     * User experience analytics appHealth Application Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformance", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage userExperienceAnalyticsAppHealthApplicationPerformance;

    /**
     * The User Experience Analytics App Health Application Performance By App Version Details.
     * User experience analytics appHealth Application Performance by App Version details
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;

    /**
     * The User Experience Analytics App Health Application Performance By App Version Device Id.
     * User experience analytics appHealth Application Performance by App Version Device Id
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;

    /**
     * The User Experience Analytics App Health Application Performance By OSVersion.
     * User experience analytics appHealth Application Performance by OS Version
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", alternate = {"UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;

    /**
     * The User Experience Analytics App Health Device Model Performance.
     * User experience analytics appHealth Model Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDeviceModelPerformance", alternate = {"UserExperienceAnalyticsAppHealthDeviceModelPerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage userExperienceAnalyticsAppHealthDeviceModelPerformance;

    /**
     * The User Experience Analytics App Health Device Performance.
     * User experience analytics appHealth Device Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformance", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage userExperienceAnalyticsAppHealthDevicePerformance;

    /**
     * The User Experience Analytics App Health Device Performance Details.
     * User experience analytics device performance details
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthDevicePerformanceDetails", alternate = {"UserExperienceAnalyticsAppHealthDevicePerformanceDetails"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage userExperienceAnalyticsAppHealthDevicePerformanceDetails;

    /**
     * The User Experience Analytics App Health OSVersion Performance.
     * User experience analytics appHealth OS version Performance
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOSVersionPerformance", alternate = {"UserExperienceAnalyticsAppHealthOSVersionPerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage userExperienceAnalyticsAppHealthOSVersionPerformance;

    /**
     * The User Experience Analytics App Health Overview.
     * User experience analytics appHealth overview
     */
    @SerializedName(value = "userExperienceAnalyticsAppHealthOverview", alternate = {"UserExperienceAnalyticsAppHealthOverview"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsCategory userExperienceAnalyticsAppHealthOverview;

    /**
     * The User Experience Analytics Baselines.
     * User experience analytics baselines
     */
    @SerializedName(value = "userExperienceAnalyticsBaselines", alternate = {"UserExperienceAnalyticsBaselines"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsBaselineCollectionPage userExperienceAnalyticsBaselines;

    /**
     * The User Experience Analytics Categories.
     * User experience analytics categories
     */
    @SerializedName(value = "userExperienceAnalyticsCategories", alternate = {"UserExperienceAnalyticsCategories"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionPage userExperienceAnalyticsCategories;

    /**
     * The User Experience Analytics Device Performance.
     * User experience analytics device performance
     */
    @SerializedName(value = "userExperienceAnalyticsDevicePerformance", alternate = {"UserExperienceAnalyticsDevicePerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceCollectionPage userExperienceAnalyticsDevicePerformance;

    /**
     * The User Experience Analytics Device Scores.
     * User experience analytics device scores
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceScores", alternate = {"UserExperienceAnalyticsDeviceScores"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresCollectionPage userExperienceAnalyticsDeviceScores;

    /**
     * The User Experience Analytics Device Startup History.
     * User experience analytics device Startup History
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupHistory", alternate = {"UserExperienceAnalyticsDeviceStartupHistory"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage userExperienceAnalyticsDeviceStartupHistory;

    /**
     * The User Experience Analytics Device Startup Processes.
     * User experience analytics device Startup Processes
     */
    @SerializedName(value = "userExperienceAnalyticsDeviceStartupProcesses", alternate = {"UserExperienceAnalyticsDeviceStartupProcesses"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessCollectionPage userExperienceAnalyticsDeviceStartupProcesses;

    /**
     * The User Experience Analytics Metric History.
     * User experience analytics metric history
     */
    @SerializedName(value = "userExperienceAnalyticsMetricHistory", alternate = {"UserExperienceAnalyticsMetricHistory"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryCollectionPage userExperienceAnalyticsMetricHistory;

    /**
     * The User Experience Analytics Model Scores.
     * User experience analytics model scores
     */
    @SerializedName(value = "userExperienceAnalyticsModelScores", alternate = {"UserExperienceAnalyticsModelScores"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsModelScoresCollectionPage userExperienceAnalyticsModelScores;

    /**
     * The User Experience Analytics Overview.
     * User experience analytics overview
     */
    @SerializedName(value = "userExperienceAnalyticsOverview", alternate = {"UserExperienceAnalyticsOverview"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;

    /**
     * The User Experience Analytics Score History.
     * User experience analytics device Startup Score History
     */
    @SerializedName(value = "userExperienceAnalyticsScoreHistory", alternate = {"UserExperienceAnalyticsScoreHistory"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryCollectionPage userExperienceAnalyticsScoreHistory;

    /**
     * The User Experience Analytics Work From Anywhere Hardware Readiness Metric.
     * User experience analytics work from anywhere hardware readiness metrics.
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", alternate = {"UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;

    /**
     * The User Experience Analytics Work From Anywhere Metrics.
     * User experience analytics work from anywhere metrics.
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereMetrics", alternate = {"UserExperienceAnalyticsWorkFromAnywhereMetrics"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage userExperienceAnalyticsWorkFromAnywhereMetrics;

    /**
     * The User Experience Analytics Work From Anywhere Model Performance.
     * The user experience analytics work from anywhere model performance
     */
    @SerializedName(value = "userExperienceAnalyticsWorkFromAnywhereModelPerformance", alternate = {"UserExperienceAnalyticsWorkFromAnywhereModelPerformance"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage userExperienceAnalyticsWorkFromAnywhereModelPerformance;

    /**
     * The Windows Malware Information.
     * The list of affected malware in the tenant.
     */
    @SerializedName(value = "windowsMalwareInformation", alternate = {"WindowsMalwareInformation"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WindowsMalwareInformationCollectionPage windowsMalwareInformation;

    /**
     * The Imported Windows Autopilot Device Identities.
     * Collection of imported Windows autopilot devices.
     */
    @SerializedName(value = "importedWindowsAutopilotDeviceIdentities", alternate = {"ImportedWindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage importedWindowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Device Identities.
     * The Windows autopilot device identities contained collection.
     */
    @SerializedName(value = "windowsAutopilotDeviceIdentities", alternate = {"WindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionPage windowsAutopilotDeviceIdentities;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName(value = "notificationMessageTemplates", alternate = {"NotificationMessageTemplates"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName(value = "resourceOperations", alternate = {"ResourceOperations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName(value = "remoteAssistancePartners", alternate = {"RemoteAssistancePartners"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Reports.
     * Reports singleton
     */
    @SerializedName(value = "reports", alternate = {"Reports"})
    @Expose
	@Nullable
    public DeviceManagementReports reports;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName(value = "telecomExpenseManagementPartners", alternate = {"TelecomExpenseManagementPartners"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName(value = "troubleshootingEvents", alternate = {"TroubleshootingEvents"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionAppLearningSummaries", alternate = {"WindowsInformationProtectionAppLearningSummaries"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionNetworkLearningSummaries", alternate = {"WindowsInformationProtectionNetworkLearningSummaries"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("termsAndConditions")) {
            termsAndConditions = serializer.deserializeObject(json.get("termsAndConditions"), com.microsoft.graph.requests.TermsAndConditionsCollectionPage.class);
        }

        if (json.has("auditEvents")) {
            auditEvents = serializer.deserializeObject(json.get("auditEvents"), com.microsoft.graph.requests.AuditEventCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicies")) {
            deviceCompliancePolicies = serializer.deserializeObject(json.get("deviceCompliancePolicies"), com.microsoft.graph.requests.DeviceCompliancePolicyCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries"), com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurations")) {
            deviceConfigurations = serializer.deserializeObject(json.get("deviceConfigurations"), com.microsoft.graph.requests.DeviceConfigurationCollectionPage.class);
        }

        if (json.has("iosUpdateStatuses")) {
            iosUpdateStatuses = serializer.deserializeObject(json.get("iosUpdateStatuses"), com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionPage.class);
        }

        if (json.has("complianceManagementPartners")) {
            complianceManagementPartners = serializer.deserializeObject(json.get("complianceManagementPartners"), com.microsoft.graph.requests.ComplianceManagementPartnerCollectionPage.class);
        }

        if (json.has("deviceCategories")) {
            deviceCategories = serializer.deserializeObject(json.get("deviceCategories"), com.microsoft.graph.requests.DeviceCategoryCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations"), com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("deviceManagementPartners")) {
            deviceManagementPartners = serializer.deserializeObject(json.get("deviceManagementPartners"), com.microsoft.graph.requests.DeviceManagementPartnerCollectionPage.class);
        }

        if (json.has("exchangeConnectors")) {
            exchangeConnectors = serializer.deserializeObject(json.get("exchangeConnectors"), com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionPage.class);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            mobileThreatDefenseConnectors = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors"), com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps"), com.microsoft.graph.requests.DetectedAppCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices"), com.microsoft.graph.requests.ManagedDeviceCollectionPage.class);
        }

        if (json.has("mobileAppTroubleshootingEvents")) {
            mobileAppTroubleshootingEvents = serializer.deserializeObject(json.get("mobileAppTroubleshootingEvents"), com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformance")) {
            userExperienceAnalyticsAppHealthApplicationPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion")) {
            userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDeviceModelPerformance")) {
            userExperienceAnalyticsAppHealthDeviceModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDeviceModelPerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformance")) {
            userExperienceAnalyticsAppHealthDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthDevicePerformanceDetails")) {
            userExperienceAnalyticsAppHealthDevicePerformanceDetails = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthDevicePerformanceDetails"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsAppHealthOSVersionPerformance")) {
            userExperienceAnalyticsAppHealthOSVersionPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsAppHealthOSVersionPerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsBaselines")) {
            userExperienceAnalyticsBaselines = serializer.deserializeObject(json.get("userExperienceAnalyticsBaselines"), com.microsoft.graph.requests.UserExperienceAnalyticsBaselineCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsCategories")) {
            userExperienceAnalyticsCategories = serializer.deserializeObject(json.get("userExperienceAnalyticsCategories"), com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDevicePerformance")) {
            userExperienceAnalyticsDevicePerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsDevicePerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsDevicePerformanceCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceScores")) {
            userExperienceAnalyticsDeviceScores = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceScores"), com.microsoft.graph.requests.UserExperienceAnalyticsDeviceScoresCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupHistory")) {
            userExperienceAnalyticsDeviceStartupHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupHistory"), com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsDeviceStartupProcesses")) {
            userExperienceAnalyticsDeviceStartupProcesses = serializer.deserializeObject(json.get("userExperienceAnalyticsDeviceStartupProcesses"), com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupProcessCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsMetricHistory")) {
            userExperienceAnalyticsMetricHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsMetricHistory"), com.microsoft.graph.requests.UserExperienceAnalyticsMetricHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsModelScores")) {
            userExperienceAnalyticsModelScores = serializer.deserializeObject(json.get("userExperienceAnalyticsModelScores"), com.microsoft.graph.requests.UserExperienceAnalyticsModelScoresCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsScoreHistory")) {
            userExperienceAnalyticsScoreHistory = serializer.deserializeObject(json.get("userExperienceAnalyticsScoreHistory"), com.microsoft.graph.requests.UserExperienceAnalyticsScoreHistoryCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsWorkFromAnywhereMetrics")) {
            userExperienceAnalyticsWorkFromAnywhereMetrics = serializer.deserializeObject(json.get("userExperienceAnalyticsWorkFromAnywhereMetrics"), com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereMetricCollectionPage.class);
        }

        if (json.has("userExperienceAnalyticsWorkFromAnywhereModelPerformance")) {
            userExperienceAnalyticsWorkFromAnywhereModelPerformance = serializer.deserializeObject(json.get("userExperienceAnalyticsWorkFromAnywhereModelPerformance"), com.microsoft.graph.requests.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceCollectionPage.class);
        }

        if (json.has("windowsMalwareInformation")) {
            windowsMalwareInformation = serializer.deserializeObject(json.get("windowsMalwareInformation"), com.microsoft.graph.requests.WindowsMalwareInformationCollectionPage.class);
        }

        if (json.has("importedWindowsAutopilotDeviceIdentities")) {
            importedWindowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("importedWindowsAutopilotDeviceIdentities"), com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeviceIdentities")) {
            windowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("windowsAutopilotDeviceIdentities"), com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("notificationMessageTemplates")) {
            notificationMessageTemplates = serializer.deserializeObject(json.get("notificationMessageTemplates"), com.microsoft.graph.requests.NotificationMessageTemplateCollectionPage.class);
        }

        if (json.has("resourceOperations")) {
            resourceOperations = serializer.deserializeObject(json.get("resourceOperations"), com.microsoft.graph.requests.ResourceOperationCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), com.microsoft.graph.requests.RoleDefinitionCollectionPage.class);
        }

        if (json.has("remoteAssistancePartners")) {
            remoteAssistancePartners = serializer.deserializeObject(json.get("remoteAssistancePartners"), com.microsoft.graph.requests.RemoteAssistancePartnerCollectionPage.class);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            telecomExpenseManagementPartners = serializer.deserializeObject(json.get("telecomExpenseManagementPartners"), com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionPage.class);
        }

        if (json.has("troubleshootingEvents")) {
            troubleshootingEvents = serializer.deserializeObject(json.get("troubleshootingEvents"), com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            windowsInformationProtectionAppLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries"), com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            windowsInformationProtectionNetworkLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries"), com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionPage.class);
        }
    }
}
