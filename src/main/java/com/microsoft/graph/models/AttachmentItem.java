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
public class AttachmentItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AttachmentItem and sets the default values.
     */
    public AttachmentItem() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttachmentItem
     */
    @jakarta.annotation.Nonnull
    public static AttachmentItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentItem();
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
     * Gets the attachmentType property value. The type of attachment. Possible values are: file, item, reference. Required.
     * @return a AttachmentType
     */
    @jakarta.annotation.Nullable
    public AttachmentType getAttachmentType() {
        return this.backingStore.get("attachmentType");
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
     * Gets the contentId property value. The CID or Content-Id of the attachment for referencing for the in-line attachments using the <img src='cid:contentId'> tag in HTML messages. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.backingStore.get("contentId");
    }
    /**
     * Gets the contentType property value. The nature of the data in the attachment. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("attachmentType", (n) -> { this.setAttachmentType(n.getEnumValue(AttachmentType::forValue)); });
        deserializerMap.put("contentId", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("isInline", (n) -> { this.setIsInline(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isInline property value. true if the attachment is an inline attachment; otherwise, false. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInline() {
        return this.backingStore.get("isInline");
    }
    /**
     * Gets the name property value. The display name of the attachment. This can be a descriptive string and doesn't have to be the actual file name. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the size property value. The length of the attachment in bytes. Required.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("attachmentType", this.getAttachmentType());
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeBooleanValue("isInline", this.getIsInline());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("size", this.getSize());
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
     * Sets the attachmentType property value. The type of attachment. Possible values are: file, item, reference. Required.
     * @param value Value to set for the attachmentType property.
     */
    public void setAttachmentType(@jakarta.annotation.Nullable final AttachmentType value) {
        this.backingStore.set("attachmentType", value);
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
     * Sets the contentId property value. The CID or Content-Id of the attachment for referencing for the in-line attachments using the <img src='cid:contentId'> tag in HTML messages. Optional.
     * @param value Value to set for the contentId property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentId", value);
    }
    /**
     * Sets the contentType property value. The nature of the data in the attachment. Optional.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the isInline property value. true if the attachment is an inline attachment; otherwise, false. Optional.
     * @param value Value to set for the isInline property.
     */
    public void setIsInline(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInline", value);
    }
    /**
     * Sets the name property value. The display name of the attachment. This can be a descriptive string and doesn't have to be the actual file name. Required.
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
     * Sets the size property value. The length of the attachment in bytes. Required.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
}
