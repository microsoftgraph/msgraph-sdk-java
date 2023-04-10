package com.microsoft.graph.drives.item;

import com.microsoft.graph.drives.item.bundles.BundlesRequestBuilder;
import com.microsoft.graph.drives.item.bundles.item.DriveItemItemRequestBuilder;
import com.microsoft.graph.drives.item.following.FollowingRequestBuilder;
import com.microsoft.graph.drives.item.items.ItemsRequestBuilder;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of drive entities.
 */
public class DriveItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the bundles property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public BundlesRequestBuilder bundles() {
        return new BundlesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the following property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public FollowingRequestBuilder following() {
        return new FollowingRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the items property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the list property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public ListRequestBuilder list() {
        return new ListRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the recent method. */
    @javax.annotation.Nonnull
    public RecentRequestBuilder recent() {
        return new RecentRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the root property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public RootRequestBuilder root() {
        return new RootRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sharedWithMe method. */
    @javax.annotation.Nonnull
    public SharedWithMeRequestBuilder sharedWithMe() {
        return new SharedWithMeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the special property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public SpecialRequestBuilder special() {
        return new SpecialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bundles property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.drives.item.bundles.item.DriveItemItemRequestBuilder bundles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.drives.item.bundles.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from drives
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
     * Delete entity from drives
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
     * Provides operations to manage the following property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.drives.item.following.item.DriveItemItemRequestBuilder following(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.drives.item.following.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a Drive resource. A Drive is the top-level container for a file system, such as OneDrive or SharePoint document libraries.
     * @return a CompletableFuture of drive
     * @see <a href="https://docs.microsoft.com/graph/api/drive-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Drive> executionException = new java.util.concurrent.CompletableFuture<Drive>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the properties and relationships of a Drive resource. A Drive is the top-level container for a file system, such as OneDrive or SharePoint document libraries.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     * @see <a href="https://docs.microsoft.com/graph/api/drive-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Drive> executionException = new java.util.concurrent.CompletableFuture<Drive>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.drives.item.items.item.DriveItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.drives.item.items.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@javax.annotation.Nonnull final Drive body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Drive> executionException = new java.util.concurrent.CompletableFuture<Drive>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@javax.annotation.Nonnull final Drive body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Drive> executionException = new java.util.concurrent.CompletableFuture<Drive>();
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
     * Provides operations to manage the special property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.drives.item.special.item.DriveItemItemRequestBuilder special(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.drives.item.special.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete entity from drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from drives
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
     * Retrieve the properties and relationships of a Drive resource. A Drive is the top-level container for a file system, such as OneDrive or SharePoint document libraries.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a Drive resource. A Drive is the top-level container for a file system, such as OneDrive or SharePoint document libraries.
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
     * Update entity in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Drive body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Drive body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Retrieve the properties and relationships of a Drive resource. A Drive is the top-level container for a file system, such as OneDrive or SharePoint document libraries.
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
