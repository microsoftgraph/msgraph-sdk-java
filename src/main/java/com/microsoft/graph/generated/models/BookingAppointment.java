package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a booked appointment of a service by a customer in a business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingAppointment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BookingAppointment} and sets the default values.
     */
    public BookingAppointment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BookingAppointment}
     */
    @jakarta.annotation.Nonnull
    public static BookingAppointment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingAppointment();
    }
    /**
     * Gets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.backingStore.get("additionalInformation");
    }
    /**
     * Gets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAnonymousJoinWebUrl() {
        return this.backingStore.get("anonymousJoinWebUrl");
    }
    /**
     * Gets the appointmentLabel property value. The custom label that can be stamped on this appointment by users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentLabel() {
        return this.backingStore.get("appointmentLabel");
    }
    /**
     * Gets the createdDateTime property value. The date, time, and time zone when the appointment was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customerEmailAddress property value. The SMTP address of the bookingCustomer who books the appointment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerEmailAddress() {
        return this.backingStore.get("customerEmailAddress");
    }
    /**
     * Gets the customerName property value. The customer's name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerName() {
        return this.backingStore.get("customerName");
    }
    /**
     * Gets the customerNotes property value. Notes from the customer associated with this appointment. You can get the value only when you read this bookingAppointment by its ID. You can set this property only when you initially create an appointment with a new customer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerNotes() {
        return this.backingStore.get("customerNotes");
    }
    /**
     * Gets the customerPhone property value. The customer's phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerPhone() {
        return this.backingStore.get("customerPhone");
    }
    /**
     * Gets the customers property value. A collection of customer properties for an appointment. An appointment contains a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @return a {@link java.util.List<BookingCustomerInformationBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCustomerInformationBase> getCustomers() {
        return this.backingStore.get("customers");
    }
    /**
     * Gets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerTimeZone() {
        return this.backingStore.get("customerTimeZone");
    }
    /**
     * Gets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("anonymousJoinWebUrl", (n) -> { this.setAnonymousJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("appointmentLabel", (n) -> { this.setAppointmentLabel(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customerEmailAddress", (n) -> { this.setCustomerEmailAddress(n.getStringValue()); });
        deserializerMap.put("customerName", (n) -> { this.setCustomerName(n.getStringValue()); });
        deserializerMap.put("customerNotes", (n) -> { this.setCustomerNotes(n.getStringValue()); });
        deserializerMap.put("customerPhone", (n) -> { this.setCustomerPhone(n.getStringValue()); });
        deserializerMap.put("customers", (n) -> { this.setCustomers(n.getCollectionOfObjectValues(BookingCustomerInformationBase::createFromDiscriminatorValue)); });
        deserializerMap.put("customerTimeZone", (n) -> { this.setCustomerTimeZone(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("filledAttendeesCount", (n) -> { this.setFilledAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("isCustomerAllowedToManageBooking", (n) -> { this.setIsCustomerAllowedToManageBooking(n.getBooleanValue()); });
        deserializerMap.put("isLocationOnline", (n) -> { this.setIsLocationOnline(n.getBooleanValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("maximumAttendeesCount", (n) -> { this.setMaximumAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("optOutOfCustomerEmail", (n) -> { this.setOptOutOfCustomerEmail(n.getBooleanValue()); });
        deserializerMap.put("postBuffer", (n) -> { this.setPostBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("preBuffer", (n) -> { this.setPreBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getDoubleValue()); });
        deserializerMap.put("priceType", (n) -> { this.setPriceType(n.getEnumValue(BookingPriceType::forValue)); });
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
     * Gets the filledAttendeesCount property value. The current number of customers in the appointment.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFilledAttendeesCount() {
        return this.backingStore.get("filledAttendeesCount");
    }
    /**
     * Gets the isCustomerAllowedToManageBooking property value. Indicates that the customer can manage bookings created by the staff. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomerAllowedToManageBooking() {
        return this.backingStore.get("isCustomerAllowedToManageBooking");
    }
    /**
     * Gets the isLocationOnline property value. Indicates that the appointment is held online. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this.backingStore.get("isLocationOnline");
    }
    /**
     * Gets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.backingStore.get("joinWebUrl");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date, time, and time zone when the booking business was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this.backingStore.get("maximumAttendeesCount");
    }
    /**
     * Gets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment doesn't wish to receive a confirmation for this appointment.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOptOutOfCustomerEmail() {
        return this.backingStore.get("optOutOfCustomerEmail");
    }
    /**
     * Gets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPostBuffer() {
        return this.backingStore.get("postBuffer");
    }
    /**
     * Gets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPreBuffer() {
        return this.backingStore.get("preBuffer");
    }
    /**
     * Gets the price property value. The regular price for an appointment for the specified bookingService.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPrice() {
        return this.backingStore.get("price");
    }
    /**
     * Gets the priceType property value. Represents the type of pricing of a booking service.
     * @return a {@link BookingPriceType}
     */
    @jakarta.annotation.Nullable
    public BookingPriceType getPriceType() {
        return this.backingStore.get("priceType");
    }
    /**
     * Gets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a {@link java.util.List<BookingReminder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingReminder> getReminders() {
        return this.backingStore.get("reminders");
    }
    /**
     * Gets the selfServiceAppointmentId property value. Another tracking ID for the appointment, if the appointment was created directly by the customer on the scheduling page, as opposed to by a staff member on behalf of the customer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSelfServiceAppointmentId() {
        return this.backingStore.get("selfServiceAppointmentId");
    }
    /**
     * Gets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the serviceLocation property value. The location where the service is delivered.
     * @return a {@link Location}
     */
    @jakarta.annotation.Nullable
    public Location getServiceLocation() {
        return this.backingStore.get("serviceLocation");
    }
    /**
     * Gets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it's computed from the service associated with the appointment by the serviceId property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.backingStore.get("serviceName");
    }
    /**
     * Gets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceNotes() {
        return this.backingStore.get("serviceNotes");
    }
    /**
     * Gets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this.backingStore.get("smsNotificationsEnabled");
    }
    /**
     * Gets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this.backingStore.get("staffMemberIds");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.backingStore.get("startDateTime");
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
        writer.writeStringValue("appointmentLabel", this.getAppointmentLabel());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("customerEmailAddress", this.getCustomerEmailAddress());
        writer.writeStringValue("customerName", this.getCustomerName());
        writer.writeStringValue("customerNotes", this.getCustomerNotes());
        writer.writeStringValue("customerPhone", this.getCustomerPhone());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeStringValue("customerTimeZone", this.getCustomerTimeZone());
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeBooleanValue("isCustomerAllowedToManageBooking", this.getIsCustomerAllowedToManageBooking());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
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
        this.backingStore.set("additionalInformation", value);
    }
    /**
     * Sets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @param value Value to set for the anonymousJoinWebUrl property.
     */
    public void setAnonymousJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("anonymousJoinWebUrl", value);
    }
    /**
     * Sets the appointmentLabel property value. The custom label that can be stamped on this appointment by users.
     * @param value Value to set for the appointmentLabel property.
     */
    public void setAppointmentLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appointmentLabel", value);
    }
    /**
     * Sets the createdDateTime property value. The date, time, and time zone when the appointment was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customerEmailAddress property value. The SMTP address of the bookingCustomer who books the appointment.
     * @param value Value to set for the customerEmailAddress property.
     */
    public void setCustomerEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerEmailAddress", value);
    }
    /**
     * Sets the customerName property value. The customer's name.
     * @param value Value to set for the customerName property.
     */
    public void setCustomerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerName", value);
    }
    /**
     * Sets the customerNotes property value. Notes from the customer associated with this appointment. You can get the value only when you read this bookingAppointment by its ID. You can set this property only when you initially create an appointment with a new customer.
     * @param value Value to set for the customerNotes property.
     */
    public void setCustomerNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerNotes", value);
    }
    /**
     * Sets the customerPhone property value. The customer's phone number.
     * @param value Value to set for the customerPhone property.
     */
    public void setCustomerPhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerPhone", value);
    }
    /**
     * Sets the customers property value. A collection of customer properties for an appointment. An appointment contains a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @param value Value to set for the customers property.
     */
    public void setCustomers(@jakarta.annotation.Nullable final java.util.List<BookingCustomerInformationBase> value) {
        this.backingStore.set("customers", value);
    }
    /**
     * Sets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the customerTimeZone property.
     */
    public void setCustomerTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerTimeZone", value);
    }
    /**
     * Sets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the filledAttendeesCount property value. The current number of customers in the appointment.
     * @param value Value to set for the filledAttendeesCount property.
     */
    public void setFilledAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("filledAttendeesCount", value);
    }
    /**
     * Sets the isCustomerAllowedToManageBooking property value. Indicates that the customer can manage bookings created by the staff. The default value is false.
     * @param value Value to set for the isCustomerAllowedToManageBooking property.
     */
    public void setIsCustomerAllowedToManageBooking(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCustomerAllowedToManageBooking", value);
    }
    /**
     * Sets the isLocationOnline property value. Indicates that the appointment is held online. The default value is false.
     * @param value Value to set for the isLocationOnline property.
     */
    public void setIsLocationOnline(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLocationOnline", value);
    }
    /**
     * Sets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joinWebUrl", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date, time, and time zone when the booking business was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     */
    public void setMaximumAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumAttendeesCount", value);
    }
    /**
     * Sets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment doesn't wish to receive a confirmation for this appointment.
     * @param value Value to set for the optOutOfCustomerEmail property.
     */
    public void setOptOutOfCustomerEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("optOutOfCustomerEmail", value);
    }
    /**
     * Sets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the postBuffer property.
     */
    public void setPostBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("postBuffer", value);
    }
    /**
     * Sets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the preBuffer property.
     */
    public void setPreBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("preBuffer", value);
    }
    /**
     * Sets the price property value. The regular price for an appointment for the specified bookingService.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("price", value);
    }
    /**
     * Sets the priceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the priceType property.
     */
    public void setPriceType(@jakarta.annotation.Nullable final BookingPriceType value) {
        this.backingStore.set("priceType", value);
    }
    /**
     * Sets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the reminders property.
     */
    public void setReminders(@jakarta.annotation.Nullable final java.util.List<BookingReminder> value) {
        this.backingStore.set("reminders", value);
    }
    /**
     * Sets the selfServiceAppointmentId property value. Another tracking ID for the appointment, if the appointment was created directly by the customer on the scheduling page, as opposed to by a staff member on behalf of the customer.
     * @param value Value to set for the selfServiceAppointmentId property.
     */
    public void setSelfServiceAppointmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("selfServiceAppointmentId", value);
    }
    /**
     * Sets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the serviceLocation property value. The location where the service is delivered.
     * @param value Value to set for the serviceLocation property.
     */
    public void setServiceLocation(@jakarta.annotation.Nullable final Location value) {
        this.backingStore.set("serviceLocation", value);
    }
    /**
     * Sets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it's computed from the service associated with the appointment by the serviceId property.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceName", value);
    }
    /**
     * Sets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the serviceNotes property.
     */
    public void setServiceNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceNotes", value);
    }
    /**
     * Sets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     */
    public void setSmsNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smsNotificationsEnabled", value);
    }
    /**
     * Sets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @param value Value to set for the staffMemberIds property.
     */
    public void setStaffMemberIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("staffMemberIds", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("startDateTime", value);
    }
}
