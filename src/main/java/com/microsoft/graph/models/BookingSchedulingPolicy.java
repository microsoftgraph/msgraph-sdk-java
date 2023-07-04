package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type represents the set of policies that dictate how bookings can be created in a Booking Calendar.
 */
public class BookingSchedulingPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True if to allow customers to choose a specific person for the booking.
     */
    private Boolean allowStaffSelection;
    /**
     * Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     */
    private Period maximumAdvance;
    /**
     * The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     */
    private Period minimumLeadTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     */
    private Boolean sendConfirmationsToOwner;
    /**
     * Duration of each time slot, denoted in ISO 8601 format.
     */
    private Period timeSlotInterval;
    /**
     * Instantiates a new bookingSchedulingPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingSchedulingPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingSchedulingPolicy
     */
    @javax.annotation.Nonnull
    public static BookingSchedulingPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingSchedulingPolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowStaffSelection() {
        return this.allowStaffSelection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowStaffSelection", (n) -> { this.setAllowStaffSelection(n.getBooleanValue()); });
        deserializerMap.put("maximumAdvance", (n) -> { this.setMaximumAdvance(n.getPeriodValue()); });
        deserializerMap.put("minimumLeadTime", (n) -> { this.setMinimumLeadTime(n.getPeriodValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sendConfirmationsToOwner", (n) -> { this.setSendConfirmationsToOwner(n.getBooleanValue()); });
        deserializerMap.put("timeSlotInterval", (n) -> { this.setTimeSlotInterval(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumAdvance() {
        return this.maximumAdvance;
    }
    /**
     * Gets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMinimumLeadTime() {
        return this.minimumLeadTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendConfirmationsToOwner() {
        return this.sendConfirmationsToOwner;
    }
    /**
     * Gets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeSlotInterval() {
        return this.timeSlotInterval;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowStaffSelection", this.getAllowStaffSelection());
        writer.writePeriodValue("maximumAdvance", this.getMaximumAdvance());
        writer.writePeriodValue("minimumLeadTime", this.getMinimumLeadTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("sendConfirmationsToOwner", this.getSendConfirmationsToOwner());
        writer.writePeriodValue("timeSlotInterval", this.getTimeSlotInterval());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @param value Value to set for the allowStaffSelection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowStaffSelection(@javax.annotation.Nullable final Boolean value) {
        this.allowStaffSelection = value;
    }
    /**
     * Sets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @param value Value to set for the maximumAdvance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumAdvance(@javax.annotation.Nullable final Period value) {
        this.maximumAdvance = value;
    }
    /**
     * Sets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @param value Value to set for the minimumLeadTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumLeadTime(@javax.annotation.Nullable final Period value) {
        this.minimumLeadTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @param value Value to set for the sendConfirmationsToOwner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSendConfirmationsToOwner(@javax.annotation.Nullable final Boolean value) {
        this.sendConfirmationsToOwner = value;
    }
    /**
     * Sets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @param value Value to set for the timeSlotInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeSlotInterval(@javax.annotation.Nullable final Period value) {
        this.timeSlotInterval = value;
    }
}
