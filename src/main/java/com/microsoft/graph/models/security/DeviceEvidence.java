package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEvidence extends AlertEvidence implements Parsable {
    /**
     * A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
     */
    private String azureAdDeviceId;
    /**
     * State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     */
    private DefenderAvStatus defenderAvStatus;
    /**
     * The fully qualified domain name (FQDN) for the device.
     */
    private String deviceDnsName;
    /**
     * The date and time when the device was first seen.
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     */
    private DeviceHealthStatus healthStatus;
    /**
     * Ip interfaces of the device during the time of the alert.
     */
    private java.util.List<String> ipInterfaces;
    /**
     * Users that were logged on the machine during the time of the alert.
     */
    private java.util.List<LoggedOnUser> loggedOnUsers;
    /**
     * A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     */
    private String mdeDeviceId;
    /**
     * The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     */
    private OnboardingStatus onboardingStatus;
    /**
     * The build version for the operating system the device is running.
     */
    private Long osBuild;
    /**
     * The operating system platform the device is running.
     */
    private String osPlatform;
    /**
     * The ID of the role-based access control (RBAC) device group.
     */
    private Integer rbacGroupId;
    /**
     * The name of the RBAC device group.
     */
    private String rbacGroupName;
    /**
     * Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     */
    private DeviceRiskScore riskScore;
    /**
     * The version of the operating system platform.
     */
    private String version;
    /**
     * Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     */
    private VmMetadata vmMetadata;
    /**
     * Instantiates a new deviceEvidence and sets the default values.
     */
    public DeviceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.deviceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceEvidence
     */
    @jakarta.annotation.Nonnull
    public static DeviceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEvidence();
    }
    /**
     * Gets the azureAdDeviceId property value. A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.azureAdDeviceId;
    }
    /**
     * Gets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @return a defenderAvStatus
     */
    @jakarta.annotation.Nullable
    public DefenderAvStatus getDefenderAvStatus() {
        return this.defenderAvStatus;
    }
    /**
     * Gets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceDnsName() {
        return this.deviceDnsName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("defenderAvStatus", (n) -> { this.setDefenderAvStatus(n.getEnumValue(DefenderAvStatus.class)); });
        deserializerMap.put("deviceDnsName", (n) -> { this.setDeviceDnsName(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(DeviceHealthStatus.class)); });
        deserializerMap.put("ipInterfaces", (n) -> { this.setIpInterfaces(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("loggedOnUsers", (n) -> { this.setLoggedOnUsers(n.getCollectionOfObjectValues(LoggedOnUser::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(OnboardingStatus.class)); });
        deserializerMap.put("osBuild", (n) -> { this.setOsBuild(n.getLongValue()); });
        deserializerMap.put("osPlatform", (n) -> { this.setOsPlatform(n.getStringValue()); });
        deserializerMap.put("rbacGroupId", (n) -> { this.setRbacGroupId(n.getIntegerValue()); });
        deserializerMap.put("rbacGroupName", (n) -> { this.setRbacGroupName(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getEnumValue(DeviceRiskScore.class)); });
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
        return this.firstSeenDateTime;
    }
    /**
     * Gets the healthStatus property value. The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @return a deviceHealthStatus
     */
    @jakarta.annotation.Nullable
    public DeviceHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpInterfaces() {
        return this.ipInterfaces;
    }
    /**
     * Gets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @return a loggedOnUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoggedOnUser> getLoggedOnUsers() {
        return this.loggedOnUsers;
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.mdeDeviceId;
    }
    /**
     * Gets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @return a onboardingStatus
     */
    @jakarta.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the osBuild property value. The build version for the operating system the device is running.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getOsBuild() {
        return this.osBuild;
    }
    /**
     * Gets the osPlatform property value. The operating system platform the device is running.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsPlatform() {
        return this.osPlatform;
    }
    /**
     * Gets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRbacGroupId() {
        return this.rbacGroupId;
    }
    /**
     * Gets the rbacGroupName property value. The name of the RBAC device group.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRbacGroupName() {
        return this.rbacGroupName;
    }
    /**
     * Gets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @return a deviceRiskScore
     */
    @jakarta.annotation.Nullable
    public DeviceRiskScore getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the version property value. The version of the operating system platform.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Gets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @return a vmMetadata
     */
    @jakarta.annotation.Nullable
    public VmMetadata getVmMetadata() {
        return this.vmMetadata;
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
     * Sets the azureAdDeviceId property value. A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.azureAdDeviceId = value;
    }
    /**
     * Sets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @param value Value to set for the defenderAvStatus property.
     */
    public void setDefenderAvStatus(@jakarta.annotation.Nullable final DefenderAvStatus value) {
        this.defenderAvStatus = value;
    }
    /**
     * Sets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @param value Value to set for the deviceDnsName property.
     */
    public void setDeviceDnsName(@jakarta.annotation.Nullable final String value) {
        this.deviceDnsName = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The date and time when the device was first seen.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the healthStatus property value. The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final DeviceHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the ipInterfaces property value. Ip interfaces of the device during the time of the alert.
     * @param value Value to set for the ipInterfaces property.
     */
    public void setIpInterfaces(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipInterfaces = value;
    }
    /**
     * Sets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @param value Value to set for the loggedOnUsers property.
     */
    public void setLoggedOnUsers(@jakarta.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this.loggedOnUsers = value;
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     */
    public void setMdeDeviceId(@jakarta.annotation.Nullable final String value) {
        this.mdeDeviceId = value;
    }
    /**
     * Sets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final OnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the osBuild property value. The build version for the operating system the device is running.
     * @param value Value to set for the osBuild property.
     */
    public void setOsBuild(@jakarta.annotation.Nullable final Long value) {
        this.osBuild = value;
    }
    /**
     * Sets the osPlatform property value. The operating system platform the device is running.
     * @param value Value to set for the osPlatform property.
     */
    public void setOsPlatform(@jakarta.annotation.Nullable final String value) {
        this.osPlatform = value;
    }
    /**
     * Sets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @param value Value to set for the rbacGroupId property.
     */
    public void setRbacGroupId(@jakarta.annotation.Nullable final Integer value) {
        this.rbacGroupId = value;
    }
    /**
     * Sets the rbacGroupName property value. The name of the RBAC device group.
     * @param value Value to set for the rbacGroupName property.
     */
    public void setRbacGroupName(@jakarta.annotation.Nullable final String value) {
        this.rbacGroupName = value;
    }
    /**
     * Sets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final DeviceRiskScore value) {
        this.riskScore = value;
    }
    /**
     * Sets the version property value. The version of the operating system platform.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @param value Value to set for the vmMetadata property.
     */
    public void setVmMetadata(@jakarta.annotation.Nullable final VmMetadata value) {
        this.vmMetadata = value;
    }
}
