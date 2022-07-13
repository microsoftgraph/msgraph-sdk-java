package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Entity implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The id property */
    private String _id;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new entity and sets the default values.
     * @return a void
     */
    public Entity() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.entity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entity
     */
    @javax.annotation.Nonnull
    public static Entity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackage": return new AccessPackage();
                case "#microsoft.graph.accessPackageAssignment": return new AccessPackageAssignment();
                case "#microsoft.graph.accessPackageAssignmentPolicy": return new AccessPackageAssignmentPolicy();
                case "#microsoft.graph.accessPackageAssignmentRequest": return new AccessPackageAssignmentRequest();
                case "#microsoft.graph.accessPackageCatalog": return new AccessPackageCatalog();
                case "#microsoft.graph.accessPackageSubject": return new AccessPackageSubject();
                case "#microsoft.graph.accessReviewHistoryDefinition": return new AccessReviewHistoryDefinition();
                case "#microsoft.graph.accessReviewHistoryInstance": return new AccessReviewHistoryInstance();
                case "#microsoft.graph.accessReviewInstance": return new AccessReviewInstance();
                case "#microsoft.graph.accessReviewInstanceDecisionItem": return new AccessReviewInstanceDecisionItem();
                case "#microsoft.graph.accessReviewReviewer": return new AccessReviewReviewer();
                case "#microsoft.graph.accessReviewScheduleDefinition": return new AccessReviewScheduleDefinition();
                case "#microsoft.graph.accessReviewSet": return new AccessReviewSet();
                case "#microsoft.graph.accessReviewStage": return new AccessReviewStage();
                case "#microsoft.graph.activityHistoryItem": return new ActivityHistoryItem();
                case "#microsoft.graph.adminConsentRequestPolicy": return new AdminConsentRequestPolicy();
                case "#microsoft.graph.agreement": return new Agreement();
                case "#microsoft.graph.agreementAcceptance": return new AgreementAcceptance();
                case "#microsoft.graph.agreementFileProperties": return new AgreementFileProperties();
                case "#microsoft.graph.alert": return new Alert();
                case "#microsoft.graph.appCatalogs": return new AppCatalogs();
                case "#microsoft.graph.appConsentApprovalRoute": return new AppConsentApprovalRoute();
                case "#microsoft.graph.appConsentRequest": return new AppConsentRequest();
                case "#microsoft.graph.applePushNotificationCertificate": return new ApplePushNotificationCertificate();
                case "#microsoft.graph.applicationTemplate": return new ApplicationTemplate();
                case "#microsoft.graph.approval": return new Approval();
                case "#microsoft.graph.approvalStage": return new ApprovalStage();
                case "#microsoft.graph.appScope": return new AppScope();
                case "#microsoft.graph.attachment": return new Attachment();
                case "#microsoft.graph.attendanceRecord": return new AttendanceRecord();
                case "#microsoft.graph.audioRoutingGroup": return new AudioRoutingGroup();
                case "#microsoft.graph.auditLogRoot": return new AuditLogRoot();
                case "#microsoft.graph.authentication": return new Authentication();
                case "#microsoft.graph.authenticationFlowsPolicy": return new AuthenticationFlowsPolicy();
                case "#microsoft.graph.authenticationMethod": return new AuthenticationMethod();
                case "#microsoft.graph.authenticationMethodConfiguration": return new AuthenticationMethodConfiguration();
                case "#microsoft.graph.authenticationMethodsPolicy": return new AuthenticationMethodsPolicy();
                case "#microsoft.graph.authenticationMethodTarget": return new AuthenticationMethodTarget();
                case "#microsoft.graph.authoredNote": return new AuthoredNote();
                case "#microsoft.graph.baseItem": return new BaseItem();
                case "#microsoft.graph.baseItemVersion": return new BaseItemVersion();
                case "#microsoft.graph.bitlocker": return new Bitlocker();
                case "#microsoft.graph.bitlockerRecoveryKey": return new BitlockerRecoveryKey();
                case "#microsoft.graph.bookingAppointment": return new BookingAppointment();
                case "#microsoft.graph.bookingBusiness": return new BookingBusiness();
                case "#microsoft.graph.bookingCurrency": return new BookingCurrency();
                case "#microsoft.graph.bookingCustomerBase": return new BookingCustomerBase();
                case "#microsoft.graph.bookingCustomQuestion": return new BookingCustomQuestion();
                case "#microsoft.graph.bookingService": return new BookingService();
                case "#microsoft.graph.bookingStaffMemberBase": return new BookingStaffMemberBase();
                case "#microsoft.graph.calendar": return new Calendar();
                case "#microsoft.graph.calendarGroup": return new CalendarGroup();
                case "#microsoft.graph.calendarPermission": return new CalendarPermission();
                case "#microsoft.graph.call": return new Call();
                case "#microsoft.graph.callRecords.callRecord": return new CallRecord();
                case "#microsoft.graph.callRecords.segment": return new Segment();
                case "#microsoft.graph.callRecords.session": return new Session();
                case "#microsoft.graph.certificateBasedAuthConfiguration": return new CertificateBasedAuthConfiguration();
                case "#microsoft.graph.changeTrackedEntity": return new ChangeTrackedEntity();
                case "#microsoft.graph.channel": return new Channel();
                case "#microsoft.graph.chat": return new Chat();
                case "#microsoft.graph.chatMessage": return new ChatMessage();
                case "#microsoft.graph.checklistItem": return new ChecklistItem();
                case "#microsoft.graph.cloudCommunications": return new CloudCommunications();
                case "#microsoft.graph.columnDefinition": return new ColumnDefinition();
                case "#microsoft.graph.columnLink": return new ColumnLink();
                case "#microsoft.graph.commsOperation": return new CommsOperation();
                case "#microsoft.graph.complianceManagementPartner": return new ComplianceManagementPartner();
                case "#microsoft.graph.conditionalAccessPolicy": return new ConditionalAccessPolicy();
                case "#microsoft.graph.conditionalAccessRoot": return new ConditionalAccessRoot();
                case "#microsoft.graph.connectedOrganization": return new ConnectedOrganization();
                case "#microsoft.graph.contactFolder": return new ContactFolder();
                case "#microsoft.graph.contentType": return new ContentType();
                case "#microsoft.graph.conversation": return new Conversation();
                case "#microsoft.graph.conversationMember": return new ConversationMember();
                case "#microsoft.graph.conversationThread": return new ConversationThread();
                case "#microsoft.graph.crossTenantAccessPolicyConfigurationDefault": return new CrossTenantAccessPolicyConfigurationDefault();
                case "#microsoft.graph.dataPolicyOperation": return new DataPolicyOperation();
                case "#microsoft.graph.delegatedPermissionClassification": return new DelegatedPermissionClassification();
                case "#microsoft.graph.detectedApp": return new DetectedApp();
                case "#microsoft.graph.deviceAppManagement": return new DeviceAppManagement();
                case "#microsoft.graph.deviceCategory": return new DeviceCategory();
                case "#microsoft.graph.deviceComplianceActionItem": return new DeviceComplianceActionItem();
                case "#microsoft.graph.deviceComplianceDeviceOverview": return new DeviceComplianceDeviceOverview();
                case "#microsoft.graph.deviceComplianceDeviceStatus": return new DeviceComplianceDeviceStatus();
                case "#microsoft.graph.deviceCompliancePolicy": return new DeviceCompliancePolicy();
                case "#microsoft.graph.deviceCompliancePolicyAssignment": return new DeviceCompliancePolicyAssignment();
                case "#microsoft.graph.deviceCompliancePolicyDeviceStateSummary": return new DeviceCompliancePolicyDeviceStateSummary();
                case "#microsoft.graph.deviceCompliancePolicySettingStateSummary": return new DeviceCompliancePolicySettingStateSummary();
                case "#microsoft.graph.deviceCompliancePolicyState": return new DeviceCompliancePolicyState();
                case "#microsoft.graph.deviceComplianceScheduledActionForRule": return new DeviceComplianceScheduledActionForRule();
                case "#microsoft.graph.deviceComplianceSettingState": return new DeviceComplianceSettingState();
                case "#microsoft.graph.deviceComplianceUserOverview": return new DeviceComplianceUserOverview();
                case "#microsoft.graph.deviceComplianceUserStatus": return new DeviceComplianceUserStatus();
                case "#microsoft.graph.deviceConfiguration": return new DeviceConfiguration();
                case "#microsoft.graph.deviceConfigurationAssignment": return new DeviceConfigurationAssignment();
                case "#microsoft.graph.deviceConfigurationDeviceOverview": return new DeviceConfigurationDeviceOverview();
                case "#microsoft.graph.deviceConfigurationDeviceStateSummary": return new DeviceConfigurationDeviceStateSummary();
                case "#microsoft.graph.deviceConfigurationDeviceStatus": return new DeviceConfigurationDeviceStatus();
                case "#microsoft.graph.deviceConfigurationState": return new DeviceConfigurationState();
                case "#microsoft.graph.deviceConfigurationUserOverview": return new DeviceConfigurationUserOverview();
                case "#microsoft.graph.deviceConfigurationUserStatus": return new DeviceConfigurationUserStatus();
                case "#microsoft.graph.deviceEnrollmentConfiguration": return new DeviceEnrollmentConfiguration();
                case "#microsoft.graph.deviceInstallState": return new DeviceInstallState();
                case "#microsoft.graph.deviceManagement": return new DeviceManagement();
                case "#microsoft.graph.deviceManagementExchangeConnector": return new DeviceManagementExchangeConnector();
                case "#microsoft.graph.deviceManagementExportJob": return new DeviceManagementExportJob();
                case "#microsoft.graph.deviceManagementPartner": return new DeviceManagementPartner();
                case "#microsoft.graph.deviceManagementReports": return new DeviceManagementReports();
                case "#microsoft.graph.deviceManagementTroubleshootingEvent": return new DeviceManagementTroubleshootingEvent();
                case "#microsoft.graph.directory": return new Directory();
                case "#microsoft.graph.directoryAudit": return new DirectoryAudit();
                case "#microsoft.graph.directoryObject": return new DirectoryObject();
                case "#microsoft.graph.domain": return new Domain();
                case "#microsoft.graph.domainDnsRecord": return new DomainDnsRecord();
                case "#microsoft.graph.eBookInstallSummary": return new EBookInstallSummary();
                case "#microsoft.graph.educationAssignment": return new EducationAssignment();
                case "#microsoft.graph.educationAssignmentDefaults": return new EducationAssignmentDefaults();
                case "#microsoft.graph.educationAssignmentResource": return new EducationAssignmentResource();
                case "#microsoft.graph.educationAssignmentSettings": return new EducationAssignmentSettings();
                case "#microsoft.graph.educationCategory": return new EducationCategory();
                case "#microsoft.graph.educationClass": return new EducationClass();
                case "#microsoft.graph.educationOrganization": return new EducationOrganization();
                case "#microsoft.graph.educationOutcome": return new EducationOutcome();
                case "#microsoft.graph.educationRubric": return new EducationRubric();
                case "#microsoft.graph.educationSubmission": return new EducationSubmission();
                case "#microsoft.graph.educationSubmissionResource": return new EducationSubmissionResource();
                case "#microsoft.graph.educationUser": return new EducationUser();
                case "#microsoft.graph.enrollmentConfigurationAssignment": return new EnrollmentConfigurationAssignment();
                case "#microsoft.graph.entitlementManagement": return new EntitlementManagement();
                case "#microsoft.graph.entitlementManagementSettings": return new EntitlementManagementSettings();
                case "#microsoft.graph.extension": return new Extension();
                case "#microsoft.graph.externalConnectors.connectionOperation": return new ConnectionOperation();
                case "#microsoft.graph.externalConnectors.externalConnection": return new ExternalConnection();
                case "#microsoft.graph.externalConnectors.externalGroup": return new ExternalGroup();
                case "#microsoft.graph.externalConnectors.externalItem": return new ExternalItem();
                case "#microsoft.graph.externalConnectors.identity": return new Identity();
                case "#microsoft.graph.externalConnectors.schema": return new Schema();
                case "#microsoft.graph.externalDomainName": return new ExternalDomainName();
                case "#microsoft.graph.featureRolloutPolicy": return new FeatureRolloutPolicy();
                case "#microsoft.graph.federatedIdentityCredential": return new FederatedIdentityCredential();
                case "#microsoft.graph.fieldValueSet": return new FieldValueSet();
                case "#microsoft.graph.groupLifecyclePolicy": return new GroupLifecyclePolicy();
                case "#microsoft.graph.groupSetting": return new GroupSetting();
                case "#microsoft.graph.identityApiConnector": return new IdentityApiConnector();
                case "#microsoft.graph.identityContainer": return new IdentityContainer();
                case "#microsoft.graph.identityProvider": return new IdentityProvider();
                case "#microsoft.graph.identityProviderBase": return new IdentityProviderBase();
                case "#microsoft.graph.identityUserFlow": return new IdentityUserFlow();
                case "#microsoft.graph.identityUserFlowAttribute": return new IdentityUserFlowAttribute();
                case "#microsoft.graph.identityUserFlowAttributeAssignment": return new IdentityUserFlowAttributeAssignment();
                case "#microsoft.graph.importedWindowsAutopilotDeviceIdentity": return new ImportedWindowsAutopilotDeviceIdentity();
                case "#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload": return new ImportedWindowsAutopilotDeviceIdentityUpload();
                case "#microsoft.graph.inferenceClassification": return new InferenceClassification();
                case "#microsoft.graph.inferenceClassificationOverride": return new InferenceClassificationOverride();
                case "#microsoft.graph.informationProtection": return new InformationProtection();
                case "#microsoft.graph.invitation": return new Invitation();
                case "#microsoft.graph.iosUpdateDeviceStatus": return new IosUpdateDeviceStatus();
                case "#microsoft.graph.itemActivity": return new ItemActivity();
                case "#microsoft.graph.itemActivityStat": return new ItemActivityStat();
                case "#microsoft.graph.itemAnalytics": return new ItemAnalytics();
                case "#microsoft.graph.licenseDetails": return new LicenseDetails();
                case "#microsoft.graph.linkedResource": return new LinkedResource();
                case "#microsoft.graph.localizedNotificationMessage": return new LocalizedNotificationMessage();
                case "#microsoft.graph.longRunningOperation": return new LongRunningOperation();
                case "#microsoft.graph.mailFolder": return new MailFolder();
                case "#microsoft.graph.managedAppOperation": return new ManagedAppOperation();
                case "#microsoft.graph.managedAppPolicy": return new ManagedAppPolicy();
                case "#microsoft.graph.managedAppPolicyDeploymentSummary": return new ManagedAppPolicyDeploymentSummary();
                case "#microsoft.graph.managedAppRegistration": return new ManagedAppRegistration();
                case "#microsoft.graph.managedAppStatus": return new ManagedAppStatus();
                case "#microsoft.graph.managedDevice": return new ManagedDevice();
                case "#microsoft.graph.managedDeviceMobileAppConfiguration": return new ManagedDeviceMobileAppConfiguration();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationAssignment": return new ManagedDeviceMobileAppConfigurationAssignment();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationDeviceStatus": return new ManagedDeviceMobileAppConfigurationDeviceStatus();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationDeviceSummary": return new ManagedDeviceMobileAppConfigurationDeviceSummary();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationUserStatus": return new ManagedDeviceMobileAppConfigurationUserStatus();
                case "#microsoft.graph.managedDeviceMobileAppConfigurationUserSummary": return new ManagedDeviceMobileAppConfigurationUserSummary();
                case "#microsoft.graph.managedDeviceOverview": return new ManagedDeviceOverview();
                case "#microsoft.graph.managedEBook": return new ManagedEBook();
                case "#microsoft.graph.managedEBookAssignment": return new ManagedEBookAssignment();
                case "#microsoft.graph.managedMobileApp": return new ManagedMobileApp();
                case "#microsoft.graph.meetingAttendanceReport": return new MeetingAttendanceReport();
                case "#microsoft.graph.messageRule": return new MessageRule();
                case "#microsoft.graph.mobileApp": return new MobileApp();
                case "#microsoft.graph.mobileAppAssignment": return new MobileAppAssignment();
                case "#microsoft.graph.mobileAppCategory": return new MobileAppCategory();
                case "#microsoft.graph.mobileAppContent": return new MobileAppContent();
                case "#microsoft.graph.mobileAppContentFile": return new MobileAppContentFile();
                case "#microsoft.graph.mobileThreatDefenseConnector": return new MobileThreatDefenseConnector();
                case "#microsoft.graph.multiValueLegacyExtendedProperty": return new MultiValueLegacyExtendedProperty();
                case "#microsoft.graph.namedLocation": return new NamedLocation();
                case "#microsoft.graph.notificationMessageTemplate": return new NotificationMessageTemplate();
                case "#microsoft.graph.oAuth2PermissionGrant": return new OAuth2PermissionGrant();
                case "#microsoft.graph.officeGraphInsights": return new OfficeGraphInsights();
                case "#microsoft.graph.onenote": return new Onenote();
                case "#microsoft.graph.onenoteEntityBaseModel": return new OnenoteEntityBaseModel();
                case "#microsoft.graph.onlineMeeting": return new OnlineMeeting();
                case "#microsoft.graph.onPremisesConditionalAccessSettings": return new OnPremisesConditionalAccessSettings();
                case "#microsoft.graph.operation": return new Operation();
                case "#microsoft.graph.organizationalBrandingProperties": return new OrganizationalBrandingProperties();
                case "#microsoft.graph.outlookCategory": return new OutlookCategory();
                case "#microsoft.graph.outlookItem": return new OutlookItem();
                case "#microsoft.graph.outlookUser": return new OutlookUser();
                case "#microsoft.graph.participant": return new Participant();
                case "#microsoft.graph.participantJoiningNotification": return new ParticipantJoiningNotification();
                case "#microsoft.graph.participantLeftNotification": return new ParticipantLeftNotification();
                case "#microsoft.graph.permission": return new Permission();
                case "#microsoft.graph.permissionGrantConditionSet": return new PermissionGrantConditionSet();
                case "#microsoft.graph.person": return new Person();
                case "#microsoft.graph.place": return new Place();
                case "#microsoft.graph.planner": return new Planner();
                case "#microsoft.graph.plannerAssignedToTaskBoardTaskFormat": return new PlannerAssignedToTaskBoardTaskFormat();
                case "#microsoft.graph.plannerBucket": return new PlannerBucket();
                case "#microsoft.graph.plannerBucketTaskBoardTaskFormat": return new PlannerBucketTaskBoardTaskFormat();
                case "#microsoft.graph.plannerGroup": return new PlannerGroup();
                case "#microsoft.graph.plannerPlan": return new PlannerPlan();
                case "#microsoft.graph.plannerPlanDetails": return new PlannerPlanDetails();
                case "#microsoft.graph.plannerProgressTaskBoardTaskFormat": return new PlannerProgressTaskBoardTaskFormat();
                case "#microsoft.graph.plannerTask": return new PlannerTask();
                case "#microsoft.graph.plannerTaskDetails": return new PlannerTaskDetails();
                case "#microsoft.graph.plannerUser": return new PlannerUser();
                case "#microsoft.graph.policyRoot": return new PolicyRoot();
                case "#microsoft.graph.presence": return new Presence();
                case "#microsoft.graph.printConnector": return new PrintConnector();
                case "#microsoft.graph.printDocument": return new PrintDocument();
                case "#microsoft.graph.printerBase": return new PrinterBase();
                case "#microsoft.graph.printJob": return new PrintJob();
                case "#microsoft.graph.printOperation": return new PrintOperation();
                case "#microsoft.graph.printService": return new PrintService();
                case "#microsoft.graph.printServiceEndpoint": return new PrintServiceEndpoint();
                case "#microsoft.graph.printTask": return new PrintTask();
                case "#microsoft.graph.printTaskDefinition": return new PrintTaskDefinition();
                case "#microsoft.graph.printTaskTrigger": return new PrintTaskTrigger();
                case "#microsoft.graph.printUsage": return new PrintUsage();
                case "#microsoft.graph.profilePhoto": return new ProfilePhoto();
                case "#microsoft.graph.provisioningObjectSummary": return new ProvisioningObjectSummary();
                case "#microsoft.graph.rbacApplication": return new RbacApplication();
                case "#microsoft.graph.remoteAssistancePartner": return new RemoteAssistancePartner();
                case "#microsoft.graph.reportRoot": return new ReportRoot();
                case "#microsoft.graph.request": return new Request();
                case "#microsoft.graph.resourceOperation": return new ResourceOperation();
                case "#microsoft.graph.riskDetection": return new RiskDetection();
                case "#microsoft.graph.riskyUser": return new RiskyUser();
                case "#microsoft.graph.roleAssignment": return new RoleAssignment();
                case "#microsoft.graph.roleDefinition": return new RoleDefinition();
                case "#microsoft.graph.schedule": return new Schedule();
                case "#microsoft.graph.schemaExtension": return new SchemaExtension();
                case "#microsoft.graph.scopedRoleMembership": return new ScopedRoleMembership();
                case "#microsoft.graph.searchEntity": return new SearchEntity();
                case "#microsoft.graph.secureScore": return new SecureScore();
                case "#microsoft.graph.secureScoreControlProfile": return new SecureScoreControlProfile();
                case "#microsoft.graph.security": return new Security();
                case "#microsoft.graph.security.case": return new Case_escaped();
                case "#microsoft.graph.security.caseOperation": return new CaseOperation();
                case "#microsoft.graph.security.casesRoot": return new CasesRoot();
                case "#microsoft.graph.security.dataSet": return new DataSet();
                case "#microsoft.graph.security.dataSource": return new DataSource();
                case "#microsoft.graph.security.dataSourceContainer": return new DataSourceContainer();
                case "#microsoft.graph.security.ediscoveryCaseSettings": return new EdiscoveryCaseSettings();
                case "#microsoft.graph.security.search": return new Search();
                case "#microsoft.graph.security.tag": return new Tag();
                case "#microsoft.graph.serviceAnnouncement": return new ServiceAnnouncement();
                case "#microsoft.graph.serviceAnnouncementAttachment": return new ServiceAnnouncementAttachment();
                case "#microsoft.graph.serviceAnnouncementBase": return new ServiceAnnouncementBase();
                case "#microsoft.graph.serviceHealth": return new ServiceHealth();
                case "#microsoft.graph.settingStateDeviceSummary": return new SettingStateDeviceSummary();
                case "#microsoft.graph.sharedInsight": return new SharedInsight();
                case "#microsoft.graph.signIn": return new SignIn();
                case "#microsoft.graph.singleValueLegacyExtendedProperty": return new SingleValueLegacyExtendedProperty();
                case "#microsoft.graph.softwareUpdateStatusSummary": return new SoftwareUpdateStatusSummary();
                case "#microsoft.graph.subjectRightsRequest": return new SubjectRightsRequest();
                case "#microsoft.graph.subscribedSku": return new SubscribedSku();
                case "#microsoft.graph.subscription": return new Subscription();
                case "#microsoft.graph.targetedManagedAppPolicyAssignment": return new TargetedManagedAppPolicyAssignment();
                case "#microsoft.graph.team": return new Team();
                case "#microsoft.graph.teamInfo": return new TeamInfo();
                case "#microsoft.graph.teamsApp": return new TeamsApp();
                case "#microsoft.graph.teamsAppDefinition": return new TeamsAppDefinition();
                case "#microsoft.graph.teamsAppInstallation": return new TeamsAppInstallation();
                case "#microsoft.graph.teamsAsyncOperation": return new TeamsAsyncOperation();
                case "#microsoft.graph.teamsTab": return new TeamsTab();
                case "#microsoft.graph.teamsTemplate": return new TeamsTemplate();
                case "#microsoft.graph.teamwork": return new Teamwork();
                case "#microsoft.graph.teamworkBot": return new TeamworkBot();
                case "#microsoft.graph.teamworkHostedContent": return new TeamworkHostedContent();
                case "#microsoft.graph.telecomExpenseManagementPartner": return new TelecomExpenseManagementPartner();
                case "#microsoft.graph.termsAndConditions": return new TermsAndConditions();
                case "#microsoft.graph.termsAndConditionsAcceptanceStatus": return new TermsAndConditionsAcceptanceStatus();
                case "#microsoft.graph.termsAndConditionsAssignment": return new TermsAndConditionsAssignment();
                case "#microsoft.graph.termsOfUseContainer": return new TermsOfUseContainer();
                case "#microsoft.graph.termStore.group": return new Group();
                case "#microsoft.graph.termStore.relation": return new Relation();
                case "#microsoft.graph.termStore.set": return new Set();
                case "#microsoft.graph.termStore.store": return new Store();
                case "#microsoft.graph.termStore.term": return new Term();
                case "#microsoft.graph.threatAssessmentRequest": return new ThreatAssessmentRequest();
                case "#microsoft.graph.threatAssessmentResult": return new ThreatAssessmentResult();
                case "#microsoft.graph.thumbnailSet": return new ThumbnailSet();
                case "#microsoft.graph.todo": return new Todo();
                case "#microsoft.graph.todoTask": return new TodoTask();
                case "#microsoft.graph.todoTaskList": return new TodoTaskList();
                case "#microsoft.graph.trending": return new Trending();
                case "#microsoft.graph.unifiedRoleAssignment": return new UnifiedRoleAssignment();
                case "#microsoft.graph.unifiedRoleDefinition": return new UnifiedRoleDefinition();
                case "#microsoft.graph.unifiedRoleManagementPolicy": return new UnifiedRoleManagementPolicy();
                case "#microsoft.graph.unifiedRoleManagementPolicyAssignment": return new UnifiedRoleManagementPolicyAssignment();
                case "#microsoft.graph.unifiedRoleManagementPolicyRule": return new UnifiedRoleManagementPolicyRule();
                case "#microsoft.graph.unifiedRoleScheduleBase": return new UnifiedRoleScheduleBase();
                case "#microsoft.graph.unifiedRoleScheduleInstanceBase": return new UnifiedRoleScheduleInstanceBase();
                case "#microsoft.graph.usedInsight": return new UsedInsight();
                case "#microsoft.graph.userActivity": return new UserActivity();
                case "#microsoft.graph.userFlowLanguageConfiguration": return new UserFlowLanguageConfiguration();
                case "#microsoft.graph.userFlowLanguagePage": return new UserFlowLanguagePage();
                case "#microsoft.graph.userInstallStateSummary": return new UserInstallStateSummary();
                case "#microsoft.graph.userSettings": return new UserSettings();
                case "#microsoft.graph.userTeamwork": return new UserTeamwork();
                case "#microsoft.graph.vppToken": return new VppToken();
                case "#microsoft.graph.windowsAutopilotDeviceIdentity": return new WindowsAutopilotDeviceIdentity();
                case "#microsoft.graph.windowsInformationProtectionAppLearningSummary": return new WindowsInformationProtectionAppLearningSummary();
                case "#microsoft.graph.windowsInformationProtectionAppLockerFile": return new WindowsInformationProtectionAppLockerFile();
                case "#microsoft.graph.windowsInformationProtectionNetworkLearningSummary": return new WindowsInformationProtectionNetworkLearningSummary();
                case "#microsoft.graph.workbook": return new Workbook();
                case "#microsoft.graph.workbookApplication": return new WorkbookApplication();
                case "#microsoft.graph.workbookChart": return new WorkbookChart();
                case "#microsoft.graph.workbookChartAreaFormat": return new WorkbookChartAreaFormat();
                case "#microsoft.graph.workbookChartAxes": return new WorkbookChartAxes();
                case "#microsoft.graph.workbookChartAxis": return new WorkbookChartAxis();
                case "#microsoft.graph.workbookChartAxisFormat": return new WorkbookChartAxisFormat();
                case "#microsoft.graph.workbookChartAxisTitle": return new WorkbookChartAxisTitle();
                case "#microsoft.graph.workbookChartAxisTitleFormat": return new WorkbookChartAxisTitleFormat();
                case "#microsoft.graph.workbookChartDataLabelFormat": return new WorkbookChartDataLabelFormat();
                case "#microsoft.graph.workbookChartDataLabels": return new WorkbookChartDataLabels();
                case "#microsoft.graph.workbookChartFill": return new WorkbookChartFill();
                case "#microsoft.graph.workbookChartFont": return new WorkbookChartFont();
                case "#microsoft.graph.workbookChartGridlines": return new WorkbookChartGridlines();
                case "#microsoft.graph.workbookChartGridlinesFormat": return new WorkbookChartGridlinesFormat();
                case "#microsoft.graph.workbookChartLegend": return new WorkbookChartLegend();
                case "#microsoft.graph.workbookChartLegendFormat": return new WorkbookChartLegendFormat();
                case "#microsoft.graph.workbookChartLineFormat": return new WorkbookChartLineFormat();
                case "#microsoft.graph.workbookChartPoint": return new WorkbookChartPoint();
                case "#microsoft.graph.workbookChartPointFormat": return new WorkbookChartPointFormat();
                case "#microsoft.graph.workbookChartSeries": return new WorkbookChartSeries();
                case "#microsoft.graph.workbookChartSeriesFormat": return new WorkbookChartSeriesFormat();
                case "#microsoft.graph.workbookChartTitle": return new WorkbookChartTitle();
                case "#microsoft.graph.workbookChartTitleFormat": return new WorkbookChartTitleFormat();
                case "#microsoft.graph.workbookComment": return new WorkbookComment();
                case "#microsoft.graph.workbookCommentReply": return new WorkbookCommentReply();
                case "#microsoft.graph.workbookFilter": return new WorkbookFilter();
                case "#microsoft.graph.workbookFormatProtection": return new WorkbookFormatProtection();
                case "#microsoft.graph.workbookFunctionResult": return new WorkbookFunctionResult();
                case "#microsoft.graph.workbookFunctions": return new WorkbookFunctions();
                case "#microsoft.graph.workbookNamedItem": return new WorkbookNamedItem();
                case "#microsoft.graph.workbookOperation": return new WorkbookOperation();
                case "#microsoft.graph.workbookPivotTable": return new WorkbookPivotTable();
                case "#microsoft.graph.workbookRange": return new WorkbookRange();
                case "#microsoft.graph.workbookRangeBorder": return new WorkbookRangeBorder();
                case "#microsoft.graph.workbookRangeFill": return new WorkbookRangeFill();
                case "#microsoft.graph.workbookRangeFont": return new WorkbookRangeFont();
                case "#microsoft.graph.workbookRangeFormat": return new WorkbookRangeFormat();
                case "#microsoft.graph.workbookRangeSort": return new WorkbookRangeSort();
                case "#microsoft.graph.workbookRangeView": return new WorkbookRangeView();
                case "#microsoft.graph.workbookTable": return new WorkbookTable();
                case "#microsoft.graph.workbookTableColumn": return new WorkbookTableColumn();
                case "#microsoft.graph.workbookTableRow": return new WorkbookTableRow();
                case "#microsoft.graph.workbookTableSort": return new WorkbookTableSort();
                case "#microsoft.graph.workbookWorksheet": return new WorkbookWorksheet();
                case "#microsoft.graph.workbookWorksheetProtection": return new WorkbookWorksheetProtection();
            }
        }
        return new Entity();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Entity currentObject = this;
        return new HashMap<>(2) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
