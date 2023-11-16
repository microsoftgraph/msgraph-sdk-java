package com.microsoft.graph.users.item.calendar.calendarview.item.decline;

import com.microsoft.graph.models.TimeSlot;
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
public class DeclinePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DeclinePostRequestBody and sets the default values.
     */
    public DeclinePostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeclinePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DeclinePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeclinePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the Comment property value. The Comment property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.BackingStore.get("comment");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("Comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("ProposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("SendResponse", (n) -> { this.setSendResponse(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ProposedNewTime property value. The ProposedNewTime property
     * @return a TimeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this.BackingStore.get("proposedNewTime");
    }
    /**
     * Gets the SendResponse property value. The SendResponse property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSendResponse() {
        return this.BackingStore.get("sendResponse");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Comment", this.getComment());
        writer.writeObjectValue("ProposedNewTime", this.getProposedNewTime());
        writer.writeBooleanValue("SendResponse", this.getSendResponse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the Comment property value. The Comment property
     * @param value Value to set for the Comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("comment", value);
    }
    /**
     * Sets the ProposedNewTime property value. The ProposedNewTime property
     * @param value Value to set for the ProposedNewTime property.
     */
    public void setProposedNewTime(@jakarta.annotation.Nullable final TimeSlot value) {
        this.BackingStore.set("proposedNewTime", value);
    }
    /**
     * Sets the SendResponse property value. The SendResponse property
     * @param value Value to set for the SendResponse property.
     */
    public void setSendResponse(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("sendResponse", value);
    }
}
