package com.microsoft.graph.models;

import com.microsoft.graph.models.customdataprovidedresourcepayloads.Data;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomDataProvidedResourceUploadSession extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomDataProvidedResourceUploadSession} and sets the default values.
     */
    public CustomDataProvidedResourceUploadSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomDataProvidedResourceUploadSession}
     */
    @jakarta.annotation.Nonnull
    public static CustomDataProvidedResourceUploadSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.customDataProvidedResourceAccessReviewUploadSession": return new CustomDataProvidedResourceAccessReviewUploadSession();
            }
        }
        return new CustomDataProvidedResourceUploadSession();
    }
    /**
     * Gets the createdDateTime property value. DateTime when the upload session was created. Read-only. Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the data property value. An object containing the context for which this data is being uploaded.
     * @return a {@link Data}
     */
    @jakarta.annotation.Nullable
    public Data getData() {
        return this.backingStore.get("data");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(Data::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(CustomDataProvidedResourceFile::createFromDiscriminatorValue)); });
        deserializerMap.put("isUploadDone", (n) -> { this.setIsUploadDone(n.getBooleanValue()); });
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("stats", (n) -> { this.setStats(n.getObjectValue(CustomDataProvidedResourceUploadStats::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CustomDataProvidedResourceUploadStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The files uploaded during this upload session. Supports $expand and $expand with nested $filter and $orderby.
     * @return a {@link java.util.List<CustomDataProvidedResourceFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomDataProvidedResourceFile> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the isUploadDone property value. Indicates if all the necessary files have been uploaded to this session.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUploadDone() {
        return this.backingStore.get("isUploadDone");
    }
    /**
     * Gets the referenceId property value. The ID of the context for which data is being uploaded, for example, the Access Review instance ID. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.backingStore.get("referenceId");
    }
    /**
     * Gets the stats property value. The stats property
     * @return a {@link CustomDataProvidedResourceUploadStats}
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadStats getStats() {
        return this.backingStore.get("stats");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CustomDataProvidedResourceUploadStatus}
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("data", this.getData());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeBooleanValue("isUploadDone", this.getIsUploadDone());
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeObjectValue("stats", this.getStats());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. DateTime when the upload session was created. Read-only. Supports $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the data property value. An object containing the context for which this data is being uploaded.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final Data value) {
        this.backingStore.set("data", value);
    }
    /**
     * Sets the files property value. The files uploaded during this upload session. Supports $expand and $expand with nested $filter and $orderby.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<CustomDataProvidedResourceFile> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the isUploadDone property value. Indicates if all the necessary files have been uploaded to this session.
     * @param value Value to set for the isUploadDone property.
     */
    public void setIsUploadDone(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUploadDone", value);
    }
    /**
     * Sets the referenceId property value. The ID of the context for which data is being uploaded, for example, the Access Review instance ID. Supports $filter (eq).
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("referenceId", value);
    }
    /**
     * Sets the stats property value. The stats property
     * @param value Value to set for the stats property.
     */
    public void setStats(@jakarta.annotation.Nullable final CustomDataProvidedResourceUploadStats value) {
        this.backingStore.set("stats", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CustomDataProvidedResourceUploadStatus value) {
        this.backingStore.set("status", value);
    }
}
