package com.microsoft.graph.devicemanagement.reports;

import com.microsoft.graph.devicemanagement.reports.exportjobs.ExportJobsRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcachedreport.GetCachedReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicynoncompliancereport.GetCompliancePolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancepolicynoncompliancesummaryreport.GetCompliancePolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getcompliancesettingnoncompliancereport.GetComplianceSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicynoncompliancereport.GetConfigurationPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationpolicynoncompliancesummaryreport.GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getconfigurationsettingnoncompliancereport.GetConfigurationSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicemanagementintentpersettingcontributingprofiles.GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicemanagementintentsettingsreport.GetDeviceManagementIntentSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdevicenoncompliancereport.GetDeviceNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getdeviceswithoutcompliancepolicyreport.GetDevicesWithoutCompliancePolicyReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.gethistoricalreport.GetHistoricalReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getnoncompliantdevicesandsettingsreport.GetNoncompliantDevicesAndSettingsReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancemetadata.GetPolicyNonComplianceMetadataRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancereport.GetPolicyNonComplianceReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancesummaryreport.GetPolicyNonComplianceSummaryReportRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getreportfilters.GetReportFiltersRequestBuilder;
import com.microsoft.graph.devicemanagement.reports.getsettingnoncompliancereport.GetSettingNonComplianceReportRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReports;
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
 * Provides operations to manage the reports property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.deviceManagementReports entity.
     */
    @jakarta.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCachedReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCachedReportRequestBuilder getCachedReport() {
        return new GetCachedReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport() {
        return new GetCompliancePolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCompliancePolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport() {
        return new GetCompliancePolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getComplianceSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport() {
        return new GetComplianceSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport() {
        return new GetConfigurationPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationPolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport() {
        return new GetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConfigurationSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport() {
        return new GetConfigurationSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceManagementIntentPerSettingContributingProfiles method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder getDeviceManagementIntentPerSettingContributingProfiles() {
        return new GetDeviceManagementIntentPerSettingContributingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceManagementIntentSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceManagementIntentSettingsReportRequestBuilder getDeviceManagementIntentSettingsReport() {
        return new GetDeviceManagementIntentSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDeviceNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport() {
        return new GetDeviceNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDevicesWithoutCompliancePolicyReport method.
     */
    @jakarta.annotation.Nonnull
    public GetDevicesWithoutCompliancePolicyReportRequestBuilder getDevicesWithoutCompliancePolicyReport() {
        return new GetDevicesWithoutCompliancePolicyReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getHistoricalReport method.
     */
    @jakarta.annotation.Nonnull
    public GetHistoricalReportRequestBuilder getHistoricalReport() {
        return new GetHistoricalReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getNoncompliantDevicesAndSettingsReport method.
     */
    @jakarta.annotation.Nonnull
    public GetNoncompliantDevicesAndSettingsReportRequestBuilder getNoncompliantDevicesAndSettingsReport() {
        return new GetNoncompliantDevicesAndSettingsReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceMetadata method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata() {
        return new GetPolicyNonComplianceMetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport() {
        return new GetPolicyNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPolicyNonComplianceSummaryReport method.
     */
    @jakarta.annotation.Nonnull
    public GetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport() {
        return new GetPolicyNonComplianceSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getReportFilters method.
     */
    @jakarta.annotation.Nonnull
    public GetReportFiltersRequestBuilder getReportFilters() {
        return new GetReportFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSettingNonComplianceReport method.
     */
    @jakarta.annotation.Nonnull
    public GetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport() {
        return new GetSettingNonComplianceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property reports for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read properties and relationships of the deviceManagementReports object.
     * @return a DeviceManagementReports
     * @see <a href="https://learn.microsoft.com/graph/api/intune-reporting-devicemanagementreports-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the deviceManagementReports object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceManagementReports
     * @see <a href="https://learn.microsoft.com/graph/api/intune-reporting-devicemanagementreports-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementReports::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a deviceManagementReports object.
     * @param body The request body
     * @return a DeviceManagementReports
     * @see <a href="https://learn.microsoft.com/graph/api/intune-reporting-devicemanagementreports-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports patch(@jakarta.annotation.Nonnull final DeviceManagementReports body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a deviceManagementReports object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceManagementReports
     * @see <a href="https://learn.microsoft.com/graph/api/intune-reporting-devicemanagementreports-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports patch(@jakarta.annotation.Nonnull final DeviceManagementReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementReports::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read properties and relationships of the deviceManagementReports object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the deviceManagementReports object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a deviceManagementReports object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementReports body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a deviceManagementReports object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ReportsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read properties and relationships of the deviceManagementReports object.
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
         * @return a Map<String, Object>
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
