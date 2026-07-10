package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.graphonauthenticationmethodloadstartexternalusersselfservicesignup;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.graphonauthenticationmethodloadstartexternalusersselfservicesignup.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Casts the previous resource to onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the identityProviders property of the microsoft.graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp entity.
     * @return a {@link IdentityProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart/graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart/graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.onAuthenticationMethodLoadStartHandler as microsoft.graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp
     * @return a {@link OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.onAuthenticationMethodLoadStartHandler as microsoft.graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp::createFromDiscriminatorValue);
    }
    /**
     * Get the item of type microsoft.graph.onAuthenticationMethodLoadStartHandler as microsoft.graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.onAuthenticationMethodLoadStartHandler as microsoft.graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphOnAuthenticationMethodLoadStartExternalUsersSelfServiceSignUpRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
