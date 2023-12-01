package com.microsoft.graph.users.item.authentication.emailmethods;

import com.microsoft.graph.models.EmailAuthenticationMethod;
import com.microsoft.graph.models.EmailAuthenticationMethodCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.authentication.emailmethods.count.CountRequestBuilder;
import com.microsoft.graph.users.item.authentication.emailmethods.item.EmailAuthenticationMethodItemRequestBuilder;
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
 * Provides operations to manage the emailMethods property of the microsoft.graph.authentication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the emailMethods property of the microsoft.graph.authentication entity.
     * @param emailAuthenticationMethodId The unique identifier of emailAuthenticationMethod
     * @return a EmailAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EmailAuthenticationMethodItemRequestBuilder byEmailAuthenticationMethodId(@jakarta.annotation.Nonnull final String emailAuthenticationMethodId) {
        Objects.requireNonNull(emailAuthenticationMethodId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("emailAuthenticationMethod%2Did", emailAuthenticationMethodId);
        return new EmailAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EmailMethodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/emailMethods{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EmailMethodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/emailMethods{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of a user's emailAuthenticationMethod objects and their properties. This API will return only a single object in the collection as only one email method can be set for a user. This API is available in the following national cloud deployments.
     * @return a EmailAuthenticationMethodCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-list-emailmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EmailAuthenticationMethodCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of a user's emailAuthenticationMethod objects and their properties. This API will return only a single object in the collection as only one email method can be set for a user. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EmailAuthenticationMethodCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-list-emailmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EmailAuthenticationMethodCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EmailAuthenticationMethodCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Set a user's emailAuthenticationMethod object. Email authentication is a self-service password reset method. A user may only have one email authentication method. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a EmailAuthenticationMethod
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-post-emailmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EmailAuthenticationMethod post(@jakarta.annotation.Nonnull final EmailAuthenticationMethod body) {
        return post(body, null);
    }
    /**
     * Set a user's emailAuthenticationMethod object. Email authentication is a self-service password reset method. A user may only have one email authentication method. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EmailAuthenticationMethod
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-post-emailmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EmailAuthenticationMethod post(@jakarta.annotation.Nonnull final EmailAuthenticationMethod body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EmailAuthenticationMethod::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of a user's emailAuthenticationMethod objects and their properties. This API will return only a single object in the collection as only one email method can be set for a user. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of a user's emailAuthenticationMethod objects and their properties. This API will return only a single object in the collection as only one email method can be set for a user. This API is available in the following national cloud deployments.
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
     * Set a user's emailAuthenticationMethod object. Email authentication is a self-service password reset method. A user may only have one email authentication method. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EmailAuthenticationMethod body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Set a user's emailAuthenticationMethod object. Email authentication is a self-service password reset method. A user may only have one email authentication method. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EmailAuthenticationMethod body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a EmailMethodsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EmailMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmailMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of a user's emailAuthenticationMethod objects and their properties. This API will return only a single object in the collection as only one email method can be set for a user. This API is available in the following national cloud deployments.
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
