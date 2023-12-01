package com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants;

import com.microsoft.graph.models.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.count.CountRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
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
 * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Oauth2PermissionGrantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity.
     * @param oAuth2PermissionGrantId The unique identifier of oAuth2PermissionGrant
     * @return a OAuth2PermissionGrantItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder byOAuth2PermissionGrantId(@jakarta.annotation.Nonnull final String oAuth2PermissionGrantId) {
        Objects.requireNonNull(oAuth2PermissionGrantId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", oAuth2PermissionGrantId);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Oauth2PermissionGrantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public Oauth2PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/oauth2PermissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new Oauth2PermissionGrantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public Oauth2PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/oauth2PermissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant entities, representing delegated permissions granted to the service principal (representing the client application) to access an API on behalf of a user. This API is available in the following national cloud deployments.
     * @return a OAuth2PermissionGrantCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-list-oauth2permissiongrants?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrantCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant entities, representing delegated permissions granted to the service principal (representing the client application) to access an API on behalf of a user. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuth2PermissionGrantCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-list-oauth2permissiongrants?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OAuth2PermissionGrantCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuth2PermissionGrantCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant entities, representing delegated permissions granted to the service principal (representing the client application) to access an API on behalf of a user. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant entities, representing delegated permissions granted to the service principal (representing the client application) to access an API on behalf of a user. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a Oauth2PermissionGrantsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new Oauth2PermissionGrantsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of oAuth2PermissionGrant entities, representing delegated permissions granted to the service principal (representing the client application) to access an API on behalf of a user. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
