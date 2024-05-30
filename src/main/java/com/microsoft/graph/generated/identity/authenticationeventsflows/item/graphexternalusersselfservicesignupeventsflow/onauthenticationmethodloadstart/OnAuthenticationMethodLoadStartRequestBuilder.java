package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.graphonauthenticationmethodloadstartexternalusersselfservicesignup.GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnAuthenticationMethodLoadStartHandler;
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
 * Builds and executes requests for operations under /identity/authenticationEventsFlows/{authenticationEventsFlow-id}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnAuthenticationMethodLoadStartRequestBuilder extends BaseRequestBuilder {
    /**
     * Casts the previous resource to onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp.
     * @return a {@link GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder graphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp() {
        return new GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OnAuthenticationMethodLoadStartRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnAuthenticationMethodLoadStartRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link OnAuthenticationMethodLoadStartRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnAuthenticationMethodLoadStartRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart{?%24expand,%24select}", rawUrl);
    }
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     * @return a {@link OnAuthenticationMethodLoadStartHandler}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAuthenticationMethodLoadStartHandler get() {
        return get(null);
    }
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OnAuthenticationMethodLoadStartHandler}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAuthenticationMethodLoadStartHandler get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnAuthenticationMethodLoadStartHandler::createFromDiscriminatorValue);
    }
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
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
     * @return a {@link OnAuthenticationMethodLoadStartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnAuthenticationMethodLoadStartRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OnAuthenticationMethodLoadStartRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.
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
