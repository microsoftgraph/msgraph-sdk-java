package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoverySearch;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.additionalsources.AdditionalSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.addtoreviewsetoperation.AddToReviewSetOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.custodiansources.CustodianSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.lastestimatestatisticsoperation.LastEstimateStatisticsOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecurityestimatestatistics.MicrosoftGraphSecurityEstimateStatisticsRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecuritypurgedata.MicrosoftGraphSecurityPurgeDataRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.noncustodialsources.NoncustodialSourcesRequestBuilder;
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
 * Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoverySearchItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the additionalSources property of the microsoft.graph.security.ediscoverySearch entity.
     */
    @jakarta.annotation.Nonnull
    public AdditionalSourcesRequestBuilder additionalSources() {
        return new AdditionalSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the addToReviewSetOperation property of the microsoft.graph.security.ediscoverySearch entity.
     */
    @jakarta.annotation.Nonnull
    public AddToReviewSetOperationRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the custodianSources property of the microsoft.graph.security.ediscoverySearch entity.
     */
    @jakarta.annotation.Nonnull
    public CustodianSourcesRequestBuilder custodianSources() {
        return new CustodianSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastEstimateStatisticsOperation property of the microsoft.graph.security.ediscoverySearch entity.
     */
    @jakarta.annotation.Nonnull
    public LastEstimateStatisticsOperationRequestBuilder lastEstimateStatisticsOperation() {
        return new LastEstimateStatisticsOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the estimateStatistics method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityEstimateStatisticsRequestBuilder microsoftGraphSecurityEstimateStatistics() {
        return new MicrosoftGraphSecurityEstimateStatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the purgeData method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityPurgeDataRequestBuilder microsoftGraphSecurityPurgeData() {
        return new MicrosoftGraphSecurityPurgeDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the noncustodialSources property of the microsoft.graph.security.ediscoverySearch entity.
     */
    @jakarta.annotation.Nonnull
    public NoncustodialSourcesRequestBuilder noncustodialSources() {
        return new NoncustodialSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EdiscoverySearchItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdiscoverySearchItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches/{ediscoverySearch%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EdiscoverySearchItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdiscoverySearchItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/searches/{ediscoverySearch%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete an ediscoverySearch object.
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-delete-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete an ediscoverySearch object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-delete-searches?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Read the properties and relationships of an ediscoverySearch object.
     * @return a CompletableFuture of EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverysearch-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an ediscoverySearch object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverysearch-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of an ediscoverySearch object.
     * @param body The request body
     * @return a CompletableFuture of EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverysearch-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> patch(@jakarta.annotation.Nonnull final EdiscoverySearch body) {
        return patch(body, null);
    }
    /**
     * Update the properties of an ediscoverySearch object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of EdiscoverySearch
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverysearch-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoverySearch> patch(@jakarta.annotation.Nonnull final EdiscoverySearch body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, EdiscoverySearch::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete an ediscoverySearch object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an ediscoverySearch object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an ediscoverySearch object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an ediscoverySearch object.
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
     * Update the properties of an ediscoverySearch object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EdiscoverySearch body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of an ediscoverySearch object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EdiscoverySearch body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a EdiscoverySearchItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EdiscoverySearchItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EdiscoverySearchItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an ediscoverySearch object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
