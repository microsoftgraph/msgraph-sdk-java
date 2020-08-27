// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootRequest;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ServicesUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityPagesRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageSiteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Request Builder.
 */
public interface IReportRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IReportRootRequest instance
     */
    IReportRootRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IReportRootRequest instance
     */
    IReportRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity();
    IReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity();
    IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails();
    IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(final Integer skip, final Integer top, final String filter, final String skipToken);
    IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures();
    IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(final String period);
    IReportRootGetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail();
    IReportRootGetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts();
    IReportRootGetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts();
    IReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(final String period);
    IReportRootGetOffice365ServicesUserCountsRequestBuilder getOffice365ServicesUserCounts(final String period);
    IReportRootGetOffice365ActiveUserCountsRequestBuilder getOffice365ActiveUserCounts(final String period);
    IReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(final String period);
    IReportRootGetOffice365GroupsActivityCountsRequestBuilder getOffice365GroupsActivityCounts(final String period);
    IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder getOffice365GroupsActivityGroupCounts(final String period);
    IReportRootGetOffice365GroupsActivityStorageRequestBuilder getOffice365GroupsActivityStorage(final String period);
    IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder getOffice365GroupsActivityFileCounts(final String period);
    IReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(final String period);
    IReportRootGetEmailActivityCountsRequestBuilder getEmailActivityCounts(final String period);
    IReportRootGetEmailActivityUserCountsRequestBuilder getEmailActivityUserCounts(final String period);
    IReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(final String period);
    IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getEmailAppUsageAppsUserCounts(final String period);
    IReportRootGetEmailAppUsageUserCountsRequestBuilder getEmailAppUsageUserCounts(final String period);
    IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getEmailAppUsageVersionsUserCounts(final String period);
    IReportRootGetMailboxUsageDetailRequestBuilder getMailboxUsageDetail(final String period);
    IReportRootGetMailboxUsageMailboxCountsRequestBuilder getMailboxUsageMailboxCounts(final String period);
    IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(final String period);
    IReportRootGetMailboxUsageStorageRequestBuilder getMailboxUsageStorage(final String period);
    IReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(final String period);
    IReportRootGetOneDriveActivityUserCountsRequestBuilder getOneDriveActivityUserCounts(final String period);
    IReportRootGetOneDriveActivityFileCountsRequestBuilder getOneDriveActivityFileCounts(final String period);
    IReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(final String period);
    IReportRootGetOneDriveUsageAccountCountsRequestBuilder getOneDriveUsageAccountCounts(final String period);
    IReportRootGetOneDriveUsageFileCountsRequestBuilder getOneDriveUsageFileCounts(final String period);
    IReportRootGetOneDriveUsageStorageRequestBuilder getOneDriveUsageStorage(final String period);
    IReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(final String period);
    IReportRootGetSharePointActivityFileCountsRequestBuilder getSharePointActivityFileCounts(final String period);
    IReportRootGetSharePointActivityUserCountsRequestBuilder getSharePointActivityUserCounts(final String period);
    IReportRootGetSharePointActivityPagesRequestBuilder getSharePointActivityPages(final String period);
    IReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(final String period);
    IReportRootGetSharePointSiteUsageFileCountsRequestBuilder getSharePointSiteUsageFileCounts(final String period);
    IReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getSharePointSiteUsageSiteCounts(final String period);
    IReportRootGetSharePointSiteUsageStorageRequestBuilder getSharePointSiteUsageStorage(final String period);
    IReportRootGetSharePointSiteUsagePagesRequestBuilder getSharePointSiteUsagePages(final String period);
    IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(final String period);
    IReportRootGetSkypeForBusinessActivityCountsRequestBuilder getSkypeForBusinessActivityCounts(final String period);
    IReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getSkypeForBusinessActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getSkypeForBusinessOrganizerActivityCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getSkypeForBusinessParticipantActivityCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(final String period);
    IReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(final String period);
    IReportRootGetYammerActivityCountsRequestBuilder getYammerActivityCounts(final String period);
    IReportRootGetYammerActivityUserCountsRequestBuilder getYammerActivityUserCounts(final String period);
    IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(final String period);
    IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getYammerDeviceUsageDistributionUserCounts(final String period);
    IReportRootGetYammerDeviceUsageUserCountsRequestBuilder getYammerDeviceUsageUserCounts(final String period);
    IReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(final String period);
    IReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getYammerGroupsActivityGroupCounts(final String period);
    IReportRootGetYammerGroupsActivityCountsRequestBuilder getYammerGroupsActivityCounts(final String period);
    IReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(final String period);
    IReportRootGetTeamsUserActivityCountsRequestBuilder getTeamsUserActivityCounts(final String period);
    IReportRootGetTeamsUserActivityUserCountsRequestBuilder getTeamsUserActivityUserCounts(final String period);
    IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date);
    IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(final String period);
    IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getTeamsDeviceUsageUserCounts(final String period);
    IReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getTeamsDeviceUsageDistributionUserCounts(final String period);

}
