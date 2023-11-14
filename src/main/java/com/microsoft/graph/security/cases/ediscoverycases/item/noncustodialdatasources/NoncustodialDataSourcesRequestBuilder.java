package com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryNoncustodialDataSource;
import com.microsoft.graph.models.security.EdiscoveryNoncustodialDataSourceCollectionResponse;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.count.CountRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.EdiscoveryNoncustodialDataSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.microsoftgraphsecurityapplyhold.MicrosoftGraphSecurityApplyHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.microsoftgraphsecurityremovehold.MicrosoftGraphSecurityRemoveHoldRequestBuilder;
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
 * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.security.ediscoveryCase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NoncustodialDataSourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityApplyHoldRequestBuilder microsoftGraphSecurityApplyHold() {
        return new MicrosoftGraphSecurityApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRemoveHoldRequestBuilder microsoftGraphSecurityRemoveHold() {
        return new MicrosoftGraphSecurityRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.security.ediscoveryCase entity.
     * @param ediscoveryNoncustodialDataSourceId The unique identifier of ediscoveryNoncustodialDataSource
     * @return a EdiscoveryNoncustodialDataSourceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EdiscoveryNoncustodialDataSourceItemRequestBuilder byEdiscoveryNoncustodialDataSourceId(@jakarta.annotation.Nonnull final String ediscoveryNoncustodialDataSourceId) {
        Objects.requireNonNull(ediscoveryNoncustodialDataSourceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryNoncustodialDataSource%2Did", ediscoveryNoncustodialDataSourceId);
        return new EdiscoveryNoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new NoncustodialDataSourcesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NoncustodialDataSourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/noncustodialDataSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new NoncustodialDataSourcesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NoncustodialDataSourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/noncustodialDataSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @return a EdiscoveryNoncustodialDataSourceCollectionResponse
     */
    @jakarta.annotation.Nullable
    public EdiscoveryNoncustodialDataSourceCollectionResponse get() {
        return get(null);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EdiscoveryNoncustodialDataSourceCollectionResponse
     */
    @jakarta.annotation.Nullable
    public EdiscoveryNoncustodialDataSourceCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, EdiscoveryNoncustodialDataSourceCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new ediscoveryNoncustodialDataSource object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a EdiscoveryNoncustodialDataSource
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-noncustodialdatasources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryNoncustodialDataSource post(@jakarta.annotation.Nonnull final EdiscoveryNoncustodialDataSource body) {
        return post(body, null);
    }
    /**
     * Create a new ediscoveryNoncustodialDataSource object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EdiscoveryNoncustodialDataSource
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-noncustodialdatasources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryNoncustodialDataSource post(@jakarta.annotation.Nonnull final EdiscoveryNoncustodialDataSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new ediscoveryNoncustodialDataSource object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryNoncustodialDataSource body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new ediscoveryNoncustodialDataSource object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryNoncustodialDataSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a NoncustodialDataSourcesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public NoncustodialDataSourcesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NoncustodialDataSourcesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
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
