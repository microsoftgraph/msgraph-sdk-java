package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Singleton entity that acts as a container for all device management functionality.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagement extends Entity implements Parsable {
    /**
     * Apple push notification certificate.
     */
    private ApplePushNotificationCertificate applePushNotificationCertificate;
    /**
     * The Audit Events
     */
    private java.util.List<AuditEvent> auditEvents;
    /**
     * The list of Compliance Management Partners configured by the tenant.
     */
    private java.util.List<ComplianceManagementPartner> complianceManagementPartners;
    /**
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    private OnPremisesConditionalAccessSettings conditionalAccessSettings;
    /**
     * The list of detected apps associated with a device.
     */
    private java.util.List<DetectedApp> detectedApps;
    /**
     * The list of device categories with the tenant.
     */
    private java.util.List<DeviceCategory> deviceCategories;
    /**
     * The device compliance policies.
     */
    private java.util.List<DeviceCompliancePolicy> deviceCompliancePolicies;
    /**
     * The device compliance state summary for this account.
     */
    private DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;
    /**
     * The summary states of compliance policy settings for this account.
     */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> deviceCompliancePolicySettingStateSummaries;
    /**
     * The device configuration device state summary for this account.
     */
    private DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;
    /**
     * The device configurations.
     */
    private java.util.List<DeviceConfiguration> deviceConfigurations;
    /**
     * The list of device enrollment configurations
     */
    private java.util.List<DeviceEnrollmentConfiguration> deviceEnrollmentConfigurations;
    /**
     * The list of Device Management Partners configured by the tenant.
     */
    private java.util.List<DeviceManagementPartner> deviceManagementPartners;
    /**
     * Device protection overview.
     */
    private DeviceProtectionOverview deviceProtectionOverview;
    /**
     * The list of Exchange Connectors configured by the tenant.
     */
    private java.util.List<DeviceManagementExchangeConnector> exchangeConnectors;
    /**
     * Collection of imported Windows autopilot devices.
     */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities;
    /**
     * Intune Account Id for given tenant
     */
    private UUID intuneAccountId;
    /**
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    private IntuneBrand intuneBrand;
    /**
     * The IOS software update installation statuses for this account.
     */
    private java.util.List<IosUpdateDeviceStatus> iosUpdateStatuses;
    /**
     * Device overview
     */
    private ManagedDeviceOverview managedDeviceOverview;
    /**
     * The list of managed devices.
     */
    private java.util.List<ManagedDevice> managedDevices;
    /**
     * The collection property of MobileAppTroubleshootingEvent.
     */
    private java.util.List<MobileAppTroubleshootingEvent> mobileAppTroubleshootingEvents;
    /**
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    private java.util.List<MobileThreatDefenseConnector> mobileThreatDefenseConnectors;
    /**
     * The Notification Message Templates.
     */
    private java.util.List<NotificationMessageTemplate> notificationMessageTemplates;
    /**
     * The remote assist partners.
     */
    private java.util.List<RemoteAssistancePartner> remoteAssistancePartners;
    /**
     * Reports singleton
     */
    private DeviceManagementReports reports;
    /**
     * The Resource Operations.
     */
    private java.util.List<ResourceOperation> resourceOperations;
    /**
     * The Role Assignments.
     */
    private java.util.List<DeviceAndAppManagementRoleAssignment> roleAssignments;
    /**
     * The Role Definitions.
     */
    private java.util.List<RoleDefinition> roleDefinitions;
    /**
     * Account level settings.
     */
    private DeviceManagementSettings settings;
    /**
     * The software update status summary.
     */
    private SoftwareUpdateStatusSummary softwareUpdateStatusSummary;
    /**
     * Tenant mobile device management subscription state.
     */
    private DeviceManagementSubscriptionState subscriptionState;
    /**
     * The telecom expense management partners.
     */
    private java.util.List<TelecomExpenseManagementPartner> telecomExpenseManagementPartners;
    /**
     * The terms and conditions associated with device management of the company.
     */
    private java.util.List<TermsAndConditions> termsAndConditions;
    /**
     * The list of troubleshooting events for the tenant.
     */
    private java.util.List<DeviceManagementTroubleshootingEvent> troubleshootingEvents;
    /**
     * User experience analytics appHealth Application Performance
     */
    private java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> userExperienceAnalyticsAppHealthApplicationPerformance;
    /**
     * User experience analytics appHealth Application Performance by App Version details
     */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    /**
     * User experience analytics appHealth Application Performance by App Version Device Id
     */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    /**
     * User experience analytics appHealth Application Performance by OS Version
     */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    /**
     * User experience analytics appHealth Model Performance
     */
    private java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> userExperienceAnalyticsAppHealthDeviceModelPerformance;
    /**
     * User experience analytics appHealth Device Performance
     */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> userExperienceAnalyticsAppHealthDevicePerformance;
    /**
     * User experience analytics device performance details
     */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    /**
     * User experience analytics appHealth OS version Performance
     */
    private java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> userExperienceAnalyticsAppHealthOSVersionPerformance;
    /**
     * User experience analytics appHealth overview
     */
    private UserExperienceAnalyticsCategory userExperienceAnalyticsAppHealthOverview;
    /**
     * User experience analytics baselines
     */
    private java.util.List<UserExperienceAnalyticsBaseline> userExperienceAnalyticsBaselines;
    /**
     * User experience analytics categories
     */
    private java.util.List<UserExperienceAnalyticsCategory> userExperienceAnalyticsCategories;
    /**
     * User experience analytics device performance
     */
    private java.util.List<UserExperienceAnalyticsDevicePerformance> userExperienceAnalyticsDevicePerformance;
    /**
     * User experience analytics device scores
     */
    private java.util.List<UserExperienceAnalyticsDeviceScores> userExperienceAnalyticsDeviceScores;
    /**
     * User experience analytics device Startup History
     */
    private java.util.List<UserExperienceAnalyticsDeviceStartupHistory> userExperienceAnalyticsDeviceStartupHistory;
    /**
     * User experience analytics device Startup Processes
     */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcess> userExperienceAnalyticsDeviceStartupProcesses;
    /**
     * User experience analytics device Startup Process Performance
     */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> userExperienceAnalyticsDeviceStartupProcessPerformance;
    /**
     * User experience analytics metric history
     */
    private java.util.List<UserExperienceAnalyticsMetricHistory> userExperienceAnalyticsMetricHistory;
    /**
     * User experience analytics model scores
     */
    private java.util.List<UserExperienceAnalyticsModelScores> userExperienceAnalyticsModelScores;
    /**
     * User experience analytics overview
     */
    private UserExperienceAnalyticsOverview userExperienceAnalyticsOverview;
    /**
     * User experience analytics device Startup Score History
     */
    private java.util.List<UserExperienceAnalyticsScoreHistory> userExperienceAnalyticsScoreHistory;
    /**
     * User experience analytics device settings
     */
    private UserExperienceAnalyticsSettings userExperienceAnalyticsSettings;
    /**
     * User experience analytics work from anywhere hardware readiness metrics.
     */
    private UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    /**
     * User experience analytics work from anywhere metrics.
     */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> userExperienceAnalyticsWorkFromAnywhereMetrics;
    /**
     * The user experience analytics work from anywhere model performance
     */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    /**
     * The Windows autopilot device identities contained collection.
     */
    private java.util.List<WindowsAutopilotDeviceIdentity> windowsAutopilotDeviceIdentities;
    /**
     * The windows information protection app learning summaries.
     */
    private java.util.List<WindowsInformationProtectionAppLearningSummary> windowsInformationProtectionAppLearningSummaries;
    /**
     * The windows information protection network learning summaries.
     */
    private java.util.List<WindowsInformationProtectionNetworkLearningSummary> windowsInformationProtectionNetworkLearningSummaries;
    /**
     * The list of affected malware in the tenant.
     */
    private java.util.List<WindowsMalwareInformation> windowsMalwareInformation;
    /**
     * Malware overview for windows devices.
     */
    private WindowsMalwareOverview windowsMalwareOverview;
    /**
     * Instantiates a new DeviceManagement and sets the default values.
     */
    public DeviceManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagement
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagement();
    }
    /**
     * Gets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @return a ApplePushNotificationCertificate
     */
    @jakarta.annotation.Nullable
    public ApplePushNotificationCertificate getApplePushNotificationCertificate() {
        return this.applePushNotificationCertificate;
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a java.util.List<AuditEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a java.util.List<ComplianceManagementPartner>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this.complianceManagementPartners;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a OnPremisesConditionalAccessSettings
     */
    @jakarta.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this.conditionalAccessSettings;
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a java.util.List<DetectedApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.detectedApps;
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a java.util.List<DeviceCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this.deviceCategories;
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a java.util.List<DeviceCompliancePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this.deviceCompliancePolicies;
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a DeviceCompliancePolicyDeviceStateSummary
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this.deviceCompliancePolicyDeviceStateSummary;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a java.util.List<DeviceCompliancePolicySettingStateSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a DeviceConfigurationDeviceStateSummary
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this.deviceConfigurationDeviceStateSummaries;
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a java.util.List<DeviceConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this.deviceConfigurations;
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a java.util.List<DeviceEnrollmentConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this.deviceEnrollmentConfigurations;
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a java.util.List<DeviceManagementPartner>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this.deviceManagementPartners;
    }
    /**
     * Gets the deviceProtectionOverview property value. Device protection overview.
     * @return a DeviceProtectionOverview
     */
    @jakarta.annotation.Nullable
    public DeviceProtectionOverview getDeviceProtectionOverview() {
        return this.deviceProtectionOverview;
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a java.util.List<DeviceManagementExchangeConnector>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this.exchangeConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applePushNotificationCertificate", (n) -> { this.setApplePushNotificationCertificate(n.getObjectValue(ApplePushNotificationCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceManagementPartners", (n) -> { this.setComplianceManagementPartners(n.getCollectionOfObjectValues(ComplianceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessSettings", (n) -> { this.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedApps", (n) -> { this.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategories", (n) -> { this.setDeviceCategories(n.getCollectionOfObjectValues(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicies", (n) -> { this.setDeviceCompliancePolicies(n.getCollectionOfObjectValues(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicyDeviceStateSummary", (n) -> { this.setDeviceCompliancePolicyDeviceStateSummary(n.getObjectValue(DeviceCompliancePolicyDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicySettingStateSummaries", (n) -> { this.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationDeviceStateSummaries", (n) -> { this.setDeviceConfigurationDeviceStateSummaries(n.getObjectValue(DeviceConfigurationDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurations", (n) -> { this.setDeviceConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentConfigurations", (n) -> { this.setDeviceEnrollmentConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementPartners", (n) -> { this.setDeviceManagementPartners(n.getCollectionOfObjectValues(DeviceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceProtectionOverview", (n) -> { this.setDeviceProtectionOverview(n.getObjectValue(DeviceProtectionOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeConnectors", (n) -> { this.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("importedWindowsAutopilotDeviceIdentities", (n) -> { this.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneAccountId", (n) -> { this.setIntuneAccountId(n.getUUIDValue()); });
        deserializerMap.put("intuneBrand", (n) -> { this.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
        deserializerMap.put("iosUpdateStatuses", (n) -> { this.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceOverview", (n) -> { this.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppTroubleshootingEvents", (n) -> { this.setMobileAppTroubleshootingEvents(n.getCollectionOfObjectValues(MobileAppTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileThreatDefenseConnectors", (n) -> { this.setMobileThreatDefenseConnectors(n.getCollectionOfObjectValues(MobileThreatDefenseConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationMessageTemplates", (n) -> { this.setNotificationMessageTemplates(n.getCollectionOfObjectValues(NotificationMessageTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteAssistancePartners", (n) -> { this.setRemoteAssistancePartners(n.getCollectionOfObjectValues(RemoteAssistancePartner::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(DeviceManagementReports::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceOperations", (n) -> { this.setResourceOperations(n.getCollectionOfObjectValues(ResourceOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(DeviceAndAppManagementRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DeviceManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareUpdateStatusSummary", (n) -> { this.setSoftwareUpdateStatusSummary(n.getObjectValue(SoftwareUpdateStatusSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptionState", (n) -> { this.setSubscriptionState(n.getEnumValue(DeviceManagementSubscriptionState.class)); });
        deserializerMap.put("telecomExpenseManagementPartners", (n) -> { this.setTelecomExpenseManagementPartners(n.getCollectionOfObjectValues(TelecomExpenseManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getCollectionOfObjectValues(TermsAndConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("troubleshootingEvents", (n) -> { this.setTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthApplicationPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDeviceModelPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDeviceModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDeviceModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformanceDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformanceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOSVersionPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthOSVersionPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthOSVersionPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOverview", (n) -> { this.setUserExperienceAnalyticsAppHealthOverview(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBaselines", (n) -> { this.setUserExperienceAnalyticsBaselines(n.getCollectionOfObjectValues(UserExperienceAnalyticsBaseline::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsCategories", (n) -> { this.setUserExperienceAnalyticsCategories(n.getCollectionOfObjectValues(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDevicePerformance", (n) -> { this.setUserExperienceAnalyticsDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScores", (n) -> { this.setUserExperienceAnalyticsDeviceScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupHistory", (n) -> { this.setUserExperienceAnalyticsDeviceStartupHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcesses", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcesses(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcessPerformance", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcessPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcessPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsMetricHistory", (n) -> { this.setUserExperienceAnalyticsMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsModelScores", (n) -> { this.setUserExperienceAnalyticsModelScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsModelScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsOverview", (n) -> { this.setUserExperienceAnalyticsOverview(n.getObjectValue(UserExperienceAnalyticsOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsScoreHistory", (n) -> { this.setUserExperienceAnalyticsScoreHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsScoreHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsSettings", (n) -> { this.setUserExperienceAnalyticsSettings(n.getObjectValue(UserExperienceAnalyticsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereMetrics", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereMetrics(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereModelPerformance", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotDeviceIdentities", (n) -> { this.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionAppLearningSummaries", (n) -> { this.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { this.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareInformation", (n) -> { this.setWindowsMalwareInformation(n.getCollectionOfObjectValues(WindowsMalwareInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareOverview", (n) -> { this.setWindowsMalwareOverview(n.getObjectValue(WindowsMalwareOverview::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a java.util.List<ImportedWindowsAutopilotDeviceIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this.importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the intuneAccountId property value. Intune Account Id for given tenant
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getIntuneAccountId() {
        return this.intuneAccountId;
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a IntuneBrand
     */
    @jakarta.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this.intuneBrand;
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a java.util.List<IosUpdateDeviceStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this.iosUpdateStatuses;
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a ManagedDeviceOverview
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this.managedDeviceOverview;
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a java.util.List<ManagedDevice>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this.managedDevices;
    }
    /**
     * Gets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @return a java.util.List<MobileAppTroubleshootingEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingEvent> getMobileAppTroubleshootingEvents() {
        return this.mobileAppTroubleshootingEvents;
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a java.util.List<MobileThreatDefenseConnector>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this.mobileThreatDefenseConnectors;
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a java.util.List<NotificationMessageTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this.notificationMessageTemplates;
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a java.util.List<RemoteAssistancePartner>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this.remoteAssistancePartners;
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a DeviceManagementReports
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this.reports;
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a java.util.List<ResourceOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this.resourceOperations;
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a java.util.List<DeviceAndAppManagementRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a java.util.List<RoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a DeviceManagementSettings
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a SoftwareUpdateStatusSummary
     */
    @jakarta.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this.softwareUpdateStatusSummary;
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state.
     * @return a DeviceManagementSubscriptionState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a java.util.List<TelecomExpenseManagementPartner>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this.telecomExpenseManagementPartners;
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a java.util.List<TermsAndConditions>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this.termsAndConditions;
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a java.util.List<DeviceManagementTroubleshootingEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this.troubleshootingEvents;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @return a java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> getUserExperienceAnalyticsAppHealthApplicationPerformance() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @return a java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @return a java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @return a java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return this.userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @return a java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> getUserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return this.userExperienceAnalyticsAppHealthDeviceModelPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @return a java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> getUserExperienceAnalyticsAppHealthDevicePerformance() {
        return this.userExperienceAnalyticsAppHealthDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @return a java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> getUserExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return this.userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @return a java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> getUserExperienceAnalyticsAppHealthOSVersionPerformance() {
        return this.userExperienceAnalyticsAppHealthOSVersionPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getUserExperienceAnalyticsAppHealthOverview() {
        return this.userExperienceAnalyticsAppHealthOverview;
    }
    /**
     * Gets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @return a java.util.List<UserExperienceAnalyticsBaseline>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBaseline> getUserExperienceAnalyticsBaselines() {
        return this.userExperienceAnalyticsBaselines;
    }
    /**
     * Gets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @return a java.util.List<UserExperienceAnalyticsCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsCategory> getUserExperienceAnalyticsCategories() {
        return this.userExperienceAnalyticsCategories;
    }
    /**
     * Gets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @return a java.util.List<UserExperienceAnalyticsDevicePerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDevicePerformance> getUserExperienceAnalyticsDevicePerformance() {
        return this.userExperienceAnalyticsDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @return a java.util.List<UserExperienceAnalyticsDeviceScores>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScores> getUserExperienceAnalyticsDeviceScores() {
        return this.userExperienceAnalyticsDeviceScores;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @return a java.util.List<UserExperienceAnalyticsDeviceStartupHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupHistory> getUserExperienceAnalyticsDeviceStartupHistory() {
        return this.userExperienceAnalyticsDeviceStartupHistory;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @return a java.util.List<UserExperienceAnalyticsDeviceStartupProcess>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcess> getUserExperienceAnalyticsDeviceStartupProcesses() {
        return this.userExperienceAnalyticsDeviceStartupProcesses;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @return a java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> getUserExperienceAnalyticsDeviceStartupProcessPerformance() {
        return this.userExperienceAnalyticsDeviceStartupProcessPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @return a java.util.List<UserExperienceAnalyticsMetricHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsMetricHistory() {
        return this.userExperienceAnalyticsMetricHistory;
    }
    /**
     * Gets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @return a java.util.List<UserExperienceAnalyticsModelScores>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsModelScores> getUserExperienceAnalyticsModelScores() {
        return this.userExperienceAnalyticsModelScores;
    }
    /**
     * Gets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @return a UserExperienceAnalyticsOverview
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsOverview getUserExperienceAnalyticsOverview() {
        return this.userExperienceAnalyticsOverview;
    }
    /**
     * Gets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @return a java.util.List<UserExperienceAnalyticsScoreHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsScoreHistory> getUserExperienceAnalyticsScoreHistory() {
        return this.userExperienceAnalyticsScoreHistory;
    }
    /**
     * Gets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @return a UserExperienceAnalyticsSettings
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsSettings getUserExperienceAnalyticsSettings() {
        return this.userExperienceAnalyticsSettings;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @return a UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return this.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @return a java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> getUserExperienceAnalyticsWorkFromAnywhereMetrics() {
        return this.userExperienceAnalyticsWorkFromAnywhereMetrics;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @return a java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> getUserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return this.userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a java.util.List<WindowsAutopilotDeviceIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this.windowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a java.util.List<WindowsInformationProtectionAppLearningSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this.windowsInformationProtectionAppLearningSummaries;
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a java.util.List<WindowsInformationProtectionNetworkLearningSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this.windowsInformationProtectionNetworkLearningSummaries;
    }
    /**
     * Gets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @return a java.util.List<WindowsMalwareInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsMalwareInformation> getWindowsMalwareInformation() {
        return this.windowsMalwareInformation;
    }
    /**
     * Gets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @return a WindowsMalwareOverview
     */
    @jakarta.annotation.Nullable
    public WindowsMalwareOverview getWindowsMalwareOverview() {
        return this.windowsMalwareOverview;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applePushNotificationCertificate", this.getApplePushNotificationCertificate());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("complianceManagementPartners", this.getComplianceManagementPartners());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeCollectionOfObjectValues("detectedApps", this.getDetectedApps());
        writer.writeCollectionOfObjectValues("deviceCategories", this.getDeviceCategories());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicies", this.getDeviceCompliancePolicies());
        writer.writeObjectValue("deviceCompliancePolicyDeviceStateSummary", this.getDeviceCompliancePolicyDeviceStateSummary());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeObjectValue("deviceConfigurationDeviceStateSummaries", this.getDeviceConfigurationDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceConfigurations", this.getDeviceConfigurations());
        writer.writeCollectionOfObjectValues("deviceEnrollmentConfigurations", this.getDeviceEnrollmentConfigurations());
        writer.writeCollectionOfObjectValues("deviceManagementPartners", this.getDeviceManagementPartners());
        writer.writeObjectValue("deviceProtectionOverview", this.getDeviceProtectionOverview());
        writer.writeCollectionOfObjectValues("exchangeConnectors", this.getExchangeConnectors());
        writer.writeCollectionOfObjectValues("importedWindowsAutopilotDeviceIdentities", this.getImportedWindowsAutopilotDeviceIdentities());
        writer.writeUUIDValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeObjectValue("intuneBrand", this.getIntuneBrand());
        writer.writeCollectionOfObjectValues("iosUpdateStatuses", this.getIosUpdateStatuses());
        writer.writeObjectValue("managedDeviceOverview", this.getManagedDeviceOverview());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeCollectionOfObjectValues("mobileAppTroubleshootingEvents", this.getMobileAppTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("mobileThreatDefenseConnectors", this.getMobileThreatDefenseConnectors());
        writer.writeCollectionOfObjectValues("notificationMessageTemplates", this.getNotificationMessageTemplates());
        writer.writeCollectionOfObjectValues("remoteAssistancePartners", this.getRemoteAssistancePartners());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeCollectionOfObjectValues("resourceOperations", this.getResourceOperations());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("softwareUpdateStatusSummary", this.getSoftwareUpdateStatusSummary());
        writer.writeEnumValue("subscriptionState", this.getSubscriptionState());
        writer.writeCollectionOfObjectValues("telecomExpenseManagementPartners", this.getTelecomExpenseManagementPartners());
        writer.writeCollectionOfObjectValues("termsAndConditions", this.getTermsAndConditions());
        writer.writeCollectionOfObjectValues("troubleshootingEvents", this.getTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformance", this.getUserExperienceAnalyticsAppHealthApplicationPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDeviceModelPerformance", this.getUserExperienceAnalyticsAppHealthDeviceModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformance", this.getUserExperienceAnalyticsAppHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformanceDetails", this.getUserExperienceAnalyticsAppHealthDevicePerformanceDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthOSVersionPerformance", this.getUserExperienceAnalyticsAppHealthOSVersionPerformance());
        writer.writeObjectValue("userExperienceAnalyticsAppHealthOverview", this.getUserExperienceAnalyticsAppHealthOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBaselines", this.getUserExperienceAnalyticsBaselines());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsCategories", this.getUserExperienceAnalyticsCategories());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicePerformance", this.getUserExperienceAnalyticsDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScores", this.getUserExperienceAnalyticsDeviceScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupHistory", this.getUserExperienceAnalyticsDeviceStartupHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcesses", this.getUserExperienceAnalyticsDeviceStartupProcesses());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcessPerformance", this.getUserExperienceAnalyticsDeviceStartupProcessPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsMetricHistory", this.getUserExperienceAnalyticsMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsModelScores", this.getUserExperienceAnalyticsModelScores());
        writer.writeObjectValue("userExperienceAnalyticsOverview", this.getUserExperienceAnalyticsOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsScoreHistory", this.getUserExperienceAnalyticsScoreHistory());
        writer.writeObjectValue("userExperienceAnalyticsSettings", this.getUserExperienceAnalyticsSettings());
        writer.writeObjectValue("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", this.getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereMetrics", this.getUserExperienceAnalyticsWorkFromAnywhereMetrics());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereModelPerformance", this.getUserExperienceAnalyticsWorkFromAnywhereModelPerformance());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeviceIdentities", this.getWindowsAutopilotDeviceIdentities());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionAppLearningSummaries", this.getWindowsInformationProtectionAppLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionNetworkLearningSummaries", this.getWindowsInformationProtectionNetworkLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsMalwareInformation", this.getWindowsMalwareInformation());
        writer.writeObjectValue("windowsMalwareOverview", this.getWindowsMalwareOverview());
    }
    /**
     * Sets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @param value Value to set for the applePushNotificationCertificate property.
     */
    public void setApplePushNotificationCertificate(@jakarta.annotation.Nullable final ApplePushNotificationCertificate value) {
        this.applePushNotificationCertificate = value;
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     */
    public void setComplianceManagementPartners(@jakarta.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this.complianceManagementPartners = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     */
    public void setConditionalAccessSettings(@jakarta.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this.conditionalAccessSettings = value;
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     */
    public void setDetectedApps(@jakarta.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.detectedApps = value;
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     */
    public void setDeviceCategories(@jakarta.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this.deviceCategories = value;
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     */
    public void setDeviceCompliancePolicies(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this.deviceCompliancePolicies = value;
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     */
    public void setDeviceCompliancePolicyDeviceStateSummary(@jakarta.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this.deviceCompliancePolicyDeviceStateSummary = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     */
    public void setDeviceCompliancePolicySettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     */
    public void setDeviceConfigurationDeviceStateSummaries(@jakarta.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this.deviceConfigurationDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     */
    public void setDeviceConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this.deviceConfigurations = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     */
    public void setDeviceEnrollmentConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this.deviceEnrollmentConfigurations = value;
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     */
    public void setDeviceManagementPartners(@jakarta.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this.deviceManagementPartners = value;
    }
    /**
     * Sets the deviceProtectionOverview property value. Device protection overview.
     * @param value Value to set for the deviceProtectionOverview property.
     */
    public void setDeviceProtectionOverview(@jakarta.annotation.Nullable final DeviceProtectionOverview value) {
        this.deviceProtectionOverview = value;
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     */
    public void setExchangeConnectors(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this.exchangeConnectors = value;
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     */
    public void setImportedWindowsAutopilotDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this.importedWindowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the intuneAccountId property value. Intune Account Id for given tenant
     * @param value Value to set for the intuneAccountId property.
     */
    public void setIntuneAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.intuneAccountId = value;
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     */
    public void setIntuneBrand(@jakarta.annotation.Nullable final IntuneBrand value) {
        this.intuneBrand = value;
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     */
    public void setIosUpdateStatuses(@jakarta.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this.iosUpdateStatuses = value;
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     */
    public void setManagedDeviceOverview(@jakarta.annotation.Nullable final ManagedDeviceOverview value) {
        this.managedDeviceOverview = value;
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     */
    public void setManagedDevices(@jakarta.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.managedDevices = value;
    }
    /**
     * Sets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @param value Value to set for the mobileAppTroubleshootingEvents property.
     */
    public void setMobileAppTroubleshootingEvents(@jakarta.annotation.Nullable final java.util.List<MobileAppTroubleshootingEvent> value) {
        this.mobileAppTroubleshootingEvents = value;
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     */
    public void setMobileThreatDefenseConnectors(@jakarta.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this.mobileThreatDefenseConnectors = value;
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     */
    public void setNotificationMessageTemplates(@jakarta.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this.notificationMessageTemplates = value;
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     */
    public void setRemoteAssistancePartners(@jakarta.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this.remoteAssistancePartners = value;
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final DeviceManagementReports value) {
        this.reports = value;
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     */
    public void setResourceOperations(@jakarta.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this.resourceOperations = value;
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DeviceManagementSettings value) {
        this.settings = value;
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     */
    public void setSoftwareUpdateStatusSummary(@jakarta.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this.softwareUpdateStatusSummary = value;
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state.
     * @param value Value to set for the subscriptionState property.
     */
    public void setSubscriptionState(@jakarta.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this.subscriptionState = value;
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     */
    public void setTelecomExpenseManagementPartners(@jakarta.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this.telecomExpenseManagementPartners = value;
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     */
    public void setTermsAndConditions(@jakarta.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this.termsAndConditions = value;
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     */
    public void setTroubleshootingEvents(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this.troubleshootingEvents = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> value) {
        this.userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDeviceModelPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthDeviceModelPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> value) {
        this.userExperienceAnalyticsAppHealthDeviceModelPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> value) {
        this.userExperienceAnalyticsAppHealthDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformanceDetails property.
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> value) {
        this.userExperienceAnalyticsAppHealthDevicePerformanceDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthOSVersionPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthOSVersionPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> value) {
        this.userExperienceAnalyticsAppHealthOSVersionPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @param value Value to set for the userExperienceAnalyticsAppHealthOverview property.
     */
    public void setUserExperienceAnalyticsAppHealthOverview(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.userExperienceAnalyticsAppHealthOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @param value Value to set for the userExperienceAnalyticsBaselines property.
     */
    public void setUserExperienceAnalyticsBaselines(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBaseline> value) {
        this.userExperienceAnalyticsBaselines = value;
    }
    /**
     * Sets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @param value Value to set for the userExperienceAnalyticsCategories property.
     */
    public void setUserExperienceAnalyticsCategories(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsCategory> value) {
        this.userExperienceAnalyticsCategories = value;
    }
    /**
     * Sets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @param value Value to set for the userExperienceAnalyticsDevicePerformance property.
     */
    public void setUserExperienceAnalyticsDevicePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDevicePerformance> value) {
        this.userExperienceAnalyticsDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @param value Value to set for the userExperienceAnalyticsDeviceScores property.
     */
    public void setUserExperienceAnalyticsDeviceScores(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScores> value) {
        this.userExperienceAnalyticsDeviceScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupHistory property.
     */
    public void setUserExperienceAnalyticsDeviceStartupHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupHistory> value) {
        this.userExperienceAnalyticsDeviceStartupHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcesses property.
     */
    public void setUserExperienceAnalyticsDeviceStartupProcesses(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcess> value) {
        this.userExperienceAnalyticsDeviceStartupProcesses = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcessPerformance property.
     */
    public void setUserExperienceAnalyticsDeviceStartupProcessPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> value) {
        this.userExperienceAnalyticsDeviceStartupProcessPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @param value Value to set for the userExperienceAnalyticsMetricHistory property.
     */
    public void setUserExperienceAnalyticsMetricHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this.userExperienceAnalyticsMetricHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @param value Value to set for the userExperienceAnalyticsModelScores property.
     */
    public void setUserExperienceAnalyticsModelScores(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsModelScores> value) {
        this.userExperienceAnalyticsModelScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @param value Value to set for the userExperienceAnalyticsOverview property.
     */
    public void setUserExperienceAnalyticsOverview(@jakarta.annotation.Nullable final UserExperienceAnalyticsOverview value) {
        this.userExperienceAnalyticsOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @param value Value to set for the userExperienceAnalyticsScoreHistory property.
     */
    public void setUserExperienceAnalyticsScoreHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsScoreHistory> value) {
        this.userExperienceAnalyticsScoreHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @param value Value to set for the userExperienceAnalyticsSettings property.
     */
    public void setUserExperienceAnalyticsSettings(@jakarta.annotation.Nullable final UserExperienceAnalyticsSettings value) {
        this.userExperienceAnalyticsSettings = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric value) {
        this.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereMetrics property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereMetrics(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> value) {
        this.userExperienceAnalyticsWorkFromAnywhereMetrics = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereModelPerformance property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> value) {
        this.userExperienceAnalyticsWorkFromAnywhereModelPerformance = value;
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     */
    public void setWindowsAutopilotDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this.windowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     */
    public void setWindowsInformationProtectionAppLearningSummaries(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this.windowsInformationProtectionAppLearningSummaries = value;
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     */
    public void setWindowsInformationProtectionNetworkLearningSummaries(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this.windowsInformationProtectionNetworkLearningSummaries = value;
    }
    /**
     * Sets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @param value Value to set for the windowsMalwareInformation property.
     */
    public void setWindowsMalwareInformation(@jakarta.annotation.Nullable final java.util.List<WindowsMalwareInformation> value) {
        this.windowsMalwareInformation = value;
    }
    /**
     * Sets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @param value Value to set for the windowsMalwareOverview property.
     */
    public void setWindowsMalwareOverview(@jakarta.annotation.Nullable final WindowsMalwareOverview value) {
        this.windowsMalwareOverview = value;
    }
}
