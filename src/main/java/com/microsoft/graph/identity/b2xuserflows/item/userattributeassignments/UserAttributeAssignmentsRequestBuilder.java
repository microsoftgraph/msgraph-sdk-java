package com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments;

import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.count.CountRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.getorder.GetOrderRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.setorder.SetOrderRequestBuilder;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignmentCollectionResponse;
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
/** Provides operations to manage the userAttributeAssignments property of the microsoft.graph.b2xIdentityUserFlow entity. */
public class UserAttributeAssignmentsRequestBuilder {
    /** Provides operations to count the resources in the collection. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the setOrder method. */
    @javax.annotation.Nonnull
    public SetOrderRequestBuilder setOrder() {
        return new SetOrderRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new UserAttributeAssignmentsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserAttributeAssignmentsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userAttributeAssignments{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UserAttributeAssignmentsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserAttributeAssignmentsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userAttributeAssignments{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserAttributeAssignmentsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final UserAttributeAssignmentsRequestBuilderGetRequestConfiguration requestConfig = new UserAttributeAssignmentsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final IdentityUserFlowAttributeAssignment body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final IdentityUserFlowAttributeAssignment body, @javax.annotation.Nullable final java.util.function.Consumer<UserAttributeAssignmentsRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final UserAttributeAssignmentsRequestBuilderPostRequestConfiguration requestConfig = new UserAttributeAssignmentsRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @return a CompletableFuture of IdentityUserFlowAttributeAssignmentCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignmentCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityUserFlowAttributeAssignmentCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignmentCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of IdentityUserFlowAttributeAssignmentCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignmentCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<UserAttributeAssignmentsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityUserFlowAttributeAssignmentCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignmentCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getOrder method.
     * @return a getOrderRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetOrderRequestBuilder getOrder() {
        return new GetOrderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body 
     * @return a CompletableFuture of identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignment> post(@javax.annotation.Nonnull final IdentityUserFlowAttributeAssignment body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignment>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignment> post(@javax.annotation.Nonnull final IdentityUserFlowAttributeAssignment body, @javax.annotation.Nullable final java.util.function.Consumer<UserAttributeAssignmentsRequestBuilderPostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<IdentityUserFlowAttributeAssignment>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow. */
    public class UserAttributeAssignmentsRequestBuilderGetQueryParameters {
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class UserAttributeAssignmentsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public UserAttributeAssignmentsRequestBuilderGetQueryParameters queryParameters = new UserAttributeAssignmentsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new userAttributeAssignmentsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public UserAttributeAssignmentsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class UserAttributeAssignmentsRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new userAttributeAssignmentsRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public UserAttributeAssignmentsRequestBuilderPostRequestConfiguration() {
        }
    }
}
