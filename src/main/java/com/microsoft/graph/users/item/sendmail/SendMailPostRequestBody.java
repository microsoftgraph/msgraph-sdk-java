package com.microsoft.graph.users.item.sendmail;

import com.microsoft.graph.models.Message;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SendMailPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Message property
     */
    private Message message;
    /**
     * The SaveToSentItems property
     */
    private Boolean saveToSentItems;
    /**
     * Instantiates a new sendMailPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SendMailPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sendMailPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SendMailPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendMailPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getObjectValue(Message::createFromDiscriminatorValue)); });
        deserializerMap.put("SaveToSentItems", (n) -> { this.setSaveToSentItems(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The Message property
     * @return a message
     */
    @javax.annotation.Nullable
    public Message getMessage() {
        return this.message;
    }
    /**
     * Gets the saveToSentItems property value. The SaveToSentItems property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSaveToSentItems() {
        return this.saveToSentItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("Message", this.getMessage());
        writer.writeBooleanValue("SaveToSentItems", this.getSaveToSentItems());
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
     * Sets the message property value. The Message property
     * @param value Value to set for the Message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final Message value) {
        this.message = value;
    }
    /**
     * Sets the saveToSentItems property value. The SaveToSentItems property
     * @param value Value to set for the SaveToSentItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSaveToSentItems(@javax.annotation.Nullable final Boolean value) {
        this.saveToSentItems = value;
    }
}
