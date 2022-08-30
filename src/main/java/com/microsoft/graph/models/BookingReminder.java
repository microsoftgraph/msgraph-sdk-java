package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This type represents when and to whom to send an e-mail reminder. */
public class BookingReminder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The message in the reminder. */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /** The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format. */
    private Period _offset;
    /** The recipients property */
    private BookingReminderRecipients _recipients;
    /**
     * Instantiates a new bookingReminder and sets the default values.
     * @return a void
     */
    public BookingReminder() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bookingReminder");
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
        return new HashMap<>(4) {{
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
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
     * Gets the recipients property value. The recipients property
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
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
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
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final BookingReminderRecipients value) {
        this._recipients = value;
    }
}
