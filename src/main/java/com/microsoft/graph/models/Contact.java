package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Contact extends OutlookItem implements Parsable {
    /** The name of the contact's assistant. */
    private String _assistantName;
    /** The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _birthday;
    /** The contact's business address. */
    private PhysicalAddress _businessAddress;
    /** The business home page of the contact. */
    private String _businessHomePage;
    /** The contact's business phone numbers. */
    private java.util.List<String> _businessPhones;
    /** The names of the contact's children. */
    private java.util.List<String> _children;
    /** The name of the contact's company. */
    private String _companyName;
    /** The contact's department. */
    private String _department;
    /** The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation. */
    private String _displayName;
    /** The contact's email addresses. */
    private java.util.List<EmailAddress> _emailAddresses;
    /** The collection of open extensions defined for the contact. Read-only. Nullable. */
    private java.util.List<Extension> _extensions;
    /** The name the contact is filed under. */
    private String _fileAs;
    /** The contact's generation. */
    private String _generation;
    /** The contact's given name. */
    private String _givenName;
    /** The contact's home address. */
    private PhysicalAddress _homeAddress;
    /** The contact's home phone numbers. */
    private java.util.List<String> _homePhones;
    /** The imAddresses property */
    private java.util.List<String> _imAddresses;
    /** The initials property */
    private String _initials;
    /** The jobTitle property */
    private String _jobTitle;
    /** The manager property */
    private String _manager;
    /** The middleName property */
    private String _middleName;
    /** The mobilePhone property */
    private String _mobilePhone;
    /** The collection of multi-value extended properties defined for the contact. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The nickName property */
    private String _nickName;
    /** The officeLocation property */
    private String _officeLocation;
    /** The otherAddress property */
    private PhysicalAddress _otherAddress;
    /** The parentFolderId property */
    private String _parentFolderId;
    /** The personalNotes property */
    private String _personalNotes;
    /** Optional contact picture. You can get or set a photo for a contact. */
    private ProfilePhoto _photo;
    /** The profession property */
    private String _profession;
    /** The collection of single-value extended properties defined for the contact. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /** The spouseName property */
    private String _spouseName;
    /** The surname property */
    private String _surname;
    /** The title property */
    private String _title;
    /** The yomiCompanyName property */
    private String _yomiCompanyName;
    /** The yomiGivenName property */
    private String _yomiGivenName;
    /** The yomiSurname property */
    private String _yomiSurname;
    /**
     * Instantiates a new Contact and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Contact() {
        super();
        this.setOdataType("#microsoft.graph.contact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Contact
     */
    @javax.annotation.Nonnull
    public static Contact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contact();
    }
    /**
     * Gets the assistantName property value. The name of the contact's assistant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssistantName() {
        return this._assistantName;
    }
    /**
     * Gets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBirthday() {
        return this._birthday;
    }
    /**
     * Gets the businessAddress property value. The contact's business address.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getBusinessAddress() {
        return this._businessAddress;
    }
    /**
     * Gets the businessHomePage property value. The business home page of the contact.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBusinessHomePage() {
        return this._businessHomePage;
    }
    /**
     * Gets the businessPhones property value. The contact's business phone numbers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this._businessPhones;
    }
    /**
     * Gets the children property value. The names of the contact's children.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildren() {
        return this._children;
    }
    /**
     * Gets the companyName property value. The name of the contact's company.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this._companyName;
    }
    /**
     * Gets the department property value. The contact's department.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the emailAddresses property value. The contact's email addresses.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public java.util.List<EmailAddress> getEmailAddresses() {
        return this._emailAddresses;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assistantName", (n) -> { this.setAssistantName(n.getStringValue()); });
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessAddress", (n) -> { this.setBusinessAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("businessHomePage", (n) -> { this.setBusinessHomePage(n.getStringValue()); });
        deserializerMap.put("businessPhones", (n) -> { this.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfObjectValues(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("fileAs", (n) -> { this.setFileAs(n.getStringValue()); });
        deserializerMap.put("generation", (n) -> { this.setGeneration(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("homeAddress", (n) -> { this.setHomeAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("homePhones", (n) -> { this.setHomePhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("imAddresses", (n) -> { this.setImAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("initials", (n) -> { this.setInitials(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getStringValue()); });
        deserializerMap.put("middleName", (n) -> { this.setMiddleName(n.getStringValue()); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("nickName", (n) -> { this.setNickName(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("otherAddress", (n) -> { this.setOtherAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("personalNotes", (n) -> { this.setPersonalNotes(n.getStringValue()); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("profession", (n) -> { this.setProfession(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("spouseName", (n) -> { this.setSpouseName(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("yomiCompanyName", (n) -> { this.setYomiCompanyName(n.getStringValue()); });
        deserializerMap.put("yomiGivenName", (n) -> { this.setYomiGivenName(n.getStringValue()); });
        deserializerMap.put("yomiSurname", (n) -> { this.setYomiSurname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileAs property value. The name the contact is filed under.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileAs() {
        return this._fileAs;
    }
    /**
     * Gets the generation property value. The contact's generation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGeneration() {
        return this._generation;
    }
    /**
     * Gets the givenName property value. The contact's given name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
    }
    /**
     * Gets the homeAddress property value. The contact's home address.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getHomeAddress() {
        return this._homeAddress;
    }
    /**
     * Gets the homePhones property value. The contact's home phone numbers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHomePhones() {
        return this._homePhones;
    }
    /**
     * Gets the imAddresses property value. The imAddresses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getImAddresses() {
        return this._imAddresses;
    }
    /**
     * Gets the initials property value. The initials property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitials() {
        return this._initials;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this._jobTitle;
    }
    /**
     * Gets the manager property value. The manager property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManager() {
        return this._manager;
    }
    /**
     * Gets the middleName property value. The middleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddleName() {
        return this._middleName;
    }
    /**
     * Gets the mobilePhone property value. The mobilePhone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this._mobilePhone;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the nickName property value. The nickName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickName() {
        return this._nickName;
    }
    /**
     * Gets the officeLocation property value. The officeLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this._officeLocation;
    }
    /**
     * Gets the otherAddress property value. The otherAddress property
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getOtherAddress() {
        return this._otherAddress;
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this._parentFolderId;
    }
    /**
     * Gets the personalNotes property value. The personalNotes property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalNotes() {
        return this._personalNotes;
    }
    /**
     * Gets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this._photo;
    }
    /**
     * Gets the profession property value. The profession property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfession() {
        return this._profession;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Gets the spouseName property value. The spouseName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSpouseName() {
        return this._spouseName;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this._surname;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the yomiCompanyName property value. The yomiCompanyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getYomiCompanyName() {
        return this._yomiCompanyName;
    }
    /**
     * Gets the yomiGivenName property value. The yomiGivenName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getYomiGivenName() {
        return this._yomiGivenName;
    }
    /**
     * Gets the yomiSurname property value. The yomiSurname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getYomiSurname() {
        return this._yomiSurname;
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
        writer.writeStringValue("assistantName", this.getAssistantName());
        writer.writeOffsetDateTimeValue("birthday", this.getBirthday());
        writer.writeObjectValue("businessAddress", this.getBusinessAddress());
        writer.writeStringValue("businessHomePage", this.getBusinessHomePage());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeCollectionOfPrimitiveValues("children", this.getChildren());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("emailAddresses", this.getEmailAddresses());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeStringValue("fileAs", this.getFileAs());
        writer.writeStringValue("generation", this.getGeneration());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeObjectValue("homeAddress", this.getHomeAddress());
        writer.writeCollectionOfPrimitiveValues("homePhones", this.getHomePhones());
        writer.writeCollectionOfPrimitiveValues("imAddresses", this.getImAddresses());
        writer.writeStringValue("initials", this.getInitials());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("manager", this.getManager());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("nickName", this.getNickName());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeObjectValue("otherAddress", this.getOtherAddress());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeStringValue("personalNotes", this.getPersonalNotes());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeStringValue("profession", this.getProfession());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeStringValue("spouseName", this.getSpouseName());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("yomiCompanyName", this.getYomiCompanyName());
        writer.writeStringValue("yomiGivenName", this.getYomiGivenName());
        writer.writeStringValue("yomiSurname", this.getYomiSurname());
    }
    /**
     * Sets the assistantName property value. The name of the contact's assistant.
     * @param value Value to set for the assistantName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssistantName(@javax.annotation.Nullable final String value) {
        this._assistantName = value;
    }
    /**
     * Sets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the birthday property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthday(@javax.annotation.Nullable final OffsetDateTime value) {
        this._birthday = value;
    }
    /**
     * Sets the businessAddress property value. The contact's business address.
     * @param value Value to set for the businessAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._businessAddress = value;
    }
    /**
     * Sets the businessHomePage property value. The business home page of the contact.
     * @param value Value to set for the businessHomePage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessHomePage(@javax.annotation.Nullable final String value) {
        this._businessHomePage = value;
    }
    /**
     * Sets the businessPhones property value. The contact's business phone numbers.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._businessPhones = value;
    }
    /**
     * Sets the children property value. The names of the contact's children.
     * @param value Value to set for the children property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildren(@javax.annotation.Nullable final java.util.List<String> value) {
        this._children = value;
    }
    /**
     * Sets the companyName property value. The name of the contact's company.
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this._companyName = value;
    }
    /**
     * Sets the department property value. The contact's department.
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the emailAddresses property value. The contact's email addresses.
     * @param value Value to set for the emailAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddresses(@javax.annotation.Nullable final java.util.List<EmailAddress> value) {
        this._emailAddresses = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the fileAs property value. The name the contact is filed under.
     * @param value Value to set for the fileAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileAs(@javax.annotation.Nullable final String value) {
        this._fileAs = value;
    }
    /**
     * Sets the generation property value. The contact's generation.
     * @param value Value to set for the generation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeneration(@javax.annotation.Nullable final String value) {
        this._generation = value;
    }
    /**
     * Sets the givenName property value. The contact's given name.
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
    }
    /**
     * Sets the homeAddress property value. The contact's home address.
     * @param value Value to set for the homeAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._homeAddress = value;
    }
    /**
     * Sets the homePhones property value. The contact's home phone numbers.
     * @param value Value to set for the homePhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomePhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._homePhones = value;
    }
    /**
     * Sets the imAddresses property value. The imAddresses property
     * @param value Value to set for the imAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._imAddresses = value;
    }
    /**
     * Sets the initials property value. The initials property
     * @param value Value to set for the initials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitials(@javax.annotation.Nullable final String value) {
        this._initials = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this._jobTitle = value;
    }
    /**
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final String value) {
        this._manager = value;
    }
    /**
     * Sets the middleName property value. The middleName property
     * @param value Value to set for the middleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddleName(@javax.annotation.Nullable final String value) {
        this._middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The mobilePhone property
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this._mobilePhone = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the nickName property value. The nickName property
     * @param value Value to set for the nickName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNickName(@javax.annotation.Nullable final String value) {
        this._nickName = value;
    }
    /**
     * Sets the officeLocation property value. The officeLocation property
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this._officeLocation = value;
    }
    /**
     * Sets the otherAddress property value. The otherAddress property
     * @param value Value to set for the otherAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtherAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._otherAddress = value;
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this._parentFolderId = value;
    }
    /**
     * Sets the personalNotes property value. The personalNotes property
     * @param value Value to set for the personalNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalNotes(@javax.annotation.Nullable final String value) {
        this._personalNotes = value;
    }
    /**
     * Sets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @param value Value to set for the photo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoto(@javax.annotation.Nullable final ProfilePhoto value) {
        this._photo = value;
    }
    /**
     * Sets the profession property value. The profession property
     * @param value Value to set for the profession property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfession(@javax.annotation.Nullable final String value) {
        this._profession = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
    /**
     * Sets the spouseName property value. The spouseName property
     * @param value Value to set for the spouseName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpouseName(@javax.annotation.Nullable final String value) {
        this._spouseName = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this._surname = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the yomiCompanyName property value. The yomiCompanyName property
     * @param value Value to set for the yomiCompanyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYomiCompanyName(@javax.annotation.Nullable final String value) {
        this._yomiCompanyName = value;
    }
    /**
     * Sets the yomiGivenName property value. The yomiGivenName property
     * @param value Value to set for the yomiGivenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYomiGivenName(@javax.annotation.Nullable final String value) {
        this._yomiGivenName = value;
    }
    /**
     * Sets the yomiSurname property value. The yomiSurname property
     * @param value Value to set for the yomiSurname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYomiSurname(@javax.annotation.Nullable final String value) {
        this._yomiSurname = value;
    }
}
