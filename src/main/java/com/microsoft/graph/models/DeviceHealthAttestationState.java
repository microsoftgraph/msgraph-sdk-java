package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthAttestationState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new DeviceHealthAttestationState and sets the default values.
     */
    public DeviceHealthAttestationState() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthAttestationState
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthAttestationState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthAttestationState();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAttestationIdentityKey() {
        return this.backingStore.get("attestationIdentityKey");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBitLockerStatus() {
        return this.backingStore.get("bitLockerStatus");
    }
    /**
     * Gets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBootAppSecurityVersion() {
        return this.backingStore.get("bootAppSecurityVersion");
    }
    /**
     * Gets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBootDebugging() {
        return this.backingStore.get("bootDebugging");
    }
    /**
     * Gets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBootManagerSecurityVersion() {
        return this.backingStore.get("bootManagerSecurityVersion");
    }
    /**
     * Gets the bootManagerVersion property value. The version of the Boot Manager
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBootManagerVersion() {
        return this.backingStore.get("bootManagerVersion");
    }
    /**
     * Gets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBootRevisionListInfo() {
        return this.backingStore.get("bootRevisionListInfo");
    }
    /**
     * Gets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrity() {
        return this.backingStore.get("codeIntegrity");
    }
    /**
     * Gets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrityCheckVersion() {
        return this.backingStore.get("codeIntegrityCheckVersion");
    }
    /**
     * Gets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCodeIntegrityPolicy() {
        return this.backingStore.get("codeIntegrityPolicy");
    }
    /**
     * Gets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentNamespaceUrl() {
        return this.backingStore.get("contentNamespaceUrl");
    }
    /**
     * Gets the contentVersion property value. The HealthAttestation state schema version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentVersion() {
        return this.backingStore.get("contentVersion");
    }
    /**
     * Gets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataExcutionPolicy() {
        return this.backingStore.get("dataExcutionPolicy");
    }
    /**
     * Gets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceHealthAttestationStatus() {
        return this.backingStore.get("deviceHealthAttestationStatus");
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEarlyLaunchAntiMalwareDriverProtection() {
        return this.backingStore.get("earlyLaunchAntiMalwareDriverProtection");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHealthAttestationSupportedStatus() {
        return this.backingStore.get("healthAttestationSupportedStatus");
    }
    /**
     * Gets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHealthStatusMismatchInfo() {
        return this.backingStore.get("healthStatusMismatchInfo");
    }
    /**
     * Gets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssuedDateTime() {
        return this.backingStore.get("issuedDateTime");
    }
    /**
     * Gets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemKernelDebugging() {
        return this.backingStore.get("operatingSystemKernelDebugging");
    }
    /**
     * Gets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemRevListInfo() {
        return this.backingStore.get("operatingSystemRevListInfo");
    }
    /**
     * Gets the pcr0 property value. The measurement that is captured in PCR[0]
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPcr0() {
        return this.backingStore.get("pcr0");
    }
    /**
     * Gets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPcrHashAlgorithm() {
        return this.backingStore.get("pcrHashAlgorithm");
    }
    /**
     * Gets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getResetCount() {
        return this.backingStore.get("resetCount");
    }
    /**
     * Gets the restartCount property value. The number of times a PC device has rebooted
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getRestartCount() {
        return this.backingStore.get("restartCount");
    }
    /**
     * Gets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSafeMode() {
        return this.backingStore.get("safeMode");
    }
    /**
     * Gets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecureBoot() {
        return this.backingStore.get("secureBoot");
    }
    /**
     * Gets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecureBootConfigurationPolicyFingerPrint() {
        return this.backingStore.get("secureBootConfigurationPolicyFingerPrint");
    }
    /**
     * Gets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTestSigning() {
        return this.backingStore.get("testSigning");
    }
    /**
     * Gets the tpmVersion property value. The security version number of the Boot Application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTpmVersion() {
        return this.backingStore.get("tpmVersion");
    }
    /**
     * Gets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVirtualSecureMode() {
        return this.backingStore.get("virtualSecureMode");
    }
    /**
     * Gets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWindowsPE() {
        return this.backingStore.get("windowsPE");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the attestationIdentityKey property value. TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     * @param value Value to set for the attestationIdentityKey property.
     */
    public void setAttestationIdentityKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attestationIdentityKey", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bitLockerStatus property value. On or Off of BitLocker Drive Encryption
     * @param value Value to set for the bitLockerStatus property.
     */
    public void setBitLockerStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bitLockerStatus", value);
    }
    /**
     * Sets the bootAppSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootAppSecurityVersion property.
     */
    public void setBootAppSecurityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bootAppSecurityVersion", value);
    }
    /**
     * Sets the bootDebugging property value. When bootDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the bootDebugging property.
     */
    public void setBootDebugging(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bootDebugging", value);
    }
    /**
     * Sets the bootManagerSecurityVersion property value. The security version number of the Boot Application
     * @param value Value to set for the bootManagerSecurityVersion property.
     */
    public void setBootManagerSecurityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bootManagerSecurityVersion", value);
    }
    /**
     * Sets the bootManagerVersion property value. The version of the Boot Manager
     * @param value Value to set for the bootManagerVersion property.
     */
    public void setBootManagerVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bootManagerVersion", value);
    }
    /**
     * Sets the bootRevisionListInfo property value. The Boot Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the bootRevisionListInfo property.
     */
    public void setBootRevisionListInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bootRevisionListInfo", value);
    }
    /**
     * Sets the codeIntegrity property value. When code integrity is enabled, code execution is restricted to integrity verified code
     * @param value Value to set for the codeIntegrity property.
     */
    public void setCodeIntegrity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("codeIntegrity", value);
    }
    /**
     * Sets the codeIntegrityCheckVersion property value. The version of the Boot Manager
     * @param value Value to set for the codeIntegrityCheckVersion property.
     */
    public void setCodeIntegrityCheckVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("codeIntegrityCheckVersion", value);
    }
    /**
     * Sets the codeIntegrityPolicy property value. The Code Integrity policy that is controlling the security of the boot environment
     * @param value Value to set for the codeIntegrityPolicy property.
     */
    public void setCodeIntegrityPolicy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("codeIntegrityPolicy", value);
    }
    /**
     * Sets the contentNamespaceUrl property value. The DHA report version. (Namespace version)
     * @param value Value to set for the contentNamespaceUrl property.
     */
    public void setContentNamespaceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentNamespaceUrl", value);
    }
    /**
     * Sets the contentVersion property value. The HealthAttestation state schema version
     * @param value Value to set for the contentVersion property.
     */
    public void setContentVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentVersion", value);
    }
    /**
     * Sets the dataExcutionPolicy property value. DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
     * @param value Value to set for the dataExcutionPolicy property.
     */
    public void setDataExcutionPolicy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataExcutionPolicy", value);
    }
    /**
     * Sets the deviceHealthAttestationStatus property value. The DHA report version. (Namespace version)
     * @param value Value to set for the deviceHealthAttestationStatus property.
     */
    public void setDeviceHealthAttestationStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceHealthAttestationStatus", value);
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverProtection property value. ELAM provides protection for the computers in your network when they start up
     * @param value Value to set for the earlyLaunchAntiMalwareDriverProtection property.
     */
    public void setEarlyLaunchAntiMalwareDriverProtection(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("earlyLaunchAntiMalwareDriverProtection", value);
    }
    /**
     * Sets the healthAttestationSupportedStatus property value. This attribute indicates if DHA is supported for the device
     * @param value Value to set for the healthAttestationSupportedStatus property.
     */
    public void setHealthAttestationSupportedStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("healthAttestationSupportedStatus", value);
    }
    /**
     * Sets the healthStatusMismatchInfo property value. This attribute appears if DHA-Service detects an integrity issue
     * @param value Value to set for the healthStatusMismatchInfo property.
     */
    public void setHealthStatusMismatchInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("healthStatusMismatchInfo", value);
    }
    /**
     * Sets the issuedDateTime property value. The DateTime when device was evaluated or issued to MDM
     * @param value Value to set for the issuedDateTime property.
     */
    public void setIssuedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("issuedDateTime", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. The Timestamp of the last update.
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operatingSystemKernelDebugging property value. When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     * @param value Value to set for the operatingSystemKernelDebugging property.
     */
    public void setOperatingSystemKernelDebugging(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemKernelDebugging", value);
    }
    /**
     * Sets the operatingSystemRevListInfo property value. The Operating System Revision List that was loaded during initial boot on the attested device
     * @param value Value to set for the operatingSystemRevListInfo property.
     */
    public void setOperatingSystemRevListInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemRevListInfo", value);
    }
    /**
     * Sets the pcr0 property value. The measurement that is captured in PCR[0]
     * @param value Value to set for the pcr0 property.
     */
    public void setPcr0(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pcr0", value);
    }
    /**
     * Sets the pcrHashAlgorithm property value. Informational attribute that identifies the HASH algorithm that was used by TPM
     * @param value Value to set for the pcrHashAlgorithm property.
     */
    public void setPcrHashAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pcrHashAlgorithm", value);
    }
    /**
     * Sets the resetCount property value. The number of times a PC device has hibernated or resumed
     * @param value Value to set for the resetCount property.
     */
    public void setResetCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("resetCount", value);
    }
    /**
     * Sets the restartCount property value. The number of times a PC device has rebooted
     * @param value Value to set for the restartCount property.
     */
    public void setRestartCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("restartCount", value);
    }
    /**
     * Sets the safeMode property value. Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     * @param value Value to set for the safeMode property.
     */
    public void setSafeMode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("safeMode", value);
    }
    /**
     * Sets the secureBoot property value. When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     * @param value Value to set for the secureBoot property.
     */
    public void setSecureBoot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secureBoot", value);
    }
    /**
     * Sets the secureBootConfigurationPolicyFingerPrint property value. Fingerprint of the Custom Secure Boot Configuration Policy
     * @param value Value to set for the secureBootConfigurationPolicyFingerPrint property.
     */
    public void setSecureBootConfigurationPolicyFingerPrint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secureBootConfigurationPolicyFingerPrint", value);
    }
    /**
     * Sets the testSigning property value. When test signing is allowed, the device does not enforce signature validation during boot
     * @param value Value to set for the testSigning property.
     */
    public void setTestSigning(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("testSigning", value);
    }
    /**
     * Sets the tpmVersion property value. The security version number of the Boot Application
     * @param value Value to set for the tpmVersion property.
     */
    public void setTpmVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tpmVersion", value);
    }
    /**
     * Sets the virtualSecureMode property value. VSM is a container that protects high value assets from a compromised kernel
     * @param value Value to set for the virtualSecureMode property.
     */
    public void setVirtualSecureMode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("virtualSecureMode", value);
    }
    /**
     * Sets the windowsPE property value. Operating system running with limited services that is used to prepare a computer for Windows
     * @param value Value to set for the windowsPE property.
     */
    public void setWindowsPE(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windowsPE", value);
    }
}
