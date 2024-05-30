package com.microsoft.graph.storage.filestorage.containers.item.drive;

import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.storage.filestorage.containers.item.drive.bundles.BundlesRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.following.FollowingRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.ItemsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.list.ListRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.recent.RecentRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.root.RootRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.sharedwithme.SharedWithMeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.special.SpecialRequestBuilder;
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
 * Provides operations to manage the drive property of the microsoft.graph.fileStorageContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the bundles property of the microsoft.graph.drive entity.
     * @return a {@link BundlesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BundlesRequestBuilder bundles() {
        return new BundlesRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the following property of the microsoft.graph.drive entity.
     * @return a {@link FollowingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FollowingRequestBuilder following() {
        return new FollowingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.drive entity.
     * @return a {@link ItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the list property of the microsoft.graph.drive entity.
     * @return a {@link ListRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ListRequestBuilder list() {
        return new ListRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recent method.
     * @return a {@link RecentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecentRequestBuilder recent() {
        return new RecentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the root property of the microsoft.graph.drive entity.
     * @return a {@link RootRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RootRequestBuilder root() {
        return new RootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sharedWithMe method.
     * @return a {@link SharedWithMeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharedWithMeRequestBuilder sharedWithMe() {
        return new SharedWithMeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the special property of the microsoft.graph.drive entity.
     * @return a {@link SpecialRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SpecialRequestBuilder special() {
        return new SpecialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DriveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DriveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property drive for storage
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property drive for storage
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
     * The drive of the resource fileStorageContainer. Read-only.
     * @return a {@link Drive}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Drive get() {
        return get(null);
    }
    /**
     * The drive of the resource fileStorageContainer. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Drive}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Drive get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Drive::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property drive in storage
     * @param body The request body
     * @return a {@link Drive}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Drive patch(@jakarta.annotation.Nonnull final Drive body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property drive in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Drive}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Drive patch(@jakarta.annotation.Nonnull final Drive body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Drive::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the search method.
     * @param q Usage: q='{q}'
     * @return a {@link SearchWithQRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchWithQRequestBuilder searchWithQ(@jakarta.annotation.Nonnull final String q) {
        Objects.requireNonNull(q);
        return new SearchWithQRequestBuilder(pathParameters, requestAdapter, q);
    }
    /**
     * Delete navigation property drive for storage
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property drive for storage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The drive of the resource fileStorageContainer. Read-only.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The drive of the resource fileStorageContainer. Read-only.
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
     * Update the navigation property drive in storage
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Drive body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property drive in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Drive body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DriveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The drive of the resource fileStorageContainer. Read-only.
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
