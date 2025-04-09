package com.microsoft.graph.drives.item.items.item;

import com.microsoft.graph.drives.item.items.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.assignsensitivitylabel.AssignSensitivityLabelRequestBuilder;
import com.microsoft.graph.drives.item.items.item.checkin.CheckinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.checkout.CheckoutRequestBuilder;
import com.microsoft.graph.drives.item.items.item.children.ChildrenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.content.ContentRequestBuilder;
import com.microsoft.graph.drives.item.items.item.copy.CopyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.drives.item.items.item.createlink.CreateLinkRequestBuilder;
import com.microsoft.graph.drives.item.items.item.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.delta.DeltaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.deltawithtoken.DeltaWithTokenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.discardcheckout.DiscardCheckoutRequestBuilder;
import com.microsoft.graph.drives.item.items.item.extractsensitivitylabels.ExtractSensitivityLabelsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.follow.FollowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.invite.InviteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.drives.item.items.item.listitem.ListItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.permanentdelete.PermanentDeleteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.preview.PreviewRequestBuilder;
import com.microsoft.graph.drives.item.items.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.drives.item.items.item.retentionlabel.RetentionLabelRequestBuilder;
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
 * Provides operations to manage the items property of the microsoft.graph.drive entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveItemItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the analytics property of the microsoft.graph.driveItem entity.
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignSensitivityLabel method.
     * @return a {@link AssignSensitivityLabelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignSensitivityLabelRequestBuilder assignSensitivityLabel() {
        return new AssignSensitivityLabelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkin method.
     * @return a {@link CheckinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckinRequestBuilder checkin() {
        return new CheckinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkout method.
     * @return a {@link CheckoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckoutRequestBuilder checkout() {
        return new CheckoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the children property of the microsoft.graph.driveItem entity.
     * @return a {@link ChildrenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChildrenRequestBuilder children() {
        return new ChildrenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the drive entity.
     * @return a {@link ContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copy method.
     * @return a {@link CopyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CopyRequestBuilder copy() {
        return new CopyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link CreatedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createLink method.
     * @return a {@link CreateLinkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateLinkRequestBuilder createLink() {
        return new CreateLinkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createUploadSession method.
     * @return a {@link CreateUploadSessionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateUploadSessionRequestBuilder createUploadSession() {
        return new CreateUploadSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the discardCheckout method.
     * @return a {@link DiscardCheckoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DiscardCheckoutRequestBuilder discardCheckout() {
        return new DiscardCheckoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the extractSensitivityLabels method.
     * @return a {@link ExtractSensitivityLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtractSensitivityLabelsRequestBuilder extractSensitivityLabels() {
        return new ExtractSensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the follow method.
     * @return a {@link FollowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FollowRequestBuilder follow() {
        return new FollowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @return a {@link GetActivitiesByIntervalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the invite method.
     * @return a {@link InviteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link LastModifiedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the listItem property of the microsoft.graph.driveItem entity.
     * @return a {@link ListItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permanentDelete method.
     * @return a {@link PermanentDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermanentDeleteRequestBuilder permanentDelete() {
        return new PermanentDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.driveItem entity.
     * @return a {@link PermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the preview method.
     * @return a {@link PreviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the retentionLabel property of the microsoft.graph.driveItem entity.
     * @return a {@link RetentionLabelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetentionLabelRequestBuilder retentionLabel() {
        return new RetentionLabelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subscriptions property of the microsoft.graph.driveItem entity.
     * @return a {@link SubscriptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the thumbnails property of the microsoft.graph.driveItem entity.
     * @return a {@link ThumbnailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThumbnailsRequestBuilder thumbnails() {
        return new ThumbnailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unfollow method.
     * @return a {@link UnfollowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnfollowRequestBuilder unfollow() {
        return new UnfollowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validatePermission method.
     * @return a {@link ValidatePermissionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidatePermissionRequestBuilder validatePermission() {
        return new ValidatePermissionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.driveItem entity.
     * @return a {@link VersionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workbook property of the microsoft.graph.driveItem entity.
     * @return a {@link WorkbookRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkbookRequestBuilder workbook() {
        return new WorkbookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DriveItemItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveItemItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DriveItemItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveItemItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property items for drives
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property items for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Provides operations to call the delta method.
     * @param token Usage: token=&apos;{token}&apos;
     * @return a {@link DeltaWithTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaWithTokenRequestBuilder deltaWithToken(@jakarta.annotation.Nonnull final String token) {
        Objects.requireNonNull(token);
        return new DeltaWithTokenRequestBuilder(pathParameters, requestAdapter, token);
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DriveItem get() {
        return get(null);
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DriveItem get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DriveItem::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime=&apos;{endDateTime}&apos;
     * @param interval Usage: interval=&apos;{interval}&apos;
     * @param startDateTime Usage: startDateTime=&apos;{startDateTime}&apos;
     * @return a {@link GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@jakarta.annotation.Nonnull final String endDateTime, @jakarta.annotation.Nonnull final String interval, @jakarta.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DriveItem patch(@jakarta.annotation.Nonnull final DriveItem body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DriveItem patch(@jakarta.annotation.Nonnull final DriveItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DriveItem::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the search method.
     * @param q Usage: q=&apos;{q}&apos;
     * @return a {@link SearchWithQRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchWithQRequestBuilder searchWithQ(@jakarta.annotation.Nonnull final String q) {
        Objects.requireNonNull(q);
        return new SearchWithQRequestBuilder(pathParameters, requestAdapter, q);
    }
    /**
     * Delete navigation property items for drives
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property items for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DriveItem body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DriveItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DriveItemItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveItemItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DriveItemItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * All items contained in the drive. Read-only. Nullable.
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
         * @return a {@link Map<String, Object>}
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
