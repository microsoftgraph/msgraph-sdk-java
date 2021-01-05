// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.EmployeeOrgData;
import com.microsoft.graph.models.extensions.ObjectIdentity;
import com.microsoft.graph.models.extensions.LicenseAssignmentState;
import com.microsoft.graph.models.extensions.OnPremisesExtensionAttributes;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.MailboxSettings;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.LicenseDetails;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.Person;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.models.extensions.UserSettings;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.Presence;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;
import com.microsoft.graph.requests.extensions.TeamCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User.
 */
public class User extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
    public Boolean accountEnabled;

    /**
     * The Age Group.
     * Sets the age group of the user. Allowed values: null, minor, notAdult and adult. Refer to the legal age group property definitions for further information.
     */
    @SerializedName(value = "ageGroup", alternate = {"AgeGroup"})
    @Expose
    public String ageGroup;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the user. Not nullable.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * The plans that are assigned to the user. Read-only. Not nullable.
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this property. Read-only for users synced from on-premises directory.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * The city in which the user is located. Supports $filter.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
    public String city;

    /**
     * The Company Name.
     * The company name which the user is associated. This property can be useful for describing the company that an external user comes from. The maximum length of the company name is 64 chararcters.Returned only on $select.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
    public String companyName;

    /**
     * The Consent Provided For Minor.
     * Sets whether consent has been obtained for minors. Allowed values: null, granted, denied and notRequired. Refer to the legal age group property definitions for further information.
     */
    @SerializedName(value = "consentProvidedForMinor", alternate = {"ConsentProvidedForMinor"})
    @Expose
    public String consentProvidedForMinor;

    /**
     * The Country.
     * The country/region in which the user is located; for example, 'US' or 'UK'. Supports $filter.
     */
    @SerializedName(value = "country", alternate = {"Country"})
    @Expose
    public String country;

    /**
     * The Created Date Time.
     * The created date of the user object.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Creation Type.
     * Indicates whether the user account was created as a regular school or work account (null), an external account (Invitation), a local account for an Azure Active Directory B2C tenant (LocalAccount) or self-service sign-up using email verification (EmailVerified). Read-only.
     */
    @SerializedName(value = "creationType", alternate = {"CreationType"})
    @Expose
    public String creationType;

    /**
     * The Department.
     * The name for the department in which the user works. Supports $filter.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Employee Hire Date.
     * The date and time when the user was hired or will start work in case of a future hire. Returned only on $select. Supports $filter.
     */
    @SerializedName(value = "employeeHireDate", alternate = {"EmployeeHireDate"})
    @Expose
    public java.util.Calendar employeeHireDate;

    /**
     * The Employee Id.
     * The employee identifier assigned to the user by the organization. Returned only on $select. Supports $filter.
     */
    @SerializedName(value = "employeeId", alternate = {"EmployeeId"})
    @Expose
    public String employeeId;

    /**
     * The Employee Org Data.
     * Represents organization data (e.g. division and costCenter) associated with a user. Returned only on $select.
     */
    @SerializedName(value = "employeeOrgData", alternate = {"EmployeeOrgData"})
    @Expose
    public EmployeeOrgData employeeOrgData;

    /**
     * The Employee Type.
     * Captures enterprise worker type: Employee, Contractor, Consultant, Vendor, etc. Returned only on $select. Supports $filter.
     */
    @SerializedName(value = "employeeType", alternate = {"EmployeeType"})
    @Expose
    public String employeeType;

    /**
     * The External User State.
     * For an external user invited to the tenant using the invitation API, this property represents the invited user's invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users. Returned only on $select. Supports $filter with the supported values. For example: $filter=externalUserState eq 'PendingAcceptance'.
     */
    @SerializedName(value = "externalUserState", alternate = {"ExternalUserState"})
    @Expose
    public String externalUserState;

    /**
     * The External User State Change Date Time.
     * Shows the timestamp for the latest change to the externalUserState property. Returned only on $select.
     */
    @SerializedName(value = "externalUserStateChangeDateTime", alternate = {"ExternalUserStateChangeDateTime"})
    @Expose
    public java.util.Calendar externalUserStateChangeDateTime;

    /**
     * The Fax Number.
     * The fax number of the user.
     */
    @SerializedName(value = "faxNumber", alternate = {"FaxNumber"})
    @Expose
    public String faxNumber;

    /**
     * The Given Name.
     * The given name (first name) of the user. Supports $filter.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
    public String givenName;

    /**
     * The Identities.
     * Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Supports $filter.
     */
    @SerializedName(value = "identities", alternate = {"Identities"})
    @Expose
    public java.util.List<ObjectIdentity> identities;

    /**
     * The Im Addresses.
     * The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only.
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Is Resource Account.
     * Do not use – reserved for future use.
     */
    @SerializedName(value = "isResourceAccount", alternate = {"IsResourceAccount"})
    @Expose
    public Boolean isResourceAccount;

    /**
     * The Job Title.
     * The user's job title. Supports $filter.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
    public String jobTitle;

    /**
     * The Last Password Change Date Time.
     * The time when this Azure AD user last changed their password. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastPasswordChangeDateTime", alternate = {"LastPasswordChangeDateTime"})
    @Expose
    public java.util.Calendar lastPasswordChangeDateTime;

    /**
     * The Legal Age Group Classification.
     * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated based on ageGroup and consentProvidedForMinor properties. Allowed values: null, minorWithOutParentalConsent, minorWithParentalConsent, minorNoParentalConsentRequired, notAdult and adult. Refer to the legal age group property definitions for further information.
     */
    @SerializedName(value = "legalAgeGroupClassification", alternate = {"LegalAgeGroupClassification"})
    @Expose
    public String legalAgeGroupClassification;

    /**
     * The License Assignment States.
     * State of license assignments for this user. Read-only.
     */
    @SerializedName(value = "licenseAssignmentStates", alternate = {"LicenseAssignmentStates"})
    @Expose
    public java.util.List<LicenseAssignmentState> licenseAssignmentStates;

    /**
     * The Mail.
     * The SMTP address for the user, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
     * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
    public String mailNickname;

    /**
     * The Mobile Phone.
     * The primary cellular telephone number for the user. Read-only for users synced from on-premises directory.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
    public String mobilePhone;

    /**
     * The Office Location.
     * The office location in the user's place of business.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
    public String officeLocation;

    /**
     * The On Premises Distinguished Name.
     * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesDistinguishedName", alternate = {"OnPremisesDistinguishedName"})
    @Expose
    public String onPremisesDistinguishedName;

    /**
     * The On Premises Domain Name.
     * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
    public String onPremisesDomainName;

    /**
     * The On Premises Extension Attributes.
     * Contains extensionAttributes 1-15 for the user. Note that the individual extension attributes are neither selectable nor filterable. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties may be set during creation or update. These extension attributes are also known as Exchange custom attributes 1-15.
     */
    @SerializedName(value = "onPremisesExtensionAttributes", alternate = {"OnPremisesExtensionAttributes"})
    @Expose
    public OnPremisesExtensionAttributes onPremisesExtensionAttributes;

    /**
     * The On Premises Immutable Id.
     * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user's userPrincipalName (UPN) property. Important: The $ and _ characters cannot be used when specifying this property. Supports $filter.
     */
    @SerializedName(value = "onPremisesImmutableId", alternate = {"OnPremisesImmutableId"})
    @Expose
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
     * Indicates the last time at which the object was synced with the on-premises directory; for example: '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * Errors when using Microsoft synchronization product during provisioning.
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only.
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The On Premises User Principal Name.
     * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesUserPrincipalName", alternate = {"OnPremisesUserPrincipalName"})
    @Expose
    public String onPremisesUserPrincipalName;

    /**
     * The Other Mails.
     * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. Supports $filter.
     */
    @SerializedName(value = "otherMails", alternate = {"OtherMails"})
    @Expose
    public java.util.List<String> otherMails;

    /**
     * The Password Policies.
     * Specifies password policies for the user. This value is an enumeration with one possible value being 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified. 'DisablePasswordExpiration' can also be specified. The two may be specified together; for example: 'DisablePasswordExpiration, DisableStrongPassword'.
     */
    @SerializedName(value = "passwordPolicies", alternate = {"PasswordPolicies"})
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
     * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName(value = "passwordProfile", alternate = {"PasswordProfile"})
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Postal Code.
     * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code.
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
     * The preferred language for the user. Should follow ISO 639-1 Code; for example 'en-US'.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
     * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'] The any operator is required for filter expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Show In Address List.
     * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     */
    @SerializedName(value = "showInAddressList", alternate = {"ShowInAddressList"})
    @Expose
    public Boolean showInAddressList;

    /**
     * The Sign In Sessions Valid From Date Time.
     * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use revokeSignInSessions to reset.
     */
    @SerializedName(value = "signInSessionsValidFromDateTime", alternate = {"SignInSessionsValidFromDateTime"})
    @Expose
    public java.util.Calendar signInSessionsValidFromDateTime;

    /**
     * The State.
     * The state or province in the user's address. Supports $filter.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public String state;

    /**
     * The Street Address.
     * The street address of the user's place of business.
     */
    @SerializedName(value = "streetAddress", alternate = {"StreetAddress"})
    @Expose
    public String streetAddress;

    /**
     * The Surname.
     * The user's surname (family name or last name). Supports $filter.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
    public String surname;

    /**
     * The Usage Location.
     * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: 'US', 'JP', and 'GB'. Not nullable. Supports $filter.
     */
    @SerializedName(value = "usageLocation", alternate = {"UsageLocation"})
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization. Supports $filter and $orderby.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
     * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports $filter.
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
    public String userType;

    /**
     * The Mailbox Settings.
     * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale and time zone.
     */
    @SerializedName(value = "mailboxSettings", alternate = {"MailboxSettings"})
    @Expose
    public MailboxSettings mailboxSettings;

    /**
     * The Device Enrollment Limit.
     * The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
     */
    @SerializedName(value = "deviceEnrollmentLimit", alternate = {"DeviceEnrollmentLimit"})
    @Expose
    public Integer deviceEnrollmentLimit;

    /**
     * The About Me.
     * A freeform text entry field for the user to describe themselves.
     */
    @SerializedName(value = "aboutMe", alternate = {"AboutMe"})
    @Expose
    public String aboutMe;

    /**
     * The Birthday.
     * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
    public java.util.Calendar birthday;

    /**
     * The Hire Date.
     * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned only on $select.  Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property to set and update hire date values using Microsoft Graph APIs.
     */
    @SerializedName(value = "hireDate", alternate = {"HireDate"})
    @Expose
    public java.util.Calendar hireDate;

    /**
     * The Interests.
     * A list for the user to describe their interests.
     */
    @SerializedName(value = "interests", alternate = {"Interests"})
    @Expose
    public java.util.List<String> interests;

    /**
     * The My Site.
     * The URL for the user's personal site.
     */
    @SerializedName(value = "mySite", alternate = {"MySite"})
    @Expose
    public String mySite;

    /**
     * The Past Projects.
     * A list for the user to enumerate their past projects.
     */
    @SerializedName(value = "pastProjects", alternate = {"PastProjects"})
    @Expose
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
     * The preferred name for the user.
     */
    @SerializedName(value = "preferredName", alternate = {"PreferredName"})
    @Expose
    public String preferredName;

    /**
     * The Responsibilities.
     * A list for the user to enumerate their responsibilities.
     */
    @SerializedName(value = "responsibilities", alternate = {"Responsibilities"})
    @Expose
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
     * A list for the user to enumerate the schools they have attended.
     */
    @SerializedName(value = "schools", alternate = {"Schools"})
    @Expose
    public java.util.List<String> schools;

    /**
     * The Skills.
     * A list for the user to enumerate their skills.
     */
    @SerializedName(value = "skills", alternate = {"Skills"})
    @Expose
    public java.util.List<String> skills;

    /**
     * The App Role Assignments.
     * 
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Created Objects.
     * Directory objects that were created by the user. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Direct Reports.
     * The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage directReports;

    /**
     * The License Details.
     * A collection of this user's license details. Read-only.
     */
    @SerializedName(value = "licenseDetails", alternate = {"LicenseDetails"})
    @Expose
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Manager.
     * The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
    public DirectoryObject manager;

    /**
     * The Member Of.
     * The groups and directory roles that the user is a member of. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Oauth2Permission Grants.
     * 
     */
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Owned Devices.
     * Devices that are owned by the user. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Owned Objects.
     * Directory objects that are owned by the user. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Registered Devices.
     * Devices that are registered for the user. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Scoped Role Member Of.
     * 
     */
    @SerializedName(value = "scopedRoleMemberOf", alternate = {"ScopedRoleMemberOf"})
    @Expose
    public ScopedRoleMembershipCollectionPage scopedRoleMemberOf;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Calendar.
     * The user's primary calendar. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
    public Calendar calendar;

    /**
     * The Calendar Groups.
     * The user's calendar groups. Read-only. Nullable.
     */
    @SerializedName(value = "calendarGroups", alternate = {"CalendarGroups"})
    @Expose
    public CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendars.
     * The user's calendars. Read-only. Nullable.
     */
    @SerializedName(value = "calendars", alternate = {"Calendars"})
    @Expose
    public CalendarCollectionPage calendars;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only. Nullable.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
    public EventCollectionPage calendarView;

    /**
     * The Contact Folders.
     * The user's contacts folders. Read-only. Nullable.
     */
    @SerializedName(value = "contactFolders", alternate = {"ContactFolders"})
    @Expose
    public ContactFolderCollectionPage contactFolders;

    /**
     * The Contacts.
     * The user's contacts. Read-only. Nullable.
     */
    @SerializedName(value = "contacts", alternate = {"Contacts"})
    @Expose
    public ContactCollectionPage contacts;

    /**
     * The Events.
     * The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
    public EventCollectionPage events;

    /**
     * The Inference Classification.
     * Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
     */
    @SerializedName(value = "inferenceClassification", alternate = {"InferenceClassification"})
    @Expose
    public InferenceClassification inferenceClassification;

    /**
     * The Mail Folders.
     * The user's mail folders. Read-only. Nullable.
     */
    @SerializedName(value = "mailFolders", alternate = {"MailFolders"})
    @Expose
    public MailFolderCollectionPage mailFolders;

    /**
     * The Messages.
     * The messages in a mailbox or folder. Read-only. Nullable.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
    public MessageCollectionPage messages;

    /**
     * The Outlook.
     * Read-only.
     */
    @SerializedName(value = "outlook", alternate = {"Outlook"})
    @Expose
    public OutlookUser outlook;

    /**
     * The People.
     * People that are relevant to the user. Read-only. Nullable.
     */
    @SerializedName(value = "people", alternate = {"People"})
    @Expose
    public PersonCollectionPage people;

    /**
     * The Photo.
     * The user's profile photo. Read-only.
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
     * 
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
    public ProfilePhotoCollectionPage photos;

    /**
     * The Drive.
     * The user's OneDrive. Read-only.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * A collection of drives available for this user. Read-only.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
    public DriveCollectionPage drives;

    /**
     * The Followed Sites.
     * 
     */
    public SiteCollectionPage followedSites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the user. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Managed Devices.
     * The managed devices associated with the user.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Managed App Registrations.
     * Zero or more managed app registrations that belong to the user.
     */
    public ManagedAppRegistrationCollectionPage managedAppRegistrations;

    /**
     * The Device Management Troubleshooting Events.
     * The list of troubleshooting events for this user.
     */
    @SerializedName(value = "deviceManagementTroubleshootingEvents", alternate = {"DeviceManagementTroubleshootingEvents"})
    @Expose
    public DeviceManagementTroubleshootingEventCollectionPage deviceManagementTroubleshootingEvents;

    /**
     * The Planner.
     * Entry-point to the Planner resource that might exist for a user. Read-only.
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
    public PlannerUser planner;

    /**
     * The Insights.
     * Read-only. Nullable.
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
    public OfficeGraphInsights insights;

    /**
     * The Settings.
     * 
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public UserSettings settings;

    /**
     * The Onenote.
     * Read-only.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
    public Onenote onenote;

    /**
     * The Activities.
     * The user's activities across devices. Read-only. Nullable.
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
    public UserActivityCollectionPage activities;

    /**
     * The Online Meetings.
     * 
     */
    @SerializedName(value = "onlineMeetings", alternate = {"OnlineMeetings"})
    @Expose
    public OnlineMeetingCollectionPage onlineMeetings;

    /**
     * The Presence.
     * 
     */
    @SerializedName(value = "presence", alternate = {"Presence"})
    @Expose
    public Presence presence;

    /**
     * The Joined Teams.
     * 
     */
    @SerializedName(value = "joinedTeams", alternate = {"JoinedTeams"})
    @Expose
    public TeamCollectionPage joinedTeams;

    /**
     * The Teamwork.
     * 
     */
    @SerializedName(value = "teamwork", alternate = {"Teamwork"})
    @Expose
    public UserTeamwork teamwork;

    /**
     * The Todo.
     * Represents the To Do services available to a user.
     */
    @SerializedName(value = "todo", alternate = {"Todo"})
    @Expose
    public Todo todo;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments").toString(), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("createdObjects")) {
            createdObjects = serializer.deserializeObject(json.get("createdObjects").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("directReports")) {
            directReports = serializer.deserializeObject(json.get("directReports").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("licenseDetails")) {
            licenseDetails = serializer.deserializeObject(json.get("licenseDetails").toString(), LicenseDetailsCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("oauth2PermissionGrants")) {
            oauth2PermissionGrants = serializer.deserializeObject(json.get("oauth2PermissionGrants").toString(), OAuth2PermissionGrantCollectionPage.class);
        }

        if (json.has("ownedDevices")) {
            ownedDevices = serializer.deserializeObject(json.get("ownedDevices").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("ownedObjects")) {
            ownedObjects = serializer.deserializeObject(json.get("ownedObjects").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredDevices")) {
            registeredDevices = serializer.deserializeObject(json.get("registeredDevices").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("scopedRoleMemberOf")) {
            scopedRoleMemberOf = serializer.deserializeObject(json.get("scopedRoleMemberOf").toString(), ScopedRoleMembershipCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("calendarGroups")) {
            calendarGroups = serializer.deserializeObject(json.get("calendarGroups").toString(), CalendarGroupCollectionPage.class);
        }

        if (json.has("calendars")) {
            calendars = serializer.deserializeObject(json.get("calendars").toString(), CalendarCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView").toString(), EventCollectionPage.class);
        }

        if (json.has("contactFolders")) {
            contactFolders = serializer.deserializeObject(json.get("contactFolders").toString(), ContactFolderCollectionPage.class);
        }

        if (json.has("contacts")) {
            contacts = serializer.deserializeObject(json.get("contacts").toString(), ContactCollectionPage.class);
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events").toString(), EventCollectionPage.class);
        }

        if (json.has("mailFolders")) {
            mailFolders = serializer.deserializeObject(json.get("mailFolders").toString(), MailFolderCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages").toString(), MessageCollectionPage.class);
        }

        if (json.has("people")) {
            people = serializer.deserializeObject(json.get("people").toString(), PersonCollectionPage.class);
        }

        if (json.has("photos")) {
            photos = serializer.deserializeObject(json.get("photos").toString(), ProfilePhotoCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives").toString(), DriveCollectionPage.class);
        }

        if (json.has("followedSites")) {
            followedSites = serializer.deserializeObject(json.get("followedSites").toString(), SiteCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices").toString(), ManagedDeviceCollectionPage.class);
        }

        if (json.has("managedAppRegistrations")) {
            managedAppRegistrations = serializer.deserializeObject(json.get("managedAppRegistrations").toString(), ManagedAppRegistrationCollectionPage.class);
        }

        if (json.has("deviceManagementTroubleshootingEvents")) {
            deviceManagementTroubleshootingEvents = serializer.deserializeObject(json.get("deviceManagementTroubleshootingEvents").toString(), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities").toString(), UserActivityCollectionPage.class);
        }

        if (json.has("onlineMeetings")) {
            onlineMeetings = serializer.deserializeObject(json.get("onlineMeetings").toString(), OnlineMeetingCollectionPage.class);
        }

        if (json.has("joinedTeams")) {
            joinedTeams = serializer.deserializeObject(json.get("joinedTeams").toString(), TeamCollectionPage.class);
        }
    }
}
