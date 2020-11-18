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
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request Builder.
 */
public class UserRequestBuilder extends BaseRequestBuilder<User> {

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    public UserRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    public UserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    public AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public AppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder createdObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    public ServicePrincipalCollectionWithReferencesRequestBuilder createdObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ServicePrincipalWithReferenceRequestBuilder createdObjectsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder directReports() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder directReports(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    public UserCollectionWithReferencesRequestBuilder directReportsAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public UserWithReferenceRequestBuilder directReportsAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    public OrgContactCollectionWithReferencesRequestBuilder directReportsAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public OrgContactWithReferenceRequestBuilder directReportsAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    /**
     *  Gets a request builder for the LicenseDetails collection
     *
     * @return the collection request builder
     */
    public LicenseDetailsCollectionRequestBuilder licenseDetails() {
        return new LicenseDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the LicenseDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public LicenseDetailsRequestBuilder licenseDetails(final String id) {
        return new LicenseDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    public DirectoryObjectWithReferenceRequestBuilder manager() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("manager"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    public UserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public UserWithReferenceRequestBuilder memberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    public GroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public GroupWithReferenceRequestBuilder memberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    public ApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    public ServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    public DeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceWithReferenceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    public OrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public OrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    /**
     *  Gets a request builder for the OAuth2PermissionGrant collection
     *
     * @return the collection request builder
     */
    public OAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants"), getClient(), null);
    }

    /**
     * Gets a request builder for the OAuth2PermissionGrant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public OAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder ownedDevices(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    public DeviceCollectionWithReferencesRequestBuilder ownedDevicesAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceWithReferenceRequestBuilder ownedDevicesAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    public AppRoleAssignmentCollectionWithReferencesRequestBuilder ownedDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public AppRoleAssignmentWithReferenceRequestBuilder ownedDevicesAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    public EndpointCollectionWithReferencesRequestBuilder ownedDevicesAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public EndpointWithReferenceRequestBuilder ownedDevicesAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    public ApplicationCollectionWithReferencesRequestBuilder ownedObjectsAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ApplicationWithReferenceRequestBuilder ownedObjectsAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    public GroupCollectionWithReferencesRequestBuilder ownedObjectsAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public GroupWithReferenceRequestBuilder ownedObjectsAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    public ServicePrincipalCollectionWithReferencesRequestBuilder ownedObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ServicePrincipalWithReferenceRequestBuilder ownedObjectsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder registeredDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder registeredDevices(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    public DeviceCollectionWithReferencesRequestBuilder registeredDevicesAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceWithReferenceRequestBuilder registeredDevicesAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    public AppRoleAssignmentCollectionWithReferencesRequestBuilder registeredDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public AppRoleAssignmentWithReferenceRequestBuilder registeredDevicesAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    public EndpointCollectionWithReferencesRequestBuilder registeredDevicesAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public EndpointWithReferenceRequestBuilder registeredDevicesAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the ScopedRoleMembership collection
     *
     * @return the collection request builder
     */
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the ScopedRoleMembership item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ScopedRoleMembershipRequestBuilder scopedRoleMemberOf(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    public DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    public UserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public UserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    public GroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public GroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    public ApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    public ServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    public DeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    public OrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public OrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the CalendarRequestBuilder instance
     */
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CalendarGroup collection
     *
     * @return the collection request builder
     */
    public CalendarGroupCollectionRequestBuilder calendarGroups() {
        return new CalendarGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the CalendarGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public CalendarGroupRequestBuilder calendarGroups(final String id) {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Calendar collection
     *
     * @return the collection request builder
     */
    public CalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    /**
     * Gets a request builder for the Calendar item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public CalendarRequestBuilder calendars(final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Event collection
     *
     * @return the collection request builder
     */
    public EventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    /**
     * Gets a request builder for the Event item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public EventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ContactFolder collection
     *
     * @return the collection request builder
     */
    public ContactFolderCollectionRequestBuilder contactFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContactFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ContactFolderRequestBuilder contactFolders(final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Contact collection
     *
     * @return the collection request builder
     */
    public ContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Contact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ContactRequestBuilder contacts(final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Event collection
     *
     * @return the collection request builder
     */
    public EventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    /**
     * Gets a request builder for the Event item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public EventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for InferenceClassification
     *
     * @return the InferenceClassificationRequestBuilder instance
     */
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassification"), getClient(), null);
    }
    /**
     *  Gets a request builder for the MailFolder collection
     *
     * @return the collection request builder
     */
    public MailFolderCollectionRequestBuilder mailFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the MailFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public MailFolderRequestBuilder mailFolders(final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Message collection
     *
     * @return the collection request builder
     */
    public MessageCollectionRequestBuilder messages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    /**
     * Gets a request builder for the Message item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public MessageRequestBuilder messages(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OutlookUser
     *
     * @return the OutlookUserRequestBuilder instance
     */
    public OutlookUserRequestBuilder outlook() {
        return new OutlookUserRequestBuilder(getRequestUrlWithAdditionalSegment("outlook"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Person collection
     *
     * @return the collection request builder
     */
    public PersonCollectionRequestBuilder people() {
        return new PersonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("people"), getClient(), null);
    }

    /**
     * Gets a request builder for the Person item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public PersonRequestBuilder people(final String id) {
        return new PersonRequestBuilder(getRequestUrlWithAdditionalSegment("people") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the ProfilePhotoRequestBuilder instance
     */
    public ProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ProfilePhoto collection
     *
     * @return the collection request builder
     */
    public ProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    /**
     * Gets a request builder for the ProfilePhoto item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ProfilePhotoRequestBuilder photos(final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Drive collection
     *
     * @return the collection request builder
     */
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    /**
     * Gets a request builder for the Drive item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Site collection
     *
     * @return the collection request builder
     */
    public SiteCollectionWithReferencesRequestBuilder followedSites() {
        return new SiteCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites"), getClient(), null);
    }

    /**
     * Gets a request builder for the Site item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public SiteWithReferenceRequestBuilder followedSites(final String id) {
        return new SiteWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDevice collection
     *
     * @return the collection request builder
     */
    public ManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ManagedDeviceRequestBuilder managedDevices(final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppRegistration collection
     *
     * @return the collection request builder
     */
    public ManagedAppRegistrationCollectionWithReferencesRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppRegistration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public ManagedAppRegistrationWithReferenceRequestBuilder managedAppRegistrations(final String id) {
        return new ManagedAppRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    public DeviceManagementTroubleshootingEventCollectionRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public DeviceManagementTroubleshootingEventRequestBuilder deviceManagementTroubleshootingEvents(final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerUser
     *
     * @return the PlannerUserRequestBuilder instance
     */
    public PlannerUserRequestBuilder planner() {
        return new PlannerUserRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for OfficeGraphInsights
     *
     * @return the OfficeGraphInsightsRequestBuilder instance
     */
    public OfficeGraphInsightsRequestBuilder insights() {
        return new OfficeGraphInsightsRequestBuilder(getRequestUrlWithAdditionalSegment("insights"), getClient(), null);
    }

    /**
     * Gets the request builder for UserSettings
     *
     * @return the UserSettingsRequestBuilder instance
     */
    public UserSettingsRequestBuilder settings() {
        return new UserSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserActivity collection
     *
     * @return the collection request builder
     */
    public UserActivityCollectionRequestBuilder activities() {
        return new UserActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activities"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserActivity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public UserActivityRequestBuilder activities(final String id) {
        return new UserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("activities") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnlineMeeting collection
     *
     * @return the collection request builder
     */
    public OnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnlineMeeting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public OnlineMeetingRequestBuilder onlineMeetings(final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Team collection
     *
     * @return the collection request builder
     */
    public TeamCollectionRequestBuilder joinedTeams() {
        return new TeamCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams"), getClient(), null);
    }

    /**
     * Gets a request builder for the Team item
     *
     * @return the request builder
     * @param id the item identifier
     */
    public TeamRequestBuilder joinedTeams(final String id) {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserTeamwork
     *
     * @return the UserTeamworkRequestBuilder instance
     */
    public UserTeamworkRequestBuilder teamwork() {
        return new UserTeamworkRequestBuilder(getRequestUrlWithAdditionalSegment("teamwork"), getClient(), null);
    }

    /**
     * Gets the request builder for Todo
     *
     * @return the TodoRequestBuilder instance
     */
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(getRequestUrlWithAdditionalSegment("todo"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param addLicenses the addLicenses
     * @param removeLicenses the removeLicenses
     */
    public UserAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        return new UserAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param currentPassword the currentPassword
     * @param newPassword the newPassword
     */
    public UserChangePasswordRequestBuilder changePassword(final String currentPassword, final String newPassword) {
        return new UserChangePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changePassword"), getClient(), null, currentPassword, newPassword);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public UserReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new UserReprocessLicenseAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprocessLicenseAssignment"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public UserRevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new UserRevokeSignInSessionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeSignInSessions"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param attendees the attendees
     * @param locationConstraint the locationConstraint
     * @param timeConstraint the timeConstraint
     * @param meetingDuration the meetingDuration
     * @param maxCandidates the maxCandidates
     * @param isOrganizerOptional the isOrganizerOptional
     * @param returnSuggestionReasons the returnSuggestionReasons
     * @param minimumAttendeePercentage the minimumAttendeePercentage
     */
    public UserFindMeetingTimesRequestBuilder findMeetingTimes(final java.util.List<AttendeeBase> attendees, final LocationConstraint locationConstraint, final TimeConstraint timeConstraint, final javax.xml.datatype.Duration meetingDuration, final Integer maxCandidates, final Boolean isOrganizerOptional, final Boolean returnSuggestionReasons, final Double minimumAttendeePercentage) {
        return new UserFindMeetingTimesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findMeetingTimes"), getClient(), null, attendees, locationConstraint, timeConstraint, meetingDuration, maxCandidates, isOrganizerOptional, returnSuggestionReasons, minimumAttendeePercentage);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param emailAddresses the emailAddresses
     * @param mailTipsOptions the mailTipsOptions
     */
    public UserGetMailTipsCollectionRequestBuilder getMailTips(final java.util.List<String> emailAddresses, final EnumSet<MailTipsType> mailTipsOptions) {
        return new UserGetMailTipsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailTips"), getClient(), null, emailAddresses, mailTipsOptions);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param message the message
     * @param saveToSentItems the saveToSentItems
     */
    public UserSendMailRequestBuilder sendMail(final Message message, final Boolean saveToSentItems) {
        return new UserSendMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendMail"), getClient(), null, message, saveToSentItems);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param inputIds the inputIds
     * @param targetIdType the targetIdType
     * @param sourceIdType the sourceIdType
     */
    public UserTranslateExchangeIdsCollectionRequestBuilder translateExchangeIds(final java.util.List<String> inputIds, final ExchangeIdFormat targetIdType, final ExchangeIdFormat sourceIdType) {
        return new UserTranslateExchangeIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.translateExchangeIds"), getClient(), null, inputIds, targetIdType, sourceIdType);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    public UserRemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new UserRemoveAllDevicesFromManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeAllDevicesFromManagement"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param deviceTag the deviceTag
     */
    public UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag(final String deviceTag) {
        return new UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationsByDeviceTag"), getClient(), null, deviceTag);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param storageLocation the storageLocation
     */
    public UserExportPersonalDataRequestBuilder exportPersonalData(final String storageLocation) {
        return new UserExportPersonalDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportPersonalData"), getClient(), null, storageLocation);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param startDateTime the startDateTime
     * @param endDateTime the endDateTime
     */
    public UserReminderViewCollectionRequestBuilder reminderView(final String startDateTime, final String endDateTime) {
        return new UserReminderViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reminderView"), getClient(), null, startDateTime, endDateTime);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    public UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder getManagedAppDiagnosticStatuses() {
        return new UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppDiagnosticStatuses"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    public UserGetManagedAppPoliciesCollectionRequestBuilder getManagedAppPolicies() {
        return new UserGetManagedAppPoliciesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppPolicies"), getClient(), null);
    }
}
