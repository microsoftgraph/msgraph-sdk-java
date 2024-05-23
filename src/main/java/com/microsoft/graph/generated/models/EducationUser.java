package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationUser extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationUser} and sets the default values.
     */
    public EducationUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationUser}
     */
    @jakarta.annotation.Nonnull
    public static EducationUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationUser();
    }
    /**
     * Gets the accountEnabled property value. True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.backingStore.get("accountEnabled");
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @return a {@link java.util.List<AssignedLicense>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this.backingStore.get("assignedLicenses");
    }
    /**
     * Gets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @return a {@link java.util.List<AssignedPlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.backingStore.get("assignedPlans");
    }
    /**
     * Gets the assignments property value. Assignments belonging to the user.
     * @return a {@link java.util.List<EducationAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.backingStore.get("businessPhones");
    }
    /**
     * Gets the classes property value. Classes to which the user belongs. Nullable.
     * @return a {@link java.util.List<EducationClass>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.backingStore.get("classes");
    }
    /**
     * Gets the createdBy property value. The entity who created the user.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the department property value. The name for the department in which the user works. Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalSource property value. Where this user was created from. Possible values are: sis, manual.
     * @return a {@link EducationExternalSource}
     */
    @jakarta.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.backingStore.get("externalSource");
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.backingStore.get("externalSourceDetail");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("externalSource", (n) -> { this.setExternalSource(n.getEnumValue(EducationExternalSource::forValue)); });
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
        deserializerMap.put("primaryRole", (n) -> { this.setPrimaryRole(n.getEnumValue(EducationUserRole::forValue)); });
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the mail property value. The SMTP address for the user, for example, jeff@contoso.com. Read-Only. Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMail() {
        return this.backingStore.get("mail");
    }
    /**
     * Gets the mailingAddress property value. The mail address of the user.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getMailingAddress() {
        return this.backingStore.get("mailingAddress");
    }
    /**
     * Gets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailNickname() {
        return this.backingStore.get("mailNickname");
    }
    /**
     * Gets the middleName property value. The middle name of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMiddleName() {
        return this.backingStore.get("middleName");
    }
    /**
     * Gets the mobilePhone property value. The primary cellular telephone number for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobilePhone() {
        return this.backingStore.get("mobilePhone");
    }
    /**
     * Gets the officeLocation property value. The office location for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.backingStore.get("officeLocation");
    }
    /**
     * Gets the onPremisesInfo property value. Additional information used to associate the Microsoft Entra user with its Active Directory counterpart.
     * @return a {@link EducationOnPremisesInfo}
     */
    @jakarta.annotation.Nullable
    public EducationOnPremisesInfo getOnPremisesInfo() {
        return this.backingStore.get("onPremisesInfo");
    }
    /**
     * Gets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordPolicies() {
        return this.backingStore.get("passwordPolicies");
    }
    /**
     * Gets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     * @return a {@link PasswordProfile}
     */
    @jakarta.annotation.Nullable
    public PasswordProfile getPasswordProfile() {
        return this.backingStore.get("passwordProfile");
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredLanguage() {
        return this.backingStore.get("preferredLanguage");
    }
    /**
     * Gets the primaryRole property value. The primaryRole property
     * @return a {@link EducationUserRole}
     */
    @jakarta.annotation.Nullable
    public EducationUserRole getPrimaryRole() {
        return this.backingStore.get("primaryRole");
    }
    /**
     * Gets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @return a {@link java.util.List<ProvisionedPlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.backingStore.get("provisionedPlans");
    }
    /**
     * Gets the refreshTokensValidFromDateTime property value. Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application needs to acquire a new refresh token by requesting the authorized endpoint. Returned only on $select. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRefreshTokensValidFromDateTime() {
        return this.backingStore.get("refreshTokensValidFromDateTime");
    }
    /**
     * Gets the relatedContacts property value. Related records associated with the user. Read-only.
     * @return a {@link java.util.List<RelatedContact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedContact> getRelatedContacts() {
        return this.backingStore.get("relatedContacts");
    }
    /**
     * Gets the residenceAddress property value. The address where the user lives.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getResidenceAddress() {
        return this.backingStore.get("residenceAddress");
    }
    /**
     * Gets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @return a {@link java.util.List<EducationRubric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationRubric> getRubrics() {
        return this.backingStore.get("rubrics");
    }
    /**
     * Gets the schools property value. Schools to which the user belongs. Nullable.
     * @return a {@link java.util.List<EducationSchool>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.backingStore.get("schools");
    }
    /**
     * Gets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowInAddressList() {
        return this.backingStore.get("showInAddressList");
    }
    /**
     * Gets the student property value. If the primary role is student, this block will contain student specific data.
     * @return a {@link EducationStudent}
     */
    @jakarta.annotation.Nullable
    public EducationStudent getStudent() {
        return this.backingStore.get("student");
    }
    /**
     * Gets the surname property value. The user's surname (family name or last name). Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.backingStore.get("surname");
    }
    /**
     * Gets the taughtClasses property value. Classes for which the user is a teacher.
     * @return a {@link java.util.List<EducationClass>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationClass> getTaughtClasses() {
        return this.backingStore.get("taughtClasses");
    }
    /**
     * Gets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @return a {@link EducationTeacher}
     */
    @jakarta.annotation.Nullable
    public EducationTeacher getTeacher() {
        return this.backingStore.get("teacher");
    }
    /**
     * Gets the usageLocation property value. A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsageLocation() {
        return this.backingStore.get("usageLocation");
    }
    /**
     * Gets the user property value. The directory user that corresponds to this user.
     * @return a {@link User}
     */
    @jakarta.annotation.Nullable
    public User getUser() {
        return this.backingStore.get("user");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccountEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accountEnabled", value);
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the user. Not nullable.
     * @param value Value to set for the assignedLicenses property.
     */
    public void setAssignedLicenses(@jakarta.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this.backingStore.set("assignedLicenses", value);
    }
    /**
     * Sets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable.
     * @param value Value to set for the assignedPlans property.
     */
    public void setAssignedPlans(@jakarta.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this.backingStore.set("assignedPlans", value);
    }
    /**
     * Sets the assignments property value. Assignments belonging to the user.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the businessPhones property value. The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     */
    public void setBusinessPhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("businessPhones", value);
    }
    /**
     * Sets the classes property value. Classes to which the user belongs. Nullable.
     * @param value Value to set for the classes property.
     */
    public void setClasses(@jakarta.annotation.Nullable final java.util.List<EducationClass> value) {
        this.backingStore.set("classes", value);
    }
    /**
     * Sets the createdBy property value. The entity who created the user.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the department property value. The name for the department in which the user works. Supports $filter.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalSource property value. Where this user was created from. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     */
    public void setExternalSource(@jakarta.annotation.Nullable final EducationExternalSource value) {
        this.backingStore.set("externalSource", value);
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resource was generated from.
     * @param value Value to set for the externalSourceDetail property.
     */
    public void setExternalSourceDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalSourceDetail", value);
    }
    /**
     * Sets the givenName property value. The given name (first name) of the user. Supports $filter.
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the mail property value. The SMTP address for the user, for example, jeff@contoso.com. Read-Only. Supports $filter.
     * @param value Value to set for the mail property.
     */
    public void setMail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mail", value);
    }
    /**
     * Sets the mailingAddress property value. The mail address of the user.
     * @param value Value to set for the mailingAddress property.
     */
    public void setMailingAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("mailingAddress", value);
    }
    /**
     * Sets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     * @param value Value to set for the mailNickname property.
     */
    public void setMailNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailNickname", value);
    }
    /**
     * Sets the middleName property value. The middle name of the user.
     * @param value Value to set for the middleName property.
     */
    public void setMiddleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("middleName", value);
    }
    /**
     * Sets the mobilePhone property value. The primary cellular telephone number for the user.
     * @param value Value to set for the mobilePhone property.
     */
    public void setMobilePhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobilePhone", value);
    }
    /**
     * Sets the officeLocation property value. The office location for the user.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("officeLocation", value);
    }
    /**
     * Sets the onPremisesInfo property value. Additional information used to associate the Microsoft Entra user with its Active Directory counterpart.
     * @param value Value to set for the onPremisesInfo property.
     */
    public void setOnPremisesInfo(@jakarta.annotation.Nullable final EducationOnPremisesInfo value) {
        this.backingStore.set("onPremisesInfo", value);
    }
    /**
     * Sets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     * @param value Value to set for the passwordPolicies property.
     */
    public void setPasswordPolicies(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordPolicies", value);
    }
    /**
     * Sets the passwordProfile property value. Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     * @param value Value to set for the passwordProfile property.
     */
    public void setPasswordProfile(@jakarta.annotation.Nullable final PasswordProfile value) {
        this.backingStore.set("passwordProfile", value);
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     * @param value Value to set for the preferredLanguage property.
     */
    public void setPreferredLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredLanguage", value);
    }
    /**
     * Sets the primaryRole property value. The primaryRole property
     * @param value Value to set for the primaryRole property.
     */
    public void setPrimaryRole(@jakarta.annotation.Nullable final EducationUserRole value) {
        this.backingStore.set("primaryRole", value);
    }
    /**
     * Sets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     */
    public void setProvisionedPlans(@jakarta.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this.backingStore.set("provisionedPlans", value);
    }
    /**
     * Sets the refreshTokensValidFromDateTime property value. Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application needs to acquire a new refresh token by requesting the authorized endpoint. Returned only on $select. Read-only.
     * @param value Value to set for the refreshTokensValidFromDateTime property.
     */
    public void setRefreshTokensValidFromDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("refreshTokensValidFromDateTime", value);
    }
    /**
     * Sets the relatedContacts property value. Related records associated with the user. Read-only.
     * @param value Value to set for the relatedContacts property.
     */
    public void setRelatedContacts(@jakarta.annotation.Nullable final java.util.List<RelatedContact> value) {
        this.backingStore.set("relatedContacts", value);
    }
    /**
     * Sets the residenceAddress property value. The address where the user lives.
     * @param value Value to set for the residenceAddress property.
     */
    public void setResidenceAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("residenceAddress", value);
    }
    /**
     * Sets the rubrics property value. When set, the grading rubric attached to the assignment.
     * @param value Value to set for the rubrics property.
     */
    public void setRubrics(@jakarta.annotation.Nullable final java.util.List<EducationRubric> value) {
        this.backingStore.set("rubrics", value);
    }
    /**
     * Sets the schools property value. Schools to which the user belongs. Nullable.
     * @param value Value to set for the schools property.
     */
    public void setSchools(@jakarta.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.backingStore.set("schools", value);
    }
    /**
     * Sets the showInAddressList property value. True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     * @param value Value to set for the showInAddressList property.
     */
    public void setShowInAddressList(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showInAddressList", value);
    }
    /**
     * Sets the student property value. If the primary role is student, this block will contain student specific data.
     * @param value Value to set for the student property.
     */
    public void setStudent(@jakarta.annotation.Nullable final EducationStudent value) {
        this.backingStore.set("student", value);
    }
    /**
     * Sets the surname property value. The user's surname (family name or last name). Supports $filter.
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("surname", value);
    }
    /**
     * Sets the taughtClasses property value. Classes for which the user is a teacher.
     * @param value Value to set for the taughtClasses property.
     */
    public void setTaughtClasses(@jakarta.annotation.Nullable final java.util.List<EducationClass> value) {
        this.backingStore.set("taughtClasses", value);
    }
    /**
     * Sets the teacher property value. If the primary role is teacher, this block will contain teacher specific data.
     * @param value Value to set for the teacher property.
     */
    public void setTeacher(@jakarta.annotation.Nullable final EducationTeacher value) {
        this.backingStore.set("teacher", value);
    }
    /**
     * Sets the usageLocation property value. A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     * @param value Value to set for the usageLocation property.
     */
    public void setUsageLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("usageLocation", value);
    }
    /**
     * Sets the user property value. The directory user that corresponds to this user.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final User value) {
        this.backingStore.set("user", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userType", value);
    }
}
