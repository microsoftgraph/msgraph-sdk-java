package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingBusiness extends Entity implements Parsable {
    /** The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others. */
    private PhysicalAddress _address;
    /** All the appointments of this business. Read-only. Nullable. */
    private java.util.List<BookingAppointment> _appointments;
    /** The hours of operation for the business. */
    private java.util.List<BookingWorkHours> _businessHours;
    /** The type of business. */
    private String _businessType;
    /** The set of appointments of this business in a specified date range. Read-only. Nullable. */
    private java.util.List<BookingAppointment> _calendarView;
    /** All the customers of this business. Read-only. Nullable. */
    private java.util.List<BookingCustomerBase> _customers;
    /** All the custom questions of this business. Read-only. Nullable. */
    private java.util.List<BookingCustomQuestion> _customQuestions;
    /** The code for the currency that the business operates in on Microsoft Bookings. */
    private String _defaultCurrencyIso;
    /** The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page. */
    private String _displayName;
    /** The email address for the business. */
    private String _email;
    /** The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only. */
    private Boolean _isPublished;
    /** The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page. */
    private String _phone;
    /** The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only. */
    private String _publicUrl;
    /** Specifies how bookings can be created for this business. */
    private BookingSchedulingPolicy _schedulingPolicy;
    /** All the services offered by this business. Read-only. Nullable. */
    private java.util.List<BookingService> _services;
    /** All the staff members that provide services in this business. Read-only. Nullable. */
    private java.util.List<BookingStaffMemberBase> _staffMembers;
    /** The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page. */
    private String _webSiteUrl;
    /**
     * Instantiates a new BookingBusiness and sets the default values.
     * @return a void
     */
    public BookingBusiness() {
        super();
        this.setOdataType("#microsoft.graph.bookingBusiness");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingBusiness
     */
    @javax.annotation.Nonnull
    public static BookingBusiness createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingBusiness();
    }
    /**
     * Gets the address property value. The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this._address;
    }
    /**
     * Gets the appointments property value. All the appointments of this business. Read-only. Nullable.
     * @return a bookingAppointment
     */
    @javax.annotation.Nullable
    public java.util.List<BookingAppointment> getAppointments() {
        return this._appointments;
    }
    /**
     * Gets the businessHours property value. The hours of operation for the business.
     * @return a bookingWorkHours
     */
    @javax.annotation.Nullable
    public java.util.List<BookingWorkHours> getBusinessHours() {
        return this._businessHours;
    }
    /**
     * Gets the businessType property value. The type of business.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBusinessType() {
        return this._businessType;
    }
    /**
     * Gets the calendarView property value. The set of appointments of this business in a specified date range. Read-only. Nullable.
     * @return a bookingAppointment
     */
    @javax.annotation.Nullable
    public java.util.List<BookingAppointment> getCalendarView() {
        return this._calendarView;
    }
    /**
     * Gets the customers property value. All the customers of this business. Read-only. Nullable.
     * @return a bookingCustomerBase
     */
    @javax.annotation.Nullable
    public java.util.List<BookingCustomerBase> getCustomers() {
        return this._customers;
    }
    /**
     * Gets the customQuestions property value. All the custom questions of this business. Read-only. Nullable.
     * @return a bookingCustomQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<BookingCustomQuestion> getCustomQuestions() {
        return this._customQuestions;
    }
    /**
     * Gets the defaultCurrencyIso property value. The code for the currency that the business operates in on Microsoft Bookings.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultCurrencyIso() {
        return this._defaultCurrencyIso;
    }
    /**
     * Gets the displayName property value. The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email address for the business.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingBusiness currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("appointments", (n) -> { currentObject.setAppointments(n.getCollectionOfObjectValues(BookingAppointment::createFromDiscriminatorValue)); });
            this.put("businessHours", (n) -> { currentObject.setBusinessHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
            this.put("businessType", (n) -> { currentObject.setBusinessType(n.getStringValue()); });
            this.put("calendarView", (n) -> { currentObject.setCalendarView(n.getCollectionOfObjectValues(BookingAppointment::createFromDiscriminatorValue)); });
            this.put("customers", (n) -> { currentObject.setCustomers(n.getCollectionOfObjectValues(BookingCustomerBase::createFromDiscriminatorValue)); });
            this.put("customQuestions", (n) -> { currentObject.setCustomQuestions(n.getCollectionOfObjectValues(BookingCustomQuestion::createFromDiscriminatorValue)); });
            this.put("defaultCurrencyIso", (n) -> { currentObject.setDefaultCurrencyIso(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("isPublished", (n) -> { currentObject.setIsPublished(n.getBooleanValue()); });
            this.put("phone", (n) -> { currentObject.setPhone(n.getStringValue()); });
            this.put("publicUrl", (n) -> { currentObject.setPublicUrl(n.getStringValue()); });
            this.put("schedulingPolicy", (n) -> { currentObject.setSchedulingPolicy(n.getObjectValue(BookingSchedulingPolicy::createFromDiscriminatorValue)); });
            this.put("services", (n) -> { currentObject.setServices(n.getCollectionOfObjectValues(BookingService::createFromDiscriminatorValue)); });
            this.put("staffMembers", (n) -> { currentObject.setStaffMembers(n.getCollectionOfObjectValues(BookingStaffMemberBase::createFromDiscriminatorValue)); });
            this.put("webSiteUrl", (n) -> { currentObject.setWebSiteUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isPublished property value. The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPublished() {
        return this._isPublished;
    }
    /**
     * Gets the phone property value. The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this._phone;
    }
    /**
     * Gets the publicUrl property value. The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublicUrl() {
        return this._publicUrl;
    }
    /**
     * Gets the schedulingPolicy property value. Specifies how bookings can be created for this business.
     * @return a bookingSchedulingPolicy
     */
    @javax.annotation.Nullable
    public BookingSchedulingPolicy getSchedulingPolicy() {
        return this._schedulingPolicy;
    }
    /**
     * Gets the services property value. All the services offered by this business. Read-only. Nullable.
     * @return a bookingService
     */
    @javax.annotation.Nullable
    public java.util.List<BookingService> getServices() {
        return this._services;
    }
    /**
     * Gets the staffMembers property value. All the staff members that provide services in this business. Read-only. Nullable.
     * @return a bookingStaffMemberBase
     */
    @javax.annotation.Nullable
    public java.util.List<BookingStaffMemberBase> getStaffMembers() {
        return this._staffMembers;
    }
    /**
     * Gets the webSiteUrl property value. The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebSiteUrl() {
        return this._webSiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeBooleanValue("isPublished", this.getIsPublished());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("publicUrl", this.getPublicUrl());
        writer.writeObjectValue("schedulingPolicy", this.getSchedulingPolicy());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeCollectionOfObjectValues("staffMembers", this.getStaffMembers());
        writer.writeStringValue("webSiteUrl", this.getWebSiteUrl());
    }
    /**
     * Sets the address property value. The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._address = value;
    }
    /**
     * Sets the appointments property value. All the appointments of this business. Read-only. Nullable.
     * @param value Value to set for the appointments property.
     * @return a void
     */
    public void setAppointments(@javax.annotation.Nullable final java.util.List<BookingAppointment> value) {
        this._appointments = value;
    }
    /**
     * Sets the businessHours property value. The hours of operation for the business.
     * @param value Value to set for the businessHours property.
     * @return a void
     */
    public void setBusinessHours(@javax.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this._businessHours = value;
    }
    /**
     * Sets the businessType property value. The type of business.
     * @param value Value to set for the businessType property.
     * @return a void
     */
    public void setBusinessType(@javax.annotation.Nullable final String value) {
        this._businessType = value;
    }
    /**
     * Sets the calendarView property value. The set of appointments of this business in a specified date range. Read-only. Nullable.
     * @param value Value to set for the calendarView property.
     * @return a void
     */
    public void setCalendarView(@javax.annotation.Nullable final java.util.List<BookingAppointment> value) {
        this._calendarView = value;
    }
    /**
     * Sets the customers property value. All the customers of this business. Read-only. Nullable.
     * @param value Value to set for the customers property.
     * @return a void
     */
    public void setCustomers(@javax.annotation.Nullable final java.util.List<BookingCustomerBase> value) {
        this._customers = value;
    }
    /**
     * Sets the customQuestions property value. All the custom questions of this business. Read-only. Nullable.
     * @param value Value to set for the customQuestions property.
     * @return a void
     */
    public void setCustomQuestions(@javax.annotation.Nullable final java.util.List<BookingCustomQuestion> value) {
        this._customQuestions = value;
    }
    /**
     * Sets the defaultCurrencyIso property value. The code for the currency that the business operates in on Microsoft Bookings.
     * @param value Value to set for the defaultCurrencyIso property.
     * @return a void
     */
    public void setDefaultCurrencyIso(@javax.annotation.Nullable final String value) {
        this._defaultCurrencyIso = value;
    }
    /**
     * Sets the displayName property value. The name of the business, which interfaces with customers. This name appears at the top of the business scheduling page.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email address for the business.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the isPublished property value. The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     * @param value Value to set for the isPublished property.
     * @return a void
     */
    public void setIsPublished(@javax.annotation.Nullable final Boolean value) {
        this._isPublished = value;
    }
    /**
     * Sets the phone property value. The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     * @param value Value to set for the phone property.
     * @return a void
     */
    public void setPhone(@javax.annotation.Nullable final String value) {
        this._phone = value;
    }
    /**
     * Sets the publicUrl property value. The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     * @param value Value to set for the publicUrl property.
     * @return a void
     */
    public void setPublicUrl(@javax.annotation.Nullable final String value) {
        this._publicUrl = value;
    }
    /**
     * Sets the schedulingPolicy property value. Specifies how bookings can be created for this business.
     * @param value Value to set for the schedulingPolicy property.
     * @return a void
     */
    public void setSchedulingPolicy(@javax.annotation.Nullable final BookingSchedulingPolicy value) {
        this._schedulingPolicy = value;
    }
    /**
     * Sets the services property value. All the services offered by this business. Read-only. Nullable.
     * @param value Value to set for the services property.
     * @return a void
     */
    public void setServices(@javax.annotation.Nullable final java.util.List<BookingService> value) {
        this._services = value;
    }
    /**
     * Sets the staffMembers property value. All the staff members that provide services in this business. Read-only. Nullable.
     * @param value Value to set for the staffMembers property.
     * @return a void
     */
    public void setStaffMembers(@javax.annotation.Nullable final java.util.List<BookingStaffMemberBase> value) {
        this._staffMembers = value;
    }
    /**
     * Sets the webSiteUrl property value. The URL of the business web site. The webSiteUrl property, together with address, phone, appear in the footer of a business scheduling page.
     * @param value Value to set for the webSiteUrl property.
     * @return a void
     */
    public void setWebSiteUrl(@javax.annotation.Nullable final String value) {
        this._webSiteUrl = value;
    }
}
