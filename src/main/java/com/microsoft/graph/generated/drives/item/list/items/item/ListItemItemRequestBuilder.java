package com.microsoft.graph.drives.item.list.items.item;

import com.microsoft.graph.drives.item.list.items.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.createlink.CreateLinkRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.documentsetversions.DocumentSetVersionsRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.driveitem.DriveItemRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.fields.FieldsRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.drives.item.list.items.item.versions.VersionsRequestBuilder;
import com.microsoft.graph.models.ListItem;
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
 * Provides operations to manage the items property of the microsoft.graph.list entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListItemItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the analytics property of the microsoft.graph.listItem entity.
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the documentSetVersions property of the microsoft.graph.listItem entity.
     * @return a {@link DocumentSetVersionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DocumentSetVersionsRequestBuilder documentSetVersions() {
        return new DocumentSetVersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the driveItem property of the microsoft.graph.listItem entity.
     * @return a {@link DriveItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveItemRequestBuilder driveItem() {
        return new DriveItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the fields property of the microsoft.graph.listItem entity.
     * @return a {@link FieldsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FieldsRequestBuilder fields() {
        return new FieldsRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link LastModifiedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.listItem entity.
     * @return a {@link VersionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ListItemItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListItemItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/list/items/{listItem%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ListItemItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListItemItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/list/items/{listItem%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Removes an item from a [list][].
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Removes an item from a [list][].
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Returns the metadata for an [item][] in a [list][].
     * @return a {@link ListItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ListItem get() {
        return get(null);
    }
    /**
     * Returns the metadata for an [item][] in a [list][].
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ListItem get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ListItem::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
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
     * @return a {@link ListItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListItem patch(@jakarta.annotation.Nonnull final ListItem body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListItem patch(@jakarta.annotation.Nonnull final ListItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ListItem::createFromDiscriminatorValue);
    }
    /**
     * Removes an item from a [list][].
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Removes an item from a [list][].
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/drives/{drive%2Did}/list/items/{listItem%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns the metadata for an [item][] in a [list][].
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the metadata for an [item][] in a [list][].
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
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ListItem body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property items in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ListItem body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/drives/{drive%2Did}/list/items/{listItem%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ListItemItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ListItemItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ListItemItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Returns the metadata for an [item][] in a [list][].
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
