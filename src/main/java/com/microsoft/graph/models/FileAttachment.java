package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileAttachment extends Attachment implements Parsable {
    /**
     * The base64-encoded contents of the file.
     */
    private byte[] contentBytes;
    /**
     * The ID of the attachment in the Exchange store.
     */
    private String contentId;
    /**
     * Do not use this property as it is not supported.
     */
    private String contentLocation;
    /**
     * Instantiates a new fileAttachment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileAttachment() {
        super();
        this.setOdataType("#microsoft.graph.fileAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileAttachment
     */
    @javax.annotation.Nonnull
    public static FileAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAttachment();
    }
    /**
     * Gets the contentBytes property value. The base64-encoded contents of the file.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getContentBytes() {
        return this.contentBytes;
    }
    /**
     * Gets the contentId property value. The ID of the attachment in the Exchange store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Gets the contentLocation property value. Do not use this property as it is not supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentLocation() {
        return this.contentLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentBytes", (n) -> { this.setContentBytes(n.getByteArrayValue()); });
        deserializerMap.put("contentId", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("contentLocation", (n) -> { this.setContentLocation(n.getStringValue()); });
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
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("contentLocation", this.getContentLocation());
    }
    /**
     * Sets the contentBytes property value. The base64-encoded contents of the file.
     * @param value Value to set for the contentBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentBytes(@javax.annotation.Nullable final byte[] value) {
        this.contentBytes = value;
    }
    /**
     * Sets the contentId property value. The ID of the attachment in the Exchange store.
     * @param value Value to set for the contentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentId(@javax.annotation.Nullable final String value) {
        this.contentId = value;
    }
    /**
     * Sets the contentLocation property value. Do not use this property as it is not supported.
     * @param value Value to set for the contentLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentLocation(@javax.annotation.Nullable final String value) {
        this.contentLocation = value;
    }
}
