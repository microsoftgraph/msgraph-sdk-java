package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingCustomerInformation extends BookingCustomerInformationBase implements Parsable {
    /** The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable. */
    private String _customerId;
    /** It consists of the list of custom questions and answers given by the customer as part of the appointment */
    private java.util.List<BookingQuestionAnswer> _customQuestionAnswers;
    /** The SMTP address of the bookingCustomer who is booking the appointment */
    private String _emailAddress;
    /** Represents location information for thebookingCustomerwho is booking the appointment. */
    private Location _location;
    /** The customer's name. */
    private String _name;
    /** Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId. */
    private String _notes;
    /** The customer's phone number. */
    private String _phone;
    /** The time zone of the customer. For a list of possible values, see dateTimeTimeZone. */
    private String _timeZone;
    /**
     * Instantiates a new BookingCustomerInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingCustomerInformation() {
        super();
        this.setOdataType("#microsoft.graph.bookingCustomerInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCustomerInformation
     */
    @javax.annotation.Nonnull
    public static BookingCustomerInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomerInformation();
    }
    /**
     * Gets the customerId property value. The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerId() {
        return this._customerId;
    }
    /**
     * Gets the customQuestionAnswers property value. It consists of the list of custom questions and answers given by the customer as part of the appointment
     * @return a bookingQuestionAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<BookingQuestionAnswer> getCustomQuestionAnswers() {
        return this._customQuestionAnswers;
    }
    /**
     * Gets the emailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingCustomerInformation currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customerId", (n) -> { currentObject.setCustomerId(n.getStringValue()); });
        deserializerMap.put("customQuestionAnswers", (n) -> { currentObject.setCustomQuestionAnswers(n.getCollectionOfObjectValues(BookingQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { currentObject.setPhone(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. Represents location information for thebookingCustomerwho is booking the appointment.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getLocation() {
        return this._location;
    }
    /**
     * Gets the name property value. The customer's name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the notes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the phone property value. The customer's phone number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this._phone;
    }
    /**
     * Gets the timeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
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
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeCollectionOfObjectValues("customQuestionAnswers", this.getCustomQuestionAnswers());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("timeZone", this.getTimeZone());
    }
    /**
     * Sets the customerId property value. The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     * @param value Value to set for the customerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerId(@javax.annotation.Nullable final String value) {
        this._customerId = value;
    }
    /**
     * Sets the customQuestionAnswers property value. It consists of the list of custom questions and answers given by the customer as part of the appointment
     * @param value Value to set for the customQuestionAnswers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomQuestionAnswers(@javax.annotation.Nullable final java.util.List<BookingQuestionAnswer> value) {
        this._customQuestionAnswers = value;
    }
    /**
     * Sets the emailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the location property value. Represents location information for thebookingCustomerwho is booking the appointment.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final Location value) {
        this._location = value;
    }
    /**
     * Sets the name property value. The customer's name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the notes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the phone property value. The customer's phone number.
     * @param value Value to set for the phone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhone(@javax.annotation.Nullable final String value) {
        this._phone = value;
    }
    /**
     * Sets the timeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
}
