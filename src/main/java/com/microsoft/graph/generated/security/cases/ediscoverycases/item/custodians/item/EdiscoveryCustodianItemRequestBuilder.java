package com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryCustodian;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.lastindexoperation.LastIndexOperationRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.microsoftgraphsecurityactivate.MicrosoftGraphSecurityActivateRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.microsoftgraphsecurityapplyhold.MicrosoftGraphSecurityApplyHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.microsoftgraphsecurityrelease.MicrosoftGraphSecurityReleaseRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.microsoftgraphsecurityremovehold.MicrosoftGraphSecurityRemoveHoldRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.microsoftgraphsecurityupdateindex.MicrosoftGraphSecurityUpdateIndexRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.sitesources.SiteSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.unifiedgroupsources.UnifiedGroupSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.usersources.UserSourcesRequestBuilder;
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
 * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryCustodianItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the lastIndexOperation property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @return a {@link LastIndexOperationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastIndexOperationRequestBuilder lastIndexOperation() {
        return new LastIndexOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the activate method.
     * @return a {@link MicrosoftGraphSecurityActivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityActivateRequestBuilder microsoftGraphSecurityActivate() {
        return new MicrosoftGraphSecurityActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     * @return a {@link MicrosoftGraphSecurityApplyHoldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityApplyHoldRequestBuilder microsoftGraphSecurityApplyHold() {
        return new MicrosoftGraphSecurityApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the release method.
     * @return a {@link MicrosoftGraphSecurityReleaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityReleaseRequestBuilder microsoftGraphSecurityRelease() {
        return new MicrosoftGraphSecurityReleaseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     * @return a {@link MicrosoftGraphSecurityRemoveHoldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRemoveHoldRequestBuilder microsoftGraphSecurityRemoveHold() {
        return new MicrosoftGraphSecurityRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateIndex method.
     * @return a {@link MicrosoftGraphSecurityUpdateIndexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityUpdateIndexRequestBuilder microsoftGraphSecurityUpdateIndex() {
        return new MicrosoftGraphSecurityUpdateIndexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @return a {@link SiteSourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteSourcesRequestBuilder siteSources() {
        return new SiteSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the unifiedGroupSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @return a {@link UnifiedGroupSourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnifiedGroupSourcesRequestBuilder unifiedGroupSources() {
        return new UnifiedGroupSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userSources property of the microsoft.graph.security.ediscoveryCustodian entity.
     * @return a {@link UserSourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserSourcesRequestBuilder userSources() {
        return new UserSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EdiscoveryCustodianItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdiscoveryCustodianItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link EdiscoveryCustodianItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EdiscoveryCustodianItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property custodians for security
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property custodians for security
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
     * Read the properties and relationships of an ediscoveryCustodian object.
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an ediscoveryCustodian object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycustodian-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoveryCustodian::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property custodians in security
     * @param body The request body
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian patch(@jakarta.annotation.Nonnull final EdiscoveryCustodian body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property custodians in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian patch(@jakarta.annotation.Nonnull final EdiscoveryCustodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoveryCustodian::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property custodians for security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property custodians for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an ediscoveryCustodian object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an ediscoveryCustodian object.
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
     * Update the navigation property custodians in security
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryCustodian body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property custodians in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryCustodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians/{ediscoveryCustodian%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EdiscoveryCustodianItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EdiscoveryCustodianItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EdiscoveryCustodianItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an ediscoveryCustodian object.
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
