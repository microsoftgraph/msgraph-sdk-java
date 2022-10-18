package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrgContact extends DirectoryObject implements Parsable {
    /** The addresses property */
    private java.util.List<PhysicalOfficeAddress> _addresses;
    /** The companyName property */
    private String _companyName;
    /** The department property */
    private String _department;
    /** The directReports property */
    private java.util.List<DirectoryObject> _directReports;
    /** The displayName property */
    private String _displayName;
    /** The givenName property */
    private String _givenName;
    /** The jobTitle property */
    private String _jobTitle;
    /** The mail property */
    private String _mail;
    /** The mailNickname property */
    private String _mailNickname;
    /** The manager property */
    private DirectoryObject _manager;
    /** The memberOf property */
    private java.util.List<DirectoryObject> _memberOf;
    /** The onPremisesLastSyncDateTime property */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** The onPremisesProvisioningErrors property */
    private java.util.List<OnPremisesProvisioningError> _onPremisesProvisioningErrors;
    /** The onPremisesSyncEnabled property */
    private Boolean _onPremisesSyncEnabled;
    /** The phones property */
    private java.util.List<Phone> _phones;
    /** The proxyAddresses property */
    private java.util.List<String> _proxyAddresses;
    /** The surname property */
    private String _surname;
    /** The transitiveMemberOf property */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
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
        return this._addresses;
    }
    /**
     * Gets the companyName property value. The companyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this._companyName;
    }
    /**
     * Gets the department property value. The department property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the directReports property value. The directReports property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectReports() {
        return this._directReports;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final OrgContact currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("addresses", (n) -> { currentObject.setAddresses(n.getCollectionOfObjectValues(PhysicalOfficeAddress::createFromDiscriminatorValue)); });
            this.put("companyName", (n) -> { currentObject.setCompanyName(n.getStringValue()); });
            this.put("department", (n) -> { currentObject.setDepartment(n.getStringValue()); });
            this.put("directReports", (n) -> { currentObject.setDirectReports(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("givenName", (n) -> { currentObject.setGivenName(n.getStringValue()); });
            this.put("jobTitle", (n) -> { currentObject.setJobTitle(n.getStringValue()); });
            this.put("mail", (n) -> { currentObject.setMail(n.getStringValue()); });
            this.put("mailNickname", (n) -> { currentObject.setMailNickname(n.getStringValue()); });
            this.put("manager", (n) -> { currentObject.setManager(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("memberOf", (n) -> { currentObject.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("onPremisesLastSyncDateTime", (n) -> { currentObject.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("onPremisesProvisioningErrors", (n) -> { currentObject.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
            this.put("onPremisesSyncEnabled", (n) -> { currentObject.setOnPremisesSyncEnabled(n.getBooleanValue()); });
            this.put("phones", (n) -> { currentObject.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
            this.put("proxyAddresses", (n) -> { currentObject.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("surname", (n) -> { currentObject.setSurname(n.getStringValue()); });
            this.put("transitiveMemberOf", (n) -> { currentObject.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the givenName property value. The givenName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
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
     * Gets the mail property value. The mail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this._mail;
    }
    /**
     * Gets the mailNickname property value. The mailNickname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the manager property value. The manager property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getManager() {
        return this._manager;
    }
    /**
     * Gets the memberOf property value. The memberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The onPremisesLastSyncDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. The onPremisesProvisioningErrors property
     * @return a onPremisesProvisioningError
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this._onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. The onPremisesSyncEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the phones property value. The phones property
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this._phones;
    }
    /**
     * Gets the proxyAddresses property value. The proxyAddresses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this._proxyAddresses;
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
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
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
        this._addresses = value;
    }
    /**
     * Sets the companyName property value. The companyName property
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this._companyName = value;
    }
    /**
     * Sets the department property value. The department property
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the directReports property value. The directReports property
     * @param value Value to set for the directReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectReports(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._directReports = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
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
     * Sets the mail property value. The mail property
     * @param value Value to set for the mail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMail(@javax.annotation.Nullable final String value) {
        this._mail = value;
    }
    /**
     * Sets the mailNickname property value. The mailNickname property
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final DirectoryObject value) {
        this._manager = value;
    }
    /**
     * Sets the memberOf property value. The memberOf property
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The onPremisesLastSyncDateTime property
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. The onPremisesProvisioningErrors property
     * @param value Value to set for the onPremisesProvisioningErrors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesProvisioningErrors(@javax.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this._onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. The onPremisesSyncEnabled property
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the phones property value. The phones property
     * @param value Value to set for the phones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this._phones = value;
    }
    /**
     * Sets the proxyAddresses property value. The proxyAddresses property
     * @param value Value to set for the proxyAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._proxyAddresses = value;
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
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
}
