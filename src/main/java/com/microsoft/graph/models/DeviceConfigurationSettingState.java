package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration Setting State for a given device.
 */
public class DeviceConfigurationSettingState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Current value of setting on device
     */
    private String currentValue;
    /**
     * Error code for the setting
     */
    private Long errorCode;
    /**
     * Error description
     */
    private String errorDescription;
    /**
     * Name of setting instance that is being reported.
     */
    private String instanceDisplayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The setting that is being reported
     */
    private String setting;
    /**
     * Localized/user friendly setting name that is being reported
     */
    private String settingName;
    /**
     * Contributing policies
     */
    private java.util.List<SettingSource> sources;
    /**
     * The state property
     */
    private ComplianceStatus state;
    /**
     * UserEmail
     */
    private String userEmail;
    /**
     * UserId
     */
    private String userId;
    /**
     * UserName
     */
    private String userName;
    /**
     * UserPrincipalName.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new deviceConfigurationSettingState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationSettingState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationSettingState
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationSettingState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationSettingState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the currentValue property value. Current value of setting on device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentValue() {
        return this.currentValue;
    }
    /**
     * Gets the errorCode property value. Error code for the setting
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the errorDescription property value. Error description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this.errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("currentValue", (n) -> { this.setCurrentValue(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getLongValue()); });
        deserializerMap.put("errorDescription", (n) -> { this.setErrorDescription(n.getStringValue()); });
        deserializerMap.put("instanceDisplayName", (n) -> { this.setInstanceDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("setting", (n) -> { this.setSetting(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(SettingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instanceDisplayName property value. Name of setting instance that is being reported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceDisplayName() {
        return this.instanceDisplayName;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the setting property value. The setting that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this.setting;
    }
    /**
     * Gets the settingName property value. Localized/user friendly setting name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Gets the sources property value. Contributing policies
     * @return a settingSource
     */
    @javax.annotation.Nullable
    public java.util.List<SettingSource> getSources() {
        return this.sources;
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
     * Gets the userEmail property value. UserEmail
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Gets the userId property value. UserId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. UserName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
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
        writer.writeStringValue("currentValue", this.getCurrentValue());
        writer.writeLongValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorDescription", this.getErrorDescription());
        writer.writeStringValue("instanceDisplayName", this.getInstanceDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("setting", this.getSetting());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the currentValue property value. Current value of setting on device
     * @param value Value to set for the currentValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentValue(@javax.annotation.Nullable final String value) {
        this.currentValue = value;
    }
    /**
     * Sets the errorCode property value. Error code for the setting
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Long value) {
        this.errorCode = value;
    }
    /**
     * Sets the errorDescription property value. Error description
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this.errorDescription = value;
    }
    /**
     * Sets the instanceDisplayName property value. Name of setting instance that is being reported.
     * @param value Value to set for the instanceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceDisplayName(@javax.annotation.Nullable final String value) {
        this.instanceDisplayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the setting property value. The setting that is being reported
     * @param value Value to set for the setting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetting(@javax.annotation.Nullable final String value) {
        this.setting = value;
    }
    /**
     * Sets the settingName property value. Localized/user friendly setting name that is being reported
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this.settingName = value;
    }
    /**
     * Sets the sources property value. Contributing policies
     * @param value Value to set for the sources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSources(@javax.annotation.Nullable final java.util.List<SettingSource> value) {
        this.sources = value;
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
     * Sets the userEmail property value. UserEmail
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this.userEmail = value;
    }
    /**
     * Sets the userId property value. UserId
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. UserName
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
