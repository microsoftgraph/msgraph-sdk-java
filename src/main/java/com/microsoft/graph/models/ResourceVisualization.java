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
public class ResourceVisualization implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ResourceVisualization and sets the default values.
     */
    public ResourceVisualization() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResourceVisualization
     */
    @jakarta.annotation.Nonnull
    public static ResourceVisualization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceVisualization();
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
     * Gets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContainerDisplayName() {
        return this.getBackingStore().get("containerDisplayName");
    }
    /**
     * Gets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContainerType() {
        return this.getBackingStore().get("containerType");
    }
    /**
     * Gets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContainerWebUrl() {
        return this.getBackingStore().get("containerWebUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("containerDisplayName", (n) -> { this.setContainerDisplayName(n.getStringValue()); });
        deserializerMap.put("containerType", (n) -> { this.setContainerType(n.getStringValue()); });
        deserializerMap.put("containerWebUrl", (n) -> { this.setContainerWebUrl(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previewImageUrl", (n) -> { this.setPreviewImageUrl(n.getStringValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Not all Media Mime Types are supported.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.getBackingStore().get("mediaType");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreviewImageUrl() {
        return this.getBackingStore().get("previewImageUrl");
    }
    /**
     * Gets the previewText property value. A preview text for the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreviewText() {
        return this.getBackingStore().get("previewText");
    }
    /**
     * Gets the title property value. The item's title text.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.getBackingStore().get("title");
    }
    /**
     * Gets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See the section Type property values for supported types.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.getBackingStore().get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("containerDisplayName", this.getContainerDisplayName());
        writer.writeStringValue("containerType", this.getContainerType());
        writer.writeStringValue("containerWebUrl", this.getContainerWebUrl());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("previewImageUrl", this.getPreviewImageUrl());
        writer.writeStringValue("previewText", this.getPreviewText());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
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
     * Sets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @param value Value to set for the containerDisplayName property.
     */
    public void setContainerDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("containerDisplayName", value);
    }
    /**
     * Sets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @param value Value to set for the containerType property.
     */
    public void setContainerType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("containerType", value);
    }
    /**
     * Sets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @param value Value to set for the containerWebUrl property.
     */
    public void setContainerWebUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("containerWebUrl", value);
    }
    /**
     * Sets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Not all Media Mime Types are supported.
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("mediaType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @param value Value to set for the previewImageUrl property.
     */
    public void setPreviewImageUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("previewImageUrl", value);
    }
    /**
     * Sets the previewText property value. A preview text for the item.
     * @param value Value to set for the previewText property.
     */
    public void setPreviewText(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("previewText", value);
    }
    /**
     * Sets the title property value. The item's title text.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("title", value);
    }
    /**
     * Sets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See the section Type property values for supported types.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("type", value);
    }
}
