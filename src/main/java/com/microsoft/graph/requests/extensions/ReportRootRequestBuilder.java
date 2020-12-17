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
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootManagedDeviceEnrollmentTopFailuresParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageAppsUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetEmailAppUsageVersionsUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageMailboxCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetMailboxUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ActiveUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365GroupsActivityStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOffice365ServicesUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageAccountDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetOneDriveUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityPagesParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageFileCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsagePagesParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageSiteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageStorageParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsUserActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerActivityUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityCountsParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityDetailParameterSet;
import com.microsoft.graph.models.extensions.ReportRootGetYammerGroupsActivityGroupCountsParameterSet;

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
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder managedDeviceEnrollmentFailureDetails(@Nonnull final ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet parameters) {
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
    public ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder managedDeviceEnrollmentTopFailures(@Nonnull final ReportRootManagedDeviceEnrollmentTopFailuresParameterSet parameters) {
        return new ReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.managedDeviceEnrollmentTopFailures"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityCountsRequestBuilder getEmailActivityCounts(@Nonnull final ReportRootGetEmailActivityCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserCountsRequestBuilder getEmailActivityUserCounts(@Nonnull final ReportRootGetEmailActivityUserCountsParameterSet parameters) {
        return new ReportRootGetEmailActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailActivityUserDetailRequestBuilder getEmailActivityUserDetail(@Nonnull final ReportRootGetEmailActivityUserDetailParameterSet parameters) {
        return new ReportRootGetEmailActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getEmailAppUsageAppsUserCounts(@Nonnull final ReportRootGetEmailAppUsageAppsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageAppsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserCountsRequestBuilder getEmailAppUsageUserCounts(@Nonnull final ReportRootGetEmailAppUsageUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageUserDetailRequestBuilder getEmailAppUsageUserDetail(@Nonnull final ReportRootGetEmailAppUsageUserDetailParameterSet parameters) {
        return new ReportRootGetEmailAppUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getEmailAppUsageVersionsUserCounts(@Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsParameterSet parameters) {
        return new ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEmailAppUsageVersionsUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageDetailRequestBuilder getMailboxUsageDetail(@Nonnull final ReportRootGetMailboxUsageDetailParameterSet parameters) {
        return new ReportRootGetMailboxUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageMailboxCountsRequestBuilder getMailboxUsageMailboxCounts(@Nonnull final ReportRootGetMailboxUsageMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getMailboxUsageQuotaStatusMailboxCounts(@Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet parameters) {
        return new ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailboxUsageQuotaStatusMailboxCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetMailboxUsageStorageRequestBuilder getMailboxUsageStorage(@Nonnull final ReportRootGetMailboxUsageStorageParameterSet parameters) {
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
    public ReportRootGetOffice365ActiveUserCountsRequestBuilder getOffice365ActiveUserCounts(@Nonnull final ReportRootGetOffice365ActiveUserCountsParameterSet parameters) {
        return new ReportRootGetOffice365ActiveUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ActiveUserDetailRequestBuilder getOffice365ActiveUserDetail(@Nonnull final ReportRootGetOffice365ActiveUserDetailParameterSet parameters) {
        return new ReportRootGetOffice365ActiveUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ActiveUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityCountsRequestBuilder getOffice365GroupsActivityCounts(@Nonnull final ReportRootGetOffice365GroupsActivityCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityDetailRequestBuilder getOffice365GroupsActivityDetail(@Nonnull final ReportRootGetOffice365GroupsActivityDetailParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder getOffice365GroupsActivityFileCounts(@Nonnull final ReportRootGetOffice365GroupsActivityFileCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder getOffice365GroupsActivityGroupCounts(@Nonnull final ReportRootGetOffice365GroupsActivityGroupCountsParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityGroupCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityStorageRequestBuilder getOffice365GroupsActivityStorage(@Nonnull final ReportRootGetOffice365GroupsActivityStorageParameterSet parameters) {
        return new ReportRootGetOffice365GroupsActivityStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365GroupsActivityStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOffice365ServicesUserCountsRequestBuilder getOffice365ServicesUserCounts(@Nonnull final ReportRootGetOffice365ServicesUserCountsParameterSet parameters) {
        return new ReportRootGetOffice365ServicesUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOffice365ServicesUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityFileCountsRequestBuilder getOneDriveActivityFileCounts(@Nonnull final ReportRootGetOneDriveActivityFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserCountsRequestBuilder getOneDriveActivityUserCounts(@Nonnull final ReportRootGetOneDriveActivityUserCountsParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveActivityUserDetailRequestBuilder getOneDriveActivityUserDetail(@Nonnull final ReportRootGetOneDriveActivityUserDetailParameterSet parameters) {
        return new ReportRootGetOneDriveActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountCountsRequestBuilder getOneDriveUsageAccountCounts(@Nonnull final ReportRootGetOneDriveUsageAccountCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageAccountDetailRequestBuilder getOneDriveUsageAccountDetail(@Nonnull final ReportRootGetOneDriveUsageAccountDetailParameterSet parameters) {
        return new ReportRootGetOneDriveUsageAccountDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageAccountDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageFileCountsRequestBuilder getOneDriveUsageFileCounts(@Nonnull final ReportRootGetOneDriveUsageFileCountsParameterSet parameters) {
        return new ReportRootGetOneDriveUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetOneDriveUsageStorageRequestBuilder getOneDriveUsageStorage(@Nonnull final ReportRootGetOneDriveUsageStorageParameterSet parameters) {
        return new ReportRootGetOneDriveUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOneDriveUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityFileCountsRequestBuilder getSharePointActivityFileCounts(@Nonnull final ReportRootGetSharePointActivityFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityPagesRequestBuilder getSharePointActivityPages(@Nonnull final ReportRootGetSharePointActivityPagesParameterSet parameters) {
        return new ReportRootGetSharePointActivityPagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityPages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserCountsRequestBuilder getSharePointActivityUserCounts(@Nonnull final ReportRootGetSharePointActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointActivityUserDetailRequestBuilder getSharePointActivityUserDetail(@Nonnull final ReportRootGetSharePointActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSharePointActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequestBuilder getSharePointSiteUsageDetail(@Nonnull final ReportRootGetSharePointSiteUsageDetailParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageFileCountsRequestBuilder getSharePointSiteUsageFileCounts(@Nonnull final ReportRootGetSharePointSiteUsageFileCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageFileCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageFileCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsagePagesRequestBuilder getSharePointSiteUsagePages(@Nonnull final ReportRootGetSharePointSiteUsagePagesParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsagePagesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsagePages"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getSharePointSiteUsageSiteCounts(@Nonnull final ReportRootGetSharePointSiteUsageSiteCountsParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageSiteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageSiteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageStorageRequestBuilder getSharePointSiteUsageStorage(@Nonnull final ReportRootGetSharePointSiteUsageStorageParameterSet parameters) {
        return new ReportRootGetSharePointSiteUsageStorageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSharePointSiteUsageStorage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityCountsRequestBuilder getSkypeForBusinessActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getSkypeForBusinessActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getSkypeForBusinessActivityUserDetail(@Nonnull final ReportRootGetSkypeForBusinessActivityUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getSkypeForBusinessDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getSkypeForBusinessDeviceUsageUserCounts(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getSkypeForBusinessDeviceUsageUserDetail(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getSkypeForBusinessOrganizerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getSkypeForBusinessOrganizerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getSkypeForBusinessOrganizerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessOrganizerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getSkypeForBusinessParticipantActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getSkypeForBusinessParticipantActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getSkypeForBusinessParticipantActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessParticipantActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityMinuteCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityMinuteCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getSkypeForBusinessPeerToPeerActivityUserCounts(@Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSkypeForBusinessPeerToPeerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getTeamsDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getTeamsDeviceUsageUserCounts(@Nonnull final ReportRootGetTeamsDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getTeamsDeviceUsageUserDetail(@Nonnull final ReportRootGetTeamsDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityCountsRequestBuilder getTeamsUserActivityCounts(@Nonnull final ReportRootGetTeamsUserActivityCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserCountsRequestBuilder getTeamsUserActivityUserCounts(@Nonnull final ReportRootGetTeamsUserActivityUserCountsParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetTeamsUserActivityUserDetailRequestBuilder getTeamsUserActivityUserDetail(@Nonnull final ReportRootGetTeamsUserActivityUserDetailParameterSet parameters) {
        return new ReportRootGetTeamsUserActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTeamsUserActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityCountsRequestBuilder getYammerActivityCounts(@Nonnull final ReportRootGetYammerActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserCountsRequestBuilder getYammerActivityUserCounts(@Nonnull final ReportRootGetYammerActivityUserCountsParameterSet parameters) {
        return new ReportRootGetYammerActivityUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerActivityUserDetailRequestBuilder getYammerActivityUserDetail(@Nonnull final ReportRootGetYammerActivityUserDetailParameterSet parameters) {
        return new ReportRootGetYammerActivityUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerActivityUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getYammerDeviceUsageDistributionUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageDistributionUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageDistributionUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsRequestBuilder getYammerDeviceUsageUserCounts(@Nonnull final ReportRootGetYammerDeviceUsageUserCountsParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserDetailRequestBuilder getYammerDeviceUsageUserDetail(@Nonnull final ReportRootGetYammerDeviceUsageUserDetailParameterSet parameters) {
        return new ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerDeviceUsageUserDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityCountsRequestBuilder getYammerGroupsActivityCounts(@Nonnull final ReportRootGetYammerGroupsActivityCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityCounts"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityDetailRequestBuilder getYammerGroupsActivityDetail(@Nonnull final ReportRootGetYammerGroupsActivityDetailParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityDetailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityDetail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getYammerGroupsActivityGroupCounts(@Nonnull final ReportRootGetYammerGroupsActivityGroupCountsParameterSet parameters) {
        return new ReportRootGetYammerGroupsActivityGroupCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getYammerGroupsActivityGroupCounts"), getClient(), null, parameters);
    }
}
