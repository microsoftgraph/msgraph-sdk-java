package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type represents when and to whom to send an e-mail reminder.
 */
public class BookingReminder implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The message in the reminder.
     */
    private String message;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     */
    private PeriodAndDuration offset;
    /**
     * The recipients property
     */
    private BookingReminderRecipients recipients;
    /**
     * Instantiates a new bookingReminder and sets the default values.
     */
    public BookingReminder() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingReminder
     */
    @jakarta.annotation.Nonnull
    public static BookingReminder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingReminder();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getPeriodAndDurationValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getEnumValue(BookingReminderRecipients.class)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message in the reminder.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the offset property value. The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getOffset() {
        return this.offset;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a bookingReminderRecipients
     */
    @jakarta.annotation.Nullable
    public BookingReminderRecipients getRecipients() {
        return this.recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodAndDurationValue("offset", this.getOffset());
        writer.writeEnumValue("recipients", this.getRecipients());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the message property value. The message in the reminder.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
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
     * Sets the offset property value. The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.offset = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final BookingReminderRecipients value) {
        this.recipients = value;
    }
}
