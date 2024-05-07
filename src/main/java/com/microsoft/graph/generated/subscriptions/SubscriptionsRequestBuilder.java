package com.microsoft.graph.subscriptions;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Subscription;
import com.microsoft.graph.models.SubscriptionCollectionResponse;
import com.microsoft.graph.subscriptions.item.SubscriptionItemRequestBuilder;
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
 * Provides operations to manage the collection of subscription entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of subscription entities.
     * @param subscriptionId The unique identifier of subscription
     * @return a {@link SubscriptionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionItemRequestBuilder bySubscriptionId(@jakarta.annotation.Nonnull final String subscriptionId) {
        Objects.requireNonNull(subscriptionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", subscriptionId);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubscriptionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscriptions{?%24count,%24filter,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link SubscriptionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/subscriptions{?%24count,%24filter,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve the properties and relationships of webhook subscriptions, based on the app ID, the user, and the user's role with a tenant. The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @return a {@link SubscriptionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscription-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SubscriptionCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of webhook subscriptions, based on the app ID, the user, and the user's role with a tenant. The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubscriptionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscription-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SubscriptionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubscriptionCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. To identify the resources for which you can create subscriptions and the limitations on subscriptions, see Set up notifications for changes in resource data: Supported resources. Some resources support rich notifications, that is, notifications that include resource data. For more information about these resources, see Set up change notifications that include resource data: Supported resources.
     * @param body The request body
     * @return a {@link Subscription}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscription-post-subscriptions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Subscription post(@jakarta.annotation.Nonnull final Subscription body) {
        return post(body, null);
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. To identify the resources for which you can create subscriptions and the limitations on subscriptions, see Set up notifications for changes in resource data: Supported resources. Some resources support rich notifications, that is, notifications that include resource data. For more information about these resources, see Set up change notifications that include resource data: Supported resources.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Subscription}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/subscription-post-subscriptions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Subscription post(@jakarta.annotation.Nonnull final Subscription body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Subscription::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the properties and relationships of webhook subscriptions, based on the app ID, the user, and the user's role with a tenant. The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of webhook subscriptions, based on the app ID, the user, and the user's role with a tenant. The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
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
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. To identify the resources for which you can create subscriptions and the limitations on subscriptions, see Set up notifications for changes in resource data: Supported resources. Some resources support rich notifications, that is, notifications that include resource data. For more information about these resources, see Set up change notifications that include resource data: Supported resources.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Subscription body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. To identify the resources for which you can create subscriptions and the limitations on subscriptions, see Set up notifications for changes in resource data: Supported resources. Some resources support rich notifications, that is, notifications that include resource data. For more information about these resources, see Set up change notifications that include resource data: Supported resources.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Subscription body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SubscriptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubscriptionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of webhook subscriptions, based on the app ID, the user, and the user's role with a tenant. The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
