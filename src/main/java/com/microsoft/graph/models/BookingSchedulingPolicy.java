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
/** This type represents the set of policies that dictate how bookings can be created in a Booking Calendar. */
public class BookingSchedulingPolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** True if to allow customers to choose a specific person for the booking. */
    private Boolean _allowStaffSelection;
    /** Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format. */
    private Period _maximumAdvance;
    /** The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format. */
    private Period _minimumLeadTime;
    /** The OdataType property */
    private String _odataType;
    /** True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business. */
    private Boolean _sendConfirmationsToOwner;
    /** Duration of each time slot, denoted in ISO 8601 format. */
    private Period _timeSlotInterval;
    /**
     * Instantiates a new bookingSchedulingPolicy and sets the default values.
     * @return a void
     */
    public BookingSchedulingPolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bookingSchedulingPolicy");
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
        return this._additionalData;
    }
    /**
     * Gets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowStaffSelection() {
        return this._allowStaffSelection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingSchedulingPolicy currentObject = this;
        return new HashMap<>(6) {{
            this.put("allowStaffSelection", (n) -> { currentObject.setAllowStaffSelection(n.getBooleanValue()); });
            this.put("maximumAdvance", (n) -> { currentObject.setMaximumAdvance(n.getPeriodValue()); });
            this.put("minimumLeadTime", (n) -> { currentObject.setMinimumLeadTime(n.getPeriodValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sendConfirmationsToOwner", (n) -> { currentObject.setSendConfirmationsToOwner(n.getBooleanValue()); });
            this.put("timeSlotInterval", (n) -> { currentObject.setTimeSlotInterval(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumAdvance() {
        return this._maximumAdvance;
    }
    /**
     * Gets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMinimumLeadTime() {
        return this._minimumLeadTime;
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
     * Gets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendConfirmationsToOwner() {
        return this._sendConfirmationsToOwner;
    }
    /**
     * Gets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeSlotInterval() {
        return this._timeSlotInterval;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @param value Value to set for the allowStaffSelection property.
     * @return a void
     */
    public void setAllowStaffSelection(@javax.annotation.Nullable final Boolean value) {
        this._allowStaffSelection = value;
    }
    /**
     * Sets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @param value Value to set for the maximumAdvance property.
     * @return a void
     */
    public void setMaximumAdvance(@javax.annotation.Nullable final Period value) {
        this._maximumAdvance = value;
    }
    /**
     * Sets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @param value Value to set for the minimumLeadTime property.
     * @return a void
     */
    public void setMinimumLeadTime(@javax.annotation.Nullable final Period value) {
        this._minimumLeadTime = value;
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
     * Sets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @param value Value to set for the sendConfirmationsToOwner property.
     * @return a void
     */
    public void setSendConfirmationsToOwner(@javax.annotation.Nullable final Boolean value) {
        this._sendConfirmationsToOwner = value;
    }
    /**
     * Sets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @param value Value to set for the timeSlotInterval property.
     * @return a void
     */
    public void setTimeSlotInterval(@javax.annotation.Nullable final Period value) {
        this._timeSlotInterval = value;
    }
}
