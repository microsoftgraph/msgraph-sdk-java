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
public class ProcessContentMetadataBase implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ProcessContentMetadataBase} and sets the default values.
     */
    public ProcessContentMetadataBase() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessContentMetadataBase}
     */
    @jakarta.annotation.Nonnull
    public static ProcessContentMetadataBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.processConversationMetadata": return new ProcessConversationMetadata();
                case "#microsoft.graph.processFileMetadata": return new ProcessFileMetadata();
            }
        }
        return new ProcessContentMetadataBase();
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
     * Gets the content property value. Represents the actual content, either as text (textContent) or binary data (binaryContent). Optional if metadata alone is sufficient for policy evaluation. Do not use for contentActivities.
     * @return a {@link ContentBase}
     */
    @jakarta.annotation.Nullable
    public ContentBase getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the correlationId property value. An identifier used to group multiple related content entries (for example, different parts of the same file upload, messages in a conversation).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the createdDateTime property value. Required. Timestamp indicating when the original content was created (for example, file creation time, message sent time).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(ContentBase::createFromDiscriminatorValue)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("isTruncated", (n) -> { this.setIsTruncated(n.getBooleanValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getLongValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sequenceNumber", (n) -> { this.setSequenceNumber(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Required. A unique identifier for this specific content entry within the context of the calling application or enforcement plane (for example, message ID, file path/URL).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the isTruncated property value. Required. Indicates if the provided content has been truncated from its original form (for example, due to size limits).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTruncated() {
        return this.backingStore.get("isTruncated");
    }
    /**
     * Gets the length property value. The length of the original content in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLength() {
        return this.backingStore.get("length");
    }
    /**
     * Gets the modifiedDateTime property value. Required. Timestamp indicating when the original content was last modified. For ephemeral content like messages, this might be the same as createdDateTime.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the name property value. Required. A descriptive name for the content (for example, file name, web page title, &apos;Chat Message&apos;).
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
     * Gets the sequenceNumber property value. A sequence number indicating the order in which content was generated or should be processed, required when correlationId is used.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSequenceNumber() {
        return this.backingStore.get("sequenceNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeBooleanValue("isTruncated", this.getIsTruncated());
        writer.writeLongValue("length", this.getLength());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("sequenceNumber", this.getSequenceNumber());
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
     * Sets the content property value. Represents the actual content, either as text (textContent) or binary data (binaryContent). Optional if metadata alone is sufficient for policy evaluation. Do not use for contentActivities.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final ContentBase value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the correlationId property value. An identifier used to group multiple related content entries (for example, different parts of the same file upload, messages in a conversation).
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the createdDateTime property value. Required. Timestamp indicating when the original content was created (for example, file creation time, message sent time).
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the identifier property value. Required. A unique identifier for this specific content entry within the context of the calling application or enforcement plane (for example, message ID, file path/URL).
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the isTruncated property value. Required. Indicates if the provided content has been truncated from its original form (for example, due to size limits).
     * @param value Value to set for the isTruncated property.
     */
    public void setIsTruncated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTruncated", value);
    }
    /**
     * Sets the length property value. The length of the original content in bytes.
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("length", value);
    }
    /**
     * Sets the modifiedDateTime property value. Required. Timestamp indicating when the original content was last modified. For ephemeral content like messages, this might be the same as createdDateTime.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the name property value. Required. A descriptive name for the content (for example, file name, web page title, &apos;Chat Message&apos;).
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
     * Sets the sequenceNumber property value. A sequence number indicating the order in which content was generated or should be processed, required when correlationId is used.
     * @param value Value to set for the sequenceNumber property.
     */
    public void setSequenceNumber(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sequenceNumber", value);
    }
}
