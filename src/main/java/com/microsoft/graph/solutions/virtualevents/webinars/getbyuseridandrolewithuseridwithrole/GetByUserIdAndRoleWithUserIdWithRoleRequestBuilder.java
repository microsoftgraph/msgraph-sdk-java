package com.microsoft.graph.solutions.virtualevents.webinars.getbyuseridandrolewithuseridwithrole;

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
 * Provides operations to call the getByUserIdAndRole method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param role Usage: role='{role}'
     * @param userId Usage: userId='{userId}'
     */
    public GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String role, @jakarta.annotation.Nullable final String userId) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/getByUserIdAndRole(userId='{userId}',role='{role}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", pathParameters);
        this.pathParameters.put("role", role);
        this.pathParameters.put("userId", userId);
    }
    /**
     * Instantiates a new GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/getByUserIdAndRole(userId='{userId}',role='{role}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", rawUrl);
    }
    /**
     * Invoke function getByUserIdAndRole
     * @return a GetByUserIdAndRoleWithUserIdWithRoleGetResponse
     */
    @jakarta.annotation.Nullable
    public GetByUserIdAndRoleWithUserIdWithRoleGetResponse get() {
        return get(null);
    }
    /**
     * Invoke function getByUserIdAndRole
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a GetByUserIdAndRoleWithUserIdWithRoleGetResponse
     */
    @jakarta.annotation.Nullable
    public GetByUserIdAndRoleWithUserIdWithRoleGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, GetByUserIdAndRoleWithUserIdWithRoleGetResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function getByUserIdAndRole
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getByUserIdAndRole
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
     * @return a GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Invoke function getByUserIdAndRole
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
