package com.microsoft.graph.identityprotection.riskyserviceprincipals;

import com.microsoft.graph.identityprotection.riskyserviceprincipals.confirmcompromised.ConfirmCompromisedRequestBuilder;
import com.microsoft.graph.identityprotection.riskyserviceprincipals.count.CountRequestBuilder;
import com.microsoft.graph.identityprotection.riskyserviceprincipals.dismiss.DismissRequestBuilder;
import com.microsoft.graph.identityprotection.riskyserviceprincipals.item.RiskyServicePrincipalItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RiskyServicePrincipal;
import com.microsoft.graph.models.RiskyServicePrincipalCollectionResponse;
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
 * Provides operations to manage the riskyServicePrincipals property of the microsoft.graph.identityProtectionRoot entity.
 */
public class RiskyServicePrincipalsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the confirmCompromised method.
     */
    @jakarta.annotation.Nonnull
    public ConfirmCompromisedRequestBuilder confirmCompromised() {
        return new ConfirmCompromisedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dismiss method.
     */
    @jakarta.annotation.Nonnull
    public DismissRequestBuilder dismiss() {
        return new DismissRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the riskyServicePrincipals property of the microsoft.graph.identityProtectionRoot entity.
     * @param riskyServicePrincipalId The unique identifier of riskyServicePrincipal
     * @return a RiskyServicePrincipalItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RiskyServicePrincipalItemRequestBuilder byRiskyServicePrincipalId(@jakarta.annotation.Nonnull final String riskyServicePrincipalId) {
        Objects.requireNonNull(riskyServicePrincipalId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("riskyServicePrincipal%2Did", riskyServicePrincipalId);
        return new RiskyServicePrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RiskyServicePrincipalsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RiskyServicePrincipalsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityProtection/riskyServicePrincipals{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RiskyServicePrincipalsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RiskyServicePrincipalsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityProtection/riskyServicePrincipals{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve the properties and relationships of riskyServicePrincipal objects.
     * @return a CompletableFuture of riskyServicePrincipalCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identityprotectionroot-list-riskyserviceprincipals?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyServicePrincipalCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of riskyServicePrincipal objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of riskyServicePrincipalCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identityprotectionroot-list-riskyserviceprincipals?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyServicePrincipalCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, RiskyServicePrincipalCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to riskyServicePrincipals for identityProtection
     * @param body The request body
     * @return a CompletableFuture of riskyServicePrincipal
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyServicePrincipal> post(@jakarta.annotation.Nonnull final RiskyServicePrincipal body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to riskyServicePrincipals for identityProtection
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of riskyServicePrincipal
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyServicePrincipal> post(@jakarta.annotation.Nonnull final RiskyServicePrincipal body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, RiskyServicePrincipal::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve the properties and relationships of riskyServicePrincipal objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of riskyServicePrincipal objects.
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
     * Create new navigation property to riskyServicePrincipals for identityProtection
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RiskyServicePrincipal body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to riskyServicePrincipals for identityProtection
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RiskyServicePrincipal body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Retrieve the properties and relationships of riskyServicePrincipal objects.
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
