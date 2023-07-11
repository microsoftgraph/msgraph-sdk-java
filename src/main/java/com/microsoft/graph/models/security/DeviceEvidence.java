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
     * The ipInterfaces property
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
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceEvidence
     */
    @javax.annotation.Nonnull
    public static DeviceEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEvidence();
    }
    /**
     * Gets the azureAdDeviceId property value. A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.azureAdDeviceId;
    }
    /**
     * Gets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @return a defenderAvStatus
     */
    @javax.annotation.Nullable
    public DefenderAvStatus getDefenderAvStatus() {
        return this.defenderAvStatus;
    }
    /**
     * Gets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDnsName() {
        return this.deviceDnsName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the healthStatus property value. The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @return a deviceHealthStatus
     */
    @javax.annotation.Nullable
    public DeviceHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the ipInterfaces property value. The ipInterfaces property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIpInterfaces() {
        return this.ipInterfaces;
    }
    /**
     * Gets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @return a loggedOnUser
     */
    @javax.annotation.Nullable
    public java.util.List<LoggedOnUser> getLoggedOnUsers() {
        return this.loggedOnUsers;
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this.mdeDeviceId;
    }
    /**
     * Gets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @return a onboardingStatus
     */
    @javax.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the osBuild property value. The build version for the operating system the device is running.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOsBuild() {
        return this.osBuild;
    }
    /**
     * Gets the osPlatform property value. The operating system platform the device is running.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsPlatform() {
        return this.osPlatform;
    }
    /**
     * Gets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRbacGroupId() {
        return this.rbacGroupId;
    }
    /**
     * Gets the rbacGroupName property value. The name of the RBAC device group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRbacGroupName() {
        return this.rbacGroupName;
    }
    /**
     * Gets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @return a deviceRiskScore
     */
    @javax.annotation.Nullable
    public DeviceRiskScore getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the version property value. The version of the operating system platform.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Gets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @return a vmMetadata
     */
    @javax.annotation.Nullable
    public VmMetadata getVmMetadata() {
        return this.vmMetadata;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this.azureAdDeviceId = value;
    }
    /**
     * Sets the defenderAvStatus property value. State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     * @param value Value to set for the defenderAvStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAvStatus(@javax.annotation.Nullable final DefenderAvStatus value) {
        this.defenderAvStatus = value;
    }
    /**
     * Sets the deviceDnsName property value. The fully qualified domain name (FQDN) for the device.
     * @param value Value to set for the deviceDnsName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDnsName(@javax.annotation.Nullable final String value) {
        this.deviceDnsName = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The date and time when the device was first seen.
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the healthStatus property value. The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final DeviceHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the ipInterfaces property value. The ipInterfaces property
     * @param value Value to set for the ipInterfaces property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpInterfaces(@javax.annotation.Nullable final java.util.List<String> value) {
        this.ipInterfaces = value;
    }
    /**
     * Sets the loggedOnUsers property value. Users that were logged on the machine during the time of the alert.
     * @param value Value to set for the loggedOnUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoggedOnUsers(@javax.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this.loggedOnUsers = value;
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this.mdeDeviceId = value;
    }
    /**
     * Sets the onboardingStatus property value. The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingStatus(@javax.annotation.Nullable final OnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the osBuild property value. The build version for the operating system the device is running.
     * @param value Value to set for the osBuild property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsBuild(@javax.annotation.Nullable final Long value) {
        this.osBuild = value;
    }
    /**
     * Sets the osPlatform property value. The operating system platform the device is running.
     * @param value Value to set for the osPlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsPlatform(@javax.annotation.Nullable final String value) {
        this.osPlatform = value;
    }
    /**
     * Sets the rbacGroupId property value. The ID of the role-based access control (RBAC) device group.
     * @param value Value to set for the rbacGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRbacGroupId(@javax.annotation.Nullable final Integer value) {
        this.rbacGroupId = value;
    }
    /**
     * Sets the rbacGroupName property value. The name of the RBAC device group.
     * @param value Value to set for the rbacGroupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRbacGroupName(@javax.annotation.Nullable final String value) {
        this.rbacGroupName = value;
    }
    /**
     * Sets the riskScore property value. Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final DeviceRiskScore value) {
        this.riskScore = value;
    }
    /**
     * Sets the version property value. The version of the operating system platform.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the vmMetadata property value. Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     * @param value Value to set for the vmMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVmMetadata(@javax.annotation.Nullable final VmMetadata value) {
        this.vmMetadata = value;
    }
}
