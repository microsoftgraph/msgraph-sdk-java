package com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries;

import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.item.DeviceCompliancePolicySettingStateSummaryItemRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummaryCollectionResponse;
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
 * Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCompliancePolicySettingStateSummariesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity.
     * @param deviceCompliancePolicySettingStateSummaryId The unique identifier of deviceCompliancePolicySettingStateSummary
     * @return a DeviceCompliancePolicySettingStateSummaryItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummaryItemRequestBuilder byDeviceCompliancePolicySettingStateSummaryId(@jakarta.annotation.Nonnull final String deviceCompliancePolicySettingStateSummaryId) {
        Objects.requireNonNull(deviceCompliancePolicySettingStateSummaryId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceCompliancePolicySettingStateSummary%2Did", deviceCompliancePolicySettingStateSummaryId);
        return new DeviceCompliancePolicySettingStateSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceCompliancePolicySettingStateSummariesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceCompliancePolicySettingStateSummaries{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceCompliancePolicySettingStateSummariesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceCompliancePolicySettingStateSummaries{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List properties and relationships of the deviceCompliancePolicySettingStateSummary objects.
     * @return a DeviceCompliancePolicySettingStateSummaryCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-devicecompliancepolicysettingstatesummary-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummaryCollectionResponse get() {
        return get(null);
    }
    /**
     * List properties and relationships of the deviceCompliancePolicySettingStateSummary objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceCompliancePolicySettingStateSummaryCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-devicecompliancepolicysettingstatesummary-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummaryCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceCompliancePolicySettingStateSummaryCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new deviceCompliancePolicySettingStateSummary object.
     * @param body The request body
     * @return a DeviceCompliancePolicySettingStateSummary
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-devicecompliancepolicysettingstatesummary-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummary post(@jakarta.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body) {
        return post(body, null);
    }
    /**
     * Create a new deviceCompliancePolicySettingStateSummary object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceCompliancePolicySettingStateSummary
     * @see <a href="https://learn.microsoft.com/graph/api/intune-deviceconfig-devicecompliancepolicysettingstatesummary-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummary post(@jakarta.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue);
    }
    /**
     * List properties and relationships of the deviceCompliancePolicySettingStateSummary objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List properties and relationships of the deviceCompliancePolicySettingStateSummary objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new deviceCompliancePolicySettingStateSummary object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new deviceCompliancePolicySettingStateSummary object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a DeviceCompliancePolicySettingStateSummariesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceCompliancePolicySettingStateSummariesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List properties and relationships of the deviceCompliancePolicySettingStateSummary objects.
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
