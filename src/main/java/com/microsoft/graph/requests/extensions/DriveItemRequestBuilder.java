// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemRequest;
import com.microsoft.graph.requests.extensions.DriveItemRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCheckinRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCheckinRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCheckoutRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCheckoutRequestBuilder;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.requests.extensions.IDriveItemCopyRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCopyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCreateLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCreateLinkRequestBuilder;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCreateUploadSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemFollowRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemFollowRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemUnfollowRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemUnfollowRequestBuilder;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.requests.extensions.IDriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemPreviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemPreviewRequestBuilder;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.requests.extensions.IDriveItemRestoreRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRestoreRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemValidatePermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemValidatePermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Request Builder.
 */
public class DriveItemRequestBuilder extends BaseRequestBuilder implements IDriveItemRequestBuilder {

    /**
     * The request builder for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDriveItemRequest instance
     */
    public IDriveItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemRequest instance
     */
    public IDriveItemRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DriveItemRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Override
    public IDriveItemRequestBuilder itemWithPath(final String path) {
        return new DriveItemRequestBuilder(getRequestUrl() + ":/" + path + ":", getClient(), null);
    }


    /**
     * Gets the request builder for Workbook
     *
     * @return the IWorkbookRequestBuilder instance
     */
    public IWorkbookRequestBuilder workbook() {
        return new WorkbookRequestBuilder(getRequestUrlWithAdditionalSegment("workbook"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    public IItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    public IDriveItemCollectionRequestBuilder children() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("children"), getClient(), null);
    }

    public IDriveItemRequestBuilder children(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("children") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    public IListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("listItem"), getClient(), null);
    }
    public IPermissionCollectionRequestBuilder permissions() {
        return new PermissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions"), getClient(), null);
    }

    public IPermissionRequestBuilder permissions(final String id) {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions") + "/" + id, getClient(), null);
    }
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions"), getClient(), null);
    }

    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions") + "/" + id, getClient(), null);
    }
    public IThumbnailSetCollectionRequestBuilder thumbnails() {
        return new ThumbnailSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails"), getClient(), null);
    }

    public IThumbnailSetRequestBuilder thumbnails(final String id) {
        return new ThumbnailSetRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails") + "/" + id, getClient(), null);
    }
    public IDriveItemVersionCollectionRequestBuilder versions() {
        return new DriveItemVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("versions"), getClient(), null);
    }

    public IDriveItemVersionRequestBuilder versions(final String id) {
        return new DriveItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("versions") + "/" + id, getClient(), null);
    }

    public IDriveItemStreamRequestBuilder content() {
        return new DriveItemStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public IDriveItemCheckinRequestBuilder checkin(final String checkInAs, final String comment) {
        return new DriveItemCheckinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkin"), getClient(), null, checkInAs, comment);
    }

    public IDriveItemCheckoutRequestBuilder checkout() {
        return new DriveItemCheckoutRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkout"), getClient(), null);
    }

    public IDriveItemCopyRequestBuilder copy(final String name, final ItemReference parentReference) {
        return new DriveItemCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, name, parentReference);
    }

    public IDriveItemCreateLinkRequestBuilder createLink(final String type, final String scope, final java.util.Calendar expirationDateTime, final String password, final String message) {
        return new DriveItemCreateLinkRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createLink"), getClient(), null, type, scope, expirationDateTime, password, message);
    }

    public IDriveItemCreateUploadSessionRequestBuilder createUploadSession(final DriveItemUploadableProperties item, final Boolean deferCommit) {
        return new DriveItemCreateUploadSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createUploadSession"), getClient(), null, item, deferCommit);
    }

    public IDriveItemFollowRequestBuilder follow() {
        return new DriveItemFollowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.follow"), getClient(), null);
    }

    public IDriveItemUnfollowRequestBuilder unfollow() {
        return new DriveItemUnfollowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unfollow"), getClient(), null);
    }

    public IDriveItemInviteCollectionRequestBuilder invite(final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients, final String expirationDateTime, final String password) {
        return new DriveItemInviteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.invite"), getClient(), null, requireSignIn, roles, sendInvitation, message, recipients, expirationDateTime, password);
    }

    public IDriveItemPreviewRequestBuilder preview(final String page, final Double zoom) {
        return new DriveItemPreviewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.preview"), getClient(), null, page, zoom);
    }

    public IDriveItemRestoreRequestBuilder restore(final ItemReference parentReference, final String name) {
        return new DriveItemRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null, parentReference, name);
    }

    public IDriveItemValidatePermissionRequestBuilder validatePermission(final String challengeToken, final String password) {
        return new DriveItemValidatePermissionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validatePermission"), getClient(), null, challengeToken, password);
    }

    public IDriveItemDeltaCollectionRequestBuilder delta(final String token) {
        return new DriveItemDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null, token);
    }

    public IDriveItemDeltaCollectionRequestBuilder delta() {
        return new DriveItemDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    public IDriveItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new DriveItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    public IDriveItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval) {
        return new DriveItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, startDateTime, endDateTime, interval);
    }

    public IDriveItemSearchCollectionRequestBuilder search(final String q) {
        return new DriveItemSearchCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.search"), getClient(), null, q);
    }
}

