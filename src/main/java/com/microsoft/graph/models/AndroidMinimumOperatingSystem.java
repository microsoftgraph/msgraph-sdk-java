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
 * Contains properties for the minimum operating system required for an Android mobile app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidMinimumOperatingSystem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new AndroidMinimumOperatingSystem and sets the default values.
     */
    public AndroidMinimumOperatingSystem() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidMinimumOperatingSystem
     */
    @jakarta.annotation.Nonnull
    public static AndroidMinimumOperatingSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidMinimumOperatingSystem();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v4_0", (n) -> { this.setV40(n.getBooleanValue()); });
        deserializerMap.put("v4_0_3", (n) -> { this.setV403(n.getBooleanValue()); });
        deserializerMap.put("v4_1", (n) -> { this.setV41(n.getBooleanValue()); });
        deserializerMap.put("v4_2", (n) -> { this.setV42(n.getBooleanValue()); });
        deserializerMap.put("v4_3", (n) -> { this.setV43(n.getBooleanValue()); });
        deserializerMap.put("v4_4", (n) -> { this.setV44(n.getBooleanValue()); });
        deserializerMap.put("v5_0", (n) -> { this.setV50(n.getBooleanValue()); });
        deserializerMap.put("v5_1", (n) -> { this.setV51(n.getBooleanValue()); });
        deserializerMap.put("v6_0", (n) -> { this.setV60(n.getBooleanValue()); });
        deserializerMap.put("v7_0", (n) -> { this.setV70(n.getBooleanValue()); });
        deserializerMap.put("v7_1", (n) -> { this.setV71(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v8_1", (n) -> { this.setV81(n.getBooleanValue()); });
        deserializerMap.put("v9_0", (n) -> { this.setV90(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV100() {
        return this.BackingStore.get("v100");
    }
    /**
     * Gets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV110() {
        return this.BackingStore.get("v110");
    }
    /**
     * Gets the v4_0 property value. When TRUE, only Version 4.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV40() {
        return this.BackingStore.get("v40");
    }
    /**
     * Gets the v4_0_3 property value. When TRUE, only Version 4.0.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV403() {
        return this.BackingStore.get("v403");
    }
    /**
     * Gets the v4_1 property value. When TRUE, only Version 4.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV41() {
        return this.BackingStore.get("v41");
    }
    /**
     * Gets the v4_2 property value. When TRUE, only Version 4.2 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV42() {
        return this.BackingStore.get("v42");
    }
    /**
     * Gets the v4_3 property value. When TRUE, only Version 4.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV43() {
        return this.BackingStore.get("v43");
    }
    /**
     * Gets the v4_4 property value. When TRUE, only Version 4.4 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV44() {
        return this.BackingStore.get("v44");
    }
    /**
     * Gets the v5_0 property value. When TRUE, only Version 5.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV50() {
        return this.BackingStore.get("v50");
    }
    /**
     * Gets the v5_1 property value. When TRUE, only Version 5.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV51() {
        return this.BackingStore.get("v51");
    }
    /**
     * Gets the v6_0 property value. When TRUE, only Version 6.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV60() {
        return this.BackingStore.get("v60");
    }
    /**
     * Gets the v7_0 property value. When TRUE, only Version 7.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV70() {
        return this.BackingStore.get("v70");
    }
    /**
     * Gets the v7_1 property value. When TRUE, only Version 7.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV71() {
        return this.BackingStore.get("v71");
    }
    /**
     * Gets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV80() {
        return this.BackingStore.get("v80");
    }
    /**
     * Gets the v8_1 property value. When TRUE, only Version 8.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV81() {
        return this.BackingStore.get("v81");
    }
    /**
     * Gets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV90() {
        return this.BackingStore.get("v90");
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
        writer.writeBooleanValue("v4_0", this.getV40());
        writer.writeBooleanValue("v4_0_3", this.getV403());
        writer.writeBooleanValue("v4_1", this.getV41());
        writer.writeBooleanValue("v4_2", this.getV42());
        writer.writeBooleanValue("v4_3", this.getV43());
        writer.writeBooleanValue("v4_4", this.getV44());
        writer.writeBooleanValue("v5_0", this.getV50());
        writer.writeBooleanValue("v5_1", this.getV51());
        writer.writeBooleanValue("v6_0", this.getV60());
        writer.writeBooleanValue("v7_0", this.getV70());
        writer.writeBooleanValue("v7_1", this.getV71());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v8_1", this.getV81());
        writer.writeBooleanValue("v9_0", this.getV90());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the v10_0 property value. When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v10_0 property.
     */
    public void setV100(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v100", value);
    }
    /**
     * Sets the v11_0 property value. When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v11_0 property.
     */
    public void setV110(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v110", value);
    }
    /**
     * Sets the v4_0 property value. When TRUE, only Version 4.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_0 property.
     */
    public void setV40(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v40", value);
    }
    /**
     * Sets the v4_0_3 property value. When TRUE, only Version 4.0.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_0_3 property.
     */
    public void setV403(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v403", value);
    }
    /**
     * Sets the v4_1 property value. When TRUE, only Version 4.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_1 property.
     */
    public void setV41(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v41", value);
    }
    /**
     * Sets the v4_2 property value. When TRUE, only Version 4.2 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_2 property.
     */
    public void setV42(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v42", value);
    }
    /**
     * Sets the v4_3 property value. When TRUE, only Version 4.3 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_3 property.
     */
    public void setV43(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v43", value);
    }
    /**
     * Sets the v4_4 property value. When TRUE, only Version 4.4 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v4_4 property.
     */
    public void setV44(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v44", value);
    }
    /**
     * Sets the v5_0 property value. When TRUE, only Version 5.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v5_0 property.
     */
    public void setV50(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v50", value);
    }
    /**
     * Sets the v5_1 property value. When TRUE, only Version 5.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v5_1 property.
     */
    public void setV51(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v51", value);
    }
    /**
     * Sets the v6_0 property value. When TRUE, only Version 6.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v6_0 property.
     */
    public void setV60(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v60", value);
    }
    /**
     * Sets the v7_0 property value. When TRUE, only Version 7.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v7_0 property.
     */
    public void setV70(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v70", value);
    }
    /**
     * Sets the v7_1 property value. When TRUE, only Version 7.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v7_1 property.
     */
    public void setV71(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v71", value);
    }
    /**
     * Sets the v8_0 property value. When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v8_0 property.
     */
    public void setV80(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v80", value);
    }
    /**
     * Sets the v8_1 property value. When TRUE, only Version 8.1 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v8_1 property.
     */
    public void setV81(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v81", value);
    }
    /**
     * Sets the v9_0 property value. When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system boolean values will be TRUE.
     * @param value Value to set for the v9_0 property.
     */
    public void setV90(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("v90", value);
    }
}
