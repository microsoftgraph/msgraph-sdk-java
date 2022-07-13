package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfferShiftRequest extends ScheduleChangeRequest implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _recipientActionDateTime;
    /** Custom message sent by recipient of the offer shift request. */
    private String _recipientActionMessage;
    /** User id of the recipient of the offer shift request. */
    private String _recipientUserId;
    /** User id of the sender of the offer shift request. */
    private String _senderShiftId;
    /**
     * Instantiates a new OfferShiftRequest and sets the default values.
     * @return a void
     */
    public OfferShiftRequest() {
        super();
        this.setType("#microsoft.graph.offerShiftRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfferShiftRequest
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfferShiftRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recipientActionDateTime", (n) -> { currentObject.setRecipientActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("recipientActionMessage", (n) -> { currentObject.setRecipientActionMessage(n.getStringValue()); });
            this.put("recipientUserId", (n) -> { currentObject.setRecipientUserId(n.getStringValue()); });
            this.put("senderShiftId", (n) -> { currentObject.setSenderShiftId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recipientActionDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRecipientActionDateTime() {
        return this._recipientActionDateTime;
    }
    /**
     * Gets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientActionMessage() {
        return this._recipientActionMessage;
    }
    /**
     * Gets the recipientUserId property value. User id of the recipient of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientUserId() {
        return this._recipientUserId;
    }
    /**
     * Gets the senderShiftId property value. User id of the sender of the offer shift request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderShiftId() {
        return this._senderShiftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("recipientActionDateTime", this.getRecipientActionDateTime());
        writer.writeStringValue("recipientActionMessage", this.getRecipientActionMessage());
        writer.writeStringValue("recipientUserId", this.getRecipientUserId());
        writer.writeStringValue("senderShiftId", this.getSenderShiftId());
    }
    /**
     * Sets the recipientActionDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the recipientActionDateTime property.
     * @return a void
     */
    public void setRecipientActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._recipientActionDateTime = value;
    }
    /**
     * Sets the recipientActionMessage property value. Custom message sent by recipient of the offer shift request.
     * @param value Value to set for the recipientActionMessage property.
     * @return a void
     */
    public void setRecipientActionMessage(@javax.annotation.Nullable final String value) {
        this._recipientActionMessage = value;
    }
    /**
     * Sets the recipientUserId property value. User id of the recipient of the offer shift request.
     * @param value Value to set for the recipientUserId property.
     * @return a void
     */
    public void setRecipientUserId(@javax.annotation.Nullable final String value) {
        this._recipientUserId = value;
    }
    /**
     * Sets the senderShiftId property value. User id of the sender of the offer shift request.
     * @param value Value to set for the senderShiftId property.
     * @return a void
     */
    public void setSenderShiftId(@javax.annotation.Nullable final String value) {
        this._senderShiftId = value;
    }
}
