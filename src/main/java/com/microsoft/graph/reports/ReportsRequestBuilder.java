package com.microsoft.graph.reports;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ReportRoot;
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
import com.microsoft.graph.reports.monthlyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder;
import com.microsoft.graph.reports.monthlyprintusagebyprinter.MonthlyPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.reports.monthlyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder;
import com.microsoft.graph.reports.monthlyprintusagebyuser.MonthlyPrintUsageByUserRequestBuilder;
import com.microsoft.graph.reports.security.SecurityRequestBuilder;
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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reportRoot singleton.
 */
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity. */
    @javax.annotation.Nonnull
    public DailyPrintUsageByPrinterRequestBuilder dailyPrintUsageByPrinter() {
        return new DailyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dailyPrintUsageByUser property of the microsoft.graph.reportRoot entity. */
    @javax.annotation.Nonnull
    public DailyPrintUsageByUserRequestBuilder dailyPrintUsageByUser() {
        return new DailyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the deviceConfigurationDeviceActivity method. */
    @javax.annotation.Nonnull
    public DeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new DeviceConfigurationDeviceActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the deviceConfigurationUserActivity method. */
    @javax.annotation.Nonnull
    public DeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new DeviceConfigurationUserActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getOffice365ActivationCounts method. */
    @javax.annotation.Nonnull
    public GetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new GetOffice365ActivationCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getOffice365ActivationsUserCounts method. */
    @javax.annotation.Nonnull
    public GetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new GetOffice365ActivationsUserCountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getOffice365ActivationsUserDetail method. */
    @javax.annotation.Nonnull
    public GetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new GetOffice365ActivationsUserDetailRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the managedDeviceEnrollmentFailureDetails method. */
    @javax.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ManagedDeviceEnrollmentFailureDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the managedDeviceEnrollmentTopFailures method. */
    @javax.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ManagedDeviceEnrollmentTopFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the monthlyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity. */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageByPrinterRequestBuilder monthlyPrintUsageByPrinter() {
        return new MonthlyPrintUsageByPrinterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the monthlyPrintUsageByUser property of the microsoft.graph.reportRoot entity. */
    @javax.annotation.Nonnull
    public MonthlyPrintUsageByUserRequestBuilder monthlyPrintUsageByUser() {
        return new MonthlyPrintUsageByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the security property of the microsoft.graph.reportRoot entity. */
    @javax.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     * @param id Unique identifier of the item
     * @return a PrintUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.reports.dailyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder dailyPrintUsageByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new com.microsoft.graph.reports.dailyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     * @param id Unique identifier of the item
     * @return a PrintUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.reports.dailyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder dailyPrintUsageByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new com.microsoft.graph.reports.dailyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get reports
     * @return a CompletableFuture of ReportRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ReportRoot> executionException = new java.util.concurrent.CompletableFuture<ReportRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ReportRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ReportRoot> executionException = new java.util.concurrent.CompletableFuture<ReportRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getEmailActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getEmailActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailActivityCountsWithPeriodRequestBuilder getEmailActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getEmailActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailActivityUserCountsWithPeriodRequestBuilder getEmailActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getEmailActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailActivityUserDetailWithDateRequestBuilder getEmailActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getEmailActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailActivityUserDetailWithPeriodRequestBuilder getEmailActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageAppsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getEmailAppUsageAppsUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder getEmailAppUsageAppsUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageAppsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getEmailAppUsageUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailAppUsageUserCountsWithPeriodRequestBuilder getEmailAppUsageUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a getEmailAppUsageUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithDateRequestBuilder getEmailAppUsageUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetEmailAppUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getEmailAppUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getEmailAppUsageUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailAppUsageUserDetailWithPeriodRequestBuilder getEmailAppUsageUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getEmailAppUsageVersionsUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder getEmailAppUsageVersionsUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetEmailAppUsageVersionsUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getGroupArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param groupId Usage: groupId='{groupId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a getGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder getGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTime(@javax.annotation.Nonnull final OffsetDateTime endDateTime, @javax.annotation.Nonnull final String groupId, @javax.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(groupId);
        Objects.requireNonNull(startDateTime);
        return new GetGroupArchivedPrintJobsWithGroupIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, groupId, startDateTime);
    }
    /**
     * Provides operations to call the getM365AppPlatformUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getM365AppPlatformUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetM365AppPlatformUserCountsWithPeriodRequestBuilder getM365AppPlatformUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppPlatformUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getM365AppUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetM365AppUserCountsWithPeriodRequestBuilder getM365AppUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param date Usage: date={date}
     * @return a getM365AppUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetM365AppUserDetailWithDateRequestBuilder getM365AppUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetM365AppUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getM365AppUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getM365AppUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetM365AppUserDetailWithPeriodRequestBuilder getM365AppUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetM365AppUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a getMailboxUsageDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetMailboxUsageDetailWithPeriodRequestBuilder getMailboxUsageDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a getMailboxUsageMailboxCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetMailboxUsageMailboxCountsWithPeriodRequestBuilder getMailboxUsageMailboxCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageQuotaStatusMailboxCounts method.
     * @param period Usage: period='{period}'
     * @return a getMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder getMailboxUsageQuotaStatusMailboxCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageQuotaStatusMailboxCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getMailboxUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a getMailboxUsageStorageWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetMailboxUsageStorageWithPeriodRequestBuilder getMailboxUsageStorageWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetMailboxUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getOffice365ActiveUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365ActiveUserCountsWithPeriodRequestBuilder getOffice365ActiveUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param date Usage: date={date}
     * @return a getOffice365ActiveUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithDateRequestBuilder getOffice365ActiveUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365ActiveUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365ActiveUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getOffice365ActiveUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365ActiveUserDetailWithPeriodRequestBuilder getOffice365ActiveUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ActiveUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getOffice365GroupsActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityCountsWithPeriodRequestBuilder getOffice365GroupsActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a getOffice365GroupsActivityDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder getOffice365GroupsActivityDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOffice365GroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a getOffice365GroupsActivityDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithPeriodRequestBuilder getOffice365GroupsActivityDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a getOffice365GroupsActivityFileCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder getOffice365GroupsActivityFileCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a getOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder getOffice365GroupsActivityGroupCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365GroupsActivityStorage method.
     * @param period Usage: period='{period}'
     * @return a getOffice365GroupsActivityStorageWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365GroupsActivityStorageWithPeriodRequestBuilder getOffice365GroupsActivityStorageWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365GroupsActivityStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOffice365ServicesUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getOffice365ServicesUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOffice365ServicesUserCountsWithPeriodRequestBuilder getOffice365ServicesUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOffice365ServicesUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveActivityFileCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveActivityFileCountsWithPeriodRequestBuilder getOneDriveActivityFileCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveActivityUserCountsWithPeriodRequestBuilder getOneDriveActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getOneDriveActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithDateRequestBuilder getOneDriveActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveActivityUserDetailWithPeriodRequestBuilder getOneDriveActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountCounts method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveUsageAccountCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveUsageAccountCountsWithPeriodRequestBuilder getOneDriveUsageAccountCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param date Usage: date={date}
     * @return a getOneDriveUsageAccountDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithDateRequestBuilder getOneDriveUsageAccountDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetOneDriveUsageAccountDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getOneDriveUsageAccountDetail method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveUsageAccountDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveUsageAccountDetailWithPeriodRequestBuilder getOneDriveUsageAccountDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageAccountDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveUsageFileCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveUsageFileCountsWithPeriodRequestBuilder getOneDriveUsageFileCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getOneDriveUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a getOneDriveUsageStorageWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOneDriveUsageStorageWithPeriodRequestBuilder getOneDriveUsageStorageWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetOneDriveUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getPrinterArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param printerId Usage: printerId='{printerId}'
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a getPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder getPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTime(@javax.annotation.Nonnull final OffsetDateTime endDateTime, @javax.annotation.Nonnull final String printerId, @javax.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(printerId);
        Objects.requireNonNull(startDateTime);
        return new GetPrinterArchivedPrintJobsWithPrinterIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, printerId, startDateTime);
    }
    /**
     * Provides operations to call the getSharePointActivityFileCounts method.
     * @param period Usage: period='{period}'
     * @return a getSharePointActivityFileCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointActivityFileCountsWithPeriodRequestBuilder getSharePointActivityFileCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityPages method.
     * @param period Usage: period='{period}'
     * @return a getSharePointActivityPagesWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointActivityPagesWithPeriodRequestBuilder getSharePointActivityPagesWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityPagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSharePointActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointActivityUserCountsWithPeriodRequestBuilder getSharePointActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getSharePointActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointActivityUserDetailWithDateRequestBuilder getSharePointActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getSharePointActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointActivityUserDetailWithPeriodRequestBuilder getSharePointActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param date Usage: date={date}
     * @return a getSharePointSiteUsageDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithDateRequestBuilder getSharePointSiteUsageDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSharePointSiteUsageDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageDetail method.
     * @param period Usage: period='{period}'
     * @return a getSharePointSiteUsageDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsageDetailWithPeriodRequestBuilder getSharePointSiteUsageDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageFileCounts method.
     * @param period Usage: period='{period}'
     * @return a getSharePointSiteUsageFileCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder getSharePointSiteUsageFileCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageFileCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsagePages method.
     * @param period Usage: period='{period}'
     * @return a getSharePointSiteUsagePagesWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsagePagesWithPeriodRequestBuilder getSharePointSiteUsagePagesWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsagePagesWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageSiteCounts method.
     * @param period Usage: period='{period}'
     * @return a getSharePointSiteUsageSiteCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder getSharePointSiteUsageSiteCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageSiteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSharePointSiteUsageStorage method.
     * @param period Usage: period='{period}'
     * @return a getSharePointSiteUsageStorageWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSharePointSiteUsageStorageWithPeriodRequestBuilder getSharePointSiteUsageStorageWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSharePointSiteUsageStorageWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder getSkypeForBusinessActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getSkypeForBusinessActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder getSkypeForBusinessActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder getSkypeForBusinessActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a getSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getSkypeForBusinessDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder getSkypeForBusinessDeviceUsageUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessOrganizerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessOrganizerActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessOrganizerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityMinuteCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessParticipantActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessParticipantActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessParticipantActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityMinuteCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityMinuteCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getSkypeForBusinessPeerToPeerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetSkypeForBusinessPeerToPeerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageDistributionUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getTeamsDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder getTeamsDeviceUsageUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a getTeamsDeviceUsageUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithDateRequestBuilder getTeamsDeviceUsageUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getTeamsDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder getTeamsDeviceUsageUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getTeamsUserActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsUserActivityCountsWithPeriodRequestBuilder getTeamsUserActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getTeamsUserActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsUserActivityUserCountsWithPeriodRequestBuilder getTeamsUserActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getTeamsUserActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithDateRequestBuilder getTeamsUserActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetTeamsUserActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getTeamsUserActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getTeamsUserActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetTeamsUserActivityUserDetailWithPeriodRequestBuilder getTeamsUserActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetTeamsUserActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getUserArchivedPrintJobs method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @param userId Usage: userId='{userId}'
     * @return a getUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder getUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTime(@javax.annotation.Nonnull final OffsetDateTime endDateTime, @javax.annotation.Nonnull final OffsetDateTime startDateTime, @javax.annotation.Nonnull final String userId) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        Objects.requireNonNull(userId);
        return new GetUserArchivedPrintJobsWithUserIdWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime, userId);
    }
    /**
     * Provides operations to call the getYammerActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerActivityCountsWithPeriodRequestBuilder getYammerActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerActivityUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerActivityUserCountsWithPeriodRequestBuilder getYammerActivityUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param date Usage: date={date}
     * @return a getYammerActivityUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerActivityUserDetailWithDateRequestBuilder getYammerActivityUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerActivityUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerActivityUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getYammerActivityUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerActivityUserDetailWithPeriodRequestBuilder getYammerActivityUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerActivityUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageDistributionUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder getYammerDeviceUsageDistributionUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageDistributionUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerDeviceUsageUserCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder getYammerDeviceUsageUserCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param date Usage: date={date}
     * @return a getYammerDeviceUsageUserDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithDateRequestBuilder getYammerDeviceUsageUserDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerDeviceUsageUserDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerDeviceUsageUserDetail method.
     * @param period Usage: period='{period}'
     * @return a getYammerDeviceUsageUserDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder getYammerDeviceUsageUserDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerDeviceUsageUserDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerGroupsActivityCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerGroupsActivityCountsWithPeriodRequestBuilder getYammerGroupsActivityCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param date Usage: date={date}
     * @return a getYammerGroupsActivityDetailWithDateRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithDateRequestBuilder getYammerGroupsActivityDetailWithDate(@javax.annotation.Nonnull final LocalDate date) {
        Objects.requireNonNull(date);
        return new GetYammerGroupsActivityDetailWithDateRequestBuilder(pathParameters, requestAdapter, date);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityDetail method.
     * @param period Usage: period='{period}'
     * @return a getYammerGroupsActivityDetailWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerGroupsActivityDetailWithPeriodRequestBuilder getYammerGroupsActivityDetailWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityDetailWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the getYammerGroupsActivityGroupCounts method.
     * @param period Usage: period='{period}'
     * @return a getYammerGroupsActivityGroupCountsWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder getYammerGroupsActivityGroupCountsWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new GetYammerGroupsActivityGroupCountsWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentFailureDetails method.
     * @param filter Usage: filter='{filter}'
     * @param skip Usage: skip={skip}
     * @param skipToken Usage: skipToken='{skipToken}'
     * @param top Usage: top={top}
     * @return a managedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder managedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipToken(@javax.annotation.Nonnull final String filter, @javax.annotation.Nonnull final Integer skip, @javax.annotation.Nonnull final String skipToken, @javax.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(filter);
        Objects.requireNonNull(skip);
        Objects.requireNonNull(skipToken);
        Objects.requireNonNull(top);
        return new ManagedDeviceEnrollmentFailureDetailsWithSkipWithTopWithFilterWithSkipTokenRequestBuilder(pathParameters, requestAdapter, filter, skip, skipToken, top);
    }
    /**
     * Provides operations to call the managedDeviceEnrollmentTopFailures method.
     * @param period Usage: period='{period}'
     * @return a managedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder managedDeviceEnrollmentTopFailuresWithPeriod(@javax.annotation.Nonnull final String period) {
        Objects.requireNonNull(period);
        return new ManagedDeviceEnrollmentTopFailuresWithPeriodRequestBuilder(pathParameters, requestAdapter, period);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     * @param id Unique identifier of the item
     * @return a PrintUsageByPrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.reports.monthlyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder monthlyPrintUsageByPrinter(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", id);
        return new com.microsoft.graph.reports.monthlyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the monthlyPrintUsageByUser property of the microsoft.graph.reportRoot entity.
     * @param id Unique identifier of the item
     * @return a PrintUsageByUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.reports.monthlyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder monthlyPrintUsageByUser(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByUser%2Did", id);
        return new com.microsoft.graph.reports.monthlyprintusagebyuser.item.PrintUsageByUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update reports
     * @param body The request body
     * @return a CompletableFuture of ReportRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> patch(@javax.annotation.Nonnull final ReportRoot body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ReportRoot> executionException = new java.util.concurrent.CompletableFuture<ReportRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ReportRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ReportRoot> patch(@javax.annotation.Nonnull final ReportRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ReportRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ReportRoot> executionException = new java.util.concurrent.CompletableFuture<ReportRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get reports
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get reports
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
     * Update reports
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ReportRoot body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final ReportRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get reports
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
