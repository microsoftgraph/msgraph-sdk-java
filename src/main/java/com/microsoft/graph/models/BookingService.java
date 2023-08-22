package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a particular service offered by a booking business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingService extends Entity implements Parsable {
    /**
     * Additional information that is sent to the customer when an appointment is confirmed.
     */
    private String additionalInformation;
    /**
     * Contains the set of custom questions associated with a particular service.
     */
    private java.util.List<BookingQuestionAssignment> customQuestions;
    /**
     * The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     */
    private PeriodAndDuration defaultDuration;
    /**
     * The default physical location for the service.
     */
    private Location defaultLocation;
    /**
     * The default monetary price for the service.
     */
    private Double defaultPrice;
    /**
     * Represents the type of pricing of a booking service.
     */
    private BookingPriceType defaultPriceType;
    /**
     * The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID.
     */
    private java.util.List<BookingReminder> defaultReminders;
    /**
     * A text description for the service.
     */
    private String description;
    /**
     * A service name.
     */
    private String displayName;
    /**
     * True if the URL to join the appointment anonymously (anonymousJoinWebUrl) will be generated for the appointment booked for this service.
     */
    private Boolean isAnonymousJoinEnabled;
    /**
     * True means this service is not available to customers for booking.
     */
    private Boolean isHiddenFromCustomers;
    /**
     * True indicates that the appointments for the service will be held online. Default value is false.
     */
    private Boolean isLocationOnline;
    /**
     * The language of the self-service booking page.
     */
    private String languageTag;
    /**
     * The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     */
    private Integer maximumAttendeesCount;
    /**
     * Additional information about this service.
     */
    private String notes;
    /**
     * The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     */
    private PeriodAndDuration postBuffer;
    /**
     * The time to buffer before an appointment for this service can start.
     */
    private PeriodAndDuration preBuffer;
    /**
     * The set of policies that determine how appointments for this type of service should be created and managed.
     */
    private BookingSchedulingPolicy schedulingPolicy;
    /**
     * True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false.
     */
    private Boolean smsNotificationsEnabled;
    /**
     * Represents those staff members who provide this service.
     */
    private java.util.List<String> staffMemberIds;
    /**
     * The URL a customer uses to access the service.
     */
    private String webUrl;
    /**
     * Instantiates a new bookingService and sets the default values.
     */
    public BookingService() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingService
     */
    @jakarta.annotation.Nonnull
    public static BookingService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingService();
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
     * Gets the customQuestions property value. Contains the set of custom questions associated with a particular service.
     * @return a bookingQuestionAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingQuestionAssignment> getCustomQuestions() {
        return this.customQuestions;
    }
    /**
     * Gets the defaultDuration property value. The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDefaultDuration() {
        return this.defaultDuration;
    }
    /**
     * Gets the defaultLocation property value. The default physical location for the service.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public Location getDefaultLocation() {
        return this.defaultLocation;
    }
    /**
     * Gets the defaultPrice property value. The default monetary price for the service.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getDefaultPrice() {
        return this.defaultPrice;
    }
    /**
     * Gets the defaultPriceType property value. Represents the type of pricing of a booking service.
     * @return a bookingPriceType
     */
    @jakarta.annotation.Nullable
    public BookingPriceType getDefaultPriceType() {
        return this.defaultPriceType;
    }
    /**
     * Gets the defaultReminders property value. The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID.
     * @return a bookingReminder
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingReminder> getDefaultReminders() {
        return this.defaultReminders;
    }
    /**
     * Gets the description property value. A text description for the service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. A service name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("customQuestions", (n) -> { this.setCustomQuestions(n.getCollectionOfObjectValues(BookingQuestionAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultDuration", (n) -> { this.setDefaultDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("defaultLocation", (n) -> { this.setDefaultLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultPrice", (n) -> { this.setDefaultPrice(n.getDoubleValue()); });
        deserializerMap.put("defaultPriceType", (n) -> { this.setDefaultPriceType(n.getEnumValue(BookingPriceType.class)); });
        deserializerMap.put("defaultReminders", (n) -> { this.setDefaultReminders(n.getCollectionOfObjectValues(BookingReminder::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isAnonymousJoinEnabled", (n) -> { this.setIsAnonymousJoinEnabled(n.getBooleanValue()); });
        deserializerMap.put("isHiddenFromCustomers", (n) -> { this.setIsHiddenFromCustomers(n.getBooleanValue()); });
        deserializerMap.put("isLocationOnline", (n) -> { this.setIsLocationOnline(n.getBooleanValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("maximumAttendeesCount", (n) -> { this.setMaximumAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("postBuffer", (n) -> { this.setPostBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("preBuffer", (n) -> { this.setPreBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("schedulingPolicy", (n) -> { this.setSchedulingPolicy(n.getObjectValue(BookingSchedulingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("smsNotificationsEnabled", (n) -> { this.setSmsNotificationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("staffMemberIds", (n) -> { this.setStaffMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAnonymousJoinEnabled property value. True if the URL to join the appointment anonymously (anonymousJoinWebUrl) will be generated for the appointment booked for this service.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAnonymousJoinEnabled() {
        return this.isAnonymousJoinEnabled;
    }
    /**
     * Gets the isHiddenFromCustomers property value. True means this service is not available to customers for booking.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHiddenFromCustomers() {
        return this.isHiddenFromCustomers;
    }
    /**
     * Gets the isLocationOnline property value. True indicates that the appointments for the service will be held online. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this.isLocationOnline;
    }
    /**
     * Gets the languageTag property value. The language of the self-service booking page.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this.maximumAttendeesCount;
    }
    /**
     * Gets the notes property value. Additional information about this service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the postBuffer property value. The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPostBuffer() {
        return this.postBuffer;
    }
    /**
     * Gets the preBuffer property value. The time to buffer before an appointment for this service can start.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPreBuffer() {
        return this.preBuffer;
    }
    /**
     * Gets the schedulingPolicy property value. The set of policies that determine how appointments for this type of service should be created and managed.
     * @return a bookingSchedulingPolicy
     */
    @jakarta.annotation.Nullable
    public BookingSchedulingPolicy getSchedulingPolicy() {
        return this.schedulingPolicy;
    }
    /**
     * Gets the smsNotificationsEnabled property value. True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this.smsNotificationsEnabled;
    }
    /**
     * Gets the staffMemberIds property value. Represents those staff members who provide this service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this.staffMemberIds;
    }
    /**
     * Gets the webUrl property value. The URL a customer uses to access the service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeCollectionOfObjectValues("customQuestions", this.getCustomQuestions());
        writer.writePeriodAndDurationValue("defaultDuration", this.getDefaultDuration());
        writer.writeObjectValue("defaultLocation", this.getDefaultLocation());
        writer.writeDoubleValue("defaultPrice", this.getDefaultPrice());
        writer.writeEnumValue("defaultPriceType", this.getDefaultPriceType());
        writer.writeCollectionOfObjectValues("defaultReminders", this.getDefaultReminders());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAnonymousJoinEnabled", this.getIsAnonymousJoinEnabled());
        writer.writeBooleanValue("isHiddenFromCustomers", this.getIsHiddenFromCustomers());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeIntegerValue("maximumAttendeesCount", this.getMaximumAttendeesCount());
        writer.writeStringValue("notes", this.getNotes());
        writer.writePeriodAndDurationValue("postBuffer", this.getPostBuffer());
        writer.writePeriodAndDurationValue("preBuffer", this.getPreBuffer());
        writer.writeObjectValue("schedulingPolicy", this.getSchedulingPolicy());
        writer.writeBooleanValue("smsNotificationsEnabled", this.getSmsNotificationsEnabled());
        writer.writeCollectionOfPrimitiveValues("staffMemberIds", this.getStaffMemberIds());
    }
    /**
     * Sets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the customQuestions property value. Contains the set of custom questions associated with a particular service.
     * @param value Value to set for the customQuestions property.
     */
    public void setCustomQuestions(@jakarta.annotation.Nullable final java.util.List<BookingQuestionAssignment> value) {
        this.customQuestions = value;
    }
    /**
     * Sets the defaultDuration property value. The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     * @param value Value to set for the defaultDuration property.
     */
    public void setDefaultDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.defaultDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the defaultLocation property value. The default physical location for the service.
     * @param value Value to set for the defaultLocation property.
     */
    public void setDefaultLocation(@jakarta.annotation.Nullable final Location value) {
        this.defaultLocation = value;
    }
    /**
     * Sets the defaultPrice property value. The default monetary price for the service.
     * @param value Value to set for the defaultPrice property.
     */
    public void setDefaultPrice(@jakarta.annotation.Nullable final Double value) {
        this.defaultPrice = value;
    }
    /**
     * Sets the defaultPriceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the defaultPriceType property.
     */
    public void setDefaultPriceType(@jakarta.annotation.Nullable final BookingPriceType value) {
        this.defaultPriceType = value;
    }
    /**
     * Sets the defaultReminders property value. The default set of reminders for an appointment of this service. The value of this property is available only when reading this bookingService by its ID.
     * @param value Value to set for the defaultReminders property.
     */
    public void setDefaultReminders(@jakarta.annotation.Nullable final java.util.List<BookingReminder> value) {
        this.defaultReminders = value;
    }
    /**
     * Sets the description property value. A text description for the service.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. A service name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isAnonymousJoinEnabled property value. True if the URL to join the appointment anonymously (anonymousJoinWebUrl) will be generated for the appointment booked for this service.
     * @param value Value to set for the isAnonymousJoinEnabled property.
     */
    public void setIsAnonymousJoinEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isAnonymousJoinEnabled = value;
    }
    /**
     * Sets the isHiddenFromCustomers property value. True means this service is not available to customers for booking.
     * @param value Value to set for the isHiddenFromCustomers property.
     */
    public void setIsHiddenFromCustomers(@jakarta.annotation.Nullable final Boolean value) {
        this.isHiddenFromCustomers = value;
    }
    /**
     * Sets the isLocationOnline property value. True indicates that the appointments for the service will be held online. Default value is false.
     * @param value Value to set for the isLocationOnline property.
     */
    public void setIsLocationOnline(@jakarta.annotation.Nullable final Boolean value) {
        this.isLocationOnline = value;
    }
    /**
     * Sets the languageTag property value. The language of the self-service booking page.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in a service. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     */
    public void setMaximumAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.maximumAttendeesCount = value;
    }
    /**
     * Sets the notes property value. Additional information about this service.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the postBuffer property value. The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     * @param value Value to set for the postBuffer property.
     */
    public void setPostBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.postBuffer = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the preBuffer property value. The time to buffer before an appointment for this service can start.
     * @param value Value to set for the preBuffer property.
     */
    public void setPreBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.preBuffer = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the schedulingPolicy property value. The set of policies that determine how appointments for this type of service should be created and managed.
     * @param value Value to set for the schedulingPolicy property.
     */
    public void setSchedulingPolicy(@jakarta.annotation.Nullable final BookingSchedulingPolicy value) {
        this.schedulingPolicy = value;
    }
    /**
     * Sets the smsNotificationsEnabled property value. True indicates SMS notifications can be sent to the customers for the appointment of the service. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     */
    public void setSmsNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.smsNotificationsEnabled = value;
    }
    /**
     * Sets the staffMemberIds property value. Represents those staff members who provide this service.
     * @param value Value to set for the staffMemberIds property.
     */
    public void setStaffMemberIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.staffMemberIds = value;
    }
    /**
     * Sets the webUrl property value. The URL a customer uses to access the service.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
