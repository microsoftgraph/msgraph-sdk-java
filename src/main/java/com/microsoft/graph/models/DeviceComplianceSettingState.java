package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device compliance setting State for a given device. */
public class DeviceComplianceSettingState extends Entity implements Parsable {
    /** The DateTime when device compliance grace period expires */
    private OffsetDateTime _complianceGracePeriodExpirationDateTime;
    /** The Device Id that is being reported */
    private String _deviceId;
    /** The device model that is being reported */
    private String _deviceModel;
    /** The Device Name that is being reported */
    private String _deviceName;
    /** The setting class name and property name. */
    private String _setting;
    /** The Setting Name that is being reported */
    private String _settingName;
    /** The state property */
    private ComplianceStatus _state;
    /** The User email address that is being reported */
    private String _userEmail;
    /** The user Id that is being reported */
    private String _userId;
    /** The User Name that is being reported */
    private String _userName;
    /** The User PrincipalName that is being reported */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceComplianceSettingState and sets the default values.
     * @return a void
     */
    public DeviceComplianceSettingState() {
        super();
        this.setOdataType("#microsoft.graph.deviceComplianceSettingState");
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
        return this._complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the deviceId property value. The Device Id that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceModel property value. The device model that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * Gets the deviceName property value. The Device Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceSettingState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("complianceGracePeriodExpirationDateTime", (n) -> { currentObject.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("setting", (n) -> { currentObject.setSetting(n.getStringValue()); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ComplianceStatus.class)); });
            this.put("userEmail", (n) -> { currentObject.setUserEmail(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the setting property value. The setting class name and property name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this._setting;
    }
    /**
     * Gets the settingName property value. The Setting Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the state property value. The state property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this._state;
    }
    /**
     * Gets the userEmail property value. The User email address that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this._userEmail;
    }
    /**
     * Gets the userId property value. The user Id that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userName property value. The User Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. The User PrincipalName that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the deviceId property value. The Device Id that is being reported
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceModel property value. The device model that is being reported
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
    }
    /**
     * Sets the deviceName property value. The Device Name that is being reported
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the setting property value. The setting class name and property name.
     * @param value Value to set for the setting property.
     * @return a void
     */
    public void setSetting(@javax.annotation.Nullable final String value) {
        this._setting = value;
    }
    /**
     * Sets the settingName property value. The Setting Name that is being reported
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._state = value;
    }
    /**
     * Sets the userEmail property value. The User email address that is being reported
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this._userEmail = value;
    }
    /**
     * Sets the userId property value. The user Id that is being reported
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. The User Name that is being reported
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. The User PrincipalName that is being reported
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
