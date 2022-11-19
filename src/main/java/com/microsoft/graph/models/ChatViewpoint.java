package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatViewpoint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the chat is hidden for the current user. */
    private Boolean _isHidden;
    /** Represents the dateTime up until which the current user has read chatMessages in a specific chat. */
    private OffsetDateTime _lastMessageReadDateTime;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new chatViewpoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatViewpoint() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.chatViewpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatViewpoint
     */
    @javax.annotation.Nonnull
    public static ChatViewpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatViewpoint();
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
        final ChatViewpoint currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("isHidden", (n) -> { currentObject.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("lastMessageReadDateTime", (n) -> { currentObject.setLastMessageReadDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHidden property value. Indicates whether the chat is hidden for the current user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHidden() {
        return this._isHidden;
    }
    /**
     * Gets the lastMessageReadDateTime property value. Represents the dateTime up until which the current user has read chatMessages in a specific chat.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastMessageReadDateTime() {
        return this._lastMessageReadDateTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isHidden", this.getIsHidden());
        writer.writeOffsetDateTimeValue("lastMessageReadDateTime", this.getLastMessageReadDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isHidden property value. Indicates whether the chat is hidden for the current user.
     * @param value Value to set for the isHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._isHidden = value;
    }
    /**
     * Sets the lastMessageReadDateTime property value. Represents the dateTime up until which the current user has read chatMessages in a specific chat.
     * @param value Value to set for the lastMessageReadDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastMessageReadDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastMessageReadDateTime = value;
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
}
