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
 * Contains properties for App configuration setting item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConfigurationSettingItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AppConfigurationSettingItem and sets the default values.
     */
    public AppConfigurationSettingItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppConfigurationSettingItem
     */
    @jakarta.annotation.Nonnull
    public static AppConfigurationSettingItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConfigurationSettingItem();
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
     * Gets the appConfigKey property value. app configuration key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppConfigKey() {
        return this.backingStore.get("appConfigKey");
    }
    /**
     * Gets the appConfigKeyType property value. App configuration key types.
     * @return a MdmAppConfigKeyType
     */
    @jakarta.annotation.Nullable
    public MdmAppConfigKeyType getAppConfigKeyType() {
        return this.backingStore.get("appConfigKeyType");
    }
    /**
     * Gets the appConfigKeyValue property value. app configuration key value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppConfigKeyValue() {
        return this.backingStore.get("appConfigKeyValue");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appConfigKey", (n) -> { this.setAppConfigKey(n.getStringValue()); });
        deserializerMap.put("appConfigKeyType", (n) -> { this.setAppConfigKeyType(n.getEnumValue(MdmAppConfigKeyType::forValue)); });
        deserializerMap.put("appConfigKeyValue", (n) -> { this.setAppConfigKeyValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appConfigKey", this.getAppConfigKey());
        writer.writeEnumValue("appConfigKeyType", this.getAppConfigKeyType());
        writer.writeStringValue("appConfigKeyValue", this.getAppConfigKeyValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appConfigKey property value. app configuration key.
     * @param value Value to set for the appConfigKey property.
     */
    public void setAppConfigKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appConfigKey", value);
    }
    /**
     * Sets the appConfigKeyType property value. App configuration key types.
     * @param value Value to set for the appConfigKeyType property.
     */
    public void setAppConfigKeyType(@jakarta.annotation.Nullable final MdmAppConfigKeyType value) {
        this.backingStore.set("appConfigKeyType", value);
    }
    /**
     * Sets the appConfigKeyValue property value. app configuration key value.
     * @param value Value to set for the appConfigKeyValue property.
     */
    public void setAppConfigKeyValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appConfigKeyValue", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
