package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.graphonauthenticationmethodloadstartexternalusersselfservicesignup.identityproviders.item;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onauthenticationmethodloadstart.graphonauthenticationmethodloadstartexternalusersselfservicesignup.identityproviders.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identity/authenticationEventsFlows/{authenticationEventsFlow-id}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart/graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp/identityProviders/{identityProviderBase-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityProviderBaseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of identityContainer entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IdentityProviderBaseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityProviderBaseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart/graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp/identityProviders/{identityProviderBase%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link IdentityProviderBaseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityProviderBaseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAuthenticationMethodLoadStart/graph.onAuthenticationMethodLoadStartExternalUsersSelfServiceSignUp/identityProviders/{identityProviderBase%2Did}", rawUrl);
    }
}
