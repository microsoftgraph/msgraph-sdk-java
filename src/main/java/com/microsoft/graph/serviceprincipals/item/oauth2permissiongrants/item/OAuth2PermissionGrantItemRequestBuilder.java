package com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.item;

import com.microsoft.graph.models.OAuth2PermissionGrant;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity.
 */
public class OAuth2PermissionGrantItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new OAuth2PermissionGrantItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OAuth2PermissionGrantItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/oauth2PermissionGrants/{oAuth2PermissionGrant%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OAuth2PermissionGrantItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OAuth2PermissionGrantItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/oauth2PermissionGrants/{oAuth2PermissionGrant%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a CompletableFuture of oAuth2PermissionGrant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OAuth2PermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> executionException = new java.util.concurrent.CompletableFuture<OAuth2PermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of oAuth2PermissionGrant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OAuth2PermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> executionException = new java.util.concurrent.CompletableFuture<OAuth2PermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
