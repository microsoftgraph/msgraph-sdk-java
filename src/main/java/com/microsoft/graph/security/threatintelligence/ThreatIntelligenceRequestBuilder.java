package com.microsoft.graph.security.threatintelligence;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.ThreatIntelligence;
import com.microsoft.graph.security.threatintelligence.articleindicators.ArticleIndicatorsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.articles.ArticlesRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hostcomponents.HostComponentsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hostcookies.HostCookiesRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.HostsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosttrackers.HostTrackersRequestBuilder;
import com.microsoft.graph.security.threatintelligence.intelligenceprofileindicators.IntelligenceProfileIndicatorsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.intelprofiles.IntelProfilesRequestBuilder;
import com.microsoft.graph.security.threatintelligence.passivednsrecords.PassiveDnsRecordsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.vulnerabilities.VulnerabilitiesRequestBuilder;
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
 * Provides operations to manage the threatIntelligence property of the microsoft.graph.security entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatIntelligenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the articleIndicators property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public ArticleIndicatorsRequestBuilder articleIndicators() {
        return new ArticleIndicatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the articles property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public ArticlesRequestBuilder articles() {
        return new ArticlesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hostComponents property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public HostComponentsRequestBuilder hostComponents() {
        return new HostComponentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hostCookies property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public HostCookiesRequestBuilder hostCookies() {
        return new HostCookiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hosts property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public HostsRequestBuilder hosts() {
        return new HostsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hostTrackers property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public HostTrackersRequestBuilder hostTrackers() {
        return new HostTrackersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the intelligenceProfileIndicators property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public IntelligenceProfileIndicatorsRequestBuilder intelligenceProfileIndicators() {
        return new IntelligenceProfileIndicatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the intelProfiles property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public IntelProfilesRequestBuilder intelProfiles() {
        return new IntelProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passiveDnsRecords property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public PassiveDnsRecordsRequestBuilder passiveDnsRecords() {
        return new PassiveDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the vulnerabilities property of the microsoft.graph.security.threatIntelligence entity.
     */
    @jakarta.annotation.Nonnull
    public VulnerabilitiesRequestBuilder vulnerabilities() {
        return new VulnerabilitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ThreatIntelligenceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ThreatIntelligenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ThreatIntelligenceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ThreatIntelligenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property threatIntelligence for security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property threatIntelligence for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
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
     * Get threatIntelligence from security
     * @return a CompletableFuture of threatIntelligence
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatIntelligence> get() {
        return get(null);
    }
    /**
     * Get threatIntelligence from security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of threatIntelligence
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatIntelligence> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ThreatIntelligence::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property threatIntelligence in security
     * @param body The request body
     * @return a CompletableFuture of threatIntelligence
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatIntelligence> patch(@jakarta.annotation.Nonnull final ThreatIntelligence body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property threatIntelligence in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of threatIntelligence
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ThreatIntelligence> patch(@jakarta.annotation.Nonnull final ThreatIntelligence body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ThreatIntelligence::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property threatIntelligence for security
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property threatIntelligence for security
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
     * Get threatIntelligence from security
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get threatIntelligence from security
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
     * Update the navigation property threatIntelligence in security
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ThreatIntelligence body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property threatIntelligence in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ThreatIntelligence body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a threatIntelligenceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ThreatIntelligenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ThreatIntelligenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get threatIntelligence from security
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
