package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class AttachmentSession extends Entity implements Parsable {
    /** The content property */
    private byte[] _content;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** The nextExpectedRanges property */
    private java.util.List<String> _nextExpectedRanges;
    /**
     * Instantiates a new attachmentSession and sets the default values.
     * @return a void
     */
    public AttachmentSession() {
        super();
        this.setOdataType("#microsoft.graph.attachmentSession");
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
     * Gets the content property value. The content property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttachmentSession currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("nextExpectedRanges", (n) -> { currentObject.setNextExpectedRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the nextExpectedRanges property value. The nextExpectedRanges property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNextExpectedRanges() {
        return this._nextExpectedRanges;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfPrimitiveValues("nextExpectedRanges", this.getNextExpectedRanges());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the nextExpectedRanges property value. The nextExpectedRanges property
     * @param value Value to set for the nextExpectedRanges property.
     * @return a void
     */
    public void setNextExpectedRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._nextExpectedRanges = value;
    }
}
