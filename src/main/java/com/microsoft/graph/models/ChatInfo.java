package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The unique identifier of a message in a Microsoft Teams channel. */
    private String _messageId;
    /** The OdataType property */
    private String _odataType;
    /** The ID of the reply message. */
    private String _replyChainMessageId;
    /** The unique identifier for a thread in Microsoft Teams. */
    private String _threadId;
    /**
     * Instantiates a new chatInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatInfo
     */
    @javax.annotation.Nonnull
    public static ChatInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("replyChainMessageId", (n) -> { this.setReplyChainMessageId(n.getStringValue()); });
        deserializerMap.put("threadId", (n) -> { this.setThreadId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageId property value. The unique identifier of a message in a Microsoft Teams channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageId() {
        return this._messageId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the replyChainMessageId property value. The ID of the reply message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReplyChainMessageId() {
        return this._replyChainMessageId;
    }
    /**
     * Gets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThreadId() {
        return this._threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("replyChainMessageId", this.getReplyChainMessageId());
        writer.writeStringValue("threadId", this.getThreadId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the messageId property value. The unique identifier of a message in a Microsoft Teams channel.
     * @param value Value to set for the messageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageId(@javax.annotation.Nullable final String value) {
        this._messageId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the replyChainMessageId property value. The ID of the reply message.
     * @param value Value to set for the replyChainMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyChainMessageId(@javax.annotation.Nullable final String value) {
        this._replyChainMessageId = value;
    }
    /**
     * Sets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @param value Value to set for the threadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreadId(@javax.annotation.Nullable final String value) {
        this._threadId = value;
    }
}
