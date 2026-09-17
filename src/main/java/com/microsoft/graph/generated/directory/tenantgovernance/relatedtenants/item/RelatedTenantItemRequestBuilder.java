package com.microsoft.graph.directory.tenantgovernance.relatedtenants.item;

import com.microsoft.graph.directory.tenantgovernance.relatedtenants.item.appb2bsigninactivitymetrics.AppB2BSignInActivityMetricsRequestBuilder;
import com.microsoft.graph.directory.tenantgovernance.relatedtenants.item.b2bregistrationmetrics.B2BRegistrationMetricsRequestBuilder;
import com.microsoft.graph.directory.tenantgovernance.relatedtenants.item.b2bsigninactivitymetrics.B2BSignInActivityMetricsRequestBuilder;
import com.microsoft.graph.directory.tenantgovernance.relatedtenants.item.billingmetrics.BillingMetricsRequestBuilder;
import com.microsoft.graph.directory.tenantgovernance.relatedtenants.item.multitenantapplicationmetrics.MultiTenantApplicationMetricsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RelatedTenant;
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
 * Provides operations to manage the relatedTenants property of the microsoft.graph.tenantGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedTenantItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appB2BSignInActivityMetrics property of the microsoft.graph.relatedTenant entity.
     * @return a {@link AppB2BSignInActivityMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppB2BSignInActivityMetricsRequestBuilder appB2BSignInActivityMetrics() {
        return new AppB2BSignInActivityMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the b2BRegistrationMetrics property of the microsoft.graph.relatedTenant entity.
     * @return a {@link B2BRegistrationMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public B2BRegistrationMetricsRequestBuilder b2BRegistrationMetrics() {
        return new B2BRegistrationMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the b2BSignInActivityMetrics property of the microsoft.graph.relatedTenant entity.
     * @return a {@link B2BSignInActivityMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public B2BSignInActivityMetricsRequestBuilder b2BSignInActivityMetrics() {
        return new B2BSignInActivityMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the billingMetrics property of the microsoft.graph.relatedTenant entity.
     * @return a {@link BillingMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BillingMetricsRequestBuilder billingMetrics() {
        return new BillingMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the multiTenantApplicationMetrics property of the microsoft.graph.relatedTenant entity.
     * @return a {@link MultiTenantApplicationMetricsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MultiTenantApplicationMetricsRequestBuilder multiTenantApplicationMetrics() {
        return new MultiTenantApplicationMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link RelatedTenantItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RelatedTenantItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/tenantGovernance/relatedTenants/{relatedTenant%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link RelatedTenantItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RelatedTenantItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/tenantGovernance/relatedTenants/{relatedTenant%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property relatedTenants for directory
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property relatedTenants for directory
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
     * Get relatedTenants from directory
     * @return a {@link RelatedTenant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RelatedTenant get() {
        return get(null);
    }
    /**
     * Get relatedTenants from directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RelatedTenant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RelatedTenant get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RelatedTenant::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property relatedTenants in directory
     * @param body The request body
     * @return a {@link RelatedTenant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RelatedTenant patch(@jakarta.annotation.Nonnull final RelatedTenant body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property relatedTenants in directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RelatedTenant}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public RelatedTenant patch(@jakarta.annotation.Nonnull final RelatedTenant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RelatedTenant::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property relatedTenants for directory
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property relatedTenants for directory
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
     * Get relatedTenants from directory
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get relatedTenants from directory
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
     * Update the navigation property relatedTenants in directory
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RelatedTenant body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property relatedTenants in directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final RelatedTenant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RelatedTenantItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RelatedTenantItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RelatedTenantItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get relatedTenants from directory
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
