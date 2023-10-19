package com.microsoft.graph.users.item.mailfolders.delta;

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
 * Provides operations to call the delta method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeltaRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new DeltaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeltaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/delta(){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", pathParameters);
    }
    /**
     * Instantiates a new DeltaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeltaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/delta(){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", rawUrl);
    }
    /**
     * Get a set of mail folders that have been added, deleted, or removed from the user's mailbox. A delta function call for mail folders in a mailbox is similar to a GET request, except that by appropriatelyapplying state tokens in one or more of these calls,you can query for incremental changes in the mail folders. This allows you to maintain and synchronizea local store of a user's mail folders without having to fetch all the mail folders of that mailbox from the server every time. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of DeltaGetResponse
     * @see <a href="https://learn.microsoft.com/graph/api/mailfolder-delta?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeltaGetResponse> get() {
        return get(null);
    }
    /**
     * Get a set of mail folders that have been added, deleted, or removed from the user's mailbox. A delta function call for mail folders in a mailbox is similar to a GET request, except that by appropriatelyapplying state tokens in one or more of these calls,you can query for incremental changes in the mail folders. This allows you to maintain and synchronizea local store of a user's mail folders without having to fetch all the mail folders of that mailbox from the server every time. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeltaGetResponse
     * @see <a href="https://learn.microsoft.com/graph/api/mailfolder-delta?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeltaGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeltaGetResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a set of mail folders that have been added, deleted, or removed from the user's mailbox. A delta function call for mail folders in a mailbox is similar to a GET request, except that by appropriatelyapplying state tokens in one or more of these calls,you can query for incremental changes in the mail folders. This allows you to maintain and synchronizea local store of a user's mail folders without having to fetch all the mail folders of that mailbox from the server every time. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a set of mail folders that have been added, deleted, or removed from the user's mailbox. A delta function call for mail folders in a mailbox is similar to a GET request, except that by appropriatelyapplying state tokens in one or more of these calls,you can query for incremental changes in the mail folders. This allows you to maintain and synchronizea local store of a user's mail folders without having to fetch all the mail folders of that mailbox from the server every time. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DeltaRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeltaRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a set of mail folders that have been added, deleted, or removed from the user's mailbox. A delta function call for mail folders in a mailbox is similar to a GET request, except that by appropriatelyapplying state tokens in one or more of these calls,you can query for incremental changes in the mail folders. This allows you to maintain and synchronizea local store of a user's mail folders without having to fetch all the mail folders of that mailbox from the server every time. This API is available in the following national cloud deployments.
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
}
