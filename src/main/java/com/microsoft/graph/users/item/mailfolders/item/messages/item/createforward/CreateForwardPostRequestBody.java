package com.microsoft.graph.users.item.mailfolders.item.messages.item.createforward;

import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.Recipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateForwardPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Comment property
     */
    private String comment;
    /**
     * The Message property
     */
    private Message message;
    /**
     * The ToRecipients property
     */
    private java.util.List<Recipient> toRecipients;
    /**
     * Instantiates a new createForwardPostRequestBody and sets the default values.
     */
    public CreateForwardPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createForwardPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CreateForwardPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateForwardPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the Comment property value. The Comment property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("Comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getObjectValue(Message::createFromDiscriminatorValue)); });
        deserializerMap.put("ToRecipients", (n) -> { this.setToRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the Message property value. The Message property
     * @return a message
     */
    @jakarta.annotation.Nullable
    public Message getMessage() {
        return this.message;
    }
    /**
     * Gets the ToRecipients property value. The ToRecipients property
     * @return a recipient
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.toRecipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Comment", this.getComment());
        writer.writeObjectValue("Message", this.getMessage());
        writer.writeCollectionOfObjectValues("ToRecipients", this.getToRecipients());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the Comment property value. The Comment property
     * @param value Value to set for the Comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final Message value) {
        this.message = value;
    }
    /**
     * Sets the ToRecipients property value. The ToRecipients property
     * @param value Value to set for the ToRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.toRecipients = value;
    }
}
