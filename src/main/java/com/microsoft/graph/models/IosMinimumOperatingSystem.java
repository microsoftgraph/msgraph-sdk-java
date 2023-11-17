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
 * Contains properties of the minimum operating system required for an iOS mobile app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosMinimumOperatingSystem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new IosMinimumOperatingSystem and sets the default values.
     */
    public IosMinimumOperatingSystem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosMinimumOperatingSystem
     */
    @jakarta.annotation.Nonnull
    public static IosMinimumOperatingSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMinimumOperatingSystem();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v12_0", (n) -> { this.setV120(n.getBooleanValue()); });
        deserializerMap.put("v13_0", (n) -> { this.setV130(n.getBooleanValue()); });
        deserializerMap.put("v14_0", (n) -> { this.setV140(n.getBooleanValue()); });
        deserializerMap.put("v15_0", (n) -> { this.setV150(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v9_0", (n) -> { this.setV90(n.getBooleanValue()); });
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
     * Gets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV100() {
        return this.backingStore.get("v100");
    }
    /**
     * Gets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV110() {
        return this.backingStore.get("v110");
    }
    /**
     * Gets the v12_0 property value. When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV120() {
        return this.backingStore.get("v120");
    }
    /**
     * Gets the v13_0 property value. When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV130() {
        return this.backingStore.get("v130");
    }
    /**
     * Gets the v14_0 property value. When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV140() {
        return this.backingStore.get("v140");
    }
    /**
     * Gets the v15_0 property value. When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV150() {
        return this.backingStore.get("v150");
    }
    /**
     * Gets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV80() {
        return this.backingStore.get("v80");
    }
    /**
     * Gets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV90() {
        return this.backingStore.get("v90");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV100());
        writer.writeBooleanValue("v11_0", this.getV110());
        writer.writeBooleanValue("v12_0", this.getV120());
        writer.writeBooleanValue("v13_0", this.getV130());
        writer.writeBooleanValue("v14_0", this.getV140());
        writer.writeBooleanValue("v15_0", this.getV150());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v9_0", this.getV90());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v10_0 property.
     */
    public void setV100(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v100", value);
    }
    /**
     * Sets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v11_0 property.
     */
    public void setV110(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v110", value);
    }
    /**
     * Sets the v12_0 property value. When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v12_0 property.
     */
    public void setV120(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v120", value);
    }
    /**
     * Sets the v13_0 property value. When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v13_0 property.
     */
    public void setV130(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v130", value);
    }
    /**
     * Sets the v14_0 property value. When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v14_0 property.
     */
    public void setV140(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v140", value);
    }
    /**
     * Sets the v15_0 property value. When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v15_0 property.
     */
    public void setV150(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v150", value);
    }
    /**
     * Sets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v8_0 property.
     */
    public void setV80(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v80", value);
    }
    /**
     * Sets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v9_0 property.
     */
    public void setV90(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v90", value);
    }
}
