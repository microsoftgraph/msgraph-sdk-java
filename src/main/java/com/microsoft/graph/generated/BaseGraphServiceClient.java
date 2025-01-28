package com.microsoft.graph;

import com.microsoft.graph.admin.AdminRequestBuilder;
import com.microsoft.graph.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.agreements.AgreementsRequestBuilder;
import com.microsoft.graph.appcatalogs.AppCatalogsRequestBuilder;
import com.microsoft.graph.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.applicationswithappid.ApplicationsWithAppIdRequestBuilder;
import com.microsoft.graph.applicationswithuniquename.ApplicationsWithUniqueNameRequestBuilder;
import com.microsoft.graph.applicationtemplates.ApplicationTemplatesRequestBuilder;
import com.microsoft.graph.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.auditlogs.AuditLogsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.chats.ChatsRequestBuilder;
import com.microsoft.graph.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.compliance.ComplianceRequestBuilder;
import com.microsoft.graph.connections.ConnectionsRequestBuilder;
import com.microsoft.graph.contacts.ContactsRequestBuilder;
import com.microsoft.graph.contracts.ContractsRequestBuilder;
import com.microsoft.graph.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.devicemanagement.DeviceManagementRequestBuilder;
import com.microsoft.graph.devices.DevicesRequestBuilder;
import com.microsoft.graph.deviceswithdeviceid.DevicesWithDeviceIdRequestBuilder;
import com.microsoft.graph.directory.DirectoryRequestBuilder;
import com.microsoft.graph.directoryobjects.DirectoryObjectsRequestBuilder;
import com.microsoft.graph.directoryroles.DirectoryRolesRequestBuilder;
import com.microsoft.graph.directoryroleswithroletemplateid.DirectoryRolesWithRoleTemplateIdRequestBuilder;
import com.microsoft.graph.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import com.microsoft.graph.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import com.microsoft.graph.domains.DomainsRequestBuilder;
import com.microsoft.graph.drives.DrivesRequestBuilder;
import com.microsoft.graph.education.EducationRequestBuilder;
import com.microsoft.graph.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.external.ExternalRequestBuilder;
import com.microsoft.graph.filteroperators.FilterOperatorsRequestBuilder;
import com.microsoft.graph.functions.FunctionsRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.groups.GroupsRequestBuilder;
import com.microsoft.graph.groupsettings.GroupSettingsRequestBuilder;
import com.microsoft.graph.groupsettingtemplates.GroupSettingTemplatesRequestBuilder;
import com.microsoft.graph.groupswithuniquename.GroupsWithUniqueNameRequestBuilder;
import com.microsoft.graph.identity.IdentityRequestBuilder;
import com.microsoft.graph.identitygovernance.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.identityprotection.IdentityProtectionRequestBuilder;
import com.microsoft.graph.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.invitations.InvitationsRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.organization.OrganizationRequestBuilder;
import com.microsoft.graph.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.places.PlacesRequestBuilder;
import com.microsoft.graph.planner.PlannerRequestBuilder;
import com.microsoft.graph.policies.PoliciesRequestBuilder;
import com.microsoft.graph.print.PrintRequestBuilder;
import com.microsoft.graph.privacy.PrivacyRequestBuilder;
import com.microsoft.graph.reports.ReportsRequestBuilder;
import com.microsoft.graph.rolemanagement.RoleManagementRequestBuilder;
import com.microsoft.graph.schemaextensions.SchemaExtensionsRequestBuilder;
import com.microsoft.graph.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import com.microsoft.graph.search.SearchRequestBuilder;
import com.microsoft.graph.security.SecurityRequestBuilder;
import com.microsoft.graph.serviceprincipals.ServicePrincipalsRequestBuilder;
import com.microsoft.graph.serviceprincipalswithappid.ServicePrincipalsWithAppIdRequestBuilder;
import com.microsoft.graph.shares.SharesRequestBuilder;
import com.microsoft.graph.sites.SitesRequestBuilder;
import com.microsoft.graph.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.storage.StorageRequestBuilder;
import com.microsoft.graph.subscribedskus.SubscribedSkusRequestBuilder;
import com.microsoft.graph.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.teams.TeamsRequestBuilder;
import com.microsoft.graph.teamstemplates.TeamsTemplatesRequestBuilder;
import com.microsoft.graph.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.tenantrelationships.TenantRelationshipsRequestBuilder;
import com.microsoft.graph.users.UsersRequestBuilder;
import com.microsoft.graph.userswithuserprincipalname.UsersWithUserPrincipalNameRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import com.microsoft.kiota.store.BackingStoreFactory;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseGraphServiceClient extends BaseRequestBuilder {
    /**
     * Provides operations to manage the admin singleton.
     * @return a {@link AdminRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreementAcceptance entities.
     * @return a {@link AgreementAcceptancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreement entities.
     * @return a {@link AgreementsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgreementsRequestBuilder agreements() {
        return new AgreementsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appCatalogs singleton.
     * @return a {@link AppCatalogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @return a {@link ApplicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of applicationTemplate entities.
     * @return a {@link ApplicationTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationTemplatesRequestBuilder applicationTemplates() {
        return new ApplicationTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of appRoleAssignment entities.
     * @return a {@link AppRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditLogRoot singleton.
     * @return a {@link AuditLogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditLogsRequestBuilder auditLogs() {
        return new AuditLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of authenticationMethodConfiguration entities.
     * @return a {@link AuthenticationMethodConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodsPolicy singleton.
     * @return a {@link AuthenticationMethodsPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of certificateBasedAuthConfiguration entities.
     * @return a {@link CertificateBasedAuthConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of chat entities.
     * @return a {@link ChatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudCommunications singleton.
     * @return a {@link CommunicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the compliance singleton.
     * @return a {@link ComplianceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of externalConnection entities.
     * @return a {@link ConnectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of orgContact entities.
     * @return a {@link ContactsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of contract entities.
     * @return a {@link ContractsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContractsRequestBuilder contracts() {
        return new ContractsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of dataPolicyOperation entities.
     * @return a {@link DataPolicyOperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataPolicyOperationsRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceAppManagement singleton.
     * @return a {@link DeviceAppManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagement singleton.
     * @return a {@link DeviceManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @return a {@link DevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directory singleton.
     * @return a {@link DirectoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryObject entities.
     * @return a {@link DirectoryObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryObjectsRequestBuilder directoryObjects() {
        return new DirectoryObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @return a {@link DirectoryRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesRequestBuilder directoryRoles() {
        return new DirectoryRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRoleTemplate entities.
     * @return a {@link DirectoryRoleTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRoleTemplatesRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domainDnsRecord entities.
     * @return a {@link DomainDnsRecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainDnsRecordsRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domain entities.
     * @return a {@link DomainsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of drive entities.
     * @return a {@link DrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the educationRoot singleton.
     * @return a {@link EducationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EducationRequestBuilder education() {
        return new EducationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience singleton.
     * @return a {@link EmployeeExperienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the external singleton.
     * @return a {@link ExternalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of filterOperatorSchema entities.
     * @return a {@link FilterOperatorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterOperatorsRequestBuilder filterOperators() {
        return new FilterOperatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of attributeMappingFunctionSchema entities.
     * @return a {@link FunctionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupLifecyclePolicy entities.
     * @return a {@link GroupLifecyclePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @return a {@link GroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupSetting entities.
     * @return a {@link GroupSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupSettingsRequestBuilder groupSettings() {
        return new GroupSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupSettingTemplate entities.
     * @return a {@link GroupSettingTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupSettingTemplatesRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityContainer singleton.
     * @return a {@link IdentityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityRequestBuilder identity() {
        return new IdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityGovernance singleton.
     * @return a {@link IdentityGovernanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityProtectionRoot singleton.
     * @return a {@link IdentityProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProtectionRequestBuilder identityProtection() {
        return new IdentityProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of identityProvider entities.
     * @return a {@link IdentityProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the informationProtection singleton.
     * @return a {@link InformationProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of invitation entities.
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of oAuth2PermissionGrant entities.
     * @return a {@link Oauth2PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of organization entities.
     * @return a {@link OrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of resourceSpecificPermissionGrant entities.
     * @return a {@link PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The places property
     * @return a {@link PlacesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlacesRequestBuilder places() {
        return new PlacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner singleton.
     * @return a {@link PlannerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the policyRoot singleton.
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the print singleton.
     * @return a {@link PrintRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the privacy singleton.
     * @return a {@link PrivacyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reportRoot singleton.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagement singleton.
     * @return a {@link RoleManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of schemaExtension entities.
     * @return a {@link SchemaExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SchemaExtensionsRequestBuilder schemaExtensions() {
        return new SchemaExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of scopedRoleMembership entities.
     * @return a {@link ScopedRoleMembershipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScopedRoleMembershipsRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the searchEntity singleton.
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security singleton.
     * @return a {@link SecurityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @return a {@link ServicePrincipalsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsRequestBuilder servicePrincipals() {
        return new ServicePrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of sharedDriveItem entities.
     * @return a {@link SharesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     * @return a {@link SitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the solutionsRoot singleton.
     * @return a {@link SolutionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the storage singleton.
     * @return a {@link StorageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StorageRequestBuilder storage() {
        return new StorageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     * @return a {@link SubscribedSkusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribedSkusRequestBuilder subscribedSkus() {
        return new SubscribedSkusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscription entities.
     * @return a {@link SubscriptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of team entities.
     * @return a {@link TeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamsTemplate entities.
     * @return a {@link TeamsTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsTemplatesRequestBuilder teamsTemplates() {
        return new TeamsTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork singleton.
     * @return a {@link TeamworkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantRelationship singleton.
     * @return a {@link TenantRelationshipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TenantRelationshipsRequestBuilder tenantRelationships() {
        return new TenantRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of user entities.
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param appId Alternate key of application
     * @return a {@link ApplicationsWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithAppIdRequestBuilder applicationsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ApplicationsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param uniqueName Alternate key of application
     * @return a {@link ApplicationsWithUniqueNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithUniqueNameRequestBuilder applicationsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new ApplicationsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new {@link BaseGraphServiceClient} and sets the default values.
     * @param backingStore The backing store to use for the models.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BaseGraphServiceClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final BackingStoreFactory backingStore) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://graph.microsoft.com/v1.0");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
        this.requestAdapter.enableBackingStore(backingStore);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @param deviceId Alternate key of device
     * @return a {@link DevicesWithDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesWithDeviceIdRequestBuilder devicesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DevicesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param roleTemplateId Alternate key of directoryRole
     * @return a {@link DirectoryRolesWithRoleTemplateIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesWithRoleTemplateIdRequestBuilder directoryRolesWithRoleTemplateId(@jakarta.annotation.Nonnull final String roleTemplateId) {
        Objects.requireNonNull(roleTemplateId);
        return new DirectoryRolesWithRoleTemplateIdRequestBuilder(pathParameters, requestAdapter, roleTemplateId);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @param uniqueName Alternate key of group
     * @return a {@link GroupsWithUniqueNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupsWithUniqueNameRequestBuilder groupsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new GroupsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @param appId Alternate key of servicePrincipal
     * @return a {@link ServicePrincipalsWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsWithAppIdRequestBuilder servicePrincipalsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ServicePrincipalsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the collection of user entities.
     * @param userPrincipalName Alternate key of user
     * @return a {@link UsersWithUserPrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersWithUserPrincipalNameRequestBuilder usersWithUserPrincipalName(@jakarta.annotation.Nonnull final String userPrincipalName) {
        Objects.requireNonNull(userPrincipalName);
        return new UsersWithUserPrincipalNameRequestBuilder(pathParameters, requestAdapter, userPrincipalName);
    }
}
