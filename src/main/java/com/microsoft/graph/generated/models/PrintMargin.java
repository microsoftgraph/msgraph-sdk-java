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
public class PrintMargin implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PrintMargin and sets the default values.
     */
    public PrintMargin() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintMargin
     */
    @jakarta.annotation.Nonnull
    public static PrintMargin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintMargin();
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
     * Gets the bottom property value. The margin in microns from the bottom edge.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBottom() {
        return this.backingStore.get("bottom");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("bottom", (n) -> { this.setBottom(n.getIntegerValue()); });
        deserializerMap.put("left", (n) -> { this.setLeft(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("right", (n) -> { this.setRight(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the left property value. The margin in microns from the left edge.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLeft() {
        return this.backingStore.get("left");
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
     * Gets the right property value. The margin in microns from the right edge.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRight() {
        return this.backingStore.get("right");
    }
    /**
     * Gets the top property value. The margin in microns from the top edge.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTop() {
        return this.backingStore.get("top");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bottom", this.getBottom());
        writer.writeIntegerValue("left", this.getLeft());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("right", this.getRight());
        writer.writeIntegerValue("top", this.getTop());
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
     * Sets the bottom property value. The margin in microns from the bottom edge.
     * @param value Value to set for the bottom property.
     */
    public void setBottom(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bottom", value);
    }
    /**
     * Sets the left property value. The margin in microns from the left edge.
     * @param value Value to set for the left property.
     */
    public void setLeft(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("left", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the right property value. The margin in microns from the right edge.
     * @param value Value to set for the right property.
     */
    public void setRight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("right", value);
    }
    /**
     * Sets the top property value. The margin in microns from the top edge.
     * @param value Value to set for the top property.
     */
    public void setTop(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("top", value);
    }
}
