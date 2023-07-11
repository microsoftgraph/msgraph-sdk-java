package com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item;

import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.apphealthmetrics.AppHealthMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.batteryhealthmetrics.BatteryHealthMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.bestpracticesmetrics.BestPracticesMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.devicebootperformancemetrics.DeviceBootPerformanceMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.rebootanalyticsmetrics.RebootAnalyticsMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.resourceperformancemetrics.ResourcePerformanceMetricsRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsbaselines.item.workfromanywheremetrics.WorkFromAnywhereMetricsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserExperienceAnalyticsBaseline;
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
 * Provides operations to manage the userExperienceAnalyticsBaselines property of the microsoft.graph.deviceManagement entity.
 */
public class UserExperienceAnalyticsBaselineItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appHealthMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public AppHealthMetricsRequestBuilder appHealthMetrics() {
        return new AppHealthMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the batteryHealthMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public BatteryHealthMetricsRequestBuilder batteryHealthMetrics() {
        return new BatteryHealthMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bestPracticesMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public BestPracticesMetricsRequestBuilder bestPracticesMetrics() {
        return new BestPracticesMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceBootPerformanceMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public DeviceBootPerformanceMetricsRequestBuilder deviceBootPerformanceMetrics() {
        return new DeviceBootPerformanceMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rebootAnalyticsMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public RebootAnalyticsMetricsRequestBuilder rebootAnalyticsMetrics() {
        return new RebootAnalyticsMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resourcePerformanceMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public ResourcePerformanceMetricsRequestBuilder resourcePerformanceMetrics() {
        return new ResourcePerformanceMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workFromAnywhereMetrics property of the microsoft.graph.userExperienceAnalyticsBaseline entity.
     */
    @javax.annotation.Nonnull
    public WorkFromAnywhereMetricsRequestBuilder workFromAnywhereMetrics() {
        return new WorkFromAnywhereMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserExperienceAnalyticsBaselineItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBaselineItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsBaselines/{userExperienceAnalyticsBaseline%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserExperienceAnalyticsBaselineItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBaselineItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsBaselines/{userExperienceAnalyticsBaseline%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property userExperienceAnalyticsBaselines for deviceManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property userExperienceAnalyticsBaselines for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * User experience analytics baselines
     * @return a CompletableFuture of userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsBaseline::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> executionException = new java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * User experience analytics baselines
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsBaseline::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> executionException = new java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property userExperienceAnalyticsBaselines in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> patch(@javax.annotation.Nonnull final UserExperienceAnalyticsBaseline body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsBaseline::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> executionException = new java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property userExperienceAnalyticsBaselines in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> patch(@javax.annotation.Nonnull final UserExperienceAnalyticsBaseline body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsBaseline::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline> executionException = new java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBaseline>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property userExperienceAnalyticsBaselines for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property userExperienceAnalyticsBaselines for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * User experience analytics baselines
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * User experience analytics baselines
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
     * Update the navigation property userExperienceAnalyticsBaselines in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UserExperienceAnalyticsBaseline body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property userExperienceAnalyticsBaselines in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UserExperienceAnalyticsBaseline body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * User experience analytics baselines
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
