package com.microsoft.graph.reports.security;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SecurityReportsRoot;
import com.microsoft.graph.reports.security.getattacksimulationrepeatoffenders.GetAttackSimulationRepeatOffendersRequestBuilder;
import com.microsoft.graph.reports.security.getattacksimulationsimulationusercoverage.GetAttackSimulationSimulationUserCoverageRequestBuilder;
import com.microsoft.graph.reports.security.getattacksimulationtrainingusercoverage.GetAttackSimulationTrainingUserCoverageRequestBuilder;
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
 * Provides operations to manage the security property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the getAttackSimulationRepeatOffenders method.
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationRepeatOffendersRequestBuilder getAttackSimulationRepeatOffenders() {
        return new GetAttackSimulationRepeatOffendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAttackSimulationSimulationUserCoverage method.
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationSimulationUserCoverageRequestBuilder getAttackSimulationSimulationUserCoverage() {
        return new GetAttackSimulationSimulationUserCoverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAttackSimulationTrainingUserCoverage method.
     */
    @jakarta.annotation.Nonnull
    public GetAttackSimulationTrainingUserCoverageRequestBuilder getAttackSimulationTrainingUserCoverage() {
        return new GetAttackSimulationTrainingUserCoverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/security{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SecurityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/security{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property security for reports
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property security for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot get() {
        return get(null);
    }
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SecurityReportsRoot::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property security in reports
     * @param body The request body
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot patch(@jakarta.annotation.Nonnull final SecurityReportsRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property security in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot patch(@jakarta.annotation.Nonnull final SecurityReportsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SecurityReportsRoot::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property security for reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property security for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property security in reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SecurityReportsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property security in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SecurityReportsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a SecurityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SecurityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
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
