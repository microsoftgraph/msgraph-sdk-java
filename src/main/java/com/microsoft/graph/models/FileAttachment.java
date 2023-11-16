package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileAttachment extends Attachment implements Parsable {
    /**
     * Instantiates a new FileAttachment and sets the default values.
     */
    public FileAttachment() {
        super();
        this.setOdataType("#microsoft.graph.fileAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileAttachment
     */
    @jakarta.annotation.Nonnull
    public static FileAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAttachment();
    }
    /**
     * Gets the contentBytes property value. The base64-encoded contents of the file.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContentBytes() {
        return this.BackingStore.get("contentBytes");
    }
    /**
     * Gets the contentId property value. The ID of the attachment in the Exchange store.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.BackingStore.get("contentId");
    }
    /**
     * Gets the contentLocation property value. Don't use this property as it isn't supported.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentLocation() {
        return this.BackingStore.get("contentLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("contentLocation", this.getContentLocation());
    }
    /**
     * Sets the contentBytes property value. The base64-encoded contents of the file.
     * @param value Value to set for the contentBytes property.
     */
    public void setContentBytes(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("contentBytes", value);
    }
    /**
     * Sets the contentId property value. The ID of the attachment in the Exchange store.
     * @param value Value to set for the contentId property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentId", value);
    }
    /**
     * Sets the contentLocation property value. Don't use this property as it isn't supported.
     * @param value Value to set for the contentLocation property.
     */
    public void setContentLocation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentLocation", value);
    }
}
