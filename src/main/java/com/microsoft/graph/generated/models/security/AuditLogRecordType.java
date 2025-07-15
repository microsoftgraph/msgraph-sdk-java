package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuditLogRecordType implements ValuedEnum {
    ExchangeAdmin("ExchangeAdmin"),
    ExchangeItem("ExchangeItem"),
    ExchangeItemGroup("ExchangeItemGroup"),
    SharePoint("SharePoint"),
    SyntheticProbe("SyntheticProbe"),
    SharePointFileOperation("SharePointFileOperation"),
    OneDrive("OneDrive"),
    AzureActiveDirectory("AzureActiveDirectory"),
    AzureActiveDirectoryAccountLogon("AzureActiveDirectoryAccountLogon"),
    DataCenterSecurityCmdlet("DataCenterSecurityCmdlet"),
    ComplianceDLPSharePoint("ComplianceDLPSharePoint"),
    Sway("Sway"),
    ComplianceDLPExchange("ComplianceDLPExchange"),
    SharePointSharingOperation("SharePointSharingOperation"),
    AzureActiveDirectoryStsLogon("AzureActiveDirectoryStsLogon"),
    SkypeForBusinessPSTNUsage("SkypeForBusinessPSTNUsage"),
    SkypeForBusinessUsersBlocked("SkypeForBusinessUsersBlocked"),
    SecurityComplianceCenterEOPCmdlet("SecurityComplianceCenterEOPCmdlet"),
    ExchangeAggregatedOperation("ExchangeAggregatedOperation"),
    PowerBIAudit("PowerBIAudit"),
    CRM("CRM"),
    Yammer("Yammer"),
    SkypeForBusinessCmdlets("SkypeForBusinessCmdlets"),
    Discovery("Discovery"),
    MicrosoftTeams("MicrosoftTeams"),
    ThreatIntelligence("ThreatIntelligence"),
    MailSubmission("MailSubmission"),
    MicrosoftFlow("MicrosoftFlow"),
    AeD("AeD"),
    MicrosoftStream("MicrosoftStream"),
    ComplianceDLPSharePointClassification("ComplianceDLPSharePointClassification"),
    ThreatFinder("ThreatFinder"),
    Project("Project"),
    SharePointListOperation("SharePointListOperation"),
    SharePointCommentOperation("SharePointCommentOperation"),
    DataGovernance("DataGovernance"),
    Kaizala("Kaizala"),
    SecurityComplianceAlerts("SecurityComplianceAlerts"),
    ThreatIntelligenceUrl("ThreatIntelligenceUrl"),
    SecurityComplianceInsights("SecurityComplianceInsights"),
    MIPLabel("MIPLabel"),
    WorkplaceAnalytics("WorkplaceAnalytics"),
    PowerAppsApp("PowerAppsApp"),
    PowerAppsPlan("PowerAppsPlan"),
    ThreatIntelligenceAtpContent("ThreatIntelligenceAtpContent"),
    LabelContentExplorer("LabelContentExplorer"),
    TeamsHealthcare("TeamsHealthcare"),
    ExchangeItemAggregated("ExchangeItemAggregated"),
    HygieneEvent("HygieneEvent"),
    DataInsightsRestApiAudit("DataInsightsRestApiAudit"),
    InformationBarrierPolicyApplication("InformationBarrierPolicyApplication"),
    SharePointListItemOperation("SharePointListItemOperation"),
    SharePointContentTypeOperation("SharePointContentTypeOperation"),
    SharePointFieldOperation("SharePointFieldOperation"),
    MicrosoftTeamsAdmin("MicrosoftTeamsAdmin"),
    HRSignal("HRSignal"),
    MicrosoftTeamsDevice("MicrosoftTeamsDevice"),
    MicrosoftTeamsAnalytics("MicrosoftTeamsAnalytics"),
    InformationWorkerProtection("InformationWorkerProtection"),
    Campaign("Campaign"),
    DLPEndpoint("DLPEndpoint"),
    AirInvestigation("AirInvestigation"),
    Quarantine("Quarantine"),
    MicrosoftForms("MicrosoftForms"),
    ApplicationAudit("ApplicationAudit"),
    ComplianceSupervisionExchange("ComplianceSupervisionExchange"),
    CustomerKeyServiceEncryption("CustomerKeyServiceEncryption"),
    OfficeNative("OfficeNative"),
    MipAutoLabelSharePointItem("MipAutoLabelSharePointItem"),
    MipAutoLabelSharePointPolicyLocation("MipAutoLabelSharePointPolicyLocation"),
    MicrosoftTeamsShifts("MicrosoftTeamsShifts"),
    SecureScore("SecureScore"),
    MipAutoLabelExchangeItem("MipAutoLabelExchangeItem"),
    CortanaBriefing("CortanaBriefing"),
    Search("Search"),
    WDATPAlerts("WDATPAlerts"),
    PowerPlatformAdminDlp("PowerPlatformAdminDlp"),
    PowerPlatformAdminEnvironment("PowerPlatformAdminEnvironment"),
    MDATPAudit("MDATPAudit"),
    SensitivityLabelPolicyMatch("SensitivityLabelPolicyMatch"),
    SensitivityLabelAction("SensitivityLabelAction"),
    SensitivityLabeledFileAction("SensitivityLabeledFileAction"),
    AttackSim("AttackSim"),
    AirManualInvestigation("AirManualInvestigation"),
    SecurityComplianceRBAC("SecurityComplianceRBAC"),
    UserTraining("UserTraining"),
    AirAdminActionInvestigation("AirAdminActionInvestigation"),
    MSTIC("MSTIC"),
    PhysicalBadgingSignal("PhysicalBadgingSignal"),
    TeamsEasyApprovals("TeamsEasyApprovals"),
    AipDiscover("AipDiscover"),
    AipSensitivityLabelAction("AipSensitivityLabelAction"),
    AipProtectionAction("AipProtectionAction"),
    AipFileDeleted("AipFileDeleted"),
    AipHeartBeat("AipHeartBeat"),
    MCASAlerts("MCASAlerts"),
    OnPremisesFileShareScannerDlp("OnPremisesFileShareScannerDlp"),
    OnPremisesSharePointScannerDlp("OnPremisesSharePointScannerDlp"),
    ExchangeSearch("ExchangeSearch"),
    SharePointSearch("SharePointSearch"),
    PrivacyDataMinimization("PrivacyDataMinimization"),
    LabelAnalyticsAggregate("LabelAnalyticsAggregate"),
    MyAnalyticsSettings("MyAnalyticsSettings"),
    SecurityComplianceUserChange("SecurityComplianceUserChange"),
    ComplianceDLPExchangeClassification("ComplianceDLPExchangeClassification"),
    ComplianceDLPEndpoint("ComplianceDLPEndpoint"),
    MipExactDataMatch("MipExactDataMatch"),
    MSDEResponseActions("MSDEResponseActions"),
    MSDEGeneralSettings("MSDEGeneralSettings"),
    MSDEIndicatorsSettings("MSDEIndicatorsSettings"),
    MS365DCustomDetection("MS365DCustomDetection"),
    MSDERolesSettings("MSDERolesSettings"),
    MAPGAlerts("MAPGAlerts"),
    MAPGPolicy("MAPGPolicy"),
    MAPGRemediation("MAPGRemediation"),
    PrivacyRemediationAction("PrivacyRemediationAction"),
    PrivacyDigestEmail("PrivacyDigestEmail"),
    MipAutoLabelSimulationProgress("MipAutoLabelSimulationProgress"),
    MipAutoLabelSimulationCompletion("MipAutoLabelSimulationCompletion"),
    MipAutoLabelProgressFeedback("MipAutoLabelProgressFeedback"),
    DlpSensitiveInformationType("DlpSensitiveInformationType"),
    MipAutoLabelSimulationStatistics("MipAutoLabelSimulationStatistics"),
    LargeContentMetadata("LargeContentMetadata"),
    Microsoft365Group("Microsoft365Group"),
    CDPMlInferencingResult("CDPMlInferencingResult"),
    FilteringMailMetadata("FilteringMailMetadata"),
    CDPClassificationMailItem("CDPClassificationMailItem"),
    CDPClassificationDocument("CDPClassificationDocument"),
    OfficeScriptsRunAction("OfficeScriptsRunAction"),
    FilteringPostMailDeliveryAction("FilteringPostMailDeliveryAction"),
    CDPUnifiedFeedback("CDPUnifiedFeedback"),
    TenantAllowBlockList("TenantAllowBlockList"),
    ConsumptionResource("ConsumptionResource"),
    HealthcareSignal("HealthcareSignal"),
    DlpImportResult("DlpImportResult"),
    CDPCompliancePolicyExecution("CDPCompliancePolicyExecution"),
    MultiStageDisposition("MultiStageDisposition"),
    PrivacyDataMatch("PrivacyDataMatch"),
    FilteringDocMetadata("FilteringDocMetadata"),
    FilteringEmailFeatures("FilteringEmailFeatures"),
    PowerBIDlp("PowerBIDlp"),
    FilteringUrlInfo("FilteringUrlInfo"),
    FilteringAttachmentInfo("FilteringAttachmentInfo"),
    CoreReportingSettings("CoreReportingSettings"),
    ComplianceConnector("ComplianceConnector"),
    PowerPlatformLockboxResourceAccessRequest("PowerPlatformLockboxResourceAccessRequest"),
    PowerPlatformLockboxResourceCommand("PowerPlatformLockboxResourceCommand"),
    CDPPredictiveCodingLabel("CDPPredictiveCodingLabel"),
    CDPCompliancePolicyUserFeedback("CDPCompliancePolicyUserFeedback"),
    WebpageActivityEndpoint("WebpageActivityEndpoint"),
    OMEPortal("OMEPortal"),
    CMImprovementActionChange("CMImprovementActionChange"),
    FilteringUrlClick("FilteringUrlClick"),
    MipLabelAnalyticsAuditRecord("MipLabelAnalyticsAuditRecord"),
    FilteringEntityEvent("FilteringEntityEvent"),
    FilteringRuleHits("FilteringRuleHits"),
    FilteringMailSubmission("FilteringMailSubmission"),
    LabelExplorer("LabelExplorer"),
    MicrosoftManagedServicePlatform("MicrosoftManagedServicePlatform"),
    PowerPlatformServiceActivity("PowerPlatformServiceActivity"),
    ScorePlatformGenericAuditRecord("ScorePlatformGenericAuditRecord"),
    FilteringTimeTravelDocMetadata("FilteringTimeTravelDocMetadata"),
    Alert("Alert"),
    AlertStatus("AlertStatus"),
    AlertIncident("AlertIncident"),
    IncidentStatus("IncidentStatus"),
    Case("Case"),
    CaseInvestigation("CaseInvestigation"),
    RecordsManagement("RecordsManagement"),
    PrivacyRemediation("PrivacyRemediation"),
    DataShareOperation("DataShareOperation"),
    CdpDlpSensitive("CdpDlpSensitive"),
    EHRConnector("EHRConnector"),
    FilteringMailGradingResult("FilteringMailGradingResult"),
    PublicFolder("PublicFolder"),
    PrivacyTenantAuditHistoryRecord("PrivacyTenantAuditHistoryRecord"),
    AipScannerDiscoverEvent("AipScannerDiscoverEvent"),
    EduDataLakeDownloadOperation("EduDataLakeDownloadOperation"),
    M365ComplianceConnector("M365ComplianceConnector"),
    MicrosoftGraphDataConnectOperation("MicrosoftGraphDataConnectOperation"),
    MicrosoftPurview("MicrosoftPurview"),
    FilteringEmailContentFeatures("FilteringEmailContentFeatures"),
    PowerPagesSite("PowerPagesSite"),
    PowerAppsResource("PowerAppsResource"),
    PlannerPlan("PlannerPlan"),
    PlannerCopyPlan("PlannerCopyPlan"),
    PlannerTask("PlannerTask"),
    PlannerRoster("PlannerRoster"),
    PlannerPlanList("PlannerPlanList"),
    PlannerTaskList("PlannerTaskList"),
    PlannerTenantSettings("PlannerTenantSettings"),
    ProjectForTheWebProject("ProjectForTheWebProject"),
    ProjectForTheWebTask("ProjectForTheWebTask"),
    ProjectForTheWebRoadmap("ProjectForTheWebRoadmap"),
    ProjectForTheWebRoadmapItem("ProjectForTheWebRoadmapItem"),
    ProjectForTheWebProjectSettings("ProjectForTheWebProjectSettings"),
    ProjectForTheWebRoadmapSettings("ProjectForTheWebRoadmapSettings"),
    QuarantineMetadata("QuarantineMetadata"),
    MicrosoftTodoAudit("MicrosoftTodoAudit"),
    TimeTravelFilteringDocMetadata("TimeTravelFilteringDocMetadata"),
    TeamsQuarantineMetadata("TeamsQuarantineMetadata"),
    SharePointAppPermissionOperation("SharePointAppPermissionOperation"),
    MicrosoftTeamsSensitivityLabelAction("MicrosoftTeamsSensitivityLabelAction"),
    FilteringTeamsMetadata("FilteringTeamsMetadata"),
    FilteringTeamsUrlInfo("FilteringTeamsUrlInfo"),
    FilteringTeamsPostDeliveryAction("FilteringTeamsPostDeliveryAction"),
    MDCAssessments("MDCAssessments"),
    MDCRegulatoryComplianceStandards("MDCRegulatoryComplianceStandards"),
    MDCRegulatoryComplianceControls("MDCRegulatoryComplianceControls"),
    MDCRegulatoryComplianceAssessments("MDCRegulatoryComplianceAssessments"),
    MDCSecurityConnectors("MDCSecurityConnectors"),
    MDADataSecuritySignal("MDADataSecuritySignal"),
    VivaGoals("VivaGoals"),
    FilteringRuntimeInfo("FilteringRuntimeInfo"),
    AttackSimAdmin("AttackSimAdmin"),
    MicrosoftGraphDataConnectConsent("MicrosoftGraphDataConnectConsent"),
    FilteringAtpDetonationInfo("FilteringAtpDetonationInfo"),
    PrivacyPortal("PrivacyPortal"),
    ManagedTenants("ManagedTenants"),
    UnifiedSimulationMatchedItem("UnifiedSimulationMatchedItem"),
    UnifiedSimulationSummary("UnifiedSimulationSummary"),
    UpdateQuarantineMetadata("UpdateQuarantineMetadata"),
    MS365DSuppressionRule("MS365DSuppressionRule"),
    PurviewDataMapOperation("PurviewDataMapOperation"),
    FilteringUrlPostClickAction("FilteringUrlPostClickAction"),
    IrmUserDefinedDetectionSignal("IrmUserDefinedDetectionSignal"),
    TeamsUpdates("TeamsUpdates"),
    PlannerRosterSensitivityLabel("PlannerRosterSensitivityLabel"),
    MS365DIncident("MS365DIncident"),
    FilteringDelistingMetadata("FilteringDelistingMetadata"),
    ComplianceDLPSharePointClassificationExtended("ComplianceDLPSharePointClassificationExtended"),
    MicrosoftDefenderForIdentityAudit("MicrosoftDefenderForIdentityAudit"),
    SupervisoryReviewDayXInsight("SupervisoryReviewDayXInsight"),
    DefenderExpertsforXDRAdmin("DefenderExpertsforXDRAdmin"),
    CDPEdgeBlockedMessage("CDPEdgeBlockedMessage"),
    HostedRpa("HostedRpa"),
    CdpContentExplorerAggregateRecord("CdpContentExplorerAggregateRecord"),
    CDPHygieneAttachmentInfo("CDPHygieneAttachmentInfo"),
    CDPHygieneSummary("CDPHygieneSummary"),
    CDPPostMailDeliveryAction("CDPPostMailDeliveryAction"),
    CDPEmailFeatures("CDPEmailFeatures"),
    CDPHygieneUrlInfo("CDPHygieneUrlInfo"),
    CDPUrlClick("CDPUrlClick"),
    CDPPackageManagerHygieneEvent("CDPPackageManagerHygieneEvent"),
    FilteringDocScan("FilteringDocScan"),
    TimeTravelFilteringDocScan("TimeTravelFilteringDocScan"),
    MAPGOnboard("MAPGOnboard"),
    VfamCreatePolicy("VfamCreatePolicy"),
    VfamUpdatePolicy("VfamUpdatePolicy"),
    VfamDeletePolicy("VfamDeletePolicy"),
    M365DAAD("M365DAAD"),
    CdpColdCrawlStatus("CdpColdCrawlStatus"),
    PowerPlatformAdministratorActivity("PowerPlatformAdministratorActivity"),
    Windows365CustomerLockbox("Windows365CustomerLockbox"),
    CdpResourceScopeChangeEvent("CdpResourceScopeChangeEvent"),
    ComplianceCCExchangeExecutionResult("ComplianceCCExchangeExecutionResult"),
    CdpOcrCostEstimatorRecord("CdpOcrCostEstimatorRecord"),
    CopilotInteraction("CopilotInteraction"),
    CdpOcrBillingRecord("CdpOcrBillingRecord"),
    ComplianceDLPApplications("ComplianceDLPApplications"),
    UAMOperation("UAMOperation"),
    VivaLearning("VivaLearning"),
    VivaLearningAdmin("VivaLearningAdmin"),
    PurviewPolicyOperation("PurviewPolicyOperation"),
    PurviewMetadataPolicyOperation("PurviewMetadataPolicyOperation"),
    PeopleAdminSettings("PeopleAdminSettings"),
    CdpComplianceDLPExchangeClassification("CdpComplianceDLPExchangeClassification"),
    CdpComplianceDLPSharePointClassification("CdpComplianceDLPSharePointClassification"),
    FilteringBulkSenderInsightData("FilteringBulkSenderInsightData"),
    FilteringBulkThresholdInsightData("FilteringBulkThresholdInsightData"),
    PrivacyOpenAccess("PrivacyOpenAccess"),
    OWAAuth("OWAAuth"),
    ComplianceDLPApplicationsClassification("ComplianceDLPApplicationsClassification"),
    SharePointESignature("SharePointESignature"),
    Dynamics365BusinessCentral("Dynamics365BusinessCentral"),
    MeshWorlds("MeshWorlds"),
    VivaPulseResponse("VivaPulseResponse"),
    VivaPulseOrganizer("VivaPulseOrganizer"),
    VivaPulseAdmin("VivaPulseAdmin"),
    VivaPulseReport("VivaPulseReport"),
    AIAppInteraction("AIAppInteraction"),
    ComplianceDLMExchange("ComplianceDLMExchange"),
    ComplianceDLMSharePoint("ComplianceDLMSharePoint"),
    ProjectForTheWebAssignedToMeSettings("ProjectForTheWebAssignedToMeSettings"),
    CPSOperation("CPSOperation"),
    ComplianceDLPExchangeDiscovery("ComplianceDLPExchangeDiscovery"),
    PurviewMCRecommendation("PurviewMCRecommendation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuditLogRecordType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuditLogRecordType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ExchangeAdmin": return ExchangeAdmin;
            case "ExchangeItem": return ExchangeItem;
            case "ExchangeItemGroup": return ExchangeItemGroup;
            case "SharePoint": return SharePoint;
            case "SyntheticProbe": return SyntheticProbe;
            case "SharePointFileOperation": return SharePointFileOperation;
            case "OneDrive": return OneDrive;
            case "AzureActiveDirectory": return AzureActiveDirectory;
            case "AzureActiveDirectoryAccountLogon": return AzureActiveDirectoryAccountLogon;
            case "DataCenterSecurityCmdlet": return DataCenterSecurityCmdlet;
            case "ComplianceDLPSharePoint": return ComplianceDLPSharePoint;
            case "Sway": return Sway;
            case "ComplianceDLPExchange": return ComplianceDLPExchange;
            case "SharePointSharingOperation": return SharePointSharingOperation;
            case "AzureActiveDirectoryStsLogon": return AzureActiveDirectoryStsLogon;
            case "SkypeForBusinessPSTNUsage": return SkypeForBusinessPSTNUsage;
            case "SkypeForBusinessUsersBlocked": return SkypeForBusinessUsersBlocked;
            case "SecurityComplianceCenterEOPCmdlet": return SecurityComplianceCenterEOPCmdlet;
            case "ExchangeAggregatedOperation": return ExchangeAggregatedOperation;
            case "PowerBIAudit": return PowerBIAudit;
            case "CRM": return CRM;
            case "Yammer": return Yammer;
            case "SkypeForBusinessCmdlets": return SkypeForBusinessCmdlets;
            case "Discovery": return Discovery;
            case "MicrosoftTeams": return MicrosoftTeams;
            case "ThreatIntelligence": return ThreatIntelligence;
            case "MailSubmission": return MailSubmission;
            case "MicrosoftFlow": return MicrosoftFlow;
            case "AeD": return AeD;
            case "MicrosoftStream": return MicrosoftStream;
            case "ComplianceDLPSharePointClassification": return ComplianceDLPSharePointClassification;
            case "ThreatFinder": return ThreatFinder;
            case "Project": return Project;
            case "SharePointListOperation": return SharePointListOperation;
            case "SharePointCommentOperation": return SharePointCommentOperation;
            case "DataGovernance": return DataGovernance;
            case "Kaizala": return Kaizala;
            case "SecurityComplianceAlerts": return SecurityComplianceAlerts;
            case "ThreatIntelligenceUrl": return ThreatIntelligenceUrl;
            case "SecurityComplianceInsights": return SecurityComplianceInsights;
            case "MIPLabel": return MIPLabel;
            case "WorkplaceAnalytics": return WorkplaceAnalytics;
            case "PowerAppsApp": return PowerAppsApp;
            case "PowerAppsPlan": return PowerAppsPlan;
            case "ThreatIntelligenceAtpContent": return ThreatIntelligenceAtpContent;
            case "LabelContentExplorer": return LabelContentExplorer;
            case "TeamsHealthcare": return TeamsHealthcare;
            case "ExchangeItemAggregated": return ExchangeItemAggregated;
            case "HygieneEvent": return HygieneEvent;
            case "DataInsightsRestApiAudit": return DataInsightsRestApiAudit;
            case "InformationBarrierPolicyApplication": return InformationBarrierPolicyApplication;
            case "SharePointListItemOperation": return SharePointListItemOperation;
            case "SharePointContentTypeOperation": return SharePointContentTypeOperation;
            case "SharePointFieldOperation": return SharePointFieldOperation;
            case "MicrosoftTeamsAdmin": return MicrosoftTeamsAdmin;
            case "HRSignal": return HRSignal;
            case "MicrosoftTeamsDevice": return MicrosoftTeamsDevice;
            case "MicrosoftTeamsAnalytics": return MicrosoftTeamsAnalytics;
            case "InformationWorkerProtection": return InformationWorkerProtection;
            case "Campaign": return Campaign;
            case "DLPEndpoint": return DLPEndpoint;
            case "AirInvestigation": return AirInvestigation;
            case "Quarantine": return Quarantine;
            case "MicrosoftForms": return MicrosoftForms;
            case "ApplicationAudit": return ApplicationAudit;
            case "ComplianceSupervisionExchange": return ComplianceSupervisionExchange;
            case "CustomerKeyServiceEncryption": return CustomerKeyServiceEncryption;
            case "OfficeNative": return OfficeNative;
            case "MipAutoLabelSharePointItem": return MipAutoLabelSharePointItem;
            case "MipAutoLabelSharePointPolicyLocation": return MipAutoLabelSharePointPolicyLocation;
            case "MicrosoftTeamsShifts": return MicrosoftTeamsShifts;
            case "SecureScore": return SecureScore;
            case "MipAutoLabelExchangeItem": return MipAutoLabelExchangeItem;
            case "CortanaBriefing": return CortanaBriefing;
            case "Search": return Search;
            case "WDATPAlerts": return WDATPAlerts;
            case "PowerPlatformAdminDlp": return PowerPlatformAdminDlp;
            case "PowerPlatformAdminEnvironment": return PowerPlatformAdminEnvironment;
            case "MDATPAudit": return MDATPAudit;
            case "SensitivityLabelPolicyMatch": return SensitivityLabelPolicyMatch;
            case "SensitivityLabelAction": return SensitivityLabelAction;
            case "SensitivityLabeledFileAction": return SensitivityLabeledFileAction;
            case "AttackSim": return AttackSim;
            case "AirManualInvestigation": return AirManualInvestigation;
            case "SecurityComplianceRBAC": return SecurityComplianceRBAC;
            case "UserTraining": return UserTraining;
            case "AirAdminActionInvestigation": return AirAdminActionInvestigation;
            case "MSTIC": return MSTIC;
            case "PhysicalBadgingSignal": return PhysicalBadgingSignal;
            case "TeamsEasyApprovals": return TeamsEasyApprovals;
            case "AipDiscover": return AipDiscover;
            case "AipSensitivityLabelAction": return AipSensitivityLabelAction;
            case "AipProtectionAction": return AipProtectionAction;
            case "AipFileDeleted": return AipFileDeleted;
            case "AipHeartBeat": return AipHeartBeat;
            case "MCASAlerts": return MCASAlerts;
            case "OnPremisesFileShareScannerDlp": return OnPremisesFileShareScannerDlp;
            case "OnPremisesSharePointScannerDlp": return OnPremisesSharePointScannerDlp;
            case "ExchangeSearch": return ExchangeSearch;
            case "SharePointSearch": return SharePointSearch;
            case "PrivacyDataMinimization": return PrivacyDataMinimization;
            case "LabelAnalyticsAggregate": return LabelAnalyticsAggregate;
            case "MyAnalyticsSettings": return MyAnalyticsSettings;
            case "SecurityComplianceUserChange": return SecurityComplianceUserChange;
            case "ComplianceDLPExchangeClassification": return ComplianceDLPExchangeClassification;
            case "ComplianceDLPEndpoint": return ComplianceDLPEndpoint;
            case "MipExactDataMatch": return MipExactDataMatch;
            case "MSDEResponseActions": return MSDEResponseActions;
            case "MSDEGeneralSettings": return MSDEGeneralSettings;
            case "MSDEIndicatorsSettings": return MSDEIndicatorsSettings;
            case "MS365DCustomDetection": return MS365DCustomDetection;
            case "MSDERolesSettings": return MSDERolesSettings;
            case "MAPGAlerts": return MAPGAlerts;
            case "MAPGPolicy": return MAPGPolicy;
            case "MAPGRemediation": return MAPGRemediation;
            case "PrivacyRemediationAction": return PrivacyRemediationAction;
            case "PrivacyDigestEmail": return PrivacyDigestEmail;
            case "MipAutoLabelSimulationProgress": return MipAutoLabelSimulationProgress;
            case "MipAutoLabelSimulationCompletion": return MipAutoLabelSimulationCompletion;
            case "MipAutoLabelProgressFeedback": return MipAutoLabelProgressFeedback;
            case "DlpSensitiveInformationType": return DlpSensitiveInformationType;
            case "MipAutoLabelSimulationStatistics": return MipAutoLabelSimulationStatistics;
            case "LargeContentMetadata": return LargeContentMetadata;
            case "Microsoft365Group": return Microsoft365Group;
            case "CDPMlInferencingResult": return CDPMlInferencingResult;
            case "FilteringMailMetadata": return FilteringMailMetadata;
            case "CDPClassificationMailItem": return CDPClassificationMailItem;
            case "CDPClassificationDocument": return CDPClassificationDocument;
            case "OfficeScriptsRunAction": return OfficeScriptsRunAction;
            case "FilteringPostMailDeliveryAction": return FilteringPostMailDeliveryAction;
            case "CDPUnifiedFeedback": return CDPUnifiedFeedback;
            case "TenantAllowBlockList": return TenantAllowBlockList;
            case "ConsumptionResource": return ConsumptionResource;
            case "HealthcareSignal": return HealthcareSignal;
            case "DlpImportResult": return DlpImportResult;
            case "CDPCompliancePolicyExecution": return CDPCompliancePolicyExecution;
            case "MultiStageDisposition": return MultiStageDisposition;
            case "PrivacyDataMatch": return PrivacyDataMatch;
            case "FilteringDocMetadata": return FilteringDocMetadata;
            case "FilteringEmailFeatures": return FilteringEmailFeatures;
            case "PowerBIDlp": return PowerBIDlp;
            case "FilteringUrlInfo": return FilteringUrlInfo;
            case "FilteringAttachmentInfo": return FilteringAttachmentInfo;
            case "CoreReportingSettings": return CoreReportingSettings;
            case "ComplianceConnector": return ComplianceConnector;
            case "PowerPlatformLockboxResourceAccessRequest": return PowerPlatformLockboxResourceAccessRequest;
            case "PowerPlatformLockboxResourceCommand": return PowerPlatformLockboxResourceCommand;
            case "CDPPredictiveCodingLabel": return CDPPredictiveCodingLabel;
            case "CDPCompliancePolicyUserFeedback": return CDPCompliancePolicyUserFeedback;
            case "WebpageActivityEndpoint": return WebpageActivityEndpoint;
            case "OMEPortal": return OMEPortal;
            case "CMImprovementActionChange": return CMImprovementActionChange;
            case "FilteringUrlClick": return FilteringUrlClick;
            case "MipLabelAnalyticsAuditRecord": return MipLabelAnalyticsAuditRecord;
            case "FilteringEntityEvent": return FilteringEntityEvent;
            case "FilteringRuleHits": return FilteringRuleHits;
            case "FilteringMailSubmission": return FilteringMailSubmission;
            case "LabelExplorer": return LabelExplorer;
            case "MicrosoftManagedServicePlatform": return MicrosoftManagedServicePlatform;
            case "PowerPlatformServiceActivity": return PowerPlatformServiceActivity;
            case "ScorePlatformGenericAuditRecord": return ScorePlatformGenericAuditRecord;
            case "FilteringTimeTravelDocMetadata": return FilteringTimeTravelDocMetadata;
            case "Alert": return Alert;
            case "AlertStatus": return AlertStatus;
            case "AlertIncident": return AlertIncident;
            case "IncidentStatus": return IncidentStatus;
            case "Case": return Case;
            case "CaseInvestigation": return CaseInvestigation;
            case "RecordsManagement": return RecordsManagement;
            case "PrivacyRemediation": return PrivacyRemediation;
            case "DataShareOperation": return DataShareOperation;
            case "CdpDlpSensitive": return CdpDlpSensitive;
            case "EHRConnector": return EHRConnector;
            case "FilteringMailGradingResult": return FilteringMailGradingResult;
            case "PublicFolder": return PublicFolder;
            case "PrivacyTenantAuditHistoryRecord": return PrivacyTenantAuditHistoryRecord;
            case "AipScannerDiscoverEvent": return AipScannerDiscoverEvent;
            case "EduDataLakeDownloadOperation": return EduDataLakeDownloadOperation;
            case "M365ComplianceConnector": return M365ComplianceConnector;
            case "MicrosoftGraphDataConnectOperation": return MicrosoftGraphDataConnectOperation;
            case "MicrosoftPurview": return MicrosoftPurview;
            case "FilteringEmailContentFeatures": return FilteringEmailContentFeatures;
            case "PowerPagesSite": return PowerPagesSite;
            case "PowerAppsResource": return PowerAppsResource;
            case "PlannerPlan": return PlannerPlan;
            case "PlannerCopyPlan": return PlannerCopyPlan;
            case "PlannerTask": return PlannerTask;
            case "PlannerRoster": return PlannerRoster;
            case "PlannerPlanList": return PlannerPlanList;
            case "PlannerTaskList": return PlannerTaskList;
            case "PlannerTenantSettings": return PlannerTenantSettings;
            case "ProjectForTheWebProject": return ProjectForTheWebProject;
            case "ProjectForTheWebTask": return ProjectForTheWebTask;
            case "ProjectForTheWebRoadmap": return ProjectForTheWebRoadmap;
            case "ProjectForTheWebRoadmapItem": return ProjectForTheWebRoadmapItem;
            case "ProjectForTheWebProjectSettings": return ProjectForTheWebProjectSettings;
            case "ProjectForTheWebRoadmapSettings": return ProjectForTheWebRoadmapSettings;
            case "QuarantineMetadata": return QuarantineMetadata;
            case "MicrosoftTodoAudit": return MicrosoftTodoAudit;
            case "TimeTravelFilteringDocMetadata": return TimeTravelFilteringDocMetadata;
            case "TeamsQuarantineMetadata": return TeamsQuarantineMetadata;
            case "SharePointAppPermissionOperation": return SharePointAppPermissionOperation;
            case "MicrosoftTeamsSensitivityLabelAction": return MicrosoftTeamsSensitivityLabelAction;
            case "FilteringTeamsMetadata": return FilteringTeamsMetadata;
            case "FilteringTeamsUrlInfo": return FilteringTeamsUrlInfo;
            case "FilteringTeamsPostDeliveryAction": return FilteringTeamsPostDeliveryAction;
            case "MDCAssessments": return MDCAssessments;
            case "MDCRegulatoryComplianceStandards": return MDCRegulatoryComplianceStandards;
            case "MDCRegulatoryComplianceControls": return MDCRegulatoryComplianceControls;
            case "MDCRegulatoryComplianceAssessments": return MDCRegulatoryComplianceAssessments;
            case "MDCSecurityConnectors": return MDCSecurityConnectors;
            case "MDADataSecuritySignal": return MDADataSecuritySignal;
            case "VivaGoals": return VivaGoals;
            case "FilteringRuntimeInfo": return FilteringRuntimeInfo;
            case "AttackSimAdmin": return AttackSimAdmin;
            case "MicrosoftGraphDataConnectConsent": return MicrosoftGraphDataConnectConsent;
            case "FilteringAtpDetonationInfo": return FilteringAtpDetonationInfo;
            case "PrivacyPortal": return PrivacyPortal;
            case "ManagedTenants": return ManagedTenants;
            case "UnifiedSimulationMatchedItem": return UnifiedSimulationMatchedItem;
            case "UnifiedSimulationSummary": return UnifiedSimulationSummary;
            case "UpdateQuarantineMetadata": return UpdateQuarantineMetadata;
            case "MS365DSuppressionRule": return MS365DSuppressionRule;
            case "PurviewDataMapOperation": return PurviewDataMapOperation;
            case "FilteringUrlPostClickAction": return FilteringUrlPostClickAction;
            case "IrmUserDefinedDetectionSignal": return IrmUserDefinedDetectionSignal;
            case "TeamsUpdates": return TeamsUpdates;
            case "PlannerRosterSensitivityLabel": return PlannerRosterSensitivityLabel;
            case "MS365DIncident": return MS365DIncident;
            case "FilteringDelistingMetadata": return FilteringDelistingMetadata;
            case "ComplianceDLPSharePointClassificationExtended": return ComplianceDLPSharePointClassificationExtended;
            case "MicrosoftDefenderForIdentityAudit": return MicrosoftDefenderForIdentityAudit;
            case "SupervisoryReviewDayXInsight": return SupervisoryReviewDayXInsight;
            case "DefenderExpertsforXDRAdmin": return DefenderExpertsforXDRAdmin;
            case "CDPEdgeBlockedMessage": return CDPEdgeBlockedMessage;
            case "HostedRpa": return HostedRpa;
            case "CdpContentExplorerAggregateRecord": return CdpContentExplorerAggregateRecord;
            case "CDPHygieneAttachmentInfo": return CDPHygieneAttachmentInfo;
            case "CDPHygieneSummary": return CDPHygieneSummary;
            case "CDPPostMailDeliveryAction": return CDPPostMailDeliveryAction;
            case "CDPEmailFeatures": return CDPEmailFeatures;
            case "CDPHygieneUrlInfo": return CDPHygieneUrlInfo;
            case "CDPUrlClick": return CDPUrlClick;
            case "CDPPackageManagerHygieneEvent": return CDPPackageManagerHygieneEvent;
            case "FilteringDocScan": return FilteringDocScan;
            case "TimeTravelFilteringDocScan": return TimeTravelFilteringDocScan;
            case "MAPGOnboard": return MAPGOnboard;
            case "VfamCreatePolicy": return VfamCreatePolicy;
            case "VfamUpdatePolicy": return VfamUpdatePolicy;
            case "VfamDeletePolicy": return VfamDeletePolicy;
            case "M365DAAD": return M365DAAD;
            case "CdpColdCrawlStatus": return CdpColdCrawlStatus;
            case "PowerPlatformAdministratorActivity": return PowerPlatformAdministratorActivity;
            case "Windows365CustomerLockbox": return Windows365CustomerLockbox;
            case "CdpResourceScopeChangeEvent": return CdpResourceScopeChangeEvent;
            case "ComplianceCCExchangeExecutionResult": return ComplianceCCExchangeExecutionResult;
            case "CdpOcrCostEstimatorRecord": return CdpOcrCostEstimatorRecord;
            case "CopilotInteraction": return CopilotInteraction;
            case "CdpOcrBillingRecord": return CdpOcrBillingRecord;
            case "ComplianceDLPApplications": return ComplianceDLPApplications;
            case "UAMOperation": return UAMOperation;
            case "VivaLearning": return VivaLearning;
            case "VivaLearningAdmin": return VivaLearningAdmin;
            case "PurviewPolicyOperation": return PurviewPolicyOperation;
            case "PurviewMetadataPolicyOperation": return PurviewMetadataPolicyOperation;
            case "PeopleAdminSettings": return PeopleAdminSettings;
            case "CdpComplianceDLPExchangeClassification": return CdpComplianceDLPExchangeClassification;
            case "CdpComplianceDLPSharePointClassification": return CdpComplianceDLPSharePointClassification;
            case "FilteringBulkSenderInsightData": return FilteringBulkSenderInsightData;
            case "FilteringBulkThresholdInsightData": return FilteringBulkThresholdInsightData;
            case "PrivacyOpenAccess": return PrivacyOpenAccess;
            case "OWAAuth": return OWAAuth;
            case "ComplianceDLPApplicationsClassification": return ComplianceDLPApplicationsClassification;
            case "SharePointESignature": return SharePointESignature;
            case "Dynamics365BusinessCentral": return Dynamics365BusinessCentral;
            case "MeshWorlds": return MeshWorlds;
            case "VivaPulseResponse": return VivaPulseResponse;
            case "VivaPulseOrganizer": return VivaPulseOrganizer;
            case "VivaPulseAdmin": return VivaPulseAdmin;
            case "VivaPulseReport": return VivaPulseReport;
            case "AIAppInteraction": return AIAppInteraction;
            case "ComplianceDLMExchange": return ComplianceDLMExchange;
            case "ComplianceDLMSharePoint": return ComplianceDLMSharePoint;
            case "ProjectForTheWebAssignedToMeSettings": return ProjectForTheWebAssignedToMeSettings;
            case "CPSOperation": return CPSOperation;
            case "ComplianceDLPExchangeDiscovery": return ComplianceDLPExchangeDiscovery;
            case "PurviewMCRecommendation": return PurviewMCRecommendation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
