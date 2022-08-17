package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingAppointment extends Entity implements Parsable {
    /** Additional information that is sent to the customer when an appointment is confirmed. */
    private String _additionalInformation;
    /** It lists down the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional. */
    private java.util.List<BookingCustomerInformationBase> _customers;
    /** The time zone of the customer. For a list of possible values, see dateTimeTimeZone. */
    private String _customerTimeZone;
    /** The length of the appointment, denoted in ISO8601 format. */
    private Period _duration;
    /** The endDateTime property */
    private DateTimeTimeZone _endDateTime;
    /** The current number of customers in the appointment */
    private Integer _filledAttendeesCount;
    /** If true, indicates that the appointment will be held online. Default value is false. */
    private Boolean _isLocationOnline;
    /** The URL of the online meeting for the appointment. */
    private String _joinWebUrl;
    /** The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation. */
    private Integer _maximumAttendeesCount;
    /** If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment. */
    private Boolean _optOutOfCustomerEmail;
    /** The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format. */
    private Period _postBuffer;
    /** The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format. */
    private Period _preBuffer;
    /** The regular price for an appointment for the specified bookingService. */
    private Double _price;
    /** Represents the type of pricing of a booking service. */
    private BookingPriceType _priceType;
    /** The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID. */
    private java.util.List<BookingReminder> _reminders;
    /** An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1. */
    private String _selfServiceAppointmentId;
    /** The ID of the bookingService associated with this appointment. */
    private String _serviceId;
    /** The location where the service is delivered. */
    private Location _serviceLocation;
    /** The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property. */
    private String _serviceName;
    /** Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID. */
    private String _serviceNotes;
    /** If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false. */
    private Boolean _smsNotificationsEnabled;
    /** The ID of each bookingStaffMember who is scheduled in this appointment. */
    private java.util.List<String> _staffMemberIds;
    /** The startDateTime property */
    private DateTimeTimeZone _startDateTime;
    /**
     * Instantiates a new BookingAppointment and sets the default values.
     * @return a void
     */
    public BookingAppointment() {
        super();
        this.setOdataType("#microsoft.graph.bookingAppointment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingAppointment
     */
    @javax.annotation.Nonnull
    public static BookingAppointment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingAppointment();
    }
    /**
     * Gets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the customers property value. It lists down the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @return a bookingCustomerInformationBase
     */
    @javax.annotation.Nullable
    public java.util.List<BookingCustomerInformationBase> getCustomers() {
        return this._customers;
    }
    /**
     * Gets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerTimeZone() {
        return this._customerTimeZone;
    }
    /**
     * Gets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDuration() {
        return this._duration;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingAppointment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("additionalInformation", (n) -> { currentObject.setAdditionalInformation(n.getStringValue()); });
            this.put("customers", (n) -> { currentObject.setCustomers(n.getCollectionOfObjectValues(BookingCustomerInformationBase::createFromDiscriminatorValue)); });
            this.put("customerTimeZone", (n) -> { currentObject.setCustomerTimeZone(n.getStringValue()); });
            this.put("duration", (n) -> { currentObject.setDuration(n.getPeriodValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("filledAttendeesCount", (n) -> { currentObject.setFilledAttendeesCount(n.getIntegerValue()); });
            this.put("isLocationOnline", (n) -> { currentObject.setIsLocationOnline(n.getBooleanValue()); });
            this.put("joinWebUrl", (n) -> { currentObject.setJoinWebUrl(n.getStringValue()); });
            this.put("maximumAttendeesCount", (n) -> { currentObject.setMaximumAttendeesCount(n.getIntegerValue()); });
            this.put("optOutOfCustomerEmail", (n) -> { currentObject.setOptOutOfCustomerEmail(n.getBooleanValue()); });
            this.put("postBuffer", (n) -> { currentObject.setPostBuffer(n.getPeriodValue()); });
            this.put("preBuffer", (n) -> { currentObject.setPreBuffer(n.getPeriodValue()); });
            this.put("price", (n) -> { currentObject.setPrice(n.getDoubleValue()); });
            this.put("priceType", (n) -> { currentObject.setPriceType(n.getEnumValue(BookingPriceType.class)); });
            this.put("reminders", (n) -> { currentObject.setReminders(n.getCollectionOfObjectValues(BookingReminder::createFromDiscriminatorValue)); });
            this.put("selfServiceAppointmentId", (n) -> { currentObject.setSelfServiceAppointmentId(n.getStringValue()); });
            this.put("serviceId", (n) -> { currentObject.setServiceId(n.getStringValue()); });
            this.put("serviceLocation", (n) -> { currentObject.setServiceLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
            this.put("serviceName", (n) -> { currentObject.setServiceName(n.getStringValue()); });
            this.put("serviceNotes", (n) -> { currentObject.setServiceNotes(n.getStringValue()); });
            this.put("smsNotificationsEnabled", (n) -> { currentObject.setSmsNotificationsEnabled(n.getBooleanValue()); });
            this.put("staffMemberIds", (n) -> { currentObject.setStaffMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the filledAttendeesCount property value. The current number of customers in the appointment
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFilledAttendeesCount() {
        return this._filledAttendeesCount;
    }
    /**
     * Gets the isLocationOnline property value. If true, indicates that the appointment will be held online. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this._isLocationOnline;
    }
    /**
     * Gets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this._joinWebUrl;
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this._maximumAttendeesCount;
    }
    /**
     * Gets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOptOutOfCustomerEmail() {
        return this._optOutOfCustomerEmail;
    }
    /**
     * Gets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPostBuffer() {
        return this._postBuffer;
    }
    /**
     * Gets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPreBuffer() {
        return this._preBuffer;
    }
    /**
     * Gets the price property value. The regular price for an appointment for the specified bookingService.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getPrice() {
        return this._price;
    }
    /**
     * Gets the priceType property value. Represents the type of pricing of a booking service.
     * @return a bookingPriceType
     */
    @javax.annotation.Nullable
    public BookingPriceType getPriceType() {
        return this._priceType;
    }
    /**
     * Gets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a bookingReminder
     */
    @javax.annotation.Nullable
    public java.util.List<BookingReminder> getReminders() {
        return this._reminders;
    }
    /**
     * Gets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSelfServiceAppointmentId() {
        return this._selfServiceAppointmentId;
    }
    /**
     * Gets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this._serviceId;
    }
    /**
     * Gets the serviceLocation property value. The location where the service is delivered.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getServiceLocation() {
        return this._serviceLocation;
    }
    /**
     * Gets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this._serviceName;
    }
    /**
     * Gets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceNotes() {
        return this._serviceNotes;
    }
    /**
     * Gets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this._smsNotificationsEnabled;
    }
    /**
     * Gets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this._staffMemberIds;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeStringValue("customerTimeZone", this.getCustomerTimeZone());
        writer.writePeriodValue("duration", this.getDuration());
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeIntegerValue("filledAttendeesCount", this.getFilledAttendeesCount());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeIntegerValue("maximumAttendeesCount", this.getMaximumAttendeesCount());
        writer.writeBooleanValue("optOutOfCustomerEmail", this.getOptOutOfCustomerEmail());
        writer.writePeriodValue("postBuffer", this.getPostBuffer());
        writer.writePeriodValue("preBuffer", this.getPreBuffer());
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
     * @return a void
     */
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the customers property value. It lists down the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @param value Value to set for the customers property.
     * @return a void
     */
    public void setCustomers(@javax.annotation.Nullable final java.util.List<BookingCustomerInformationBase> value) {
        this._customers = value;
    }
    /**
     * Sets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the customerTimeZone property.
     * @return a void
     */
    public void setCustomerTimeZone(@javax.annotation.Nullable final String value) {
        this._customerTimeZone = value;
    }
    /**
     * Sets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @param value Value to set for the duration property.
     * @return a void
     */
    public void setDuration(@javax.annotation.Nullable final Period value) {
        this._duration = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._endDateTime = value;
    }
    /**
     * Sets the filledAttendeesCount property value. The current number of customers in the appointment
     * @param value Value to set for the filledAttendeesCount property.
     * @return a void
     */
    public void setFilledAttendeesCount(@javax.annotation.Nullable final Integer value) {
        this._filledAttendeesCount = value;
    }
    /**
     * Sets the isLocationOnline property value. If true, indicates that the appointment will be held online. Default value is false.
     * @param value Value to set for the isLocationOnline property.
     * @return a void
     */
    public void setIsLocationOnline(@javax.annotation.Nullable final Boolean value) {
        this._isLocationOnline = value;
    }
    /**
     * Sets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._joinWebUrl = value;
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     * @return a void
     */
    public void setMaximumAttendeesCount(@javax.annotation.Nullable final Integer value) {
        this._maximumAttendeesCount = value;
    }
    /**
     * Sets the optOutOfCustomerEmail property value. If true indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @param value Value to set for the optOutOfCustomerEmail property.
     * @return a void
     */
    public void setOptOutOfCustomerEmail(@javax.annotation.Nullable final Boolean value) {
        this._optOutOfCustomerEmail = value;
    }
    /**
     * Sets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the postBuffer property.
     * @return a void
     */
    public void setPostBuffer(@javax.annotation.Nullable final Period value) {
        this._postBuffer = value;
    }
    /**
     * Sets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the preBuffer property.
     * @return a void
     */
    public void setPreBuffer(@javax.annotation.Nullable final Period value) {
        this._preBuffer = value;
    }
    /**
     * Sets the price property value. The regular price for an appointment for the specified bookingService.
     * @param value Value to set for the price property.
     * @return a void
     */
    public void setPrice(@javax.annotation.Nullable final Double value) {
        this._price = value;
    }
    /**
     * Sets the priceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the priceType property.
     * @return a void
     */
    public void setPriceType(@javax.annotation.Nullable final BookingPriceType value) {
        this._priceType = value;
    }
    /**
     * Sets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the reminders property.
     * @return a void
     */
    public void setReminders(@javax.annotation.Nullable final java.util.List<BookingReminder> value) {
        this._reminders = value;
    }
    /**
     * Sets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer. Only supported for appointment if maxAttendeeCount is 1.
     * @param value Value to set for the selfServiceAppointmentId property.
     * @return a void
     */
    public void setSelfServiceAppointmentId(@javax.annotation.Nullable final String value) {
        this._selfServiceAppointmentId = value;
    }
    /**
     * Sets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this._serviceId = value;
    }
    /**
     * Sets the serviceLocation property value. The location where the service is delivered.
     * @param value Value to set for the serviceLocation property.
     * @return a void
     */
    public void setServiceLocation(@javax.annotation.Nullable final Location value) {
        this._serviceLocation = value;
    }
    /**
     * Sets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this._serviceName = value;
    }
    /**
     * Sets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the serviceNotes property.
     * @return a void
     */
    public void setServiceNotes(@javax.annotation.Nullable final String value) {
        this._serviceNotes = value;
    }
    /**
     * Sets the smsNotificationsEnabled property value. If true, indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     * @return a void
     */
    public void setSmsNotificationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smsNotificationsEnabled = value;
    }
    /**
     * Sets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @param value Value to set for the staffMemberIds property.
     * @return a void
     */
    public void setStaffMemberIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._staffMemberIds = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startDateTime = value;
    }
}
