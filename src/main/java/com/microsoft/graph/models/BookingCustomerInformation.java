package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingCustomerInformation extends BookingCustomerInformationBase implements Parsable {
    /**
     * The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     */
    private String customerId;
    /**
     * It consists of the list of custom questions and answers given by the customer as part of the appointment
     */
    private java.util.List<BookingQuestionAnswer> customQuestionAnswers;
    /**
     * The SMTP address of the bookingCustomer who is booking the appointment
     */
    private String emailAddress;
    /**
     * Represents location information for thebookingCustomerwho is booking the appointment.
     */
    private Location location;
    /**
     * The customer's name.
     */
    private String name;
    /**
     * Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId.
     */
    private String notes;
    /**
     * The customer's phone number.
     */
    private String phone;
    /**
     * The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     */
    private String timeZone;
    /**
     * Instantiates a new bookingCustomerInformation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BookingCustomerInformation() {
        super();
        this.setOdataType("#microsoft.graph.bookingCustomerInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingCustomerInformation
     */
    @jakarta.annotation.Nonnull
    public static BookingCustomerInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomerInformation();
    }
    /**
     * Gets the customerId property value. The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the customQuestionAnswers property value. It consists of the list of custom questions and answers given by the customer as part of the appointment
     * @return a bookingQuestionAnswer
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingQuestionAnswer> getCustomQuestionAnswers() {
        return this.customQuestionAnswers;
    }
    /**
     * Gets the emailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("customQuestionAnswers", (n) -> { this.setCustomQuestionAnswers(n.getCollectionOfObjectValues(BookingQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. Represents location information for thebookingCustomerwho is booking the appointment.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public Location getLocation() {
        return this.location;
    }
    /**
     * Gets the name property value. The customer's name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the notes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the phone property value. The customer's phone number.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the timeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setCustomerId(@jakarta.annotation.Nullable final String value) {
        this.customerId = value;
    }
    /**
     * Sets the customQuestionAnswers property value. It consists of the list of custom questions and answers given by the customer as part of the appointment
     * @param value Value to set for the customQuestionAnswers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomQuestionAnswers(@jakarta.annotation.Nullable final java.util.List<BookingQuestionAnswer> value) {
        this.customQuestionAnswers = value;
    }
    /**
     * Sets the emailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the location property value. Represents location information for thebookingCustomerwho is booking the appointment.
     * @param value Value to set for the location property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocation(@jakarta.annotation.Nullable final Location value) {
        this.location = value;
    }
    /**
     * Sets the name property value. The customer's name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the notes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID. You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by the customerId.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the phone property value. The customer's phone number.
     * @param value Value to set for the phone property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the timeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.timeZone = value;
    }
}
