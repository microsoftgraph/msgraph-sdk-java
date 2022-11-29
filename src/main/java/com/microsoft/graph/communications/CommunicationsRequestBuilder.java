package com.microsoft.graph.communications;

import com.microsoft.graph.communications.callrecords.CallRecordsRequestBuilder;
import com.microsoft.graph.communications.callrecords.item.CallRecordItemRequestBuilder;
import com.microsoft.graph.communications.calls.CallsRequestBuilder;
import com.microsoft.graph.communications.calls.item.CallItemRequestBuilder;
import com.microsoft.graph.communications.getpresencesbyuserid.GetPresencesByUserIdRequestBuilder;
import com.microsoft.graph.communications.onlinemeetings.item.OnlineMeetingItemRequestBuilder;
import com.microsoft.graph.communications.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.communications.presences.item.PresenceItemRequestBuilder;
import com.microsoft.graph.communications.presences.PresencesRequestBuilder;
import com.microsoft.graph.models.CloudCommunications;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the cloudCommunications singleton. */
public class CommunicationsRequestBuilder {
    /** Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity. */
    @javax.annotation.Nonnull
    public CallRecordsRequestBuilder callRecords() {
        return new CallRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity. */
    @javax.annotation.Nonnull
    public CallsRequestBuilder calls() {
        return new CallsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getPresencesByUserId method. */
    @javax.annotation.Nonnull
    public GetPresencesByUserIdRequestBuilder getPresencesByUserId() {
        return new GetPresencesByUserIdRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onlineMeetings property of the microsoft.graph.cloudCommunications entity. */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the presences property of the microsoft.graph.cloudCommunications entity. */
    @javax.annotation.Nonnull
    public PresencesRequestBuilder presences() {
        return new PresencesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity.
     * @param id Unique identifier of the item
     * @return a CallRecordItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CallRecordItemRequestBuilder callRecords(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("callRecord%2Did", id);
        return new CallRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity.
     * @param id Unique identifier of the item
     * @return a CallItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CallItemRequestBuilder calls(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("call%2Did", id);
        return new CallItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CommunicationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CommunicationsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/communications{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CommunicationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CommunicationsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/communications{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get communications
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CommunicationsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final CommunicationsRequestBuilderGetRequestConfiguration requestConfig = new CommunicationsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update communications
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final CloudCommunications body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update communications
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final CloudCommunications body, @javax.annotation.Nullable final java.util.function.Consumer<CommunicationsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final CommunicationsRequestBuilderPatchRequestConfiguration requestConfig = new CommunicationsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get communications
     * @return a CompletableFuture of cloudCommunications
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<CloudCommunications>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudCommunications
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> get(@javax.annotation.Nullable final java.util.function.Consumer<CommunicationsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<CloudCommunications>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.cloudCommunications entity.
     * @param id Unique identifier of the item
     * @return a OnlineMeetingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnlineMeetingItemRequestBuilder onlineMeetings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onlineMeeting%2Did", id);
        return new OnlineMeetingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update communications
     * @param body 
     * @return a CompletableFuture of cloudCommunications
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> patch(@javax.annotation.Nonnull final CloudCommunications body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<CloudCommunications>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update communications
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudCommunications
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudCommunications> patch(@javax.annotation.Nonnull final CloudCommunications body, @javax.annotation.Nullable final java.util.function.Consumer<CommunicationsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, CloudCommunications::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<CloudCommunications>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the presences property of the microsoft.graph.cloudCommunications entity.
     * @param id Unique identifier of the item
     * @return a PresenceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PresenceItemRequestBuilder presences(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("presence%2Did", id);
        return new PresenceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get communications */
    public class CommunicationsRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CommunicationsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public CommunicationsRequestBuilderGetQueryParameters queryParameters = new CommunicationsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new communicationsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CommunicationsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CommunicationsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new communicationsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CommunicationsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
