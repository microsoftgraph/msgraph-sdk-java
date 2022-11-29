package com.microsoft.graph.drive.root;

import com.microsoft.graph.drive.root.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.drive.root.checkin.CheckinRequestBuilder;
import com.microsoft.graph.drive.root.checkout.CheckoutRequestBuilder;
import com.microsoft.graph.drive.root.children.ChildrenRequestBuilder;
import com.microsoft.graph.drive.root.children.item.DriveItemItemRequestBuilder;
import com.microsoft.graph.drive.root.content.ContentRequestBuilder;
import com.microsoft.graph.drive.root.copy.CopyRequestBuilder;
import com.microsoft.graph.drive.root.createlink.CreateLinkRequestBuilder;
import com.microsoft.graph.drive.root.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.drive.root.delta.DeltaRequestBuilder;
import com.microsoft.graph.drive.root.deltawithtoken.DeltaWithTokenRequestBuilder;
import com.microsoft.graph.drive.root.follow.FollowRequestBuilder;
import com.microsoft.graph.drive.root.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.drive.root.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.drive.root.invite.InviteRequestBuilder;
import com.microsoft.graph.drive.root.listitem.ListItemRequestBuilder;
import com.microsoft.graph.drive.root.permissions.item.PermissionItemRequestBuilder;
import com.microsoft.graph.drive.root.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.drive.root.preview.PreviewRequestBuilder;
import com.microsoft.graph.drive.root.restore.RestoreRequestBuilder;
import com.microsoft.graph.drive.root.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.drive.root.subscriptions.item.SubscriptionItemRequestBuilder;
import com.microsoft.graph.drive.root.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.drive.root.thumbnails.item.ThumbnailSetItemRequestBuilder;
import com.microsoft.graph.drive.root.thumbnails.ThumbnailsRequestBuilder;
import com.microsoft.graph.drive.root.unfollow.UnfollowRequestBuilder;
import com.microsoft.graph.drive.root.validatepermission.ValidatePermissionRequestBuilder;
import com.microsoft.graph.drive.root.versions.item.DriveItemVersionItemRequestBuilder;
import com.microsoft.graph.drive.root.versions.VersionsRequestBuilder;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the root property of the microsoft.graph.drive entity. */
public class RootRequestBuilder {
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
    /** Provides operations to call the follow method. */
    @javax.annotation.Nonnull
    public FollowRequestBuilder follow() {
        return new FollowRequestBuilder(pathParameters, requestAdapter);
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
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
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
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
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
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
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
    /**
     * Provides operations to manage the children property of the microsoft.graph.driveItem entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemItemRequestBuilder children(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RootRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RootRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/drive/root{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new RootRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RootRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/drive/root{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property root for drive
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property root for drive
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final RootRequestBuilderDeleteRequestConfiguration requestConfig = new RootRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve the metadata for a driveItem in a drive by file system path or ID.`item-id` is the ID of a driveItem. It may also be the unique ID of a SharePoint list item.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the metadata for a driveItem in a drive by file system path or ID.`item-id` is the ID of a driveItem. It may also be the unique ID of a SharePoint list item.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final RootRequestBuilderGetRequestConfiguration requestConfig = new RootRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property root in drive
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property root in drive
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final RootRequestBuilderPatchRequestConfiguration requestConfig = new RootRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property root for drive
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property root for drive
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the delta method.
     * @return a deltaRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
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
     * Retrieve the metadata for a driveItem in a drive by file system path or ID.`item-id` is the ID of a driveItem. It may also be the unique ID of a SharePoint list item.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Retrieve the metadata for a driveItem in a drive by file system path or ID.`item-id` is the ID of a driveItem. It may also be the unique ID of a SharePoint list item.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get(@javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @return a getActivitiesByIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
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
     * Update the navigation property root in drive
     * @param body 
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property root in drive
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<RootRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.driveItem entity.
     * @param id Unique identifier of the item
     * @return a PermissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PermissionItemRequestBuilder permissions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permission%2Did", id);
        return new PermissionItemRequestBuilder(urlTplParams, requestAdapter);
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
     * Provides operations to manage the subscriptions property of the microsoft.graph.driveItem entity.
     * @param id Unique identifier of the item
     * @return a SubscriptionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscriptionItemRequestBuilder subscriptions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", id);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the thumbnails property of the microsoft.graph.driveItem entity.
     * @param id Unique identifier of the item
     * @return a ThumbnailSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ThumbnailSetItemRequestBuilder thumbnails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("thumbnailSet%2Did", id);
        return new ThumbnailSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.driveItem entity.
     * @param id Unique identifier of the item
     * @return a DriveItemVersionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemVersionItemRequestBuilder versions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItemVersion%2Did", id);
        return new DriveItemVersionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RootRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new rootRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RootRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Retrieve the metadata for a driveItem in a drive by file system path or ID.`item-id` is the ID of a driveItem. It may also be the unique ID of a SharePoint list item. */
    public class RootRequestBuilderGetQueryParameters {
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
    public class RootRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public RootRequestBuilderGetQueryParameters queryParameters = new RootRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new rootRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RootRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RootRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new rootRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RootRequestBuilderPatchRequestConfiguration() {
        }
    }
}
