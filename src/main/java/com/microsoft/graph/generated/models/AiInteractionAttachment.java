package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteractionAttachment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteractionAttachment} and sets the default values.
     */
    public AiInteractionAttachment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionAttachment}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionAttachment();
    }
    /**
     * Gets the attachmentId property value. The identifier for the attachment. This identifier is only unique within the message scope.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttachmentId() {
        return this.backingStore.get("attachmentId");
    }
    /**
     * Gets the content property value. The content of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the contentType property value. The type of the content. For example, reference, file, and image/imageType.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * Gets the contentUrl property value. The URL of the content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.backingStore.get("contentUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachmentId", (n) -> { this.setAttachmentId(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("attachmentId", this.getAttachmentId());
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the attachmentId property value. The identifier for the attachment. This identifier is only unique within the message scope.
     * @param value Value to set for the attachmentId property.
     */
    public void setAttachmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attachmentId", value);
    }
    /**
     * Sets the content property value. The content of the attachment.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the contentType property value. The type of the content. For example, reference, file, and image/imageType.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the contentUrl property value. The URL of the content.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentUrl", value);
    }
    /**
     * Sets the name property value. The name of the attachment.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
}
