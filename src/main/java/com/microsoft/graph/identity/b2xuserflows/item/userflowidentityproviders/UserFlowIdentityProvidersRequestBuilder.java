package com.microsoft.graph.identity.b2xuserflows.item.userflowidentityproviders;

import com.microsoft.graph.identity.b2xuserflows.item.userflowidentityproviders.count.CountRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userflowidentityproviders.item.IdentityProviderBaseItemRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userflowidentityproviders.ref.RefRequestBuilder;
import com.microsoft.graph.models.IdentityProviderBaseCollectionResponse;
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
 * Provides operations to manage the userFlowIdentityProviders property of the microsoft.graph.b2xIdentityUserFlow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserFlowIdentityProvidersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of identityContainer entities.
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identity.b2xUserFlows.item.userFlowIdentityProviders.item collection
     * @param identityProviderBaseId Unique identifier of the item
     * @return a IdentityProviderBaseItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IdentityProviderBaseItemRequestBuilder byIdentityProviderBaseId(@jakarta.annotation.Nonnull final String identityProviderBaseId) {
        Objects.requireNonNull(identityProviderBaseId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProviderBase%2Did", identityProviderBaseId);
        return new IdentityProviderBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserFlowIdentityProvidersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowIdentityProvidersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userFlowIdentityProviders{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserFlowIdentityProvidersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserFlowIdentityProvidersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userFlowIdentityProviders{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get userFlowIdentityProviders from identity
     * @return a IdentityProviderBaseCollectionResponse
     */
    @jakarta.annotation.Nullable
    public IdentityProviderBaseCollectionResponse get() {
        return get(null);
    }
    /**
     * Get userFlowIdentityProviders from identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IdentityProviderBaseCollectionResponse
     */
    @jakarta.annotation.Nullable
    public IdentityProviderBaseCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, IdentityProviderBaseCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get userFlowIdentityProviders from identity
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get userFlowIdentityProviders from identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UserFlowIdentityProvidersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserFlowIdentityProvidersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserFlowIdentityProvidersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get userFlowIdentityProviders from identity
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
}
