package com.microsoft.graph.drives.item;

import com.microsoft.graph.drives.item.bundles.BundlesRequestBuilder;
import com.microsoft.graph.drives.item.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.drives.item.following.FollowingRequestBuilder;
import com.microsoft.graph.drives.item.items.ItemsRequestBuilder;
import com.microsoft.graph.drives.item.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.drives.item.list.ListRequestBuilder;
import com.microsoft.graph.drives.item.recent.RecentRequestBuilder;
import com.microsoft.graph.drives.item.root.RootRequestBuilder;
import com.microsoft.graph.drives.item.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.drives.item.sharedwithme.SharedWithMeRequestBuilder;
import com.microsoft.graph.drives.item.special.SpecialRequestBuilder;
import com.microsoft.graph.models.Drive;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of drive entities.
 */
public class DriveItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the bundles property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public BundlesRequestBuilder bundles() {
        return new BundlesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the following property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public FollowingRequestBuilder following() {
        return new FollowingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the list property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public ListRequestBuilder list() {
        return new ListRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recent method.
     */
    @jakarta.annotation.Nonnull
    public RecentRequestBuilder recent() {
        return new RecentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the root property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public RootRequestBuilder root() {
        return new RootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sharedWithMe method.
     */
    @jakarta.annotation.Nonnull
    public SharedWithMeRequestBuilder sharedWithMe() {
        return new SharedWithMeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the special property of the microsoft.graph.drive entity.
     */
    @jakarta.annotation.Nonnull
    public SpecialRequestBuilder special() {
        return new SpecialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DriveItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from drives
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete entity from drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get entity from drives by key
     * @return a CompletableFuture of drive
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get() {
        return get(null);
    }
    /**
     * Get entity from drives by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @return a CompletableFuture of drive
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@jakarta.annotation.Nonnull final Drive body) {
        return patch(body, null);
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@jakarta.annotation.Nonnull final Drive body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the search method.
     * @param q Usage: q='{q}'
     * @return a searchWithQRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SearchWithQRequestBuilder searchWithQ(@jakarta.annotation.Nonnull final String q) {
        Objects.requireNonNull(q);
        return new SearchWithQRequestBuilder(pathParameters, requestAdapter, q);
    }
    /**
     * Delete entity from drives
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * Get entity from drives by key
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from drives by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Update entity in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Drive body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Drive body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Get entity from drives by key
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
