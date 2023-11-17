package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Compilance Policy Setting State for a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCompliancePolicySettingState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new DeviceCompliancePolicySettingState and sets the default values.
     */
    public DeviceCompliancePolicySettingState() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCompliancePolicySettingState
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicySettingState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingState();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the currentValue property value. Current value of setting on device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentValue() {
        return this.backingStore.get("currentValue");
    }
    /**
     * Gets the errorCode property value. Error code for the setting
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the errorDescription property value. Error description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorDescription() {
        return this.backingStore.get("errorDescription");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstanceDisplayName() {
        return this.backingStore.get("instanceDisplayName");
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
     * Gets the setting property value. The setting that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSetting() {
        return this.backingStore.get("setting");
    }
    /**
     * Gets the settingName property value. Localized/user friendly setting name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.backingStore.get("settingName");
    }
    /**
     * Gets the sources property value. Contributing policies
     * @return a java.util.List<SettingSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingSource> getSources() {
        return this.backingStore.get("sources");
    }
    /**
     * Gets the state property value. The state property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the userEmail property value. UserEmail
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.backingStore.get("userEmail");
    }
    /**
     * Gets the userId property value. UserId
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userName property value. UserName
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the currentValue property value. Current value of setting on device
     * @param value Value to set for the currentValue property.
     */
    public void setCurrentValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currentValue", value);
    }
    /**
     * Sets the errorCode property value. Error code for the setting
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the errorDescription property value. Error description
     * @param value Value to set for the errorDescription property.
     */
    public void setErrorDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorDescription", value);
    }
    /**
     * Sets the instanceDisplayName property value. Name of setting instance that is being reported.
     * @param value Value to set for the instanceDisplayName property.
     */
    public void setInstanceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instanceDisplayName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the setting property value. The setting that is being reported
     * @param value Value to set for the setting property.
     */
    public void setSetting(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("setting", value);
    }
    /**
     * Sets the settingName property value. Localized/user friendly setting name that is being reported
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingName", value);
    }
    /**
     * Sets the sources property value. Contributing policies
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<SettingSource> value) {
        this.backingStore.set("sources", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the userEmail property value. UserEmail
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userEmail", value);
    }
    /**
     * Sets the userId property value. UserId
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userName property value. UserName
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
