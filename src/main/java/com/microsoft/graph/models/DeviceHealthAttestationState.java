package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthAttestationState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     */
    private String attestationIdentityKey;
    /**
     * On or Off of BitLocker Drive Encryption
     */
    private String bitLockerStatus;
    /**
     * The security version number of the Boot Application
     */
    private String bootAppSecurityVersion;
    /**
     * When bootDebugging is enabled, the device is used in development and testing
     */
    private String bootDebugging;
    /**
     * The security version number of the Boot Application
     */
    private String bootManagerSecurityVersion;
    /**
     * The version of the Boot Manager
     */
    private String bootManagerVersion;
    /**
     * The Boot Revision List that was loaded during initial boot on the attested device
     */
    private String bootRevisionListInfo;
    /**
     * When code integrity is enabled, code execution is restricted to integrity verified code
     */
    private String codeIntegrity;
    /**
     * The version of the Boot Manager
     */
    private String codeIntegrityCheckVersion;
    /**
     * The Code Integrity policy that is controlling the security of the boot environment
     */
    private String codeIntegrityPolicy;
    /**
     * The DHA report version. (Namespace version)
     */
    private String contentNamespaceUrl;
    /**
     * The HealthAttestation state schema version
     */
    private String contentVersion;
    /**
     * DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     */
    private String dataExcutionPolicy;
    /**
     * The DHA report version. (Namespace version)
     */
    private String deviceHealthAttestationStatus;
    /**
     * ELAM provides protection for the computers in your network when they start up
     */
    private String earlyLaunchAntiMalwareDriverProtection;
    /**
     * This attribute indicates if DHA is supported for the device
     */
    private String healthAttestationSupportedStatus;
    /**
     * This attribute appears if DHA-Service detects an integrity issue
     */
    private String healthStatusMismatchInfo;
    /**
     * The DateTime when device was evaluated or issued to MDM
     */
    private OffsetDateTime issuedDateTime;
    /**
     * The Timestamp of the last update.
     */
    private String lastUpdateDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     */
    private String operatingSystemKernelDebugging;
    /**
     * The Operating System Revision List that was loaded during initial boot on the attested device
     */
    private String operatingSystemRevListInfo;
    /**
     * The measurement that is captured in PCR[0]
     */
    private String pcr0;
    /**
     * Informational attribute that identifies the HASH algorithm that was used by TPM
     */
    private String pcrHashAlgorithm;
    /**
     * The number of times a PC device has hibernated or resumed
     */
    private Long resetCount;
    /**
     * The number of times a PC device has rebooted
     */
    private Long restartCount;
    /**
     * Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     */
    private String safeMode;
    /**
     * When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     */
    private String secureBoot;
    /**
     * Fingerprint of the Custom Secure Boot Configuration Policy
     */
    private String secureBootConfigurationPolicyFingerPrint;
    /**
     * When test signing is allowed, the device does not enforce signature validation during boot
     */
    private String testSigning;
    /**
     * The security version number of the Boot Application
     */
    private String tpmVersion;
    /**
     * VSM is a container that protects high value assets from a compromised kernel
     */
    private String virtualSecureMode;
    /**
     * Operating system running with limited services that is used to prepare a computer for Windows
     */
    private String windowsPE;
    /**
     * Instantiates a new deviceHealthAttestationState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceHealthAttestationState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthAttestationState
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthAttestationState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthAttestationState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAttestationIdentityKey() {
        return this.attestationIdentityKey;
    }
    /**
     * Gets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBitLockerStatus() {
        return this.bitLockerStatus;
    }
    /**
     * Gets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBootAppSecurityVersion() {
        return this.bootAppSecurityVersion;
    }
    /**
     * Gets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBootDebugging() {
        return this.bootDebugging;
    }
    /**
     * Gets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBootManagerSecurityVersion() {
        return this.bootManagerSecurityVersion;
    }
    /**
     * Gets the bootManagerVersion property value. The version of the Boot Manager
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBootManagerVersion() {
        return this.bootManagerVersion;
    }
    /**
     * Gets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBootRevisionListInfo() {
        return this.bootRevisionListInfo;
    }
    /**
     * Gets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrity() {
        return this.codeIntegrity;
    }
    /**
     * Gets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrityCheckVersion() {
        return this.codeIntegrityCheckVersion;
    }
    /**
     * Gets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrityPolicy() {
        return this.codeIntegrityPolicy;
    }
    /**
     * Gets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentNamespaceUrl() {
        return this.contentNamespaceUrl;
    }
    /**
     * Gets the contentVersion property value. The HealthAttestation state schema version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentVersion() {
        return this.contentVersion;
    }
    /**
     * Gets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDataExcutionPolicy() {
        return this.dataExcutionPolicy;
    }
    /**
     * Gets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceHealthAttestationStatus() {
        return this.deviceHealthAttestationStatus;
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEarlyLaunchAntiMalwareDriverProtection() {
        return this.earlyLaunchAntiMalwareDriverProtection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(33);
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
    @jakarta.annotation.Nullable
    public String getHealthAttestationSupportedStatus() {
        return this.healthAttestationSupportedStatus;
    }
    /**
     * Gets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHealthStatusMismatchInfo() {
        return this.healthStatusMismatchInfo;
    }
    /**
     * Gets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssuedDateTime() {
        return this.issuedDateTime;
    }
    /**
     * Gets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemKernelDebugging() {
        return this.operatingSystemKernelDebugging;
    }
    /**
     * Gets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemRevListInfo() {
        return this.operatingSystemRevListInfo;
    }
    /**
     * Gets the pcr0 property value. The measurement that is captured in PCR[0]
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPcr0() {
        return this.pcr0;
    }
    /**
     * Gets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPcrHashAlgorithm() {
        return this.pcrHashAlgorithm;
    }
    /**
     * Gets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getResetCount() {
        return this.resetCount;
    }
    /**
     * Gets the restartCount property value. The number of times a PC device has rebooted
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getRestartCount() {
        return this.restartCount;
    }
    /**
     * Gets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSafeMode() {
        return this.safeMode;
    }
    /**
     * Gets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSecureBoot() {
        return this.secureBoot;
    }
    /**
     * Gets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSecureBootConfigurationPolicyFingerPrint() {
        return this.secureBootConfigurationPolicyFingerPrint;
    }
    /**
     * Gets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTestSigning() {
        return this.testSigning;
    }
    /**
     * Gets the tpmVersion property value. The security version number of the Boot Application
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTpmVersion() {
        return this.tpmVersion;
    }
    /**
     * Gets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVirtualSecureMode() {
        return this.virtualSecureMode;
    }
    /**
     * Gets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWindowsPE() {
        return this.windowsPE;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @param value Value to set for the attestationIdentityKey property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttestationIdentityKey(@jakarta.annotation.Nullable final String value) {
        this.attestationIdentityKey = value;
    }
    /**
     * Sets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @param value Value to set for the bitLockerStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBitLockerStatus(@jakarta.annotation.Nullable final String value) {
        this.bitLockerStatus = value;
    }
    /**
     * Sets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootAppSecurityVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBootAppSecurityVersion(@jakarta.annotation.Nullable final String value) {
        this.bootAppSecurityVersion = value;
    }
    /**
     * Sets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the bootDebugging property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBootDebugging(@jakarta.annotation.Nullable final String value) {
        this.bootDebugging = value;
    }
    /**
     * Sets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootManagerSecurityVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBootManagerSecurityVersion(@jakarta.annotation.Nullable final String value) {
        this.bootManagerSecurityVersion = value;
    }
    /**
     * Sets the bootManagerVersion property value. The version of the Boot Manager
     * @param value Value to set for the bootManagerVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBootManagerVersion(@jakarta.annotation.Nullable final String value) {
        this.bootManagerVersion = value;
    }
    /**
     * Sets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the bootRevisionListInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBootRevisionListInfo(@jakarta.annotation.Nullable final String value) {
        this.bootRevisionListInfo = value;
    }
    /**
     * Sets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @param value Value to set for the codeIntegrity property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCodeIntegrity(@jakarta.annotation.Nullable final String value) {
        this.codeIntegrity = value;
    }
    /**
     * Sets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @param value Value to set for the codeIntegrityCheckVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCodeIntegrityCheckVersion(@jakarta.annotation.Nullable final String value) {
        this.codeIntegrityCheckVersion = value;
    }
    /**
     * Sets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @param value Value to set for the codeIntegrityPolicy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCodeIntegrityPolicy(@jakarta.annotation.Nullable final String value) {
        this.codeIntegrityPolicy = value;
    }
    /**
     * Sets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @param value Value to set for the contentNamespaceUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContentNamespaceUrl(@jakarta.annotation.Nullable final String value) {
        this.contentNamespaceUrl = value;
    }
    /**
     * Sets the contentVersion property value. The HealthAttestation state schema version
     * @param value Value to set for the contentVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContentVersion(@jakarta.annotation.Nullable final String value) {
        this.contentVersion = value;
    }
    /**
     * Sets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @param value Value to set for the dataExcutionPolicy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDataExcutionPolicy(@jakarta.annotation.Nullable final String value) {
        this.dataExcutionPolicy = value;
    }
    /**
     * Sets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @param value Value to set for the deviceHealthAttestationStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceHealthAttestationStatus(@jakarta.annotation.Nullable final String value) {
        this.deviceHealthAttestationStatus = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @param value Value to set for the earlyLaunchAntiMalwareDriverProtection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEarlyLaunchAntiMalwareDriverProtection(@jakarta.annotation.Nullable final String value) {
        this.earlyLaunchAntiMalwareDriverProtection = value;
    }
    /**
     * Sets the healthAttestationSupportedStatus property value. This attribute indicates if DHA is supported for the device
     * @param value Value to set for the healthAttestationSupportedStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHealthAttestationSupportedStatus(@jakarta.annotation.Nullable final String value) {
        this.healthAttestationSupportedStatus = value;
    }
    /**
     * Sets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @param value Value to set for the healthStatusMismatchInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHealthStatusMismatchInfo(@jakarta.annotation.Nullable final String value) {
        this.healthStatusMismatchInfo = value;
    }
    /**
     * Sets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @param value Value to set for the issuedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIssuedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.issuedDateTime = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final String value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the operatingSystemKernelDebugging property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperatingSystemKernelDebugging(@jakarta.annotation.Nullable final String value) {
        this.operatingSystemKernelDebugging = value;
    }
    /**
     * Sets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the operatingSystemRevListInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperatingSystemRevListInfo(@jakarta.annotation.Nullable final String value) {
        this.operatingSystemRevListInfo = value;
    }
    /**
     * Sets the pcr0 property value. The measurement that is captured in PCR[0]
     * @param value Value to set for the pcr0 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPcr0(@jakarta.annotation.Nullable final String value) {
        this.pcr0 = value;
    }
    /**
     * Sets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @param value Value to set for the pcrHashAlgorithm property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPcrHashAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.pcrHashAlgorithm = value;
    }
    /**
     * Sets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @param value Value to set for the resetCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResetCount(@jakarta.annotation.Nullable final Long value) {
        this.resetCount = value;
    }
    /**
     * Sets the restartCount property value. The number of times a PC device has rebooted
     * @param value Value to set for the restartCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRestartCount(@jakarta.annotation.Nullable final Long value) {
        this.restartCount = value;
    }
    /**
     * Sets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @param value Value to set for the safeMode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSafeMode(@jakarta.annotation.Nullable final String value) {
        this.safeMode = value;
    }
    /**
     * Sets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @param value Value to set for the secureBoot property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecureBoot(@jakarta.annotation.Nullable final String value) {
        this.secureBoot = value;
    }
    /**
     * Sets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @param value Value to set for the secureBootConfigurationPolicyFingerPrint property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecureBootConfigurationPolicyFingerPrint(@jakarta.annotation.Nullable final String value) {
        this.secureBootConfigurationPolicyFingerPrint = value;
    }
    /**
     * Sets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @param value Value to set for the testSigning property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTestSigning(@jakarta.annotation.Nullable final String value) {
        this.testSigning = value;
    }
    /**
     * Sets the tpmVersion property value. The security version number of the Boot Application
     * @param value Value to set for the tpmVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTpmVersion(@jakarta.annotation.Nullable final String value) {
        this.tpmVersion = value;
    }
    /**
     * Sets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @param value Value to set for the virtualSecureMode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVirtualSecureMode(@jakarta.annotation.Nullable final String value) {
        this.virtualSecureMode = value;
    }
    /**
     * Sets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @param value Value to set for the windowsPE property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsPE(@jakarta.annotation.Nullable final String value) {
        this.windowsPE = value;
    }
}
