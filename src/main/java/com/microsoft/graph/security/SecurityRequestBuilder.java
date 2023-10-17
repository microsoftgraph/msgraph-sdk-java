package com.microsoft.graph.security;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.security.alerts_v2.AlertsV2RequestBuilder;
import com.microsoft.graph.security.alerts.AlertsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.AttackSimulationRequestBuilder;
import com.microsoft.graph.security.cases.CasesRequestBuilder;
import com.microsoft.graph.security.incidents.IncidentsRequestBuilder;
import com.microsoft.graph.security.microsoftgraphsecurityrunhuntingquery.MicrosoftGraphSecurityRunHuntingQueryRequestBuilder;
import com.microsoft.graph.security.securescorecontrolprofiles.SecureScoreControlProfilesRequestBuilder;
import com.microsoft.graph.security.securescores.SecureScoresRequestBuilder;
import com.microsoft.graph.security.subjectrightsrequests.SubjectRightsRequestsRequestBuilder;
import com.microsoft.graph.security.threatintelligence.ThreatIntelligenceRequestBuilder;
import com.microsoft.graph.security.triggers.TriggersRequestBuilder;
import com.microsoft.graph.security.triggertypes.TriggerTypesRequestBuilder;
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
 * Provides operations to manage the security singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public AlertsV2RequestBuilder alertsV2() {
        return new AlertsV2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attackSimulation property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public AttackSimulationRequestBuilder attackSimulation() {
        return new AttackSimulationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cases property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public CasesRequestBuilder cases() {
        return new CasesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the incidents property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public IncidentsRequestBuilder incidents() {
        return new IncidentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the runHuntingQuery method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRunHuntingQueryRequestBuilder microsoftGraphSecurityRunHuntingQuery() {
        return new MicrosoftGraphSecurityRunHuntingQueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public SecureScoreControlProfilesRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScores property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public SecureScoresRequestBuilder secureScores() {
        return new SecureScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subjectRightsRequests property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectRightsRequestsRequestBuilder subjectRightsRequests() {
        return new SubjectRightsRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatIntelligence property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public ThreatIntelligenceRequestBuilder threatIntelligence() {
        return new ThreatIntelligenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the triggers property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public TriggersRequestBuilder triggers() {
        return new TriggersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the triggerTypes property of the microsoft.graph.security entity.
     */
    @jakarta.annotation.Nonnull
    public TriggerTypesRequestBuilder triggerTypes() {
        return new TriggerTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get security
     * @return a CompletableFuture of Security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get() {
        return get(null);
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update security
     * @param body The request body
     * @return a CompletableFuture of Security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@jakarta.annotation.Nonnull final Security body) {
        return patch(body, null);
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@jakarta.annotation.Nonnull final Security body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get security
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get security
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
     * Update security
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Security body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Security body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a SecurityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SecurityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get security
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
