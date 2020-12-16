// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.Report;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsBody;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentTopFailuresBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageAppsUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageVersionsUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageMailboxCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageStorageBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityFileCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityGroupCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityStorageBody;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ServicesUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityFileCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageFileCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageStorageBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityFileCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityPagesBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageFileCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsagePagesBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageSiteCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageStorageBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityCountsBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityDetailBody;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityGroupCountsBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request Builder.
 */
public class ReportRootRequestBuilder extends BaseRequestBuilder<ReportRoot> {

    /**
     * The request builder for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootRequest instance
     */
    @Nonnull
    public ReportRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ReportRootRequest instance
     */
    @Nonnull
    public ReportRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ReportRootRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationDeviceActivityRequestBuilder deviceConfigurationDeviceActivity() {
        return new ReportRootDeviceConfigurationDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationDeviceActivity"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootDeviceConfigurationUserActivityRequestBuilder deviceConfigurationUserActivity() {
        return new ReportRootDeviceConfigurationUserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deviceConfigurationUserActivity"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails() {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(@Nonnull final ReportRootManagedDeviceEnrollmentFailureDetailsBody parameters) {
        return new ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentFailureDetails"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures() {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(@Nonnull final ReportRootManagedDeviceEnrollmentTopFailuresBody parameters) {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityCountsRequestBuilder getEmailActivityCounts(@Nonnull final ReportRootGetEmailActivityCountsBody parameters) {
        return new ReportRootGetEmailActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserCountsRequestBuilder getEmailActivityUserCounts(@Nonnull final ReportRootGetEmailActivityUserCountsBody parameters) {
        return new ReportRootGetEmailActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(@Nonnull final ReportRootGetEmailActivityUserDetailBody parameters) {
        return new ReportRootGetEmailActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getEmailAppUsageAppsUserCounts(@Nonnull final ReportRootGetEmailAppUsageAppsUserCountsBody parameters) {
        return new ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserCountsRequestBuilder getEmailAppUsageUserCounts(@Nonnull final ReportRootGetEmailAppUsageUserCountsBody parameters) {
        return new ReportRootGetEmailAppUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(@Nonnull final ReportRootGetEmailAppUsageUserDetailBody parameters) {
        return new ReportRootGetEmailAppUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getEmailAppUsageVersionsUserCounts(@Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsBody parameters) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageDetailRequestBuilder getMailboxUsageDetail(@Nonnull final ReportRootGetMailboxUsageDetailBody parameters) {
        return new ReportRootGetMailboxUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageMailboxCountsRequestBuilder getMailboxUsageMailboxCounts(@Nonnull final ReportRootGetMailboxUsageMailboxCountsBody parameters) {
        return new ReportRootGetMailboxUsageMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(@Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsBody parameters) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageStorageRequestBuilder getMailboxUsageStorage(@Nonnull final ReportRootGetMailboxUsageStorageBody parameters) {
        return new ReportRootGetMailboxUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationCountsRequestBuilder getOffice365ActivationCounts() {
        return new ReportRootGetOffice365ActivationCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserCountsRequestBuilder getOffice365ActivationsUserCounts() {
        return new ReportRootGetOffice365ActivationsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailRequestBuilder getOffice365ActivationsUserDetail() {
        return new ReportRootGetOffice365ActivationsUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActivationsUserDetail"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ActiveUserCountsRequestBuilder getOffice365ActiveUserCounts(@Nonnull final ReportRootGetOffice365ActiveUserCountsBody parameters) {
        return new ReportRootGetOffice365ActiveUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(@Nonnull final ReportRootGetOffice365ActiveUserDetailBody parameters) {
        return new ReportRootGetOffice365ActiveUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityCountsRequestBuilder getOffice365GroupsActivityCounts(@Nonnull final ReportRootGetOffice365GroupsActivityCountsBody parameters) {
        return new ReportRootGetOffice365GroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(@Nonnull final ReportRootGetOffice365GroupsActivityDetailBody parameters) {
        return new ReportRootGetOffice365GroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder getOffice365GroupsActivityFileCounts(@Nonnull final ReportRootGetOffice365GroupsActivityFileCountsBody parameters) {
        return new ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder getOffice365GroupsActivityGroupCounts(@Nonnull final ReportRootGetOffice365GroupsActivityGroupCountsBody parameters) {
        return new ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityGroupCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityStorageRequestBuilder getOffice365GroupsActivityStorage(@Nonnull final ReportRootGetOffice365GroupsActivityStorageBody parameters) {
        return new ReportRootGetOffice365GroupsActivityStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ServicesUserCountsRequestBuilder getOffice365ServicesUserCounts(@Nonnull final ReportRootGetOffice365ServicesUserCountsBody parameters) {
        return new ReportRootGetOffice365ServicesUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ServicesUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityFileCountsRequestBuilder getOneDriveActivityFileCounts(@Nonnull final ReportRootGetOneDriveActivityFileCountsBody parameters) {
        return new ReportRootGetOneDriveActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserCountsRequestBuilder getOneDriveActivityUserCounts(@Nonnull final ReportRootGetOneDriveActivityUserCountsBody parameters) {
        return new ReportRootGetOneDriveActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(@Nonnull final ReportRootGetOneDriveActivityUserDetailBody parameters) {
        return new ReportRootGetOneDriveActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountCountsRequestBuilder getOneDriveUsageAccountCounts(@Nonnull final ReportRootGetOneDriveUsageAccountCountsBody parameters) {
        return new ReportRootGetOneDriveUsageAccountCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(@Nonnull final ReportRootGetOneDriveUsageAccountDetailBody parameters) {
        return new ReportRootGetOneDriveUsageAccountDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageFileCountsRequestBuilder getOneDriveUsageFileCounts(@Nonnull final ReportRootGetOneDriveUsageFileCountsBody parameters) {
        return new ReportRootGetOneDriveUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageStorageRequestBuilder getOneDriveUsageStorage(@Nonnull final ReportRootGetOneDriveUsageStorageBody parameters) {
        return new ReportRootGetOneDriveUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityFileCountsRequestBuilder getSharePointActivityFileCounts(@Nonnull final ReportRootGetSharePointActivityFileCountsBody parameters) {
        return new ReportRootGetSharePointActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityPagesRequestBuilder getSharePointActivityPages(@Nonnull final ReportRootGetSharePointActivityPagesBody parameters) {
        return new ReportRootGetSharePointActivityPagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserCountsRequestBuilder getSharePointActivityUserCounts(@Nonnull final ReportRootGetSharePointActivityUserCountsBody parameters) {
        return new ReportRootGetSharePointActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(@Nonnull final ReportRootGetSharePointActivityUserDetailBody parameters) {
        return new ReportRootGetSharePointActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(@Nonnull final ReportRootGetSharePointSiteUsageDetailBody parameters) {
        return new ReportRootGetSharePointSiteUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageFileCountsRequestBuilder getSharePointSiteUsageFileCounts(@Nonnull final ReportRootGetSharePointSiteUsageFileCountsBody parameters) {
        return new ReportRootGetSharePointSiteUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsagePagesRequestBuilder getSharePointSiteUsagePages(@Nonnull final ReportRootGetSharePointSiteUsagePagesBody parameters) {
        return new ReportRootGetSharePointSiteUsagePagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getSharePointSiteUsageSiteCounts(@Nonnull final ReportRootGetSharePointSiteUsageSiteCountsBody parameters) {
        return new ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageStorageRequestBuilder getSharePointSiteUsageStorage(@Nonnull final ReportRootGetSharePointSiteUsageStorageBody parameters) {
        return new ReportRootGetSharePointSiteUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityCountsRequestBuilder getSkypeForBusinessActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getSkypeForBusinessActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(@Nonnull final ReportRootGetSkypeForBusinessActivityUserDetailBody parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserDetailBody parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getSkypeForBusinessOrganizerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getSkypeForBusinessParticipantActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsBody parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getTeamsDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageDistributionUserCountsBody parameters) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getTeamsDeviceUsageUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageUserCountsBody parameters) {
        return new ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(@Nonnull final ReportRootGetTeamsDeviceUsageUserDetailBody parameters) {
        return new ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityCountsRequestBuilder getTeamsUserActivityCounts(@Nonnull final ReportRootGetTeamsUserActivityCountsBody parameters) {
        return new ReportRootGetTeamsUserActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserCountsRequestBuilder getTeamsUserActivityUserCounts(@Nonnull final ReportRootGetTeamsUserActivityUserCountsBody parameters) {
        return new ReportRootGetTeamsUserActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(@Nonnull final ReportRootGetTeamsUserActivityUserDetailBody parameters) {
        return new ReportRootGetTeamsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityCountsRequestBuilder getYammerActivityCounts(@Nonnull final ReportRootGetYammerActivityCountsBody parameters) {
        return new ReportRootGetYammerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserCountsRequestBuilder getYammerActivityUserCounts(@Nonnull final ReportRootGetYammerActivityUserCountsBody parameters) {
        return new ReportRootGetYammerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(@Nonnull final ReportRootGetYammerActivityUserDetailBody parameters) {
        return new ReportRootGetYammerActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getYammerDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageDistributionUserCountsBody parameters) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsRequestBuilder getYammerDeviceUsageUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageUserCountsBody parameters) {
        return new ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(@Nonnull final ReportRootGetYammerDeviceUsageUserDetailBody parameters) {
        return new ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityCountsRequestBuilder getYammerGroupsActivityCounts(@Nonnull final ReportRootGetYammerGroupsActivityCountsBody parameters) {
        return new ReportRootGetYammerGroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(@Nonnull final ReportRootGetYammerGroupsActivityDetailBody parameters) {
        return new ReportRootGetYammerGroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getYammerGroupsActivityGroupCounts(@Nonnull final ReportRootGetYammerGroupsActivityGroupCountsBody parameters) {
        return new ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, parameters);
    }
}
