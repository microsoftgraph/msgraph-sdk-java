package com.microsoft.graph.identity.authenticationeventsflows.item.conditions;

import com.microsoft.graph.identity.authenticationeventsflows.item.conditions.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.models.AuthenticationConditions;
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
 * Builds and executes requests for operations under /identity/authenticationEventsFlows/{authenticationEventsFlow-id}/conditions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionsRequestBuilder extends BaseRequestBuilder {
    /**
     * The applications property
     * @return a {@link ApplicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConditionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConditionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ConditionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConditionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/conditions{?%24expand,%24select}", rawUrl);
    }
    /**
     * The conditions representing the context of the authentication request that&apos;s used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @return a {@link AuthenticationConditions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditions get() {
        return get(null);
    }
    /**
     * The conditions representing the context of the authentication request that&apos;s used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationConditions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditions get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationConditions::createFromDiscriminatorValue);
    }
    /**
     * The conditions representing the context of the authentication request that&apos;s used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The conditions representing the context of the authentication request that&apos;s used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ConditionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConditionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConditionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The conditions representing the context of the authentication request that&apos;s used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
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
}
