package com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleCollectionResponse;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.count.CountRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.filterbycurrentuserwithon.FilterByCurrentUserWithOnRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.item.UnifiedRoleEligibilityScheduleItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the roleEligibilitySchedules property of the microsoft.graph.rbacApplication entity.
 */
public class RoleEligibilitySchedulesRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to count the resources in the collection. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleEligibilitySchedules property of the microsoft.graph.rbacApplication entity.
     * @param unifiedRoleEligibilityScheduleId Unique identifier of the item
     * @return a UnifiedRoleEligibilityScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleItemRequestBuilder byUnifiedRoleEligibilityScheduleId(@javax.annotation.Nonnull final String unifiedRoleEligibilityScheduleId) {
        Objects.requireNonNull(unifiedRoleEligibilityScheduleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilitySchedule%2Did", unifiedRoleEligibilityScheduleId);
        return new UnifiedRoleEligibilityScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RoleEligibilitySchedulesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleEligibilitySchedulesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleEligibilitySchedules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RoleEligibilitySchedulesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleEligibilitySchedulesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleEligibilitySchedules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to call the filterByCurrentUser method.
     * @param on Usage: on='{on}'
     * @return a filterByCurrentUserWithOnRequestBuilder
     */
    @javax.annotation.Nonnull
    public FilterByCurrentUserWithOnRequestBuilder filterByCurrentUserWithOn(@javax.annotation.Nonnull final String on) {
        Objects.requireNonNull(on);
        return new FilterByCurrentUserWithOnRequestBuilder(pathParameters, requestAdapter, on);
    }
    /**
     * Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.
     * @return a CompletableFuture of UnifiedRoleEligibilityScheduleCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/rbacapplication-list-roleeligibilityschedules?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UnifiedRoleEligibilityScheduleCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/rbacapplication-list-roleeligibilityschedules?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to roleEligibilitySchedules for roleManagement
     * @param body The request body
     * @return a CompletableFuture of unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> post(@javax.annotation.Nonnull final UnifiedRoleEligibilitySchedule body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to roleEligibilitySchedules for roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> post(@javax.annotation.Nonnull final UnifiedRoleEligibilitySchedule body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Create new navigation property to roleEligibilitySchedules for roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilitySchedule body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to roleEligibilitySchedules for roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilitySchedule body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.
     */
    public class GetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
