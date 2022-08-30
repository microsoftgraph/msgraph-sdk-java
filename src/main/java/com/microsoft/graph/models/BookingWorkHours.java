package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This type represents the set of working hours in a single day of the week. */
public class BookingWorkHours implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The day property */
    private DayOfWeek _day;
    /** The OdataType property */
    private String _odataType;
    /** A list of start/end times during a day. */
    private java.util.List<BookingWorkTimeSlot> _timeSlots;
    /**
     * Instantiates a new bookingWorkHours and sets the default values.
     * @return a void
     */
    public BookingWorkHours() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bookingWorkHours");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingWorkHours
     */
    @javax.annotation.Nonnull
    public static BookingWorkHours createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingWorkHours();
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
     * Gets the day property value. The day property
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getDay() {
        return this._day;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingWorkHours currentObject = this;
        return new HashMap<>(3) {{
            this.put("day", (n) -> { currentObject.setDay(n.getEnumValue(DayOfWeek.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("timeSlots", (n) -> { currentObject.setTimeSlots(n.getCollectionOfObjectValues(BookingWorkTimeSlot::createFromDiscriminatorValue)); });
        }};
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
     * Gets the timeSlots property value. A list of start/end times during a day.
     * @return a bookingWorkTimeSlot
     */
    @javax.annotation.Nullable
    public java.util.List<BookingWorkTimeSlot> getTimeSlots() {
        return this._timeSlots;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("day", this.getDay());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
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
     * Sets the day property value. The day property
     * @param value Value to set for the day property.
     * @return a void
     */
    public void setDay(@javax.annotation.Nullable final DayOfWeek value) {
        this._day = value;
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
     * Sets the timeSlots property value. A list of start/end times during a day.
     * @param value Value to set for the timeSlots property.
     * @return a void
     */
    public void setTimeSlots(@javax.annotation.Nullable final java.util.List<BookingWorkTimeSlot> value) {
        this._timeSlots = value;
    }
}
