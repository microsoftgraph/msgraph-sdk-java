package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a staff member who provides services in a business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingStaffMember extends BookingStaffMemberBase implements Parsable {
    /**
     * Instantiates a new BookingStaffMember and sets the default values.
     */
    public BookingStaffMember() {
        super();
        this.setOdataType("#microsoft.graph.bookingStaffMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingStaffMember
     */
    @jakarta.annotation.Nonnull
    public static BookingStaffMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingStaffMember();
    }
    /**
     * Gets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAvailabilityIsAffectedByPersonalCalendar() {
        return this.backingStore.get("availabilityIsAffectedByPersonalCalendar");
    }
    /**
     * Gets the displayName property value. The name of the staff member, as displayed to customers. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailAddress property value. The email address of the staff member. This can be in the same Microsoft 365 tenant as the business, or in a different email domain. This email address can be used if the sendConfirmationsToOwner property is set to true in the scheduling policy of the business. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityIsAffectedByPersonalCalendar", (n) -> { this.setAvailabilityIsAffectedByPersonalCalendar(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("isEmailNotificationEnabled", (n) -> { this.setIsEmailNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BookingStaffRole::forValue)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("useBusinessHours", (n) -> { this.setUseBusinessHours(n.getBooleanValue()); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEmailNotificationEnabled property value. True indicates that a staff member will be notified via email when a booking assigned to them is created or changed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEmailNotificationEnabled() {
        return this.backingStore.get("isEmailNotificationEnabled");
    }
    /**
     * Gets the role property value. The role property
     * @return a BookingStaffRole
     */
    @jakarta.annotation.Nullable
    public BookingStaffRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Gets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseBusinessHours() {
        return this.backingStore.get("useBusinessHours");
    }
    /**
     * Gets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @return a java.util.List<BookingWorkHours>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingWorkHours> getWorkingHours() {
        return this.backingStore.get("workingHours");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("availabilityIsAffectedByPersonalCalendar", this.getAvailabilityIsAffectedByPersonalCalendar());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeBooleanValue("isEmailNotificationEnabled", this.getIsEmailNotificationEnabled());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeBooleanValue("useBusinessHours", this.getUseBusinessHours());
        writer.writeCollectionOfObjectValues("workingHours", this.getWorkingHours());
    }
    /**
     * Sets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @param value Value to set for the availabilityIsAffectedByPersonalCalendar property.
     */
    public void setAvailabilityIsAffectedByPersonalCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("availabilityIsAffectedByPersonalCalendar", value);
    }
    /**
     * Sets the displayName property value. The name of the staff member, as displayed to customers. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailAddress property value. The email address of the staff member. This can be in the same Microsoft 365 tenant as the business, or in a different email domain. This email address can be used if the sendConfirmationsToOwner property is set to true in the scheduling policy of the business. Required.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the isEmailNotificationEnabled property value. True indicates that a staff member will be notified via email when a booking assigned to them is created or changed.
     * @param value Value to set for the isEmailNotificationEnabled property.
     */
    public void setIsEmailNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEmailNotificationEnabled", value);
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BookingStaffRole value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeZone", value);
    }
    /**
     * Sets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @param value Value to set for the useBusinessHours property.
     */
    public void setUseBusinessHours(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useBusinessHours", value);
    }
    /**
     * Sets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @param value Value to set for the workingHours property.
     */
    public void setWorkingHours(@jakarta.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this.backingStore.set("workingHours", value);
    }
}
