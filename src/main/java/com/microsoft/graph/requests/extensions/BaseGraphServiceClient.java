// Template Source: Templates\Java\requests_extensions\BaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
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
    @Nonnull
    public String getServiceRoot() {
        if (endpoint == null) {
            endpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return endpoint;
    }

    @Override
    public void setServiceRoot(@Nonnull final String value) {
        endpoint = value;
    }

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    @Nonnull
    public InvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", this, null);
    }

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    @Nonnull
    public InvitationRequestBuilder invitations(@Nonnull final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, this, null);
    }

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    @Nonnull
    public UserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", this, null);
    }

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    @Nonnull
    public UserRequestBuilder users(@Nonnull final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, this, null);
    }

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    @Nonnull
    public IdentityProviderCollectionRequestBuilder identityProviders() {
        return new IdentityProviderCollectionRequestBuilder(getServiceRoot() + "/identityProviders", this, null);
    }

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    @Nonnull
    public IdentityProviderRequestBuilder identityProviders(@Nonnull final String id) {
        return new IdentityProviderRequestBuilder(getServiceRoot() + "/identityProviders/" + id, this, null);
    }

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder applications() {
        return new ApplicationCollectionRequestBuilder(getServiceRoot() + "/applications", this, null);
    }

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    @Nonnull
    public ApplicationRequestBuilder applications(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getServiceRoot() + "/applications/" + id, this, null);
    }

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationCollectionRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration", this, null);
    }

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    @Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(@Nonnull final String id) {
        return new CertificateBasedAuthConfigurationRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration/" + id, this, null);
    }

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder contacts() {
        return new OrgContactCollectionRequestBuilder(getServiceRoot() + "/contacts", this, null);
    }

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    @Nonnull
    public OrgContactRequestBuilder contacts(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getServiceRoot() + "/contacts/" + id, this, null);
    }

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    @Nonnull
    public ContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", this, null);
    }

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    @Nonnull
    public ContractRequestBuilder contracts(@Nonnull final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, this, null);
    }

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    @Nonnull
    public DeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", this, null);
    }

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    @Nonnull
    public DeviceRequestBuilder devices(@Nonnull final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    @Nonnull
    public DirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", this, null);
    }

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    @Nonnull
    public DirectoryObjectRequestBuilder directoryObjects(@Nonnull final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    @Nonnull
    public DirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", this, null);
    }

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    @Nonnull
    public DirectoryRoleRequestBuilder directoryRoles(@Nonnull final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    @Nonnull
    public DirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    @Nonnull
    public DirectoryRoleTemplateRequestBuilder directoryRoleTemplates(@Nonnull final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    @Nonnull
    public DomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", this, null);
    }

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    @Nonnull
    public DomainDnsRecordRequestBuilder domainDnsRecords(@Nonnull final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, this, null);
    }

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    @Nonnull
    public DomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", this, null);
    }

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    @Nonnull
    public DomainRequestBuilder domains(@Nonnull final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, this, null);
    }

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    @Nonnull
    public GroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", this, null);
    }

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    @Nonnull
    public GroupRequestBuilder groups(@Nonnull final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, this, null);
    }

    /**
     * Gets the collection of GroupSettings objects
     *
     * @return the request builder for the collection of GroupSettings objects
     */
    @Nonnull
    public GroupSettingCollectionRequestBuilder groupSettings() {
        return new GroupSettingCollectionRequestBuilder(getServiceRoot() + "/groupSettings", this, null);
    }

    /**
     * Gets a single GroupSettings
     *
     * @param id the id of the GroupSettings to retrieve
     * @return the request builder for the GroupSettings object
     */
    @Nonnull
    public GroupSettingRequestBuilder groupSettings(@Nonnull final String id) {
        return new GroupSettingRequestBuilder(getServiceRoot() + "/groupSettings/" + id, this, null);
    }

    /**
     * Gets the collection of GroupSettingTemplates objects
     *
     * @return the request builder for the collection of GroupSettingTemplates objects
     */
    @Nonnull
    public GroupSettingTemplateCollectionRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplateCollectionRequestBuilder(getServiceRoot() + "/groupSettingTemplates", this, null);
    }

    /**
     * Gets a single GroupSettingTemplates
     *
     * @param id the id of the GroupSettingTemplates to retrieve
     * @return the request builder for the GroupSettingTemplates object
     */
    @Nonnull
    public GroupSettingTemplateRequestBuilder groupSettingTemplates(@Nonnull final String id) {
        return new GroupSettingTemplateRequestBuilder(getServiceRoot() + "/groupSettingTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    @Nonnull
    public OAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants", this, null);
    }

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    @Nonnull
    public OAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(@Nonnull final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    @Nonnull
    public OrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", this, null);
    }

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    @Nonnull
    public OrganizationRequestBuilder organization(@Nonnull final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, this, null);
    }

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    @Nonnull
    public ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getServiceRoot() + "/permissionGrants", this, null);
    }

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    @Nonnull
    public ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getServiceRoot() + "/permissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    @Nonnull
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getServiceRoot() + "/scopedRoleMemberships", this, null);
    }

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    @Nonnull
    public ScopedRoleMembershipRequestBuilder scopedRoleMemberships(@Nonnull final String id) {
        return new ScopedRoleMembershipRequestBuilder(getServiceRoot() + "/scopedRoleMemberships/" + id, this, null);
    }

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder servicePrincipals() {
        return new ServicePrincipalCollectionRequestBuilder(getServiceRoot() + "/servicePrincipals", this, null);
    }

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    @Nonnull
    public ServicePrincipalRequestBuilder servicePrincipals(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getServiceRoot() + "/servicePrincipals/" + id, this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    @Nonnull
    public SubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", this, null);
    }

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    @Nonnull
    public SubscribedSkuRequestBuilder subscribedSkus(@Nonnull final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, this, null);
    }

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    @Nonnull
    public DriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", this, null);
    }

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    @Nonnull
    public DriveItemRequestBuilder workbooks(@Nonnull final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, this, null);
    }

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    @Nonnull
    public PlaceCollectionRequestBuilder places() {
        return new PlaceCollectionRequestBuilder(getServiceRoot() + "/places", this, null);
    }

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    @Nonnull
    public PlaceRequestBuilder places(@Nonnull final String id) {
        return new PlaceRequestBuilder(getServiceRoot() + "/places/" + id, this, null);
    }

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", this, null);
    }

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, this, null);
    }

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    @Nonnull
    public SharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", this, null);
    }

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    @Nonnull
    public SharedDriveItemRequestBuilder shares(@Nonnull final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, this, null);
    }

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    @Nonnull
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", this, null);
    }

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    @Nonnull
    public SiteRequestBuilder sites(@Nonnull final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    @Nonnull
    public SchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", this, null);
    }

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    @Nonnull
    public SchemaExtensionRequestBuilder schemaExtensions(@Nonnull final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, this, null);
    }

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    @Nonnull
    public GroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies", this, null);
    }

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    @Nonnull
    public GroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(@Nonnull final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies/" + id, this, null);
    }

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    @Nonnull
    public DataPolicyOperationCollectionRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationCollectionRequestBuilder(getServiceRoot() + "/dataPolicyOperations", this, null);
    }

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    @Nonnull
    public DataPolicyOperationRequestBuilder dataPolicyOperations(@Nonnull final String id) {
        return new DataPolicyOperationRequestBuilder(getServiceRoot() + "/dataPolicyOperations/" + id, this, null);
    }

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    @Nonnull
    public SubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", this, null);
    }

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    @Nonnull
    public SubscriptionRequestBuilder subscriptions(@Nonnull final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, this, null);
    }

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    @Nonnull
    public ChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getServiceRoot() + "/chats", this, null);
    }

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    @Nonnull
    public ChatRequestBuilder chats(@Nonnull final String id) {
        return new ChatRequestBuilder(getServiceRoot() + "/chats/" + id, this, null);
    }

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    @Nonnull
    public TeamCollectionRequestBuilder teams() {
        return new TeamCollectionRequestBuilder(getServiceRoot() + "/teams", this, null);
    }

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    @Nonnull
    public TeamRequestBuilder teams(@Nonnull final String id) {
        return new TeamRequestBuilder(getServiceRoot() + "/teams/" + id, this, null);
    }

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    @Nonnull
    public TeamsTemplateCollectionRequestBuilder teamsTemplates() {
        return new TeamsTemplateCollectionRequestBuilder(getServiceRoot() + "/teamsTemplates", this, null);
    }

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    @Nonnull
    public TeamsTemplateRequestBuilder teamsTemplates(@Nonnull final String id) {
        return new TeamsTemplateRequestBuilder(getServiceRoot() + "/teamsTemplates/" + id, this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    @Nonnull
    public AuditLogRootRequestBuilder auditLogs() {
        return new AuditLogRootRequestBuilder(getServiceRoot() + "/auditLogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    @Nonnull
    public IdentityContainerRequestBuilder identity() {
        return new IdentityContainerRequestBuilder(getServiceRoot() + "/identity", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    @Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(getServiceRoot() + "/directory", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    @Nonnull
    public UserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    @Nonnull
    public PolicyRootRequestBuilder policies() {
        return new PolicyRootRequestBuilder(getServiceRoot() + "/policies", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    @Nonnull
    public EducationRootRequestBuilder education() {
        return new EducationRootRequestBuilder(getServiceRoot() + "/education", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    @Nonnull
    public CloudCommunicationsRequestBuilder communications() {
        return new CloudCommunicationsRequestBuilder(getServiceRoot() + "/communications", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    @Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(getServiceRoot() + "/deviceAppManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    @Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(getServiceRoot() + "/deviceManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    @Nonnull
    public ReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getServiceRoot() + "/reports", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    @Nonnull
    public SearchEntityRequestBuilder search() {
        return new SearchEntityRequestBuilder(getServiceRoot() + "/search", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    @Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    @Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(getServiceRoot() + "/security", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    @Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(getServiceRoot() + "/appCatalogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    @Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(getServiceRoot() + "/teamwork", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    @Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getServiceRoot() + "/informationProtection", this, null);
    }
}
