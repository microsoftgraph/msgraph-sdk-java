package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DocumentSetVersion extends ListItemVersion implements Parsable {
    /** Comment about the captured version. */
    private String _comment;
    /** User who captured the version. */
    private IdentitySet _createdBy;
    /** Date and time when this version was created. */
    private OffsetDateTime _createdDateTime;
    /** Items within the document set that are captured as part of this version. */
    private java.util.List<DocumentSetVersionItem> _items;
    /** If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false. */
    private Boolean _shouldCaptureMinorVersion;
    /**
     * Instantiates a new DocumentSetVersion and sets the default values.
     * @return a void
     */
    public DocumentSetVersion() {
        super();
        this.setOdataType("#microsoft.graph.documentSetVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DocumentSetVersion
     */
    @javax.annotation.Nonnull
    public static DocumentSetVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSetVersion();
    }
    /**
     * Gets the comment property value. Comment about the captured version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * Gets the createdBy property value. User who captured the version.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time when this version was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DocumentSetVersion currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(DocumentSetVersionItem::createFromDiscriminatorValue)); });
            this.put("shouldCaptureMinorVersion", (n) -> { currentObject.setShouldCaptureMinorVersion(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the items property value. Items within the document set that are captured as part of this version.
     * @return a documentSetVersionItem
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentSetVersionItem> getItems() {
        return this._items;
    }
    /**
     * Gets the shouldCaptureMinorVersion property value. If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShouldCaptureMinorVersion() {
        return this._shouldCaptureMinorVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeBooleanValue("shouldCaptureMinorVersion", this.getShouldCaptureMinorVersion());
    }
    /**
     * Sets the comment property value. Comment about the captured version.
     * @param value Value to set for the comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the createdBy property value. User who captured the version.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when this version was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the items property value. Items within the document set that are captured as part of this version.
     * @param value Value to set for the items property.
     * @return a void
     */
    public void setItems(@javax.annotation.Nullable final java.util.List<DocumentSetVersionItem> value) {
        this._items = value;
    }
    /**
     * Sets the shouldCaptureMinorVersion property value. If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false.
     * @param value Value to set for the shouldCaptureMinorVersion property.
     * @return a void
     */
    public void setShouldCaptureMinorVersion(@javax.annotation.Nullable final Boolean value) {
        this._shouldCaptureMinorVersion = value;
    }
}
