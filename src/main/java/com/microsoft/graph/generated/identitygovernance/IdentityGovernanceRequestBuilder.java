package com.microsoft.graph.identitygovernance;

import com.microsoft.graph.identitygovernance.accessreviews.AccessReviewsRequestBuilder;
import com.microsoft.graph.identitygovernance.appconsent.AppConsentRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.EntitlementManagementRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.LifecycleWorkflowsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.identitygovernance.termsofuse.TermsOfUseRequestBuilder;
import com.microsoft.graph.models.IdentityGovernance;
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
 * Provides operations to manage the identityGovernance singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityGovernanceRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessReviews property of the microsoft.graph.identityGovernance entity.
     * @return a {@link AccessReviewsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewsRequestBuilder accessReviews() {
        return new AccessReviewsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appConsent property of the microsoft.graph.identityGovernance entity.
     * @return a {@link AppConsentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppConsentRequestBuilder appConsent() {
        return new AppConsentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity.
     * @return a {@link EntitlementManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EntitlementManagementRequestBuilder entitlementManagement() {
        return new EntitlementManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lifecycleWorkflows property of the microsoft.graph.identityGovernance entity.
     * @return a {@link LifecycleWorkflowsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LifecycleWorkflowsRequestBuilder lifecycleWorkflows() {
        return new LifecycleWorkflowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the privilegedAccess property of the microsoft.graph.identityGovernance entity.
     * @return a {@link PrivilegedAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess() {
        return new PrivilegedAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termsOfUse property of the microsoft.graph.identityGovernance entity.
     * @return a {@link TermsOfUseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TermsOfUseRequestBuilder termsOfUse() {
        return new TermsOfUseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IdentityGovernanceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityGovernanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link IdentityGovernanceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityGovernanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get identityGovernance
     * @return a {@link IdentityGovernance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityGovernance get() {
        return get(null);
    }
    /**
     * Get identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityGovernance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityGovernance get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityGovernance::createFromDiscriminatorValue);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @return a {@link IdentityGovernance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityGovernance patch(@jakarta.annotation.Nonnull final IdentityGovernance body) {
        return patch(body, null);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityGovernance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IdentityGovernance patch(@jakarta.annotation.Nonnull final IdentityGovernance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityGovernance::createFromDiscriminatorValue);
    }
    /**
     * Get identityGovernance
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get identityGovernance
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
     * Update identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityGovernance body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityGovernance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IdentityGovernanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityGovernanceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IdentityGovernanceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get identityGovernance
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
