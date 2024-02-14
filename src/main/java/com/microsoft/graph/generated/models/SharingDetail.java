package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharingDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharingDetail} and sets the default values.
     */
    public SharingDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharingDetail}
     */
    @jakarta.annotation.Nonnull
    public static SharingDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingDetail();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getObjectValue(InsightIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDateTime", (n) -> { this.setSharedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sharingReference", (n) -> { this.setSharingReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("sharingSubject", (n) -> { this.setSharingSubject(n.getStringValue()); });
        deserializerMap.put("sharingType", (n) -> { this.setSharingType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the sharedBy property value. The user who shared the document.
     * @return a {@link InsightIdentity}
     */
    @jakarta.annotation.Nullable
    public InsightIdentity getSharedBy() {
        return this.backingStore.get("sharedBy");
    }
    /**
     * Gets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSharedDateTime() {
        return this.backingStore.get("sharedDateTime");
    }
    /**
     * Gets the sharingReference property value. The sharingReference property
     * @return a {@link ResourceReference}
     */
    @jakarta.annotation.Nullable
    public ResourceReference getSharingReference() {
        return this.backingStore.get("sharingReference");
    }
    /**
     * Gets the sharingSubject property value. The subject with which the document was shared.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSharingSubject() {
        return this.backingStore.get("sharingSubject");
    }
    /**
     * Gets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSharingType() {
        return this.backingStore.get("sharingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("sharedBy", this.getSharedBy());
        writer.writeOffsetDateTimeValue("sharedDateTime", this.getSharedDateTime());
        writer.writeStringValue("sharingSubject", this.getSharingSubject());
        writer.writeStringValue("sharingType", this.getSharingType());
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
     * Sets the sharedBy property value. The user who shared the document.
     * @param value Value to set for the sharedBy property.
     */
    public void setSharedBy(@jakarta.annotation.Nullable final InsightIdentity value) {
        this.backingStore.set("sharedBy", value);
    }
    /**
     * Sets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the sharedDateTime property.
     */
    public void setSharedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sharedDateTime", value);
    }
    /**
     * Sets the sharingReference property value. The sharingReference property
     * @param value Value to set for the sharingReference property.
     */
    public void setSharingReference(@jakarta.annotation.Nullable final ResourceReference value) {
        this.backingStore.set("sharingReference", value);
    }
    /**
     * Sets the sharingSubject property value. The subject with which the document was shared.
     * @param value Value to set for the sharingSubject property.
     */
    public void setSharingSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sharingSubject", value);
    }
    /**
     * Sets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @param value Value to set for the sharingType property.
     */
    public void setSharingType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sharingType", value);
    }
}
