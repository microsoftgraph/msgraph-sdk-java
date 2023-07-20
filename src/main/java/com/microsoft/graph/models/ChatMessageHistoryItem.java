package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessageHistoryItem implements AdditionalDataHolder, Parsable {
    /**
     * The actions property
     */
    private ChatMessageActions actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when the message was modified.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The reaction in the modified message.
     */
    private ChatMessageReaction reaction;
    /**
     * Instantiates a new chatMessageHistoryItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessageHistoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessageHistoryItem
     */
    @javax.annotation.Nonnull
    public static ChatMessageHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageHistoryItem();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a chatMessageActions
     */
    @javax.annotation.Nullable
    public ChatMessageActions getActions() {
        return this.actions;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getEnumValue(ChatMessageActions.class)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reaction", (n) -> { this.setReaction(n.getObjectValue(ChatMessageReaction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The date and time when the message was modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the reaction property value. The reaction in the modified message.
     * @return a chatMessageReaction
     */
    @javax.annotation.Nullable
    public ChatMessageReaction getReaction() {
        return this.reaction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actions", this.getActions());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("reaction", this.getReaction());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActions(@javax.annotation.Nullable final ChatMessageActions value) {
        this.actions = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the modifiedDateTime property value. The date and time when the message was modified.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reaction property value. The reaction in the modified message.
     * @param value Value to set for the reaction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReaction(@javax.annotation.Nullable final ChatMessageReaction value) {
        this.reaction = value;
    }
}
