package com.microsoft.graph.models;

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
public class ChatInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ChatInfo and sets the default values.
     */
    public ChatInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatInfo
     */
    @jakarta.annotation.Nonnull
    public static ChatInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the replyChainMessageId property value. The ID of the reply message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReplyChainMessageId() {
        return this.backingStore.get("replyChainMessageId");
    }
    /**
     * Gets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.backingStore.get("threadId");
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
     * Sets the messageId property value. The unique identifier of a message in a Microsoft Teams channel.
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the replyChainMessageId property value. The ID of the reply message.
     * @param value Value to set for the replyChainMessageId property.
     */
    public void setReplyChainMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("replyChainMessageId", value);
    }
    /**
     * Sets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @param value Value to set for the threadId property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threadId", value);
    }
}
