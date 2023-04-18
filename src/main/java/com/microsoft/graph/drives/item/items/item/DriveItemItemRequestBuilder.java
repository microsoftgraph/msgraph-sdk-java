package com.microsoft.graph.drives.item.items.item;

import com.microsoft.graph.drives.item.items.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.checkin.CheckinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.checkout.CheckoutRequestBuilder;
import com.microsoft.graph.drives.item.items.item.children.ChildrenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.content.ContentRequestBuilder;
import com.microsoft.graph.drives.item.items.item.copy.CopyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.createlink.CreateLinkRequestBuilder;
import com.microsoft.graph.drives.item.items.item.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.delta.DeltaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.deltawithtoken.DeltaWithTokenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.follow.FollowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.invite.InviteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.listitem.ListItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.preview.PreviewRequestBuilder;
import com.microsoft.graph.drives.item.items.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.drives.item.items.item.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.drives.item.items.item.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.thumbnails.ThumbnailsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.unfollow.UnfollowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.validatepermission.ValidatePermissionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.versions.VersionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.WorkbookRequestBuilder;
import com.microsoft.graph.models.DriveItem;
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
 * Provides operations to manage the items property of the microsoft.graph.drive entity.
 */
public class DriveItemItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the analytics property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkin method. */
    @javax.annotation.Nonnull
    public CheckinRequestBuilder checkin() {
        return new CheckinRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkout method. */
    @javax.annotation.Nonnull
    public CheckoutRequestBuilder checkout() {
        return new CheckoutRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the children property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public ChildrenRequestBuilder children() {
        return new ChildrenRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the drive entity. */
    @javax.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the copy method. */
    @javax.annotation.Nonnull
    public CopyRequestBuilder copy() {
        return new CopyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createLink method. */
    @javax.annotation.Nonnull
    public CreateLinkRequestBuilder createLink() {
        return new CreateLinkRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createUploadSession method. */
    @javax.annotation.Nonnull
    public CreateUploadSessionRequestBuilder createUploadSession() {
        return new CreateUploadSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the delta method. */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the follow method. */
    @javax.annotation.Nonnull
    public FollowRequestBuilder follow() {
        return new FollowRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getActivitiesByInterval method. */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the invite method. */
    @javax.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the listItem property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public ListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the permissions property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the preview method. */
    @javax.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the subscriptions property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the thumbnails property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public ThumbnailsRequestBuilder thumbnails() {
        return new ThumbnailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unfollow method. */
    @javax.annotation.Nonnull
    public UnfollowRequestBuilder unfollow() {
        return new UnfollowRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the validatePermission method. */
    @javax.annotation.Nonnull
    public ValidatePermissionRequestBuilder validatePermission() {
        return new ValidatePermissionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the versions property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the workbook property of the microsoft.graph.driveItem entity. */
    @javax.annotation.Nonnull
    public WorkbookRequestBuilder workbook() {
        return new WorkbookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DriveItemItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DriveItemItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property items for drives
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property items for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the delta method.
     * @param token Usage: token='{token}'
     * @return a deltaWithTokenRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeltaWithTokenRequestBuilder deltaWithToken(@javax.annotation.Nonnull final String token) {
        Objects.requireNonNull(token);
        return new DeltaWithTokenRequestBuilder(pathParameters, requestAdapter, token);
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DriveItem> executionException = new java.util.concurrent.CompletableFuture<DriveItem>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DriveItem> executionException = new java.util.concurrent.CompletableFuture<DriveItem>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
     * @return a getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String interval, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DriveItem> executionException = new java.util.concurrent.CompletableFuture<DriveItem>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DriveItem> executionException = new java.util.concurrent.CompletableFuture<DriveItem>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the search method.
     * @param q Usage: q='{q}'
     * @return a searchWithQRequestBuilder
     */
    @javax.annotation.Nonnull
    public SearchWithQRequestBuilder searchWithQ(@javax.annotation.Nonnull final String q) {
        Objects.requireNonNull(q);
        return new SearchWithQRequestBuilder(pathParameters, requestAdapter, q);
    }
    /**
     * Delete navigation property items for drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property items for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
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
     * Update the navigation property items in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
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
