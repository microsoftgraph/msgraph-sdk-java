package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfferShiftRequest extends ScheduleChangeRequest implements Parsable {
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime recipientActionDateTime;
    /**
     * Custom message sent by recipient of the offer shift request.
     */
    private String recipientActionMessage;
    /**
     * User ID of the recipient of the offer shift request.
     */
    private String recipientUserId;
    /**
     * User ID of the sender of the offer shift request.
     */
    private String senderShiftId;
    /**
     * Instantiates a new OfferShiftRequest and sets the default values.
     */
    public OfferShiftRequest() {
        super();
        this.setOdataType("#microsoft.graph.offerShiftRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfferShiftRequest
     */
    @jakarta.annotation.Nonnull
    public static OfferShiftRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.swapShiftsChangeRequest": return new SwapShiftsChangeRequest();
            }
        }
        return new OfferShiftRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recipientActionDateTime", (n) -> { this.setRecipientActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientActionMessage", (n) -> { this.setRecipientActionMessage(n.getStringValue()); });
        deserializerMap.put("recipientUserId", (n) -> { this.setRecipientUserId(n.getStringValue()); });
        deserializerMap.put("senderShiftId", (n) -> { this.setSenderShiftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientActionDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecipientActionDateTime() {
        return this.recipientActionDateTime;
    }
    /**
     * Gets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientActionMessage() {
        return this.recipientActionMessage;
    }
    /**
     * Gets the recipientUserId property value. User ID of the recipient of the offer shift request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientUserId() {
        return this.recipientUserId;
    }
    /**
     * Gets the senderShiftId property value. User ID of the sender of the offer shift request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderShiftId() {
        return this.senderShiftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recipientActionMessage", this.getRecipientActionMessage());
        writer.writeStringValue("recipientUserId", this.getRecipientUserId());
        writer.writeStringValue("senderShiftId", this.getSenderShiftId());
    }
    /**
     * Sets the recipientActionDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the recipientActionDateTime property.
     */
    public void setRecipientActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.recipientActionDateTime = value;
    }
    /**
     * Sets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @param value Value to set for the recipientActionMessage property.
     */
    public void setRecipientActionMessage(@jakarta.annotation.Nullable final String value) {
        this.recipientActionMessage = value;
    }
    /**
     * Sets the recipientUserId property value. User ID of the recipient of the offer shift request.
     * @param value Value to set for the recipientUserId property.
     */
    public void setRecipientUserId(@jakarta.annotation.Nullable final String value) {
        this.recipientUserId = value;
    }
    /**
     * Sets the senderShiftId property value. User ID of the sender of the offer shift request.
     * @param value Value to set for the senderShiftId property.
     */
    public void setSenderShiftId(@jakarta.annotation.Nullable final String value) {
        this.senderShiftId = value;
    }
}
