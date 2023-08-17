package com.microsoft.graph.communications;

import com.microsoft.graph.communications.callrecords.CallRecordsRequestBuilder;
import com.microsoft.graph.communications.calls.CallsRequestBuilder;
import com.microsoft.graph.communications.getpresencesbyuserid.GetPresencesByUserIdRequestBuilder;
import com.microsoft.graph.communications.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.communications.presences.PresencesRequestBuilder;
import com.microsoft.graph.models.CloudCommunications;
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
 * Provides operations to manage the cloudCommunications singleton.
 */
public class CommunicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity.
     */
    @jakarta.annotation.Nonnull
    public CallRecordsRequestBuilder callRecords() {
        return new CallRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity.
     */
    @jakarta.annotation.Nonnull
    public CallsRequestBuilder calls() {
        return new CallsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPresencesByUserId method.
     */
    @jakarta.annotation.Nonnull
    public GetPresencesByUserIdRequestBuilder getPresencesByUserId() {
        return new GetPresencesByUserIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.cloudCommunications entity.
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presences property of the microsoft.graph.cloudCommunications entity.
     */
    @jakarta.annotation.Nonnull
    public PresencesRequestBuilder presences() {
        return new PresencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CommunicationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommunicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CommunicationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommunicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get communications
     * @return a CompletableFuture of cloudCommunications
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> get() {
        return get(null);
    }
    /**
     * Get communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudCommunications
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update communications
     * @param body The request body
     * @return a CompletableFuture of cloudCommunications
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> patch(@jakarta.annotation.Nonnull final CloudCommunications body) {
        return patch(body, null);
    }
    /**
     * Update communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudCommunications
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> patch(@jakarta.annotation.Nonnull final CloudCommunications body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get communications
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get communications
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
     * Update communications
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCommunications body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCommunications body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Get communications
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
