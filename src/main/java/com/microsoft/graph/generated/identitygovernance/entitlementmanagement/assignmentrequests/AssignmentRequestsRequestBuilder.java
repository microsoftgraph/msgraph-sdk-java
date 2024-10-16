package com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests;

import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.filterbycurrentuserwithon.FilterByCurrentUserWithOnRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.item.AccessPackageAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;
import com.microsoft.graph.models.AccessPackageAssignmentRequestCollectionResponse;
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
 * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
     * @param accessPackageAssignmentRequestId The unique identifier of accessPackageAssignmentRequest
     * @return a {@link AccessPackageAssignmentRequestItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentRequestItemRequestBuilder byAccessPackageAssignmentRequestId(@jakarta.annotation.Nonnull final String accessPackageAssignmentRequestId) {
        Objects.requireNonNull(accessPackageAssignmentRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentRequest%2Did", accessPackageAssignmentRequestId);
        return new AccessPackageAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AssignmentRequestsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AssignmentRequestsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Provides operations to call the filterByCurrentUser method.
     * @param on Usage: on='{on}'
     * @return a {@link FilterByCurrentUserWithOnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterByCurrentUserWithOnRequestBuilder filterByCurrentUserWithOn(@jakarta.annotation.Nonnull final String on) {
        Objects.requireNonNull(on);
        return new FilterByCurrentUserWithOnRequestBuilder(pathParameters, requestAdapter, on);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages.
     * @return a {@link AccessPackageAssignmentRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageAssignmentRequestCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignmentRequestCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object. This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment.
     * @param body The request body
     * @return a {@link AccessPackageAssignmentRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequest post(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body) {
        return post(body, null);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object. This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AccessPackageAssignmentRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequest post(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AccessPackageAssignmentRequest::createFromDiscriminatorValue);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages.
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
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object. This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object. This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AssignmentRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignmentRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages.
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
