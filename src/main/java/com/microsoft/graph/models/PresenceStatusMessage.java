package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PresenceStatusMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Time in which the status message expires.If not provided, the status message doesn't expire.expiryDateTime.dateTime shouldn't include time zone.expiryDateTime isn't available when you request the presence of another user.
     */
    private DateTimeTimeZone expiryDateTime;
    /**
     * Status message item. The only supported format currently is message.contentType = 'text'.
     */
    private ItemBody message;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Time in which the status message was published.Read-only.publishedDateTime isn't available when you request the presence of another user.
     */
    private OffsetDateTime publishedDateTime;
    /**
     * Instantiates a new PresenceStatusMessage and sets the default values.
     */
    public PresenceStatusMessage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PresenceStatusMessage
     */
    @jakarta.annotation.Nonnull
    public static PresenceStatusMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PresenceStatusMessage();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the expiryDateTime property value. Time in which the status message expires.If not provided, the status message doesn't expire.expiryDateTime.dateTime shouldn't include time zone.expiryDateTime isn't available when you request the presence of another user.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getExpiryDateTime() {
        return this.expiryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Status message item. The only supported format currently is message.contentType = 'text'.
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getMessage() {
        return this.message;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the publishedDateTime property value. Time in which the status message was published.Read-only.publishedDateTime isn't available when you request the presence of another user.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("expiryDateTime", this.getExpiryDateTime());
        writer.writeObjectValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expiryDateTime property value. Time in which the status message expires.If not provided, the status message doesn't expire.expiryDateTime.dateTime shouldn't include time zone.expiryDateTime isn't available when you request the presence of another user.
     * @param value Value to set for the expiryDateTime property.
     */
    public void setExpiryDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.expiryDateTime = value;
    }
    /**
     * Sets the message property value. Status message item. The only supported format currently is message.contentType = 'text'.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final ItemBody value) {
        this.message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the publishedDateTime property value. Time in which the status message was published.Read-only.publishedDateTime isn't available when you request the presence of another user.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
}
