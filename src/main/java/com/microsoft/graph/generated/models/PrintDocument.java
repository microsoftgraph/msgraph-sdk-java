package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintDocument extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrintDocument} and sets the default values.
     */
    public PrintDocument() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrintDocument}
     */
    @jakarta.annotation.Nonnull
    public static PrintDocument createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintDocument();
    }
    /**
     * Gets the contentType property value. The document&apos;s content (MIME) type. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * Gets the displayName property value. The document&apos;s name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the downloadedDateTime property value. The time the document was downloaded. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDownloadedDateTime() {
        return this.backingStore.get("downloadedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("downloadedDateTime", (n) -> { this.setDownloadedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("uploadedDateTime", (n) -> { this.setUploadedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. The document&apos;s size in bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the uploadedDateTime property value. The time the document was uploaded. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadedDateTime() {
        return this.backingStore.get("uploadedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("downloadedDateTime", this.getDownloadedDateTime());
        writer.writeLongValue("size", this.getSize());
        writer.writeOffsetDateTimeValue("uploadedDateTime", this.getUploadedDateTime());
    }
    /**
     * Sets the contentType property value. The document&apos;s content (MIME) type. Read-only.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the displayName property value. The document&apos;s name. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the downloadedDateTime property value. The time the document was downloaded. Read-only
     * @param value Value to set for the downloadedDateTime property.
     */
    public void setDownloadedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("downloadedDateTime", value);
    }
    /**
     * Sets the size property value. The document&apos;s size in bytes. Read-only.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the uploadedDateTime property value. The time the document was uploaded. Read-only
     * @param value Value to set for the uploadedDateTime property.
     */
    public void setUploadedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("uploadedDateTime", value);
    }
}
