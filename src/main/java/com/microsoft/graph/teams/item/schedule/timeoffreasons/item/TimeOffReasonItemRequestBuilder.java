package com.microsoft.graph.teams.item.schedule.timeoffreasons.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TimeOffReason;
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
/** Provides operations to manage the timeOffReasons property of the microsoft.graph.schedule entity. */
public class TimeOffReasonItemRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new TimeOffReasonItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeOffReasonItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}/schedule/timeOffReasons/{timeOffReason%2Did}{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new TimeOffReasonItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeOffReasonItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}/schedule/timeOffReasons/{timeOffReason%2Did}{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property timeOffReasons for teams
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property timeOffReasons for teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TimeOffReasonItemRequestBuilderDeleteRequestConfiguration requestConfig = new TimeOffReasonItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The set of reasons for a time off in the schedule.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The set of reasons for a time off in the schedule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final TimeOffReasonItemRequestBuilderGetRequestConfiguration requestConfig = new TimeOffReasonItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property timeOffReasons in teams
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final TimeOffReason body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property timeOffReasons in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final TimeOffReason body, @javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final TimeOffReasonItemRequestBuilderPatchRequestConfiguration requestConfig = new TimeOffReasonItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property timeOffReasons for teams
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property timeOffReasons for teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The set of reasons for a time off in the schedule.
     * @return a CompletableFuture of timeOffReason
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, TimeOffReason::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<TimeOffReason>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The set of reasons for a time off in the schedule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of timeOffReason
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> get(@javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, TimeOffReason::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<TimeOffReason>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property timeOffReasons in teams
     * @param body 
     * @return a CompletableFuture of timeOffReason
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> patch(@javax.annotation.Nonnull final TimeOffReason body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, TimeOffReason::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<TimeOffReason>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property timeOffReasons in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of timeOffReason
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> patch(@javax.annotation.Nonnull final TimeOffReason body, @javax.annotation.Nullable final java.util.function.Consumer<TimeOffReasonItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, TimeOffReason::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<TimeOffReason>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TimeOffReasonItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new TimeOffReasonItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TimeOffReasonItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The set of reasons for a time off in the schedule. */
    public class TimeOffReasonItemRequestBuilderGetQueryParameters {
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TimeOffReasonItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public TimeOffReasonItemRequestBuilderGetQueryParameters queryParameters = new TimeOffReasonItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new TimeOffReasonItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TimeOffReasonItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class TimeOffReasonItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new TimeOffReasonItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public TimeOffReasonItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
