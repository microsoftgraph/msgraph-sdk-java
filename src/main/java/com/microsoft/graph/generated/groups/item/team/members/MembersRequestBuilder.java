package com.microsoft.graph.groups.item.team.members;

import com.microsoft.graph.groups.item.team.members.add.AddRequestBuilder;
import com.microsoft.graph.groups.item.team.members.count.CountRequestBuilder;
import com.microsoft.graph.groups.item.team.members.item.ConversationMemberItemRequestBuilder;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ConversationMemberCollectionResponse;
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
 * Provides operations to manage the members property of the microsoft.graph.team entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the add method.
     * @return a {@link AddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.team entity.
     * @param conversationMemberId The unique identifier of conversationMember
     * @return a {@link ConversationMemberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationMemberItemRequestBuilder byConversationMemberId(@jakarta.annotation.Nonnull final String conversationMemberId) {
        Objects.requireNonNull(conversationMemberId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationMember%2Did", conversationMemberId);
        return new ConversationMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/members{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/members{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant.
     * @return a {@link ConversationMemberCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-list-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConversationMemberCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ConversationMemberCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-list-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConversationMemberCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConversationMemberCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add a new conversationMember to a team.
     * @param body The request body
     * @return a {@link ConversationMember}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConversationMember post(@jakarta.annotation.Nonnull final ConversationMember body) {
        return post(body, null);
    }
    /**
     * Add a new conversationMember to a team.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ConversationMember}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConversationMember post(@jakarta.annotation.Nonnull final ConversationMember body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConversationMember::createFromDiscriminatorValue);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant.
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
     * Add a new conversationMember to a team.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConversationMember body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a new conversationMember to a team.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConversationMember body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant.
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
