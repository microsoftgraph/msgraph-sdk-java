// Template Source: BaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ISearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IBaseGraphServiceClient;
import com.microsoft.graph.core.BaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";

    /**
     * The current endpoint
     */
    private String endpoint;

    @Override
    public String getServiceRoot() {
        if (endpoint == null) {
            endpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return endpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        endpoint = value;
    }

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    public IInvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", this, null);
    }

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    public IInvitationRequestBuilder invitations(final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, this, null);
    }

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", this, null);
    }

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    public IUserRequestBuilder users(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, this, null);
    }

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    public IIdentityProviderCollectionRequestBuilder identityProviders() {
        return new IdentityProviderCollectionRequestBuilder(getServiceRoot() + "/identityProviders", this, null);
    }

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    public IIdentityProviderRequestBuilder identityProviders(final String id) {
        return new IdentityProviderRequestBuilder(getServiceRoot() + "/identityProviders/" + id, this, null);
    }

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    public IApplicationCollectionRequestBuilder applications() {
        return new ApplicationCollectionRequestBuilder(getServiceRoot() + "/applications", this, null);
    }

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    public IApplicationRequestBuilder applications(final String id) {
        return new ApplicationRequestBuilder(getServiceRoot() + "/applications/" + id, this, null);
    }

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    public ICertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationCollectionRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration", this, null);
    }

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    public ICertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(final String id) {
        return new CertificateBasedAuthConfigurationRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration/" + id, this, null);
    }

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    public IOrgContactCollectionRequestBuilder contacts() {
        return new OrgContactCollectionRequestBuilder(getServiceRoot() + "/contacts", this, null);
    }

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    public IOrgContactRequestBuilder contacts(final String id) {
        return new OrgContactRequestBuilder(getServiceRoot() + "/contacts/" + id, this, null);
    }

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    public IContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", this, null);
    }

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    public IContractRequestBuilder contracts(final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, this, null);
    }

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", this, null);
    }

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    public IDeviceRequestBuilder devices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", this, null);
    }

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder directoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", this, null);
    }

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder directoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    public IDomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", this, null);
    }

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    public IDomainDnsRecordRequestBuilder domainDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, this, null);
    }

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    public IDomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", this, null);
    }

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    public IDomainRequestBuilder domains(final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, this, null);
    }

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", this, null);
    }

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    public IGroupRequestBuilder groups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, this, null);
    }

    /**
     * Gets the collection of GroupSettings objects
     *
     * @return the request builder for the collection of GroupSettings objects
     */
    public IGroupSettingCollectionRequestBuilder groupSettings() {
        return new GroupSettingCollectionRequestBuilder(getServiceRoot() + "/groupSettings", this, null);
    }

    /**
     * Gets a single GroupSettings
     *
     * @param id the id of the GroupSettings to retrieve
     * @return the request builder for the GroupSettings object
     */
    public IGroupSettingRequestBuilder groupSettings(final String id) {
        return new GroupSettingRequestBuilder(getServiceRoot() + "/groupSettings/" + id, this, null);
    }

    /**
     * Gets the collection of GroupSettingTemplates objects
     *
     * @return the request builder for the collection of GroupSettingTemplates objects
     */
    public IGroupSettingTemplateCollectionRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplateCollectionRequestBuilder(getServiceRoot() + "/groupSettingTemplates", this, null);
    }

    /**
     * Gets a single GroupSettingTemplates
     *
     * @param id the id of the GroupSettingTemplates to retrieve
     * @return the request builder for the GroupSettingTemplates object
     */
    public IGroupSettingTemplateRequestBuilder groupSettingTemplates(final String id) {
        return new GroupSettingTemplateRequestBuilder(getServiceRoot() + "/groupSettingTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    public IOAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants", this, null);
    }

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    public IOAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", this, null);
    }

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    public IOrganizationRequestBuilder organization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, this, null);
    }

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    public IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getServiceRoot() + "/permissionGrants", this, null);
    }

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    public IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getServiceRoot() + "/permissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    public IScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getServiceRoot() + "/scopedRoleMemberships", this, null);
    }

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    public IScopedRoleMembershipRequestBuilder scopedRoleMemberships(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getServiceRoot() + "/scopedRoleMemberships/" + id, this, null);
    }

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    public IServicePrincipalCollectionRequestBuilder servicePrincipals() {
        return new ServicePrincipalCollectionRequestBuilder(getServiceRoot() + "/servicePrincipals", this, null);
    }

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    public IServicePrincipalRequestBuilder servicePrincipals(final String id) {
        return new ServicePrincipalRequestBuilder(getServiceRoot() + "/servicePrincipals/" + id, this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", this, null);
    }

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder subscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, this, null);
    }

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    public IDriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", this, null);
    }

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    public IDriveItemRequestBuilder workbooks(final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, this, null);
    }

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    public IPlaceCollectionRequestBuilder places() {
        return new PlaceCollectionRequestBuilder(getServiceRoot() + "/places", this, null);
    }

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    public IPlaceRequestBuilder places(final String id) {
        return new PlaceRequestBuilder(getServiceRoot() + "/places/" + id, this, null);
    }

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", this, null);
    }

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, this, null);
    }

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    public ISharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", this, null);
    }

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    public ISharedDriveItemRequestBuilder shares(final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, this, null);
    }

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", this, null);
    }

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    public ISchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", this, null);
    }

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    public ISchemaExtensionRequestBuilder schemaExtensions(final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, this, null);
    }

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    public IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies", this, null);
    }

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    public IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies/" + id, this, null);
    }

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    public IDataPolicyOperationCollectionRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationCollectionRequestBuilder(getServiceRoot() + "/dataPolicyOperations", this, null);
    }

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    public IDataPolicyOperationRequestBuilder dataPolicyOperations(final String id) {
        return new DataPolicyOperationRequestBuilder(getServiceRoot() + "/dataPolicyOperations/" + id, this, null);
    }

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", this, null);
    }

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, this, null);
    }

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    public IChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getServiceRoot() + "/chats", this, null);
    }

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    public IChatRequestBuilder chats(final String id) {
        return new ChatRequestBuilder(getServiceRoot() + "/chats/" + id, this, null);
    }

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    public ITeamCollectionRequestBuilder teams() {
        return new TeamCollectionRequestBuilder(getServiceRoot() + "/teams", this, null);
    }

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    public ITeamRequestBuilder teams(final String id) {
        return new TeamRequestBuilder(getServiceRoot() + "/teams/" + id, this, null);
    }

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    public ITeamsTemplateCollectionRequestBuilder teamsTemplates() {
        return new TeamsTemplateCollectionRequestBuilder(getServiceRoot() + "/teamsTemplates", this, null);
    }

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    public ITeamsTemplateRequestBuilder teamsTemplates(final String id) {
        return new TeamsTemplateRequestBuilder(getServiceRoot() + "/teamsTemplates/" + id, this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    public IAuditLogRootRequestBuilder auditLogs() {
        return new AuditLogRootRequestBuilder(getServiceRoot() + "/auditLogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    public IIdentityContainerRequestBuilder identity() {
        return new IdentityContainerRequestBuilder(getServiceRoot() + "/identity", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    public IDirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(getServiceRoot() + "/directory", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    public IUserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    public IPolicyRootRequestBuilder policies() {
        return new PolicyRootRequestBuilder(getServiceRoot() + "/policies", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    public IEducationRootRequestBuilder education() {
        return new EducationRootRequestBuilder(getServiceRoot() + "/education", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    public ICloudCommunicationsRequestBuilder communications() {
        return new CloudCommunicationsRequestBuilder(getServiceRoot() + "/communications", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    public IDeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(getServiceRoot() + "/deviceAppManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    public IDeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(getServiceRoot() + "/deviceManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    public IReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getServiceRoot() + "/reports", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    public ISearchEntityRequestBuilder search() {
        return new SearchEntityRequestBuilder(getServiceRoot() + "/search", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    public IPlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    public ISecurityRequestBuilder security() {
        return new SecurityRequestBuilder(getServiceRoot() + "/security", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    public IAppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(getServiceRoot() + "/appCatalogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    public ITeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(getServiceRoot() + "/teamwork", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    public IInformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getServiceRoot() + "/informationProtection", this, null);
    }
}
