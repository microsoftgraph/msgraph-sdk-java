package com.microsoft.graph.admin.serviceannouncement.messages;

import com.microsoft.graph.admin.serviceannouncement.messages.archive.ArchiveRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.count.CountRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.favorite.FavoriteRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.item.ServiceUpdateMessageItemRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.markread.MarkReadRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.markunread.MarkUnreadRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.unarchive.UnarchiveRequestBuilder;
import com.microsoft.graph.admin.serviceannouncement.messages.unfavorite.UnfavoriteRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ServiceUpdateMessage;
import com.microsoft.graph.models.ServiceUpdateMessageCollectionResponse;
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
 * Provides operations to manage the messages property of the microsoft.graph.serviceAnnouncement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the archive method.
     */
    @jakarta.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the favorite method.
     */
    @jakarta.annotation.Nonnull
    public FavoriteRequestBuilder favorite() {
        return new FavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markRead method.
     */
    @jakarta.annotation.Nonnull
    public MarkReadRequestBuilder markRead() {
        return new MarkReadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markUnread method.
     */
    @jakarta.annotation.Nonnull
    public MarkUnreadRequestBuilder markUnread() {
        return new MarkUnreadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unarchive method.
     */
    @jakarta.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unfavorite method.
     */
    @jakarta.annotation.Nonnull
    public UnfavoriteRequestBuilder unfavorite() {
        return new UnfavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.serviceAnnouncement entity.
     * @param serviceUpdateMessageId The unique identifier of serviceUpdateMessage
     * @return a ServiceUpdateMessageItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceUpdateMessageItemRequestBuilder byServiceUpdateMessageId(@jakarta.annotation.Nonnull final String serviceUpdateMessageId) {
        Objects.requireNonNull(serviceUpdateMessageId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("serviceUpdateMessage%2Did", serviceUpdateMessageId);
        return new ServiceUpdateMessageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MessagesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/serviceAnnouncement/messages{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MessagesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/serviceAnnouncement/messages{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve the serviceUpdateMessage resources from the messages navigation property. This operation retrieves all service update messages that exist for the tenant.
     * @return a CompletableFuture of ServiceUpdateMessageCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/serviceannouncement-list-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateMessageCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve the serviceUpdateMessage resources from the messages navigation property. This operation retrieves all service update messages that exist for the tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceUpdateMessageCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/serviceannouncement-list-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateMessageCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ServiceUpdateMessageCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to messages for admin
     * @param body The request body
     * @return a CompletableFuture of ServiceUpdateMessage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateMessage> post(@jakarta.annotation.Nonnull final ServiceUpdateMessage body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to messages for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ServiceUpdateMessage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServiceUpdateMessage> post(@jakarta.annotation.Nonnull final ServiceUpdateMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ServiceUpdateMessage::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve the serviceUpdateMessage resources from the messages navigation property. This operation retrieves all service update messages that exist for the tenant.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the serviceUpdateMessage resources from the messages navigation property. This operation retrieves all service update messages that exist for the tenant.
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
     * Create new navigation property to messages for admin
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceUpdateMessage body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to messages for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServiceUpdateMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MessagesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MessagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the serviceUpdateMessage resources from the messages navigation property. This operation retrieves all service update messages that exist for the tenant.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
