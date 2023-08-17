package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of a message in a Microsoft Teams channel.
     */
    private String messageId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The ID of the reply message.
     */
    private String replyChainMessageId;
    /**
     * The unique identifier for a thread in Microsoft Teams.
     */
    private String threadId;
    /**
     * Instantiates a new chatInfo and sets the default values.
     */
    public ChatInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatInfo
     */
    @jakarta.annotation.Nonnull
    public static ChatInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
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
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the replyChainMessageId property value. The ID of the reply message.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReplyChainMessageId() {
        return this.replyChainMessageId;
    }
    /**
     * Gets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("replyChainMessageId", this.getReplyChainMessageId());
        writer.writeStringValue("threadId", this.getThreadId());
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
     * Sets the messageId property value. The unique identifier of a message in a Microsoft Teams channel.
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.messageId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the replyChainMessageId property value. The ID of the reply message.
     * @param value Value to set for the replyChainMessageId property.
     */
    public void setReplyChainMessageId(@jakarta.annotation.Nullable final String value) {
        this.replyChainMessageId = value;
    }
    /**
     * Sets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @param value Value to set for the threadId property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
}
