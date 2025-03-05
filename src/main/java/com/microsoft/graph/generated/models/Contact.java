package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Contact extends OutlookItem implements Parsable {
    /**
     * Instantiates a new {@link Contact} and sets the default values.
     */
    public Contact() {
        super();
        this.setOdataType("#microsoft.graph.contact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nonnull
    public static Contact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contact();
    }
    /**
     * Gets the assistantName property value. The name of the contact&apos;s assistant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssistantName() {
        return this.backingStore.get("assistantName");
    }
    /**
     * Gets the birthday property value. The contact&apos;s birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBirthday() {
        return this.backingStore.get("birthday");
    }
    /**
     * Gets the businessAddress property value. The contact&apos;s business address.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getBusinessAddress() {
        return this.backingStore.get("businessAddress");
    }
    /**
     * Gets the businessHomePage property value. The business home page of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessHomePage() {
        return this.backingStore.get("businessHomePage");
    }
    /**
     * Gets the businessPhones property value. The contact&apos;s business phone numbers.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.backingStore.get("businessPhones");
    }
    /**
     * Gets the children property value. The names of the contact&apos;s children.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the companyName property value. The name of the contact&apos;s company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the department property value. The contact&apos;s department.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. The contact&apos;s display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailAddresses property value. The contact&apos;s email addresses.
     * @return a {@link java.util.List<EmailAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAddress> getEmailAddresses() {
        return this.backingStore.get("emailAddresses");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @return a {@link java.util.List<Extension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileAs() {
        return this.backingStore.get("fileAs");
    }
    /**
     * Gets the generation property value. The contact&apos;s suffix.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGeneration() {
        return this.backingStore.get("generation");
    }
    /**
     * Gets the givenName property value. The contact&apos;s given name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the homeAddress property value. The contact&apos;s home address.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getHomeAddress() {
        return this.backingStore.get("homeAddress");
    }
    /**
     * Gets the homePhones property value. The contact&apos;s home phone numbers.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHomePhones() {
        return this.backingStore.get("homePhones");
    }
    /**
     * Gets the imAddresses property value. The contact&apos;s instant messaging (IM) addresses.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getImAddresses() {
        return this.backingStore.get("imAddresses");
    }
    /**
     * Gets the initials property value. The contact&apos;s initials.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitials() {
        return this.backingStore.get("initials");
    }
    /**
     * Gets the jobTitle property value. The contacts job title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the manager property value. The name of the contact&apos;s manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManager() {
        return this.backingStore.get("manager");
    }
    /**
     * Gets the middleName property value. The contact&apos;s middle name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMiddleName() {
        return this.backingStore.get("middleName");
    }
    /**
     * Gets the mobilePhone property value. The contact&apos;s mobile phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobilePhone() {
        return this.backingStore.get("mobilePhone");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @return a {@link java.util.List<MultiValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the nickName property value. The contact&apos;s nickname.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNickName() {
        return this.backingStore.get("nickName");
    }
    /**
     * Gets the officeLocation property value. The location of the contact&apos;s office.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.backingStore.get("officeLocation");
    }
    /**
     * Gets the otherAddress property value. Other addresses for the contact.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getOtherAddress() {
        return this.backingStore.get("otherAddress");
    }
    /**
     * Gets the parentFolderId property value. The ID of the contact&apos;s parent folder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.backingStore.get("parentFolderId");
    }
    /**
     * Gets the personalNotes property value. The user&apos;s notes about the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalNotes() {
        return this.backingStore.get("personalNotes");
    }
    /**
     * Gets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @return a {@link ProfilePhoto}
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this.backingStore.get("photo");
    }
    /**
     * Gets the profession property value. The contact&apos;s profession.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfession() {
        return this.backingStore.get("profession");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the spouseName property value. The name of the contact&apos;s spouse/partner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpouseName() {
        return this.backingStore.get("spouseName");
    }
    /**
     * Gets the surname property value. The contact&apos;s surname.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.backingStore.get("surname");
    }
    /**
     * Gets the title property value. The contact&apos;s title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the yomiCompanyName property value. The phonetic Japanese company name of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiCompanyName() {
        return this.backingStore.get("yomiCompanyName");
    }
    /**
     * Gets the yomiGivenName property value. The phonetic Japanese given name (first name) of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiGivenName() {
        return this.backingStore.get("yomiGivenName");
    }
    /**
     * Gets the yomiSurname property value. The phonetic Japanese surname (last name)  of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiSurname() {
        return this.backingStore.get("yomiSurname");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the assistantName property value. The name of the contact&apos;s assistant.
     * @param value Value to set for the assistantName property.
     */
    public void setAssistantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assistantName", value);
    }
    /**
     * Sets the birthday property value. The contact&apos;s birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the birthday property.
     */
    public void setBirthday(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("birthday", value);
    }
    /**
     * Sets the businessAddress property value. The contact&apos;s business address.
     * @param value Value to set for the businessAddress property.
     */
    public void setBusinessAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("businessAddress", value);
    }
    /**
     * Sets the businessHomePage property value. The business home page of the contact.
     * @param value Value to set for the businessHomePage property.
     */
    public void setBusinessHomePage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("businessHomePage", value);
    }
    /**
     * Sets the businessPhones property value. The contact&apos;s business phone numbers.
     * @param value Value to set for the businessPhones property.
     */
    public void setBusinessPhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("businessPhones", value);
    }
    /**
     * Sets the children property value. The names of the contact&apos;s children.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the companyName property value. The name of the contact&apos;s company.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the department property value. The contact&apos;s department.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. The contact&apos;s display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailAddresses property value. The contact&apos;s email addresses.
     * @param value Value to set for the emailAddresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<EmailAddress> value) {
        this.backingStore.set("emailAddresses", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the fileAs property value. The name the contact is filed under.
     * @param value Value to set for the fileAs property.
     */
    public void setFileAs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileAs", value);
    }
    /**
     * Sets the generation property value. The contact&apos;s suffix.
     * @param value Value to set for the generation property.
     */
    public void setGeneration(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("generation", value);
    }
    /**
     * Sets the givenName property value. The contact&apos;s given name.
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the homeAddress property value. The contact&apos;s home address.
     * @param value Value to set for the homeAddress property.
     */
    public void setHomeAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("homeAddress", value);
    }
    /**
     * Sets the homePhones property value. The contact&apos;s home phone numbers.
     * @param value Value to set for the homePhones property.
     */
    public void setHomePhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("homePhones", value);
    }
    /**
     * Sets the imAddresses property value. The contact&apos;s instant messaging (IM) addresses.
     * @param value Value to set for the imAddresses property.
     */
    public void setImAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("imAddresses", value);
    }
    /**
     * Sets the initials property value. The contact&apos;s initials.
     * @param value Value to set for the initials property.
     */
    public void setInitials(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initials", value);
    }
    /**
     * Sets the jobTitle property value. The contacts job title.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the manager property value. The name of the contact&apos;s manager.
     * @param value Value to set for the manager property.
     */
    public void setManager(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manager", value);
    }
    /**
     * Sets the middleName property value. The contact&apos;s middle name.
     * @param value Value to set for the middleName property.
     */
    public void setMiddleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("middleName", value);
    }
    /**
     * Sets the mobilePhone property value. The contact&apos;s mobile phone number.
     * @param value Value to set for the mobilePhone property.
     */
    public void setMobilePhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobilePhone", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the nickName property value. The contact&apos;s nickname.
     * @param value Value to set for the nickName property.
     */
    public void setNickName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nickName", value);
    }
    /**
     * Sets the officeLocation property value. The location of the contact&apos;s office.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("officeLocation", value);
    }
    /**
     * Sets the otherAddress property value. Other addresses for the contact.
     * @param value Value to set for the otherAddress property.
     */
    public void setOtherAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("otherAddress", value);
    }
    /**
     * Sets the parentFolderId property value. The ID of the contact&apos;s parent folder.
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentFolderId", value);
    }
    /**
     * Sets the personalNotes property value. The user&apos;s notes about the contact.
     * @param value Value to set for the personalNotes property.
     */
    public void setPersonalNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalNotes", value);
    }
    /**
     * Sets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final ProfilePhoto value) {
        this.backingStore.set("photo", value);
    }
    /**
     * Sets the profession property value. The contact&apos;s profession.
     * @param value Value to set for the profession property.
     */
    public void setProfession(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profession", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the spouseName property value. The name of the contact&apos;s spouse/partner.
     * @param value Value to set for the spouseName property.
     */
    public void setSpouseName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spouseName", value);
    }
    /**
     * Sets the surname property value. The contact&apos;s surname.
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("surname", value);
    }
    /**
     * Sets the title property value. The contact&apos;s title.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the yomiCompanyName property value. The phonetic Japanese company name of the contact.
     * @param value Value to set for the yomiCompanyName property.
     */
    public void setYomiCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiCompanyName", value);
    }
    /**
     * Sets the yomiGivenName property value. The phonetic Japanese given name (first name) of the contact.
     * @param value Value to set for the yomiGivenName property.
     */
    public void setYomiGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiGivenName", value);
    }
    /**
     * Sets the yomiSurname property value. The phonetic Japanese surname (last name)  of the contact.
     * @param value Value to set for the yomiSurname property.
     */
    public void setYomiSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiSurname", value);
    }
}
