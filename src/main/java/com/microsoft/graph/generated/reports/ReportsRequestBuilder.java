package com.microsoft.graph.reports;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.reports.authenticationmethods.AuthenticationMethodsRequestBuilder;
import com.microsoft.graph.reports.dailyprintusagebyprinter.DailyPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.reports.dailyprintusagebyuser.DailyPrintUsageByUserRequestBuilder;
import com.microsoft.graph.reports.deviceconfigurationdeviceactivity.DeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.reports.deviceconfigurationuseractivity.DeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.reports.getemailactivitycountswithperiod.GetEmailActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailactivityusercountswithperiod.GetEmailActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailactivityuserdetailwithdate.GetEmailActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getemailactivityuserdetailwithperiod.GetEmailActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailappusageappsusercountswithperiod.GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailappusageusercountswithperiod.GetEmailAppUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailappusageuserdetailwithdate.GetEmailAppUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getemailappusageuserdetailwithperiod.GetEmailAppUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getemailappusageversionsusercountswithperiod.GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getgrouparchivedprintjobswithgroupidwithstartdatetimewithenddatetime.GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.reports.getm365appplatformusercountswithperiod.GetM365AppPlatformUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getm365appusercountswithperiod.GetM365AppUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getm365appuserdetailwithdate.GetM365AppUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getm365appuserdetailwithperiod.GetM365AppUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getmailboxusagedetailwithperiod.GetMailboxUsageDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getmailboxusagemailboxcountswithperiod.GetMailboxUsageMailboxCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getmailboxusagequotastatusmailboxcountswithperiod.GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getmailboxusagestoragewithperiod.GetMailboxUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365activationcounts.GetOffice365ActivationCountsRequestBuilder;
import com.microsoft.graph.reports.getoffice365activationsusercounts.GetOffice365ActivationsUserCountsRequestBuilder;
import com.microsoft.graph.reports.getoffice365activationsuserdetail.GetOffice365ActivationsUserDetailRequestBuilder;
import com.microsoft.graph.reports.getoffice365activeusercountswithperiod.GetOffice365ActiveUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365activeuserdetailwithdate.GetOffice365ActiveUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getoffice365activeuserdetailwithperiod.GetOffice365ActiveUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivitycountswithperiod.GetOffice365GroupsActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivitydetailwithdate.GetOffice365GroupsActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivitydetailwithperiod.GetOffice365GroupsActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivityfilecountswithperiod.GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivitygroupcountswithperiod.GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365groupsactivitystoragewithperiod.GetOffice365GroupsActivityStorageWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getoffice365servicesusercountswithperiod.GetOffice365ServicesUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveactivityfilecountswithperiod.GetOneDriveActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveactivityusercountswithperiod.GetOneDriveActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveactivityuserdetailwithdate.GetOneDriveActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getonedriveactivityuserdetailwithperiod.GetOneDriveActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveusageaccountcountswithperiod.GetOneDriveUsageAccountCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveusageaccountdetailwithdate.GetOneDriveUsageAccountDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getonedriveusageaccountdetailwithperiod.GetOneDriveUsageAccountDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveusagefilecountswithperiod.GetOneDriveUsageFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getonedriveusagestoragewithperiod.GetOneDriveUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getprinterarchivedprintjobswithprinteridwithstartdatetimewithenddatetime.GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.reports.getsharepointactivityfilecountswithperiod.GetSharePointActivityFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointactivitypageswithperiod.GetSharePointActivityPagesWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointactivityusercountswithperiod.GetSharePointActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointactivityuserdetailwithdate.GetSharePointActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getsharepointactivityuserdetailwithperiod.GetSharePointActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagedetailwithdate.GetSharePointSiteUsageDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagedetailwithperiod.GetSharePointSiteUsageDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagefilecountswithperiod.GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagepageswithperiod.GetSharePointSiteUsagePagesWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagesitecountswithperiod.GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getsharepointsiteusagestoragewithperiod.GetSharePointSiteUsageStorageWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessactivitycountswithperiod.GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessactivityusercountswithperiod.GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessactivityuserdetailwithdate.GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessactivityuserdetailwithperiod.GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessdeviceusagedistributionusercountswithperiod.GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessdeviceusageusercountswithperiod.GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessdeviceusageuserdetailwithdate.GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessdeviceusageuserdetailwithperiod.GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessorganizeractivitycountswithperiod.GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessorganizeractivityminutecountswithperiod.GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessorganizeractivityusercountswithperiod.GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessparticipantactivitycountswithperiod.GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessparticipantactivityminutecountswithperiod.GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinessparticipantactivityusercountswithperiod.GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinesspeertopeeractivitycountswithperiod.GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinesspeertopeeractivityminutecountswithperiod.GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getskypeforbusinesspeertopeeractivityusercountswithperiod.GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsdeviceusagedistributionusercountswithperiod.GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsdeviceusageusercountswithperiod.GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsdeviceusageuserdetailwithdate.GetTeamsDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getteamsdeviceusageuserdetailwithperiod.GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsteamactivitycountswithperiod.GetTeamsTeamActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsteamactivitydetailwithdate.GetTeamsTeamActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getteamsteamactivitydetailwithperiod.GetTeamsTeamActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsteamactivitydistributioncountswithperiod.GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsteamcountswithperiod.GetTeamsTeamCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsuseractivitycountswithperiod.GetTeamsUserActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsuseractivityusercountswithperiod.GetTeamsUserActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getteamsuseractivityuserdetailwithdate.GetTeamsUserActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getteamsuseractivityuserdetailwithperiod.GetTeamsUserActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getuserarchivedprintjobswithuseridwithstartdatetimewithenddatetime.GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.reports.getyammeractivitycountswithperiod.GetYammerActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammeractivityusercountswithperiod.GetYammerActivityUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammeractivityuserdetailwithdate.GetYammerActivityUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getyammeractivityuserdetailwithperiod.GetYammerActivityUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammerdeviceusagedistributionusercountswithperiod.GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammerdeviceusageusercountswithperiod.GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammerdeviceusageuserdetailwithdate.GetYammerDeviceUsageUserDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getyammerdeviceusageuserdetailwithperiod.GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammergroupsactivitycountswithperiod.GetYammerGroupsActivityCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammergroupsactivitydetailwithdate.GetYammerGroupsActivityDetailWithDateRequestBuilder;
import com.microsoft.graph.reports.getyammergroupsactivitydetailwithperiod.GetYammerGroupsActivityDetailWithPeriodRequestBuilder;
import com.microsoft.graph.reports.getyammergroupsactivitygroupcountswithperiod.GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder;
import com.microsoft.graph.reports.manageddeviceenrollmentfailuredetails.ManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.reports.manageddeviceenrollmentfailuredetailswithskipwithtopwithfilterwithskiptoken.ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder;
import com.microsoft.graph.reports.manageddeviceenrollmenttopfailures.ManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.reports.manageddeviceenrollmenttopfailureswithperiod.ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder;
import com.microsoft.graph.reports.monthlyprintusagebyprinter.MonthlyPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.reports.monthlyprintusagebyuser.MonthlyPrintUsageByUserRequestBuilder;
import com.microsoft.graph.reports.security.SecurityRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reportRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the authenticationMethods property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder authenticationMethods() {
        return new AuthenticationMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter() {
        return new DailyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageByUserRequestBuilder dailyPrintUsageByUser() {
        return new DailyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deviceConfigurationDeviceActivity method.
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new DeviceConfigurationDeviceActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deviceConfigurationUserActivity method.
     */
    @jakarta.annotation.Nonnull
    public DeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new DeviceConfigurationUserActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationCounts method.
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new GetOffice365ActivationCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationsUserCounts method.
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new GetOffice365ActivationsUserCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOffice365ActivationsUserDetail method.
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new GetOffice365ActivationsUserDetailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureDetails method.
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ManagedDeviceEnrollmentFailureDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentTopFailures method.
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ManagedDeviceEnrollmentTopFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter() {
        return new MonthlyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public MonthlyPrintUsageByUserRequestBuilder monthlyPrintUsageByUser() {
        return new MonthlyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security property of the microsoft.graph.reportRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Read properties and relationships of the reportRoot object.
     * @return a ReportRoot
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-reportroot-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ReportRoot get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the reportRoot object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ReportRoot
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-reportroot-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ReportRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportRoot::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getEmailActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetEmailActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityCountsWithPeriodRequestBuilder getEmailActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetEmailActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserCountsWithPeriodRequestBuilder getEmailActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetEmailActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserDetailWithDateRequestBuilder getEmailActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetEmailActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailActivityUserDetailWithPeriodRequestBuilder getEmailActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageAppsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder getEmailAppUsageAppsUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetEmailAppUsageUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserCountsWithPeriodRequestBuilder getEmailAppUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a GetEmailAppUsageUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithDateRequestBuilder getEmailAppUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailAppUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetEmailAppUsageUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithPeriodRequestBuilder getEmailAppUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageVersionsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder getEmailAppUsageVersionsUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getGroupArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param groupId Usage: groupId='{groupId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder getGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final String groupId, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(groupId);
        Objects.requireNonNull(startDateTime);
        return new GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, groupId, startDateTime);
    }
    /**
     * Provides operations to call the getM365AppPlatformUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetM365AppPlatformUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetM365AppPlatformUserCountsWithPeriodRequestBuilder getM365AppPlatformUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppPlatformUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetM365AppUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserCountsWithPeriodRequestBuilder getM365AppUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param date Usage: date={date}
     * @return a GetM365AppUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserDetailWithDateRequestBuilder getM365AppUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetM365AppUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetM365AppUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetM365AppUserDetailWithPeriodRequestBuilder getM365AppUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a GetMailboxUsageDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageDetailWithPeriodRequestBuilder getMailboxUsageDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a GetMailboxUsageMailboxCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageMailboxCountsWithPeriodRequestBuilder getMailboxUsageMailboxCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageQuotaStatusMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder getMailboxUsageQuotaStatusMailboxCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a GetMailboxUsageStorageWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMailboxUsageStorageWithPeriodRequestBuilder getMailboxUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365ActiveUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserCountsWithPeriodRequestBuilder getOffice365ActiveUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param date Usage: date={date}
     * @return a GetOffice365ActiveUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithDateRequestBuilder getOffice365ActiveUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365ActiveUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365ActiveUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithPeriodRequestBuilder getOffice365ActiveUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365GroupsActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityCountsWithPeriodRequestBuilder getOffice365GroupsActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a GetOffice365GroupsActivityDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder getOffice365GroupsActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365GroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365GroupsActivityDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithPeriodRequestBuilder getOffice365GroupsActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder getOffice365GroupsActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder getOffice365GroupsActivityGroupCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityStorage method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365GroupsActivityStorageWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityStorageWithPeriodRequestBuilder getOffice365GroupsActivityStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ServicesUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOffice365ServicesUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365ServicesUserCountsWithPeriodRequestBuilder getOffice365ServicesUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ServicesUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveActivityFileCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityFileCountsWithPeriodRequestBuilder getOneDriveActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserCountsWithPeriodRequestBuilder getOneDriveActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetOneDriveActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithDateRequestBuilder getOneDriveActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithPeriodRequestBuilder getOneDriveActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveUsageAccountCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountCountsWithPeriodRequestBuilder getOneDriveUsageAccountCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param date Usage: date={date}
     * @return a GetOneDriveUsageAccountDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithDateRequestBuilder getOneDriveUsageAccountDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveUsageAccountDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveUsageAccountDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithPeriodRequestBuilder getOneDriveUsageAccountDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveUsageFileCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageFileCountsWithPeriodRequestBuilder getOneDriveUsageFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a GetOneDriveUsageStorageWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOneDriveUsageStorageWithPeriodRequestBuilder getOneDriveUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getPrinterArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param printerId Usage: printerId='{printerId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder getPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final String printerId, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(printerId);
        Objects.requireNonNull(startDateTime);
        return new GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, printerId, startDateTime);
    }
    /**
     * Provides operations to call the getSharePointActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointActivityFileCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityFileCountsWithPeriodRequestBuilder getSharePointActivityFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityPages method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointActivityPagesWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityPagesWithPeriodRequestBuilder getSharePointActivityPagesWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityPagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserCountsWithPeriodRequestBuilder getSharePointActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetSharePointActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserDetailWithDateRequestBuilder getSharePointActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointActivityUserDetailWithPeriodRequestBuilder getSharePointActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param date Usage: date={date}
     * @return a GetSharePointSiteUsageDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithDateRequestBuilder getSharePointSiteUsageDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointSiteUsageDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointSiteUsageDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithPeriodRequestBuilder getSharePointSiteUsageDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder getSharePointSiteUsageFileCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsagePages method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointSiteUsagePagesWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsagePagesWithPeriodRequestBuilder getSharePointSiteUsagePagesWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsagePagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageSiteCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder getSharePointSiteUsageSiteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a GetSharePointSiteUsageStorageWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSharePointSiteUsageStorageWithPeriodRequestBuilder getSharePointSiteUsageStorageWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder getSkypeForBusinessActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder getSkypeForBusinessActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder getSkypeForBusinessActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a GetTeamsDeviceUsageUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithDateRequestBuilder getTeamsDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder getTeamsDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsTeamActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityCountsWithPeriodRequestBuilder getTeamsTeamActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDetail method.
     * @param date Usage: date={date}
     * @return a GetTeamsTeamActivityDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDetailWithDateRequestBuilder getTeamsTeamActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsTeamActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsTeamActivityDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDetailWithPeriodRequestBuilder getTeamsTeamActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamActivityDistributionCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder getTeamsTeamActivityDistributionCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamActivityDistributionCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsTeamCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsTeamCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsTeamCountsWithPeriodRequestBuilder getTeamsTeamCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsTeamCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsUserActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityCountsWithPeriodRequestBuilder getTeamsUserActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsUserActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserCountsWithPeriodRequestBuilder getTeamsUserActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetTeamsUserActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithDateRequestBuilder getTeamsUserActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsUserActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetTeamsUserActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithPeriodRequestBuilder getTeamsUserActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getUserArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @param userId Usage: userId='{userId}'
     * @return a GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder getUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime, @jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        Objects.requireNonNull(userId);
        return new GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime, userId);
    }
    /**
     * Provides operations to call the getYammerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityCountsWithPeriodRequestBuilder getYammerActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerActivityUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserCountsWithPeriodRequestBuilder getYammerActivityUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a GetYammerActivityUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserDetailWithDateRequestBuilder getYammerActivityUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetYammerActivityUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerActivityUserDetailWithPeriodRequestBuilder getYammerActivityUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getYammerDeviceUsageDistributionUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder getYammerDeviceUsageUserCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a GetYammerDeviceUsageUserDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithDateRequestBuilder getYammerDeviceUsageUserDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder getYammerDeviceUsageUserDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerGroupsActivityCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityCountsWithPeriodRequestBuilder getYammerGroupsActivityCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a GetYammerGroupsActivityDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithDateRequestBuilder getYammerGroupsActivityDetailWithDate(@jakarta.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerGroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a GetYammerGroupsActivityDetailWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithPeriodRequestBuilder getYammerGroupsActivityDetailWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder getYammerGroupsActivityGroupCountsWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureDetails method.
     * @param filter Usage: filter='{filter}'
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     * @return a ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder managedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipToken(@jakarta.annotation.Nonnull final String filter, @jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final String skipToken, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(filter);
        Objects.requireNonNull(skip);
        Objects.requireNonNull(skipToken);
        Objects.requireNonNull(top);
        return new ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(pathParameters, requestAdapter, filter, skip, skipToken, top);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentTopFailures method.
     * @param period Usage: period='{period}'
     * @return a ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder managedDeviceEnrollmentTopFailuresWithPeriod(@jakarta.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Update the properties of a reportRoot object.
     * @param body The request body
     * @return a ReportRoot
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-reportroot-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ReportRoot patch(@jakarta.annotation.Nonnull final ReportRoot body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a reportRoot object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ReportRoot
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-reportroot-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ReportRoot patch(@jakarta.annotation.Nonnull final ReportRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportRoot::createFromDiscriminatorValue);
    }
    /**
     * Read properties and relationships of the reportRoot object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the reportRoot object.
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
     * Update the properties of a reportRoot object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ReportRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a reportRoot object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ReportRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Read properties and relationships of the reportRoot object.
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
