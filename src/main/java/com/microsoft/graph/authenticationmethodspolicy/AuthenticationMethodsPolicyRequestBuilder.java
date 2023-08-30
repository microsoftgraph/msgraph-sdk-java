package com.microsoft.graph.authenticationmethodspolicy;

import com.microsoft.graph.authenticationmethodspolicy.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.models.AuthenticationMethodsPolicy;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the authenticationMethodsPolicy singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsPolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the authenticationMethodConfigurations property of the microsoft.graph.authenticationMethodsPolicy entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationMethodsPolicyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsPolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/authenticationMethodsPolicy{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AuthenticationMethodsPolicyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsPolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/authenticationMethodsPolicy{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get authenticationMethodsPolicy
     * @return a CompletableFuture of authenticationMethodsPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsPolicy> get() {
        return get(null);
    }
    /**
     * Get authenticationMethodsPolicy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationMethodsPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsPolicy> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsPolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update authenticationMethodsPolicy
     * @param body The request body
     * @return a CompletableFuture of authenticationMethodsPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsPolicy> patch(@jakarta.annotation.Nonnull final AuthenticationMethodsPolicy body) {
        return patch(body, null);
    }
    /**
     * Update authenticationMethodsPolicy
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationMethodsPolicy
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsPolicy> patch(@jakarta.annotation.Nonnull final AuthenticationMethodsPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsPolicy::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get authenticationMethodsPolicy
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get authenticationMethodsPolicy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Update authenticationMethodsPolicy
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsPolicy body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update authenticationMethodsPolicy
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a authenticationMethodsPolicyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationMethodsPolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get authenticationMethodsPolicy
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
