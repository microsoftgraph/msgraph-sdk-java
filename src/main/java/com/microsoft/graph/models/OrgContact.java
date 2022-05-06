package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrgContact extends DirectoryObject implements Parsable {
    /** Postal addresses for this organizational contact. For now a contact can only have one physical address.  */
    private java.util.List<PhysicalOfficeAddress> _addresses;
    /** Name of the company that this organizational contact belong to. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _companyName;
    /** The name for the department in which the contact works. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _department;
    /** The contact's direct reports. (The users and contacts that have their manager property set to this contact.) Read-only. Nullable. Supports $expand.  */
    private java.util.List<DirectoryObject> _directReports;
    /** Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.  */
    private String _displayName;
    /** First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _givenName;
    /** Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _jobTitle;
    /** The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _mail;
    /** Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).  */
    private String _mailNickname;
    /** The user or contact that is this contact's manager. Read-only. Supports $expand.  */
    private DirectoryObject _manager;
    /** Groups that this contact is a member of. Read-only. Nullable. Supports $expand.  */
    private java.util.List<DirectoryObject> _memberOf;
    /** Date and time when this organizational contact was last synchronized from on-premises AD. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).  */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not).  */
    private java.util.List<OnPremisesProvisioningError> _onPremisesProvisioningErrors;
    /** true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).  Supports $filter (eq, ne, not, in, and eq on null values).  */
    private Boolean _onPremisesSyncEnabled;
    /** List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection. Supports $filter (eq, ne, not, in).  */
    private java.util.List<Phone> _phones;
    /** For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith).  */
    private java.util.List<String> _proxyAddresses;
    /** Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values)  */
    private String _surname;
    /** The transitiveMemberOf property  */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /**
     * Instantiates a new orgContact and sets the default values.
     * @return a void
     */
    public OrgContact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a orgContact
     */
    @javax.annotation.Nonnull
    public static OrgContact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrgContact();
    }
    /**
     * Gets the addresses property value. Postal addresses for this organizational contact. For now a contact can only have one physical address.
     * @return a physicalOfficeAddress
     */
    @javax.annotation.Nullable
    public java.util.List<PhysicalOfficeAddress> getAddresses() {
        return this._addresses;
    }
    /**
     * Gets the companyName property value. Name of the company that this organizational contact belong to. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this._companyName;
    }
    /**
     * Gets the department property value. The name for the department in which the contact works. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the directReports property value. The contact's direct reports. (The users and contacts that have their manager property set to this contact.) Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectReports() {
        return this._directReports;
    }
    /**
     * Gets the displayName property value. Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
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
        return new HashMap<>(super.getFieldDeserializers()) {{
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
     * Gets the givenName property value. First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
    }
    /**
     * Gets the jobTitle property value. Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this._jobTitle;
    }
    /**
     * Gets the mail property value. The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this._mail;
    }
    /**
     * Gets the mailNickname property value. Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the manager property value. The user or contact that is this contact's manager. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getManager() {
        return this._manager;
    }
    /**
     * Gets the memberOf property value. Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. Date and time when this organizational contact was last synchronized from on-premises AD. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not).
     * @return a onPremisesProvisioningError
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this._onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).  Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the phones property value. List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection. Supports $filter (eq, ne, not, in).
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this._phones;
    }
    /**
     * Gets the proxyAddresses property value. For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this._proxyAddresses;
    }
    /**
     * Gets the surname property value. Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values)
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
     * Sets the addresses property value. Postal addresses for this organizational contact. For now a contact can only have one physical address.
     * @param value Value to set for the addresses property.
     * @return a void
     */
    public void setAddresses(@javax.annotation.Nullable final java.util.List<PhysicalOfficeAddress> value) {
        this._addresses = value;
    }
    /**
     * Sets the companyName property value. Name of the company that this organizational contact belong to. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the companyName property.
     * @return a void
     */
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this._companyName = value;
    }
    /**
     * Sets the department property value. The name for the department in which the contact works. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the department property.
     * @return a void
     */
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the directReports property value. The contact's direct reports. (The users and contacts that have their manager property set to this contact.) Read-only. Nullable. Supports $expand.
     * @param value Value to set for the directReports property.
     * @return a void
     */
    public void setDirectReports(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._directReports = value;
    }
    /**
     * Sets the displayName property value. Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the givenName property value. First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the givenName property.
     * @return a void
     */
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
    }
    /**
     * Sets the jobTitle property value. Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this._jobTitle = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mail property.
     * @return a void
     */
    public void setMail(@javax.annotation.Nullable final String value) {
        this._mail = value;
    }
    /**
     * Sets the mailNickname property value. Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the manager property value. The user or contact that is this contact's manager. Read-only. Supports $expand.
     * @param value Value to set for the manager property.
     * @return a void
     */
    public void setManager(@javax.annotation.Nullable final DirectoryObject value) {
        this._manager = value;
    }
    /**
     * Sets the memberOf property value. Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. Date and time when this organizational contact was last synchronized from on-premises AD. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not).
     * @param value Value to set for the onPremisesProvisioningErrors property.
     * @return a void
     */
    public void setOnPremisesProvisioningErrors(@javax.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this._onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).  Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the phones property value. List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the phones property.
     * @return a void
     */
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this._phones = value;
    }
    /**
     * Sets the proxyAddresses property value. For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the proxyAddresses property.
     * @return a void
     */
    public void setProxyAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._proxyAddresses = value;
    }
    /**
     * Sets the surname property value. Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values)
     * @param value Value to set for the surname property.
     * @return a void
     */
    public void setSurname(@javax.annotation.Nullable final String value) {
        this._surname = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
}
