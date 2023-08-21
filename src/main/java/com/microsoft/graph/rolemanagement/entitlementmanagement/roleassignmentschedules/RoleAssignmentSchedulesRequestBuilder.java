package com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleCollectionResponse;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.count.CountRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.filterbycurrentuserwithon.FilterByCurrentUserWithOnRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.item.UnifiedRoleAssignmentScheduleItemRequestBuilder;
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
 * Provides operations to manage the roleAssignmentSchedules property of the microsoft.graph.rbacApplication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleAssignmentSchedulesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentSchedules property of the microsoft.graph.rbacApplication entity.
     * @param unifiedRoleAssignmentScheduleId The unique identifier of unifiedRoleAssignmentSchedule
     * @return a UnifiedRoleAssignmentScheduleItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleItemRequestBuilder byUnifiedRoleAssignmentScheduleId(@jakarta.annotation.Nonnull final String unifiedRoleAssignmentScheduleId) {
        Objects.requireNonNull(unifiedRoleAssignmentScheduleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentSchedule%2Did", unifiedRoleAssignmentScheduleId);
        return new UnifiedRoleAssignmentScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RoleAssignmentSchedulesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleAssignmentSchedulesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleAssignmentSchedules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RoleAssignmentSchedulesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleAssignmentSchedulesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleAssignmentSchedules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
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
     * Get the schedules for active role assignment operations.
     * @return a CompletableFuture of unifiedRoleAssignmentScheduleCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/rbacapplication-list-roleassignmentschedules?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get the schedules for active role assignment operations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleAssignmentScheduleCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/rbacapplication-list-roleassignmentschedules?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleAssignmentScheduleCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to roleAssignmentSchedules for roleManagement
     * @param body The request body
     * @return a CompletableFuture of unifiedRoleAssignmentSchedule
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentSchedule> post(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentSchedule body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to roleAssignmentSchedules for roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleAssignmentSchedule
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentSchedule> post(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentSchedule body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get the schedules for active role assignment operations.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the schedules for active role assignment operations.
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
     * Create new navigation property to roleAssignmentSchedules for roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentSchedule body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to roleAssignmentSchedules for roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentSchedule body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Get the schedules for active role assignment operations.
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
