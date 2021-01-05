// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request Builder.
 */
public class GroupRequestBuilder extends BaseRequestBuilder implements IGroupRequestBuilder {

    /**
     * The request builder for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    public IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder memberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder memberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder members() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder members(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder membersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder membersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder membersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder membersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder membersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder membersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder membersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder membersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder membersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder membersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder membersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder membersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder membersWithLicenseErrorsAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder membersWithLicenseErrorsAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder membersWithLicenseErrorsAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder membersWithLicenseErrorsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder membersWithLicenseErrorsAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder membersWithLicenseErrorsAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder ownersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder ownersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder ownersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder ownersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder ownersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder ownersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder ownersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder ownersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder ownersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder ownersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants"), getClient(), null);
    }

    public IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants") + "/" + id, getClient(), null);
    }
    public IGroupSettingCollectionRequestBuilder settings() {
        return new GroupSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IGroupSettingRequestBuilder settings(final String id) {
        return new GroupSettingRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder transitiveMembersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder transitiveMembersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder transitiveMembersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder transitiveMembersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder transitiveMembersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder transitiveMembersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMembersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder transitiveMembersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder transitiveMembersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder transitiveMembersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder transitiveMembersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder transitiveMembersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionRequestBuilder acceptedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder acceptedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    public ICalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public IEventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    public IEventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    public IConversationCollectionRequestBuilder conversations() {
        return new ConversationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conversations"), getClient(), null);
    }

    public IConversationRequestBuilder conversations(final String id) {
        return new ConversationRequestBuilder(getRequestUrlWithAdditionalSegment("conversations") + "/" + id, getClient(), null);
    }
    public IEventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    public IEventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    public IProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    public IProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    public IProfilePhotoRequestBuilder photos(final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionRequestBuilder rejectedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder rejectedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders") + "/" + id, getClient(), null);
    }
    public IConversationThreadCollectionRequestBuilder threads() {
        return new ConversationThreadCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threads"), getClient(), null);
    }

    public IConversationThreadRequestBuilder threads(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("threads") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies"), getClient(), null);
    }

    public IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerGroup
     *
     * @return the IPlannerGroupRequestBuilder instance
     */
    public IPlannerGroupRequestBuilder planner() {
        return new PlannerGroupRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    public IOnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets the request builder for Team
     *
     * @return the ITeamRequestBuilder instance
     */
    public ITeamRequestBuilder team() {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("team"), getClient(), null);
    }

    public IGroupAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        return new GroupAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    public IGroupCheckGrantedPermissionsForAppCollectionRequestBuilder checkGrantedPermissionsForApp() {
        return new GroupCheckGrantedPermissionsForAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkGrantedPermissionsForApp"), getClient(), null);
    }

    public IGroupValidatePropertiesRequestBuilder validateProperties(final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        return new GroupValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, displayName, mailNickname, onBehalfOfUserId);
    }

    public IGroupAddFavoriteRequestBuilder addFavorite() {
        return new GroupAddFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addFavorite"), getClient(), null);
    }

    public IGroupRemoveFavoriteRequestBuilder removeFavorite() {
        return new GroupRemoveFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeFavorite"), getClient(), null);
    }

    public IGroupResetUnseenCountRequestBuilder resetUnseenCount() {
        return new GroupResetUnseenCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetUnseenCount"), getClient(), null);
    }

    public IGroupSubscribeByMailRequestBuilder subscribeByMail() {
        return new GroupSubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeByMail"), getClient(), null);
    }

    public IGroupUnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new GroupUnsubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsubscribeByMail"), getClient(), null);
    }

    public IGroupRenewRequestBuilder renew() {
        return new GroupRenewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renew"), getClient(), null);
    }
}
