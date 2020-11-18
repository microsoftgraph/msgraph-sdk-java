// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import com.microsoft.graph.models.extensions.Reminder;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerUserRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeGraphInsightsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request Builder.
 */
public class UserRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    @Nonnull
    public UserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    @Nonnull
    public UserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    @Nonnull
    public AppRoleAssignmentRequestBuilder appRoleAssignments(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder createdObjects(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ServicePrincipalCollectionWithReferencesRequestBuilder createdObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    @Nonnull
    public ServicePrincipalWithReferenceRequestBuilder createdObjectsAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder directReports() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder directReports(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id, getClient(), null);
    }
    @Nonnull
    public UserCollectionWithReferencesRequestBuilder directReportsAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.user", getClient(), null);
    }

    @Nonnull
    public UserWithReferenceRequestBuilder directReportsAsUser(@Nonnull final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    @Nonnull
    public OrgContactCollectionWithReferencesRequestBuilder directReportsAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.orgContact", getClient(), null);
    }

    @Nonnull
    public OrgContactWithReferenceRequestBuilder directReportsAsOrgContact(@Nonnull final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    @Nonnull
    public LicenseDetailsCollectionRequestBuilder licenseDetails() {
        return new LicenseDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails"), getClient(), null);
    }

    @Nonnull
    public LicenseDetailsRequestBuilder licenseDetails(@Nonnull final String id) {
        return new LicenseDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder manager() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("manager"), getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder memberOf(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    @Nonnull
    public UserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    @Nonnull
    public UserWithReferenceRequestBuilder memberOfAsUser(@Nonnull final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    @Nonnull
    public GroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    @Nonnull
    public GroupWithReferenceRequestBuilder memberOfAsGroup(@Nonnull final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    @Nonnull
    public ApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    @Nonnull
    public ApplicationWithReferenceRequestBuilder memberOfAsApplication(@Nonnull final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    @Nonnull
    public ServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    @Nonnull
    public ServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    @Nonnull
    public DeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    @Nonnull
    public DeviceWithReferenceRequestBuilder memberOfAsDevice(@Nonnull final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    @Nonnull
    public OrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    @Nonnull
    public OrgContactWithReferenceRequestBuilder memberOfAsOrgContact(@Nonnull final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    @Nonnull
    public OAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants"), getClient(), null);
    }

    @Nonnull
    public OAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(@Nonnull final String id) {
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder ownedDevices(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DeviceCollectionWithReferencesRequestBuilder ownedDevicesAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.device", getClient(), null);
    }

    @Nonnull
    public DeviceWithReferenceRequestBuilder ownedDevicesAsDevice(@Nonnull final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequestBuilder ownedDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    @Nonnull
    public AppRoleAssignmentWithReferenceRequestBuilder ownedDevicesAsAppRoleAssignment(@Nonnull final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    @Nonnull
    public EndpointCollectionWithReferencesRequestBuilder ownedDevicesAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    @Nonnull
    public EndpointWithReferenceRequestBuilder ownedDevicesAsEndpoint(@Nonnull final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder ownedObjects(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ApplicationCollectionWithReferencesRequestBuilder ownedObjectsAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.application", getClient(), null);
    }

    @Nonnull
    public ApplicationWithReferenceRequestBuilder ownedObjectsAsApplication(@Nonnull final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    @Nonnull
    public GroupCollectionWithReferencesRequestBuilder ownedObjectsAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.group", getClient(), null);
    }

    @Nonnull
    public GroupWithReferenceRequestBuilder ownedObjectsAsGroup(@Nonnull final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    @Nonnull
    public ServicePrincipalCollectionWithReferencesRequestBuilder ownedObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    @Nonnull
    public ServicePrincipalWithReferenceRequestBuilder ownedObjectsAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder registeredDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder registeredDevices(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DeviceCollectionWithReferencesRequestBuilder registeredDevicesAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.device", getClient(), null);
    }

    @Nonnull
    public DeviceWithReferenceRequestBuilder registeredDevicesAsDevice(@Nonnull final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequestBuilder registeredDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    @Nonnull
    public AppRoleAssignmentWithReferenceRequestBuilder registeredDevicesAsAppRoleAssignment(@Nonnull final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    @Nonnull
    public EndpointCollectionWithReferencesRequestBuilder registeredDevicesAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    @Nonnull
    public EndpointWithReferenceRequestBuilder registeredDevicesAsEndpoint(@Nonnull final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    @Nonnull
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf"), getClient(), null);
    }

    @Nonnull
    public ScopedRoleMembershipRequestBuilder scopedRoleMemberOf(@Nonnull final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    @Nonnull
    public UserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    @Nonnull
    public UserWithReferenceRequestBuilder transitiveMemberOfAsUser(@Nonnull final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    @Nonnull
    public GroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    @Nonnull
    public GroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(@Nonnull final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    @Nonnull
    public ApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    @Nonnull
    public ApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(@Nonnull final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    @Nonnull
    public ServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    @Nonnull
    public ServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    @Nonnull
    public DeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    @Nonnull
    public DeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(@Nonnull final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    @Nonnull
    public OrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    @Nonnull
    public OrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(@Nonnull final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the CalendarRequestBuilder instance
     */
    @Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    @Nonnull
    public CalendarGroupCollectionRequestBuilder calendarGroups() {
        return new CalendarGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups"), getClient(), null);
    }

    @Nonnull
    public CalendarGroupRequestBuilder calendarGroups(@Nonnull final String id) {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups") + "/" + id, getClient(), null);
    }
    @Nonnull
    public CalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    @Nonnull
    public CalendarRequestBuilder calendars(@Nonnull final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
    @Nonnull
    public EventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    @Nonnull
    public EventRequestBuilder calendarView(@Nonnull final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ContactFolderCollectionRequestBuilder contactFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders"), getClient(), null);
    }

    @Nonnull
    public ContactFolderRequestBuilder contactFolders(@Nonnull final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    @Nonnull
    public ContactRequestBuilder contacts(@Nonnull final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    @Nonnull
    public EventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    @Nonnull
    public EventRequestBuilder events(@Nonnull final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for InferenceClassification
     *
     * @return the InferenceClassificationRequestBuilder instance
     */
    @Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassification"), getClient(), null);
    }
    @Nonnull
    public MailFolderCollectionRequestBuilder mailFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders"), getClient(), null);
    }

    @Nonnull
    public MailFolderRequestBuilder mailFolders(@Nonnull final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders") + "/" + id, getClient(), null);
    }
    @Nonnull
    public MessageCollectionRequestBuilder messages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    @Nonnull
    public MessageRequestBuilder messages(@Nonnull final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OutlookUser
     *
     * @return the OutlookUserRequestBuilder instance
     */
    @Nonnull
    public OutlookUserRequestBuilder outlook() {
        return new OutlookUserRequestBuilder(getRequestUrlWithAdditionalSegment("outlook"), getClient(), null);
    }
    @Nonnull
    public PersonCollectionRequestBuilder people() {
        return new PersonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("people"), getClient(), null);
    }

    @Nonnull
    public PersonRequestBuilder people(@Nonnull final String id) {
        return new PersonRequestBuilder(getRequestUrlWithAdditionalSegment("people") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the ProfilePhotoRequestBuilder instance
     */
    @Nonnull
    public ProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    @Nonnull
    public ProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    @Nonnull
    public ProfilePhotoRequestBuilder photos(@Nonnull final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    @Nonnull
    public SiteCollectionWithReferencesRequestBuilder followedSites() {
        return new SiteCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites"), getClient(), null);
    }

    @Nonnull
    public SiteWithReferenceRequestBuilder followedSites(@Nonnull final String id) {
        return new SiteWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    @Nonnull
    public ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    @Nonnull
    public ManagedDeviceRequestBuilder managedDevices(@Nonnull final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ManagedAppRegistrationCollectionWithReferencesRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    @Nonnull
    public ManagedAppRegistrationWithReferenceRequestBuilder managedAppRegistrations(@Nonnull final String id) {
        return new ManagedAppRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DeviceManagementTroubleshootingEventCollectionRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents"), getClient(), null);
    }

    @Nonnull
    public DeviceManagementTroubleshootingEventRequestBuilder deviceManagementTroubleshootingEvents(@Nonnull final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerUser
     *
     * @return the PlannerUserRequestBuilder instance
     */
    @Nonnull
    public PlannerUserRequestBuilder planner() {
        return new PlannerUserRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for OfficeGraphInsights
     *
     * @return the OfficeGraphInsightsRequestBuilder instance
     */
    @Nonnull
    public OfficeGraphInsightsRequestBuilder insights() {
        return new OfficeGraphInsightsRequestBuilder(getRequestUrlWithAdditionalSegment("insights"), getClient(), null);
    }

    /**
     * Gets the request builder for UserSettings
     *
     * @return the UserSettingsRequestBuilder instance
     */
    @Nonnull
    public UserSettingsRequestBuilder settings() {
        return new UserSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    @Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }
    @Nonnull
    public UserActivityCollectionRequestBuilder activities() {
        return new UserActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activities"), getClient(), null);
    }

    @Nonnull
    public UserActivityRequestBuilder activities(@Nonnull final String id) {
        return new UserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("activities") + "/" + id, getClient(), null);
    }
    @Nonnull
    public OnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    @Nonnull
    public OnlineMeetingRequestBuilder onlineMeetings(@Nonnull final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }
    @Nonnull
    public TeamCollectionRequestBuilder joinedTeams() {
        return new TeamCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams"), getClient(), null);
    }

    @Nonnull
    public TeamRequestBuilder joinedTeams(@Nonnull final String id) {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserTeamwork
     *
     * @return the UserTeamworkRequestBuilder instance
     */
    @Nonnull
    public UserTeamworkRequestBuilder teamwork() {
        return new UserTeamworkRequestBuilder(getRequestUrlWithAdditionalSegment("teamwork"), getClient(), null);
    }

    /**
     * Gets the request builder for Todo
     *
     * @return the TodoRequestBuilder instance
     */
    @Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(getRequestUrlWithAdditionalSegment("todo"), getClient(), null);
    }

    @Nonnull
    public UserAssignLicenseRequestBuilder assignLicense(@Nullable final java.util.List<AssignedLicense> addLicenses, @Nullable final java.util.List<java.util.UUID> removeLicenses) {
        return new UserAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    @Nonnull
    public UserChangePasswordRequestBuilder changePassword(@Nullable final String currentPassword, @Nullable final String newPassword) {
        return new UserChangePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changePassword"), getClient(), null, currentPassword, newPassword);
    }

    @Nonnull
    public UserReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new UserReprocessLicenseAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprocessLicenseAssignment"), getClient(), null);
    }

    @Nonnull
    public UserRevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new UserRevokeSignInSessionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeSignInSessions"), getClient(), null);
    }

    @Nonnull
    public UserFindMeetingTimesRequestBuilder findMeetingTimes(@Nullable final java.util.List<AttendeeBase> attendees, @Nullable final LocationConstraint locationConstraint, @Nullable final TimeConstraint timeConstraint, @Nullable final javax.xml.datatype.Duration meetingDuration, @Nullable final Integer maxCandidates, @Nullable final Boolean isOrganizerOptional, @Nullable final Boolean returnSuggestionReasons, @Nullable final Double minimumAttendeePercentage) {
        return new UserFindMeetingTimesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findMeetingTimes"), getClient(), null, attendees, locationConstraint, timeConstraint, meetingDuration, maxCandidates, isOrganizerOptional, returnSuggestionReasons, minimumAttendeePercentage);
    }

    @Nonnull
    public UserGetMailTipsCollectionRequestBuilder getMailTips(@Nullable final java.util.List<String> emailAddresses, @Nullable final EnumSet<MailTipsType> mailTipsOptions) {
        return new UserGetMailTipsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailTips"), getClient(), null, emailAddresses, mailTipsOptions);
    }

    @Nonnull
    public UserSendMailRequestBuilder sendMail(@Nullable final Message message, @Nullable final Boolean saveToSentItems) {
        return new UserSendMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendMail"), getClient(), null, message, saveToSentItems);
    }

    @Nonnull
    public UserTranslateExchangeIdsCollectionRequestBuilder translateExchangeIds(@Nullable final java.util.List<String> inputIds, @Nullable final ExchangeIdFormat targetIdType, @Nullable final ExchangeIdFormat sourceIdType) {
        return new UserTranslateExchangeIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.translateExchangeIds"), getClient(), null, inputIds, targetIdType, sourceIdType);
    }

    @Nonnull
    public UserRemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new UserRemoveAllDevicesFromManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeAllDevicesFromManagement"), getClient(), null);
    }

    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag(@Nullable final String deviceTag) {
        return new UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationsByDeviceTag"), getClient(), null, deviceTag);
    }

    @Nonnull
    public UserExportPersonalDataRequestBuilder exportPersonalData(@Nullable final String storageLocation) {
        return new UserExportPersonalDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportPersonalData"), getClient(), null, storageLocation);
    }

    @Nonnull
    public UserReminderViewCollectionRequestBuilder reminderView(@Nullable final String startDateTime, @Nullable final String endDateTime) {
        return new UserReminderViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reminderView"), getClient(), null, startDateTime, endDateTime);
    }

    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder getManagedAppDiagnosticStatuses() {
        return new UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppDiagnosticStatuses"), getClient(), null);
    }

    @Nonnull
    public UserGetManagedAppPoliciesCollectionRequestBuilder getManagedAppPolicies() {
        return new UserGetManagedAppPoliciesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppPolicies"), getClient(), null);
    }
}
