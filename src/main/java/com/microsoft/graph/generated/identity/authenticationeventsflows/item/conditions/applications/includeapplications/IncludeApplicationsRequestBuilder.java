package com.microsoft.graph.identity.authenticationeventsflows.item.conditions.applications.includeapplications;

import com.microsoft.graph.identity.authenticationeventsflows.item.conditions.applications.includeapplications.count.CountRequestBuilder;
import com.microsoft.graph.identity.authenticationeventsflows.item.conditions.applications.includeapplications.item.AuthenticationConditionApplicationAppItemRequestBuilder;
import com.microsoft.graph.models.AuthenticationConditionApplication;
import com.microsoft.graph.models.AuthenticationConditionApplicationCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the includeApplications property of the microsoft.graph.authenticationConditionsApplications entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncludeApplicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the includeApplications property of the microsoft.graph.authenticationConditionsApplications entity.
     * @param authenticationConditionApplicationAppId The unique identifier of authenticationConditionApplication
     * @return a {@link AuthenticationConditionApplicationAppItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationConditionApplicationAppItemRequestBuilder byAuthenticationConditionApplicationAppId(@jakarta.annotation.Nonnull final String authenticationConditionApplicationAppId) {
        Objects.requireNonNull(authenticationConditionApplicationAppId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationConditionApplication%2DappId", authenticationConditionApplicationAppId);
        return new AuthenticationConditionApplicationAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link IncludeApplicationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IncludeApplicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions/applications/includeApplications{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link IncludeApplicationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IncludeApplicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions/applications/includeApplications{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List the applications linked to an external identities self-service sign up user flow that's represented by an externalUsersSelfServiceSignupEventsFlow object. These are the applications for which the authentication experience that's defined by the user flow is enabled. To find the user flow that's linked to an application, see Example 4: List user flow associated with specific application ID.
     * @return a {@link AuthenticationConditionApplicationCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationconditionsapplications-list-includeapplications?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditionApplicationCollectionResponse get() {
        return get(null);
    }
    /**
     * List the applications linked to an external identities self-service sign up user flow that's represented by an externalUsersSelfServiceSignupEventsFlow object. These are the applications for which the authentication experience that's defined by the user flow is enabled. To find the user flow that's linked to an application, see Example 4: List user flow associated with specific application ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationConditionApplicationCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationconditionsapplications-list-includeapplications?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditionApplicationCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationConditionApplicationCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add or link an application to a user flow, or authenticationEventsFlow. This enables the authentication experience defined by the user flow to be enabled for the application. An application can only be linked to one user flow. The app must have an associated service principal in the tenant.
     * @param body The request body
     * @return a {@link AuthenticationConditionApplication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationconditionsapplications-post-includeapplications?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditionApplication post(@jakarta.annotation.Nonnull final AuthenticationConditionApplication body) {
        return post(body, null);
    }
    /**
     * Add or link an application to a user flow, or authenticationEventsFlow. This enables the authentication experience defined by the user flow to be enabled for the application. An application can only be linked to one user flow. The app must have an associated service principal in the tenant.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationConditionApplication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationconditionsapplications-post-includeapplications?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditionApplication post(@jakarta.annotation.Nonnull final AuthenticationConditionApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationConditionApplication::createFromDiscriminatorValue);
    }
    /**
     * List the applications linked to an external identities self-service sign up user flow that's represented by an externalUsersSelfServiceSignupEventsFlow object. These are the applications for which the authentication experience that's defined by the user flow is enabled. To find the user flow that's linked to an application, see Example 4: List user flow associated with specific application ID.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List the applications linked to an external identities self-service sign up user flow that's represented by an externalUsersSelfServiceSignupEventsFlow object. These are the applications for which the authentication experience that's defined by the user flow is enabled. To find the user flow that's linked to an application, see Example 4: List user flow associated with specific application ID.
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
     * Add or link an application to a user flow, or authenticationEventsFlow. This enables the authentication experience defined by the user flow to be enabled for the application. An application can only be linked to one user flow. The app must have an associated service principal in the tenant.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AuthenticationConditionApplication body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add or link an application to a user flow, or authenticationEventsFlow. This enables the authentication experience defined by the user flow to be enabled for the application. An application can only be linked to one user flow. The app must have an associated service principal in the tenant.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AuthenticationConditionApplication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IncludeApplicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IncludeApplicationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IncludeApplicationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List the applications linked to an external identities self-service sign up user flow that's represented by an externalUsersSelfServiceSignupEventsFlow object. These are the applications for which the authentication experience that's defined by the user flow is enabled. To find the user flow that's linked to an application, see Example 4: List user flow associated with specific application ID.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
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
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
