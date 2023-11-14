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
 * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentRequests property of the microsoft.graph.entitlementManagement entity.
     * @param accessPackageAssignmentRequestId The unique identifier of accessPackageAssignmentRequest
     * @return a AccessPackageAssignmentRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentRequestItemRequestBuilder byAccessPackageAssignmentRequestId(@jakarta.annotation.Nonnull final String accessPackageAssignmentRequestId) {
        Objects.requireNonNull(accessPackageAssignmentRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentRequest%2Did", accessPackageAssignmentRequestId);
        return new AccessPackageAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AssignmentRequestsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AssignmentRequestsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to call the filterByCurrentUser method.
     * @param on Usage: on='{on}'
     * @return a FilterByCurrentUserWithOnRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FilterByCurrentUserWithOnRequestBuilder filterByCurrentUserWithOn(@jakarta.annotation.Nonnull final String on) {
        Objects.requireNonNull(on);
        return new FilterByCurrentUserWithOnRequestBuilder(pathParameters, requestAdapter, on);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages. This API is available in the following national cloud deployments.
     * @return a AccessPackageAssignmentRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessPackageAssignmentRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, AccessPackageAssignmentRequestCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object.  This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a AccessPackageAssignmentRequest
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequest post(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body) {
        return post(body, null);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object.  This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessPackageAssignmentRequest
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-assignmentrequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequest post(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, AccessPackageAssignmentRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object.  This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * In Microsoft Entra Entitlement Management, create a new accessPackageAssignmentRequest object.  This operation is used to assign a user to an access package, update the assignment, or to remove an access package assignment. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignmentRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AssignmentRequestsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AssignmentRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignmentRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * In Microsoft Entra entitlement management, retrieve a list of accessPackageAssignmentRequest objects.  The resulting list includes all the assignment requests, current and well as expired, that the caller has access to read, across all catalogs and access packages. This API is available in the following national cloud deployments.
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
