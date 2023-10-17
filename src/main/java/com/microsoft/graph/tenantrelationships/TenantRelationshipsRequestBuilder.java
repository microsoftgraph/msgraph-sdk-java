package com.microsoft.graph.tenantrelationships;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TenantRelationship;
import com.microsoft.graph.tenantrelationships.delegatedadmincustomers.DelegatedAdminCustomersRequestBuilder;
import com.microsoft.graph.tenantrelationships.delegatedadminrelationships.DelegatedAdminRelationshipsRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbydomainnamewithdomainname.FindTenantInformationByDomainNameWithDomainNameRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbytenantidwithtenantid.FindTenantInformationByTenantIdWithTenantIdRequestBuilder;
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
 * Provides operations to manage the tenantRelationship singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantRelationshipsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the delegatedAdminCustomers property of the microsoft.graph.tenantRelationship entity.
     */
    @jakarta.annotation.Nonnull
    public DelegatedAdminCustomersRequestBuilder delegatedAdminCustomers() {
        return new DelegatedAdminCustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the delegatedAdminRelationships property of the microsoft.graph.tenantRelationship entity.
     */
    @jakarta.annotation.Nonnull
    public DelegatedAdminRelationshipsRequestBuilder delegatedAdminRelationships() {
        return new DelegatedAdminRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TenantRelationshipsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantRelationshipsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TenantRelationshipsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantRelationshipsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to call the findTenantInformationByDomainName method.
     * @param domainName Usage: domainName='{domainName}'
     * @return a FindTenantInformationByDomainNameWithDomainNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FindTenantInformationByDomainNameWithDomainNameRequestBuilder findTenantInformationByDomainNameWithDomainName(@jakarta.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new FindTenantInformationByDomainNameWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Provides operations to call the findTenantInformationByTenantId method.
     * @param tenantId Usage: tenantId='{tenantId}'
     * @return a FindTenantInformationByTenantIdWithTenantIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder findTenantInformationByTenantIdWithTenantId(@jakarta.annotation.Nonnull final String tenantId) {
        Objects.requireNonNull(tenantId);
        return new FindTenantInformationByTenantIdWithTenantIdRequestBuilder(pathParameters, requestAdapter, tenantId);
    }
    /**
     * Get tenantRelationships
     * @return a CompletableFuture of TenantRelationship
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> get() {
        return get(null);
    }
    /**
     * Get tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of TenantRelationship
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @return a CompletableFuture of TenantRelationship
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> patch(@jakarta.annotation.Nonnull final TenantRelationship body) {
        return patch(body, null);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of TenantRelationship
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> patch(@jakarta.annotation.Nonnull final TenantRelationship body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get tenantRelationships
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get tenantRelationships
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
     * Update tenantRelationships
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final TenantRelationship body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final TenantRelationship body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TenantRelationshipsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TenantRelationshipsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TenantRelationshipsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get tenantRelationships
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
