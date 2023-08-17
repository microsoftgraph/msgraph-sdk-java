package com.microsoft.graph.serviceprincipals.item.synchronization.secrets;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import com.microsoft.graph.serviceprincipals.item.synchronization.secrets.count.CountRequestBuilder;
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
 * Builds and executes requests for operations under /servicePrincipals/{servicePrincipal-id}/synchronization/secrets
 */
public class SecretsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SecretsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecretsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization/secrets", pathParameters);
    }
    /**
     * Instantiates a new SecretsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecretsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization/secrets", rawUrl);
    }
    /**
     * Update property secrets value.
     * @param body The request body
     * @return a CompletableFuture of synchronizationSecretKeyStringValuePair
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<java.util.List<SynchronizationSecretKeyStringValuePair>> put(@jakarta.annotation.Nonnull final java.util.List<SynchronizationSecretKeyStringValuePair> body) {
        return put(body, null);
    }
    /**
     * Update property secrets value.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of synchronizationSecretKeyStringValuePair
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<java.util.List<SynchronizationSecretKeyStringValuePair>> put(@jakarta.annotation.Nonnull final java.util.List<SynchronizationSecretKeyStringValuePair> body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollectionAsync(requestInfo, SynchronizationSecretKeyStringValuePair::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update property secrets value.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final java.util.List<SynchronizationSecretKeyStringValuePair> body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update property secrets value.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final java.util.List<SynchronizationSecretKeyStringValuePair> body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body.toArray(new SynchronizationSecretKeyStringValuePair[0]));
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
