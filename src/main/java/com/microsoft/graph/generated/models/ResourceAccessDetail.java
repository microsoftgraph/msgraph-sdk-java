package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourceAccessDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResourceAccessDetail} and sets the default values.
     */
    public ResourceAccessDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourceAccessDetail}
     */
    @jakarta.annotation.Nonnull
    public static ResourceAccessDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceAccessDetail();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a {@link EnumSet<ResourceAccessType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ResourceAccessType> getAccessType() {
        return this.backingStore.get("accessType");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumSetValue(ResourceAccessType::forValue)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("isCrossPromptInjectionDetected", (n) -> { this.setIsCrossPromptInjectionDetected(n.getBooleanValue()); });
        deserializerMap.put("labelId", (n) -> { this.setLabelId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ResourceAccessStatus::forValue)); });
        deserializerMap.put("storageId", (n) -> { this.setStorageId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Unique identifier of the resource accessed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the isCrossPromptInjectionDetected property value. Indicates whether cross-prompt injection was detected during the access attempt.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCrossPromptInjectionDetected() {
        return this.backingStore.get("isCrossPromptInjectionDetected");
    }
    /**
     * Gets the labelId property value. Identifier for the sensitivity label applied to the resource, if any.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelId() {
        return this.backingStore.get("labelId");
    }
    /**
     * Gets the name property value. Name of the resource accessed.
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
     * Gets the status property value. The status property
     * @return a {@link ResourceAccessStatus}
     */
    @jakarta.annotation.Nullable
    public ResourceAccessStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the storageId property value. Identifier for the resource in its native storage format. For SharePoint resources, this is the unique identifier of the list item.  For other resources, this is the name of the location, such as Box, Dropbox, Exchange, or Google Drive.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageId() {
        return this.backingStore.get("storageId");
    }
    /**
     * Gets the url property value. URL of the resource accessed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("accessType", this.getAccessType());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeBooleanValue("isCrossPromptInjectionDetected", this.getIsCrossPromptInjectionDetected());
        writer.writeStringValue("labelId", this.getLabelId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("storageId", this.getStorageId());
        writer.writeStringValue("url", this.getUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final EnumSet<ResourceAccessType> value) {
        this.backingStore.set("accessType", value);
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
     * Sets the identifier property value. Unique identifier of the resource accessed.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the isCrossPromptInjectionDetected property value. Indicates whether cross-prompt injection was detected during the access attempt.
     * @param value Value to set for the isCrossPromptInjectionDetected property.
     */
    public void setIsCrossPromptInjectionDetected(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCrossPromptInjectionDetected", value);
    }
    /**
     * Sets the labelId property value. Identifier for the sensitivity label applied to the resource, if any.
     * @param value Value to set for the labelId property.
     */
    public void setLabelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("labelId", value);
    }
    /**
     * Sets the name property value. Name of the resource accessed.
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
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ResourceAccessStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the storageId property value. Identifier for the resource in its native storage format. For SharePoint resources, this is the unique identifier of the list item.  For other resources, this is the name of the location, such as Box, Dropbox, Exchange, or Google Drive.
     * @param value Value to set for the storageId property.
     */
    public void setStorageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageId", value);
    }
    /**
     * Sets the url property value. URL of the resource accessed.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
