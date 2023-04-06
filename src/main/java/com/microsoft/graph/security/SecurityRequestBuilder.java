package com.microsoft.graph.security;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.security.alerts_v2.AlertsV2RequestBuilder;
import com.microsoft.graph.security.alerts.AlertsRequestBuilder;
import com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder;
import com.microsoft.graph.security.attacksimulation.AttackSimulationRequestBuilder;
import com.microsoft.graph.security.cases.CasesRequestBuilder;
import com.microsoft.graph.security.incidents.IncidentsRequestBuilder;
import com.microsoft.graph.security.incidents.item.IncidentItemRequestBuilder;
import com.microsoft.graph.security.securescorecontrolprofiles.item.SecureScoreControlProfileItemRequestBuilder;
import com.microsoft.graph.security.securescorecontrolprofiles.SecureScoreControlProfilesRequestBuilder;
import com.microsoft.graph.security.securescores.item.SecureScoreItemRequestBuilder;
import com.microsoft.graph.security.securescores.SecureScoresRequestBuilder;
import com.microsoft.graph.security.securityrunhuntingquery.SecurityRunHuntingQueryRequestBuilder;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the security singleton.
 */
public class SecurityRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the alerts property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public AlertsRequestBuilder alerts() {
        return new AlertsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public AlertsV2RequestBuilder alerts_v2() {
        return new AlertsV2RequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the attackSimulation property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public AttackSimulationRequestBuilder attackSimulation() {
        return new AttackSimulationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cases property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public CasesRequestBuilder cases() {
        return new CasesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the incidents property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public IncidentsRequestBuilder incidents() {
        return new IncidentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SecureScoreControlProfilesRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the secureScores property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public SecureScoresRequestBuilder secureScores() {
        return new SecureScoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the runHuntingQuery method. */
    @javax.annotation.Nonnull
    public SecurityRunHuntingQueryRequestBuilder securityRunHuntingQuery() {
        return new SecurityRunHuntingQueryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the triggers property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public TriggersRequestBuilder triggers() {
        return new TriggersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the triggerTypes property of the microsoft.graph.security entity. */
    @javax.annotation.Nonnull
    public TriggerTypesRequestBuilder triggerTypes() {
        return new TriggerTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a AlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder alerts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("alert%2Did", id);
        return new com.microsoft.graph.security.alerts.item.AlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the alerts_v2 property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a AlertItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.security.alerts_v2.item.AlertItemRequestBuilder alerts_v2(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("alert%2Did", id);
        return new com.microsoft.graph.security.alerts_v2.item.AlertItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get security
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Security> executionException = new java.util.concurrent.CompletableFuture<Security>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Security> executionException = new java.util.concurrent.CompletableFuture<Security>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the incidents property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a IncidentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IncidentItemRequestBuilder incidents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("incident%2Did", id);
        return new IncidentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update security
     * @param body The request body
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@javax.annotation.Nonnull final Security body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Security> executionException = new java.util.concurrent.CompletableFuture<Security>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of security
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Security> patch(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Security::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Security> executionException = new java.util.concurrent.CompletableFuture<Security>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the secureScoreControlProfiles property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SecureScoreControlProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreControlProfileItemRequestBuilder secureScoreControlProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScoreControlProfile%2Did", id);
        return new SecureScoreControlProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the secureScores property of the microsoft.graph.security entity.
     * @param id Unique identifier of the item
     * @return a SecureScoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SecureScoreItemRequestBuilder secureScores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secureScore%2Did", id);
        return new SecureScoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update security
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Security body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Security body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get security
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
