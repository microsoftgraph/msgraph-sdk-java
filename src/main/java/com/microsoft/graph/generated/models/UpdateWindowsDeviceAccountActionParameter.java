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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateWindowsDeviceAccountActionParameter implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdateWindowsDeviceAccountActionParameter and sets the default values.
     */
    public UpdateWindowsDeviceAccountActionParameter() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateWindowsDeviceAccountActionParameter
     */
    @jakarta.annotation.Nonnull
    public static UpdateWindowsDeviceAccountActionParameter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindowsDeviceAccountActionParameter();
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
     * Gets the calendarSyncEnabled property value. Not yet documented
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCalendarSyncEnabled() {
        return this.backingStore.get("calendarSyncEnabled");
    }
    /**
     * Gets the deviceAccount property value. Not yet documented
     * @return a WindowsDeviceAccount
     */
    @jakarta.annotation.Nullable
    public WindowsDeviceAccount getDeviceAccount() {
        return this.backingStore.get("deviceAccount");
    }
    /**
     * Gets the deviceAccountEmail property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceAccountEmail() {
        return this.backingStore.get("deviceAccountEmail");
    }
    /**
     * Gets the exchangeServer property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExchangeServer() {
        return this.backingStore.get("exchangeServer");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("calendarSyncEnabled", (n) -> { this.setCalendarSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceAccount", (n) -> { this.setDeviceAccount(n.getObjectValue(WindowsDeviceAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceAccountEmail", (n) -> { this.setDeviceAccountEmail(n.getStringValue()); });
        deserializerMap.put("exchangeServer", (n) -> { this.setExchangeServer(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordRotationEnabled", (n) -> { this.setPasswordRotationEnabled(n.getBooleanValue()); });
        deserializerMap.put("sessionInitiationProtocalAddress", (n) -> { this.setSessionInitiationProtocalAddress(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the passwordRotationEnabled property value. Not yet documented
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRotationEnabled() {
        return this.backingStore.get("passwordRotationEnabled");
    }
    /**
     * Gets the sessionInitiationProtocalAddress property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSessionInitiationProtocalAddress() {
        return this.backingStore.get("sessionInitiationProtocalAddress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("calendarSyncEnabled", this.getCalendarSyncEnabled());
        writer.writeObjectValue("deviceAccount", this.getDeviceAccount());
        writer.writeStringValue("deviceAccountEmail", this.getDeviceAccountEmail());
        writer.writeStringValue("exchangeServer", this.getExchangeServer());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("passwordRotationEnabled", this.getPasswordRotationEnabled());
        writer.writeStringValue("sessionInitiationProtocalAddress", this.getSessionInitiationProtocalAddress());
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
     * Sets the calendarSyncEnabled property value. Not yet documented
     * @param value Value to set for the calendarSyncEnabled property.
     */
    public void setCalendarSyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("calendarSyncEnabled", value);
    }
    /**
     * Sets the deviceAccount property value. Not yet documented
     * @param value Value to set for the deviceAccount property.
     */
    public void setDeviceAccount(@jakarta.annotation.Nullable final WindowsDeviceAccount value) {
        this.backingStore.set("deviceAccount", value);
    }
    /**
     * Sets the deviceAccountEmail property value. Not yet documented
     * @param value Value to set for the deviceAccountEmail property.
     */
    public void setDeviceAccountEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceAccountEmail", value);
    }
    /**
     * Sets the exchangeServer property value. Not yet documented
     * @param value Value to set for the exchangeServer property.
     */
    public void setExchangeServer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("exchangeServer", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the passwordRotationEnabled property value. Not yet documented
     * @param value Value to set for the passwordRotationEnabled property.
     */
    public void setPasswordRotationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRotationEnabled", value);
    }
    /**
     * Sets the sessionInitiationProtocalAddress property value. Not yet documented
     * @param value Value to set for the sessionInitiationProtocalAddress property.
     */
    public void setSessionInitiationProtocalAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionInitiationProtocalAddress", value);
    }
}
