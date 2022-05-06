package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationUser extends Entity implements Parsable {
    /** True if the account is enabled; otherwise, false. This property is required when a user is created. Supports /$filter.  */
    private Boolean _accountEnabled;
    /** The licenses that are assigned to the user. Not nullable.  */
    private java.util.List<AssignedLicense> _assignedLicenses;
    /** The plans that are assigned to the user. Read-only. Not nullable.  */
    private java.util.List<AssignedPlan> _assignedPlans;
    /** List of assignments for the user. Nullable.  */
    private java.util.List<EducationAssignment> _assignments;
    /** The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.  */
    private java.util.List<String> _businessPhones;
    /** Classes to which the user belongs. Nullable.  */
    private java.util.List<EducationClass> _classes;
    /** Entity who created the user.  */
    private IdentitySet _createdBy;
    /** The name for the department in which the user works. Supports /$filter.  */
    private String _department;
    /** The name displayed in the address book for the user. Supports $filter and $orderby.  */
    private String _displayName;
    /** The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.  */
    private EducationExternalSource _externalSource;
    /** The name of the external source this resources was generated from.  */
    private String _externalSourceDetail;
    /** The given name (first name) of the user. Supports /$filter.  */
    private String _givenName;
    /** The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports /$filter.  */
    private String _mail;
    /** Mail address of user. Note: type and postOfficeBox are not supported for educationUser resources.  */
    private PhysicalAddress _mailingAddress;
    /** The mail alias for the user. This property must be specified when a user is created. Supports /$filter.  */
    private String _mailNickname;
    /** The middle name of user.  */
    private String _middleName;
    /** The primary cellular telephone number for the user.  */
    private String _mobilePhone;
    /** The officeLocation property  */
    private String _officeLocation;
    /** Additional information used to associate the AAD user with it's Active Directory counterpart.  */
    private EducationOnPremisesInfo _onPremisesInfo;
    /** Specifies password policies for the user. See standard [user] resource for additional details.  */
    private String _passwordPolicies;
    /** Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. See standard [user] resource for additional details.  */
    private PasswordProfile _passwordProfile;
    /** The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.  */
    private String _preferredLanguage;
    /** Default role for a user. The user's role might be different in an individual class. Possible values are: student, teacher, faculty. Supports /$filter.  */
    private EducationUserRole _primaryRole;
    /** The plans that are provisioned for the user. Read-only. Not nullable.  */
    private java.util.List<ProvisionedPlan> _provisionedPlans;
    /** The refreshTokensValidFromDateTime property  */
    private OffsetDateTime _refreshTokensValidFromDateTime;
    /** Related records related to the user. Possible relationships are parent, relative, aide, doctor, guardian, child, other, unknownFutureValue  */
    private java.util.List<RelatedContact> _relatedContacts;
    /** Address where user lives. Note: type and postOfficeBox are not supported for educationUser resources.  */
    private PhysicalAddress _residenceAddress;
    /** When set, the grading rubric attached to the assignment.  */
    private java.util.List<EducationRubric> _rubrics;
    /** Schools to which the user belongs. Nullable.  */
    private java.util.List<EducationSchool> _schools;
    /** True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.  */
    private Boolean _showInAddressList;
    /** If the primary role is student, this block will contain student specific data.  */
    private EducationStudent _student;
    /** The user's surname (family name or last name). Supports /$filter.  */
    private String _surname;
    /** Classes for which the user is a teacher.  */
    private java.util.List<EducationClass> _taughtClasses;
    /** If the primary role is teacher, this block will contain teacher specific data.  */
    private EducationTeacher _teacher;
    /** A two-letter country code ([ISO 3166 Alpha-2]). Required for users who will be assigned licenses. Not nullable. Supports /$filter.  */
    private String _usageLocation;
    /** The directory user that corresponds to this user.  */
    private User _user;
    /** The user principal name (UPN) for the user. Supports $filter and $orderby. See standard [user] resource for additional details.  */
    private String _userPrincipalName;
    /** A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports /$filter.  */
    private String _userType;
    /**
     * Instantiates a new educationUser and sets the default values.
     * @return a void
     */
    public EducationUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationUser
     */
    @javax.annotation.Nonnull
    public static EducationUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationUser();
    }
    /**
     * Gets the accountEnabled property value. True if the account is enabled; otherwise, false. This property is required when a user is created. Supports /$filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @return a assignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this._assignedLicenses;
    }
    /**
     * Gets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @return a assignedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this._assignedPlans;
    }
    /**
     * Gets the assignments property value. List of assignments for the user. Nullable.
     * @return a educationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this._businessPhones;
    }
    /**
     * Gets the classes property value. Classes to which the user belongs. Nullable.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this._classes;
    }
    /**
     * Gets the createdBy property value. Entity who created the user.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the department property value. The name for the department in which the user works. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. Supports $filter and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalSource property value. The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this._externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this._externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationUser currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountEnabled", (n) -> { currentObject.setAccountEnabled(n.getBooleanValue()); });
            this.put("assignedLicenses", (n) -> { currentObject.setAssignedLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
            this.put("assignedPlans", (n) -> { currentObject.setAssignedPlans(n.getCollectionOfObjectValues(AssignedPlan::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(EducationAssignment::createFromDiscriminatorValue)); });
            this.put("businessPhones", (n) -> { currentObject.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("classes", (n) -> { currentObject.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("department", (n) -> { currentObject.setDepartment(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalSource", (n) -> { currentObject.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
            this.put("externalSourceDetail", (n) -> { currentObject.setExternalSourceDetail(n.getStringValue()); });
            this.put("givenName", (n) -> { currentObject.setGivenName(n.getStringValue()); });
            this.put("mail", (n) -> { currentObject.setMail(n.getStringValue()); });
            this.put("mailingAddress", (n) -> { currentObject.setMailingAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("mailNickname", (n) -> { currentObject.setMailNickname(n.getStringValue()); });
            this.put("middleName", (n) -> { currentObject.setMiddleName(n.getStringValue()); });
            this.put("mobilePhone", (n) -> { currentObject.setMobilePhone(n.getStringValue()); });
            this.put("officeLocation", (n) -> { currentObject.setOfficeLocation(n.getStringValue()); });
            this.put("onPremisesInfo", (n) -> { currentObject.setOnPremisesInfo(n.getObjectValue(EducationOnPremisesInfo::createFromDiscriminatorValue)); });
            this.put("passwordPolicies", (n) -> { currentObject.setPasswordPolicies(n.getStringValue()); });
            this.put("passwordProfile", (n) -> { currentObject.setPasswordProfile(n.getObjectValue(PasswordProfile::createFromDiscriminatorValue)); });
            this.put("preferredLanguage", (n) -> { currentObject.setPreferredLanguage(n.getStringValue()); });
            this.put("primaryRole", (n) -> { currentObject.setPrimaryRole(n.getEnumValue(EducationUserRole.class)); });
            this.put("provisionedPlans", (n) -> { currentObject.setProvisionedPlans(n.getCollectionOfObjectValues(ProvisionedPlan::createFromDiscriminatorValue)); });
            this.put("refreshTokensValidFromDateTime", (n) -> { currentObject.setRefreshTokensValidFromDateTime(n.getOffsetDateTimeValue()); });
            this.put("relatedContacts", (n) -> { currentObject.setRelatedContacts(n.getCollectionOfObjectValues(RelatedContact::createFromDiscriminatorValue)); });
            this.put("residenceAddress", (n) -> { currentObject.setResidenceAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("rubrics", (n) -> { currentObject.setRubrics(n.getCollectionOfObjectValues(EducationRubric::createFromDiscriminatorValue)); });
            this.put("schools", (n) -> { currentObject.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
            this.put("showInAddressList", (n) -> { currentObject.setShowInAddressList(n.getBooleanValue()); });
            this.put("student", (n) -> { currentObject.setStudent(n.getObjectValue(EducationStudent::createFromDiscriminatorValue)); });
            this.put("surname", (n) -> { currentObject.setSurname(n.getStringValue()); });
            this.put("taughtClasses", (n) -> { currentObject.setTaughtClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
            this.put("teacher", (n) -> { currentObject.setTeacher(n.getObjectValue(EducationTeacher::createFromDiscriminatorValue)); });
            this.put("usageLocation", (n) -> { currentObject.setUsageLocation(n.getStringValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("userType", (n) -> { currentObject.setUserType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the givenName property value. The given name (first name) of the user. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
    }
    /**
     * Gets the mail property value. The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this._mail;
    }
    /**
     * Gets the mailingAddress property value. Mail address of user. Note: type and postOfficeBox are not supported for educationUser resources.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getMailingAddress() {
        return this._mailingAddress;
    }
    /**
     * Gets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the middleName property value. The middle name of user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddleName() {
        return this._middleName;
    }
    /**
     * Gets the mobilePhone property value. The primary cellular telephone number for the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this._mobilePhone;
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
     * Gets the onPremisesInfo property value. Additional information used to associate the AAD user with it's Active Directory counterpart.
     * @return a educationOnPremisesInfo
     */
    @javax.annotation.Nullable
    public EducationOnPremisesInfo getOnPremisesInfo() {
        return this._onPremisesInfo;
    }
    /**
     * Gets the passwordPolicies property value. Specifies password policies for the user. See standard [user] resource for additional details.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordPolicies() {
        return this._passwordPolicies;
    }
    /**
     * Gets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. See standard [user] resource for additional details.
     * @return a passwordProfile
     */
    @javax.annotation.Nullable
    public PasswordProfile getPasswordProfile() {
        return this._passwordProfile;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this._preferredLanguage;
    }
    /**
     * Gets the primaryRole property value. Default role for a user. The user's role might be different in an individual class. Possible values are: student, teacher, faculty. Supports /$filter.
     * @return a educationUserRole
     */
    @javax.annotation.Nullable
    public EducationUserRole getPrimaryRole() {
        return this._primaryRole;
    }
    /**
     * Gets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @return a provisionedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this._provisionedPlans;
    }
    /**
     * Gets the refreshTokensValidFromDateTime property value. The refreshTokensValidFromDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRefreshTokensValidFromDateTime() {
        return this._refreshTokensValidFromDateTime;
    }
    /**
     * Gets the relatedContacts property value. Related records related to the user. Possible relationships are parent, relative, aide, doctor, guardian, child, other, unknownFutureValue
     * @return a relatedContact
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedContact> getRelatedContacts() {
        return this._relatedContacts;
    }
    /**
     * Gets the residenceAddress property value. Address where user lives. Note: type and postOfficeBox are not supported for educationUser resources.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getResidenceAddress() {
        return this._residenceAddress;
    }
    /**
     * Gets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @return a educationRubric
     */
    @javax.annotation.Nullable
    public java.util.List<EducationRubric> getRubrics() {
        return this._rubrics;
    }
    /**
     * Gets the schools property value. Schools to which the user belongs. Nullable.
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this._schools;
    }
    /**
     * Gets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInAddressList() {
        return this._showInAddressList;
    }
    /**
     * Gets the student property value. If the primary role is student, this block will contain student specific data.
     * @return a educationStudent
     */
    @javax.annotation.Nullable
    public EducationStudent getStudent() {
        return this._student;
    }
    /**
     * Gets the surname property value. The user's surname (family name or last name). Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this._surname;
    }
    /**
     * Gets the taughtClasses property value. Classes for which the user is a teacher.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getTaughtClasses() {
        return this._taughtClasses;
    }
    /**
     * Gets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @return a educationTeacher
     */
    @javax.annotation.Nullable
    public EducationTeacher getTeacher() {
        return this._teacher;
    }
    /**
     * Gets the usageLocation property value. A two-letter country code ([ISO 3166 Alpha-2]). Required for users who will be assigned licenses. Not nullable. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsageLocation() {
        return this._usageLocation;
    }
    /**
     * Gets the user property value. The directory user that corresponds to this user.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getUser() {
        return this._user;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) for the user. Supports $filter and $orderby. See standard [user] resource for additional details.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userType property value. A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports /$filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserType() {
        return this._userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("assignedLicenses", this.getAssignedLicenses());
        writer.writeCollectionOfObjectValues("assignedPlans", this.getAssignedPlans());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeCollectionOfObjectValues("classes", this.getClasses());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("externalSource", this.getExternalSource());
        writer.writeStringValue("externalSourceDetail", this.getExternalSourceDetail());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("mail", this.getMail());
        writer.writeObjectValue("mailingAddress", this.getMailingAddress());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeObjectValue("onPremisesInfo", this.getOnPremisesInfo());
        writer.writeStringValue("passwordPolicies", this.getPasswordPolicies());
        writer.writeObjectValue("passwordProfile", this.getPasswordProfile());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeEnumValue("primaryRole", this.getPrimaryRole());
        writer.writeCollectionOfObjectValues("provisionedPlans", this.getProvisionedPlans());
        writer.writeOffsetDateTimeValue("refreshTokensValidFromDateTime", this.getRefreshTokensValidFromDateTime());
        writer.writeCollectionOfObjectValues("relatedContacts", this.getRelatedContacts());
        writer.writeObjectValue("residenceAddress", this.getResidenceAddress());
        writer.writeCollectionOfObjectValues("rubrics", this.getRubrics());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeBooleanValue("showInAddressList", this.getShowInAddressList());
        writer.writeObjectValue("student", this.getStudent());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeCollectionOfObjectValues("taughtClasses", this.getTaughtClasses());
        writer.writeObjectValue("teacher", this.getTeacher());
        writer.writeStringValue("usageLocation", this.getUsageLocation());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("userType", this.getUserType());
    }
    /**
     * Sets the accountEnabled property value. True if the account is enabled; otherwise, false. This property is required when a user is created. Supports /$filter.
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @param value Value to set for the assignedLicenses property.
     * @return a void
     */
    public void setAssignedLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this._assignedLicenses = value;
    }
    /**
     * Sets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @param value Value to set for the assignedPlans property.
     * @return a void
     */
    public void setAssignedPlans(@javax.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this._assignedPlans = value;
    }
    /**
     * Sets the assignments property value. List of assignments for the user. Nullable.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._businessPhones = value;
    }
    /**
     * Sets the classes property value. Classes to which the user belongs. Nullable.
     * @param value Value to set for the classes property.
     * @return a void
     */
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this._classes = value;
    }
    /**
     * Sets the createdBy property value. Entity who created the user.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the department property value. The name for the department in which the user works. Supports /$filter.
     * @param value Value to set for the department property.
     * @return a void
     */
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalSource property value. The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this._externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this._externalSourceDetail = value;
    }
    /**
     * Sets the givenName property value. The given name (first name) of the user. Supports /$filter.
     * @param value Value to set for the givenName property.
     * @return a void
     */
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports /$filter.
     * @param value Value to set for the mail property.
     * @return a void
     */
    public void setMail(@javax.annotation.Nullable final String value) {
        this._mail = value;
    }
    /**
     * Sets the mailingAddress property value. Mail address of user. Note: type and postOfficeBox are not supported for educationUser resources.
     * @param value Value to set for the mailingAddress property.
     * @return a void
     */
    public void setMailingAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._mailingAddress = value;
    }
    /**
     * Sets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports /$filter.
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the middleName property value. The middle name of user.
     * @param value Value to set for the middleName property.
     * @return a void
     */
    public void setMiddleName(@javax.annotation.Nullable final String value) {
        this._middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The primary cellular telephone number for the user.
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this._mobilePhone = value;
    }
    /**
     * Sets the officeLocation property value. The officeLocation property
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this._officeLocation = value;
    }
    /**
     * Sets the onPremisesInfo property value. Additional information used to associate the AAD user with it's Active Directory counterpart.
     * @param value Value to set for the onPremisesInfo property.
     * @return a void
     */
    public void setOnPremisesInfo(@javax.annotation.Nullable final EducationOnPremisesInfo value) {
        this._onPremisesInfo = value;
    }
    /**
     * Sets the passwordPolicies property value. Specifies password policies for the user. See standard [user] resource for additional details.
     * @param value Value to set for the passwordPolicies property.
     * @return a void
     */
    public void setPasswordPolicies(@javax.annotation.Nullable final String value) {
        this._passwordPolicies = value;
    }
    /**
     * Sets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. See standard [user] resource for additional details.
     * @param value Value to set for the passwordProfile property.
     * @return a void
     */
    public void setPasswordProfile(@javax.annotation.Nullable final PasswordProfile value) {
        this._passwordProfile = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this._preferredLanguage = value;
    }
    /**
     * Sets the primaryRole property value. Default role for a user. The user's role might be different in an individual class. Possible values are: student, teacher, faculty. Supports /$filter.
     * @param value Value to set for the primaryRole property.
     * @return a void
     */
    public void setPrimaryRole(@javax.annotation.Nullable final EducationUserRole value) {
        this._primaryRole = value;
    }
    /**
     * Sets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     * @return a void
     */
    public void setProvisionedPlans(@javax.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this._provisionedPlans = value;
    }
    /**
     * Sets the refreshTokensValidFromDateTime property value. The refreshTokensValidFromDateTime property
     * @param value Value to set for the refreshTokensValidFromDateTime property.
     * @return a void
     */
    public void setRefreshTokensValidFromDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._refreshTokensValidFromDateTime = value;
    }
    /**
     * Sets the relatedContacts property value. Related records related to the user. Possible relationships are parent, relative, aide, doctor, guardian, child, other, unknownFutureValue
     * @param value Value to set for the relatedContacts property.
     * @return a void
     */
    public void setRelatedContacts(@javax.annotation.Nullable final java.util.List<RelatedContact> value) {
        this._relatedContacts = value;
    }
    /**
     * Sets the residenceAddress property value. Address where user lives. Note: type and postOfficeBox are not supported for educationUser resources.
     * @param value Value to set for the residenceAddress property.
     * @return a void
     */
    public void setResidenceAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._residenceAddress = value;
    }
    /**
     * Sets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @param value Value to set for the rubrics property.
     * @return a void
     */
    public void setRubrics(@javax.annotation.Nullable final java.util.List<EducationRubric> value) {
        this._rubrics = value;
    }
    /**
     * Sets the schools property value. Schools to which the user belongs. Nullable.
     * @param value Value to set for the schools property.
     * @return a void
     */
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this._schools = value;
    }
    /**
     * Sets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @param value Value to set for the showInAddressList property.
     * @return a void
     */
    public void setShowInAddressList(@javax.annotation.Nullable final Boolean value) {
        this._showInAddressList = value;
    }
    /**
     * Sets the student property value. If the primary role is student, this block will contain student specific data.
     * @param value Value to set for the student property.
     * @return a void
     */
    public void setStudent(@javax.annotation.Nullable final EducationStudent value) {
        this._student = value;
    }
    /**
     * Sets the surname property value. The user's surname (family name or last name). Supports /$filter.
     * @param value Value to set for the surname property.
     * @return a void
     */
    public void setSurname(@javax.annotation.Nullable final String value) {
        this._surname = value;
    }
    /**
     * Sets the taughtClasses property value. Classes for which the user is a teacher.
     * @param value Value to set for the taughtClasses property.
     * @return a void
     */
    public void setTaughtClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this._taughtClasses = value;
    }
    /**
     * Sets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @param value Value to set for the teacher property.
     * @return a void
     */
    public void setTeacher(@javax.annotation.Nullable final EducationTeacher value) {
        this._teacher = value;
    }
    /**
     * Sets the usageLocation property value. A two-letter country code ([ISO 3166 Alpha-2]). Required for users who will be assigned licenses. Not nullable. Supports /$filter.
     * @param value Value to set for the usageLocation property.
     * @return a void
     */
    public void setUsageLocation(@javax.annotation.Nullable final String value) {
        this._usageLocation = value;
    }
    /**
     * Sets the user property value. The directory user that corresponds to this user.
     * @param value Value to set for the user property.
     * @return a void
     */
    public void setUser(@javax.annotation.Nullable final User value) {
        this._user = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) for the user. Supports $filter and $orderby. See standard [user] resource for additional details.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userType property value. A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports /$filter.
     * @param value Value to set for the userType property.
     * @return a void
     */
    public void setUserType(@javax.annotation.Nullable final String value) {
        this._userType = value;
    }
}
