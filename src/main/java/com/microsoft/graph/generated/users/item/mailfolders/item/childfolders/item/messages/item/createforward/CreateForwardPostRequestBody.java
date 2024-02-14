package com.microsoft.graph.users.item.mailfolders.item.childfolders.item.messages.item.createforward;

import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.Recipient;
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
public class CreateForwardPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CreateForwardPostRequestBody} and sets the default values.
     */
    public CreateForwardPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateForwardPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CreateForwardPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateForwardPostRequestBody();
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
     * Gets the Comment property value. The Comment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link Message}
     */
    @jakarta.annotation.Nullable
    public Message getMessage() {
        return this.backingStore.get("message");
    }
    /**
     * Gets the ToRecipients property value. The ToRecipients property
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.backingStore.get("toRecipients");
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
     * Sets the Comment property value. The Comment property
     * @param value Value to set for the Comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final Message value) {
        this.backingStore.set("message", value);
    }
    /**
     * Sets the ToRecipients property value. The ToRecipients property
     * @param value Value to set for the ToRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("toRecipients", value);
    }
}
