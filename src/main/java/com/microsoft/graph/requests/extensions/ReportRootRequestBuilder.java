// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootRequest;
import com.microsoft.graph.requests.extensions.ReportRootRequest;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ServicesUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ServicesUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActiveUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityPagesRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityPagesRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageSiteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageStorageRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request Builder.
 */
public class ReportRootRequestBuilder extends BaseRequestBuilder implements IReportRootRequestBuilder {

    /**
     * The request builder for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IReportRootRequest instance
     */
    public IReportRootRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IReportRootRequest instance
     */
    public IReportRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ReportRootRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new ReportRootDeviceConfigurationUserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationUserActivity"), getClient(), null);
    }

    public IReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new ReportRootDeviceConfigurationDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationDeviceActivity"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(final Integer skip, final Integer top, final String filter, final String skipToken) {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null, skip, top, filter, skipToken);
    }

    public IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null);
    }

    public IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(final String period) {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null, period);
    }

    public IReportRootGetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new ReportRootGetOffice365ActivationsUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserDetail"), getClient(), null);
    }

    public IReportRootGetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new ReportRootGetOffice365ActivationCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationCounts"), getClient(), null);
    }

    public IReportRootGetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new ReportRootGetOffice365ActivationsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserCounts"), getClient(), null);
    }

    public IReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOffice365ActiveUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, date);
    }

    public IReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(final String period) {
        return new ReportRootGetOffice365ActiveUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, period);
    }

    public IReportRootGetOffice365ServicesUserCountsRequestBuilder getOffice365ServicesUserCounts(final String period) {
        return new ReportRootGetOffice365ServicesUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ServicesUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365ActiveUserCountsRequestBuilder getOffice365ActiveUserCounts(final String period) {
        return new ReportRootGetOffice365ActiveUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOffice365GroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, date);
    }

    public IReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(final String period) {
        return new ReportRootGetOffice365GroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityCountsRequestBuilder getOffice365GroupsActivityCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder getOffice365GroupsActivityGroupCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityGroupCounts"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityStorageRequestBuilder getOffice365GroupsActivityStorage(final String period) {
        return new ReportRootGetOffice365GroupsActivityStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityStorage"), getClient(), null, period);
    }

    public IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder getOffice365GroupsActivityFileCounts(final String period) {
        return new ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetEmailActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(final String period) {
        return new ReportRootGetEmailActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityCountsRequestBuilder getEmailActivityCounts(final String period) {
        return new ReportRootGetEmailActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailActivityUserCountsRequestBuilder getEmailActivityUserCounts(final String period) {
        return new ReportRootGetEmailActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetEmailAppUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(final String period) {
        return new ReportRootGetEmailAppUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getEmailAppUsageAppsUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageUserCountsRequestBuilder getEmailAppUsageUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getEmailAppUsageVersionsUserCounts(final String period) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageDetailRequestBuilder getMailboxUsageDetail(final String period) {
        return new ReportRootGetMailboxUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageMailboxCountsRequestBuilder getMailboxUsageMailboxCounts(final String period) {
        return new ReportRootGetMailboxUsageMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(final String period) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, period);
    }

    public IReportRootGetMailboxUsageStorageRequestBuilder getMailboxUsageStorage(final String period) {
        return new ReportRootGetMailboxUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOneDriveActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(final String period) {
        return new ReportRootGetOneDriveActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityUserCountsRequestBuilder getOneDriveActivityUserCounts(final String period) {
        return new ReportRootGetOneDriveActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveActivityFileCountsRequestBuilder getOneDriveActivityFileCounts(final String period) {
        return new ReportRootGetOneDriveActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetOneDriveUsageAccountDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, date);
    }

    public IReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(final String period) {
        return new ReportRootGetOneDriveUsageAccountDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageAccountCountsRequestBuilder getOneDriveUsageAccountCounts(final String period) {
        return new ReportRootGetOneDriveUsageAccountCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageFileCountsRequestBuilder getOneDriveUsageFileCounts(final String period) {
        return new ReportRootGetOneDriveUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, period);
    }

    public IReportRootGetOneDriveUsageStorageRequestBuilder getOneDriveUsageStorage(final String period) {
        return new ReportRootGetOneDriveUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSharePointActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(final String period) {
        return new ReportRootGetSharePointActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityFileCountsRequestBuilder getSharePointActivityFileCounts(final String period) {
        return new ReportRootGetSharePointActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityUserCountsRequestBuilder getSharePointActivityUserCounts(final String period) {
        return new ReportRootGetSharePointActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointActivityPagesRequestBuilder getSharePointActivityPages(final String period) {
        return new ReportRootGetSharePointActivityPagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSharePointSiteUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, date);
    }

    public IReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(final String period) {
        return new ReportRootGetSharePointSiteUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageFileCountsRequestBuilder getSharePointSiteUsageFileCounts(final String period) {
        return new ReportRootGetSharePointSiteUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getSharePointSiteUsageSiteCounts(final String period) {
        return new ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsageStorageRequestBuilder getSharePointSiteUsageStorage(final String period) {
        return new ReportRootGetSharePointSiteUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, period);
    }

    public IReportRootGetSharePointSiteUsagePagesRequestBuilder getSharePointSiteUsagePages(final String period) {
        return new ReportRootGetSharePointSiteUsagePagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(final String period) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityCountsRequestBuilder getSkypeForBusinessActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getSkypeForBusinessActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getSkypeForBusinessOrganizerActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getSkypeForBusinessParticipantActivityCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(final String period) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }

    public IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(final String period) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(final String period) {
        return new ReportRootGetYammerActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityCountsRequestBuilder getYammerActivityCounts(final String period) {
        return new ReportRootGetYammerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerActivityUserCountsRequestBuilder getYammerActivityUserCounts(final String period) {
        return new ReportRootGetYammerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(final String period) {
        return new ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getYammerDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerDeviceUsageUserCountsRequestBuilder getYammerDeviceUsageUserCounts(final String period) {
        return new ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetYammerGroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, date);
    }

    public IReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(final String period) {
        return new ReportRootGetYammerGroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getYammerGroupsActivityGroupCounts(final String period) {
        return new ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, period);
    }

    public IReportRootGetYammerGroupsActivityCountsRequestBuilder getYammerGroupsActivityCounts(final String period) {
        return new ReportRootGetYammerGroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetTeamsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, date);
    }

    public IReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(final String period) {
        return new ReportRootGetTeamsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityCountsRequestBuilder getTeamsUserActivityCounts(final String period) {
        return new ReportRootGetTeamsUserActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsUserActivityUserCountsRequestBuilder getTeamsUserActivityUserCounts(final String period) {
        return new ReportRootGetTeamsUserActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(final com.microsoft.graph.models.extensions.DateOnly date) {
        return new ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, date);
    }

    public IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(final String period) {
        return new ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getTeamsDeviceUsageUserCounts(final String period) {
        return new ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, period);
    }

    public IReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getTeamsDeviceUsageDistributionUserCounts(final String period) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, period);
    }
}

