package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEvidence extends AlertEvidence implements Parsable {
    /** The azureAdDeviceId property */
    private String _azureAdDeviceId;
    /** The defenderAvStatus property */
    private DefenderAvStatus _defenderAvStatus;
    /** The deviceDnsName property */
    private String _deviceDnsName;
    /** The firstSeenDateTime property */
    private OffsetDateTime _firstSeenDateTime;
    /** The healthStatus property */
    private DeviceHealthStatus _healthStatus;
    /** The loggedOnUsers property */
    private java.util.List<LoggedOnUser> _loggedOnUsers;
    /** The mdeDeviceId property */
    private String _mdeDeviceId;
    /** The onboardingStatus property */
    private OnboardingStatus _onboardingStatus;
    /** The osBuild property */
    private Long _osBuild;
    /** The osPlatform property */
    private String _osPlatform;
    /** The rbacGroupId property */
    private Integer _rbacGroupId;
    /** The rbacGroupName property */
    private String _rbacGroupName;
    /** The riskScore property */
    private DeviceRiskScore _riskScore;
    /** The version property */
    private String _version;
    /** The vmMetadata property */
    private VmMetadata _vmMetadata;
    /**
     * Instantiates a new DeviceEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEvidence
     */
    @javax.annotation.Nonnull
    public static DeviceEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEvidence();
    }
    /**
     * Gets the azureAdDeviceId property value. The azureAdDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this._azureAdDeviceId;
    }
    /**
     * Gets the defenderAvStatus property value. The defenderAvStatus property
     * @return a defenderAvStatus
     */
    @javax.annotation.Nullable
    public DefenderAvStatus getDefenderAvStatus() {
        return this._defenderAvStatus;
    }
    /**
     * Gets the deviceDnsName property value. The deviceDnsName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDnsName() {
        return this._deviceDnsName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("defenderAvStatus", (n) -> { this.setDefenderAvStatus(n.getEnumValue(DefenderAvStatus.class)); });
        deserializerMap.put("deviceDnsName", (n) -> { this.setDeviceDnsName(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(DeviceHealthStatus.class)); });
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
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this._firstSeenDateTime;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a deviceHealthStatus
     */
    @javax.annotation.Nullable
    public DeviceHealthStatus getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the loggedOnUsers property value. The loggedOnUsers property
     * @return a loggedOnUser
     */
    @javax.annotation.Nullable
    public java.util.List<LoggedOnUser> getLoggedOnUsers() {
        return this._loggedOnUsers;
    }
    /**
     * Gets the mdeDeviceId property value. The mdeDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this._mdeDeviceId;
    }
    /**
     * Gets the onboardingStatus property value. The onboardingStatus property
     * @return a onboardingStatus
     */
    @javax.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this._onboardingStatus;
    }
    /**
     * Gets the osBuild property value. The osBuild property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOsBuild() {
        return this._osBuild;
    }
    /**
     * Gets the osPlatform property value. The osPlatform property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsPlatform() {
        return this._osPlatform;
    }
    /**
     * Gets the rbacGroupId property value. The rbacGroupId property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRbacGroupId() {
        return this._rbacGroupId;
    }
    /**
     * Gets the rbacGroupName property value. The rbacGroupName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRbacGroupName() {
        return this._rbacGroupName;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a deviceRiskScore
     */
    @javax.annotation.Nullable
    public DeviceRiskScore getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Gets the vmMetadata property value. The vmMetadata property
     * @return a vmMetadata
     */
    @javax.annotation.Nullable
    public VmMetadata getVmMetadata() {
        return this._vmMetadata;
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
     * Sets the azureAdDeviceId property value. The azureAdDeviceId property
     * @param value Value to set for the azureAdDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this._azureAdDeviceId = value;
    }
    /**
     * Sets the defenderAvStatus property value. The defenderAvStatus property
     * @param value Value to set for the defenderAvStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAvStatus(@javax.annotation.Nullable final DefenderAvStatus value) {
        this._defenderAvStatus = value;
    }
    /**
     * Sets the deviceDnsName property value. The deviceDnsName property
     * @param value Value to set for the deviceDnsName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDnsName(@javax.annotation.Nullable final String value) {
        this._deviceDnsName = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._firstSeenDateTime = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final DeviceHealthStatus value) {
        this._healthStatus = value;
    }
    /**
     * Sets the loggedOnUsers property value. The loggedOnUsers property
     * @param value Value to set for the loggedOnUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoggedOnUsers(@javax.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this._loggedOnUsers = value;
    }
    /**
     * Sets the mdeDeviceId property value. The mdeDeviceId property
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this._mdeDeviceId = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboardingStatus property
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingStatus(@javax.annotation.Nullable final OnboardingStatus value) {
        this._onboardingStatus = value;
    }
    /**
     * Sets the osBuild property value. The osBuild property
     * @param value Value to set for the osBuild property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsBuild(@javax.annotation.Nullable final Long value) {
        this._osBuild = value;
    }
    /**
     * Sets the osPlatform property value. The osPlatform property
     * @param value Value to set for the osPlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsPlatform(@javax.annotation.Nullable final String value) {
        this._osPlatform = value;
    }
    /**
     * Sets the rbacGroupId property value. The rbacGroupId property
     * @param value Value to set for the rbacGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRbacGroupId(@javax.annotation.Nullable final Integer value) {
        this._rbacGroupId = value;
    }
    /**
     * Sets the rbacGroupName property value. The rbacGroupName property
     * @param value Value to set for the rbacGroupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRbacGroupName(@javax.annotation.Nullable final String value) {
        this._rbacGroupName = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final DeviceRiskScore value) {
        this._riskScore = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
    /**
     * Sets the vmMetadata property value. The vmMetadata property
     * @param value Value to set for the vmMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVmMetadata(@javax.annotation.Nullable final VmMetadata value) {
        this._vmMetadata = value;
    }
}
