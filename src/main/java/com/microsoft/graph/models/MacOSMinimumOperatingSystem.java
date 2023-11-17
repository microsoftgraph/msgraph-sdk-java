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
 * The minimum operating system required for a macOS app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSMinimumOperatingSystem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new MacOSMinimumOperatingSystem and sets the default values.
     */
    public MacOSMinimumOperatingSystem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSMinimumOperatingSystem
     */
    @jakarta.annotation.Nonnull
    public static MacOSMinimumOperatingSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSMinimumOperatingSystem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_10", (n) -> { this.setV1010(n.getBooleanValue()); });
        deserializerMap.put("v10_11", (n) -> { this.setV1011(n.getBooleanValue()); });
        deserializerMap.put("v10_12", (n) -> { this.setV1012(n.getBooleanValue()); });
        deserializerMap.put("v10_13", (n) -> { this.setV1013(n.getBooleanValue()); });
        deserializerMap.put("v10_14", (n) -> { this.setV1014(n.getBooleanValue()); });
        deserializerMap.put("v10_15", (n) -> { this.setV1015(n.getBooleanValue()); });
        deserializerMap.put("v10_7", (n) -> { this.setV107(n.getBooleanValue()); });
        deserializerMap.put("v10_8", (n) -> { this.setV108(n.getBooleanValue()); });
        deserializerMap.put("v10_9", (n) -> { this.setV109(n.getBooleanValue()); });
        deserializerMap.put("v11_0", (n) -> { this.setV110(n.getBooleanValue()); });
        deserializerMap.put("v12_0", (n) -> { this.setV120(n.getBooleanValue()); });
        deserializerMap.put("v13_0", (n) -> { this.setV130(n.getBooleanValue()); });
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
     * Gets the v10_10 property value. When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1010() {
        return this.backingStore.get("v1010");
    }
    /**
     * Gets the v10_11 property value. When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1011() {
        return this.backingStore.get("v1011");
    }
    /**
     * Gets the v10_12 property value. When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1012() {
        return this.backingStore.get("v1012");
    }
    /**
     * Gets the v10_13 property value. When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1013() {
        return this.backingStore.get("v1013");
    }
    /**
     * Gets the v10_14 property value. When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1014() {
        return this.backingStore.get("v1014");
    }
    /**
     * Gets the v10_15 property value. When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV1015() {
        return this.backingStore.get("v1015");
    }
    /**
     * Gets the v10_7 property value. When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV107() {
        return this.backingStore.get("v107");
    }
    /**
     * Gets the v10_8 property value. When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV108() {
        return this.backingStore.get("v108");
    }
    /**
     * Gets the v10_9 property value. When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV109() {
        return this.backingStore.get("v109");
    }
    /**
     * Gets the v11_0 property value. When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV110() {
        return this.backingStore.get("v110");
    }
    /**
     * Gets the v12_0 property value. When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV120() {
        return this.backingStore.get("v120");
    }
    /**
     * Gets the v13_0 property value. When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV130() {
        return this.backingStore.get("v130");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_10", this.getV1010());
        writer.writeBooleanValue("v10_11", this.getV1011());
        writer.writeBooleanValue("v10_12", this.getV1012());
        writer.writeBooleanValue("v10_13", this.getV1013());
        writer.writeBooleanValue("v10_14", this.getV1014());
        writer.writeBooleanValue("v10_15", this.getV1015());
        writer.writeBooleanValue("v10_7", this.getV107());
        writer.writeBooleanValue("v10_8", this.getV108());
        writer.writeBooleanValue("v10_9", this.getV109());
        writer.writeBooleanValue("v11_0", this.getV110());
        writer.writeBooleanValue("v12_0", this.getV120());
        writer.writeBooleanValue("v13_0", this.getV130());
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
     * Sets the v10_10 property value. When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_10 property.
     */
    public void setV1010(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1010", value);
    }
    /**
     * Sets the v10_11 property value. When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_11 property.
     */
    public void setV1011(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1011", value);
    }
    /**
     * Sets the v10_12 property value. When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_12 property.
     */
    public void setV1012(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1012", value);
    }
    /**
     * Sets the v10_13 property value. When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_13 property.
     */
    public void setV1013(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1013", value);
    }
    /**
     * Sets the v10_14 property value. When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_14 property.
     */
    public void setV1014(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1014", value);
    }
    /**
     * Sets the v10_15 property value. When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_15 property.
     */
    public void setV1015(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v1015", value);
    }
    /**
     * Sets the v10_7 property value. When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_7 property.
     */
    public void setV107(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v107", value);
    }
    /**
     * Sets the v10_8 property value. When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_8 property.
     */
    public void setV108(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v108", value);
    }
    /**
     * Sets the v10_9 property value. When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v10_9 property.
     */
    public void setV109(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v109", value);
    }
    /**
     * Sets the v11_0 property value. When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v11_0 property.
     */
    public void setV110(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v110", value);
    }
    /**
     * Sets the v12_0 property value. When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v12_0 property.
     */
    public void setV120(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v120", value);
    }
    /**
     * Sets the v13_0 property value. When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     * @param value Value to set for the v13_0 property.
     */
    public void setV130(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("v130", value);
    }
}
