package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class DeviceManagement extends Entity implements Parsable {
    /** Apple push notification certificate. */
    private ApplePushNotificationCertificate applePushNotificationCertificate;
    /** The Audit Events */
    private java.util.List<AuditEvent> auditEvents;
    /** The list of Compliance Management Partners configured by the tenant. */
    private java.util.List<ComplianceManagementPartner> complianceManagementPartners;
    /** The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access */
    private OnPremisesConditionalAccessSettings conditionalAccessSettings;
    /** The list of detected apps associated with a device. */
    private java.util.List<DetectedApp> detectedApps;
    /** The list of device categories with the tenant. */
    private java.util.List<DeviceCategory> deviceCategories;
    /** The device compliance policies. */
    private java.util.List<DeviceCompliancePolicy> deviceCompliancePolicies;
    /** The device compliance state summary for this account. */
    private DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;
    /** The summary states of compliance policy settings for this account. */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> deviceCompliancePolicySettingStateSummaries;
    /** The device configuration device state summary for this account. */
    private DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;
    /** The device configurations. */
    private java.util.List<DeviceConfiguration> deviceConfigurations;
    /** The list of device enrollment configurations */
    private java.util.List<DeviceEnrollmentConfiguration> deviceEnrollmentConfigurations;
    /** The list of Device Management Partners configured by the tenant. */
    private java.util.List<DeviceManagementPartner> deviceManagementPartners;
    /** The list of Exchange Connectors configured by the tenant. */
    private java.util.List<DeviceManagementExchangeConnector> exchangeConnectors;
    /** Collection of imported Windows autopilot devices. */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities;
    /** Intune Account Id for given tenant */
    private UUID intuneAccountId;
    /** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
    private IntuneBrand intuneBrand;
    /** The IOS software update installation statuses for this account. */
    private java.util.List<IosUpdateDeviceStatus> iosUpdateStatuses;
    /** Device overview */
    private ManagedDeviceOverview managedDeviceOverview;
    /** The list of managed devices. */
    private java.util.List<ManagedDevice> managedDevices;
    /** The list of Mobile threat Defense connectors configured by the tenant. */
    private java.util.List<MobileThreatDefenseConnector> mobileThreatDefenseConnectors;
    /** The Notification Message Templates. */
    private java.util.List<NotificationMessageTemplate> notificationMessageTemplates;
    /** The remote assist partners. */
    private java.util.List<RemoteAssistancePartner> remoteAssistancePartners;
    /** Reports singleton */
    private DeviceManagementReports reports;
    /** The Resource Operations. */
    private java.util.List<ResourceOperation> resourceOperations;
    /** The Role Assignments. */
    private java.util.List<DeviceAndAppManagementRoleAssignment> roleAssignments;
    /** The Role Definitions. */
    private java.util.List<RoleDefinition> roleDefinitions;
    /** Account level settings. */
    private DeviceManagementSettings settings;
    /** The software update status summary. */
    private SoftwareUpdateStatusSummary softwareUpdateStatusSummary;
    /** Tenant mobile device management subscription state. */
    private DeviceManagementSubscriptionState subscriptionState;
    /** The telecom expense management partners. */
    private java.util.List<TelecomExpenseManagementPartner> telecomExpenseManagementPartners;
    /** The terms and conditions associated with device management of the company. */
    private java.util.List<TermsAndConditions> termsAndConditions;
    /** The list of troubleshooting events for the tenant. */
    private java.util.List<DeviceManagementTroubleshootingEvent> troubleshootingEvents;
    /** The Windows autopilot device identities contained collection. */
    private java.util.List<WindowsAutopilotDeviceIdentity> windowsAutopilotDeviceIdentities;
    /** The windows information protection app learning summaries. */
    private java.util.List<WindowsInformationProtectionAppLearningSummary> windowsInformationProtectionAppLearningSummaries;
    /** The windows information protection network learning summaries. */
    private java.util.List<WindowsInformationProtectionNetworkLearningSummary> windowsInformationProtectionNetworkLearningSummaries;
    /**
     * Instantiates a new DeviceManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagement
     */
    @javax.annotation.Nonnull
    public static DeviceManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagement();
    }
    /**
     * Gets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @return a applePushNotificationCertificate
     */
    @javax.annotation.Nullable
    public ApplePushNotificationCertificate getApplePushNotificationCertificate() {
        return this.applePushNotificationCertificate;
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a auditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a complianceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this.complianceManagementPartners;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this.conditionalAccessSettings;
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.detectedApps;
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this.deviceCategories;
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a deviceCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this.deviceCompliancePolicies;
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a deviceCompliancePolicyDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this.deviceCompliancePolicyDeviceStateSummary;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a deviceConfigurationDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this.deviceConfigurationDeviceStateSummaries;
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this.deviceConfigurations;
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this.deviceEnrollmentConfigurations;
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a deviceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this.deviceManagementPartners;
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a deviceManagementExchangeConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this.exchangeConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("exchangeConnectors", (n) -> { this.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("importedWindowsAutopilotDeviceIdentities", (n) -> { this.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneAccountId", (n) -> { this.setIntuneAccountId(n.getUUIDValue()); });
        deserializerMap.put("intuneBrand", (n) -> { this.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
        deserializerMap.put("iosUpdateStatuses", (n) -> { this.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceOverview", (n) -> { this.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
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
        deserializerMap.put("windowsAutopilotDeviceIdentities", (n) -> { this.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionAppLearningSummaries", (n) -> { this.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { this.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this.importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the intuneAccountId property value. Intune Account Id for given tenant
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getIntuneAccountId() {
        return this.intuneAccountId;
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a intuneBrand
     */
    @javax.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this.intuneBrand;
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a iosUpdateDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this.iosUpdateStatuses;
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a managedDeviceOverview
     */
    @javax.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this.managedDeviceOverview;
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this.managedDevices;
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this.mobileThreatDefenseConnectors;
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a notificationMessageTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this.notificationMessageTemplates;
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a remoteAssistancePartner
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this.remoteAssistancePartners;
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a deviceManagementReports
     */
    @javax.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this.reports;
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a resourceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this.resourceOperations;
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a deviceAndAppManagementRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a softwareUpdateStatusSummary
     */
    @javax.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this.softwareUpdateStatusSummary;
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state.
     * @return a deviceManagementSubscriptionState
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a telecomExpenseManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this.telecomExpenseManagementPartners;
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this.termsAndConditions;
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a deviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this.troubleshootingEvents;
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this.windowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this.windowsInformationProtectionAppLearningSummaries;
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a windowsInformationProtectionNetworkLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this.windowsInformationProtectionNetworkLearningSummaries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfObjectValues("exchangeConnectors", this.getExchangeConnectors());
        writer.writeCollectionOfObjectValues("importedWindowsAutopilotDeviceIdentities", this.getImportedWindowsAutopilotDeviceIdentities());
        writer.writeUUIDValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeObjectValue("intuneBrand", this.getIntuneBrand());
        writer.writeCollectionOfObjectValues("iosUpdateStatuses", this.getIosUpdateStatuses());
        writer.writeObjectValue("managedDeviceOverview", this.getManagedDeviceOverview());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
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
        writer.writeCollectionOfObjectValues("windowsAutopilotDeviceIdentities", this.getWindowsAutopilotDeviceIdentities());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionAppLearningSummaries", this.getWindowsInformationProtectionAppLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionNetworkLearningSummaries", this.getWindowsInformationProtectionNetworkLearningSummaries());
    }
    /**
     * Sets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @param value Value to set for the applePushNotificationCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplePushNotificationCertificate(@javax.annotation.Nullable final ApplePushNotificationCertificate value) {
        this.applePushNotificationCertificate = value;
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceManagementPartners(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this.complianceManagementPartners = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessSettings(@javax.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this.conditionalAccessSettings = value;
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.detectedApps = value;
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategories(@javax.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this.deviceCategories = value;
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this.deviceCompliancePolicies = value;
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicyDeviceStateSummary(@javax.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this.deviceCompliancePolicyDeviceStateSummary = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicySettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationDeviceStateSummaries(@javax.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this.deviceConfigurationDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurations(@javax.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this.deviceConfigurations = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentConfigurations(@javax.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this.deviceEnrollmentConfigurations = value;
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementPartners(@javax.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this.deviceManagementPartners = value;
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this.exchangeConnectors = value;
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this.importedWindowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the intuneAccountId property value. Intune Account Id for given tenant
     * @param value Value to set for the intuneAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneAccountId(@javax.annotation.Nullable final UUID value) {
        this.intuneAccountId = value;
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneBrand(@javax.annotation.Nullable final IntuneBrand value) {
        this.intuneBrand = value;
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosUpdateStatuses(@javax.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this.iosUpdateStatuses = value;
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceOverview(@javax.annotation.Nullable final ManagedDeviceOverview value) {
        this.managedDeviceOverview = value;
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.managedDevices = value;
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileThreatDefenseConnectors(@javax.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this.mobileThreatDefenseConnectors = value;
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationMessageTemplates(@javax.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this.notificationMessageTemplates = value;
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistancePartners(@javax.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this.remoteAssistancePartners = value;
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReports(@javax.annotation.Nullable final DeviceManagementReports value) {
        this.reports = value;
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceOperations(@javax.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this.resourceOperations = value;
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final DeviceManagementSettings value) {
        this.settings = value;
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateStatusSummary(@javax.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this.softwareUpdateStatusSummary = value;
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state.
     * @param value Value to set for the subscriptionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionState(@javax.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this.subscriptionState = value;
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTelecomExpenseManagementPartners(@javax.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this.telecomExpenseManagementPartners = value;
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAndConditions(@javax.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this.termsAndConditions = value;
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this.troubleshootingEvents = value;
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this.windowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionAppLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this.windowsInformationProtectionAppLearningSummaries = value;
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionNetworkLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this.windowsInformationProtectionNetworkLearningSummaries = value;
    }
}
