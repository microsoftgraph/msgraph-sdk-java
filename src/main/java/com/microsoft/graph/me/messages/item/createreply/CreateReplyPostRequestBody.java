package com.microsoft.graph.me.messages.item.createreply;

import com.microsoft.graph.models.Message;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the createReply method. */
public class CreateReplyPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Comment property */
    private String _comment;
    /** The Message property */
    private Message _message;
    /**
     * Instantiates a new createReplyPostRequestBody and sets the default values.
     * @return a void
     */
    public CreateReplyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createReplyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateReplyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateReplyPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the comment property value. The Comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateReplyPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getObjectValue(Message::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the message property value. The Message property
     * @return a message
     */
    @javax.annotation.Nullable
    public Message getMessage() {
        return this._message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeObjectValue("message", this.getMessage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the comment property value. The Comment property
     * @param value Value to set for the Comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the message property value. The Message property
     * @param value Value to set for the Message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final Message value) {
        this._message = value;
    }
}
