package com.microsoft.graph.solutions.bookingbusinesses;

import com.microsoft.graph.models.BookingBusiness;
import com.microsoft.graph.models.BookingBusinessCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.solutions.bookingbusinesses.count.CountRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.BookingBusinessItemRequestBuilder;
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
 * Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity.
 */
public class BookingBusinessesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity.
     * @param bookingBusinessId The unique identifier of bookingBusiness
     * @return a BookingBusinessItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BookingBusinessItemRequestBuilder byBookingBusinessId(@jakarta.annotation.Nonnull final String bookingBusinessId) {
        Objects.requireNonNull(bookingBusinessId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingBusiness%2Did", bookingBusinessId);
        return new BookingBusinessItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BookingBusinessesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BookingBusinessesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new BookingBusinessesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BookingBusinessesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a collection of bookingBusiness objects that has been created for the tenant. This operation returns only the id and displayName of each Microsoft Bookings business in the collection. For performance considerations, it does not return other properties. You can get the other properties of a Bookings business by specifying its id in a GET operation.
     * @return a CompletableFuture of bookingBusinessCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusinessCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get a collection of bookingBusiness objects that has been created for the tenant. This operation returns only the id and displayName of each Microsoft Bookings business in the collection. For performance considerations, it does not return other properties. You can get the other properties of a Bookings business by specifying its id in a GET operation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusinessCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusinessCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, BookingBusinessCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new Microsoft Bookings business in a tenant. This is the first step in setting up a Bookings business where you must specify the business display name. You can include other information such as business address, web site address, and scheduling policy, or set that information later by updating the bookingBusiness.
     * @param body The request body
     * @return a CompletableFuture of bookingBusiness
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-post-bookingbusinesses?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> post(@jakarta.annotation.Nonnull final BookingBusiness body) {
        return post(body, null);
    }
    /**
     * Create a new Microsoft Bookings business in a tenant. This is the first step in setting up a Bookings business where you must specify the business display name. You can include other information such as business address, web site address, and scheduling policy, or set that information later by updating the bookingBusiness.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusiness
     * @see <a href="https://learn.microsoft.com/graph/api/bookingbusiness-post-bookingbusinesses?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> post(@jakarta.annotation.Nonnull final BookingBusiness body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a collection of bookingBusiness objects that has been created for the tenant. This operation returns only the id and displayName of each Microsoft Bookings business in the collection. For performance considerations, it does not return other properties. You can get the other properties of a Bookings business by specifying its id in a GET operation.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a collection of bookingBusiness objects that has been created for the tenant. This operation returns only the id and displayName of each Microsoft Bookings business in the collection. For performance considerations, it does not return other properties. You can get the other properties of a Bookings business by specifying its id in a GET operation.
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
     * Create a new Microsoft Bookings business in a tenant. This is the first step in setting up a Bookings business where you must specify the business display name. You can include other information such as business address, web site address, and scheduling policy, or set that information later by updating the bookingBusiness.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BookingBusiness body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new Microsoft Bookings business in a tenant. This is the first step in setting up a Bookings business where you must specify the business display name. You can include other information such as business address, web site address, and scheduling policy, or set that information later by updating the bookingBusiness.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BookingBusiness body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Get a collection of bookingBusiness objects that has been created for the tenant. This operation returns only the id and displayName of each Microsoft Bookings business in the collection. For performance considerations, it does not return other properties. You can get the other properties of a Bookings business by specifying its id in a GET operation.
     */
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
