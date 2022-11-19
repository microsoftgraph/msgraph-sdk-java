package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class PrintDocument extends Entity implements Parsable {
    /** The document's content (MIME) type. Read-only. */
    private String _contentType;
    /** The document's name. Read-only. */
    private String _displayName;
    /** The document's size in bytes. Read-only. */
    private Long _size;
    /**
     * Instantiates a new printDocument and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintDocument() {
        super();
        this.setOdataType("#microsoft.graph.printDocument");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printDocument
     */
    @javax.annotation.Nonnull
    public static PrintDocument createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintDocument();
    }
    /**
     * Gets the contentType property value. The document's content (MIME) type. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * Gets the displayName property value. The document's name. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintDocument currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. The document's size in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
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
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLongValue("size", this.getSize());
    }
    /**
     * Sets the contentType property value. The document's content (MIME) type. Read-only.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the displayName property value. The document's name. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the size property value. The document's size in bytes. Read-only.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
}
