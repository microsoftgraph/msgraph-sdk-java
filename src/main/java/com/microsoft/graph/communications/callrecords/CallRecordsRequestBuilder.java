package com.microsoft.graph.communications.callrecords;

import com.microsoft.graph.communications.callrecords.count.CountRequestBuilder;
import com.microsoft.graph.communications.callrecords.item.CallRecordItemRequestBuilder;
import com.microsoft.graph.communications.callrecords.microsoftgraphcallrecordsgetdirectroutingcallswithfromdatetimewithtodatetime.MicrosoftGraphCallRecordsGetDirectRoutingCallsWithFromDateTimeWithToDateTimeRequestBuilder;
import com.microsoft.graph.communications.callrecords.microsoftgraphcallrecordsgetpstncallswithfromdatetimewithtodatetime.MicrosoftGraphCallRecordsGetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder;
import com.microsoft.graph.models.callrecords.CallRecord;
import com.microsoft.graph.models.callrecords.CallRecordCollectionResponse;
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
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallRecordsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity.
     * @param callRecordId The unique identifier of callRecord
     * @return a CallRecordItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CallRecordItemRequestBuilder byCallRecordId(@jakarta.annotation.Nonnull final String callRecordId) {
        Objects.requireNonNull(callRecordId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("callRecord%2Did", callRecordId);
        return new CallRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CallRecordsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallRecordsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/callRecords{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CallRecordsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallRecordsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/callRecords{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve the properties and relationships of a callRecord object. There are two ways to get the id of a callRecord: You can use the $expand query parameter to optionally include session and segment details, as shown in the Get full details example. When you expand session details, the maximum page size is 60 sessions.
     * @return a CompletableFuture of callRecordCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CallRecordCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a callRecord object. There are two ways to get the id of a callRecord: You can use the $expand query parameter to optionally include session and segment details, as shown in the Get full details example. When you expand session details, the maximum page size is 60 sessions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of callRecordCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CallRecordCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CallRecordCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the getDirectRoutingCalls method.
     * @param fromDateTime Usage: fromDateTime={fromDateTime}
     * @param toDateTime Usage: toDateTime={toDateTime}
     * @return a microsoftGraphCallRecordsGetDirectRoutingCallsWithFromDateTimeWithToDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphCallRecordsGetDirectRoutingCallsWithFromDateTimeWithToDateTimeRequestBuilder microsoftGraphCallRecordsGetDirectRoutingCallsWithFromDateTimeWithToDateTime(@jakarta.annotation.Nonnull final OffsetDateTime fromDateTime, @jakarta.annotation.Nonnull final OffsetDateTime toDateTime) {
        Objects.requireNonNull(fromDateTime);
        Objects.requireNonNull(toDateTime);
        return new MicrosoftGraphCallRecordsGetDirectRoutingCallsWithFromDateTimeWithToDateTimeRequestBuilder(pathParameters, requestAdapter, fromDateTime, toDateTime);
    }
    /**
     * Provides operations to call the getPstnCalls method.
     * @param fromDateTime Usage: fromDateTime={fromDateTime}
     * @param toDateTime Usage: toDateTime={toDateTime}
     * @return a microsoftGraphCallRecordsGetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphCallRecordsGetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder microsoftGraphCallRecordsGetPstnCallsWithFromDateTimeWithToDateTime(@jakarta.annotation.Nonnull final OffsetDateTime fromDateTime, @jakarta.annotation.Nonnull final OffsetDateTime toDateTime) {
        Objects.requireNonNull(fromDateTime);
        Objects.requireNonNull(toDateTime);
        return new MicrosoftGraphCallRecordsGetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder(pathParameters, requestAdapter, fromDateTime, toDateTime);
    }
    /**
     * Create new navigation property to callRecords for communications
     * @param body The request body
     * @return a CompletableFuture of callRecord
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CallRecord> post(@jakarta.annotation.Nonnull final CallRecord body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to callRecords for communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of callRecord
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CallRecord> post(@jakarta.annotation.Nonnull final CallRecord body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CallRecord::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve the properties and relationships of a callRecord object. There are two ways to get the id of a callRecord: You can use the $expand query parameter to optionally include session and segment details, as shown in the Get full details example. When you expand session details, the maximum page size is 60 sessions.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a callRecord object. There are two ways to get the id of a callRecord: You can use the $expand query parameter to optionally include session and segment details, as shown in the Get full details example. When you expand session details, the maximum page size is 60 sessions.
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
     * Create new navigation property to callRecords for communications
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CallRecord body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to callRecords for communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CallRecord body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a callRecordsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CallRecordsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CallRecordsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a callRecord object. There are two ways to get the id of a callRecord: You can use the $expand query parameter to optionally include session and segment details, as shown in the Get full details example. When you expand session details, the maximum page size is 60 sessions.
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
