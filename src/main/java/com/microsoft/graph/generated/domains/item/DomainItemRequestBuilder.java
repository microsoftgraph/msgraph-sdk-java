package com.microsoft.graph.domains.item;

import com.microsoft.graph.domains.item.domainnamereferences.DomainNameReferencesRequestBuilder;
import com.microsoft.graph.domains.item.federationconfiguration.FederationConfigurationRequestBuilder;
import com.microsoft.graph.domains.item.forcedelete.ForceDeleteRequestBuilder;
import com.microsoft.graph.domains.item.promote.PromoteRequestBuilder;
import com.microsoft.graph.domains.item.rootdomain.RootDomainRequestBuilder;
import com.microsoft.graph.domains.item.serviceconfigurationrecords.ServiceConfigurationRecordsRequestBuilder;
import com.microsoft.graph.domains.item.verificationdnsrecords.VerificationDnsRecordsRequestBuilder;
import com.microsoft.graph.domains.item.verify.VerifyRequestBuilder;
import com.microsoft.graph.models.Domain;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the collection of domain entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the domainNameReferences property of the microsoft.graph.domain entity.
     * @return a {@link DomainNameReferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainNameReferencesRequestBuilder domainNameReferences() {
        return new DomainNameReferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the federationConfiguration property of the microsoft.graph.domain entity.
     * @return a {@link FederationConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FederationConfigurationRequestBuilder federationConfiguration() {
        return new FederationConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the forceDelete method.
     * @return a {@link ForceDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForceDeleteRequestBuilder forceDelete() {
        return new ForceDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the promote method.
     * @return a {@link PromoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromoteRequestBuilder promote() {
        return new PromoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rootDomain property of the microsoft.graph.domain entity.
     * @return a {@link RootDomainRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RootDomainRequestBuilder rootDomain() {
        return new RootDomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the serviceConfigurationRecords property of the microsoft.graph.domain entity.
     * @return a {@link ServiceConfigurationRecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceConfigurationRecordsRequestBuilder serviceConfigurationRecords() {
        return new ServiceConfigurationRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the verificationDnsRecords property of the microsoft.graph.domain entity.
     * @return a {@link VerificationDnsRecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerificationDnsRecordsRequestBuilder verificationDnsRecords() {
        return new VerificationDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the verify method.
     * @return a {@link VerifyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DomainItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains/{domain%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DomainItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains/{domain%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a domain from a tenant.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a domain from a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of domain object.
     * @return a {@link Domain}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Domain get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of domain object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Domain}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Domain get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Domain::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of domain object. Only verified domains can be updated.
     * @param body The request body
     * @return a {@link Domain}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Domain patch(@jakarta.annotation.Nonnull final Domain body) {
        return patch(body, null);
    }
    /**
     * Update the properties of domain object. Only verified domains can be updated.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Domain}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/domain-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Domain patch(@jakarta.annotation.Nonnull final Domain body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Domain::createFromDiscriminatorValue);
    }
    /**
     * Delete a domain from a tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a domain from a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of domain object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of domain object.
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
     * Update the properties of domain object. Only verified domains can be updated.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Domain body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of domain object. Only verified domains can be updated.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Domain body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DomainItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DomainItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of domain object.
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
