package com.microsoft.graph.devicemanagement;

import com.microsoft.graph.devicemanagement.applepushnotificationcertificate.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancemanagementpartners.ComplianceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.compliancemanagementpartners.item.ComplianceManagementPartnerItemRequestBuilder;
import com.microsoft.graph.devicemanagement.conditionalaccesssettings.ConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.devicemanagement.detectedapps.DetectedAppsRequestBuilder;
import com.microsoft.graph.devicemanagement.detectedapps.item.DetectedAppItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecategories.DeviceCategoriesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecategories.item.DeviceCategoryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.DeviceCompliancePoliciesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.DeviceCompliancePolicyItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicydevicestatesummary.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.DeviceCompliancePolicySettingStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.item.DeviceCompliancePolicySettingStateSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurationdevicestatesummaries.DeviceConfigurationDeviceStateSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.DeviceConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceconfigurations.item.DeviceConfigurationItemRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.DeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.item.DeviceEnrollmentConfigurationItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementpartners.DeviceManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.devicemanagementpartners.item.DeviceManagementPartnerItemRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeconnectors.ExchangeConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.exchangeconnectors.item.DeviceManagementExchangeConnectorItemRequestBuilder;
import com.microsoft.graph.devicemanagement.geteffectivepermissionswithscope.GetEffectivePermissionsWithScopeRequestBuilder;
import com.microsoft.graph.devicemanagement.importedwindowsautopilotdeviceidentities.ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.importedwindowsautopilotdeviceidentities.item.ImportedWindowsAutopilotDeviceIdentityItemRequestBuilder;
import com.microsoft.graph.devicemanagement.iosupdatestatuses.IosUpdateStatusesRequestBuilder;
import com.microsoft.graph.devicemanagement.iosupdatestatuses.item.IosUpdateDeviceStatusItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddeviceoverview.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.item.ManagedDeviceItemRequestBuilder;
import com.microsoft.graph.devicemanagement.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.item.MobileThreatDefenseConnectorItemRequestBuilder;
import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.MobileThreatDefenseConnectorsRequestBuilder;
import com.microsoft.graph.devicemanagement.notificationmessagetemplates.item.NotificationMessageTemplateItemRequestBuilder;
import com.microsoft.graph.devicemanagement.notificationmessagetemplates.NotificationMessageTemplatesRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteassistancepartners.item.RemoteAssistancePartnerItemRequestBuilder;
import com.microsoft.graph.devicemanagement.remoteassistancepartners.RemoteAssistancePartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.ReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.resourceoperations.item.ResourceOperationItemRequestBuilder;
import com.microsoft.graph.devicemanagement.resourceoperations.ResourceOperationsRequestBuilder;
import com.microsoft.graph.devicemanagement.roleassignments.item.DeviceAndAppManagementRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.devicemanagement.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.devicemanagement.roledefinitions.item.RoleDefinitionItemRequestBuilder;
import com.microsoft.graph.devicemanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.devicemanagement.softwareupdatestatussummary.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.devicemanagement.telecomexpensemanagementpartners.item.TelecomExpenseManagementPartnerItemRequestBuilder;
import com.microsoft.graph.devicemanagement.telecomexpensemanagementpartners.TelecomExpenseManagementPartnersRequestBuilder;
import com.microsoft.graph.devicemanagement.termsandconditions.item.TermsAndConditionsItemRequestBuilder;
import com.microsoft.graph.devicemanagement.termsandconditions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.devicemanagement.troubleshootingevents.item.DeviceManagementTroubleshootingEventItemRequestBuilder;
import com.microsoft.graph.devicemanagement.troubleshootingevents.TroubleshootingEventsRequestBuilder;
import com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname.VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item.WindowsAutopilotDeviceIdentityItemRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.WindowsAutopilotDeviceIdentitiesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionapplearningsummaries.item.WindowsInformationProtectionAppLearningSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionapplearningsummaries.WindowsInformationProtectionAppLearningSummariesRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionnetworklearningsummaries.item.WindowsInformationProtectionNetworkLearningSummaryItemRequestBuilder;
import com.microsoft.graph.devicemanagement.windowsinformationprotectionnetworklearningsummaries.WindowsInformationProtectionNetworkLearningSummariesRequestBuilder;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the deviceManagement singleton. */
public class DeviceManagementRequestBuilder {
    /** The applePushNotificationCertificate property */
    @javax.annotation.Nonnull
    public ApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The complianceManagementPartners property */
    @javax.annotation.Nonnull
    public ComplianceManagementPartnersRequestBuilder complianceManagementPartners() {
        return new ComplianceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The conditionalAccessSettings property */
    @javax.annotation.Nonnull
    public ConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new ConditionalAccessSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The detectedApps property */
    @javax.annotation.Nonnull
    public DetectedAppsRequestBuilder detectedApps() {
        return new DetectedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCategories property */
    @javax.annotation.Nonnull
    public DeviceCategoriesRequestBuilder deviceCategories() {
        return new DeviceCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicies property */
    @javax.annotation.Nonnull
    public DeviceCompliancePoliciesRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicyDeviceStateSummary property */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceCompliancePolicySettingStateSummaries property */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceConfigurationDeviceStateSummaries property */
    @javax.annotation.Nonnull
    public DeviceConfigurationDeviceStateSummariesRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceConfigurations property */
    @javax.annotation.Nonnull
    public DeviceConfigurationsRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceEnrollmentConfigurations property */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceManagementPartners property */
    @javax.annotation.Nonnull
    public DeviceManagementPartnersRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exchangeConnectors property */
    @javax.annotation.Nonnull
    public ExchangeConnectorsRequestBuilder exchangeConnectors() {
        return new ExchangeConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The importedWindowsAutopilotDeviceIdentities property */
    @javax.annotation.Nonnull
    public ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The iosUpdateStatuses property */
    @javax.annotation.Nonnull
    public IosUpdateStatusesRequestBuilder iosUpdateStatuses() {
        return new IosUpdateStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDeviceOverview property */
    @javax.annotation.Nonnull
    public ManagedDeviceOverviewRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDevices property */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileThreatDefenseConnectors property */
    @javax.annotation.Nonnull
    public MobileThreatDefenseConnectorsRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The notificationMessageTemplates property */
    @javax.annotation.Nonnull
    public NotificationMessageTemplatesRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The remoteAssistancePartners property */
    @javax.annotation.Nonnull
    public RemoteAssistancePartnersRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reports property */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The resourceOperations property */
    @javax.annotation.Nonnull
    public ResourceOperationsRequestBuilder resourceOperations() {
        return new ResourceOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignments property */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleDefinitions property */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The softwareUpdateStatusSummary property */
    @javax.annotation.Nonnull
    public SoftwareUpdateStatusSummaryRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The telecomExpenseManagementPartners property */
    @javax.annotation.Nonnull
    public TelecomExpenseManagementPartnersRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The termsAndConditions property */
    @javax.annotation.Nonnull
    public TermsAndConditionsRequestBuilder termsAndConditions() {
        return new TermsAndConditionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The troubleshootingEvents property */
    @javax.annotation.Nonnull
    public TroubleshootingEventsRequestBuilder troubleshootingEvents() {
        return new TroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The windowsAutopilotDeviceIdentities property */
    @javax.annotation.Nonnull
    public WindowsAutopilotDeviceIdentitiesRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionAppLearningSummaries property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionAppLearningSummariesRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionNetworkLearningSummaries property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionNetworkLearningSummariesRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.complianceManagementPartners.item collection
     * @param id Unique identifier of the item
     * @return a ComplianceManagementPartnerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ComplianceManagementPartnerItemRequestBuilder complianceManagementPartners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("complianceManagementPartner%2Did", id);
        return new ComplianceManagementPartnerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeviceManagementRequestBuilderGetRequestConfiguration requestConfig = new DeviceManagementRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceManagementRequestBuilderPatchRequestConfiguration requestConfig = new DeviceManagementRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.detectedApps.item collection
     * @param id Unique identifier of the item
     * @return a DetectedAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DetectedAppItemRequestBuilder detectedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("detectedApp%2Did", id);
        return new DetectedAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceCategories.item collection
     * @param id Unique identifier of the item
     * @return a DeviceCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCategoryItemRequestBuilder deviceCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCategory%2Did", id);
        return new DeviceCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceCompliancePolicies.item collection
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicyItemRequestBuilder deviceCompliancePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicy%2Did", id);
        return new DeviceCompliancePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceCompliancePolicySettingStateSummaries.item collection
     * @param id Unique identifier of the item
     * @return a DeviceCompliancePolicySettingStateSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummaryItemRequestBuilder deviceCompliancePolicySettingStateSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicySettingStateSummary%2Did", id);
        return new DeviceCompliancePolicySettingStateSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a DeviceConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceConfigurationItemRequestBuilder deviceConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceConfiguration%2Did", id);
        return new DeviceConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceEnrollmentConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a DeviceEnrollmentConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationItemRequestBuilder deviceEnrollmentConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceEnrollmentConfiguration%2Did", id);
        return new DeviceEnrollmentConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceManagementPartners.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementPartnerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementPartnerItemRequestBuilder deviceManagementPartners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementPartner%2Did", id);
        return new DeviceManagementPartnerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.exchangeConnectors.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementExchangeConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementExchangeConnectorItemRequestBuilder exchangeConnectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementExchangeConnector%2Did", id);
        return new DeviceManagementExchangeConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get deviceManagement
     * @return a CompletableFuture of deviceManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceManagement> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of deviceManagement
     */
    public java.util.concurrent.CompletableFuture<DeviceManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagement::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
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
     * Gets an item from the com.Microsoft.Graph.deviceManagement.importedWindowsAutopilotDeviceIdentities.item collection
     * @param id Unique identifier of the item
     * @return a ImportedWindowsAutopilotDeviceIdentityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ImportedWindowsAutopilotDeviceIdentityItemRequestBuilder importedWindowsAutopilotDeviceIdentities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("importedWindowsAutopilotDeviceIdentity%2Did", id);
        return new ImportedWindowsAutopilotDeviceIdentityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.iosUpdateStatuses.item collection
     * @param id Unique identifier of the item
     * @return a IosUpdateDeviceStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IosUpdateDeviceStatusItemRequestBuilder iosUpdateStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("iosUpdateDeviceStatus%2Did", id);
        return new IosUpdateDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.managedDevices.item collection
     * @param id Unique identifier of the item
     * @return a ManagedDeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder managedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", id);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.mobileThreatDefenseConnectors.item collection
     * @param id Unique identifier of the item
     * @return a MobileThreatDefenseConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileThreatDefenseConnectorItemRequestBuilder mobileThreatDefenseConnectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileThreatDefenseConnector%2Did", id);
        return new MobileThreatDefenseConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.notificationMessageTemplates.item collection
     * @param id Unique identifier of the item
     * @return a NotificationMessageTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public NotificationMessageTemplateItemRequestBuilder notificationMessageTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("notificationMessageTemplate%2Did", id);
        return new NotificationMessageTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagement body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagement body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.remoteAssistancePartners.item collection
     * @param id Unique identifier of the item
     * @return a RemoteAssistancePartnerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RemoteAssistancePartnerItemRequestBuilder remoteAssistancePartners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("remoteAssistancePartner%2Did", id);
        return new RemoteAssistancePartnerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.resourceOperations.item collection
     * @param id Unique identifier of the item
     * @return a ResourceOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceOperationItemRequestBuilder resourceOperations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceOperation%2Did", id);
        return new ResourceOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.roleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a DeviceAndAppManagementRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceAndAppManagementRoleAssignmentItemRequestBuilder roleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceAndAppManagementRoleAssignment%2Did", id);
        return new DeviceAndAppManagementRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.roleDefinitions.item collection
     * @param id Unique identifier of the item
     * @return a RoleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RoleDefinitionItemRequestBuilder roleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("roleDefinition%2Did", id);
        return new RoleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.telecomExpenseManagementPartners.item collection
     * @param id Unique identifier of the item
     * @return a TelecomExpenseManagementPartnerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TelecomExpenseManagementPartnerItemRequestBuilder telecomExpenseManagementPartners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("telecomExpenseManagementPartner%2Did", id);
        return new TelecomExpenseManagementPartnerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.termsAndConditions.item collection
     * @param id Unique identifier of the item
     * @return a TermsAndConditionsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TermsAndConditionsItemRequestBuilder termsAndConditions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("termsAndConditions%2Did", id);
        return new TermsAndConditionsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.troubleshootingEvents.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementTroubleshootingEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventItemRequestBuilder troubleshootingEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementTroubleshootingEvent%2Did", id);
        return new DeviceManagementTroubleshootingEventItemRequestBuilder(urlTplParams, requestAdapter);
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
     * Gets an item from the com.Microsoft.Graph.deviceManagement.windowsAutopilotDeviceIdentities.item collection
     * @param id Unique identifier of the item
     * @return a WindowsAutopilotDeviceIdentityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsAutopilotDeviceIdentityItemRequestBuilder windowsAutopilotDeviceIdentities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsAutopilotDeviceIdentity%2Did", id);
        return new WindowsAutopilotDeviceIdentityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.windowsInformationProtectionAppLearningSummaries.item collection
     * @param id Unique identifier of the item
     * @return a WindowsInformationProtectionAppLearningSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionAppLearningSummaryItemRequestBuilder windowsInformationProtectionAppLearningSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionAppLearningSummary%2Did", id);
        return new WindowsInformationProtectionAppLearningSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.windowsInformationProtectionNetworkLearningSummaries.item collection
     * @param id Unique identifier of the item
     * @return a WindowsInformationProtectionNetworkLearningSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionNetworkLearningSummaryItemRequestBuilder windowsInformationProtectionNetworkLearningSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionNetworkLearningSummary%2Did", id);
        return new WindowsInformationProtectionNetworkLearningSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get deviceManagement */
    public class DeviceManagementRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceManagementRequestBuilderGetQueryParameters queryParameters = new DeviceManagementRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new deviceManagementRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceManagementRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new deviceManagementRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceManagementRequestBuilderPatchRequestConfiguration() {
        }
    }
}
