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
public class WebPartPosition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WebPartPosition} and sets the default values.
     */
    public WebPartPosition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebPartPosition}
     */
    @jakarta.annotation.Nonnull
    public static WebPartPosition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebPartPosition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the columnId property value. The columnId property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getColumnId() {
        return this.backingStore.get("columnId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("columnId", (n) -> { this.setColumnId(n.getDoubleValue()); });
        deserializerMap.put("horizontalSectionId", (n) -> { this.setHorizontalSectionId(n.getDoubleValue()); });
        deserializerMap.put("isInVerticalSection", (n) -> { this.setIsInVerticalSection(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webPartIndex", (n) -> { this.setWebPartIndex(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the horizontalSectionId property value. The horizontalSectionId property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getHorizontalSectionId() {
        return this.backingStore.get("horizontalSectionId");
    }
    /**
     * Gets the isInVerticalSection property value. The isInVerticalSection property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInVerticalSection() {
        return this.backingStore.get("isInVerticalSection");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the webPartIndex property value. The webPartIndex property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWebPartIndex() {
        return this.backingStore.get("webPartIndex");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("columnId", this.getColumnId());
        writer.writeDoubleValue("horizontalSectionId", this.getHorizontalSectionId());
        writer.writeBooleanValue("isInVerticalSection", this.getIsInVerticalSection());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("webPartIndex", this.getWebPartIndex());
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
     * Sets the columnId property value. The columnId property
     * @param value Value to set for the columnId property.
     */
    public void setColumnId(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("columnId", value);
    }
    /**
     * Sets the horizontalSectionId property value. The horizontalSectionId property
     * @param value Value to set for the horizontalSectionId property.
     */
    public void setHorizontalSectionId(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("horizontalSectionId", value);
    }
    /**
     * Sets the isInVerticalSection property value. The isInVerticalSection property
     * @param value Value to set for the isInVerticalSection property.
     */
    public void setIsInVerticalSection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInVerticalSection", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the webPartIndex property value. The webPartIndex property
     * @param value Value to set for the webPartIndex property.
     */
    public void setWebPartIndex(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("webPartIndex", value);
    }
}
