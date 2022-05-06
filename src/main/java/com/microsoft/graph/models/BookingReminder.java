package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This type represents when and to whom to send an e-mail reminder.  */
public class BookingReminder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The message in the reminder.  */
    private String _message;
    /** The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.  */
    private Period _offset;
    /** The persons who should receive the reminder. Possible values are: allAttendees, staff, customer and unknownFutureValue.  */
    private BookingReminderRecipients _recipients;
    /**
     * Instantiates a new bookingReminder and sets the default values.
     * @return a void
     */
    public BookingReminder() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingReminder
     */
    @javax.annotation.Nonnull
    public static BookingReminder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingReminder();
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
        final BookingReminder currentObject = this;
        return new HashMap<>(3) {{
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("offset", (n) -> { currentObject.setOffset(n.getPeriodValue()); });
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getEnumValue(BookingReminderRecipients.class)); });
        }};
    }
    /**
     * Gets the message property value. The message in the reminder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the offset property value. The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getOffset() {
        return this._offset;
    }
    /**
     * Gets the recipients property value. The persons who should receive the reminder. Possible values are: allAttendees, staff, customer and unknownFutureValue.
     * @return a bookingReminderRecipients
     */
    @javax.annotation.Nullable
    public BookingReminderRecipients getRecipients() {
        return this._recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writePeriodValue("offset", this.getOffset());
        writer.writeEnumValue("recipients", this.getRecipients());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the message property value. The message in the reminder.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the offset property value. The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     * @param value Value to set for the offset property.
     * @return a void
     */
    public void setOffset(@javax.annotation.Nullable final Period value) {
        this._offset = value;
    }
    /**
     * Sets the recipients property value. The persons who should receive the reminder. Possible values are: allAttendees, staff, customer and unknownFutureValue.
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final BookingReminderRecipients value) {
        this._recipients = value;
    }
}
