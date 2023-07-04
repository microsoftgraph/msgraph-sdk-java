package com.microsoft.graph.security.cases.ediscoverycases.item.custodians;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryCustodian;
import com.microsoft.graph.models.security.EdiscoveryCustodianCollectionResponse;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.count.CountRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.EdiscoveryCustodianItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.microsoftgraphsecurityapplyhold.MicrosoftGraphSecurityApplyHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.microsoftgraphsecurityremovehold.MicrosoftGraphSecurityRemoveHoldRequestBuilder;
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
 * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
 */
public class CustodiansRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     */
    @javax.annotation.Nonnull
    public MicrosoftGraphSecurityApplyHoldRequestBuilder microsoftGraphSecurityApplyHold() {
        return new MicrosoftGraphSecurityApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     */
    @javax.annotation.Nonnull
    public MicrosoftGraphSecurityRemoveHoldRequestBuilder microsoftGraphSecurityRemoveHold() {
        return new MicrosoftGraphSecurityRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
     * @param ediscoveryCustodianId Unique identifier of the item
     * @return a EdiscoveryCustodianItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryCustodianItemRequestBuilder byEdiscoveryCustodianId(@javax.annotation.Nonnull final String ediscoveryCustodianId) {
        Objects.requireNonNull(ediscoveryCustodianId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryCustodian%2Did", ediscoveryCustodianId);
        return new EdiscoveryCustodianItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CustodiansRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustodiansRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CustodiansRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustodiansRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @return a CompletableFuture of EdiscoveryCustodianCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/security-ediscoverycase-list-custodians?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodianCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of EdiscoveryCustodianCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/security-ediscoverycase-list-custodians?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodianCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCustodianCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian's userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @return a CompletableFuture of ediscoveryCustodian
     * @see <a href="https://docs.microsoft.com/graph/api/security-ediscoverycase-post-custodians?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> post(@javax.annotation.Nonnull final EdiscoveryCustodian body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCustodian> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian's userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryCustodian
     * @see <a href="https://docs.microsoft.com/graph/api/security-ediscoverycase-post-custodians?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCustodian> post(@javax.annotation.Nonnull final EdiscoveryCustodian body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCustodian::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCustodian> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCustodian>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the custodian objects and their properties.
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
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian's userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final EdiscoveryCustodian body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian's userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final EdiscoveryCustodian body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get a list of the custodian objects and their properties.
     */
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
