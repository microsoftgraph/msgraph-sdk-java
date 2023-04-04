package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttachmentSession extends Entity implements Parsable {
    /** The content streams that are uploaded. */
    private byte[] content;
    /** The date and time in UTC when the upload session will expire. The complete file must be uploaded before this expiration time is reached. */
    private OffsetDateTime expirationDateTime;
    /** Indicates a single value {start} that represents the location in the file where the next upload should begin. */
    private java.util.List<String> nextExpectedRanges;
    /**
     * Instantiates a new attachmentSession and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttachmentSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attachmentSession
     */
    @javax.annotation.Nonnull
    public static AttachmentSession createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentSession();
    }
    /**
     * Gets the content property value. The content streams that are uploaded.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the expirationDateTime property value. The date and time in UTC when the upload session will expire. The complete file must be uploaded before this expiration time is reached.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextExpectedRanges", (n) -> { this.setNextExpectedRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the nextExpectedRanges property value. Indicates a single value {start} that represents the location in the file where the next upload should begin.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNextExpectedRanges() {
        return this.nextExpectedRanges;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfPrimitiveValues("nextExpectedRanges", this.getNextExpectedRanges());
    }
    /**
     * Sets the content property value. The content streams that are uploaded.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the expirationDateTime property value. The date and time in UTC when the upload session will expire. The complete file must be uploaded before this expiration time is reached.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the nextExpectedRanges property value. Indicates a single value {start} that represents the location in the file where the next upload should begin.
     * @param value Value to set for the nextExpectedRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextExpectedRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this.nextExpectedRanges = value;
    }
}
