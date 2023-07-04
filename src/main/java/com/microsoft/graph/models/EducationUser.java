package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationUser extends Entity implements Parsable {
    /**
     * True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    private Boolean accountEnabled;
    /**
     * The licenses that are assigned to the user. Not nullable.
     */
    private java.util.List<AssignedLicense> assignedLicenses;
    /**
     * The plans that are assigned to the user. Read-only. Not nullable.
     */
    private java.util.List<AssignedPlan> assignedPlans;
    /**
     * Assignments belonging to the user.
     */
    private java.util.List<EducationAssignment> assignments;
    /**
     * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     */
    private java.util.List<String> businessPhones;
    /**
     * Classes to which the user belongs. Nullable.
     */
    private java.util.List<EducationClass> classes;
    /**
     * The entity who created the user.
     */
    private IdentitySet createdBy;
    /**
     * The name for the department in which the user works. Supports $filter.
     */
    private String department;
    /**
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    private String displayName;
    /**
     * Where this user was created from. Possible values are: sis, manual.
     */
    private EducationExternalSource externalSource;
    /**
     * The name of the external source this resource was generated from.
     */
    private String externalSourceDetail;
    /**
     * The given name (first name) of the user. Supports $filter.
     */
    private String givenName;
    /**
     * The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Read-Only. Supports $filter.
     */
    private String mail;
    /**
     * The mail address of the user.
     */
    private PhysicalAddress mailingAddress;
    /**
     * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    private String mailNickname;
    /**
     * The middle name of the user.
     */
    private String middleName;
    /**
     * The primary cellular telephone number for the user.
     */
    private String mobilePhone;
    /**
     * The officeLocation property
     */
    private String officeLocation;
    /**
     * Additional information used to associate the Azure Active Directory user with its Active Directory counterpart.
     */
    private EducationOnPremisesInfo onPremisesInfo;
    /**
     * Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     */
    private String passwordPolicies;
    /**
     * Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    private PasswordProfile passwordProfile;
    /**
     * The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     */
    private String preferredLanguage;
    /**
     * The primaryRole property
     */
    private EducationUserRole primaryRole;
    /**
     * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    private java.util.List<ProvisionedPlan> provisionedPlans;
    /**
     * The refreshTokensValidFromDateTime property
     */
    private OffsetDateTime refreshTokensValidFromDateTime;
    /**
     * Related records associated with the user. Read-only.
     */
    private java.util.List<RelatedContact> relatedContacts;
    /**
     * The address where the user lives.
     */
    private PhysicalAddress residenceAddress;
    /**
     * When set, the grading rubric attached to the assignment.
     */
    private java.util.List<EducationRubric> rubrics;
    /**
     * Schools to which the user belongs. Nullable.
     */
    private java.util.List<EducationSchool> schools;
    /**
     * True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     */
    private Boolean showInAddressList;
    /**
     * If the primary role is student, this block will contain student specific data.
     */
    private EducationStudent student;
    /**
     * The user's surname (family name or last name). Supports $filter.
     */
    private String surname;
    /**
     * Classes for which the user is a teacher.
     */
    private java.util.List<EducationClass> taughtClasses;
    /**
     * If the primary role is teacher, this block will contain teacher specific data.
     */
    private EducationTeacher teacher;
    /**
     * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     */
    private String usageLocation;
    /**
     * The directory user that corresponds to this user.
     */
    private User user;
    /**
     * The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     */
    private String userPrincipalName;
    /**
     * A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     */
    private String userType;
    /**
     * Instantiates a new educationUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * Gets the accountEnabled property value. True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.accountEnabled;
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @return a AssignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this.assignedLicenses;
    }
    /**
     * Gets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @return a AssignedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.assignedPlans;
    }
    /**
     * Gets the assignments property value. Assignments belonging to the user.
     * @return a educationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.businessPhones;
    }
    /**
     * Gets the classes property value. Classes to which the user belongs. Nullable.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.classes;
    }
    /**
     * Gets the createdBy property value. The entity who created the user.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the department property value. The name for the department in which the user works. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalSource property value. Where this user was created from. Possible values are: sis, manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("assignedLicenses", (n) -> { this.setAssignedLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedPlans", (n) -> { this.setAssignedPlans(n.getCollectionOfObjectValues(AssignedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(EducationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("businessPhones", (n) -> { this.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("classes", (n) -> { this.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalSource", (n) -> { this.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
        deserializerMap.put("externalSourceDetail", (n) -> { this.setExternalSourceDetail(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("mail", (n) -> { this.setMail(n.getStringValue()); });
        deserializerMap.put("mailingAddress", (n) -> { this.setMailingAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("middleName", (n) -> { this.setMiddleName(n.getStringValue()); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("onPremisesInfo", (n) -> { this.setOnPremisesInfo(n.getObjectValue(EducationOnPremisesInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordPolicies", (n) -> { this.setPasswordPolicies(n.getStringValue()); });
        deserializerMap.put("passwordProfile", (n) -> { this.setPasswordProfile(n.getObjectValue(PasswordProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("preferredLanguage", (n) -> { this.setPreferredLanguage(n.getStringValue()); });
        deserializerMap.put("primaryRole", (n) -> { this.setPrimaryRole(n.getEnumValue(EducationUserRole.class)); });
        deserializerMap.put("provisionedPlans", (n) -> { this.setProvisionedPlans(n.getCollectionOfObjectValues(ProvisionedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("refreshTokensValidFromDateTime", (n) -> { this.setRefreshTokensValidFromDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("relatedContacts", (n) -> { this.setRelatedContacts(n.getCollectionOfObjectValues(RelatedContact::createFromDiscriminatorValue)); });
        deserializerMap.put("residenceAddress", (n) -> { this.setResidenceAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("rubrics", (n) -> { this.setRubrics(n.getCollectionOfObjectValues(EducationRubric::createFromDiscriminatorValue)); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
        deserializerMap.put("showInAddressList", (n) -> { this.setShowInAddressList(n.getBooleanValue()); });
        deserializerMap.put("student", (n) -> { this.setStudent(n.getObjectValue(EducationStudent::createFromDiscriminatorValue)); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("taughtClasses", (n) -> { this.setTaughtClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
        deserializerMap.put("teacher", (n) -> { this.setTeacher(n.getObjectValue(EducationTeacher::createFromDiscriminatorValue)); });
        deserializerMap.put("usageLocation", (n) -> { this.setUsageLocation(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The given name (first name) of the user. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the mail property value. The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Read-Only. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this.mail;
    }
    /**
     * Gets the mailingAddress property value. The mail address of the user.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getMailingAddress() {
        return this.mailingAddress;
    }
    /**
     * Gets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this.mailNickname;
    }
    /**
     * Gets the middleName property value. The middle name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Gets the mobilePhone property value. The primary cellular telephone number for the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    /**
     * Gets the officeLocation property value. The officeLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this.officeLocation;
    }
    /**
     * Gets the onPremisesInfo property value. Additional information used to associate the Azure Active Directory user with its Active Directory counterpart.
     * @return a educationOnPremisesInfo
     */
    @javax.annotation.Nullable
    public EducationOnPremisesInfo getOnPremisesInfo() {
        return this.onPremisesInfo;
    }
    /**
     * Gets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordPolicies() {
        return this.passwordPolicies;
    }
    /**
     * Gets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     * @return a passwordProfile
     */
    @javax.annotation.Nullable
    public PasswordProfile getPasswordProfile() {
        return this.passwordProfile;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }
    /**
     * Gets the primaryRole property value. The primaryRole property
     * @return a EducationUserRole
     */
    @javax.annotation.Nullable
    public EducationUserRole getPrimaryRole() {
        return this.primaryRole;
    }
    /**
     * Gets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @return a ProvisionedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.provisionedPlans;
    }
    /**
     * Gets the refreshTokensValidFromDateTime property value. The refreshTokensValidFromDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRefreshTokensValidFromDateTime() {
        return this.refreshTokensValidFromDateTime;
    }
    /**
     * Gets the relatedContacts property value. Related records associated with the user. Read-only.
     * @return a relatedContact
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedContact> getRelatedContacts() {
        return this.relatedContacts;
    }
    /**
     * Gets the residenceAddress property value. The address where the user lives.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getResidenceAddress() {
        return this.residenceAddress;
    }
    /**
     * Gets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @return a educationRubric
     */
    @javax.annotation.Nullable
    public java.util.List<EducationRubric> getRubrics() {
        return this.rubrics;
    }
    /**
     * Gets the schools property value. Schools to which the user belongs. Nullable.
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.schools;
    }
    /**
     * Gets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInAddressList() {
        return this.showInAddressList;
    }
    /**
     * Gets the student property value. If the primary role is student, this block will contain student specific data.
     * @return a educationStudent
     */
    @javax.annotation.Nullable
    public EducationStudent getStudent() {
        return this.student;
    }
    /**
     * Gets the surname property value. The user's surname (family name or last name). Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the taughtClasses property value. Classes for which the user is a teacher.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getTaughtClasses() {
        return this.taughtClasses;
    }
    /**
     * Gets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @return a educationTeacher
     */
    @javax.annotation.Nullable
    public EducationTeacher getTeacher() {
        return this.teacher;
    }
    /**
     * Gets the usageLocation property value. A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsageLocation() {
        return this.usageLocation;
    }
    /**
     * Gets the user property value. The directory user that corresponds to this user.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getUser() {
        return this.user;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserType() {
        return this.userType;
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
     * Sets the accountEnabled property value. True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this.accountEnabled = value;
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @param value Value to set for the assignedLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this.assignedLicenses = value;
    }
    /**
     * Sets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @param value Value to set for the assignedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedPlans(@javax.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this.assignedPlans = value;
    }
    /**
     * Sets the assignments property value. Assignments belonging to the user.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this.businessPhones = value;
    }
    /**
     * Sets the classes property value. Classes to which the user belongs. Nullable.
     * @param value Value to set for the classes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this.classes = value;
    }
    /**
     * Sets the createdBy property value. The entity who created the user.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the department property value. The name for the department in which the user works. Supports $filter.
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalSource property value. Where this user was created from. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this.externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this.externalSourceDetail = value;
    }
    /**
     * Sets the givenName property value. The given name (first name) of the user. Supports $filter.
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Read-Only. Supports $filter.
     * @param value Value to set for the mail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMail(@javax.annotation.Nullable final String value) {
        this.mail = value;
    }
    /**
     * Sets the mailingAddress property value. The mail address of the user.
     * @param value Value to set for the mailingAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailingAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this.mailingAddress = value;
    }
    /**
     * Sets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this.mailNickname = value;
    }
    /**
     * Sets the middleName property value. The middle name of the user.
     * @param value Value to set for the middleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddleName(@javax.annotation.Nullable final String value) {
        this.middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The primary cellular telephone number for the user.
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this.mobilePhone = value;
    }
    /**
     * Sets the officeLocation property value. The officeLocation property
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this.officeLocation = value;
    }
    /**
     * Sets the onPremisesInfo property value. Additional information used to associate the Azure Active Directory user with its Active Directory counterpart.
     * @param value Value to set for the onPremisesInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesInfo(@javax.annotation.Nullable final EducationOnPremisesInfo value) {
        this.onPremisesInfo = value;
    }
    /**
     * Sets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     * @param value Value to set for the passwordPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPolicies(@javax.annotation.Nullable final String value) {
        this.passwordPolicies = value;
    }
    /**
     * Sets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     * @param value Value to set for the passwordProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordProfile(@javax.annotation.Nullable final PasswordProfile value) {
        this.passwordProfile = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this.preferredLanguage = value;
    }
    /**
     * Sets the primaryRole property value. The primaryRole property
     * @param value Value to set for the primaryRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryRole(@javax.annotation.Nullable final EducationUserRole value) {
        this.primaryRole = value;
    }
    /**
     * Sets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionedPlans(@javax.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this.provisionedPlans = value;
    }
    /**
     * Sets the refreshTokensValidFromDateTime property value. The refreshTokensValidFromDateTime property
     * @param value Value to set for the refreshTokensValidFromDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRefreshTokensValidFromDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.refreshTokensValidFromDateTime = value;
    }
    /**
     * Sets the relatedContacts property value. Related records associated with the user. Read-only.
     * @param value Value to set for the relatedContacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelatedContacts(@javax.annotation.Nullable final java.util.List<RelatedContact> value) {
        this.relatedContacts = value;
    }
    /**
     * Sets the residenceAddress property value. The address where the user lives.
     * @param value Value to set for the residenceAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResidenceAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this.residenceAddress = value;
    }
    /**
     * Sets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @param value Value to set for the rubrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRubrics(@javax.annotation.Nullable final java.util.List<EducationRubric> value) {
        this.rubrics = value;
    }
    /**
     * Sets the schools property value. Schools to which the user belongs. Nullable.
     * @param value Value to set for the schools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.schools = value;
    }
    /**
     * Sets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @param value Value to set for the showInAddressList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowInAddressList(@javax.annotation.Nullable final Boolean value) {
        this.showInAddressList = value;
    }
    /**
     * Sets the student property value. If the primary role is student, this block will contain student specific data.
     * @param value Value to set for the student property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudent(@javax.annotation.Nullable final EducationStudent value) {
        this.student = value;
    }
    /**
     * Sets the surname property value. The user's surname (family name or last name). Supports $filter.
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the taughtClasses property value. Classes for which the user is a teacher.
     * @param value Value to set for the taughtClasses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaughtClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this.taughtClasses = value;
    }
    /**
     * Sets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @param value Value to set for the teacher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeacher(@javax.annotation.Nullable final EducationTeacher value) {
        this.teacher = value;
    }
    /**
     * Sets the usageLocation property value. A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     * @param value Value to set for the usageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageLocation(@javax.annotation.Nullable final String value) {
        this.usageLocation = value;
    }
    /**
     * Sets the user property value. The directory user that corresponds to this user.
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final User value) {
        this.user = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final String value) {
        this.userType = value;
    }
}
