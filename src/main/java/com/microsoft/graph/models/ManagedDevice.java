package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Devices that are managed or pre-enrolled through Intune */
public class ManagedDevice extends Entity implements Parsable {
    /** Code that allows the Activation Lock on a device to be bypassed. This property is read-only. */
    private String _activationLockBypassCode;
    /** Android security patch level. This property is read-only. */
    private String _androidSecurityPatchLevel;
    /** The unique identifier for the Azure Active Directory device. Read only. This property is read-only. */
    private String _azureADDeviceId;
    /** Whether the device is Azure Active Directory registered. This property is read-only. */
    private Boolean _azureADRegistered;
    /** The DateTime when device compliance grace period expires. This property is read-only. */
    private OffsetDateTime _complianceGracePeriodExpirationDateTime;
    /** Compliance state. */
    private ComplianceState _complianceState;
    /** ConfigrMgr client enabled features. This property is read-only. */
    private ConfigurationManagerClientEnabledFeatures _configurationManagerClientEnabledFeatures;
    /** List of ComplexType deviceActionResult objects. This property is read-only. */
    private java.util.List<DeviceActionResult> _deviceActionResults;
    /** Device category */
    private DeviceCategory _deviceCategory;
    /** Device category display name. This property is read-only. */
    private String _deviceCategoryDisplayName;
    /** Device compliance policy states for this device. */
    private java.util.List<DeviceCompliancePolicyState> _deviceCompliancePolicyStates;
    /** Device configuration states for this device. */
    private java.util.List<DeviceConfigurationState> _deviceConfigurationStates;
    /** Possible ways of adding a mobile device to management. */
    private DeviceEnrollmentType _deviceEnrollmentType;
    /** The device health attestation state. This property is read-only. */
    private DeviceHealthAttestationState _deviceHealthAttestationState;
    /** Name of the device. This property is read-only. */
    private String _deviceName;
    /** Device registration status. */
    private DeviceRegistrationState _deviceRegistrationState;
    /** Whether the device is Exchange ActiveSync activated. This property is read-only. */
    private Boolean _easActivated;
    /** Exchange ActivationSync activation time of the device. This property is read-only. */
    private OffsetDateTime _easActivationDateTime;
    /** Exchange ActiveSync Id of the device. This property is read-only. */
    private String _easDeviceId;
    /** Email(s) for the user associated with the device. This property is read-only. */
    private String _emailAddress;
    /** Enrollment time of the device. This property is read-only. */
    private OffsetDateTime _enrolledDateTime;
    /** Ethernet MAC. This property is read-only. */
    private String _ethernetMacAddress;
    /** Device Exchange Access State. */
    private DeviceManagementExchangeAccessState _exchangeAccessState;
    /** Device Exchange Access State Reason. */
    private DeviceManagementExchangeAccessStateReason _exchangeAccessStateReason;
    /** Last time the device contacted Exchange. This property is read-only. */
    private OffsetDateTime _exchangeLastSuccessfulSyncDateTime;
    /** Free Storage in Bytes. This property is read-only. */
    private Long _freeStorageSpaceInBytes;
    /** Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only. */
    private String _iccid;
    /** IMEI. This property is read-only. */
    private String _imei;
    /** Device encryption status. This property is read-only. */
    private Boolean _isEncrypted;
    /** Device supervised status. This property is read-only. */
    private Boolean _isSupervised;
    /** whether the device is jail broken or rooted. This property is read-only. */
    private String _jailBroken;
    /** The date and time that the device last completed a successful sync with Intune. This property is read-only. */
    private OffsetDateTime _lastSyncDateTime;
    /** Automatically generated name to identify a device. Can be overwritten to a user friendly name. */
    private String _managedDeviceName;
    /** Owner type of device. */
    private ManagedDeviceOwnerType _managedDeviceOwnerType;
    /** The managementAgent property */
    private ManagementAgentType _managementAgent;
    /** Manufacturer of the device. This property is read-only. */
    private String _manufacturer;
    /** MEID. This property is read-only. */
    private String _meid;
    /** Model of the device. This property is read-only. */
    private String _model;
    /** Notes on the device created by IT Admin */
    private String _notes;
    /** Operating system of the device. Windows, iOS, etc. This property is read-only. */
    private String _operatingSystem;
    /** Operating system version of the device. This property is read-only. */
    private String _osVersion;
    /** Available health states for the Device Health API */
    private ManagedDevicePartnerReportedHealthState _partnerReportedThreatState;
    /** Phone number of the device. This property is read-only. */
    private String _phoneNumber;
    /** Total Memory in Bytes. This property is read-only. */
    private Long _physicalMemoryInBytes;
    /** An error string that identifies issues when creating Remote Assistance session objects. This property is read-only. */
    private String _remoteAssistanceSessionErrorDetails;
    /** Url that allows a Remote Assistance session to be established with the device. This property is read-only. */
    private String _remoteAssistanceSessionUrl;
    /** SerialNumber. This property is read-only. */
    private String _serialNumber;
    /** Subscriber Carrier. This property is read-only. */
    private String _subscriberCarrier;
    /** Total Storage in Bytes. This property is read-only. */
    private Long _totalStorageSpaceInBytes;
    /** Unique Device Identifier for iOS and macOS devices. This property is read-only. */
    private String _udid;
    /** User display name. This property is read-only. */
    private String _userDisplayName;
    /** Unique Identifier for the user associated with the device. This property is read-only. */
    private String _userId;
    /** Device user principal name. This property is read-only. */
    private String _userPrincipalName;
    /** Wi-Fi MAC. This property is read-only. */
    private String _wiFiMacAddress;
    /**
     * Instantiates a new managedDevice and sets the default values.
     * @return a void
     */
    public ManagedDevice() {
        super();
        this.setOdataType("#microsoft.graph.managedDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDevice
     */
    @javax.annotation.Nonnull
    public static ManagedDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDevice();
    }
    /**
     * Gets the activationLockBypassCode property value. Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivationLockBypassCode() {
        return this._activationLockBypassCode;
    }
    /**
     * Gets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAndroidSecurityPatchLevel() {
        return this._androidSecurityPatchLevel;
    }
    /**
     * Gets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADDeviceId() {
        return this._azureADDeviceId;
    }
    /**
     * Gets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureADRegistered() {
        return this._azureADRegistered;
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this._complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the complianceState property value. Compliance state.
     * @return a complianceState
     */
    @javax.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this._complianceState;
    }
    /**
     * Gets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @return a configurationManagerClientEnabledFeatures
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures getConfigurationManagerClientEnabledFeatures() {
        return this._configurationManagerClientEnabledFeatures;
    }
    /**
     * Gets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @return a deviceActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceActionResult> getDeviceActionResults() {
        return this._deviceActionResults;
    }
    /**
     * Gets the deviceCategory property value. Device category
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this._deviceCategory;
    }
    /**
     * Gets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCategoryDisplayName() {
        return this._deviceCategoryDisplayName;
    }
    /**
     * Gets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @return a deviceCompliancePolicyState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyState> getDeviceCompliancePolicyStates() {
        return this._deviceCompliancePolicyStates;
    }
    /**
     * Gets the deviceConfigurationStates property value. Device configuration states for this device.
     * @return a deviceConfigurationState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationState> getDeviceConfigurationStates() {
        return this._deviceConfigurationStates;
    }
    /**
     * Gets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentType getDeviceEnrollmentType() {
        return this._deviceEnrollmentType;
    }
    /**
     * Gets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @return a deviceHealthAttestationState
     */
    @javax.annotation.Nullable
    public DeviceHealthAttestationState getDeviceHealthAttestationState() {
        return this._deviceHealthAttestationState;
    }
    /**
     * Gets the deviceName property value. Name of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceRegistrationState property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @javax.annotation.Nullable
    public DeviceRegistrationState getDeviceRegistrationState() {
        return this._deviceRegistrationState;
    }
    /**
     * Gets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEasActivated() {
        return this._easActivated;
    }
    /**
     * Gets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEasActivationDateTime() {
        return this._easActivationDateTime;
    }
    /**
     * Gets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEasDeviceId() {
        return this._easDeviceId;
    }
    /**
     * Gets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * Gets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this._enrolledDateTime;
    }
    /**
     * Gets the ethernetMacAddress property value. Ethernet MAC. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEthernetMacAddress() {
        return this._ethernetMacAddress;
    }
    /**
     * Gets the exchangeAccessState property value. Device Exchange Access State.
     * @return a deviceManagementExchangeAccessState
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessState getExchangeAccessState() {
        return this._exchangeAccessState;
    }
    /**
     * Gets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @return a deviceManagementExchangeAccessStateReason
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessStateReason getExchangeAccessStateReason() {
        return this._exchangeAccessStateReason;
    }
    /**
     * Gets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExchangeLastSuccessfulSyncDateTime() {
        return this._exchangeLastSuccessfulSyncDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDevice currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activationLockBypassCode", (n) -> { currentObject.setActivationLockBypassCode(n.getStringValue()); });
            this.put("androidSecurityPatchLevel", (n) -> { currentObject.setAndroidSecurityPatchLevel(n.getStringValue()); });
            this.put("azureADDeviceId", (n) -> { currentObject.setAzureADDeviceId(n.getStringValue()); });
            this.put("azureADRegistered", (n) -> { currentObject.setAzureADRegistered(n.getBooleanValue()); });
            this.put("complianceGracePeriodExpirationDateTime", (n) -> { currentObject.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("complianceState", (n) -> { currentObject.setComplianceState(n.getEnumValue(ComplianceState.class)); });
            this.put("configurationManagerClientEnabledFeatures", (n) -> { currentObject.setConfigurationManagerClientEnabledFeatures(n.getObjectValue(ConfigurationManagerClientEnabledFeatures::createFromDiscriminatorValue)); });
            this.put("deviceActionResults", (n) -> { currentObject.setDeviceActionResults(n.getCollectionOfObjectValues(DeviceActionResult::createFromDiscriminatorValue)); });
            this.put("deviceCategory", (n) -> { currentObject.setDeviceCategory(n.getObjectValue(DeviceCategory::createFromDiscriminatorValue)); });
            this.put("deviceCategoryDisplayName", (n) -> { currentObject.setDeviceCategoryDisplayName(n.getStringValue()); });
            this.put("deviceCompliancePolicyStates", (n) -> { currentObject.setDeviceCompliancePolicyStates(n.getCollectionOfObjectValues(DeviceCompliancePolicyState::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationStates", (n) -> { currentObject.setDeviceConfigurationStates(n.getCollectionOfObjectValues(DeviceConfigurationState::createFromDiscriminatorValue)); });
            this.put("deviceEnrollmentType", (n) -> { currentObject.setDeviceEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
            this.put("deviceHealthAttestationState", (n) -> { currentObject.setDeviceHealthAttestationState(n.getObjectValue(DeviceHealthAttestationState::createFromDiscriminatorValue)); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceRegistrationState", (n) -> { currentObject.setDeviceRegistrationState(n.getEnumValue(DeviceRegistrationState.class)); });
            this.put("easActivated", (n) -> { currentObject.setEasActivated(n.getBooleanValue()); });
            this.put("easActivationDateTime", (n) -> { currentObject.setEasActivationDateTime(n.getOffsetDateTimeValue()); });
            this.put("easDeviceId", (n) -> { currentObject.setEasDeviceId(n.getStringValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("enrolledDateTime", (n) -> { currentObject.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
            this.put("ethernetMacAddress", (n) -> { currentObject.setEthernetMacAddress(n.getStringValue()); });
            this.put("exchangeAccessState", (n) -> { currentObject.setExchangeAccessState(n.getEnumValue(DeviceManagementExchangeAccessState.class)); });
            this.put("exchangeAccessStateReason", (n) -> { currentObject.setExchangeAccessStateReason(n.getEnumValue(DeviceManagementExchangeAccessStateReason.class)); });
            this.put("exchangeLastSuccessfulSyncDateTime", (n) -> { currentObject.setExchangeLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("freeStorageSpaceInBytes", (n) -> { currentObject.setFreeStorageSpaceInBytes(n.getLongValue()); });
            this.put("iccid", (n) -> { currentObject.setIccid(n.getStringValue()); });
            this.put("imei", (n) -> { currentObject.setImei(n.getStringValue()); });
            this.put("isEncrypted", (n) -> { currentObject.setIsEncrypted(n.getBooleanValue()); });
            this.put("isSupervised", (n) -> { currentObject.setIsSupervised(n.getBooleanValue()); });
            this.put("jailBroken", (n) -> { currentObject.setJailBroken(n.getStringValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("managedDeviceOwnerType", (n) -> { currentObject.setManagedDeviceOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
            this.put("managementAgent", (n) -> { currentObject.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("meid", (n) -> { currentObject.setMeid(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("partnerReportedThreatState", (n) -> { currentObject.setPartnerReportedThreatState(n.getEnumValue(ManagedDevicePartnerReportedHealthState.class)); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("physicalMemoryInBytes", (n) -> { currentObject.setPhysicalMemoryInBytes(n.getLongValue()); });
            this.put("remoteAssistanceSessionErrorDetails", (n) -> { currentObject.setRemoteAssistanceSessionErrorDetails(n.getStringValue()); });
            this.put("remoteAssistanceSessionUrl", (n) -> { currentObject.setRemoteAssistanceSessionUrl(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("subscriberCarrier", (n) -> { currentObject.setSubscriberCarrier(n.getStringValue()); });
            this.put("totalStorageSpaceInBytes", (n) -> { currentObject.setTotalStorageSpaceInBytes(n.getLongValue()); });
            this.put("udid", (n) -> { currentObject.setUdid(n.getStringValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("wiFiMacAddress", (n) -> { currentObject.setWiFiMacAddress(n.getStringValue()); });
        }};
    }
    /**
     * Gets the freeStorageSpaceInBytes property value. Free Storage in Bytes. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFreeStorageSpaceInBytes() {
        return this._freeStorageSpaceInBytes;
    }
    /**
     * Gets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIccid() {
        return this._iccid;
    }
    /**
     * Gets the imei property value. IMEI. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImei() {
        return this._imei;
    }
    /**
     * Gets the isEncrypted property value. Device encryption status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this._isEncrypted;
    }
    /**
     * Gets the isSupervised property value. Device supervised status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this._isSupervised;
    }
    /**
     * Gets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJailBroken() {
        return this._jailBroken;
    }
    /**
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the managedDeviceOwnerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @javax.annotation.Nullable
    public ManagedDeviceOwnerType getManagedDeviceOwnerType() {
        return this._managedDeviceOwnerType;
    }
    /**
     * Gets the managementAgent property value. The managementAgent property
     * @return a managementAgentType
     */
    @javax.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this._managementAgent;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the meid property value. MEID. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeid() {
        return this._meid;
    }
    /**
     * Gets the model property value. Model of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the notes property value. Notes on the device created by IT Admin
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @return a managedDevicePartnerReportedHealthState
     */
    @javax.annotation.Nullable
    public ManagedDevicePartnerReportedHealthState getPartnerReportedThreatState() {
        return this._partnerReportedThreatState;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the physicalMemoryInBytes property value. Total Memory in Bytes. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPhysicalMemoryInBytes() {
        return this._physicalMemoryInBytes;
    }
    /**
     * Gets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionErrorDetails() {
        return this._remoteAssistanceSessionErrorDetails;
    }
    /**
     * Gets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionUrl() {
        return this._remoteAssistanceSessionUrl;
    }
    /**
     * Gets the serialNumber property value. SerialNumber. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriberCarrier() {
        return this._subscriberCarrier;
    }
    /**
     * Gets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalStorageSpaceInBytes() {
        return this._totalStorageSpaceInBytes;
    }
    /**
     * Gets the udid property value. Unique Device Identifier for iOS and macOS devices. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUdid() {
        return this._udid;
    }
    /**
     * Gets the userDisplayName property value. User display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWiFiMacAddress() {
        return this._wiFiMacAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activationLockBypassCode", this.getActivationLockBypassCode());
        writer.writeStringValue("androidSecurityPatchLevel", this.getAndroidSecurityPatchLevel());
        writer.writeStringValue("azureADDeviceId", this.getAzureADDeviceId());
        writer.writeBooleanValue("azureADRegistered", this.getAzureADRegistered());
        writer.writeOffsetDateTimeValue("complianceGracePeriodExpirationDateTime", this.getComplianceGracePeriodExpirationDateTime());
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeObjectValue("configurationManagerClientEnabledFeatures", this.getConfigurationManagerClientEnabledFeatures());
        writer.writeCollectionOfObjectValues("deviceActionResults", this.getDeviceActionResults());
        writer.writeObjectValue("deviceCategory", this.getDeviceCategory());
        writer.writeStringValue("deviceCategoryDisplayName", this.getDeviceCategoryDisplayName());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicyStates", this.getDeviceCompliancePolicyStates());
        writer.writeCollectionOfObjectValues("deviceConfigurationStates", this.getDeviceConfigurationStates());
        writer.writeEnumValue("deviceEnrollmentType", this.getDeviceEnrollmentType());
        writer.writeObjectValue("deviceHealthAttestationState", this.getDeviceHealthAttestationState());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("deviceRegistrationState", this.getDeviceRegistrationState());
        writer.writeBooleanValue("easActivated", this.getEasActivated());
        writer.writeOffsetDateTimeValue("easActivationDateTime", this.getEasActivationDateTime());
        writer.writeStringValue("easDeviceId", this.getEasDeviceId());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeOffsetDateTimeValue("enrolledDateTime", this.getEnrolledDateTime());
        writer.writeStringValue("ethernetMacAddress", this.getEthernetMacAddress());
        writer.writeEnumValue("exchangeAccessState", this.getExchangeAccessState());
        writer.writeEnumValue("exchangeAccessStateReason", this.getExchangeAccessStateReason());
        writer.writeOffsetDateTimeValue("exchangeLastSuccessfulSyncDateTime", this.getExchangeLastSuccessfulSyncDateTime());
        writer.writeLongValue("freeStorageSpaceInBytes", this.getFreeStorageSpaceInBytes());
        writer.writeStringValue("iccid", this.getIccid());
        writer.writeStringValue("imei", this.getImei());
        writer.writeBooleanValue("isEncrypted", this.getIsEncrypted());
        writer.writeBooleanValue("isSupervised", this.getIsSupervised());
        writer.writeStringValue("jailBroken", this.getJailBroken());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeEnumValue("managedDeviceOwnerType", this.getManagedDeviceOwnerType());
        writer.writeEnumValue("managementAgent", this.getManagementAgent());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("meid", this.getMeid());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("partnerReportedThreatState", this.getPartnerReportedThreatState());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeLongValue("physicalMemoryInBytes", this.getPhysicalMemoryInBytes());
        writer.writeStringValue("remoteAssistanceSessionErrorDetails", this.getRemoteAssistanceSessionErrorDetails());
        writer.writeStringValue("remoteAssistanceSessionUrl", this.getRemoteAssistanceSessionUrl());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("subscriberCarrier", this.getSubscriberCarrier());
        writer.writeLongValue("totalStorageSpaceInBytes", this.getTotalStorageSpaceInBytes());
        writer.writeStringValue("udid", this.getUdid());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("wiFiMacAddress", this.getWiFiMacAddress());
    }
    /**
     * Sets the activationLockBypassCode property value. Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     * @param value Value to set for the activationLockBypassCode property.
     * @return a void
     */
    public void setActivationLockBypassCode(@javax.annotation.Nullable final String value) {
        this._activationLockBypassCode = value;
    }
    /**
     * Sets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @param value Value to set for the androidSecurityPatchLevel property.
     * @return a void
     */
    public void setAndroidSecurityPatchLevel(@javax.annotation.Nullable final String value) {
        this._androidSecurityPatchLevel = value;
    }
    /**
     * Sets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureADDeviceId property.
     * @return a void
     */
    public void setAzureADDeviceId(@javax.annotation.Nullable final String value) {
        this._azureADDeviceId = value;
    }
    /**
     * Sets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the azureADRegistered property.
     * @return a void
     */
    public void setAzureADRegistered(@javax.annotation.Nullable final Boolean value) {
        this._azureADRegistered = value;
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     * @return a void
     */
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the complianceState property value. Compliance state.
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    public void setComplianceState(@javax.annotation.Nullable final ComplianceState value) {
        this._complianceState = value;
    }
    /**
     * Sets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @param value Value to set for the configurationManagerClientEnabledFeatures property.
     * @return a void
     */
    public void setConfigurationManagerClientEnabledFeatures(@javax.annotation.Nullable final ConfigurationManagerClientEnabledFeatures value) {
        this._configurationManagerClientEnabledFeatures = value;
    }
    /**
     * Sets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @param value Value to set for the deviceActionResults property.
     * @return a void
     */
    public void setDeviceActionResults(@javax.annotation.Nullable final java.util.List<DeviceActionResult> value) {
        this._deviceActionResults = value;
    }
    /**
     * Sets the deviceCategory property value. Device category
     * @param value Value to set for the deviceCategory property.
     * @return a void
     */
    public void setDeviceCategory(@javax.annotation.Nullable final DeviceCategory value) {
        this._deviceCategory = value;
    }
    /**
     * Sets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @param value Value to set for the deviceCategoryDisplayName property.
     * @return a void
     */
    public void setDeviceCategoryDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceCategoryDisplayName = value;
    }
    /**
     * Sets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @param value Value to set for the deviceCompliancePolicyStates property.
     * @return a void
     */
    public void setDeviceCompliancePolicyStates(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicyState> value) {
        this._deviceCompliancePolicyStates = value;
    }
    /**
     * Sets the deviceConfigurationStates property value. Device configuration states for this device.
     * @param value Value to set for the deviceConfigurationStates property.
     * @return a void
     */
    public void setDeviceConfigurationStates(@javax.annotation.Nullable final java.util.List<DeviceConfigurationState> value) {
        this._deviceConfigurationStates = value;
    }
    /**
     * Sets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the deviceEnrollmentType property.
     * @return a void
     */
    public void setDeviceEnrollmentType(@javax.annotation.Nullable final DeviceEnrollmentType value) {
        this._deviceEnrollmentType = value;
    }
    /**
     * Sets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @param value Value to set for the deviceHealthAttestationState property.
     * @return a void
     */
    public void setDeviceHealthAttestationState(@javax.annotation.Nullable final DeviceHealthAttestationState value) {
        this._deviceHealthAttestationState = value;
    }
    /**
     * Sets the deviceName property value. Name of the device. This property is read-only.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceRegistrationState property value. Device registration status.
     * @param value Value to set for the deviceRegistrationState property.
     * @return a void
     */
    public void setDeviceRegistrationState(@javax.annotation.Nullable final DeviceRegistrationState value) {
        this._deviceRegistrationState = value;
    }
    /**
     * Sets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @param value Value to set for the easActivated property.
     * @return a void
     */
    public void setEasActivated(@javax.annotation.Nullable final Boolean value) {
        this._easActivated = value;
    }
    /**
     * Sets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @param value Value to set for the easActivationDateTime property.
     * @return a void
     */
    public void setEasActivationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._easActivationDateTime = value;
    }
    /**
     * Sets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @param value Value to set for the easDeviceId property.
     * @return a void
     */
    public void setEasDeviceId(@javax.annotation.Nullable final String value) {
        this._easDeviceId = value;
    }
    /**
     * Sets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @param value Value to set for the enrolledDateTime property.
     * @return a void
     */
    public void setEnrolledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._enrolledDateTime = value;
    }
    /**
     * Sets the ethernetMacAddress property value. Ethernet MAC. This property is read-only.
     * @param value Value to set for the ethernetMacAddress property.
     * @return a void
     */
    public void setEthernetMacAddress(@javax.annotation.Nullable final String value) {
        this._ethernetMacAddress = value;
    }
    /**
     * Sets the exchangeAccessState property value. Device Exchange Access State.
     * @param value Value to set for the exchangeAccessState property.
     * @return a void
     */
    public void setExchangeAccessState(@javax.annotation.Nullable final DeviceManagementExchangeAccessState value) {
        this._exchangeAccessState = value;
    }
    /**
     * Sets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @param value Value to set for the exchangeAccessStateReason property.
     * @return a void
     */
    public void setExchangeAccessStateReason(@javax.annotation.Nullable final DeviceManagementExchangeAccessStateReason value) {
        this._exchangeAccessStateReason = value;
    }
    /**
     * Sets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @param value Value to set for the exchangeLastSuccessfulSyncDateTime property.
     * @return a void
     */
    public void setExchangeLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._exchangeLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the freeStorageSpaceInBytes property value. Free Storage in Bytes. This property is read-only.
     * @param value Value to set for the freeStorageSpaceInBytes property.
     * @return a void
     */
    public void setFreeStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this._freeStorageSpaceInBytes = value;
    }
    /**
     * Sets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
     * @param value Value to set for the iccid property.
     * @return a void
     */
    public void setIccid(@javax.annotation.Nullable final String value) {
        this._iccid = value;
    }
    /**
     * Sets the imei property value. IMEI. This property is read-only.
     * @param value Value to set for the imei property.
     * @return a void
     */
    public void setImei(@javax.annotation.Nullable final String value) {
        this._imei = value;
    }
    /**
     * Sets the isEncrypted property value. Device encryption status. This property is read-only.
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this._isEncrypted = value;
    }
    /**
     * Sets the isSupervised property value. Device supervised status. This property is read-only.
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this._isSupervised = value;
    }
    /**
     * Sets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @param value Value to set for the jailBroken property.
     * @return a void
     */
    public void setJailBroken(@javax.annotation.Nullable final String value) {
        this._jailBroken = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the managedDeviceOwnerType property value. Owner type of device.
     * @param value Value to set for the managedDeviceOwnerType property.
     * @return a void
     */
    public void setManagedDeviceOwnerType(@javax.annotation.Nullable final ManagedDeviceOwnerType value) {
        this._managedDeviceOwnerType = value;
    }
    /**
     * Sets the managementAgent property value. The managementAgent property
     * @param value Value to set for the managementAgent property.
     * @return a void
     */
    public void setManagementAgent(@javax.annotation.Nullable final ManagementAgentType value) {
        this._managementAgent = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID. This property is read-only.
     * @param value Value to set for the meid property.
     * @return a void
     */
    public void setMeid(@javax.annotation.Nullable final String value) {
        this._meid = value;
    }
    /**
     * Sets the model property value. Model of the device. This property is read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the notes property value. Notes on the device created by IT Admin
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device. This property is read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @param value Value to set for the partnerReportedThreatState property.
     * @return a void
     */
    public void setPartnerReportedThreatState(@javax.annotation.Nullable final ManagedDevicePartnerReportedHealthState value) {
        this._partnerReportedThreatState = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the physicalMemoryInBytes property value. Total Memory in Bytes. This property is read-only.
     * @param value Value to set for the physicalMemoryInBytes property.
     * @return a void
     */
    public void setPhysicalMemoryInBytes(@javax.annotation.Nullable final Long value) {
        this._physicalMemoryInBytes = value;
    }
    /**
     * Sets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionErrorDetails property.
     * @return a void
     */
    public void setRemoteAssistanceSessionErrorDetails(@javax.annotation.Nullable final String value) {
        this._remoteAssistanceSessionErrorDetails = value;
    }
    /**
     * Sets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionUrl property.
     * @return a void
     */
    public void setRemoteAssistanceSessionUrl(@javax.annotation.Nullable final String value) {
        this._remoteAssistanceSessionUrl = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber. This property is read-only.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @param value Value to set for the subscriberCarrier property.
     * @return a void
     */
    public void setSubscriberCarrier(@javax.annotation.Nullable final String value) {
        this._subscriberCarrier = value;
    }
    /**
     * Sets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @param value Value to set for the totalStorageSpaceInBytes property.
     * @return a void
     */
    public void setTotalStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this._totalStorageSpaceInBytes = value;
    }
    /**
     * Sets the udid property value. Unique Device Identifier for iOS and macOS devices. This property is read-only.
     * @param value Value to set for the udid property.
     * @return a void
     */
    public void setUdid(@javax.annotation.Nullable final String value) {
        this._udid = value;
    }
    /**
     * Sets the userDisplayName property value. User display name. This property is read-only.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @param value Value to set for the wiFiMacAddress property.
     * @return a void
     */
    public void setWiFiMacAddress(@javax.annotation.Nullable final String value) {
        this._wiFiMacAddress = value;
    }
}
