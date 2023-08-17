package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Devices that are managed or pre-enrolled through Intune
 */
public class ManagedDevice extends Entity implements Parsable {
    /**
     * The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     */
    private String activationLockBypassCode;
    /**
     * Android security patch level. This property is read-only.
     */
    private String androidSecurityPatchLevel;
    /**
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    private String azureADDeviceId;
    /**
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    private Boolean azureADRegistered;
    /**
     * The DateTime when device compliance grace period expires. This property is read-only.
     */
    private OffsetDateTime complianceGracePeriodExpirationDateTime;
    /**
     * Compliance state.
     */
    private ComplianceState complianceState;
    /**
     * ConfigrMgr client enabled features. This property is read-only.
     */
    private ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;
    /**
     * List of ComplexType deviceActionResult objects. This property is read-only.
     */
    private java.util.List<DeviceActionResult> deviceActionResults;
    /**
     * Device category
     */
    private DeviceCategory deviceCategory;
    /**
     * Device category display name. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     */
    private String deviceCategoryDisplayName;
    /**
     * Device compliance policy states for this device.
     */
    private java.util.List<DeviceCompliancePolicyState> deviceCompliancePolicyStates;
    /**
     * Device configuration states for this device.
     */
    private java.util.List<DeviceConfigurationState> deviceConfigurationStates;
    /**
     * Possible ways of adding a mobile device to management.
     */
    private DeviceEnrollmentType deviceEnrollmentType;
    /**
     * The device health attestation state. This property is read-only.
     */
    private DeviceHealthAttestationState deviceHealthAttestationState;
    /**
     * Name of the device. This property is read-only.
     */
    private String deviceName;
    /**
     * Device registration status.
     */
    private DeviceRegistrationState deviceRegistrationState;
    /**
     * Whether the device is Exchange ActiveSync activated. This property is read-only.
     */
    private Boolean easActivated;
    /**
     * Exchange ActivationSync activation time of the device. This property is read-only.
     */
    private OffsetDateTime easActivationDateTime;
    /**
     * Exchange ActiveSync Id of the device. This property is read-only.
     */
    private String easDeviceId;
    /**
     * Email(s) for the user associated with the device. This property is read-only.
     */
    private String emailAddress;
    /**
     * Enrollment time of the device. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     */
    private OffsetDateTime enrolledDateTime;
    /**
     * Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     */
    private String ethernetMacAddress;
    /**
     * Device Exchange Access State.
     */
    private DeviceManagementExchangeAccessState exchangeAccessState;
    /**
     * Device Exchange Access State Reason.
     */
    private DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;
    /**
     * Last time the device contacted Exchange. This property is read-only.
     */
    private OffsetDateTime exchangeLastSuccessfulSyncDateTime;
    /**
     * Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     */
    private Long freeStorageSpaceInBytes;
    /**
     * Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     */
    private String iccid;
    /**
     * IMEI. This property is read-only.
     */
    private String imei;
    /**
     * Device encryption status. This property is read-only.
     */
    private Boolean isEncrypted;
    /**
     * Device supervised status. This property is read-only.
     */
    private Boolean isSupervised;
    /**
     * Whether the device is jail broken or rooted. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     */
    private String jailBroken;
    /**
     * The date and time that the device last completed a successful sync with Intune. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * List of log collection requests
     */
    private java.util.List<DeviceLogCollectionResponse> logCollectionRequests;
    /**
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    private String managedDeviceName;
    /**
     * Owner type of device.
     */
    private ManagedDeviceOwnerType managedDeviceOwnerType;
    /**
     * The managementAgent property
     */
    private ManagementAgentType managementAgent;
    /**
     * Reports device management certificate expiration date. This property is read-only.
     */
    private OffsetDateTime managementCertificateExpirationDate;
    /**
     * Manufacturer of the device. This property is read-only.
     */
    private String manufacturer;
    /**
     * MEID. This property is read-only.
     */
    private String meid;
    /**
     * Model of the device. This property is read-only.
     */
    private String model;
    /**
     * Notes on the device created by IT Admin. Default is null. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported.
     */
    private String notes;
    /**
     * Operating system of the device. Windows, iOS, etc. This property is read-only.
     */
    private String operatingSystem;
    /**
     * Operating system version of the device. This property is read-only.
     */
    private String osVersion;
    /**
     * Available health states for the Device Health API
     */
    private ManagedDevicePartnerReportedHealthState partnerReportedThreatState;
    /**
     * Phone number of the device. This property is read-only.
     */
    private String phoneNumber;
    /**
     * Total Memory in Bytes. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. Read-only. This property is read-only.
     */
    private Long physicalMemoryInBytes;
    /**
     * An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     */
    private String remoteAssistanceSessionErrorDetails;
    /**
     * Url that allows a Remote Assistance session to be established with the device. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     */
    private String remoteAssistanceSessionUrl;
    /**
     * Reports if the managed iOS device is user approval enrollment. This property is read-only.
     */
    private Boolean requireUserEnrollmentApproval;
    /**
     * SerialNumber. This property is read-only.
     */
    private String serialNumber;
    /**
     * Subscriber Carrier. This property is read-only.
     */
    private String subscriberCarrier;
    /**
     * Total Storage in Bytes. This property is read-only.
     */
    private Long totalStorageSpaceInBytes;
    /**
     * Unique Device Identifier for iOS and macOS devices. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     */
    private String udid;
    /**
     * User display name. This property is read-only.
     */
    private String userDisplayName;
    /**
     * Unique Identifier for the user associated with the device. This property is read-only.
     */
    private String userId;
    /**
     * Device user principal name. This property is read-only.
     */
    private String userPrincipalName;
    /**
     * The primary users associated with the managed device.
     */
    private java.util.List<User> users;
    /**
     * Wi-Fi MAC. This property is read-only.
     */
    private String wiFiMacAddress;
    /**
     * The device protection status. This property is read-only.
     */
    private WindowsProtectionState windowsProtectionState;
    /**
     * Instantiates a new managedDevice and sets the default values.
     */
    public ManagedDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDevice
     */
    @jakarta.annotation.Nonnull
    public static ManagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDevice();
    }
    /**
     * Gets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActivationLockBypassCode() {
        return this.activationLockBypassCode;
    }
    /**
     * Gets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAndroidSecurityPatchLevel() {
        return this.androidSecurityPatchLevel;
    }
    /**
     * Gets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureADDeviceId() {
        return this.azureADDeviceId;
    }
    /**
     * Gets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureADRegistered() {
        return this.azureADRegistered;
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the complianceState property value. Compliance state.
     * @return a complianceState
     */
    @jakarta.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this.complianceState;
    }
    /**
     * Gets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @return a configurationManagerClientEnabledFeatures
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures getConfigurationManagerClientEnabledFeatures() {
        return this.configurationManagerClientEnabledFeatures;
    }
    /**
     * Gets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @return a deviceActionResult
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceActionResult> getDeviceActionResults() {
        return this.deviceActionResults;
    }
    /**
     * Gets the deviceCategory property value. Device category
     * @return a deviceCategory
     */
    @jakarta.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.deviceCategory;
    }
    /**
     * Gets the deviceCategoryDisplayName property value. Device category display name. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceCategoryDisplayName() {
        return this.deviceCategoryDisplayName;
    }
    /**
     * Gets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @return a deviceCompliancePolicyState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyState> getDeviceCompliancePolicyStates() {
        return this.deviceCompliancePolicyStates;
    }
    /**
     * Gets the deviceConfigurationStates property value. Device configuration states for this device.
     * @return a deviceConfigurationState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationState> getDeviceConfigurationStates() {
        return this.deviceConfigurationStates;
    }
    /**
     * Gets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentType getDeviceEnrollmentType() {
        return this.deviceEnrollmentType;
    }
    /**
     * Gets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @return a deviceHealthAttestationState
     */
    @jakarta.annotation.Nullable
    public DeviceHealthAttestationState getDeviceHealthAttestationState() {
        return this.deviceHealthAttestationState;
    }
    /**
     * Gets the deviceName property value. Name of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceRegistrationState property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationState getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }
    /**
     * Gets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEasActivated() {
        return this.easActivated;
    }
    /**
     * Gets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEasActivationDateTime() {
        return this.easActivationDateTime;
    }
    /**
     * Gets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEasDeviceId() {
        return this.easDeviceId;
    }
    /**
     * Gets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * Gets the enrolledDateTime property value. Enrollment time of the device. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this.enrolledDateTime;
    }
    /**
     * Gets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEthernetMacAddress() {
        return this.ethernetMacAddress;
    }
    /**
     * Gets the exchangeAccessState property value. Device Exchange Access State.
     * @return a deviceManagementExchangeAccessState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessState getExchangeAccessState() {
        return this.exchangeAccessState;
    }
    /**
     * Gets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @return a deviceManagementExchangeAccessStateReason
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessStateReason getExchangeAccessStateReason() {
        return this.exchangeAccessStateReason;
    }
    /**
     * Gets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExchangeLastSuccessfulSyncDateTime() {
        return this.exchangeLastSuccessfulSyncDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationLockBypassCode", (n) -> { this.setActivationLockBypassCode(n.getStringValue()); });
        deserializerMap.put("androidSecurityPatchLevel", (n) -> { this.setAndroidSecurityPatchLevel(n.getStringValue()); });
        deserializerMap.put("azureADDeviceId", (n) -> { this.setAzureADDeviceId(n.getStringValue()); });
        deserializerMap.put("azureADRegistered", (n) -> { this.setAzureADRegistered(n.getBooleanValue()); });
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceState.class)); });
        deserializerMap.put("configurationManagerClientEnabledFeatures", (n) -> { this.setConfigurationManagerClientEnabledFeatures(n.getObjectValue(ConfigurationManagerClientEnabledFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceActionResults", (n) -> { this.setDeviceActionResults(n.getCollectionOfObjectValues(DeviceActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getObjectValue(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategoryDisplayName", (n) -> { this.setDeviceCategoryDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyStates", (n) -> { this.setDeviceCompliancePolicyStates(n.getCollectionOfObjectValues(DeviceCompliancePolicyState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationStates", (n) -> { this.setDeviceConfigurationStates(n.getCollectionOfObjectValues(DeviceConfigurationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentType", (n) -> { this.setDeviceEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
        deserializerMap.put("deviceHealthAttestationState", (n) -> { this.setDeviceHealthAttestationState(n.getObjectValue(DeviceHealthAttestationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceRegistrationState", (n) -> { this.setDeviceRegistrationState(n.getEnumValue(DeviceRegistrationState.class)); });
        deserializerMap.put("easActivated", (n) -> { this.setEasActivated(n.getBooleanValue()); });
        deserializerMap.put("easActivationDateTime", (n) -> { this.setEasActivationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easDeviceId", (n) -> { this.setEasDeviceId(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("enrolledDateTime", (n) -> { this.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ethernetMacAddress", (n) -> { this.setEthernetMacAddress(n.getStringValue()); });
        deserializerMap.put("exchangeAccessState", (n) -> { this.setExchangeAccessState(n.getEnumValue(DeviceManagementExchangeAccessState.class)); });
        deserializerMap.put("exchangeAccessStateReason", (n) -> { this.setExchangeAccessStateReason(n.getEnumValue(DeviceManagementExchangeAccessStateReason.class)); });
        deserializerMap.put("exchangeLastSuccessfulSyncDateTime", (n) -> { this.setExchangeLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("freeStorageSpaceInBytes", (n) -> { this.setFreeStorageSpaceInBytes(n.getLongValue()); });
        deserializerMap.put("iccid", (n) -> { this.setIccid(n.getStringValue()); });
        deserializerMap.put("imei", (n) -> { this.setImei(n.getStringValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isSupervised", (n) -> { this.setIsSupervised(n.getBooleanValue()); });
        deserializerMap.put("jailBroken", (n) -> { this.setJailBroken(n.getStringValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logCollectionRequests", (n) -> { this.setLogCollectionRequests(n.getCollectionOfObjectValues(DeviceLogCollectionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceOwnerType", (n) -> { this.setManagedDeviceOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
        deserializerMap.put("managementAgent", (n) -> { this.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
        deserializerMap.put("managementCertificateExpirationDate", (n) -> { this.setManagementCertificateExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("meid", (n) -> { this.setMeid(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("partnerReportedThreatState", (n) -> { this.setPartnerReportedThreatState(n.getEnumValue(ManagedDevicePartnerReportedHealthState.class)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("physicalMemoryInBytes", (n) -> { this.setPhysicalMemoryInBytes(n.getLongValue()); });
        deserializerMap.put("remoteAssistanceSessionErrorDetails", (n) -> { this.setRemoteAssistanceSessionErrorDetails(n.getStringValue()); });
        deserializerMap.put("remoteAssistanceSessionUrl", (n) -> { this.setRemoteAssistanceSessionUrl(n.getStringValue()); });
        deserializerMap.put("requireUserEnrollmentApproval", (n) -> { this.setRequireUserEnrollmentApproval(n.getBooleanValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("subscriberCarrier", (n) -> { this.setSubscriberCarrier(n.getStringValue()); });
        deserializerMap.put("totalStorageSpaceInBytes", (n) -> { this.setTotalStorageSpaceInBytes(n.getLongValue()); });
        deserializerMap.put("udid", (n) -> { this.setUdid(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("wiFiMacAddress", (n) -> { this.setWiFiMacAddress(n.getStringValue()); });
        deserializerMap.put("windowsProtectionState", (n) -> { this.setWindowsProtectionState(n.getObjectValue(WindowsProtectionState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getFreeStorageSpaceInBytes() {
        return this.freeStorageSpaceInBytes;
    }
    /**
     * Gets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIccid() {
        return this.iccid;
    }
    /**
     * Gets the imei property value. IMEI. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getImei() {
        return this.imei;
    }
    /**
     * Gets the isEncrypted property value. Device encryption status. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }
    /**
     * Gets the isSupervised property value. Device supervised status. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.isSupervised;
    }
    /**
     * Gets the jailBroken property value. Whether the device is jail broken or rooted. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJailBroken() {
        return this.jailBroken;
    }
    /**
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the logCollectionRequests property value. List of log collection requests
     * @return a deviceLogCollectionResponse
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLogCollectionResponse> getLogCollectionRequests() {
        return this.logCollectionRequests;
    }
    /**
     * Gets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the managedDeviceOwnerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOwnerType getManagedDeviceOwnerType() {
        return this.managedDeviceOwnerType;
    }
    /**
     * Gets the managementAgent property value. The managementAgent property
     * @return a managementAgentType
     */
    @jakarta.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this.managementAgent;
    }
    /**
     * Gets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getManagementCertificateExpirationDate() {
        return this.managementCertificateExpirationDate;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the meid property value. MEID. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMeid() {
        return this.meid;
    }
    /**
     * Gets the model property value. Model of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the notes property value. Notes on the device created by IT Admin. Default is null. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @return a managedDevicePartnerReportedHealthState
     */
    @jakarta.annotation.Nullable
    public ManagedDevicePartnerReportedHealthState getPartnerReportedThreatState() {
        return this.partnerReportedThreatState;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the physicalMemoryInBytes property value. Total Memory in Bytes. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. Read-only. This property is read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getPhysicalMemoryInBytes() {
        return this.physicalMemoryInBytes;
    }
    /**
     * Gets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemoteAssistanceSessionErrorDetails() {
        return this.remoteAssistanceSessionErrorDetails;
    }
    /**
     * Gets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemoteAssistanceSessionUrl() {
        return this.remoteAssistanceSessionUrl;
    }
    /**
     * Gets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireUserEnrollmentApproval() {
        return this.requireUserEnrollmentApproval;
    }
    /**
     * Gets the serialNumber property value. SerialNumber. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubscriberCarrier() {
        return this.subscriberCarrier;
    }
    /**
     * Gets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTotalStorageSpaceInBytes() {
        return this.totalStorageSpaceInBytes;
    }
    /**
     * Gets the udid property value. Unique Device Identifier for iOS and macOS devices. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUdid() {
        return this.udid;
    }
    /**
     * Gets the userDisplayName property value. User display name. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the users property value. The primary users associated with the managed device.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getUsers() {
        return this.users;
    }
    /**
     * Gets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWiFiMacAddress() {
        return this.wiFiMacAddress;
    }
    /**
     * Gets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @return a windowsProtectionState
     */
    @jakarta.annotation.Nullable
    public WindowsProtectionState getWindowsProtectionState() {
        return this.windowsProtectionState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeObjectValue("deviceCategory", this.getDeviceCategory());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicyStates", this.getDeviceCompliancePolicyStates());
        writer.writeCollectionOfObjectValues("deviceConfigurationStates", this.getDeviceConfigurationStates());
        writer.writeEnumValue("deviceEnrollmentType", this.getDeviceEnrollmentType());
        writer.writeEnumValue("deviceRegistrationState", this.getDeviceRegistrationState());
        writer.writeEnumValue("exchangeAccessState", this.getExchangeAccessState());
        writer.writeEnumValue("exchangeAccessStateReason", this.getExchangeAccessStateReason());
        writer.writeCollectionOfObjectValues("logCollectionRequests", this.getLogCollectionRequests());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeEnumValue("managedDeviceOwnerType", this.getManagedDeviceOwnerType());
        writer.writeEnumValue("managementAgent", this.getManagementAgent());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeEnumValue("partnerReportedThreatState", this.getPartnerReportedThreatState());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeObjectValue("windowsProtectionState", this.getWindowsProtectionState());
    }
    /**
     * Sets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the activationLockBypassCode property.
     */
    public void setActivationLockBypassCode(@jakarta.annotation.Nullable final String value) {
        this.activationLockBypassCode = value;
    }
    /**
     * Sets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @param value Value to set for the androidSecurityPatchLevel property.
     */
    public void setAndroidSecurityPatchLevel(@jakarta.annotation.Nullable final String value) {
        this.androidSecurityPatchLevel = value;
    }
    /**
     * Sets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureADDeviceId property.
     */
    public void setAzureADDeviceId(@jakarta.annotation.Nullable final String value) {
        this.azureADDeviceId = value;
    }
    /**
     * Sets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the azureADRegistered property.
     */
    public void setAzureADRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.azureADRegistered = value;
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     */
    public void setComplianceGracePeriodExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the complianceState property value. Compliance state.
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final ComplianceState value) {
        this.complianceState = value;
    }
    /**
     * Sets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @param value Value to set for the configurationManagerClientEnabledFeatures property.
     */
    public void setConfigurationManagerClientEnabledFeatures(@jakarta.annotation.Nullable final ConfigurationManagerClientEnabledFeatures value) {
        this.configurationManagerClientEnabledFeatures = value;
    }
    /**
     * Sets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @param value Value to set for the deviceActionResults property.
     */
    public void setDeviceActionResults(@jakarta.annotation.Nullable final java.util.List<DeviceActionResult> value) {
        this.deviceActionResults = value;
    }
    /**
     * Sets the deviceCategory property value. Device category
     * @param value Value to set for the deviceCategory property.
     */
    public void setDeviceCategory(@jakarta.annotation.Nullable final DeviceCategory value) {
        this.deviceCategory = value;
    }
    /**
     * Sets the deviceCategoryDisplayName property value. Device category display name. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @param value Value to set for the deviceCategoryDisplayName property.
     */
    public void setDeviceCategoryDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceCategoryDisplayName = value;
    }
    /**
     * Sets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @param value Value to set for the deviceCompliancePolicyStates property.
     */
    public void setDeviceCompliancePolicyStates(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicyState> value) {
        this.deviceCompliancePolicyStates = value;
    }
    /**
     * Sets the deviceConfigurationStates property value. Device configuration states for this device.
     * @param value Value to set for the deviceConfigurationStates property.
     */
    public void setDeviceConfigurationStates(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationState> value) {
        this.deviceConfigurationStates = value;
    }
    /**
     * Sets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the deviceEnrollmentType property.
     */
    public void setDeviceEnrollmentType(@jakarta.annotation.Nullable final DeviceEnrollmentType value) {
        this.deviceEnrollmentType = value;
    }
    /**
     * Sets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @param value Value to set for the deviceHealthAttestationState property.
     */
    public void setDeviceHealthAttestationState(@jakarta.annotation.Nullable final DeviceHealthAttestationState value) {
        this.deviceHealthAttestationState = value;
    }
    /**
     * Sets the deviceName property value. Name of the device. This property is read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceRegistrationState property value. Device registration status.
     * @param value Value to set for the deviceRegistrationState property.
     */
    public void setDeviceRegistrationState(@jakarta.annotation.Nullable final DeviceRegistrationState value) {
        this.deviceRegistrationState = value;
    }
    /**
     * Sets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @param value Value to set for the easActivated property.
     */
    public void setEasActivated(@jakarta.annotation.Nullable final Boolean value) {
        this.easActivated = value;
    }
    /**
     * Sets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @param value Value to set for the easActivationDateTime property.
     */
    public void setEasActivationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.easActivationDateTime = value;
    }
    /**
     * Sets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @param value Value to set for the easDeviceId property.
     */
    public void setEasDeviceId(@jakarta.annotation.Nullable final String value) {
        this.easDeviceId = value;
    }
    /**
     * Sets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the enrolledDateTime property value. Enrollment time of the device. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @param value Value to set for the enrolledDateTime property.
     */
    public void setEnrolledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.enrolledDateTime = value;
    }
    /**
     * Sets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the ethernetMacAddress property.
     */
    public void setEthernetMacAddress(@jakarta.annotation.Nullable final String value) {
        this.ethernetMacAddress = value;
    }
    /**
     * Sets the exchangeAccessState property value. Device Exchange Access State.
     * @param value Value to set for the exchangeAccessState property.
     */
    public void setExchangeAccessState(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessState value) {
        this.exchangeAccessState = value;
    }
    /**
     * Sets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @param value Value to set for the exchangeAccessStateReason property.
     */
    public void setExchangeAccessStateReason(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessStateReason value) {
        this.exchangeAccessStateReason = value;
    }
    /**
     * Sets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @param value Value to set for the exchangeLastSuccessfulSyncDateTime property.
     */
    public void setExchangeLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.exchangeLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the freeStorageSpaceInBytes property.
     */
    public void setFreeStorageSpaceInBytes(@jakarta.annotation.Nullable final Long value) {
        this.freeStorageSpaceInBytes = value;
    }
    /**
     * Sets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the iccid property.
     */
    public void setIccid(@jakarta.annotation.Nullable final String value) {
        this.iccid = value;
    }
    /**
     * Sets the imei property value. IMEI. This property is read-only.
     * @param value Value to set for the imei property.
     */
    public void setImei(@jakarta.annotation.Nullable final String value) {
        this.imei = value;
    }
    /**
     * Sets the isEncrypted property value. Device encryption status. This property is read-only.
     * @param value Value to set for the isEncrypted property.
     */
    public void setIsEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.isEncrypted = value;
    }
    /**
     * Sets the isSupervised property value. Device supervised status. This property is read-only.
     * @param value Value to set for the isSupervised property.
     */
    public void setIsSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.isSupervised = value;
    }
    /**
     * Sets the jailBroken property value. Whether the device is jail broken or rooted. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @param value Value to set for the jailBroken property.
     */
    public void setJailBroken(@jakarta.annotation.Nullable final String value) {
        this.jailBroken = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the logCollectionRequests property value. List of log collection requests
     * @param value Value to set for the logCollectionRequests property.
     */
    public void setLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<DeviceLogCollectionResponse> value) {
        this.logCollectionRequests = value;
    }
    /**
     * Sets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the managedDeviceOwnerType property value. Owner type of device.
     * @param value Value to set for the managedDeviceOwnerType property.
     */
    public void setManagedDeviceOwnerType(@jakarta.annotation.Nullable final ManagedDeviceOwnerType value) {
        this.managedDeviceOwnerType = value;
    }
    /**
     * Sets the managementAgent property value. The managementAgent property
     * @param value Value to set for the managementAgent property.
     */
    public void setManagementAgent(@jakarta.annotation.Nullable final ManagementAgentType value) {
        this.managementAgent = value;
    }
    /**
     * Sets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @param value Value to set for the managementCertificateExpirationDate property.
     */
    public void setManagementCertificateExpirationDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.managementCertificateExpirationDate = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID. This property is read-only.
     * @param value Value to set for the meid property.
     */
    public void setMeid(@jakarta.annotation.Nullable final String value) {
        this.meid = value;
    }
    /**
     * Sets the model property value. Model of the device. This property is read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the notes property value. Notes on the device created by IT Admin. Default is null. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device. This property is read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @param value Value to set for the partnerReportedThreatState property.
     */
    public void setPartnerReportedThreatState(@jakarta.annotation.Nullable final ManagedDevicePartnerReportedHealthState value) {
        this.partnerReportedThreatState = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the physicalMemoryInBytes property value. Total Memory in Bytes. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. Read-only. This property is read-only.
     * @param value Value to set for the physicalMemoryInBytes property.
     */
    public void setPhysicalMemoryInBytes(@jakarta.annotation.Nullable final Long value) {
        this.physicalMemoryInBytes = value;
    }
    /**
     * Sets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionErrorDetails property.
     */
    public void setRemoteAssistanceSessionErrorDetails(@jakarta.annotation.Nullable final String value) {
        this.remoteAssistanceSessionErrorDetails = value;
    }
    /**
     * Sets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionUrl property.
     */
    public void setRemoteAssistanceSessionUrl(@jakarta.annotation.Nullable final String value) {
        this.remoteAssistanceSessionUrl = value;
    }
    /**
     * Sets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @param value Value to set for the requireUserEnrollmentApproval property.
     */
    public void setRequireUserEnrollmentApproval(@jakarta.annotation.Nullable final Boolean value) {
        this.requireUserEnrollmentApproval = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber. This property is read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @param value Value to set for the subscriberCarrier property.
     */
    public void setSubscriberCarrier(@jakarta.annotation.Nullable final String value) {
        this.subscriberCarrier = value;
    }
    /**
     * Sets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @param value Value to set for the totalStorageSpaceInBytes property.
     */
    public void setTotalStorageSpaceInBytes(@jakarta.annotation.Nullable final Long value) {
        this.totalStorageSpaceInBytes = value;
    }
    /**
     * Sets the udid property value. Unique Device Identifier for iOS and macOS devices. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the udid property.
     */
    public void setUdid(@jakarta.annotation.Nullable final String value) {
        this.udid = value;
    }
    /**
     * Sets the userDisplayName property value. User display name. This property is read-only.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the users property value. The primary users associated with the managed device.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.users = value;
    }
    /**
     * Sets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @param value Value to set for the wiFiMacAddress property.
     */
    public void setWiFiMacAddress(@jakarta.annotation.Nullable final String value) {
        this.wiFiMacAddress = value;
    }
    /**
     * Sets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @param value Value to set for the windowsProtectionState property.
     */
    public void setWindowsProtectionState(@jakarta.annotation.Nullable final WindowsProtectionState value) {
        this.windowsProtectionState = value;
    }
}
