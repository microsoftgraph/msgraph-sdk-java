package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * Instantiates a new offerShiftRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfferShiftRequest() {
        super();
        this.setOdataType("#microsoft.graph.offerShiftRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a offerShiftRequest
     */
    @javax.annotation.Nonnull
    public static OfferShiftRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getRecipientActionDateTime() {
        return this.recipientActionDateTime;
    }
    /**
     * Gets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientActionMessage() {
        return this.recipientActionMessage;
    }
    /**
     * Gets the recipientUserId property value. User ID of the recipient of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientUserId() {
        return this.recipientUserId;
    }
    /**
     * Gets the senderShiftId property value. User ID of the sender of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderShiftId() {
        return this.senderShiftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recipientActionMessage", this.getRecipientActionMessage());
        writer.writeStringValue("recipientUserId", this.getRecipientUserId());
        writer.writeStringValue("senderShiftId", this.getSenderShiftId());
    }
    /**
     * Sets the recipientActionDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the recipientActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.recipientActionDateTime = value;
    }
    /**
     * Sets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @param value Value to set for the recipientActionMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientActionMessage(@javax.annotation.Nullable final String value) {
        this.recipientActionMessage = value;
    }
    /**
     * Sets the recipientUserId property value. User ID of the recipient of the offer shift request.
     * @param value Value to set for the recipientUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientUserId(@javax.annotation.Nullable final String value) {
        this.recipientUserId = value;
    }
    /**
     * Sets the senderShiftId property value. User ID of the sender of the offer shift request.
     * @param value Value to set for the senderShiftId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderShiftId(@javax.annotation.Nullable final String value) {
        this.senderShiftId = value;
    }
}
