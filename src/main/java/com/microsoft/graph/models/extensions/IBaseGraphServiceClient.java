// Template Source: IBaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
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
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    @Nonnull
    InvitationCollectionRequestBuilder invitations();

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    @Nonnull
    InvitationRequestBuilder invitations(@Nonnull final String id);

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    @Nonnull
    UserCollectionRequestBuilder users();

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    @Nonnull
    UserRequestBuilder users(@Nonnull final String id);

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    @Nonnull
    IdentityProviderCollectionRequestBuilder identityProviders();

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    @Nonnull
    IdentityProviderRequestBuilder identityProviders(@Nonnull final String id);

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    @Nonnull
    ApplicationCollectionRequestBuilder applications();

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    @Nonnull
    ApplicationRequestBuilder applications(@Nonnull final String id);

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    @Nonnull
    CertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration();

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    @Nonnull
    CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(@Nonnull final String id);

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    @Nonnull
    OrgContactCollectionRequestBuilder contacts();

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    @Nonnull
    OrgContactRequestBuilder contacts(@Nonnull final String id);

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    @Nonnull
    ContractCollectionRequestBuilder contracts();

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    @Nonnull
    ContractRequestBuilder contracts(@Nonnull final String id);

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    @Nonnull
    DeviceCollectionRequestBuilder devices();

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    @Nonnull
    DeviceRequestBuilder devices(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    @Nonnull
    DirectoryObjectCollectionRequestBuilder directoryObjects();

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    @Nonnull
    DirectoryObjectRequestBuilder directoryObjects(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    @Nonnull
    DirectoryRoleCollectionRequestBuilder directoryRoles();

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    @Nonnull
    DirectoryRoleRequestBuilder directoryRoles(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    @Nonnull
    DirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates();

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    @Nonnull
    DirectoryRoleTemplateRequestBuilder directoryRoleTemplates(@Nonnull final String id);

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    @Nonnull
    DomainDnsRecordCollectionRequestBuilder domainDnsRecords();

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    @Nonnull
    DomainDnsRecordRequestBuilder domainDnsRecords(@Nonnull final String id);

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    @Nonnull
    DomainCollectionRequestBuilder domains();

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    @Nonnull
    DomainRequestBuilder domains(@Nonnull final String id);

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    @Nonnull
    GroupCollectionRequestBuilder groups();

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    @Nonnull
    GroupRequestBuilder groups(@Nonnull final String id);

    /**
     * Gets the collection of GroupSettings objects
     *
     * @return the request builder for the collection of GroupSettings objects
     */
    @Nonnull
    GroupSettingCollectionRequestBuilder groupSettings();

    /**
     * Gets a single GroupSettings
     *
     * @param id the id of the GroupSettings to retrieve
     * @return the request builder for the GroupSettings object
     */
    @Nonnull
    GroupSettingRequestBuilder groupSettings(@Nonnull final String id);

    /**
     * Gets the collection of GroupSettingTemplates objects
     *
     * @return the request builder for the collection of GroupSettingTemplates objects
     */
    @Nonnull
    GroupSettingTemplateCollectionRequestBuilder groupSettingTemplates();

    /**
     * Gets a single GroupSettingTemplates
     *
     * @param id the id of the GroupSettingTemplates to retrieve
     * @return the request builder for the GroupSettingTemplates object
     */
    @Nonnull
    GroupSettingTemplateRequestBuilder groupSettingTemplates(@Nonnull final String id);

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    @Nonnull
    OAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants();

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    @Nonnull
    OAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(@Nonnull final String id);

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    @Nonnull
    OrganizationCollectionRequestBuilder organization();

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    @Nonnull
    OrganizationRequestBuilder organization(@Nonnull final String id);

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    @Nonnull
    ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants();

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    @Nonnull
    ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id);

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    @Nonnull
    ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships();

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    @Nonnull
    ScopedRoleMembershipRequestBuilder scopedRoleMemberships(@Nonnull final String id);

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    @Nonnull
    ServicePrincipalCollectionRequestBuilder servicePrincipals();

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    @Nonnull
    ServicePrincipalRequestBuilder servicePrincipals(@Nonnull final String id);

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    @Nonnull
    SubscribedSkuCollectionRequestBuilder subscribedSkus();

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    @Nonnull
    SubscribedSkuRequestBuilder subscribedSkus(@Nonnull final String id);

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    @Nonnull
    DriveItemCollectionRequestBuilder workbooks();

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    @Nonnull
    DriveItemRequestBuilder workbooks(@Nonnull final String id);

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    @Nonnull
    PlaceCollectionRequestBuilder places();

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    @Nonnull
    PlaceRequestBuilder places(@Nonnull final String id);

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    @Nonnull
    DriveCollectionRequestBuilder drives();

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    @Nonnull
    DriveRequestBuilder drives(@Nonnull final String id);

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    @Nonnull
    SharedDriveItemCollectionRequestBuilder shares();

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    @Nonnull
    SharedDriveItemRequestBuilder shares(@Nonnull final String id);

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    @Nonnull
    SiteCollectionRequestBuilder sites();

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    @Nonnull
    SiteRequestBuilder sites(@Nonnull final String id);

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    @Nonnull
    SchemaExtensionCollectionRequestBuilder schemaExtensions();

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    @Nonnull
    SchemaExtensionRequestBuilder schemaExtensions(@Nonnull final String id);

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    @Nonnull
    GroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    @Nonnull
    GroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(@Nonnull final String id);

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    @Nonnull
    DataPolicyOperationCollectionRequestBuilder dataPolicyOperations();

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    @Nonnull
    DataPolicyOperationRequestBuilder dataPolicyOperations(@Nonnull final String id);

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    @Nonnull
    SubscriptionCollectionRequestBuilder subscriptions();

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    @Nonnull
    SubscriptionRequestBuilder subscriptions(@Nonnull final String id);

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    @Nonnull
    ChatCollectionRequestBuilder chats();

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    @Nonnull
    ChatRequestBuilder chats(@Nonnull final String id);

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    @Nonnull
    TeamCollectionRequestBuilder teams();

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    @Nonnull
    TeamRequestBuilder teams(@Nonnull final String id);

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    @Nonnull
    TeamsTemplateCollectionRequestBuilder teamsTemplates();

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    @Nonnull
    TeamsTemplateRequestBuilder teamsTemplates(@Nonnull final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    @Nonnull
    AuditLogRootRequestBuilder auditLogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    @Nonnull
    IdentityContainerRequestBuilder identity();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    @Nonnull
    DirectoryRequestBuilder directory();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    @Nonnull
    UserRequestBuilder me();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    @Nonnull
    PolicyRootRequestBuilder policies();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    @Nonnull
    EducationRootRequestBuilder education();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    @Nonnull
    DriveRequestBuilder drive();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    @Nonnull
    CloudCommunicationsRequestBuilder communications();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    @Nonnull
    DeviceAppManagementRequestBuilder deviceAppManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    @Nonnull
    DeviceManagementRequestBuilder deviceManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    @Nonnull
    ReportRootRequestBuilder reports();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    @Nonnull
    SearchEntityRequestBuilder search();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    @Nonnull
    PlannerRequestBuilder planner();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    @Nonnull
    SecurityRequestBuilder security();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    @Nonnull
    AppCatalogsRequestBuilder appCatalogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    @Nonnull
    TeamworkRequestBuilder teamwork();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    @Nonnull
    InformationProtectionRequestBuilder informationProtection();

}
