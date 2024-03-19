package com.microsoft.graph.serviceprincipals.item.owners;

import com.microsoft.graph.models.DirectoryObjectCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.serviceprincipals.item.owners.count.CountRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.graphapproleassignment.GraphAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.graphendpoint.GraphEndpointRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.graphserviceprincipal.GraphServicePrincipalRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.graphuser.GraphUserRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.ref.RefRequestBuilder;
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
 * Provides operations to manage the owners property of the microsoft.graph.servicePrincipal entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OwnersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to appRoleAssignment.
     * @return a {@link GraphAppRoleAssignmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAppRoleAssignmentRequestBuilder graphAppRoleAssignment() {
        return new GraphAppRoleAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to endpoint.
     * @return a {@link GraphEndpointRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphEndpointRequestBuilder graphEndpoint() {
        return new GraphEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to servicePrincipal.
     * @return a {@link GraphServicePrincipalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphServicePrincipalRequestBuilder graphServicePrincipal() {
        return new GraphServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to user.
     * @return a {@link GraphUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphUserRequestBuilder graphUser() {
        return new GraphUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.servicePrincipals.item.owners.item collection
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
     * Instantiates a new {@link OwnersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OwnersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/owners{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link OwnersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OwnersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/owners{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-list-owners?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryObjectCollectionResponse get() {
        return get(null);
    }
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryObjectCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-list-owners?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryObjectCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryObjectCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
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
     * @return a {@link OwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OwnersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
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
