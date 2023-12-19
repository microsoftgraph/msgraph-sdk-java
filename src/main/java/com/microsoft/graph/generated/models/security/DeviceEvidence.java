package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new DeviceEvidence and sets the default values.
     */
    public DeviceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.deviceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEvidence
     */
    @jakarta.annotation.Nonnull
    public static DeviceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEvidence();
    }
    /**
     * Gets the azureAdDeviceId property value. A unique identifier assigned to a device by Microsoft Entra ID when device is Microsoft Entra joined.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.backingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @return a DeviceEvidenceDefenderAvStatus
     */
    @jakarta.annotation.Nullable
    public DeviceEvidenceDefenderAvStatus getDefenderAvStatus() {
        return this.backingStore.get("defenderAvStatus");
    }
    /**
     * Gets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDnsName() {
        return this.backingStore.get("deviceDnsName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("defenderAvStatus", (n) -> { this.setDefenderAvStatus(n.getEnumValue(DeviceEvidenceDefenderAvStatus::forValue)); });
        deserializerMap.put("deviceDnsName", (n) -> { this.setDeviceDnsName(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(DeviceEvidenceHealthStatus::forValue)); });
        deserializerMap.put("ipInterfaces", (n) -> { this.setIpInterfaces(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("loggedOnUsers", (n) -> { this.setLoggedOnUsers(n.getCollectionOfObjectValues(LoggedOnUser::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(DeviceEvidenceOnboardingStatus::forValue)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getLongValue()); });
        deserializerMap.put("osPlatform", (n) -> { this.setOsPlatform(n.getStringValue()); });
        deserializerMap.put("rbacGroupId", (n) -> { this.setRbacGroupId(n.getIntegerValue()); });
        deserializerMap.put("rbacGroupName", (n) -> { this.setRbacGroupName(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getEnumValue(DeviceEvidenceRiskScore::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("vmMetadata", (n) -> { this.setVmMetadata(n.getObjectValue(VmMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The date and time when the device was first seen.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the healthStatus property value. The health state of the device. The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @return a DeviceEvidenceHealthStatus
     */
    @jakarta.annotation.Nullable
    public DeviceEvidenceHealthStatus getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpInterfaces() {
        return this.backingStore.get("ipInterfaces");
    }
    /**
     * Gets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @return a java.util.List<LoggedOnUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoggedOnUser> getLoggedOnUsers() {
        return this.backingStore.get("loggedOnUsers");
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.backingStore.get("mdeDeviceId");
    }
    /**
     * Gets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint. The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @return a DeviceEvidenceOnboardingStatus
     */
    @jakarta.annotation.Nullable
    public DeviceEvidenceOnboardingStatus getOnboardingStatus() {
        return this.backingStore.get("onboardingStatus");
    }
    /**
     * Gets the osBuild property value. The build version for the operating system the device is running.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getOsBuild() {
        return this.backingStore.get("osBuild");
    }
    /**
     * Gets the osPlatform property value. The operating system platform the device is running.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsPlatform() {
        return this.backingStore.get("osPlatform");
    }
    /**
     * Gets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRbacGroupId() {
        return this.backingStore.get("rbacGroupId");
    }
    /**
     * Gets the rbacGroupName property value. The name of the RBAC device group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRbacGroupName() {
        return this.backingStore.get("rbacGroupName");
    }
    /**
     * Gets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @return a DeviceEvidenceRiskScore
     */
    @jakarta.annotation.Nullable
    public DeviceEvidenceRiskScore getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the version property value. The version of the operating system platform.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @return a VmMetadata
     */
    @jakarta.annotation.Nullable
    public VmMetadata getVmMetadata() {
        return this.backingStore.get("vmMetadata");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeEnumValue("defenderAvStatus", this.getDefenderAvStatus());
        writer.writeStringValue("deviceDnsName", this.getDeviceDnsName());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeCollectionOfPrimitiveValues("ipInterfaces", this.getIpInterfaces());
        writer.writeCollectionOfObjectValues("loggedOnUsers", this.getLoggedOnUsers());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeLongValue("osBuild", this.getOsBuild());
        writer.writeStringValue("osPlatform", this.getOsPlatform());
        writer.writeIntegerValue("rbacGroupId", this.getRbacGroupId());
        writer.writeStringValue("rbacGroupName", this.getRbacGroupName());
        writer.writeEnumValue("riskScore", this.getRiskScore());
        writer.writeStringValue("version", this.getVersion());
        writer.writeObjectValue("vmMetadata", this.getVmMetadata());
    }
    /**
     * Sets the azureAdDeviceId property value. A unique identifier assigned to a device by Microsoft Entra ID when device is Microsoft Entra joined.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdDeviceId", value);
    }
    /**
     * Sets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @param value Value to set for the defenderAvStatus property.
     */
    public void setDefenderAvStatus(@jakarta.annotation.Nullable final DeviceEvidenceDefenderAvStatus value) {
        this.backingStore.set("defenderAvStatus", value);
    }
    /**
     * Sets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @param value Value to set for the deviceDnsName property.
     */
    public void setDeviceDnsName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDnsName", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The date and time when the device was first seen.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the healthStatus property value. The health state of the device. The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final DeviceEvidenceHealthStatus value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @param value Value to set for the ipInterfaces property.
     */
    public void setIpInterfaces(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ipInterfaces", value);
    }
    /**
     * Sets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @param value Value to set for the loggedOnUsers property.
     */
    public void setLoggedOnUsers(@jakarta.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this.backingStore.set("loggedOnUsers", value);
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     */
    public void setMdeDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdeDeviceId", value);
    }
    /**
     * Sets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint. The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final DeviceEvidenceOnboardingStatus value) {
        this.backingStore.set("onboardingStatus", value);
    }
    /**
     * Sets the osBuild property value. The build version for the operating system the device is running.
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("osBuild", value);
    }
    /**
     * Sets the osPlatform property value. The operating system platform the device is running.
     * @param value Value to set for the osPlatform property.
     */
    public void setOsPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osPlatform", value);
    }
    /**
     * Sets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @param value Value to set for the rbacGroupId property.
     */
    public void setRbacGroupId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rbacGroupId", value);
    }
    /**
     * Sets the rbacGroupName property value. The name of the RBAC device group.
     * @param value Value to set for the rbacGroupName property.
     */
    public void setRbacGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rbacGroupName", value);
    }
    /**
     * Sets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final DeviceEvidenceRiskScore value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the version property value. The version of the operating system platform.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @param value Value to set for the vmMetadata property.
     */
    public void setVmMetadata(@jakarta.annotation.Nullable final VmMetadata value) {
        this.backingStore.set("vmMetadata", value);
    }
}
