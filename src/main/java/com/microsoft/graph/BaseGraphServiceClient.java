package microsoft.graph;

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
import microsoft.graph.admin.AdminRequestBuilder;
import microsoft.graph.agreementacceptances.AgreementAcceptancesRequestBuilder;
import microsoft.graph.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import microsoft.graph.agreements.AgreementsRequestBuilder;
import microsoft.graph.agreements.item.AgreementItemRequestBuilder;
import microsoft.graph.appcatalogs.AppCatalogsRequestBuilder;
import microsoft.graph.applications.ApplicationsRequestBuilder;
import microsoft.graph.applications.item.ApplicationItemRequestBuilder;
import microsoft.graph.applicationtemplates.ApplicationTemplatesRequestBuilder;
import microsoft.graph.applicationtemplates.item.ApplicationTemplateItemRequestBuilder;
import microsoft.graph.auditlogs.AuditLogsRequestBuilder;
import microsoft.graph.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import microsoft.graph.authenticationmethodconfigurations.item.AuthenticationMethodConfigurationItemRequestBuilder;
import microsoft.graph.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import microsoft.graph.branding.BrandingRequestBuilder;
import microsoft.graph.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import microsoft.graph.certificatebasedauthconfiguration.item.CertificateBasedAuthConfigurationItemRequestBuilder;
import microsoft.graph.chats.ChatsRequestBuilder;
import microsoft.graph.chats.item.ChatItemRequestBuilder;
import microsoft.graph.communications.CommunicationsRequestBuilder;
import microsoft.graph.compliance.ComplianceRequestBuilder;
import microsoft.graph.connections.ConnectionsRequestBuilder;
import microsoft.graph.connections.item.ExternalConnectionItemRequestBuilder;
import microsoft.graph.contacts.ContactsRequestBuilder;
import microsoft.graph.contacts.item.OrgContactItemRequestBuilder;
import microsoft.graph.contracts.ContractsRequestBuilder;
import microsoft.graph.contracts.item.ContractItemRequestBuilder;
import microsoft.graph.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import microsoft.graph.datapolicyoperations.item.DataPolicyOperationItemRequestBuilder;
import microsoft.graph.deviceappmanagement.DeviceAppManagementRequestBuilder;
import microsoft.graph.devicemanagement.DeviceManagementRequestBuilder;
import microsoft.graph.devices.DevicesRequestBuilder;
import microsoft.graph.devices.item.DeviceItemRequestBuilder;
import microsoft.graph.directory.DirectoryRequestBuilder;
import microsoft.graph.directoryobjects.DirectoryObjectsRequestBuilder;
import microsoft.graph.directoryobjects.item.DirectoryObjectItemRequestBuilder;
import microsoft.graph.directoryroles.DirectoryRolesRequestBuilder;
import microsoft.graph.directoryroles.item.DirectoryRoleItemRequestBuilder;
import microsoft.graph.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import microsoft.graph.directoryroletemplates.item.DirectoryRoleTemplateItemRequestBuilder;
import microsoft.graph.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import microsoft.graph.domaindnsrecords.item.DomainDnsRecordItemRequestBuilder;
import microsoft.graph.domains.DomainsRequestBuilder;
import microsoft.graph.domains.item.DomainItemRequestBuilder;
import microsoft.graph.drive.DriveRequestBuilder;
import microsoft.graph.drives.DrivesRequestBuilder;
import microsoft.graph.drives.item.DriveItemRequestBuilder;
import microsoft.graph.education.EducationRequestBuilder;
import microsoft.graph.external.ExternalRequestBuilder;
import microsoft.graph.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import microsoft.graph.grouplifecyclepolicies.item.GroupLifecyclePolicyItemRequestBuilder;
import microsoft.graph.groups.GroupsRequestBuilder;
import microsoft.graph.groups.item.GroupItemRequestBuilder;
import microsoft.graph.groupsettings.GroupSettingsRequestBuilder;
import microsoft.graph.groupsettings.item.GroupSettingItemRequestBuilder;
import microsoft.graph.groupsettingtemplates.GroupSettingTemplatesRequestBuilder;
import microsoft.graph.groupsettingtemplates.item.GroupSettingTemplateItemRequestBuilder;
import microsoft.graph.identity.IdentityRequestBuilder;
import microsoft.graph.identitygovernance.IdentityGovernanceRequestBuilder;
import microsoft.graph.identityprotection.IdentityProtectionRequestBuilder;
import microsoft.graph.identityproviders.IdentityProvidersRequestBuilder;
import microsoft.graph.identityproviders.item.IdentityProviderItemRequestBuilder;
import microsoft.graph.informationprotection.InformationProtectionRequestBuilder;
import microsoft.graph.invitations.InvitationsRequestBuilder;
import microsoft.graph.invitations.item.InvitationItemRequestBuilder;
import microsoft.graph.localizations.item.OrganizationalBrandingLocalizationItemRequestBuilder;
import microsoft.graph.localizations.LocalizationsRequestBuilder;
import microsoft.graph.me.MeRequestBuilder;
import microsoft.graph.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import microsoft.graph.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import microsoft.graph.organization.item.OrganizationItemRequestBuilder;
import microsoft.graph.organization.OrganizationRequestBuilder;
import microsoft.graph.permissiongrants.item.ResourceSpecificPermissionGrantItemRequestBuilder;
import microsoft.graph.permissiongrants.PermissionGrantsRequestBuilder;
import microsoft.graph.places.item.PlaceItemRequestBuilder;
import microsoft.graph.places.PlacesRequestBuilder;
import microsoft.graph.planner.PlannerRequestBuilder;
import microsoft.graph.policies.PoliciesRequestBuilder;
import microsoft.graph.print.PrintRequestBuilder;
import microsoft.graph.privacy.PrivacyRequestBuilder;
import microsoft.graph.reports.ReportsRequestBuilder;
import microsoft.graph.rolemanagement.RoleManagementRequestBuilder;
import microsoft.graph.schemaextensions.item.SchemaExtensionItemRequestBuilder;
import microsoft.graph.schemaextensions.SchemaExtensionsRequestBuilder;
import microsoft.graph.scopedrolememberships.item.ScopedRoleMembershipItemRequestBuilder;
import microsoft.graph.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import microsoft.graph.search.SearchRequestBuilder;
import microsoft.graph.security.SecurityRequestBuilder;
import microsoft.graph.serviceprincipals.item.ServicePrincipalItemRequestBuilder;
import microsoft.graph.serviceprincipals.ServicePrincipalsRequestBuilder;
import microsoft.graph.shares.item.SharedDriveItemItemRequestBuilder;
import microsoft.graph.shares.SharesRequestBuilder;
import microsoft.graph.sites.item.SiteItemRequestBuilder;
import microsoft.graph.sites.SitesRequestBuilder;
import microsoft.graph.solutions.SolutionsRequestBuilder;
import microsoft.graph.subscribedskus.item.SubscribedSkuItemRequestBuilder;
import microsoft.graph.subscribedskus.SubscribedSkusRequestBuilder;
import microsoft.graph.subscriptions.item.SubscriptionItemRequestBuilder;
import microsoft.graph.subscriptions.SubscriptionsRequestBuilder;
import microsoft.graph.teams.item.TeamItemRequestBuilder;
import microsoft.graph.teams.TeamsRequestBuilder;
import microsoft.graph.teamstemplates.item.TeamsTemplateItemRequestBuilder;
import microsoft.graph.teamstemplates.TeamsTemplatesRequestBuilder;
import microsoft.graph.teamwork.TeamworkRequestBuilder;
import microsoft.graph.users.item.UserItemRequestBuilder;
import microsoft.graph.users.UsersRequestBuilder;
import microsoft.graph.workbooks.item.DriveItemItemRequestBuilder;
import microsoft.graph.workbooks.WorkbooksRequestBuilder;
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
     * Gets an item from the Microsoft.Graph.agreementAcceptances.item collection
     * @param id Unique identifier of the item
     * @return a agreementAcceptanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder agreementAcceptances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreementAcceptance%2Did", id);
        return new AgreementAcceptanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.agreements.item collection
     * @param id Unique identifier of the item
     * @return a agreementItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementItemRequestBuilder agreements(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreement%2Did", id);
        return new AgreementItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.applications.item collection
     * @param id Unique identifier of the item
     * @return a applicationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationItemRequestBuilder applications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("application%2Did", id);
        return new ApplicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.applicationTemplates.item collection
     * @param id Unique identifier of the item
     * @return a applicationTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationTemplateItemRequestBuilder applicationTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("applicationTemplate%2Did", id);
        return new ApplicationTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.authenticationMethodConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a authenticationMethodConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AuthenticationMethodConfigurationItemRequestBuilder authenticationMethodConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationMethodConfiguration%2Did", id);
        return new AuthenticationMethodConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.certificateBasedAuthConfiguration.item collection
     * @param id Unique identifier of the item
     * @return a certificateBasedAuthConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CertificateBasedAuthConfigurationItemRequestBuilder certificateBasedAuthConfiguration(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("certificateBasedAuthConfiguration%2Did", id);
        return new CertificateBasedAuthConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.chats.item collection
     * @param id Unique identifier of the item
     * @return a chatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChatItemRequestBuilder chats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chat%2Did", id);
        return new ChatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.connections.item collection
     * @param id Unique identifier of the item
     * @return a externalConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExternalConnectionItemRequestBuilder connections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
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
     * Gets an item from the Microsoft.Graph.contacts.item collection
     * @param id Unique identifier of the item
     * @return a orgContactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrgContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("orgContact%2Did", id);
        return new OrgContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.contracts.item collection
     * @param id Unique identifier of the item
     * @return a contractItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContractItemRequestBuilder contracts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contract%2Did", id);
        return new ContractItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataPolicyOperations.item collection
     * @param id Unique identifier of the item
     * @return a dataPolicyOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DataPolicyOperationItemRequestBuilder dataPolicyOperations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataPolicyOperation%2Did", id);
        return new DataPolicyOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.devices.item collection
     * @param id Unique identifier of the item
     * @return a deviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceItemRequestBuilder devices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("device%2Did", id);
        return new DeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directoryObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder directoryObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directoryRoles.item collection
     * @param id Unique identifier of the item
     * @return a directoryRoleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleItemRequestBuilder directoryRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRole%2Did", id);
        return new DirectoryRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directoryRoleTemplates.item collection
     * @param id Unique identifier of the item
     * @return a directoryRoleTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleTemplateItemRequestBuilder directoryRoleTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRoleTemplate%2Did", id);
        return new DirectoryRoleTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.domainDnsRecords.item collection
     * @param id Unique identifier of the item
     * @return a domainDnsRecordItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainDnsRecordItemRequestBuilder domainDnsRecords(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domainDnsRecord%2Did", id);
        return new DomainDnsRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.domains.item collection
     * @param id Unique identifier of the item
     * @return a domainItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainItemRequestBuilder domains(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domain%2Did", id);
        return new DomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.drives.item collection
     * @param id Unique identifier of the item
     * @return a driveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.groupLifecyclePolicies.item collection
     * @param id Unique identifier of the item
     * @return a groupLifecyclePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupLifecyclePolicyItemRequestBuilder groupLifecyclePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupLifecyclePolicy%2Did", id);
        return new GroupLifecyclePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.groups.item collection
     * @param id Unique identifier of the item
     * @return a groupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.groupSettings.item collection
     * @param id Unique identifier of the item
     * @return a groupSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupSettingItemRequestBuilder groupSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupSetting%2Did", id);
        return new GroupSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.groupSettingTemplates.item collection
     * @param id Unique identifier of the item
     * @return a groupSettingTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupSettingTemplateItemRequestBuilder groupSettingTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupSettingTemplate%2Did", id);
        return new GroupSettingTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityProviders.item collection
     * @param id Unique identifier of the item
     * @return a identityProviderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderItemRequestBuilder identityProviders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProvider%2Did", id);
        return new IdentityProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.invitations.item collection
     * @param id Unique identifier of the item
     * @return a invitationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InvitationItemRequestBuilder invitations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitation%2Did", id);
        return new InvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.localizations.item collection
     * @param id Unique identifier of the item
     * @return a organizationalBrandingLocalizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrganizationalBrandingLocalizationItemRequestBuilder localizations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organizationalBrandingLocalization%2Did", id);
        return new OrganizationalBrandingLocalizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.oauth2PermissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a oAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.organization.item collection
     * @param id Unique identifier of the item
     * @return a organizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrganizationItemRequestBuilder organization(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organization%2Did", id);
        return new OrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.permissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a resourceSpecificPermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceSpecificPermissionGrantItemRequestBuilder permissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceSpecificPermissionGrant%2Did", id);
        return new ResourceSpecificPermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.places.item collection
     * @param id Unique identifier of the item
     * @return a placeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PlaceItemRequestBuilder places(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("place%2Did", id);
        return new PlaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.schemaExtensions.item collection
     * @param id Unique identifier of the item
     * @return a schemaExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SchemaExtensionItemRequestBuilder schemaExtensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schemaExtension%2Did", id);
        return new SchemaExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.scopedRoleMemberships.item collection
     * @param id Unique identifier of the item
     * @return a scopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberships(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item collection
     * @param id Unique identifier of the item
     * @return a servicePrincipalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ServicePrincipalItemRequestBuilder servicePrincipals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("servicePrincipal%2Did", id);
        return new ServicePrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.shares.item collection
     * @param id Unique identifier of the item
     * @return a sharedDriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedDriveItemItemRequestBuilder shares(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedDriveItem%2Did", id);
        return new SharedDriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.sites.item collection
     * @param id Unique identifier of the item
     * @return a siteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder sites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.subscribedSkus.item collection
     * @param id Unique identifier of the item
     * @return a subscribedSkuItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscribedSkuItemRequestBuilder subscribedSkus(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscribedSku%2Did", id);
        return new SubscribedSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.subscriptions.item collection
     * @param id Unique identifier of the item
     * @return a subscriptionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscriptionItemRequestBuilder subscriptions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", id);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.teams.item collection
     * @param id Unique identifier of the item
     * @return a teamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder teams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.teamsTemplates.item collection
     * @param id Unique identifier of the item
     * @return a teamsTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsTemplateItemRequestBuilder teamsTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsTemplate%2Did", id);
        return new TeamsTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item collection
     * @param id Unique identifier of the item
     * @return a userItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserItemRequestBuilder users(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user%2Did", id);
        return new UserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.workbooks.item collection
     * @param id Unique identifier of the item
     * @return a driveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemItemRequestBuilder workbooks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
