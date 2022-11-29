package com.microsoft.graph.users.item.drives.item;

import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.drives.item.bundles.BundlesRequestBuilder;
import com.microsoft.graph.users.item.drives.item.bundles.item.DriveItemItemRequestBuilder;
import com.microsoft.graph.users.item.drives.item.following.FollowingRequestBuilder;
import com.microsoft.graph.users.item.drives.item.items.ItemsRequestBuilder;
import com.microsoft.graph.users.item.drives.item.list.ListRequestBuilder;
import com.microsoft.graph.users.item.drives.item.recent.RecentRequestBuilder;
import com.microsoft.graph.users.item.drives.item.root.RootRequestBuilder;
import com.microsoft.graph.users.item.drives.item.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.users.item.drives.item.sharedwithme.SharedWithMeRequestBuilder;
import com.microsoft.graph.users.item.drives.item.special.SpecialRequestBuilder;
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
/** Provides operations to manage the drives property of the microsoft.graph.user entity. */
public class DriveItemRequestBuilder {
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
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the root property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public RootRequestBuilder root() {
        return new RootRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the special property of the microsoft.graph.drive entity. */
    @javax.annotation.Nonnull
    public SpecialRequestBuilder special() {
        return new SpecialRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the bundles property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.drives.item.bundles.item.DriveItemItemRequestBuilder bundles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.users.item.drives.item.bundles.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/drives/{drive%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DriveItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/drives/{drive%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property drives for users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property drives for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DriveItemRequestBuilderDeleteRequestConfiguration requestConfig = new DriveItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * A collection of drives available for this user. Read-only.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * A collection of drives available for this user. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DriveItemRequestBuilderGetRequestConfiguration requestConfig = new DriveItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property drives in users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Drive body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property drives in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Drive body, @javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DriveItemRequestBuilderPatchRequestConfiguration requestConfig = new DriveItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property drives for users
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
     * Delete navigation property drives for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Provides operations to manage the following property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.drives.item.following.item.DriveItemItemRequestBuilder following(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.users.item.drives.item.following.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * A collection of drives available for this user. Read-only.
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * A collection of drives available for this user. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.drives.item.items.item.DriveItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.users.item.drives.item.items.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property drives in users
     * @param body 
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@javax.annotation.Nonnull final Drive body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property drives in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> patch(@javax.annotation.Nonnull final Drive body, @javax.annotation.Nullable final java.util.function.Consumer<DriveItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the recent method.
     * @return a recentRequestBuilder
     */
    @javax.annotation.Nonnull
    public RecentRequestBuilder recent() {
        return new RecentRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to call the sharedWithMe method.
     * @return a sharedWithMeRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedWithMeRequestBuilder sharedWithMe() {
        return new SharedWithMeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the special property of the microsoft.graph.drive entity.
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.drives.item.special.item.DriveItemItemRequestBuilder special(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did", id);
        return new com.microsoft.graph.users.item.drives.item.special.item.DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DriveItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** A collection of drives available for this user. Read-only. */
    public class DriveItemRequestBuilderGetQueryParameters {
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
    public class DriveItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DriveItemRequestBuilderGetQueryParameters queryParameters = new DriveItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new DriveItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DriveItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
