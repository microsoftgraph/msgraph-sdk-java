package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device compliance setting State for a given device.
 */
public class DeviceComplianceSettingState extends Entity implements Parsable {
    /**
     * The DateTime when device compliance grace period expires
     */
    private OffsetDateTime complianceGracePeriodExpirationDateTime;
    /**
     * The Device Id that is being reported
     */
    private String deviceId;
    /**
     * The device model that is being reported
     */
    private String deviceModel;
    /**
     * The Device Name that is being reported
     */
    private String deviceName;
    /**
     * The setting class name and property name.
     */
    private String setting;
    /**
     * The Setting Name that is being reported
     */
    private String settingName;
    /**
     * The state property
     */
    private ComplianceStatus state;
    /**
     * The User email address that is being reported
     */
    private String userEmail;
    /**
     * The user Id that is being reported
     */
    private String userId;
    /**
     * The User Name that is being reported
     */
    private String userName;
    /**
     * The User PrincipalName that is being reported
     */
    private String userPrincipalName;
    /**
     * Instantiates a new deviceComplianceSettingState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceSettingState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceSettingState
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceSettingState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceSettingState();
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the deviceId property value. The Device Id that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceModel property value. The device model that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * Gets the deviceName property value. The Device Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("setting", (n) -> { this.setSetting(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the setting property value. The setting class name and property name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this.setting;
    }
    /**
     * Gets the settingName property value. The Setting Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Gets the state property value. The state property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this.state;
    }
    /**
     * Gets the userEmail property value. The User email address that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Gets the userId property value. The user Id that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. The User Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. The User PrincipalName that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        writer.writeOffsetDateTimeValue("complianceGracePeriodExpirationDateTime", this.getComplianceGracePeriodExpirationDateTime());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("setting", this.getSetting());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the deviceId property value. The Device Id that is being reported
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceModel property value. The device model that is being reported
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the deviceName property value. The Device Name that is being reported
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the setting property value. The setting class name and property name.
     * @param value Value to set for the setting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetting(@javax.annotation.Nullable final String value) {
        this.setting = value;
    }
    /**
     * Sets the settingName property value. The Setting Name that is being reported
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this.settingName = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this.state = value;
    }
    /**
     * Sets the userEmail property value. The User email address that is being reported
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the userId property value. The user Id that is being reported
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. The User Name that is being reported
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The User PrincipalName that is being reported
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
