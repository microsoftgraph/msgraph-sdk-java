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
import com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname.VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.WindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionapplearningsummaries.WindowsInformationProtectionAppLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionnetworklearningsummaries.WindowsInformationProtectionNetworkLearningSummariesRequestBuilder;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the deviceManagement singleton.
 */
public class DeviceManagementRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the applePushNotificationCertificate property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the auditEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the complianceManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ComplianceManagementPartnersRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the conditionalAccessSettings property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new ConditionalAccessSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the detectedApps property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCategories property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCategoriesRequestBuilder deviceCategories() {
        return new DeviceCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicies property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePoliciesRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicyDeviceStateSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurationDeviceStateSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationDeviceStateSummariesRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceConfigurationsRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceEnrollmentConfigurations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public DeviceManagementPartnersRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exchangeConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ExchangeConnectorsRequestBuilder exchangeConnectors() {
        return new ExchangeConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the importedWindowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the iosUpdateStatuses property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public IosUpdateStatusesRequestBuilder iosUpdateStatuses() {
        return new IosUpdateStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDeviceOverview property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ManagedDeviceOverviewRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDevices property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileThreatDefenseConnectors property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public MobileThreatDefenseConnectorsRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the notificationMessageTemplates property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public NotificationMessageTemplatesRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the remoteAssistancePartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RemoteAssistancePartnersRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the resourceOperations property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public ResourceOperationsRequestBuilder resourceOperations() {
        return new ResourceOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleAssignments property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleDefinitions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the softwareUpdateStatusSummary property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public SoftwareUpdateStatusSummaryRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the telecomExpenseManagementPartners property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TelecomExpenseManagementPartnersRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the termsAndConditions property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TermsAndConditionsRequestBuilder termsAndConditions() {
        return new TermsAndConditionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the troubleshootingEvents property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public TroubleshootingEventsRequestBuilder troubleshootingEvents() {
        return new TroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsAutopilotDeviceIdentities property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsAutopilotDeviceIdentitiesRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsInformationProtectionAppLearningSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionAppLearningSummariesRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsInformationProtectionNetworkLearningSummaries property of the microsoft.graph.deviceManagement entity. */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionNetworkLearningSummariesRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get deviceManagement
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getEffectivePermissions method.
     * @param scope Usage: scope='{scope}'
     * @return a getEffectivePermissionsWithScopeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEffectivePermissionsWithScopeRequestBuilder getEffectivePermissionsWithScope(@javax.annotation.Nonnull final String scope) {
        Objects.requireNonNull(scope);
        return new GetEffectivePermissionsWithScopeRequestBuilder(pathParameters, requestAdapter, scope);
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patch(@javax.annotation.Nonnull final DeviceManagement body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patch(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to call the verifyWindowsEnrollmentAutoDiscovery method.
     * @param domainName Usage: domainName='{domainName}'
     * @return a verifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder
     */
    @javax.annotation.Nonnull
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder verifyWindowsEnrollmentAutoDiscoveryWithDomainName(@javax.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Get deviceManagement
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
