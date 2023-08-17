package com.microsoft.graph.identitygovernance.entitlementmanagement.resourcerequests;

import com.microsoft.graph.identitygovernance.entitlementmanagement.resourcerequests.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.resourcerequests.item.AccessPackageResourceRequestItemRequestBuilder;
import com.microsoft.graph.models.AccessPackageResourceRequest;
import com.microsoft.graph.models.AccessPackageResourceRequestCollectionResponse;
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
 * Provides operations to manage the resourceRequests property of the microsoft.graph.entitlementManagement entity.
 */
public class ResourceRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resourceRequests property of the microsoft.graph.entitlementManagement entity.
     * @param accessPackageResourceRequestId The unique identifier of accessPackageResourceRequest
     * @return a AccessPackageResourceRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessPackageResourceRequestItemRequestBuilder byAccessPackageResourceRequestId(@jakarta.annotation.Nonnull final String accessPackageResourceRequestId) {
        Objects.requireNonNull(accessPackageResourceRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResourceRequest%2Did", accessPackageResourceRequestId);
        return new AccessPackageResourceRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ResourceRequestsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResourceRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/resourceRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ResourceRequestsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResourceRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/resourceRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of accessPackageResourceRequest objects.
     * @return a CompletableFuture of accessPackageResourceRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-resourcerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRequestCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve a list of accessPackageResourceRequest objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageResourceRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-resourcerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRequestCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageResourceRequestCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new accessPackageResourceRequest object to request the addition of a resource to an access package catalog, update of a resource, or the removal of a resource from a catalog.  A resource must be included in an access package catalog before a role of that resource can be added to an access package. To add an Azure AD group as a resource to a catalog, set the requestType to be adminAdd, and a resource representing the resource. The value of the originSystem property within the resource should be AadGroup and the value of the originId is the identifier of the group.  If using delegated permissions, the user requesting to add a group should be an owner of the group or in a directory role which allows them to modify groups. If using application permissions, the application requesting to add the group should also be assigned the Group.ReadWrite.All permission.
     * @param body The request body
     * @return a CompletableFuture of accessPackageResourceRequest
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-resourcerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRequest> post(@jakarta.annotation.Nonnull final AccessPackageResourceRequest body) {
        return post(body, null);
    }
    /**
     * Create a new accessPackageResourceRequest object to request the addition of a resource to an access package catalog, update of a resource, or the removal of a resource from a catalog.  A resource must be included in an access package catalog before a role of that resource can be added to an access package. To add an Azure AD group as a resource to a catalog, set the requestType to be adminAdd, and a resource representing the resource. The value of the originSystem property within the resource should be AadGroup and the value of the originId is the identifier of the group.  If using delegated permissions, the user requesting to add a group should be an owner of the group or in a directory role which allows them to modify groups. If using application permissions, the application requesting to add the group should also be assigned the Group.ReadWrite.All permission.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageResourceRequest
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-post-resourcerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRequest> post(@jakarta.annotation.Nonnull final AccessPackageResourceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageResourceRequest::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve a list of accessPackageResourceRequest objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of accessPackageResourceRequest objects.
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
     * Create a new accessPackageResourceRequest object to request the addition of a resource to an access package catalog, update of a resource, or the removal of a resource from a catalog.  A resource must be included in an access package catalog before a role of that resource can be added to an access package. To add an Azure AD group as a resource to a catalog, set the requestType to be adminAdd, and a resource representing the resource. The value of the originSystem property within the resource should be AadGroup and the value of the originId is the identifier of the group.  If using delegated permissions, the user requesting to add a group should be an owner of the group or in a directory role which allows them to modify groups. If using application permissions, the application requesting to add the group should also be assigned the Group.ReadWrite.All permission.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageResourceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new accessPackageResourceRequest object to request the addition of a resource to an access package catalog, update of a resource, or the removal of a resource from a catalog.  A resource must be included in an access package catalog before a role of that resource can be added to an access package. To add an Azure AD group as a resource to a catalog, set the requestType to be adminAdd, and a resource representing the resource. The value of the originSystem property within the resource should be AadGroup and the value of the originId is the identifier of the group.  If using delegated permissions, the user requesting to add a group should be an owner of the group or in a directory role which allows them to modify groups. If using application permissions, the application requesting to add the group should also be assigned the Group.ReadWrite.All permission.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageResourceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Retrieve a list of accessPackageResourceRequest objects.
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
