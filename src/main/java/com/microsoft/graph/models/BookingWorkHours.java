package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type represents the set of working hours in a single day of the week.
 */
public class BookingWorkHours implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The day property
     */
    private DayOfWeek day;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A list of start/end times during a day.
     */
    private java.util.List<BookingWorkTimeSlot> timeSlots;
    /**
     * Instantiates a new bookingWorkHours and sets the default values.
     */
    public BookingWorkHours() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingWorkHours
     */
    @jakarta.annotation.Nonnull
    public static BookingWorkHours createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingWorkHours();
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
     * Gets the day property value. The day property
     * @return a dayOfWeek
     */
    @jakarta.annotation.Nullable
    public DayOfWeek getDay() {
        return this.day;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("day", (n) -> { this.setDay(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeSlots", (n) -> { this.setTimeSlots(n.getCollectionOfObjectValues(BookingWorkTimeSlot::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the timeSlots property value. A list of start/end times during a day.
     * @return a bookingWorkTimeSlot
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingWorkTimeSlot> getTimeSlots() {
        return this.timeSlots;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("day", this.getDay());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
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
     * Sets the day property value. The day property
     * @param value Value to set for the day property.
     */
    public void setDay(@jakarta.annotation.Nullable final DayOfWeek value) {
        this.day = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the timeSlots property value. A list of start/end times during a day.
     * @param value Value to set for the timeSlots property.
     */
    public void setTimeSlots(@jakarta.annotation.Nullable final java.util.List<BookingWorkTimeSlot> value) {
        this.timeSlots = value;
    }
}
