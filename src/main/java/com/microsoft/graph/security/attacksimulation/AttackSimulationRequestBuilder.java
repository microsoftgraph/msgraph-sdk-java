package com.microsoft.graph.security.attacksimulation;

import com.microsoft.graph.models.AttackSimulationRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.security.attacksimulation.endusernotifications.EndUserNotificationsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.landingpages.LandingPagesRequestBuilder;
import com.microsoft.graph.security.attacksimulation.loginpages.LoginPagesRequestBuilder;
import com.microsoft.graph.security.attacksimulation.operations.OperationsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.payloads.PayloadsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.simulationautomations.SimulationAutomationsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.simulations.SimulationsRequestBuilder;
import com.microsoft.graph.security.attacksimulation.trainings.TrainingsRequestBuilder;
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
 * Provides operations to manage the attackSimulation property of the microsoft.graph.security entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the endUserNotifications property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public EndUserNotificationsRequestBuilder endUserNotifications() {
        return new EndUserNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the landingPages property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public LandingPagesRequestBuilder landingPages() {
        return new LandingPagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the loginPages property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public LoginPagesRequestBuilder loginPages() {
        return new LoginPagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the payloads property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public PayloadsRequestBuilder payloads() {
        return new PayloadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the simulationAutomations property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SimulationAutomationsRequestBuilder simulationAutomations() {
        return new SimulationAutomationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the simulations property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SimulationsRequestBuilder simulations() {
        return new SimulationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the trainings property of the microsoft.graph.attackSimulationRoot entity.
     */
    @jakarta.annotation.Nonnull
    public TrainingsRequestBuilder trainings() {
        return new TrainingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AttackSimulationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttackSimulationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/attackSimulation{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AttackSimulationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttackSimulationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/attackSimulation{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property attackSimulation for security
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property attackSimulation for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get attackSimulation from security
     * @return a CompletableFuture of AttackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> get() {
        return get(null);
    }
    /**
     * Get attackSimulation from security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AttackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AttackSimulationRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @return a CompletableFuture of AttackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> patch(@jakarta.annotation.Nonnull final AttackSimulationRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AttackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> patch(@jakarta.annotation.Nonnull final AttackSimulationRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AttackSimulationRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property attackSimulation for security
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property attackSimulation for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        return requestInfo;
    }
    /**
     * Get attackSimulation from security
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get attackSimulation from security
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
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AttackSimulationRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AttackSimulationRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a AttackSimulationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AttackSimulationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AttackSimulationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get attackSimulation from security
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
