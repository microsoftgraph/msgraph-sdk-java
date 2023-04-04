package com.microsoft.graph.users.item.calendarview.item.attachments.createuploadsession;

import com.microsoft.graph.models.AttachmentItem;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CreateUploadSessionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The AttachmentItem property */
    private AttachmentItem attachmentItem;
    /**
     * Instantiates a new createUploadSessionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreateUploadSessionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createUploadSessionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateUploadSessionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateUploadSessionPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attachmentItem property value. The AttachmentItem property
     * @return a attachmentItem
     */
    @javax.annotation.Nullable
    public AttachmentItem getAttachmentItem() {
        return this.attachmentItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("AttachmentItem", (n) -> { this.setAttachmentItem(n.getObjectValue(AttachmentItem::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("AttachmentItem", this.getAttachmentItem());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attachmentItem property value. The AttachmentItem property
     * @param value Value to set for the AttachmentItem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachmentItem(@javax.annotation.Nullable final AttachmentItem value) {
        this.attachmentItem = value;
    }
}
