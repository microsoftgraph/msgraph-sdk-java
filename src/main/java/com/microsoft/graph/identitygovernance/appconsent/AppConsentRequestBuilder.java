package com.microsoft.graph.identitygovernance.appconsent;

import com.microsoft.graph.identitygovernance.appconsent.appconsentrequests.AppConsentRequestsRequestBuilder;
import com.microsoft.graph.models.AppConsentApprovalRoute;
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
 * Provides operations to manage the appConsent property of the microsoft.graph.identityGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConsentRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the appConsentRequests property of the microsoft.graph.appConsentApprovalRoute entity.
     */
    @jakarta.annotation.Nonnull
    public AppConsentRequestsRequestBuilder appConsentRequests() {
        return new AppConsentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AppConsentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppConsentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/appConsent{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AppConsentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AppConsentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/appConsent{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property appConsent for identityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property appConsent for identityGovernance
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
     * Get appConsent from identityGovernance
     * @return a CompletableFuture of AppConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AppConsentApprovalRoute> get() {
        return get(null);
    }
    /**
     * Get appConsent from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AppConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AppConsentApprovalRoute> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AppConsentApprovalRoute::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property appConsent in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of AppConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AppConsentApprovalRoute> patch(@jakarta.annotation.Nonnull final AppConsentApprovalRoute body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property appConsent in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AppConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AppConsentApprovalRoute> patch(@jakarta.annotation.Nonnull final AppConsentApprovalRoute body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AppConsentApprovalRoute::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property appConsent for identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property appConsent for identityGovernance
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
     * Get appConsent from identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get appConsent from identityGovernance
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
     * Update the navigation property appConsent in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AppConsentApprovalRoute body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property appConsent in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AppConsentApprovalRoute body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a AppConsentRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AppConsentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AppConsentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get appConsent from identityGovernance
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
