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
     * Instantiates a new {@link DeviceEvidence} and sets the default values.
     */
    public DeviceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.deviceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceEvidence}
     */
    @jakarta.annotation.Nonnull
    public static DeviceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEvidence();
    }
    /**
     * Gets the azureAdDeviceId property value. A unique identifier assigned to a device by Microsoft Entra ID when device is Microsoft Entra joined.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.backingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @return a {@link DefenderAvStatus}
     */
    @jakarta.annotation.Nullable
    public DefenderAvStatus getDefenderAvStatus() {
        return this.backingStore.get("defenderAvStatus");
    }
    /**
     * Gets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceDnsName() {
        return this.backingStore.get("deviceDnsName");
    }
    /**
     * Gets the dnsDomain property value. The DNS domain that this computer belongs to. A sequence of labels separated by dots.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDnsDomain() {
        return this.backingStore.get("dnsDomain");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("defenderAvStatus", (n) -> { this.setDefenderAvStatus(n.getEnumValue(DefenderAvStatus::forValue)); });
        deserializerMap.put("deviceDnsName", (n) -> { this.setDeviceDnsName(n.getStringValue()); });
        deserializerMap.put("dnsDomain", (n) -> { this.setDnsDomain(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(DeviceHealthStatus::forValue)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("ipInterfaces", (n) -> { this.setIpInterfaces(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("lastExternalIpAddress", (n) -> { this.setLastExternalIpAddress(n.getStringValue()); });
        deserializerMap.put("lastIpAddress", (n) -> { this.setLastIpAddress(n.getStringValue()); });
        deserializerMap.put("loggedOnUsers", (n) -> { this.setLoggedOnUsers(n.getCollectionOfObjectValues(LoggedOnUser::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("ntDomain", (n) -> { this.setNtDomain(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(OnboardingStatus::forValue)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getLongValue()); });
        deserializerMap.put("osPlatform", (n) -> { this.setOsPlatform(n.getStringValue()); });
        deserializerMap.put("rbacGroupId", (n) -> { this.setRbacGroupId(n.getIntegerValue()); });
        deserializerMap.put("rbacGroupName", (n) -> { this.setRbacGroupName(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getEnumValue(DeviceRiskScore::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("vmMetadata", (n) -> { this.setVmMetadata(n.getObjectValue(VmMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The date and time when the device was first seen.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the healthStatus property value. The health state of the device. The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @return a {@link DeviceHealthStatus}
     */
    @jakarta.annotation.Nullable
    public DeviceHealthStatus getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the hostName property value. The hostname without the domain suffix.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.backingStore.get("hostName");
    }
    /**
     * Gets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpInterfaces() {
        return this.backingStore.get("ipInterfaces");
    }
    /**
     * Gets the lastExternalIpAddress property value. The lastExternalIpAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastExternalIpAddress() {
        return this.backingStore.get("lastExternalIpAddress");
    }
    /**
     * Gets the lastIpAddress property value. The lastIpAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastIpAddress() {
        return this.backingStore.get("lastIpAddress");
    }
    /**
     * Gets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @return a {@link java.util.List<LoggedOnUser>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoggedOnUser> getLoggedOnUsers() {
        return this.backingStore.get("loggedOnUsers");
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.backingStore.get("mdeDeviceId");
    }
    /**
     * Gets the ntDomain property value. A logical grouping of computers within a Microsoft Windows network.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNtDomain() {
        return this.backingStore.get("ntDomain");
    }
    /**
     * Gets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint. The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @return a {@link OnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.backingStore.get("onboardingStatus");
    }
    /**
     * Gets the osBuild property value. The build version for the operating system the device is running.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOsBuild() {
        return this.backingStore.get("osBuild");
    }
    /**
     * Gets the osPlatform property value. The operating system platform the device is running.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsPlatform() {
        return this.backingStore.get("osPlatform");
    }
    /**
     * Gets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRbacGroupId() {
        return this.backingStore.get("rbacGroupId");
    }
    /**
     * Gets the rbacGroupName property value. The name of the RBAC device group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRbacGroupName() {
        return this.backingStore.get("rbacGroupName");
    }
    /**
     * Gets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @return a {@link DeviceRiskScore}
     */
    @jakarta.annotation.Nullable
    public DeviceRiskScore getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the version property value. The version of the operating system platform.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @return a {@link VmMetadata}
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
        writer.writeStringValue("dnsDomain", this.getDnsDomain());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeCollectionOfPrimitiveValues("ipInterfaces", this.getIpInterfaces());
        writer.writeStringValue("lastExternalIpAddress", this.getLastExternalIpAddress());
        writer.writeStringValue("lastIpAddress", this.getLastIpAddress());
        writer.writeCollectionOfObjectValues("loggedOnUsers", this.getLoggedOnUsers());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
        writer.writeStringValue("ntDomain", this.getNtDomain());
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
    public void setDefenderAvStatus(@jakarta.annotation.Nullable final DefenderAvStatus value) {
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
     * Sets the dnsDomain property value. The DNS domain that this computer belongs to. A sequence of labels separated by dots.
     * @param value Value to set for the dnsDomain property.
     */
    public void setDnsDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dnsDomain", value);
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
    public void setHealthStatus(@jakarta.annotation.Nullable final DeviceHealthStatus value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the hostName property value. The hostname without the domain suffix.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @param value Value to set for the ipInterfaces property.
     */
    public void setIpInterfaces(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ipInterfaces", value);
    }
    /**
     * Sets the lastExternalIpAddress property value. The lastExternalIpAddress property
     * @param value Value to set for the lastExternalIpAddress property.
     */
    public void setLastExternalIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastExternalIpAddress", value);
    }
    /**
     * Sets the lastIpAddress property value. The lastIpAddress property
     * @param value Value to set for the lastIpAddress property.
     */
    public void setLastIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastIpAddress", value);
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
     * Sets the ntDomain property value. A logical grouping of computers within a Microsoft Windows network.
     * @param value Value to set for the ntDomain property.
     */
    public void setNtDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ntDomain", value);
    }
    /**
     * Sets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint. The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final OnboardingStatus value) {
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
    public void setRiskScore(@jakarta.annotation.Nullable final DeviceRiskScore value) {
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
