package com.microsoft.graph.communications.callrecords.getpstncallswithfromdatetimewithtodatetime;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getPstnCalls method. */
public class GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder and sets the default values.
     * @param fromDateTime Usage: fromDateTime='{fromDateTime}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param toDateTime Usage: toDateTime='{toDateTime}'
     * @return a void
     */
    public GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final OffsetDateTime fromDateTime, @javax.annotation.Nullable final OffsetDateTime toDateTime) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/communications/callRecords/microsoft.graph.callRecords.getPstnCalls(fromDateTime='{fromDateTime}',toDateTime='{toDateTime}')";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        urlTplParams.put("fromDateTime", fromDateTime);
        urlTplParams.put("toDateTime", toDateTime);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/communications/callRecords/microsoft.graph.callRecords.getPstnCalls(fromDateTime='{fromDateTime}',toDateTime='{toDateTime}')";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function getPstnCalls
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function getPstnCalls
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration requestConfig = new GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function getPstnCalls
     * @return a CompletableFuture of getPstnCallsWithFromDateTimeWithToDateTimeResponse
     */
    public java.util.concurrent.CompletableFuture<GetPstnCallsWithFromDateTimeWithToDateTimeResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetPstnCallsWithFromDateTimeWithToDateTimeResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getPstnCalls
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of getPstnCallsWithFromDateTimeWithToDateTimeResponse
     */
    public java.util.concurrent.CompletableFuture<GetPstnCallsWithFromDateTimeWithToDateTimeResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetPstnCallsWithFromDateTimeWithToDateTimeResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getPstnCalls
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of getPstnCallsWithFromDateTimeWithToDateTimeResponse
     */
    public java.util.concurrent.CompletableFuture<GetPstnCallsWithFromDateTimeWithToDateTimeResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetPstnCallsWithFromDateTimeWithToDateTimeResponse::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new getPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public GetPstnCallsWithFromDateTimeWithToDateTimeRequestBuilderGetRequestConfiguration() {
        }
    }
}
