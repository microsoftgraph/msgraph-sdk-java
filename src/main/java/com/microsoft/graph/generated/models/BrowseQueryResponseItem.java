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
public class BrowseQueryResponseItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BrowseQueryResponseItem} and sets the default values.
     */
    public BrowseQueryResponseItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BrowseQueryResponseItem}
     */
    @jakarta.annotation.Nonnull
    public static BrowseQueryResponseItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowseQueryResponseItem();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("itemKey", (n) -> { this.setItemKey(n.getStringValue()); });
        deserializerMap.put("itemsCount", (n) -> { this.setItemsCount(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sizeInBytes", (n) -> { this.setSizeInBytes(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(BrowseQueryResponseItemType::forValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemKey property value. The itemKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemKey() {
        return this.backingStore.get("itemKey");
    }
    /**
     * Gets the itemsCount property value. The itemsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemsCount() {
        return this.backingStore.get("itemsCount");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the sizeInBytes property value. The sizeInBytes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSizeInBytes() {
        return this.backingStore.get("sizeInBytes");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link BrowseQueryResponseItemType}
     */
    @jakarta.annotation.Nullable
    public BrowseQueryResponseItemType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the webUrl property value. The webUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("itemKey", this.getItemKey());
        writer.writeIntegerValue("itemsCount", this.getItemsCount());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sizeInBytes", this.getSizeInBytes());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the itemKey property value. The itemKey property
     * @param value Value to set for the itemKey property.
     */
    public void setItemKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemKey", value);
    }
    /**
     * Sets the itemsCount property value. The itemsCount property
     * @param value Value to set for the itemsCount property.
     */
    public void setItemsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("itemsCount", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sizeInBytes property value. The sizeInBytes property
     * @param value Value to set for the sizeInBytes property.
     */
    public void setSizeInBytes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sizeInBytes", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final BrowseQueryResponseItemType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the webUrl property value. The webUrl property
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
