package com.microsoft.graph.users.item.authentication.passwordmethods;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PasswordAuthenticationMethod;
import com.microsoft.graph.models.PasswordAuthenticationMethodCollectionResponse;
import com.microsoft.graph.users.item.authentication.passwordmethods.count.CountRequestBuilder;
import com.microsoft.graph.users.item.authentication.passwordmethods.item.PasswordAuthenticationMethodItemRequestBuilder;
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
 * Provides operations to manage the passwordMethods property of the microsoft.graph.authentication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passwordMethods property of the microsoft.graph.authentication entity.
     * @param passwordAuthenticationMethodId The unique identifier of passwordAuthenticationMethod
     * @return a PasswordAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PasswordAuthenticationMethodItemRequestBuilder byPasswordAuthenticationMethodId(@jakarta.annotation.Nonnull final String passwordAuthenticationMethodId) {
        Objects.requireNonNull(passwordAuthenticationMethodId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("passwordAuthenticationMethod%2Did", passwordAuthenticationMethodId);
        return new PasswordAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PasswordMethodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/passwordMethods{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PasswordMethodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/passwordMethods{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of the passwords registered to a user, represented by a passwordAuthenticationMethod object. This API returns exactly one object, as a user can have exactly one password. For security, the password itself will never be returned in the object and the password property is always null.
     * @return a PasswordAuthenticationMethodCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-list-passwordmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordAuthenticationMethodCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of the passwords registered to a user, represented by a passwordAuthenticationMethod object. This API returns exactly one object, as a user can have exactly one password. For security, the password itself will never be returned in the object and the password property is always null.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PasswordAuthenticationMethodCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-list-passwordmethods?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordAuthenticationMethodCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PasswordAuthenticationMethodCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to passwordMethods for users
     * @param body The request body
     * @return a PasswordAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public PasswordAuthenticationMethod post(@jakarta.annotation.Nonnull final PasswordAuthenticationMethod body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to passwordMethods for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PasswordAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public PasswordAuthenticationMethod post(@jakarta.annotation.Nonnull final PasswordAuthenticationMethod body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PasswordAuthenticationMethod::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of the passwords registered to a user, represented by a passwordAuthenticationMethod object. This API returns exactly one object, as a user can have exactly one password. For security, the password itself will never be returned in the object and the password property is always null.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of the passwords registered to a user, represented by a passwordAuthenticationMethod object. This API returns exactly one object, as a user can have exactly one password. For security, the password itself will never be returned in the object and the password property is always null.
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
     * Create new navigation property to passwordMethods for users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasswordAuthenticationMethod body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to passwordMethods for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasswordAuthenticationMethod body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a PasswordMethodsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PasswordMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PasswordMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of the passwords registered to a user, represented by a passwordAuthenticationMethod object. This API returns exactly one object, as a user can have exactly one password. For security, the password itself will never be returned in the object and the password property is always null.
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
