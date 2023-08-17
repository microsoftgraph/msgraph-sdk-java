package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a booked appointment of a service by a customer in a business.
 */
public class BookingAppointment extends Entity implements Parsable {
    /**
     * Additional information that is sent to the customer when an appointment is confirmed.
     */
    private String additionalInformation;
    /**
     * The URL of the meeting to join anonymously.
     */
    private String anonymousJoinWebUrl;
    /**
     * A collection of customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     */
    private java.util.List<BookingCustomerInformationBase> customers;
    /**
     * The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     */
    private String customerTimeZone;
    /**
     * The length of the appointment, denoted in ISO8601 format.
     */
    private PeriodAndDuration duration;
    /**
     * The endDateTime property
     */
    private DateTimeTimeZone endDateTime;
    /**
     * The current number of customers in the appointment
     */
    private Integer filledAttendeesCount;
    /**
     * If true, indicates that the appointment will be held online. Default value is false.
     */
    private Boolean isLocationOnline;
    /**
     * The URL of the online meeting for the appointment.
     */
    private String joinWebUrl;
    /**
     * The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     */
    private Integer maximumAttendeesCount;
    /**
     * If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     */
    private Boolean optOutOfCustomerEmail;
    /**
     * The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     */
    private PeriodAndDuration postBuffer;
    /**
     * The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     */
    private PeriodAndDuration preBuffer;
    /**
     * The regular price for an appointment for the specified bookingService.
     */
    private Double price;
    /**
     * Represents the type of pricing of a booking service.
     */
    private BookingPriceType priceType;
    /**
     * The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     */
    private java.util.List<BookingReminder> reminders;
    /**
     * An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1.
     */
    private String selfServiceAppointmentId;
    /**
     * The ID of the bookingService associated with this appointment.
     */
    private String serviceId;
    /**
     * The location where the service is delivered.
     */
    private Location serviceLocation;
    /**
     * The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     */
    private String serviceName;
    /**
     * Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     */
    private String serviceNotes;
    /**
     * If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     */
    private Boolean smsNotificationsEnabled;
    /**
     * The ID of each bookingStaffMember who is scheduled in this appointment.
     */
    private java.util.List<String> staffMemberIds;
    /**
     * The startDateTime property
     */
    private DateTimeTimeZone startDateTime;
    /**
     * Instantiates a new bookingAppointment and sets the default values.
     */
    public BookingAppointment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingAppointment
     */
    @jakarta.annotation.Nonnull
    public static BookingAppointment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingAppointment();
    }
    /**
     * Gets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
    /**
     * Gets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAnonymousJoinWebUrl() {
        return this.anonymousJoinWebUrl;
    }
    /**
     * Gets the customers property value. A collection of customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @return a bookingCustomerInformationBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCustomerInformationBase> getCustomers() {
        return this.customers;
    }
    /**
     * Gets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerTimeZone() {
        return this.customerTimeZone;
    }
    /**
     * Gets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("anonymousJoinWebUrl", (n) -> { this.setAnonymousJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("customers", (n) -> { this.setCustomers(n.getCollectionOfObjectValues(BookingCustomerInformationBase::createFromDiscriminatorValue)); });
        deserializerMap.put("customerTimeZone", (n) -> { this.setCustomerTimeZone(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("filledAttendeesCount", (n) -> { this.setFilledAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("isLocationOnline", (n) -> { this.setIsLocationOnline(n.getBooleanValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("maximumAttendeesCount", (n) -> { this.setMaximumAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("optOutOfCustomerEmail", (n) -> { this.setOptOutOfCustomerEmail(n.getBooleanValue()); });
        deserializerMap.put("postBuffer", (n) -> { this.setPostBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("preBuffer", (n) -> { this.setPreBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getDoubleValue()); });
        deserializerMap.put("priceType", (n) -> { this.setPriceType(n.getEnumValue(BookingPriceType.class)); });
        deserializerMap.put("reminders", (n) -> { this.setReminders(n.getCollectionOfObjectValues(BookingReminder::createFromDiscriminatorValue)); });
        deserializerMap.put("selfServiceAppointmentId", (n) -> { this.setSelfServiceAppointmentId(n.getStringValue()); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("serviceLocation", (n) -> { this.setServiceLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("serviceNotes", (n) -> { this.setServiceNotes(n.getStringValue()); });
        deserializerMap.put("smsNotificationsEnabled", (n) -> { this.setSmsNotificationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("staffMemberIds", (n) -> { this.setStaffMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filledAttendeesCount property value. The current number of customers in the appointment
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFilledAttendeesCount() {
        return this.filledAttendeesCount;
    }
    /**
     * Gets the isLocationOnline property value. If true, indicates that the appointment will be held online. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this.isLocationOnline;
    }
    /**
     * Gets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this.maximumAttendeesCount;
    }
    /**
     * Gets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOptOutOfCustomerEmail() {
        return this.optOutOfCustomerEmail;
    }
    /**
     * Gets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPostBuffer() {
        return this.postBuffer;
    }
    /**
     * Gets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPreBuffer() {
        return this.preBuffer;
    }
    /**
     * Gets the price property value. The regular price for an appointment for the specified bookingService.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getPrice() {
        return this.price;
    }
    /**
     * Gets the priceType property value. Represents the type of pricing of a booking service.
     * @return a bookingPriceType
     */
    @jakarta.annotation.Nullable
    public BookingPriceType getPriceType() {
        return this.priceType;
    }
    /**
     * Gets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a bookingReminder
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingReminder> getReminders() {
        return this.reminders;
    }
    /**
     * Gets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSelfServiceAppointmentId() {
        return this.selfServiceAppointmentId;
    }
    /**
     * Gets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.serviceId;
    }
    /**
     * Gets the serviceLocation property value. The location where the service is delivered.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public Location getServiceLocation() {
        return this.serviceLocation;
    }
    /**
     * Gets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceNotes() {
        return this.serviceNotes;
    }
    /**
     * Gets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this.smsNotificationsEnabled;
    }
    /**
     * Gets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this.staffMemberIds;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("anonymousJoinWebUrl", this.getAnonymousJoinWebUrl());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeStringValue("customerTimeZone", this.getCustomerTimeZone());
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeIntegerValue("maximumAttendeesCount", this.getMaximumAttendeesCount());
        writer.writeBooleanValue("optOutOfCustomerEmail", this.getOptOutOfCustomerEmail());
        writer.writePeriodAndDurationValue("postBuffer", this.getPostBuffer());
        writer.writePeriodAndDurationValue("preBuffer", this.getPreBuffer());
        writer.writeDoubleValue("price", this.getPrice());
        writer.writeEnumValue("priceType", this.getPriceType());
        writer.writeCollectionOfObjectValues("reminders", this.getReminders());
        writer.writeStringValue("selfServiceAppointmentId", this.getSelfServiceAppointmentId());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeObjectValue("serviceLocation", this.getServiceLocation());
        writer.writeStringValue("serviceName", this.getServiceName());
        writer.writeStringValue("serviceNotes", this.getServiceNotes());
        writer.writeBooleanValue("smsNotificationsEnabled", this.getSmsNotificationsEnabled());
        writer.writeCollectionOfPrimitiveValues("staffMemberIds", this.getStaffMemberIds());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @param value Value to set for the anonymousJoinWebUrl property.
     */
    public void setAnonymousJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.anonymousJoinWebUrl = value;
    }
    /**
     * Sets the customers property value. A collection of customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @param value Value to set for the customers property.
     */
    public void setCustomers(@jakarta.annotation.Nullable final java.util.List<BookingCustomerInformationBase> value) {
        this.customers = value;
    }
    /**
     * Sets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the customerTimeZone property.
     */
    public void setCustomerTimeZone(@jakarta.annotation.Nullable final String value) {
        this.customerTimeZone = value;
    }
    /**
     * Sets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.endDateTime = value;
    }
    /**
     * Sets the filledAttendeesCount property value. The current number of customers in the appointment
     * @param value Value to set for the filledAttendeesCount property.
     */
    public void setFilledAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.filledAttendeesCount = value;
    }
    /**
     * Sets the isLocationOnline property value. If true, indicates that the appointment will be held online. Default value is false.
     * @param value Value to set for the isLocationOnline property.
     */
    public void setIsLocationOnline(@jakarta.annotation.Nullable final Boolean value) {
        this.isLocationOnline = value;
    }
    /**
     * Sets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     */
    public void setMaximumAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.maximumAttendeesCount = value;
    }
    /**
     * Sets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @param value Value to set for the optOutOfCustomerEmail property.
     */
    public void setOptOutOfCustomerEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.optOutOfCustomerEmail = value;
    }
    /**
     * Sets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the postBuffer property.
     */
    public void setPostBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.postBuffer = value;
    }
    /**
     * Sets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the preBuffer property.
     */
    public void setPreBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.preBuffer = value;
    }
    /**
     * Sets the price property value. The regular price for an appointment for the specified bookingService.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Double value) {
        this.price = value;
    }
    /**
     * Sets the priceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the priceType property.
     */
    public void setPriceType(@jakarta.annotation.Nullable final BookingPriceType value) {
        this.priceType = value;
    }
    /**
     * Sets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the reminders property.
     */
    public void setReminders(@jakarta.annotation.Nullable final java.util.List<BookingReminder> value) {
        this.reminders = value;
    }
    /**
     * Sets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1.
     * @param value Value to set for the selfServiceAppointmentId property.
     */
    public void setSelfServiceAppointmentId(@jakarta.annotation.Nullable final String value) {
        this.selfServiceAppointmentId = value;
    }
    /**
     * Sets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.serviceId = value;
    }
    /**
     * Sets the serviceLocation property value. The location where the service is delivered.
     * @param value Value to set for the serviceLocation property.
     */
    public void setServiceLocation(@jakarta.annotation.Nullable final Location value) {
        this.serviceLocation = value;
    }
    /**
     * Sets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the serviceNotes property.
     */
    public void setServiceNotes(@jakarta.annotation.Nullable final String value) {
        this.serviceNotes = value;
    }
    /**
     * Sets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     */
    public void setSmsNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.smsNotificationsEnabled = value;
    }
    /**
     * Sets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @param value Value to set for the staffMemberIds property.
     */
    public void setStaffMemberIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.staffMemberIds = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
}
