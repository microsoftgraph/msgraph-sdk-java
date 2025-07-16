package com.microsoft.graph.groups.item.memberof;

import com.microsoft.graph.groups.item.memberof.count.CountRequestBuilder;
import com.microsoft.graph.groups.item.memberof.graphadministrativeunit.GraphAdministrativeUnitRequestBuilder;
import com.microsoft.graph.groups.item.memberof.graphgroup.GraphGroupRequestBuilder;
import com.microsoft.graph.groups.item.memberof.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.models.DirectoryObjectCollectionResponse;
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
 * Provides operations to manage the memberOf property of the microsoft.graph.group entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MemberOfRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to administrativeUnit.
     * @return a {@link GraphAdministrativeUnitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAdministrativeUnitRequestBuilder graphAdministrativeUnit() {
        return new GraphAdministrativeUnitRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to group.
     * @return a {@link GraphGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphGroupRequestBuilder graphGroup() {
        return new GraphGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.group entity.
     * @param directoryObjectId The unique identifier of directoryObject
     * @return a {@link DirectoryObjectItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder byDirectoryObjectId(@jakarta.annotation.Nonnull final String directoryObjectId) {
        Objects.requireNonNull(directoryObjectId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", directoryObjectId);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MemberOfRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MemberOfRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/memberOf{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MemberOfRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MemberOfRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/memberOf{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get groups that the group is a direct member of. This operation is not transitive. Unlike getting a user&apos;s Microsoft 365 groups, this returns all types of groups, not just Microsoft 365 groups.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-list-memberof?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryObjectCollectionResponse get() {
        return get(null);
    }
    /**
     * Get groups that the group is a direct member of. This operation is not transitive. Unlike getting a user&apos;s Microsoft 365 groups, this returns all types of groups, not just Microsoft 365 groups.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-list-memberof?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryObjectCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryObjectCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Get groups that the group is a direct member of. This operation is not transitive. Unlike getting a user&apos;s Microsoft 365 groups, this returns all types of groups, not just Microsoft 365 groups.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get groups that the group is a direct member of. This operation is not transitive. Unlike getting a user&apos;s Microsoft 365 groups, this returns all types of groups, not just Microsoft 365 groups.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MemberOfRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get groups that the group is a direct member of. This operation is not transitive. Unlike getting a user&apos;s Microsoft 365 groups, this returns all types of groups, not just Microsoft 365 groups.
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
}
