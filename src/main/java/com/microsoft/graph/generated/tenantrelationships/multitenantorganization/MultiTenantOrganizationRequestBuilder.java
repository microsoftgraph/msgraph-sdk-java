package com.microsoft.graph.tenantrelationships.multitenantorganization;

import com.microsoft.graph.models.MultiTenantOrganization;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.tenantrelationships.multitenantorganization.joinrequest.JoinRequestRequestBuilder;
import com.microsoft.graph.tenantrelationships.multitenantorganization.tenants.TenantsRequestBuilder;
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
 * Provides operations to manage the multiTenantOrganization property of the microsoft.graph.tenantRelationship entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganizationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the joinRequest property of the microsoft.graph.multiTenantOrganization entity.
     * @return a {@link JoinRequestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public JoinRequestRequestBuilder joinRequest() {
        return new JoinRequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenants property of the microsoft.graph.multiTenantOrganization entity.
     * @return a {@link TenantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TenantsRequestBuilder tenants() {
        return new TenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MultiTenantOrganizationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MultiTenantOrganizationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/multiTenantOrganization{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link MultiTenantOrganizationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MultiTenantOrganizationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/multiTenantOrganization{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get properties of the multitenant organization.
     * @return a {@link MultiTenantOrganization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/multitenantorganization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganization get() {
        return get(null);
    }
    /**
     * Get properties of the multitenant organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MultiTenantOrganization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/multitenantorganization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganization get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MultiTenantOrganization::createFromDiscriminatorValue);
    }
    /**
     * Create a new multitenant organization. By default, the creator tenant becomes an owner tenant upon successful creation. Only owner tenants can manage a multitenant organization.
     * @param body The request body
     * @return a {@link MultiTenantOrganization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tenantrelationship-put-multitenantorganization?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganization put(@jakarta.annotation.Nonnull final MultiTenantOrganization body) {
        return put(body, null);
    }
    /**
     * Create a new multitenant organization. By default, the creator tenant becomes an owner tenant upon successful creation. Only owner tenants can manage a multitenant organization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MultiTenantOrganization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tenantrelationship-put-multitenantorganization?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganization put(@jakarta.annotation.Nonnull final MultiTenantOrganization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MultiTenantOrganization::createFromDiscriminatorValue);
    }
    /**
     * Get properties of the multitenant organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get properties of the multitenant organization.
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
     * Create a new multitenant organization. By default, the creator tenant becomes an owner tenant upon successful creation. Only owner tenants can manage a multitenant organization.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MultiTenantOrganization body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Create a new multitenant organization. By default, the creator tenant becomes an owner tenant upon successful creation. Only owner tenants can manage a multitenant organization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MultiTenantOrganization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MultiTenantOrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MultiTenantOrganizationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MultiTenantOrganizationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get properties of the multitenant organization.
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
