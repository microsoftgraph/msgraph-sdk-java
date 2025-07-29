package com.microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.item;

import com.microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /servicePrincipals/{servicePrincipal-id}/tokenLifetimePolicies/{tokenLifetimePolicy-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenLifetimePolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TokenLifetimePolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenLifetimePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/tokenLifetimePolicies/{tokenLifetimePolicy%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link TokenLifetimePolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenLifetimePolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/tokenLifetimePolicies/{tokenLifetimePolicy%2Did}", rawUrl);
    }
}
