package com.microsoft.graph;

import com.microsoft.graph.admin.AdminRequestBuilder;
import com.microsoft.graph.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import com.microsoft.graph.agreements.AgreementsRequestBuilder;
import com.microsoft.graph.agreements.item.AgreementItemRequestBuilder;
import com.microsoft.graph.appcatalogs.AppCatalogsRequestBuilder;
import com.microsoft.graph.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.applications.item.ApplicationItemRequestBuilder;
import com.microsoft.graph.applicationtemplates.ApplicationTemplatesRequestBuilder;
import com.microsoft.graph.applicationtemplates.item.ApplicationTemplateItemRequestBuilder;
import com.microsoft.graph.auditlogs.AuditLogsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.item.AuthenticationMethodConfigurationItemRequestBuilder;
import com.microsoft.graph.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.branding.BrandingRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.item.CertificateBasedAuthConfigurationItemRequestBuilder;
import com.microsoft.graph.chats.ChatsRequestBuilder;
import com.microsoft.graph.chats.item.ChatItemRequestBuilder;
import com.microsoft.graph.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.compliance.ComplianceRequestBuilder;
import com.microsoft.graph.connections.ConnectionsRequestBuilder;
import com.microsoft.graph.connections.item.ExternalConnectionItemRequestBuilder;
import com.microsoft.graph.contacts.ContactsRequestBuilder;
import com.microsoft.graph.contacts.item.OrgContactItemRequestBuilder;
import com.microsoft.graph.contracts.ContractsRequestBuilder;
import com.microsoft.graph.contracts.item.ContractItemRequestBuilder;
import com.microsoft.graph.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import com.microsoft.graph.datapolicyoperations.item.DataPolicyOperationItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.devicemanagement.DeviceManagementRequestBuilder;
import com.microsoft.graph.devices.DevicesRequestBuilder;
import com.microsoft.graph.devices.item.DeviceItemRequestBuilder;
import com.microsoft.graph.directory.DirectoryRequestBuilder;
import com.microsoft.graph.directoryobjects.DirectoryObjectsRequestBuilder;
import com.microsoft.graph.directoryobjects.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.directoryroles.DirectoryRolesRequestBuilder;
import com.microsoft.graph.directoryroles.item.DirectoryRoleItemRequestBuilder;
import com.microsoft.graph.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import com.microsoft.graph.directoryroletemplates.item.DirectoryRoleTemplateItemRequestBuilder;
import com.microsoft.graph.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import com.microsoft.graph.domaindnsrecords.item.DomainDnsRecordItemRequestBuilder;
import com.microsoft.graph.domains.DomainsRequestBuilder;
import com.microsoft.graph.domains.item.DomainItemRequestBuilder;
import com.microsoft.graph.drive.DriveRequestBuilder;
import com.microsoft.graph.drives.DrivesRequestBuilder;
import com.microsoft.graph.drives.item.DriveItemRequestBuilder;
import com.microsoft.graph.education.EducationRequestBuilder;
import com.microsoft.graph.external.ExternalRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.item.GroupLifecyclePolicyItemRequestBuilder;
import com.microsoft.graph.groups.GroupsRequestBuilder;
import com.microsoft.graph.groups.item.GroupItemRequestBuilder;
import com.microsoft.graph.groupsettings.GroupSettingsRequestBuilder;
import com.microsoft.graph.groupsettings.item.GroupSettingItemRequestBuilder;
import com.microsoft.graph.groupsettingtemplates.GroupSettingTemplatesRequestBuilder;
import com.microsoft.graph.groupsettingtemplates.item.GroupSettingTemplateItemRequestBuilder;
import com.microsoft.graph.identity.IdentityRequestBuilder;
import com.microsoft.graph.identitygovernance.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.identityprotection.IdentityProtectionRequestBuilder;
import com.microsoft.graph.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identityproviders.item.IdentityProviderItemRequestBuilder;
import com.microsoft.graph.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.invitations.InvitationsRequestBuilder;
import com.microsoft.graph.invitations.item.InvitationItemRequestBuilder;
import com.microsoft.graph.localizations.item.OrganizationalBrandingLocalizationItemRequestBuilder;
import com.microsoft.graph.localizations.LocalizationsRequestBuilder;
import com.microsoft.graph.me.MeRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.organization.item.OrganizationItemRequestBuilder;
import com.microsoft.graph.organization.OrganizationRequestBuilder;
import com.microsoft.graph.permissiongrants.item.ResourceSpecificPermissionGrantItemRequestBuilder;
import com.microsoft.graph.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.places.item.PlaceItemRequestBuilder;
import com.microsoft.graph.places.PlacesRequestBuilder;
import com.microsoft.graph.planner.PlannerRequestBuilder;
import com.microsoft.graph.policies.PoliciesRequestBuilder;
import com.microsoft.graph.print.PrintRequestBuilder;
import com.microsoft.graph.privacy.PrivacyRequestBuilder;
import com.microsoft.graph.reports.ReportsRequestBuilder;
import com.microsoft.graph.rolemanagement.RoleManagementRequestBuilder;
import com.microsoft.graph.schemaextensions.item.SchemaExtensionItemRequestBuilder;
import com.microsoft.graph.schemaextensions.SchemaExtensionsRequestBuilder;
import com.microsoft.graph.scopedrolememberships.item.ScopedRoleMembershipItemRequestBuilder;
import com.microsoft.graph.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import com.microsoft.graph.search.SearchRequestBuilder;
import com.microsoft.graph.security.SecurityRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.ServicePrincipalItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.ServicePrincipalsRequestBuilder;
import com.microsoft.graph.shares.item.SharedDriveItemItemRequestBuilder;
import com.microsoft.graph.shares.SharesRequestBuilder;
import com.microsoft.graph.sites.item.SiteItemRequestBuilder;
import com.microsoft.graph.sites.SitesRequestBuilder;
import com.microsoft.graph.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.subscribedskus.item.SubscribedSkuItemRequestBuilder;
import com.microsoft.graph.subscribedskus.SubscribedSkusRequestBuilder;
import com.microsoft.graph.subscriptions.item.SubscriptionItemRequestBuilder;
import com.microsoft.graph.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.teams.item.TeamItemRequestBuilder;
import com.microsoft.graph.teams.TeamsRequestBuilder;
import com.microsoft.graph.teamstemplates.item.TeamsTemplateItemRequestBuilder;
import com.microsoft.graph.teamstemplates.TeamsTemplatesRequestBuilder;
import com.microsoft.graph.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.users.item.UserItemRequestBuilder;
import com.microsoft.graph.users.UsersRequestBuilder;
import com.microsoft.graph.workbooks.item.DriveItemItemRequestBuilder;
import com.microsoft.graph.workbooks.WorkbooksRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/** The main entry point of the SDK, exposes the configuration and the fluent API. */
public class BaseGraphServiceClient {
    /** The admin property */
    @javax.annotation.Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agreementAcceptances property */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agreements property */
    @javax.annotation.Nonnull
    public AgreementsRequestBuilder agreements() {
        return new AgreementsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appCatalogs property */
    @javax.annotation.Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The applications property */
    @javax.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The applicationTemplates property */
    @javax.annotation.Nonnull
    public ApplicationTemplatesRequestBuilder applicationTemplates() {
        return new ApplicationTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The auditLogs property */
    @javax.annotation.Nonnull
    public AuditLogsRequestBuilder auditLogs() {
        return new AuditLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authenticationMethodConfigurations property */
    @javax.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authenticationMethodsPolicy property */
    @javax.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The branding property */
    @javax.annotation.Nonnull
    public BrandingRequestBuilder branding() {
        return new BrandingRequestBuilder(pathParameters, requestAdapter);
    }
    /** The certificateBasedAuthConfiguration property */
    @javax.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The chats property */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The communications property */
    @javax.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The compliance property */
    @javax.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The connections property */
    @javax.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contacts property */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contracts property */
    @javax.annotation.Nonnull
    public ContractsRequestBuilder contracts() {
        return new ContractsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The dataPolicyOperations property */
    @javax.annotation.Nonnull
    public DataPolicyOperationsRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceAppManagement property */
    @javax.annotation.Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceManagement property */
    @javax.annotation.Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The devices property */
    @javax.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directory property */
    @javax.annotation.Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directoryObjects property */
    @javax.annotation.Nonnull
    public DirectoryObjectsRequestBuilder directoryObjects() {
        return new DirectoryObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directoryRoles property */
    @javax.annotation.Nonnull
    public DirectoryRolesRequestBuilder directoryRoles() {
        return new DirectoryRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directoryRoleTemplates property */
    @javax.annotation.Nonnull
    public DirectoryRoleTemplatesRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The domainDnsRecords property */
    @javax.annotation.Nonnull
    public DomainDnsRecordsRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The domains property */
    @javax.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drive property */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drives property */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The education property */
    @javax.annotation.Nonnull
    public EducationRequestBuilder education() {
        return new EducationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The external property */
    @javax.annotation.Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(pathParameters, requestAdapter);
    }
    /** The groupLifecyclePolicies property */
    @javax.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The groups property */
    @javax.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The groupSettings property */
    @javax.annotation.Nonnull
    public GroupSettingsRequestBuilder groupSettings() {
        return new GroupSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The groupSettingTemplates property */
    @javax.annotation.Nonnull
    public GroupSettingTemplatesRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The identity property */
    @javax.annotation.Nonnull
    public IdentityRequestBuilder identity() {
        return new IdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The identityGovernance property */
    @javax.annotation.Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The identityProtection property */
    @javax.annotation.Nonnull
    public IdentityProtectionRequestBuilder identityProtection() {
        return new IdentityProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The identityProviders property */
    @javax.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The informationProtection property */
    @javax.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invitations property */
    @javax.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The localizations property */
    @javax.annotation.Nonnull
    public LocalizationsRequestBuilder localizations() {
        return new LocalizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The me property */
    @javax.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /** The oauth2PermissionGrants property */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The organization property */
    @javax.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The permissionGrants property */
    @javax.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The places property */
    @javax.annotation.Nonnull
    public PlacesRequestBuilder places() {
        return new PlacesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The planner property */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The policies property */
    @javax.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The print property */
    @javax.annotation.Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(pathParameters, requestAdapter);
    }
    /** The privacy property */
    @javax.annotation.Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reports property */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The roleManagement property */
    @javax.annotation.Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The schemaExtensions property */
    @javax.annotation.Nonnull
    public SchemaExtensionsRequestBuilder schemaExtensions() {
        return new SchemaExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The scopedRoleMemberships property */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipsRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The search property */
    @javax.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /** The security property */
    @javax.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The servicePrincipals property */
    @javax.annotation.Nonnull
    public ServicePrincipalsRequestBuilder servicePrincipals() {
        return new ServicePrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The shares property */
    @javax.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sites property */
    @javax.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The solutions property */
    @javax.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subscribedSkus property */
    @javax.annotation.Nonnull
    public SubscribedSkusRequestBuilder subscribedSkus() {
        return new SubscribedSkusRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subscriptions property */
    @javax.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teams property */
    @javax.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teamsTemplates property */
    @javax.annotation.Nonnull
    public TeamsTemplatesRequestBuilder teamsTemplates() {
        return new TeamsTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teamwork property */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The users property */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The workbooks property */
    @javax.annotation.Nonnull
    public WorkbooksRequestBuilder workbooks() {
        return new WorkbooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.agreementAcceptances.item collection
     * @param id Unique identifier of the item
     * @return a AgreementAcceptanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder agreementAcceptances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreementAcceptance%2Did", id);
        return new AgreementAcceptanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.agreements.item collection
     * @param id Unique identifier of the item
     * @return a AgreementItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementItemRequestBuilder agreements(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreement%2Did", id);
        return new AgreementItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.applications.item collection
     * @param id Unique identifier of the item
     * @return a ApplicationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationItemRequestBuilder applications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("application%2Did", id);
        return new ApplicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.applicationTemplates.item collection
     * @param id Unique identifier of the item
     * @return a ApplicationTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationTemplateItemRequestBuilder applicationTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("applicationTemplate%2Did", id);
        return new ApplicationTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.authenticationMethodConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a AuthenticationMethodConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AuthenticationMethodConfigurationItemRequestBuilder authenticationMethodConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationMethodConfiguration%2Did", id);
        return new AuthenticationMethodConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.certificateBasedAuthConfiguration.item collection
     * @param id Unique identifier of the item
     * @return a CertificateBasedAuthConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CertificateBasedAuthConfigurationItemRequestBuilder certificateBasedAuthConfiguration(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("certificateBasedAuthConfiguration%2Did", id);
        return new CertificateBasedAuthConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.chats.item collection
     * @param id Unique identifier of the item
     * @return a ChatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChatItemRequestBuilder chats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chat%2Did", id);
        return new ChatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.connections.item collection
     * @param id Unique identifier of the item
     * @return a ExternalConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExternalConnectionItemRequestBuilder connections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("externalConnection%2Did", id);
        return new ExternalConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public BaseGraphServiceClient(@javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(requestAdapter);
        this.pathParameters = new HashMap<>();
        this.urlTemplate = "{+baseurl}";
        this.requestAdapter = requestAdapter;
        ApiClientBuilder.registerDefaultSerializer(JsonSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(TextSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(JsonParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(TextParseNodeFactory.class);
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://graph.microsoft.com/v1.0");
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.contacts.item collection
     * @param id Unique identifier of the item
     * @return a OrgContactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrgContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("orgContact%2Did", id);
        return new OrgContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.contracts.item collection
     * @param id Unique identifier of the item
     * @return a ContractItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContractItemRequestBuilder contracts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contract%2Did", id);
        return new ContractItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.dataPolicyOperations.item collection
     * @param id Unique identifier of the item
     * @return a DataPolicyOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DataPolicyOperationItemRequestBuilder dataPolicyOperations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataPolicyOperation%2Did", id);
        return new DataPolicyOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.devices.item collection
     * @param id Unique identifier of the item
     * @return a DeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceItemRequestBuilder devices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("device%2Did", id);
        return new DeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.directoryObjects.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder directoryObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.directoryRoles.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryRoleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleItemRequestBuilder directoryRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRole%2Did", id);
        return new DirectoryRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.directoryRoleTemplates.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryRoleTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleTemplateItemRequestBuilder directoryRoleTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRoleTemplate%2Did", id);
        return new DirectoryRoleTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.domainDnsRecords.item collection
     * @param id Unique identifier of the item
     * @return a DomainDnsRecordItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainDnsRecordItemRequestBuilder domainDnsRecords(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domainDnsRecord%2Did", id);
        return new DomainDnsRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.domains.item collection
     * @param id Unique identifier of the item
     * @return a DomainItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainItemRequestBuilder domains(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domain%2Did", id);
        return new DomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.drives.item collection
     * @param id Unique identifier of the item
     * @return a DriveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.groupLifecyclePolicies.item collection
     * @param id Unique identifier of the item
     * @return a GroupLifecyclePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupLifecyclePolicyItemRequestBuilder groupLifecyclePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupLifecyclePolicy%2Did", id);
        return new GroupLifecyclePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.groups.item collection
     * @param id Unique identifier of the item
     * @return a GroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.groupSettings.item collection
     * @param id Unique identifier of the item
     * @return a GroupSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupSettingItemRequestBuilder groupSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupSetting%2Did", id);
        return new GroupSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.groupSettingTemplates.item collection
     * @param id Unique identifier of the item
     * @return a GroupSettingTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupSettingTemplateItemRequestBuilder groupSettingTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupSettingTemplate%2Did", id);
        return new GroupSettingTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityProviders.item collection
     * @param id Unique identifier of the item
     * @return a IdentityProviderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderItemRequestBuilder identityProviders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProvider%2Did", id);
        return new IdentityProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.invitations.item collection
     * @param id Unique identifier of the item
     * @return a InvitationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InvitationItemRequestBuilder invitations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitation%2Did", id);
        return new InvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.localizations.item collection
     * @param id Unique identifier of the item
     * @return a OrganizationalBrandingLocalizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrganizationalBrandingLocalizationItemRequestBuilder localizations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organizationalBrandingLocalization%2Did", id);
        return new OrganizationalBrandingLocalizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.oauth2PermissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a OAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.organization.item collection
     * @param id Unique identifier of the item
     * @return a OrganizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrganizationItemRequestBuilder organization(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organization%2Did", id);
        return new OrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.permissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a ResourceSpecificPermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceSpecificPermissionGrantItemRequestBuilder permissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceSpecificPermissionGrant%2Did", id);
        return new ResourceSpecificPermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.places.item collection
     * @param id Unique identifier of the item
     * @return a PlaceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PlaceItemRequestBuilder places(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("place%2Did", id);
        return new PlaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.schemaExtensions.item collection
     * @param id Unique identifier of the item
     * @return a SchemaExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SchemaExtensionItemRequestBuilder schemaExtensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schemaExtension%2Did", id);
        return new SchemaExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.scopedRoleMemberships.item collection
     * @param id Unique identifier of the item
     * @return a ScopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberships(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.servicePrincipals.item collection
     * @param id Unique identifier of the item
     * @return a ServicePrincipalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ServicePrincipalItemRequestBuilder servicePrincipals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("servicePrincipal%2Did", id);
        return new ServicePrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.shares.item collection
     * @param id Unique identifier of the item
     * @return a SharedDriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedDriveItemItemRequestBuilder shares(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedDriveItem%2Did", id);
        return new SharedDriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item collection
     * @param id Unique identifier of the item
     * @return a SiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder sites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.subscribedSkus.item collection
     * @param id Unique identifier of the item
     * @return a SubscribedSkuItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscribedSkuItemRequestBuilder subscribedSkus(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscribedSku%2Did", id);
        return new SubscribedSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.subscriptions.item collection
     * @param id Unique identifier of the item
     * @return a SubscriptionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscriptionItemRequestBuilder subscriptions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", id);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item collection
     * @param id Unique identifier of the item
     * @return a TeamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder teams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teamsTemplates.item collection
     * @param id Unique identifier of the item
     * @return a TeamsTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsTemplateItemRequestBuilder teamsTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsTemplate%2Did", id);
        return new TeamsTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.users.item collection
     * @param id Unique identifier of the item
     * @return a UserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserItemRequestBuilder users(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user%2Did", id);
        return new UserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item collection
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemItemRequestBuilder workbooks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
