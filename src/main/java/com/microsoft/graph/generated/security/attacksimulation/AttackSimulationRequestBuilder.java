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
 * Provides operations to manage the attackSimulation property of the microsoft.graph.security entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the endUserNotifications property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link EndUserNotificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EndUserNotificationsRequestBuilder endUserNotifications() {
        return new EndUserNotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the landingPages property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link LandingPagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LandingPagesRequestBuilder landingPages() {
        return new LandingPagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the loginPages property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link LoginPagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoginPagesRequestBuilder loginPages() {
        return new LoginPagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the payloads property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link PayloadsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayloadsRequestBuilder payloads() {
        return new PayloadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the simulationAutomations property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link SimulationAutomationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SimulationAutomationsRequestBuilder simulationAutomations() {
        return new SimulationAutomationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the simulations property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link SimulationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SimulationsRequestBuilder simulations() {
        return new SimulationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the trainings property of the microsoft.graph.attackSimulationRoot entity.
     * @return a {@link TrainingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrainingsRequestBuilder trainings() {
        return new TrainingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AttackSimulationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttackSimulationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/attackSimulation{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AttackSimulationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttackSimulationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/attackSimulation{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property attackSimulation for security
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property attackSimulation for security
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
     * Get attackSimulation from security
     * @return a {@link AttackSimulationRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot get() {
        return get(null);
    }
    /**
     * Get attackSimulation from security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AttackSimulationRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AttackSimulationRoot::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @return a {@link AttackSimulationRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot patch(@jakarta.annotation.Nonnull final AttackSimulationRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AttackSimulationRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot patch(@jakarta.annotation.Nonnull final AttackSimulationRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AttackSimulationRoot::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property attackSimulation for security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property attackSimulation for security
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
     * Get attackSimulation from security
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get attackSimulation from security
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
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AttackSimulationRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property attackSimulation in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AttackSimulationRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AttackSimulationRequestBuilder}
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
