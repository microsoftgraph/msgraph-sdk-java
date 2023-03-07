package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Person extends Entity implements Parsable {
    /** The person's birthday. */
    private String birthday;
    /** The name of the person's company. */
    private String companyName;
    /** The person's department. */
    private String department;
    /** The person's display name. */
    private String displayName;
    /** The person's given name. */
    private String givenName;
    /** The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only. */
    private String imAddress;
    /** true if the user has flagged this person as a favorite. */
    private Boolean isFavorite;
    /** The person's job title. */
    private String jobTitle;
    /** The location of the person's office. */
    private String officeLocation;
    /** Free-form notes that the user has taken about this person. */
    private String personNotes;
    /** The type of person. */
    private PersonType personType;
    /** The person's phone numbers. */
    private java.util.List<Phone> phones;
    /** The person's addresses. */
    private java.util.List<Location> postalAddresses;
    /** The person's profession. */
    private String profession;
    /** The person's email addresses. */
    private java.util.List<ScoredEmailAddress> scoredEmailAddresses;
    /** The person's surname. */
    private String surname;
    /** The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain. */
    private String userPrincipalName;
    /** The person's websites. */
    private java.util.List<Website> websites;
    /** The phonetic Japanese name of the person's company. */
    private String yomiCompany;
    /**
     * Instantiates a new person and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Person() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a person
     */
    @javax.annotation.Nonnull
    public static Person createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Person();
    }
    /**
     * Gets the birthday property value. The person's birthday.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBirthday() {
        return this.birthday;
    }
    /**
     * Gets the companyName property value. The name of the person's company.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the department property value. The person's department.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the displayName property value. The person's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("imAddress", (n) -> { this.setImAddress(n.getStringValue()); });
        deserializerMap.put("isFavorite", (n) -> { this.setIsFavorite(n.getBooleanValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("personNotes", (n) -> { this.setPersonNotes(n.getStringValue()); });
        deserializerMap.put("personType", (n) -> { this.setPersonType(n.getObjectValue(PersonType::createFromDiscriminatorValue)); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("postalAddresses", (n) -> { this.setPostalAddresses(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("profession", (n) -> { this.setProfession(n.getStringValue()); });
        deserializerMap.put("scoredEmailAddresses", (n) -> { this.setScoredEmailAddresses(n.getCollectionOfObjectValues(ScoredEmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("websites", (n) -> { this.setWebsites(n.getCollectionOfObjectValues(Website::createFromDiscriminatorValue)); });
        deserializerMap.put("yomiCompany", (n) -> { this.setYomiCompany(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The person's given name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the imAddress property value. The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImAddress() {
        return this.imAddress;
    }
    /**
     * Gets the isFavorite property value. true if the user has flagged this person as a favorite.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }
    /**
     * Gets the jobTitle property value. The person's job title.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the officeLocation property value. The location of the person's office.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this.officeLocation;
    }
    /**
     * Gets the personNotes property value. Free-form notes that the user has taken about this person.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonNotes() {
        return this.personNotes;
    }
    /**
     * Gets the personType property value. The type of person.
     * @return a personType
     */
    @javax.annotation.Nullable
    public PersonType getPersonType() {
        return this.personType;
    }
    /**
     * Gets the phones property value. The person's phone numbers.
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.phones;
    }
    /**
     * Gets the postalAddresses property value. The person's addresses.
     * @return a location
     */
    @javax.annotation.Nullable
    public java.util.List<Location> getPostalAddresses() {
        return this.postalAddresses;
    }
    /**
     * Gets the profession property value. The person's profession.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfession() {
        return this.profession;
    }
    /**
     * Gets the scoredEmailAddresses property value. The person's email addresses.
     * @return a scoredEmailAddress
     */
    @javax.annotation.Nullable
    public java.util.List<ScoredEmailAddress> getScoredEmailAddresses() {
        return this.scoredEmailAddresses;
    }
    /**
     * Gets the surname property value. The person's surname.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the websites property value. The person's websites.
     * @return a website
     */
    @javax.annotation.Nullable
    public java.util.List<Website> getWebsites() {
        return this.websites;
    }
    /**
     * Gets the yomiCompany property value. The phonetic Japanese name of the person's company.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getYomiCompany() {
        return this.yomiCompany;
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
        writer.writeStringValue("birthday", this.getBirthday());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("imAddress", this.getImAddress());
        writer.writeBooleanValue("isFavorite", this.getIsFavorite());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("personNotes", this.getPersonNotes());
        writer.writeObjectValue("personType", this.getPersonType());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeCollectionOfObjectValues("postalAddresses", this.getPostalAddresses());
        writer.writeStringValue("profession", this.getProfession());
        writer.writeCollectionOfObjectValues("scoredEmailAddresses", this.getScoredEmailAddresses());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeCollectionOfObjectValues("websites", this.getWebsites());
        writer.writeStringValue("yomiCompany", this.getYomiCompany());
    }
    /**
     * Sets the birthday property value. The person's birthday.
     * @param value Value to set for the birthday property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthday(@javax.annotation.Nullable final String value) {
        this.birthday = value;
    }
    /**
     * Sets the companyName property value. The name of the person's company.
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the department property value. The person's department.
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the displayName property value. The person's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the givenName property value. The person's given name.
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the imAddress property value. The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
     * @param value Value to set for the imAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImAddress(@javax.annotation.Nullable final String value) {
        this.imAddress = value;
    }
    /**
     * Sets the isFavorite property value. true if the user has flagged this person as a favorite.
     * @param value Value to set for the isFavorite property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFavorite(@javax.annotation.Nullable final Boolean value) {
        this.isFavorite = value;
    }
    /**
     * Sets the jobTitle property value. The person's job title.
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the officeLocation property value. The location of the person's office.
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this.officeLocation = value;
    }
    /**
     * Sets the personNotes property value. Free-form notes that the user has taken about this person.
     * @param value Value to set for the personNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonNotes(@javax.annotation.Nullable final String value) {
        this.personNotes = value;
    }
    /**
     * Sets the personType property value. The type of person.
     * @param value Value to set for the personType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonType(@javax.annotation.Nullable final PersonType value) {
        this.personType = value;
    }
    /**
     * Sets the phones property value. The person's phone numbers.
     * @param value Value to set for the phones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this.phones = value;
    }
    /**
     * Sets the postalAddresses property value. The person's addresses.
     * @param value Value to set for the postalAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalAddresses(@javax.annotation.Nullable final java.util.List<Location> value) {
        this.postalAddresses = value;
    }
    /**
     * Sets the profession property value. The person's profession.
     * @param value Value to set for the profession property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfession(@javax.annotation.Nullable final String value) {
        this.profession = value;
    }
    /**
     * Sets the scoredEmailAddresses property value. The person's email addresses.
     * @param value Value to set for the scoredEmailAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScoredEmailAddresses(@javax.annotation.Nullable final java.util.List<ScoredEmailAddress> value) {
        this.scoredEmailAddresses = value;
    }
    /**
     * Sets the surname property value. The person's surname.
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the websites property value. The person's websites.
     * @param value Value to set for the websites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebsites(@javax.annotation.Nullable final java.util.List<Website> value) {
        this.websites = value;
    }
    /**
     * Sets the yomiCompany property value. The phonetic Japanese name of the person's company.
     * @param value Value to set for the yomiCompany property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYomiCompany(@javax.annotation.Nullable final String value) {
        this.yomiCompany = value;
    }
}
