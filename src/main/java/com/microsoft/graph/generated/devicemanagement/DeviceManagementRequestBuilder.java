package com.microsoft.graph.devicemanagement;

import com.microsoft.graph.devicemanagement.applepushnotificationcertificate.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.devicemanagement.auditevents.AuditEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancemanagementpartners.ComplianceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.conditionalaccesssettings.ConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecategories.DeviceCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.DeviceCompliancePoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicydevicestatesummary.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.DeviceCompliancePolicySettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationdevicestatesummaries.DeviceConfigurationDeviceStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.DeviceConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.DeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementpartners.DeviceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeconnectors.ExchangeConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.geteffectivepermissionswithscope.GetEffectivePermissionsWithScopeRequestBuilder;
import com.microsoft.graph.devicemanagement.importedwindowsautopilotdeviceidentities.ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.iosupdatestatuses.IosUpdateStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddeviceoverview.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.mobileapptroubleshootingevents.MobileAppTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.MobileThreatDefenseConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.notificationmessagetemplates.NotificationMessageTemplatesRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteassistancepartners.RemoteAssistancePartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.ReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.resourceoperations.ResourceOperationsRequestBuilder;
import com.microsoft.graph.devicemanagement.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.devicemanagement.softwareupdatestatussummary.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.telecomexpensemanagementpartners.TelecomExpenseManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.termsandconditions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.devicemanagement.troubleshootingevents.TroubleshootingEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformance.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversiondetails.UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversiondeviceid.UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyosversion.UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdevicemodelperformance.UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdeviceperformance.UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthdeviceperformancedetails.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthosversionperformance.UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthoverview.UserExperienceAnalyticsAppHealthOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.UserExperienceAnalyticsBaselinesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticscategories.UserExperienceAnalyticsCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdeviceperformance.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicescores.UserExperienceAnalyticsDeviceScoresRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartuphistory.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartupprocesses.UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicestartupprocessperformance.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsmetrichistory.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsmodelscores.UserExperienceAnalyticsModelScoresRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsoverview.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsscorehistory.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticssummarizeworkfromanywheredevices.UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywherehardwarereadinessmetric.UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywheremetrics.UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsworkfromanywheremodelperformance.UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder;
import com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname.VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.VirtualEndpointRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.WindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionapplearningsummaries.WindowsInformationProtectionAppLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionnetworklearningsummaries.WindowsInformationProtectionNetworkLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsmalwareinformation.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the deviceManagement singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the applePushNotificationCertificate property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ApplePushNotificationCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditEvents property of the microsoft.graph.deviceManagement entity.
     * @return a {@link AuditEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the complianceManagementPartners property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ComplianceManagementPartnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplianceManagementPartnersRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessSettings property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ConditionalAccessSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new ConditionalAccessSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the detectedApps property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DetectedAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCategories property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCategoriesRequestBuilder deviceCategories() {
        return new DeviceCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicies property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceCompliancePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePoliciesRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicyDeviceStateSummary property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceCompliancePolicyDeviceStateSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceCompliancePolicySettingStateSummariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurationDeviceStateSummaries property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceConfigurationDeviceStateSummariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationDeviceStateSummariesRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceConfigurations property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationsRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceEnrollmentConfigurations property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceEnrollmentConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagementPartners property of the microsoft.graph.deviceManagement entity.
     * @return a {@link DeviceManagementPartnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementPartnersRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exchangeConnectors property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ExchangeConnectorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExchangeConnectorsRequestBuilder exchangeConnectors() {
        return new ExchangeConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the importedWindowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the iosUpdateStatuses property of the microsoft.graph.deviceManagement entity.
     * @return a {@link IosUpdateStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IosUpdateStatusesRequestBuilder iosUpdateStatuses() {
        return new IosUpdateStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDeviceOverview property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ManagedDeviceOverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceOverviewRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ManagedDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppTroubleshootingEvents property of the microsoft.graph.deviceManagement entity.
     * @return a {@link MobileAppTroubleshootingEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppTroubleshootingEventsRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileThreatDefenseConnectors property of the microsoft.graph.deviceManagement entity.
     * @return a {@link MobileThreatDefenseConnectorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileThreatDefenseConnectorsRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the notificationMessageTemplates property of the microsoft.graph.deviceManagement entity.
     * @return a {@link NotificationMessageTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotificationMessageTemplatesRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the remoteAssistancePartners property of the microsoft.graph.deviceManagement entity.
     * @return a {@link RemoteAssistancePartnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoteAssistancePartnersRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resourceOperations property of the microsoft.graph.deviceManagement entity.
     * @return a {@link ResourceOperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResourceOperationsRequestBuilder resourceOperations() {
        return new ResourceOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.deviceManagement entity.
     * @return a {@link RoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinitions property of the microsoft.graph.deviceManagement entity.
     * @return a {@link RoleDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the softwareUpdateStatusSummary property of the microsoft.graph.deviceManagement entity.
     * @return a {@link SoftwareUpdateStatusSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SoftwareUpdateStatusSummaryRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the telecomExpenseManagementPartners property of the microsoft.graph.deviceManagement entity.
     * @return a {@link TelecomExpenseManagementPartnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TelecomExpenseManagementPartnersRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termsAndConditions property of the microsoft.graph.deviceManagement entity.
     * @return a {@link TermsAndConditionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TermsAndConditionsRequestBuilder termsAndConditions() {
        return new TermsAndConditionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the troubleshootingEvents property of the microsoft.graph.deviceManagement entity.
     * @return a {@link TroubleshootingEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TroubleshootingEventsRequestBuilder troubleshootingEvents() {
        return new TroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformance() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthDeviceModelPerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder userExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthDevicePerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder userExperienceAnalyticsAppHealthDevicePerformance() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthDevicePerformanceDetails property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder userExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return new UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthOSVersionPerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder userExperienceAnalyticsAppHealthOSVersionPerformance() {
        return new UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthOverview property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsAppHealthOverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthOverviewRequestBuilder userExperienceAnalyticsAppHealthOverview() {
        return new UserExperienceAnalyticsAppHealthOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsBaselines property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsBaselinesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsBaselinesRequestBuilder userExperienceAnalyticsBaselines() {
        return new UserExperienceAnalyticsBaselinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsCategories property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsCategoriesRequestBuilder userExperienceAnalyticsCategories() {
        return new UserExperienceAnalyticsCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsDevicePerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsDevicePerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsDevicePerformanceRequestBuilder userExperienceAnalyticsDevicePerformance() {
        return new UserExperienceAnalyticsDevicePerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsDeviceScores property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsDeviceScoresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsDeviceScoresRequestBuilder userExperienceAnalyticsDeviceScores() {
        return new UserExperienceAnalyticsDeviceScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsDeviceStartupHistory property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder userExperienceAnalyticsDeviceStartupHistory() {
        return new UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsDeviceStartupProcesses property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder userExperienceAnalyticsDeviceStartupProcesses() {
        return new UserExperienceAnalyticsDeviceStartupProcessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsDeviceStartupProcessPerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder userExperienceAnalyticsDeviceStartupProcessPerformance() {
        return new UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsMetricHistory property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsMetricHistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsMetricHistoryRequestBuilder userExperienceAnalyticsMetricHistory() {
        return new UserExperienceAnalyticsMetricHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsModelScores property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsModelScoresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsModelScoresRequestBuilder userExperienceAnalyticsModelScores() {
        return new UserExperienceAnalyticsModelScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsOverview property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsOverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsOverviewRequestBuilder userExperienceAnalyticsOverview() {
        return new UserExperienceAnalyticsOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsScoreHistory property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsScoreHistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsScoreHistoryRequestBuilder userExperienceAnalyticsScoreHistory() {
        return new UserExperienceAnalyticsScoreHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the userExperienceAnalyticsSummarizeWorkFromAnywhereDevices method.
     * @return a {@link UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder userExperienceAnalyticsSummarizeWorkFromAnywhereDevices() {
        return new UserExperienceAnalyticsSummarizeWorkFromAnywhereDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereMetrics property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder userExperienceAnalyticsWorkFromAnywhereMetrics() {
        return new UserExperienceAnalyticsWorkFromAnywhereMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsWorkFromAnywhereModelPerformance property of the microsoft.graph.deviceManagement entity.
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder userExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return new UserExperienceAnalyticsWorkFromAnywhereModelPerformanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the virtualEndpoint property of the microsoft.graph.deviceManagement entity.
     * @return a {@link VirtualEndpointRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEndpointRequestBuilder virtualEndpoint() {
        return new VirtualEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity.
     * @return a {@link WindowsAutopilotDeviceIdentitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsAutopilotDeviceIdentitiesRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionAppLearningSummaries property of the microsoft.graph.deviceManagement entity.
     * @return a {@link WindowsInformationProtectionAppLearningSummariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionAppLearningSummariesRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionNetworkLearningSummaries property of the microsoft.graph.deviceManagement entity.
     * @return a {@link WindowsInformationProtectionNetworkLearningSummariesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionNetworkLearningSummariesRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsMalwareInformation property of the microsoft.graph.deviceManagement entity.
     * @return a {@link WindowsMalwareInformationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsMalwareInformationRequestBuilder windowsMalwareInformation() {
        return new WindowsMalwareInformationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceManagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceManagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24expand,%24select}", rawUrl);
    }
    /**
     * Read properties and relationships of the deviceManagement object.
     * @return a {@link DeviceManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-policyset-devicemanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagement get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the deviceManagement object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-policyset-devicemanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagement get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagement::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getEffectivePermissions method.
     * @param scope Usage: scope=&apos;{scope}&apos;
     * @return a {@link GetEffectivePermissionsWithScopeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEffectivePermissionsWithScopeRequestBuilder getEffectivePermissionsWithScope(@jakarta.annotation.Nonnull final String scope) {
        Objects.requireNonNull(scope);
        return new GetEffectivePermissionsWithScopeRequestBuilder(pathParameters, requestAdapter, scope);
    }
    /**
     * Update the properties of a deviceManagement object.
     * @param body The request body
     * @return a {@link DeviceManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-raimportcerts-devicemanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagement patch(@jakarta.annotation.Nonnull final DeviceManagement body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a deviceManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-raimportcerts-devicemanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagement patch(@jakarta.annotation.Nonnull final DeviceManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagement::createFromDiscriminatorValue);
    }
    /**
     * Read properties and relationships of the deviceManagement object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the deviceManagement object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a deviceManagement object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagement body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a deviceManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Provides operations to call the verifyWindowsEnrollmentAutoDiscovery method.
     * @param domainName Usage: domainName=&apos;{domainName}&apos;
     * @return a {@link VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder verifyWindowsEnrollmentAutoDiscoveryWithDomainName(@jakarta.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DeviceManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceManagementRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read properties and relationships of the deviceManagement object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
