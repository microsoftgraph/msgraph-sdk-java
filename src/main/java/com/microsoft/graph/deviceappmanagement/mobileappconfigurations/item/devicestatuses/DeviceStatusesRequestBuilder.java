package com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses;

import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses.count.CountRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses.item.ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationDeviceStatus;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;
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
 * Provides operations to manage the deviceStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceStatusesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     * @param managedDeviceMobileAppConfigurationDeviceStatusId The unique identifier of managedDeviceMobileAppConfigurationDeviceStatus
     * @return a ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder byManagedDeviceMobileAppConfigurationDeviceStatusId(@jakarta.annotation.Nonnull final String managedDeviceMobileAppConfigurationDeviceStatusId) {
        Objects.requireNonNull(managedDeviceMobileAppConfigurationDeviceStatusId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationDeviceStatus%2Did", managedDeviceMobileAppConfigurationDeviceStatusId);
        return new ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceStatusesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceStatusesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}/deviceStatuses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceStatusesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceStatusesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}/deviceStatuses{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List properties and relationships of the managedDeviceMobileAppConfigurationDeviceStatus objects.
     * @return a CompletableFuture of managedDeviceMobileAppConfigurationDeviceStatusCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfigurationdevicestatus-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse> get() {
        return get(null);
    }
    /**
     * List properties and relationships of the managedDeviceMobileAppConfigurationDeviceStatus objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDeviceMobileAppConfigurationDeviceStatusCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfigurationdevicestatus-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new managedDeviceMobileAppConfigurationDeviceStatus object.
     * @param body The request body
     * @return a CompletableFuture of managedDeviceMobileAppConfigurationDeviceStatus
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfigurationdevicestatus-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> post(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus body) {
        return post(body, null);
    }
    /**
     * Create a new managedDeviceMobileAppConfigurationDeviceStatus object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDeviceMobileAppConfigurationDeviceStatus
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-manageddevicemobileappconfigurationdevicestatus-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> post(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfigurationDeviceStatus::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * List properties and relationships of the managedDeviceMobileAppConfigurationDeviceStatus objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List properties and relationships of the managedDeviceMobileAppConfigurationDeviceStatus objects.
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
     * Create a new managedDeviceMobileAppConfigurationDeviceStatus object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new managedDeviceMobileAppConfigurationDeviceStatus object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * List properties and relationships of the managedDeviceMobileAppConfigurationDeviceStatus objects.
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
