package com.microsoft.graph.sites.item.lists.item;

import com.microsoft.graph.models.List;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.sites.item.lists.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.contenttypes.ContentTypesRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.drive.DriveRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.items.ItemsRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.subscriptions.SubscriptionsRequestBuilder;
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
 * Provides operations to manage the lists property of the microsoft.graph.site entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the columns property of the microsoft.graph.list entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contentTypes property of the microsoft.graph.list entity.
     */
    @jakarta.annotation.Nonnull
    public ContentTypesRequestBuilder contentTypes() {
        return new ContentTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.list entity.
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.list entity.
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
     * Provides operations to manage the operations property of the microsoft.graph.list entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subscriptions property of the microsoft.graph.list entity.
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ListItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/lists/{list%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ListItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ListItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/lists/{list%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property lists for sites
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property lists for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get a list of rich long-running operations associated with a list.
     * @return a CompletableFuture of list
     * @see <a href="https://learn.microsoft.com/graph/api/list-list-operations?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<List> get() {
        return get(null);
    }
    /**
     * Get a list of rich long-running operations associated with a list.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of list
     * @see <a href="https://learn.microsoft.com/graph/api/list-list-operations?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<List> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, List::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property lists in sites
     * @param body The request body
     * @return a CompletableFuture of list
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<List> patch(@jakarta.annotation.Nonnull final List body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property lists in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of list
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<List> patch(@jakarta.annotation.Nonnull final List body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, List::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property lists for sites
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property lists for sites
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
     * Get a list of rich long-running operations associated with a list.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of rich long-running operations associated with a list.
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
     * Update the navigation property lists in sites
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final List body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property lists in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final List body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ListItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ListItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ListItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get a list of rich long-running operations associated with a list.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
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
