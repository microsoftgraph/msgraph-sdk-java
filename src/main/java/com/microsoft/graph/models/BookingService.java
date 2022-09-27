package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a particular service offered by a booking business. */
public class BookingService extends Entity implements Parsable {
    /** Additional information that is sent to the customer when an appointment is confirmed. */
    private String _additionalInformation;
    /** Contains the set of custom questions associated with a particular service. */
    private java.util.List<BookingQuestionAssignment> _customQuestions;
    /** The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S. */
    private Period _defaultDuration;
    /** The default physical location for the service. */
    private Location _defaultLocation;
    /** The default monetary price for the service. */
    private Double _defaultPrice;
    /** Represents the type of pricing of a booking service. */
    private BookingPriceType _defaultPriceType;
    /** The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID. */
    private java.util.List<BookingReminder> _defaultReminders;
    /** A text description for the service. */
    private String _description;
    /** A service name. */
    private String _displayName;
    /** True means this service is not available to customers for booking. */
    private Boolean _isHiddenFromCustomers;
    /** True indicates that the appointments for the service will be held online. Default value is false. */
    private Boolean _isLocationOnline;
    /** The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation. */
    private Integer _maximumAttendeesCount;
    /** Additional information about this service. */
    private String _notes;
    /** The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked. */
    private Period _postBuffer;
    /** The time to buffer before an appointment for this service can start. */
    private Period _preBuffer;
    /** The set of policies that determine how appointments for this type of service should be created and managed. */
    private BookingSchedulingPolicy _schedulingPolicy;
    /** True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false. */
    private Boolean _smsNotificationsEnabled;
    /** Represents those staff members who provide this service. */
    private java.util.List<String> _staffMemberIds;
    /** The URL a customer uses to access the service. */
    private String _webUrl;
    /**
     * Instantiates a new bookingService and sets the default values.
     * @return a void
     */
    public BookingService() {
        super();
        this.setOdataType("#microsoft.graph.bookingService");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingService
     */
    @javax.annotation.Nonnull
    public static BookingService createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingService();
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
     * Gets the customQuestions property value. Contains the set of custom questions associated with a particular service.
     * @return a bookingQuestionAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<BookingQuestionAssignment> getCustomQuestions() {
        return this._customQuestions;
    }
    /**
     * Gets the defaultDuration property value. The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDefaultDuration() {
        return this._defaultDuration;
    }
    /**
     * Gets the defaultLocation property value. The default physical location for the service.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getDefaultLocation() {
        return this._defaultLocation;
    }
    /**
     * Gets the defaultPrice property value. The default monetary price for the service.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getDefaultPrice() {
        return this._defaultPrice;
    }
    /**
     * Gets the defaultPriceType property value. Represents the type of pricing of a booking service.
     * @return a bookingPriceType
     */
    @javax.annotation.Nullable
    public BookingPriceType getDefaultPriceType() {
        return this._defaultPriceType;
    }
    /**
     * Gets the defaultReminders property value. The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID.
     * @return a bookingReminder
     */
    @javax.annotation.Nullable
    public java.util.List<BookingReminder> getDefaultReminders() {
        return this._defaultReminders;
    }
    /**
     * Gets the description property value. A text description for the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. A service name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingService currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("additionalInformation", (n) -> { currentObject.setAdditionalInformation(n.getStringValue()); });
            this.put("customQuestions", (n) -> { currentObject.setCustomQuestions(n.getCollectionOfObjectValues(BookingQuestionAssignment::createFromDiscriminatorValue)); });
            this.put("defaultDuration", (n) -> { currentObject.setDefaultDuration(n.getPeriodValue()); });
            this.put("defaultLocation", (n) -> { currentObject.setDefaultLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
            this.put("defaultPrice", (n) -> { currentObject.setDefaultPrice(n.getDoubleValue()); });
            this.put("defaultPriceType", (n) -> { currentObject.setDefaultPriceType(n.getEnumValue(BookingPriceType.class)); });
            this.put("defaultReminders", (n) -> { currentObject.setDefaultReminders(n.getCollectionOfObjectValues(BookingReminder::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isHiddenFromCustomers", (n) -> { currentObject.setIsHiddenFromCustomers(n.getBooleanValue()); });
            this.put("isLocationOnline", (n) -> { currentObject.setIsLocationOnline(n.getBooleanValue()); });
            this.put("maximumAttendeesCount", (n) -> { currentObject.setMaximumAttendeesCount(n.getIntegerValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("postBuffer", (n) -> { currentObject.setPostBuffer(n.getPeriodValue()); });
            this.put("preBuffer", (n) -> { currentObject.setPreBuffer(n.getPeriodValue()); });
            this.put("schedulingPolicy", (n) -> { currentObject.setSchedulingPolicy(n.getObjectValue(BookingSchedulingPolicy::createFromDiscriminatorValue)); });
            this.put("smsNotificationsEnabled", (n) -> { currentObject.setSmsNotificationsEnabled(n.getBooleanValue()); });
            this.put("staffMemberIds", (n) -> { currentObject.setStaffMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isHiddenFromCustomers property value. True means this service is not available to customers for booking.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHiddenFromCustomers() {
        return this._isHiddenFromCustomers;
    }
    /**
     * Gets the isLocationOnline property value. True indicates that the appointments for the service will be held online. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this._isLocationOnline;
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this._maximumAttendeesCount;
    }
    /**
     * Gets the notes property value. Additional information about this service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the postBuffer property value. The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPostBuffer() {
        return this._postBuffer;
    }
    /**
     * Gets the preBuffer property value. The time to buffer before an appointment for this service can start.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPreBuffer() {
        return this._preBuffer;
    }
    /**
     * Gets the schedulingPolicy property value. The set of policies that determine how appointments for this type of service should be created and managed.
     * @return a bookingSchedulingPolicy
     */
    @javax.annotation.Nullable
    public BookingSchedulingPolicy getSchedulingPolicy() {
        return this._schedulingPolicy;
    }
    /**
     * Gets the smsNotificationsEnabled property value. True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this._smsNotificationsEnabled;
    }
    /**
     * Gets the staffMemberIds property value. Represents those staff members who provide this service.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this._staffMemberIds;
    }
    /**
     * Gets the webUrl property value. The URL a customer uses to access the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
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
        writer.writeCollectionOfObjectValues("customQuestions", this.getCustomQuestions());
        writer.writePeriodValue("defaultDuration", this.getDefaultDuration());
        writer.writeObjectValue("defaultLocation", this.getDefaultLocation());
        writer.writeDoubleValue("defaultPrice", this.getDefaultPrice());
        writer.writeEnumValue("defaultPriceType", this.getDefaultPriceType());
        writer.writeCollectionOfObjectValues("defaultReminders", this.getDefaultReminders());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isHiddenFromCustomers", this.getIsHiddenFromCustomers());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeIntegerValue("maximumAttendeesCount", this.getMaximumAttendeesCount());
        writer.writeStringValue("notes", this.getNotes());
        writer.writePeriodValue("postBuffer", this.getPostBuffer());
        writer.writePeriodValue("preBuffer", this.getPreBuffer());
        writer.writeObjectValue("schedulingPolicy", this.getSchedulingPolicy());
        writer.writeBooleanValue("smsNotificationsEnabled", this.getSmsNotificationsEnabled());
        writer.writeCollectionOfPrimitiveValues("staffMemberIds", this.getStaffMemberIds());
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
     * Sets the customQuestions property value. Contains the set of custom questions associated with a particular service.
     * @param value Value to set for the customQuestions property.
     * @return a void
     */
    public void setCustomQuestions(@javax.annotation.Nullable final java.util.List<BookingQuestionAssignment> value) {
        this._customQuestions = value;
    }
    /**
     * Sets the defaultDuration property value. The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     * @param value Value to set for the defaultDuration property.
     * @return a void
     */
    public void setDefaultDuration(@javax.annotation.Nullable final Period value) {
        this._defaultDuration = value;
    }
    /**
     * Sets the defaultLocation property value. The default physical location for the service.
     * @param value Value to set for the defaultLocation property.
     * @return a void
     */
    public void setDefaultLocation(@javax.annotation.Nullable final Location value) {
        this._defaultLocation = value;
    }
    /**
     * Sets the defaultPrice property value. The default monetary price for the service.
     * @param value Value to set for the defaultPrice property.
     * @return a void
     */
    public void setDefaultPrice(@javax.annotation.Nullable final Double value) {
        this._defaultPrice = value;
    }
    /**
     * Sets the defaultPriceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the defaultPriceType property.
     * @return a void
     */
    public void setDefaultPriceType(@javax.annotation.Nullable final BookingPriceType value) {
        this._defaultPriceType = value;
    }
    /**
     * Sets the defaultReminders property value. The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID.
     * @param value Value to set for the defaultReminders property.
     * @return a void
     */
    public void setDefaultReminders(@javax.annotation.Nullable final java.util.List<BookingReminder> value) {
        this._defaultReminders = value;
    }
    /**
     * Sets the description property value. A text description for the service.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. A service name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isHiddenFromCustomers property value. True means this service is not available to customers for booking.
     * @param value Value to set for the isHiddenFromCustomers property.
     * @return a void
     */
    public void setIsHiddenFromCustomers(@javax.annotation.Nullable final Boolean value) {
        this._isHiddenFromCustomers = value;
    }
    /**
     * Sets the isLocationOnline property value. True indicates that the appointments for the service will be held online. Default value is false.
     * @param value Value to set for the isLocationOnline property.
     * @return a void
     */
    public void setIsLocationOnline(@javax.annotation.Nullable final Boolean value) {
        this._isLocationOnline = value;
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     * @return a void
     */
    public void setMaximumAttendeesCount(@javax.annotation.Nullable final Integer value) {
        this._maximumAttendeesCount = value;
    }
    /**
     * Sets the notes property value. Additional information about this service.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the postBuffer property value. The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     * @param value Value to set for the postBuffer property.
     * @return a void
     */
    public void setPostBuffer(@javax.annotation.Nullable final Period value) {
        this._postBuffer = value;
    }
    /**
     * Sets the preBuffer property value. The time to buffer before an appointment for this service can start.
     * @param value Value to set for the preBuffer property.
     * @return a void
     */
    public void setPreBuffer(@javax.annotation.Nullable final Period value) {
        this._preBuffer = value;
    }
    /**
     * Sets the schedulingPolicy property value. The set of policies that determine how appointments for this type of service should be created and managed.
     * @param value Value to set for the schedulingPolicy property.
     * @return a void
     */
    public void setSchedulingPolicy(@javax.annotation.Nullable final BookingSchedulingPolicy value) {
        this._schedulingPolicy = value;
    }
    /**
     * Sets the smsNotificationsEnabled property value. True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     * @return a void
     */
    public void setSmsNotificationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._smsNotificationsEnabled = value;
    }
    /**
     * Sets the staffMemberIds property value. Represents those staff members who provide this service.
     * @param value Value to set for the staffMemberIds property.
     * @return a void
     */
    public void setStaffMemberIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._staffMemberIds = value;
    }
    /**
     * Sets the webUrl property value. The URL a customer uses to access the service.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
