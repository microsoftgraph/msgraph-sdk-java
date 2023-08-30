package com.microsoft.graph.serviceprincipals.item.synchronization;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.serviceprincipals.item.synchronization.acquireaccesstoken.AcquireAccessTokenRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.synchronization.jobs.JobsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.synchronization.secrets.SecretsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.synchronization.templates.TemplatesRequestBuilder;
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
 * Provides operations to manage the synchronization property of the microsoft.graph.servicePrincipal entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the acquireAccessToken method.
     */
    @jakarta.annotation.Nonnull
    public AcquireAccessTokenRequestBuilder acquireAccessToken() {
        return new AcquireAccessTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the jobs property of the microsoft.graph.synchronization entity.
     */
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The secrets property
     */
    @jakarta.annotation.Nonnull
    public SecretsRequestBuilder secrets() {
        return new SecretsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templates property of the microsoft.graph.synchronization entity.
     */
    @jakarta.annotation.Nonnull
    public TemplatesRequestBuilder templates() {
        return new TemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SynchronizationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SynchronizationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property synchronization for servicePrincipals
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property synchronization for servicePrincipals
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
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     * @return a CompletableFuture of synchronization
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> get() {
        return get(null);
    }
    /**
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of synchronization
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Synchronization::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property synchronization in servicePrincipals
     * @param body The request body
     * @return a CompletableFuture of synchronization
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> put(@jakarta.annotation.Nonnull final Synchronization body) {
        return put(body, null);
    }
    /**
     * Update the navigation property synchronization in servicePrincipals
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of synchronization
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> put(@jakarta.annotation.Nonnull final Synchronization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Synchronization::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property synchronization for servicePrincipals
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property synchronization for servicePrincipals
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
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
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
     * Update the navigation property synchronization in servicePrincipals
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Synchronization body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update the navigation property synchronization in servicePrincipals
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final Synchronization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PUT;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PutRequestConfiguration requestConfig = new PutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a synchronizationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SynchronizationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SynchronizationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
