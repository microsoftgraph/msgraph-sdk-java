package com.microsoft.graph.agreementacceptances.item;

import com.microsoft.graph.models.AgreementAcceptance;
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
 * Provides operations to manage the collection of agreementAcceptance entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgreementAcceptanceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AgreementAcceptanceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgreementAcceptanceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/agreementAcceptances/{agreementAcceptance%2Did}{?%24select}", pathParameters);
    }
    /**
     * Instantiates a new AgreementAcceptanceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AgreementAcceptanceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/agreementAcceptances/{agreementAcceptance%2Did}{?%24select}", rawUrl);
    }
    /**
     * Delete entity from agreementAcceptances
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete entity from agreementAcceptances
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get entity from agreementAcceptances by key
     * @return a CompletableFuture of AgreementAcceptance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AgreementAcceptance> get() {
        return get(null);
    }
    /**
     * Get entity from agreementAcceptances by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AgreementAcceptance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AgreementAcceptance> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AgreementAcceptance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update entity in agreementAcceptances
     * @param body The request body
     * @return a CompletableFuture of AgreementAcceptance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AgreementAcceptance> patch(@jakarta.annotation.Nonnull final AgreementAcceptance body) {
        return patch(body, null);
    }
    /**
     * Update entity in agreementAcceptances
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AgreementAcceptance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AgreementAcceptance> patch(@jakarta.annotation.Nonnull final AgreementAcceptance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AgreementAcceptance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete entity from agreementAcceptances
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from agreementAcceptances
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entity from agreementAcceptances by key
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from agreementAcceptances by key
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
     * Update entity in agreementAcceptances
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AgreementAcceptance body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in agreementAcceptances
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AgreementAcceptance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a AgreementAcceptanceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AgreementAcceptanceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entity from agreementAcceptances by key
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
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
