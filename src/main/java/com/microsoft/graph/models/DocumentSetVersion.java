package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DocumentSetVersion extends ListItemVersion implements Parsable {
    /**
     * Comment about the captured version.
     */
    private String comment;
    /**
     * User who captured the version.
     */
    private IdentitySet createdBy;
    /**
     * Date and time when this version was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Items within the document set that are captured as part of this version.
     */
    private java.util.List<DocumentSetVersionItem> items;
    /**
     * If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false.
     */
    private Boolean shouldCaptureMinorVersion;
    /**
     * Instantiates a new documentSetVersion and sets the default values.
     */
    public DocumentSetVersion() {
        super();
        this.setOdataType("#microsoft.graph.documentSetVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentSetVersion
     */
    @jakarta.annotation.Nonnull
    public static DocumentSetVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSetVersion();
    }
    /**
     * Gets the comment property value. Comment about the captured version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the createdBy property value. User who captured the version.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time when this version was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(DocumentSetVersionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("shouldCaptureMinorVersion", (n) -> { this.setShouldCaptureMinorVersion(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Items within the document set that are captured as part of this version.
     * @return a documentSetVersionItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<DocumentSetVersionItem> getItems() {
        return this.items;
    }
    /**
     * Gets the shouldCaptureMinorVersion property value. If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShouldCaptureMinorVersion() {
        return this.shouldCaptureMinorVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the createdBy property value. User who captured the version.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when this version was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the items property value. Items within the document set that are captured as part of this version.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<DocumentSetVersionItem> value) {
        this.items = value;
    }
    /**
     * Sets the shouldCaptureMinorVersion property value. If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is false.
     * @param value Value to set for the shouldCaptureMinorVersion property.
     */
    public void setShouldCaptureMinorVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.shouldCaptureMinorVersion = value;
    }
}
