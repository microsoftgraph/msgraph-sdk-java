package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Microsot Bookings Business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingBusiness extends Entity implements Parsable {
    /**
     * The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     */
    private PhysicalAddress address;
    /**
     * All the appointments of this business. Read-only. Nullable.
     */
    private java.util.List<BookingAppointment> appointments;
    /**
     * The hours of operation for the business.
     */
    private java.util.List<BookingWorkHours> businessHours;
    /**
     * The type of business.
     */
    private String businessType;
    /**
     * The set of appointments of this business in a specified date range. Read-only. Nullable.
     */
    private java.util.List<BookingAppointment> calendarView;
    /**
     * All the customers of this business. Read-only. Nullable.
     */
    private java.util.List<BookingCustomerBase> customers;
    /**
     * All the custom questions of this business. Read-only. Nullable.
     */
    private java.util.List<BookingCustomQuestion> customQuestions;
    /**
     * The code for the currency that the business operates in on Microsoft Bookings.
     */
    private String defaultCurrencyIso;
    /**
     * The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page.
     */
    private String displayName;
    /**
     * The email address for the business.
     */
    private String email;
    /**
     * The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     */
    private Boolean isPublished;
    /**
     * The language of the self-service booking page.
     */
    private String languageTag;
    /**
     * The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     */
    private String phone;
    /**
     * The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     */
    private String publicUrl;
    /**
     * Specifies how bookings can be created for this business.
     */
    private BookingSchedulingPolicy schedulingPolicy;
    /**
     * All the services offered by this business. Read-only. Nullable.
     */
    private java.util.List<BookingService> services;
    /**
     * All the staff members that provide services in this business. Read-only. Nullable.
     */
    private java.util.List<BookingStaffMemberBase> staffMembers;
    /**
     * The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page.
     */
    private String webSiteUrl;
    /**
     * Instantiates a new BookingBusiness and sets the default values.
     */
    public BookingBusiness() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingBusiness
     */
    @jakarta.annotation.Nonnull
    public static BookingBusiness createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingBusiness();
    }
    /**
     * Gets the address property value. The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the appointments property value. All the appointments of this business. Read-only. Nullable.
     * @return a java.util.List<BookingAppointment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingAppointment> getAppointments() {
        return this.appointments;
    }
    /**
     * Gets the businessHours property value. The hours of operation for the business.
     * @return a java.util.List<BookingWorkHours>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingWorkHours> getBusinessHours() {
        return this.businessHours;
    }
    /**
     * Gets the businessType property value. The type of business.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBusinessType() {
        return this.businessType;
    }
    /**
     * Gets the calendarView property value. The set of appointments of this business in a specified date range. Read-only. Nullable.
     * @return a java.util.List<BookingAppointment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingAppointment> getCalendarView() {
        return this.calendarView;
    }
    /**
     * Gets the customers property value. All the customers of this business. Read-only. Nullable.
     * @return a java.util.List<BookingCustomerBase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCustomerBase> getCustomers() {
        return this.customers;
    }
    /**
     * Gets the customQuestions property value. All the custom questions of this business. Read-only. Nullable.
     * @return a java.util.List<BookingCustomQuestion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCustomQuestion> getCustomQuestions() {
        return this.customQuestions;
    }
    /**
     * Gets the defaultCurrencyIso property value. The code for the currency that the business operates in on Microsoft Bookings.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultCurrencyIso() {
        return this.defaultCurrencyIso;
    }
    /**
     * Gets the displayName property value. The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. The email address for the business.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("appointments", (n) -> { this.setAppointments(n.getCollectionOfObjectValues(BookingAppointment::createFromDiscriminatorValue)); });
        deserializerMap.put("businessHours", (n) -> { this.setBusinessHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
        deserializerMap.put("businessType", (n) -> { this.setBusinessType(n.getStringValue()); });
        deserializerMap.put("calendarView", (n) -> { this.setCalendarView(n.getCollectionOfObjectValues(BookingAppointment::createFromDiscriminatorValue)); });
        deserializerMap.put("customers", (n) -> { this.setCustomers(n.getCollectionOfObjectValues(BookingCustomerBase::createFromDiscriminatorValue)); });
        deserializerMap.put("customQuestions", (n) -> { this.setCustomQuestions(n.getCollectionOfObjectValues(BookingCustomQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultCurrencyIso", (n) -> { this.setDefaultCurrencyIso(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("isPublished", (n) -> { this.setIsPublished(n.getBooleanValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("publicUrl", (n) -> { this.setPublicUrl(n.getStringValue()); });
        deserializerMap.put("schedulingPolicy", (n) -> { this.setSchedulingPolicy(n.getObjectValue(BookingSchedulingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(BookingService::createFromDiscriminatorValue)); });
        deserializerMap.put("staffMembers", (n) -> { this.setStaffMembers(n.getCollectionOfObjectValues(BookingStaffMemberBase::createFromDiscriminatorValue)); });
        deserializerMap.put("webSiteUrl", (n) -> { this.setWebSiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPublished property value. The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublished() {
        return this.isPublished;
    }
    /**
     * Gets the languageTag property value. The language of the self-service booking page.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the phone property value. The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the publicUrl property value. The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicUrl() {
        return this.publicUrl;
    }
    /**
     * Gets the schedulingPolicy property value. Specifies how bookings can be created for this business.
     * @return a BookingSchedulingPolicy
     */
    @jakarta.annotation.Nullable
    public BookingSchedulingPolicy getSchedulingPolicy() {
        return this.schedulingPolicy;
    }
    /**
     * Gets the services property value. All the services offered by this business. Read-only. Nullable.
     * @return a java.util.List<BookingService>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingService> getServices() {
        return this.services;
    }
    /**
     * Gets the staffMembers property value. All the staff members that provide services in this business. Read-only. Nullable.
     * @return a java.util.List<BookingStaffMemberBase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingStaffMemberBase> getStaffMembers() {
        return this.staffMembers;
    }
    /**
     * Gets the webSiteUrl property value. The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebSiteUrl() {
        return this.webSiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeCollectionOfObjectValues("appointments", this.getAppointments());
        writer.writeCollectionOfObjectValues("businessHours", this.getBusinessHours());
        writer.writeStringValue("businessType", this.getBusinessType());
        writer.writeCollectionOfObjectValues("calendarView", this.getCalendarView());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeCollectionOfObjectValues("customQuestions", this.getCustomQuestions());
        writer.writeStringValue("defaultCurrencyIso", this.getDefaultCurrencyIso());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeObjectValue("schedulingPolicy", this.getSchedulingPolicy());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeCollectionOfObjectValues("staffMembers", this.getStaffMembers());
        writer.writeStringValue("webSiteUrl", this.getWebSiteUrl());
    }
    /**
     * Sets the address property value. The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the appointments property value. All the appointments of this business. Read-only. Nullable.
     * @param value Value to set for the appointments property.
     */
    public void setAppointments(@jakarta.annotation.Nullable final java.util.List<BookingAppointment> value) {
        this.appointments = value;
    }
    /**
     * Sets the businessHours property value. The hours of operation for the business.
     * @param value Value to set for the businessHours property.
     */
    public void setBusinessHours(@jakarta.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this.businessHours = value;
    }
    /**
     * Sets the businessType property value. The type of business.
     * @param value Value to set for the businessType property.
     */
    public void setBusinessType(@jakarta.annotation.Nullable final String value) {
        this.businessType = value;
    }
    /**
     * Sets the calendarView property value. The set of appointments of this business in a specified date range. Read-only. Nullable.
     * @param value Value to set for the calendarView property.
     */
    public void setCalendarView(@jakarta.annotation.Nullable final java.util.List<BookingAppointment> value) {
        this.calendarView = value;
    }
    /**
     * Sets the customers property value. All the customers of this business. Read-only. Nullable.
     * @param value Value to set for the customers property.
     */
    public void setCustomers(@jakarta.annotation.Nullable final java.util.List<BookingCustomerBase> value) {
        this.customers = value;
    }
    /**
     * Sets the customQuestions property value. All the custom questions of this business. Read-only. Nullable.
     * @param value Value to set for the customQuestions property.
     */
    public void setCustomQuestions(@jakarta.annotation.Nullable final java.util.List<BookingCustomQuestion> value) {
        this.customQuestions = value;
    }
    /**
     * Sets the defaultCurrencyIso property value. The code for the currency that the business operates in on Microsoft Bookings.
     * @param value Value to set for the defaultCurrencyIso property.
     */
    public void setDefaultCurrencyIso(@jakarta.annotation.Nullable final String value) {
        this.defaultCurrencyIso = value;
    }
    /**
     * Sets the displayName property value. The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. The email address for the business.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the isPublished property value. The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     * @param value Value to set for the isPublished property.
     */
    public void setIsPublished(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublished = value;
    }
    /**
     * Sets the languageTag property value. The language of the self-service booking page.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the phone property value. The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the publicUrl property value. The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     * @param value Value to set for the publicUrl property.
     */
    public void setPublicUrl(@jakarta.annotation.Nullable final String value) {
        this.publicUrl = value;
    }
    /**
     * Sets the schedulingPolicy property value. Specifies how bookings can be created for this business.
     * @param value Value to set for the schedulingPolicy property.
     */
    public void setSchedulingPolicy(@jakarta.annotation.Nullable final BookingSchedulingPolicy value) {
        this.schedulingPolicy = value;
    }
    /**
     * Sets the services property value. All the services offered by this business. Read-only. Nullable.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<BookingService> value) {
        this.services = value;
    }
    /**
     * Sets the staffMembers property value. All the staff members that provide services in this business. Read-only. Nullable.
     * @param value Value to set for the staffMembers property.
     */
    public void setStaffMembers(@jakarta.annotation.Nullable final java.util.List<BookingStaffMemberBase> value) {
        this.staffMembers = value;
    }
    /**
     * Sets the webSiteUrl property value. The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page.
     * @param value Value to set for the webSiteUrl property.
     */
    public void setWebSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.webSiteUrl = value;
    }
}
