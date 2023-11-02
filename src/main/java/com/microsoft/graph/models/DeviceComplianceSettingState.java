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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceSettingState extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceComplianceSettingState and sets the default values.
     */
    public DeviceComplianceSettingState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceSettingState
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceSettingState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceSettingState();
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.getBackingStore().get("complianceGracePeriodExpirationDateTime");
    }
    /**
     * Gets the deviceId property value. The Device Id that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.getBackingStore().get("deviceId");
    }
    /**
     * Gets the deviceModel property value. The device model that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.getBackingStore().get("deviceModel");
    }
    /**
     * Gets the deviceName property value. The Device Name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.getBackingStore().get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSetting() {
        return this.getBackingStore().get("setting");
    }
    /**
     * Gets the settingName property value. The Setting Name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.getBackingStore().get("settingName");
    }
    /**
     * Gets the state property value. The state property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getState() {
        return this.getBackingStore().get("state");
    }
    /**
     * Gets the userEmail property value. The User email address that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.getBackingStore().get("userEmail");
    }
    /**
     * Gets the userId property value. The user Id that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.getBackingStore().get("userId");
    }
    /**
     * Gets the userName property value. The User Name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.getBackingStore().get("userName");
    }
    /**
     * Gets the userPrincipalName property value. The User PrincipalName that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.getBackingStore().get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setComplianceGracePeriodExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("complianceGracePeriodExpirationDateTime", value);
    }
    /**
     * Sets the deviceId property value. The Device Id that is being reported
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("deviceId", value);
    }
    /**
     * Sets the deviceModel property value. The device model that is being reported
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("deviceModel", value);
    }
    /**
     * Sets the deviceName property value. The Device Name that is being reported
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("deviceName", value);
    }
    /**
     * Sets the setting property value. The setting class name and property name.
     * @param value Value to set for the setting property.
     */
    public void setSetting(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("setting", value);
    }
    /**
     * Sets the settingName property value. The Setting Name that is being reported
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("settingName", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.getBackingStore().set("state", value);
    }
    /**
     * Sets the userEmail property value. The User email address that is being reported
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("userEmail", value);
    }
    /**
     * Sets the userId property value. The user Id that is being reported
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("userId", value);
    }
    /**
     * Sets the userName property value. The User Name that is being reported
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("userName", value);
    }
    /**
     * Sets the userPrincipalName property value. The User PrincipalName that is being reported
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("userPrincipalName", value);
    }
}
