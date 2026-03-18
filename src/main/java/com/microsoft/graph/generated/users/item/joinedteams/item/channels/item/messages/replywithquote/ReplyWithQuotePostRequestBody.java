package com.microsoft.graph.users.item.joinedteams.item.channels.item.messages.replywithquote;

import com.microsoft.graph.models.ChatMessage;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReplyWithQuotePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReplyWithQuotePostRequestBody} and sets the default values.
     */
    public ReplyWithQuotePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReplyWithQuotePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReplyWithQuotePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReplyWithQuotePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("messageIds", (n) -> { this.setMessageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("replyMessage", (n) -> { this.setReplyMessage(n.getObjectValue(ChatMessage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messageIds property value. The messageIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMessageIds() {
        return this.backingStore.get("messageIds");
    }
    /**
     * Gets the replyMessage property value. The replyMessage property
     * @return a {@link ChatMessage}
     */
    @jakarta.annotation.Nullable
    public ChatMessage getReplyMessage() {
        return this.backingStore.get("replyMessage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("messageIds", this.getMessageIds());
        writer.writeObjectValue("replyMessage", this.getReplyMessage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the messageIds property value. The messageIds property
     * @param value Value to set for the messageIds property.
     */
    public void setMessageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("messageIds", value);
    }
    /**
     * Sets the replyMessage property value. The replyMessage property
     * @param value Value to set for the replyMessage property.
     */
    public void setReplyMessage(@jakarta.annotation.Nullable final ChatMessage value) {
        this.backingStore.set("replyMessage", value);
    }
}
