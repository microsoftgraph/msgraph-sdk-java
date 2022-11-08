package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagement extends Entity implements Parsable {
    /** Apple push notification certificate. */
    private ApplePushNotificationCertificate _applePushNotificationCertificate;
    /** The Audit Events */
    private java.util.List<AuditEvent> _auditEvents;
    /** The list of Compliance Management Partners configured by the tenant. */
    private java.util.List<ComplianceManagementPartner> _complianceManagementPartners;
    /** The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access */
    private OnPremisesConditionalAccessSettings _conditionalAccessSettings;
    /** The list of detected apps associated with a device. */
    private java.util.List<DetectedApp> _detectedApps;
    /** The list of device categories with the tenant. */
    private java.util.List<DeviceCategory> _deviceCategories;
    /** The device compliance policies. */
    private java.util.List<DeviceCompliancePolicy> _deviceCompliancePolicies;
    /** The device compliance state summary for this account. */
    private DeviceCompliancePolicyDeviceStateSummary _deviceCompliancePolicyDeviceStateSummary;
    /** The summary states of compliance policy settings for this account. */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> _deviceCompliancePolicySettingStateSummaries;
    /** The device configuration device state summary for this account. */
    private DeviceConfigurationDeviceStateSummary _deviceConfigurationDeviceStateSummaries;
    /** The device configurations. */
    private java.util.List<DeviceConfiguration> _deviceConfigurations;
    /** The list of device enrollment configurations */
    private java.util.List<DeviceEnrollmentConfiguration> _deviceEnrollmentConfigurations;
    /** The list of Device Management Partners configured by the tenant. */
    private java.util.List<DeviceManagementPartner> _deviceManagementPartners;
    /** The list of Exchange Connectors configured by the tenant. */
    private java.util.List<DeviceManagementExchangeConnector> _exchangeConnectors;
    /** Collection of imported Windows autopilot devices. */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> _importedWindowsAutopilotDeviceIdentities;
    /** Intune Account Id for given tenant */
    private String _intuneAccountId;
    /** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
    private IntuneBrand _intuneBrand;
    /** The IOS software update installation statuses for this account. */
    private java.util.List<IosUpdateDeviceStatus> _iosUpdateStatuses;
    /** Device overview */
    private ManagedDeviceOverview _managedDeviceOverview;
    /** The list of managed devices. */
    private java.util.List<ManagedDevice> _managedDevices;
    /** The list of Mobile threat Defense connectors configured by the tenant. */
    private java.util.List<MobileThreatDefenseConnector> _mobileThreatDefenseConnectors;
    /** The Notification Message Templates. */
    private java.util.List<NotificationMessageTemplate> _notificationMessageTemplates;
    /** The remote assist partners. */
    private java.util.List<RemoteAssistancePartner> _remoteAssistancePartners;
    /** Reports singleton */
    private DeviceManagementReports _reports;
    /** The Resource Operations. */
    private java.util.List<ResourceOperation> _resourceOperations;
    /** The Role Assignments. */
    private java.util.List<DeviceAndAppManagementRoleAssignment> _roleAssignments;
    /** The Role Definitions. */
    private java.util.List<RoleDefinition> _roleDefinitions;
    /** Account level settings. */
    private DeviceManagementSettings _settings;
    /** The software update status summary. */
    private SoftwareUpdateStatusSummary _softwareUpdateStatusSummary;
    /** Tenant mobile device management subscription state. */
    private DeviceManagementSubscriptionState _subscriptionState;
    /** The telecom expense management partners. */
    private java.util.List<TelecomExpenseManagementPartner> _telecomExpenseManagementPartners;
    /** The terms and conditions associated with device management of the company. */
    private java.util.List<TermsAndConditions> _termsAndConditions;
    /** The list of troubleshooting events for the tenant. */
    private java.util.List<DeviceManagementTroubleshootingEvent> _troubleshootingEvents;
    /** The Windows autopilot device identities contained collection. */
    private java.util.List<WindowsAutopilotDeviceIdentity> _windowsAutopilotDeviceIdentities;
    /** The windows information protection app learning summaries. */
    private java.util.List<WindowsInformationProtectionAppLearningSummary> _windowsInformationProtectionAppLearningSummaries;
    /** The windows information protection network learning summaries. */
    private java.util.List<WindowsInformationProtectionNetworkLearningSummary> _windowsInformationProtectionNetworkLearningSummaries;
    /**
     * Instantiates a new DeviceManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagement() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagement");
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
        return this._applePushNotificationCertificate;
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a auditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this._auditEvents;
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a complianceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this._complianceManagementPartners;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this._conditionalAccessSettings;
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this._detectedApps;
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this._deviceCategories;
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a deviceCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this._deviceCompliancePolicies;
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a deviceCompliancePolicyDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this._deviceCompliancePolicyDeviceStateSummary;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this._deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a deviceConfigurationDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this._deviceConfigurationDeviceStateSummaries;
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this._deviceConfigurations;
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this._deviceEnrollmentConfigurations;
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a deviceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this._deviceManagementPartners;
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a deviceManagementExchangeConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this._exchangeConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagement currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applePushNotificationCertificate", (n) -> { currentObject.setApplePushNotificationCertificate(n.getObjectValue(ApplePushNotificationCertificate::createFromDiscriminatorValue)); });
            this.put("auditEvents", (n) -> { currentObject.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
            this.put("complianceManagementPartners", (n) -> { currentObject.setComplianceManagementPartners(n.getCollectionOfObjectValues(ComplianceManagementPartner::createFromDiscriminatorValue)); });
            this.put("conditionalAccessSettings", (n) -> { currentObject.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
            this.put("detectedApps", (n) -> { currentObject.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
            this.put("deviceCategories", (n) -> { currentObject.setDeviceCategories(n.getCollectionOfObjectValues(DeviceCategory::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicies", (n) -> { currentObject.setDeviceCompliancePolicies(n.getCollectionOfObjectValues(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicyDeviceStateSummary", (n) -> { currentObject.setDeviceCompliancePolicyDeviceStateSummary(n.getObjectValue(DeviceCompliancePolicyDeviceStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicySettingStateSummaries", (n) -> { currentObject.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationDeviceStateSummaries", (n) -> { currentObject.setDeviceConfigurationDeviceStateSummaries(n.getObjectValue(DeviceConfigurationDeviceStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceConfigurations", (n) -> { currentObject.setDeviceConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
            this.put("deviceEnrollmentConfigurations", (n) -> { currentObject.setDeviceEnrollmentConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
            this.put("deviceManagementPartners", (n) -> { currentObject.setDeviceManagementPartners(n.getCollectionOfObjectValues(DeviceManagementPartner::createFromDiscriminatorValue)); });
            this.put("exchangeConnectors", (n) -> { currentObject.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
            this.put("importedWindowsAutopilotDeviceIdentities", (n) -> { currentObject.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("intuneAccountId", (n) -> { currentObject.setIntuneAccountId(n.getStringValue()); });
            this.put("intuneBrand", (n) -> { currentObject.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
            this.put("iosUpdateStatuses", (n) -> { currentObject.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
            this.put("managedDeviceOverview", (n) -> { currentObject.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
            this.put("managedDevices", (n) -> { currentObject.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("mobileThreatDefenseConnectors", (n) -> { currentObject.setMobileThreatDefenseConnectors(n.getCollectionOfObjectValues(MobileThreatDefenseConnector::createFromDiscriminatorValue)); });
            this.put("notificationMessageTemplates", (n) -> { currentObject.setNotificationMessageTemplates(n.getCollectionOfObjectValues(NotificationMessageTemplate::createFromDiscriminatorValue)); });
            this.put("remoteAssistancePartners", (n) -> { currentObject.setRemoteAssistancePartners(n.getCollectionOfObjectValues(RemoteAssistancePartner::createFromDiscriminatorValue)); });
            this.put("reports", (n) -> { currentObject.setReports(n.getObjectValue(DeviceManagementReports::createFromDiscriminatorValue)); });
            this.put("resourceOperations", (n) -> { currentObject.setResourceOperations(n.getCollectionOfObjectValues(ResourceOperation::createFromDiscriminatorValue)); });
            this.put("roleAssignments", (n) -> { currentObject.setRoleAssignments(n.getCollectionOfObjectValues(DeviceAndAppManagementRoleAssignment::createFromDiscriminatorValue)); });
            this.put("roleDefinitions", (n) -> { currentObject.setRoleDefinitions(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(DeviceManagementSettings::createFromDiscriminatorValue)); });
            this.put("softwareUpdateStatusSummary", (n) -> { currentObject.setSoftwareUpdateStatusSummary(n.getObjectValue(SoftwareUpdateStatusSummary::createFromDiscriminatorValue)); });
            this.put("subscriptionState", (n) -> { currentObject.setSubscriptionState(n.getEnumValue(DeviceManagementSubscriptionState.class)); });
            this.put("telecomExpenseManagementPartners", (n) -> { currentObject.setTelecomExpenseManagementPartners(n.getCollectionOfObjectValues(TelecomExpenseManagementPartner::createFromDiscriminatorValue)); });
            this.put("termsAndConditions", (n) -> { currentObject.setTermsAndConditions(n.getCollectionOfObjectValues(TermsAndConditions::createFromDiscriminatorValue)); });
            this.put("troubleshootingEvents", (n) -> { currentObject.setTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
            this.put("windowsAutopilotDeviceIdentities", (n) -> { currentObject.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("windowsInformationProtectionAppLearningSummaries", (n) -> { currentObject.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
            this.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { currentObject.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this._importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the intuneAccountId property value. Intune Account Id for given tenant
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneAccountId() {
        return this._intuneAccountId;
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a intuneBrand
     */
    @javax.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this._intuneBrand;
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a iosUpdateDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this._iosUpdateStatuses;
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a managedDeviceOverview
     */
    @javax.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this._managedDeviceOverview;
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this._managedDevices;
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this._mobileThreatDefenseConnectors;
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a notificationMessageTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this._notificationMessageTemplates;
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a remoteAssistancePartner
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this._remoteAssistancePartners;
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a deviceManagementReports
     */
    @javax.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this._reports;
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a resourceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this._resourceOperations;
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a deviceAndAppManagementRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a softwareUpdateStatusSummary
     */
    @javax.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this._softwareUpdateStatusSummary;
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state.
     * @return a deviceManagementSubscriptionState
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this._subscriptionState;
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a telecomExpenseManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this._telecomExpenseManagementPartners;
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this._termsAndConditions;
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a deviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this._troubleshootingEvents;
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this._windowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this._windowsInformationProtectionAppLearningSummaries;
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a windowsInformationProtectionNetworkLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this._windowsInformationProtectionNetworkLearningSummaries;
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
        writer.writeStringValue("intuneAccountId", this.getIntuneAccountId());
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
        this._applePushNotificationCertificate = value;
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<AuditEvent> value) {
        this._auditEvents = value;
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceManagementPartners(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this._complianceManagementPartners = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessSettings(@javax.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this._conditionalAccessSettings = value;
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this._detectedApps = value;
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategories(@javax.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this._deviceCategories = value;
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this._deviceCompliancePolicies = value;
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicyDeviceStateSummary(@javax.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this._deviceCompliancePolicyDeviceStateSummary = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicySettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this._deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationDeviceStateSummaries(@javax.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this._deviceConfigurationDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurations(@javax.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this._deviceConfigurations = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentConfigurations(@javax.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this._deviceEnrollmentConfigurations = value;
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementPartners(@javax.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this._deviceManagementPartners = value;
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this._exchangeConnectors = value;
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this._importedWindowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the intuneAccountId property value. Intune Account Id for given tenant
     * @param value Value to set for the intuneAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneAccountId(@javax.annotation.Nullable final String value) {
        this._intuneAccountId = value;
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneBrand(@javax.annotation.Nullable final IntuneBrand value) {
        this._intuneBrand = value;
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosUpdateStatuses(@javax.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this._iosUpdateStatuses = value;
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceOverview(@javax.annotation.Nullable final ManagedDeviceOverview value) {
        this._managedDeviceOverview = value;
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this._managedDevices = value;
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileThreatDefenseConnectors(@javax.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this._mobileThreatDefenseConnectors = value;
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationMessageTemplates(@javax.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this._notificationMessageTemplates = value;
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistancePartners(@javax.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this._remoteAssistancePartners = value;
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReports(@javax.annotation.Nullable final DeviceManagementReports value) {
        this._reports = value;
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceOperations(@javax.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this._resourceOperations = value;
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this._roleDefinitions = value;
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final DeviceManagementSettings value) {
        this._settings = value;
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateStatusSummary(@javax.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this._softwareUpdateStatusSummary = value;
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state.
     * @param value Value to set for the subscriptionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionState(@javax.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this._subscriptionState = value;
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTelecomExpenseManagementPartners(@javax.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this._telecomExpenseManagementPartners = value;
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAndConditions(@javax.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this._termsAndConditions = value;
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this._troubleshootingEvents = value;
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this._windowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionAppLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this._windowsInformationProtectionAppLearningSummaries = value;
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionNetworkLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this._windowsInformationProtectionNetworkLearningSummaries = value;
    }
}
