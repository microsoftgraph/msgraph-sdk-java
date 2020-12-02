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
    public IUserCollectionRequestBuilder memberOfAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder memberOfAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder memberOfAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder memberOfAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder members() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder members(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IUserCollectionRequestBuilder membersAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder membersAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder membersAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder membersAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder membersAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder membersAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder membersAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder membersAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder membersAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder membersAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder membersAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder membersAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id, getClient(), null);
    }
    public IUserCollectionRequestBuilder membersWithLicenseErrorsAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder membersWithLicenseErrorsAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder membersWithLicenseErrorsAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder membersWithLicenseErrorsAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder membersWithLicenseErrorsAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder membersWithLicenseErrorsAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder membersWithLicenseErrorsAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder membersWithLicenseErrorsAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder membersWithLicenseErrorsAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder membersWithLicenseErrorsAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder membersWithLicenseErrorsAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder membersWithLicenseErrorsAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public IUserCollectionRequestBuilder ownersAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder ownersAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder ownersAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder ownersAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder ownersAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder ownersAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder ownersAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder ownersAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder ownersAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder ownersAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder ownersAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
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
    public IUserCollectionRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id, getClient(), null);
    }
    public IUserCollectionRequestBuilder transitiveMembersAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserRequestBuilder transitiveMembersAsUser(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionRequestBuilder transitiveMembersAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupRequestBuilder transitiveMembersAsGroup(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionRequestBuilder transitiveMembersAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationRequestBuilder transitiveMembersAsApplication(final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionRequestBuilder transitiveMembersAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalRequestBuilder transitiveMembersAsServicePrincipal(final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionRequestBuilder transitiveMembersAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceRequestBuilder transitiveMembersAsDevice(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionRequestBuilder transitiveMembersAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactRequestBuilder transitiveMembersAsOrgContact(final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
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
