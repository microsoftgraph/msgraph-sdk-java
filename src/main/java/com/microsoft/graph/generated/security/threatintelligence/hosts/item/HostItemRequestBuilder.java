package com.microsoft.graph.security.threatintelligence.hosts.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.Host;
import com.microsoft.graph.security.threatintelligence.hosts.item.childhostpairs.ChildHostPairsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.components.ComponentsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.cookies.CookiesRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.hostpairs.HostPairsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.parenthostpairs.ParentHostPairsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.passivedns.PassiveDnsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.passivednsreverse.PassiveDnsReverseRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.ports.PortsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.reputation.ReputationRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.sslcertificates.SslCertificatesRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.subdomains.SubdomainsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.trackers.TrackersRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.whois.WhoisRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the hosts property of the microsoft.graph.security.threatIntelligence entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the childHostPairs property of the microsoft.graph.security.host entity.
     * @return a {@link ChildHostPairsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChildHostPairsRequestBuilder childHostPairs() {
        return new ChildHostPairsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the components property of the microsoft.graph.security.host entity.
     * @return a {@link ComponentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComponentsRequestBuilder components() {
        return new ComponentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cookies property of the microsoft.graph.security.host entity.
     * @return a {@link CookiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CookiesRequestBuilder cookies() {
        return new CookiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the hostPairs property of the microsoft.graph.security.host entity.
     * @return a {@link HostPairsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HostPairsRequestBuilder hostPairs() {
        return new HostPairsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentHostPairs property of the microsoft.graph.security.host entity.
     * @return a {@link ParentHostPairsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ParentHostPairsRequestBuilder parentHostPairs() {
        return new ParentHostPairsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passiveDns property of the microsoft.graph.security.host entity.
     * @return a {@link PassiveDnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PassiveDnsRequestBuilder passiveDns() {
        return new PassiveDnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passiveDnsReverse property of the microsoft.graph.security.host entity.
     * @return a {@link PassiveDnsReverseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PassiveDnsReverseRequestBuilder passiveDnsReverse() {
        return new PassiveDnsReverseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ports property of the microsoft.graph.security.host entity.
     * @return a {@link PortsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PortsRequestBuilder ports() {
        return new PortsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reputation property of the microsoft.graph.security.host entity.
     * @return a {@link ReputationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReputationRequestBuilder reputation() {
        return new ReputationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sslCertificates property of the microsoft.graph.security.host entity.
     * @return a {@link SslCertificatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SslCertificatesRequestBuilder sslCertificates() {
        return new SslCertificatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subdomains property of the microsoft.graph.security.host entity.
     * @return a {@link SubdomainsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubdomainsRequestBuilder subdomains() {
        return new SubdomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the trackers property of the microsoft.graph.security.host entity.
     * @return a {@link TrackersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrackersRequestBuilder trackers() {
        return new TrackersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the whois property of the microsoft.graph.security.host entity.
     * @return a {@link WhoisRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WhoisRequestBuilder whois() {
        return new WhoisRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link HostItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HostItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence/hosts/{host%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link HostItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HostItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence/hosts/{host%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property hosts for security
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property hosts for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @return a {@link Host}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Host get() {
        return get(null);
    }
    /**
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Host}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Host get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Host::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property hosts in security
     * @param body The request body
     * @return a {@link Host}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Host patch(@jakarta.annotation.Nonnull final Host body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property hosts in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Host}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Host patch(@jakarta.annotation.Nonnull final Host body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Host::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property hosts for security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property hosts for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property hosts in security
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Host body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property hosts in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Host body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link HostItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HostItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new HostItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
