package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenoteResource extends OnenoteEntityBaseModel implements Parsable {
    /** The content stream */
    private byte[] _content;
    /** The URL for downloading the content */
    private String _contentUrl;
    /**
     * Instantiates a new OnenoteResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnenoteResource() {
        super();
        this.setOdataType("#microsoft.graph.onenoteResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnenoteResource
     */
    @javax.annotation.Nonnull
    public static OnenoteResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteResource();
    }
    /**
     * Gets the content property value. The content stream
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the contentUrl property value. The URL for downloading the content
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this._contentUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("contentUrl", this.getContentUrl());
    }
    /**
     * Sets the content property value. The content stream
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the contentUrl property value. The URL for downloading the content
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this._contentUrl = value;
    }
}
