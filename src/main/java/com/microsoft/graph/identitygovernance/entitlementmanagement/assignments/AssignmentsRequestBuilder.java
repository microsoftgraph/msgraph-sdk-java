package com.microsoft.graph.identitygovernance.entitlementmanagement.assignments;

import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.additionalaccess.AdditionalAccessRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.additionalaccesswithaccesspackageidwithincompatibleaccesspackageid.AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.filterbycurrentuserwithon.FilterByCurrentUserWithOnRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.AccessPackageAssignmentItemRequestBuilder;
import com.microsoft.graph.models.AccessPackageAssignment;
import com.microsoft.graph.models.AccessPackageAssignmentCollectionResponse;
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
 * Provides operations to manage the assignments property of the microsoft.graph.entitlementManagement entity.
 */
public class AssignmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the additionalAccess method.
     */
    @jakarta.annotation.Nonnull
    public AdditionalAccessRequestBuilder additionalAccess() {
        return new AdditionalAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the additionalAccess method.
     * @param accessPackageId Usage: accessPackageId='{accessPackageId}'
     * @param incompatibleAccessPackageId Usage: incompatibleAccessPackageId='{incompatibleAccessPackageId}'
     * @return a additionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder additionalAccessWithAccessPackageIdWithIncompatibleAccessPackageId(@jakarta.annotation.Nonnull final String accessPackageId, @jakarta.annotation.Nonnull final String incompatibleAccessPackageId) {
        Objects.requireNonNull(accessPackageId);
        Objects.requireNonNull(incompatibleAccessPackageId);
        return new AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder(pathParameters, requestAdapter, accessPackageId, incompatibleAccessPackageId);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.entitlementManagement entity.
     * @param accessPackageAssignmentId The unique identifier of accessPackageAssignment
     * @return a AccessPackageAssignmentItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessPackageAssignmentItemRequestBuilder byAccessPackageAssignmentId(@jakarta.annotation.Nonnull final String accessPackageAssignmentId) {
        Objects.requireNonNull(accessPackageAssignmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignment%2Did", accessPackageAssignmentId);
        return new AccessPackageAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AssignmentsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AssignmentsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to call the filterByCurrentUser method.
     * @param on Usage: on='{on}'
     * @return a filterByCurrentUserWithOnRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FilterByCurrentUserWithOnRequestBuilder filterByCurrentUserWithOn(@jakarta.annotation.Nonnull final String on) {
        Objects.requireNonNull(on);
        return new FilterByCurrentUserWithOnRequestBuilder(pathParameters, requestAdapter, on);
    }
    /**
     * In Azure AD entitlement management, retrieve a list of accessPackageAssignment objects. For directory-wide administrators, the resulting list includes all the assignments, current and well as expired, that the caller has access to read, across all catalogs and access packages.  If the caller is on behalf of a delegated user who is assigned only to catalog-specific delegated administrative roles, the request must supply a filter to indicate a specific access package, such as: $filter=accessPackage/id eq 'a914b616-e04e-476b-aa37-91038f0b165b'.
     * @return a CompletableFuture of accessPackageAssignmentCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentCollectionResponse> get() {
        return get(null);
    }
    /**
     * In Azure AD entitlement management, retrieve a list of accessPackageAssignment objects. For directory-wide administrators, the resulting list includes all the assignments, current and well as expired, that the caller has access to read, across all catalogs and access packages.  If the caller is on behalf of a delegated user who is assigned only to catalog-specific delegated administrative roles, the request must supply a filter to indicate a specific access package, such as: $filter=accessPackage/id eq 'a914b616-e04e-476b-aa37-91038f0b165b'.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageAssignmentCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/entitlementmanagement-list-assignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageAssignmentCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to assignments for identityGovernance
     * @param body The request body
     * @return a CompletableFuture of accessPackageAssignment
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignment> post(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to assignments for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackageAssignment
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignment> post(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessPackageAssignment::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * In Azure AD entitlement management, retrieve a list of accessPackageAssignment objects. For directory-wide administrators, the resulting list includes all the assignments, current and well as expired, that the caller has access to read, across all catalogs and access packages.  If the caller is on behalf of a delegated user who is assigned only to catalog-specific delegated administrative roles, the request must supply a filter to indicate a specific access package, such as: $filter=accessPackage/id eq 'a914b616-e04e-476b-aa37-91038f0b165b'.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * In Azure AD entitlement management, retrieve a list of accessPackageAssignment objects. For directory-wide administrators, the resulting list includes all the assignments, current and well as expired, that the caller has access to read, across all catalogs and access packages.  If the caller is on behalf of a delegated user who is assigned only to catalog-specific delegated administrative roles, the request must supply a filter to indicate a specific access package, such as: $filter=accessPackage/id eq 'a914b616-e04e-476b-aa37-91038f0b165b'.
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
     * Create new navigation property to assignments for identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to assignments for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessPackageAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * In Azure AD entitlement management, retrieve a list of accessPackageAssignment objects. For directory-wide administrators, the resulting list includes all the assignments, current and well as expired, that the caller has access to read, across all catalogs and access packages.  If the caller is on behalf of a delegated user who is assigned only to catalog-specific delegated administrative roles, the request must supply a filter to indicate a specific access package, such as: $filter=accessPackage/id eq 'a914b616-e04e-476b-aa37-91038f0b165b'.
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
