package com.microsoft.graph.tenantrelationships;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TenantRelationship;
import com.microsoft.graph.tenantrelationships.delegatedadmincustomers.DelegatedAdminCustomersRequestBuilder;
import com.microsoft.graph.tenantrelationships.delegatedadminrelationships.DelegatedAdminRelationshipsRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbydomainnamewithdomainname.FindTenantInformationByDomainNameWithDomainNameRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbytenantidwithtenantid.FindTenantInformationByTenantIdWithTenantIdRequestBuilder;
import com.microsoft.graph.tenantrelationships.multitenantorganization.MultiTenantOrganizationRequestBuilder;
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
 * Provides operations to manage the tenantRelationship singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantRelationshipsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the delegatedAdminCustomers property of the microsoft.graph.tenantRelationship entity.
     * @return a {@link DelegatedAdminCustomersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DelegatedAdminCustomersRequestBuilder delegatedAdminCustomers() {
        return new DelegatedAdminCustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the delegatedAdminRelationships property of the microsoft.graph.tenantRelationship entity.
     * @return a {@link DelegatedAdminRelationshipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DelegatedAdminRelationshipsRequestBuilder delegatedAdminRelationships() {
        return new DelegatedAdminRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the multiTenantOrganization property of the microsoft.graph.tenantRelationship entity.
     * @return a {@link MultiTenantOrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MultiTenantOrganizationRequestBuilder multiTenantOrganization() {
        return new MultiTenantOrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TenantRelationshipsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantRelationshipsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link TenantRelationshipsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TenantRelationshipsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships{?%24expand,%24select}", rawUrl);
    }
    /**
     * Provides operations to call the findTenantInformationByDomainName method.
     * @param domainName Usage: domainName='{domainName}'
     * @return a {@link FindTenantInformationByDomainNameWithDomainNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindTenantInformationByDomainNameWithDomainNameRequestBuilder findTenantInformationByDomainNameWithDomainName(@jakarta.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new FindTenantInformationByDomainNameWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Provides operations to call the findTenantInformationByTenantId method.
     * @param tenantId Usage: tenantId='{tenantId}'
     * @return a {@link FindTenantInformationByTenantIdWithTenantIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder findTenantInformationByTenantIdWithTenantId(@jakarta.annotation.Nonnull final String tenantId) {
        Objects.requireNonNull(tenantId);
        return new FindTenantInformationByTenantIdWithTenantIdRequestBuilder(pathParameters, requestAdapter, tenantId);
    }
    /**
     * Get tenantRelationships
     * @return a {@link TenantRelationship}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TenantRelationship get() {
        return get(null);
    }
    /**
     * Get tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TenantRelationship}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TenantRelationship get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TenantRelationship::createFromDiscriminatorValue);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @return a {@link TenantRelationship}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TenantRelationship patch(@jakarta.annotation.Nonnull final TenantRelationship body) {
        return patch(body, null);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TenantRelationship}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TenantRelationship patch(@jakarta.annotation.Nonnull final TenantRelationship body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TenantRelationship::createFromDiscriminatorValue);
    }
    /**
     * Get tenantRelationships
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get tenantRelationships
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
     * Update tenantRelationships
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final TenantRelationship body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final TenantRelationship body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link TenantRelationshipsRequestBuilder}
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
