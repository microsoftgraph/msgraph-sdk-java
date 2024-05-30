package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.conditions.ConditionsRequestBuilder;
import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onattributecollection.OnAttributeCollectionRequestBuilder;
import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.OnAuthenticationMethodLoadStartRequestBuilder;
import com.microsoft.graph.models.ExternalUsersSelfServiceSignUpEventsFlow;
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
 * Casts the previous resource to externalUsersSelfServiceSignUpEventsFlow.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder extends BaseRequestBuilder {
    /**
     * The conditions property
     * @return a {@link ConditionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConditionsRequestBuilder conditions() {
        return new ConditionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The onAttributeCollection property
     * @return a {@link OnAttributeCollectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnAttributeCollectionRequestBuilder onAttributeCollection() {
        return new OnAttributeCollectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The onAuthenticationMethodLoadStart property
     * @return a {@link OnAuthenticationMethodLoadStartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnAuthenticationMethodLoadStartRequestBuilder onAuthenticationMethodLoadStart() {
        return new OnAuthenticationMethodLoadStartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.authenticationEventsFlow as microsoft.graph.externalUsersSelfServiceSignUpEventsFlow
     * @return a {@link ExternalUsersSelfServiceSignUpEventsFlow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ExternalUsersSelfServiceSignUpEventsFlow get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.authenticationEventsFlow as microsoft.graph.externalUsersSelfServiceSignUpEventsFlow
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ExternalUsersSelfServiceSignUpEventsFlow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ExternalUsersSelfServiceSignUpEventsFlow get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ExternalUsersSelfServiceSignUpEventsFlow::createFromDiscriminatorValue);
    }
    /**
     * Get the item of type microsoft.graph.authenticationEventsFlow as microsoft.graph.externalUsersSelfServiceSignUpEventsFlow
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.authenticationEventsFlow as microsoft.graph.externalUsersSelfServiceSignUpEventsFlow
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
     * @return a {@link GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphExternalUsersSelfServiceSignUpEventsFlowRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the item of type microsoft.graph.authenticationEventsFlow as microsoft.graph.externalUsersSelfServiceSignUpEventsFlow
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
