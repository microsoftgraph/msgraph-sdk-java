package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthAttestationState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate. */
    private String _attestationIdentityKey;
    /** On or Off of BitLocker Drive Encryption */
    private String _bitLockerStatus;
    /** The security version number of the Boot Application */
    private String _bootAppSecurityVersion;
    /** When bootDebugging is enabled, the device is used in development and testing */
    private String _bootDebugging;
    /** The security version number of the Boot Application */
    private String _bootManagerSecurityVersion;
    /** The version of the Boot Manager */
    private String _bootManagerVersion;
    /** The Boot Revision List that was loaded during initial boot on the attested device */
    private String _bootRevisionListInfo;
    /** When code integrity is enabled, code execution is restricted to integrity verified code */
    private String _codeIntegrity;
    /** The version of the Boot Manager */
    private String _codeIntegrityCheckVersion;
    /** The Code Integrity policy that is controlling the security of the boot environment */
    private String _codeIntegrityPolicy;
    /** The DHA report version. (Namespace version) */
    private String _contentNamespaceUrl;
    /** The HealthAttestation state schema version */
    private String _contentVersion;
    /** DEP Policy defines a set of hardware and software technologies that perform additional checks on memory */
    private String _dataExcutionPolicy;
    /** The DHA report version. (Namespace version) */
    private String _deviceHealthAttestationStatus;
    /** ELAM provides protection for the computers in your network when they start up */
    private String _earlyLaunchAntiMalwareDriverProtection;
    /** This attribute indicates if DHA is supported for the device */
    private String _healthAttestationSupportedStatus;
    /** This attribute appears if DHA-Service detects an integrity issue */
    private String _healthStatusMismatchInfo;
    /** The DateTime when device was evaluated or issued to MDM */
    private OffsetDateTime _issuedDateTime;
    /** The Timestamp of the last update. */
    private String _lastUpdateDateTime;
    /** The OdataType property */
    private String _odataType;
    /** When operatingSystemKernelDebugging is enabled, the device is used in development and testing */
    private String _operatingSystemKernelDebugging;
    /** The Operating System Revision List that was loaded during initial boot on the attested device */
    private String _operatingSystemRevListInfo;
    /** The measurement that is captured in PCR[0] */
    private String _pcr0;
    /** Informational attribute that identifies the HASH algorithm that was used by TPM */
    private String _pcrHashAlgorithm;
    /** The number of times a PC device has hibernated or resumed */
    private Long _resetCount;
    /** The number of times a PC device has rebooted */
    private Long _restartCount;
    /** Safe mode is a troubleshooting option for Windows that starts your computer in a limited state */
    private String _safeMode;
    /** When Secure Boot is enabled, the core components must have the correct cryptographic signatures */
    private String _secureBoot;
    /** Fingerprint of the Custom Secure Boot Configuration Policy */
    private String _secureBootConfigurationPolicyFingerPrint;
    /** When test signing is allowed, the device does not enforce signature validation during boot */
    private String _testSigning;
    /** The security version number of the Boot Application */
    private String _tpmVersion;
    /** VSM is a container that protects high value assets from a compromised kernel */
    private String _virtualSecureMode;
    /** Operating system running with limited services that is used to prepare a computer for Windows */
    private String _windowsPE;
    /**
     * Instantiates a new deviceHealthAttestationState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthAttestationState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthAttestationState
     */
    @javax.annotation.Nonnull
    public static DeviceHealthAttestationState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthAttestationState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttestationIdentityKey() {
        return this._attestationIdentityKey;
    }
    /**
     * Gets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBitLockerStatus() {
        return this._bitLockerStatus;
    }
    /**
     * Gets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootAppSecurityVersion() {
        return this._bootAppSecurityVersion;
    }
    /**
     * Gets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootDebugging() {
        return this._bootDebugging;
    }
    /**
     * Gets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootManagerSecurityVersion() {
        return this._bootManagerSecurityVersion;
    }
    /**
     * Gets the bootManagerVersion property value. The version of the Boot Manager
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootManagerVersion() {
        return this._bootManagerVersion;
    }
    /**
     * Gets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBootRevisionListInfo() {
        return this._bootRevisionListInfo;
    }
    /**
     * Gets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeIntegrity() {
        return this._codeIntegrity;
    }
    /**
     * Gets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeIntegrityCheckVersion() {
        return this._codeIntegrityCheckVersion;
    }
    /**
     * Gets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeIntegrityPolicy() {
        return this._codeIntegrityPolicy;
    }
    /**
     * Gets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentNamespaceUrl() {
        return this._contentNamespaceUrl;
    }
    /**
     * Gets the contentVersion property value. The HealthAttestation state schema version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentVersion() {
        return this._contentVersion;
    }
    /**
     * Gets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataExcutionPolicy() {
        return this._dataExcutionPolicy;
    }
    /**
     * Gets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceHealthAttestationStatus() {
        return this._deviceHealthAttestationStatus;
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEarlyLaunchAntiMalwareDriverProtection() {
        return this._earlyLaunchAntiMalwareDriverProtection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(33);
        deserializerMap.put("attestationIdentityKey", (n) -> { this.setAttestationIdentityKey(n.getStringValue()); });
        deserializerMap.put("bitLockerStatus", (n) -> { this.setBitLockerStatus(n.getStringValue()); });
        deserializerMap.put("bootAppSecurityVersion", (n) -> { this.setBootAppSecurityVersion(n.getStringValue()); });
        deserializerMap.put("bootDebugging", (n) -> { this.setBootDebugging(n.getStringValue()); });
        deserializerMap.put("bootManagerSecurityVersion", (n) -> { this.setBootManagerSecurityVersion(n.getStringValue()); });
        deserializerMap.put("bootManagerVersion", (n) -> { this.setBootManagerVersion(n.getStringValue()); });
        deserializerMap.put("bootRevisionListInfo", (n) -> { this.setBootRevisionListInfo(n.getStringValue()); });
        deserializerMap.put("codeIntegrity", (n) -> { this.setCodeIntegrity(n.getStringValue()); });
        deserializerMap.put("codeIntegrityCheckVersion", (n) -> { this.setCodeIntegrityCheckVersion(n.getStringValue()); });
        deserializerMap.put("codeIntegrityPolicy", (n) -> { this.setCodeIntegrityPolicy(n.getStringValue()); });
        deserializerMap.put("contentNamespaceUrl", (n) -> { this.setContentNamespaceUrl(n.getStringValue()); });
        deserializerMap.put("contentVersion", (n) -> { this.setContentVersion(n.getStringValue()); });
        deserializerMap.put("dataExcutionPolicy", (n) -> { this.setDataExcutionPolicy(n.getStringValue()); });
        deserializerMap.put("deviceHealthAttestationStatus", (n) -> { this.setDeviceHealthAttestationStatus(n.getStringValue()); });
        deserializerMap.put("earlyLaunchAntiMalwareDriverProtection", (n) -> { this.setEarlyLaunchAntiMalwareDriverProtection(n.getStringValue()); });
        deserializerMap.put("healthAttestationSupportedStatus", (n) -> { this.setHealthAttestationSupportedStatus(n.getStringValue()); });
        deserializerMap.put("healthStatusMismatchInfo", (n) -> { this.setHealthStatusMismatchInfo(n.getStringValue()); });
        deserializerMap.put("issuedDateTime", (n) -> { this.setIssuedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystemKernelDebugging", (n) -> { this.setOperatingSystemKernelDebugging(n.getStringValue()); });
        deserializerMap.put("operatingSystemRevListInfo", (n) -> { this.setOperatingSystemRevListInfo(n.getStringValue()); });
        deserializerMap.put("pcr0", (n) -> { this.setPcr0(n.getStringValue()); });
        deserializerMap.put("pcrHashAlgorithm", (n) -> { this.setPcrHashAlgorithm(n.getStringValue()); });
        deserializerMap.put("resetCount", (n) -> { this.setResetCount(n.getLongValue()); });
        deserializerMap.put("restartCount", (n) -> { this.setRestartCount(n.getLongValue()); });
        deserializerMap.put("safeMode", (n) -> { this.setSafeMode(n.getStringValue()); });
        deserializerMap.put("secureBoot", (n) -> { this.setSecureBoot(n.getStringValue()); });
        deserializerMap.put("secureBootConfigurationPolicyFingerPrint", (n) -> { this.setSecureBootConfigurationPolicyFingerPrint(n.getStringValue()); });
        deserializerMap.put("testSigning", (n) -> { this.setTestSigning(n.getStringValue()); });
        deserializerMap.put("tpmVersion", (n) -> { this.setTpmVersion(n.getStringValue()); });
        deserializerMap.put("virtualSecureMode", (n) -> { this.setVirtualSecureMode(n.getStringValue()); });
        deserializerMap.put("windowsPE", (n) -> { this.setWindowsPE(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthAttestationSupportedStatus property value. This attribute indicates if DHA is supported for the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHealthAttestationSupportedStatus() {
        return this._healthAttestationSupportedStatus;
    }
    /**
     * Gets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHealthStatusMismatchInfo() {
        return this._healthStatusMismatchInfo;
    }
    /**
     * Gets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getIssuedDateTime() {
        return this._issuedDateTime;
    }
    /**
     * Gets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUpdateDateTime() {
        return this._lastUpdateDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemKernelDebugging() {
        return this._operatingSystemKernelDebugging;
    }
    /**
     * Gets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemRevListInfo() {
        return this._operatingSystemRevListInfo;
    }
    /**
     * Gets the pcr0 property value. The measurement that is captured in PCR[0]
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPcr0() {
        return this._pcr0;
    }
    /**
     * Gets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPcrHashAlgorithm() {
        return this._pcrHashAlgorithm;
    }
    /**
     * Gets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getResetCount() {
        return this._resetCount;
    }
    /**
     * Gets the restartCount property value. The number of times a PC device has rebooted
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRestartCount() {
        return this._restartCount;
    }
    /**
     * Gets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSafeMode() {
        return this._safeMode;
    }
    /**
     * Gets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecureBoot() {
        return this._secureBoot;
    }
    /**
     * Gets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecureBootConfigurationPolicyFingerPrint() {
        return this._secureBootConfigurationPolicyFingerPrint;
    }
    /**
     * Gets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTestSigning() {
        return this._testSigning;
    }
    /**
     * Gets the tpmVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmVersion() {
        return this._tpmVersion;
    }
    /**
     * Gets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVirtualSecureMode() {
        return this._virtualSecureMode;
    }
    /**
     * Gets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWindowsPE() {
        return this._windowsPE;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attestationIdentityKey", this.getAttestationIdentityKey());
        writer.writeStringValue("bitLockerStatus", this.getBitLockerStatus());
        writer.writeStringValue("bootAppSecurityVersion", this.getBootAppSecurityVersion());
        writer.writeStringValue("bootDebugging", this.getBootDebugging());
        writer.writeStringValue("bootManagerSecurityVersion", this.getBootManagerSecurityVersion());
        writer.writeStringValue("bootManagerVersion", this.getBootManagerVersion());
        writer.writeStringValue("bootRevisionListInfo", this.getBootRevisionListInfo());
        writer.writeStringValue("codeIntegrity", this.getCodeIntegrity());
        writer.writeStringValue("codeIntegrityCheckVersion", this.getCodeIntegrityCheckVersion());
        writer.writeStringValue("codeIntegrityPolicy", this.getCodeIntegrityPolicy());
        writer.writeStringValue("contentNamespaceUrl", this.getContentNamespaceUrl());
        writer.writeStringValue("contentVersion", this.getContentVersion());
        writer.writeStringValue("dataExcutionPolicy", this.getDataExcutionPolicy());
        writer.writeStringValue("deviceHealthAttestationStatus", this.getDeviceHealthAttestationStatus());
        writer.writeStringValue("earlyLaunchAntiMalwareDriverProtection", this.getEarlyLaunchAntiMalwareDriverProtection());
        writer.writeStringValue("healthAttestationSupportedStatus", this.getHealthAttestationSupportedStatus());
        writer.writeStringValue("healthStatusMismatchInfo", this.getHealthStatusMismatchInfo());
        writer.writeOffsetDateTimeValue("issuedDateTime", this.getIssuedDateTime());
        writer.writeStringValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystemKernelDebugging", this.getOperatingSystemKernelDebugging());
        writer.writeStringValue("operatingSystemRevListInfo", this.getOperatingSystemRevListInfo());
        writer.writeStringValue("pcr0", this.getPcr0());
        writer.writeStringValue("pcrHashAlgorithm", this.getPcrHashAlgorithm());
        writer.writeLongValue("resetCount", this.getResetCount());
        writer.writeLongValue("restartCount", this.getRestartCount());
        writer.writeStringValue("safeMode", this.getSafeMode());
        writer.writeStringValue("secureBoot", this.getSecureBoot());
        writer.writeStringValue("secureBootConfigurationPolicyFingerPrint", this.getSecureBootConfigurationPolicyFingerPrint());
        writer.writeStringValue("testSigning", this.getTestSigning());
        writer.writeStringValue("tpmVersion", this.getTpmVersion());
        writer.writeStringValue("virtualSecureMode", this.getVirtualSecureMode());
        writer.writeStringValue("windowsPE", this.getWindowsPE());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @param value Value to set for the attestationIdentityKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttestationIdentityKey(@javax.annotation.Nullable final String value) {
        this._attestationIdentityKey = value;
    }
    /**
     * Sets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @param value Value to set for the bitLockerStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerStatus(@javax.annotation.Nullable final String value) {
        this._bitLockerStatus = value;
    }
    /**
     * Sets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootAppSecurityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootAppSecurityVersion(@javax.annotation.Nullable final String value) {
        this._bootAppSecurityVersion = value;
    }
    /**
     * Sets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the bootDebugging property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootDebugging(@javax.annotation.Nullable final String value) {
        this._bootDebugging = value;
    }
    /**
     * Sets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootManagerSecurityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootManagerSecurityVersion(@javax.annotation.Nullable final String value) {
        this._bootManagerSecurityVersion = value;
    }
    /**
     * Sets the bootManagerVersion property value. The version of the Boot Manager
     * @param value Value to set for the bootManagerVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootManagerVersion(@javax.annotation.Nullable final String value) {
        this._bootManagerVersion = value;
    }
    /**
     * Sets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the bootRevisionListInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootRevisionListInfo(@javax.annotation.Nullable final String value) {
        this._bootRevisionListInfo = value;
    }
    /**
     * Sets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @param value Value to set for the codeIntegrity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeIntegrity(@javax.annotation.Nullable final String value) {
        this._codeIntegrity = value;
    }
    /**
     * Sets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @param value Value to set for the codeIntegrityCheckVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeIntegrityCheckVersion(@javax.annotation.Nullable final String value) {
        this._codeIntegrityCheckVersion = value;
    }
    /**
     * Sets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @param value Value to set for the codeIntegrityPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeIntegrityPolicy(@javax.annotation.Nullable final String value) {
        this._codeIntegrityPolicy = value;
    }
    /**
     * Sets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @param value Value to set for the contentNamespaceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentNamespaceUrl(@javax.annotation.Nullable final String value) {
        this._contentNamespaceUrl = value;
    }
    /**
     * Sets the contentVersion property value. The HealthAttestation state schema version
     * @param value Value to set for the contentVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentVersion(@javax.annotation.Nullable final String value) {
        this._contentVersion = value;
    }
    /**
     * Sets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @param value Value to set for the dataExcutionPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataExcutionPolicy(@javax.annotation.Nullable final String value) {
        this._dataExcutionPolicy = value;
    }
    /**
     * Sets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @param value Value to set for the deviceHealthAttestationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceHealthAttestationStatus(@javax.annotation.Nullable final String value) {
        this._deviceHealthAttestationStatus = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @param value Value to set for the earlyLaunchAntiMalwareDriverProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEarlyLaunchAntiMalwareDriverProtection(@javax.annotation.Nullable final String value) {
        this._earlyLaunchAntiMalwareDriverProtection = value;
    }
    /**
     * Sets the healthAttestationSupportedStatus property value. This attribute indicates if DHA is supported for the device
     * @param value Value to set for the healthAttestationSupportedStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthAttestationSupportedStatus(@javax.annotation.Nullable final String value) {
        this._healthAttestationSupportedStatus = value;
    }
    /**
     * Sets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @param value Value to set for the healthStatusMismatchInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatusMismatchInfo(@javax.annotation.Nullable final String value) {
        this._healthStatusMismatchInfo = value;
    }
    /**
     * Sets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @param value Value to set for the issuedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._issuedDateTime = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdateDateTime(@javax.annotation.Nullable final String value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the operatingSystemKernelDebugging property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemKernelDebugging(@javax.annotation.Nullable final String value) {
        this._operatingSystemKernelDebugging = value;
    }
    /**
     * Sets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the operatingSystemRevListInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemRevListInfo(@javax.annotation.Nullable final String value) {
        this._operatingSystemRevListInfo = value;
    }
    /**
     * Sets the pcr0 property value. The measurement that is captured in PCR[0]
     * @param value Value to set for the pcr0 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPcr0(@javax.annotation.Nullable final String value) {
        this._pcr0 = value;
    }
    /**
     * Sets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @param value Value to set for the pcrHashAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPcrHashAlgorithm(@javax.annotation.Nullable final String value) {
        this._pcrHashAlgorithm = value;
    }
    /**
     * Sets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @param value Value to set for the resetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResetCount(@javax.annotation.Nullable final Long value) {
        this._resetCount = value;
    }
    /**
     * Sets the restartCount property value. The number of times a PC device has rebooted
     * @param value Value to set for the restartCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartCount(@javax.annotation.Nullable final Long value) {
        this._restartCount = value;
    }
    /**
     * Sets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @param value Value to set for the safeMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafeMode(@javax.annotation.Nullable final String value) {
        this._safeMode = value;
    }
    /**
     * Sets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @param value Value to set for the secureBoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureBoot(@javax.annotation.Nullable final String value) {
        this._secureBoot = value;
    }
    /**
     * Sets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @param value Value to set for the secureBootConfigurationPolicyFingerPrint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureBootConfigurationPolicyFingerPrint(@javax.annotation.Nullable final String value) {
        this._secureBootConfigurationPolicyFingerPrint = value;
    }
    /**
     * Sets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @param value Value to set for the testSigning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTestSigning(@javax.annotation.Nullable final String value) {
        this._testSigning = value;
    }
    /**
     * Sets the tpmVersion property value. The security version number of the Boot Application
     * @param value Value to set for the tpmVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmVersion(@javax.annotation.Nullable final String value) {
        this._tpmVersion = value;
    }
    /**
     * Sets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @param value Value to set for the virtualSecureMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVirtualSecureMode(@javax.annotation.Nullable final String value) {
        this._virtualSecureMode = value;
    }
    /**
     * Sets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @param value Value to set for the windowsPE property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsPE(@javax.annotation.Nullable final String value) {
        this._windowsPE = value;
    }
}
