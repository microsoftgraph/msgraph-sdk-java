package com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformancebyappversiondeviceid.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId;
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
 * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId/{userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId/{userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId for deviceManagement
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version Device Id
     * @return a CompletableFuture of userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> get() {
        return get(null);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version Device Id
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> patch(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> patch(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * User experience analytics appHealth Application Performance by App Version Device Id
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version Device Id
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
     * Update the navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * User experience analytics appHealth Application Performance by App Version Device Id
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
