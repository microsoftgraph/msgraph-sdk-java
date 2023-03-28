package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrgContact extends DirectoryObject implements Parsable {
    /** The addresses property */
    private java.util.List<PhysicalOfficeAddress> addresses;
    /** The companyName property */
    private String companyName;
    /** The department property */
    private String department;
    /** The directReports property */
    private java.util.List<DirectoryObject> directReports;
    /** The displayName property */
    private String displayName;
    /** The givenName property */
    private String givenName;
    /** The jobTitle property */
    private String jobTitle;
    /** The mail property */
    private String mail;
    /** The mailNickname property */
    private String mailNickname;
    /** The manager property */
    private DirectoryObject manager;
    /** The memberOf property */
    private java.util.List<DirectoryObject> memberOf;
    /** The onPremisesLastSyncDateTime property */
    private OffsetDateTime onPremisesLastSyncDateTime;
    /** The onPremisesProvisioningErrors property */
    private java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;
    /** The onPremisesSyncEnabled property */
    private Boolean onPremisesSyncEnabled;
    /** The phones property */
    private java.util.List<Phone> phones;
    /** The proxyAddresses property */
    private java.util.List<String> proxyAddresses;
    /** The surname property */
    private String surname;
    /** The transitiveMemberOf property */
    private java.util.List<DirectoryObject> transitiveMemberOf;
    /**
     * Instantiates a new OrgContact and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrgContact() {
        super();
        this.setOdataType("#microsoft.graph.orgContact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrgContact
     */
    @javax.annotation.Nonnull
    public static OrgContact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrgContact();
    }
    /**
     * Gets the addresses property value. The addresses property
     * @return a physicalOfficeAddress
     */
    @javax.annotation.Nullable
    public java.util.List<PhysicalOfficeAddress> getAddresses() {
        return this.addresses;
    }
    /**
     * Gets the companyName property value. The companyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the department property value. The department property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the directReports property value. The directReports property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectReports() {
        return this.directReports;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(PhysicalOfficeAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("directReports", (n) -> { this.setDirectReports(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("mail", (n) -> { this.setMail(n.getStringValue()); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesProvisioningErrors", (n) -> { this.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("proxyAddresses", (n) -> { this.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The givenName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the mail property value. The mail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this.mail;
    }
    /**
     * Gets the mailNickname property value. The mailNickname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this.mailNickname;
    }
    /**
     * Gets the manager property value. The manager property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getManager() {
        return this.manager;
    }
    /**
     * Gets the memberOf property value. The memberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The onPremisesLastSyncDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. The onPremisesProvisioningErrors property
     * @return a onPremisesProvisioningError
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this.onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. The onPremisesSyncEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }
    /**
     * Gets the phones property value. The phones property
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.phones;
    }
    /**
     * Gets the proxyAddresses property value. The proxyAddresses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this.proxyAddresses;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.transitiveMemberOf;
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
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeCollectionOfObjectValues("directReports", this.getDirectReports());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("mail", this.getMail());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeCollectionOfObjectValues("onPremisesProvisioningErrors", this.getOnPremisesProvisioningErrors());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeCollectionOfPrimitiveValues("proxyAddresses", this.getProxyAddresses());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
    }
    /**
     * Sets the addresses property value. The addresses property
     * @param value Value to set for the addresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddresses(@javax.annotation.Nullable final java.util.List<PhysicalOfficeAddress> value) {
        this.addresses = value;
    }
    /**
     * Sets the companyName property value. The companyName property
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the department property value. The department property
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the directReports property value. The directReports property
     * @param value Value to set for the directReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectReports(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.directReports = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the mail property value. The mail property
     * @param value Value to set for the mail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMail(@javax.annotation.Nullable final String value) {
        this.mail = value;
    }
    /**
     * Sets the mailNickname property value. The mailNickname property
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this.mailNickname = value;
    }
    /**
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final DirectoryObject value) {
        this.manager = value;
    }
    /**
     * Sets the memberOf property value. The memberOf property
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.memberOf = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The onPremisesLastSyncDateTime property
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. The onPremisesProvisioningErrors property
     * @param value Value to set for the onPremisesProvisioningErrors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesProvisioningErrors(@javax.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this.onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. The onPremisesSyncEnabled property
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this.onPremisesSyncEnabled = value;
    }
    /**
     * Sets the phones property value. The phones property
     * @param value Value to set for the phones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this.phones = value;
    }
    /**
     * Sets the proxyAddresses property value. The proxyAddresses property
     * @param value Value to set for the proxyAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this.proxyAddresses = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.transitiveMemberOf = value;
    }
}
