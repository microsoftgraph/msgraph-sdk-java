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
public class FileStorageContainerSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FileStorageContainerSettings} and sets the default values.
     */
    public FileStorageContainerSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainerSettings}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainerSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainerSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isItemVersioningEnabled", (n) -> { this.setIsItemVersioningEnabled(n.getBooleanValue()); });
        deserializerMap.put("isOcrEnabled", (n) -> { this.setIsOcrEnabled(n.getBooleanValue()); });
        deserializerMap.put("itemMajorVersionLimit", (n) -> { this.setItemMajorVersionLimit(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isItemVersioningEnabled property value. Indicates whether versioning is enabled for items in the container. Optional. Read-write.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsItemVersioningEnabled() {
        return this.backingStore.get("isItemVersioningEnabled");
    }
    /**
     * Gets the isOcrEnabled property value. Indicates whether Optical Character Recognition (OCR) is enabled for the container. The default value is false. When set to true, OCR extraction is performed for new and updated documents of supported document types, and the extracted fields in the metadata of the document enable end-user search and search-driven solutions. When set to false, existing OCR metadata is not impacted. Optional. Read-write.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOcrEnabled() {
        return this.backingStore.get("isOcrEnabled");
    }
    /**
     * Gets the itemMajorVersionLimit property value. The maximum major versions allowed for items in the container. Optional. Read-write.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemMajorVersionLimit() {
        return this.backingStore.get("itemMajorVersionLimit");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isItemVersioningEnabled", this.getIsItemVersioningEnabled());
        writer.writeBooleanValue("isOcrEnabled", this.getIsOcrEnabled());
        writer.writeIntegerValue("itemMajorVersionLimit", this.getItemMajorVersionLimit());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the isItemVersioningEnabled property value. Indicates whether versioning is enabled for items in the container. Optional. Read-write.
     * @param value Value to set for the isItemVersioningEnabled property.
     */
    public void setIsItemVersioningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isItemVersioningEnabled", value);
    }
    /**
     * Sets the isOcrEnabled property value. Indicates whether Optical Character Recognition (OCR) is enabled for the container. The default value is false. When set to true, OCR extraction is performed for new and updated documents of supported document types, and the extracted fields in the metadata of the document enable end-user search and search-driven solutions. When set to false, existing OCR metadata is not impacted. Optional. Read-write.
     * @param value Value to set for the isOcrEnabled property.
     */
    public void setIsOcrEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOcrEnabled", value);
    }
    /**
     * Sets the itemMajorVersionLimit property value. The maximum major versions allowed for items in the container. Optional. Read-write.
     * @param value Value to set for the itemMajorVersionLimit property.
     */
    public void setItemMajorVersionLimit(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("itemMajorVersionLimit", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
