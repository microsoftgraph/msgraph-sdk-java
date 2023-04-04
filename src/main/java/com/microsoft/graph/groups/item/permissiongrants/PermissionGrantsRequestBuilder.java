package com.microsoft.graph.groups.item.permissiongrants;

import com.microsoft.graph.groups.item.permissiongrants.count.CountRequestBuilder;
import com.microsoft.graph.groups.item.permissiongrants.delta.DeltaRequestBuilder;
import com.microsoft.graph.groups.item.permissiongrants.getavailableextensionproperties.GetAvailableExtensionPropertiesRequestBuilder;
import com.microsoft.graph.groups.item.permissiongrants.getbyids.GetByIdsRequestBuilder;
import com.microsoft.graph.groups.item.permissiongrants.validateproperties.ValidatePropertiesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.ResourceSpecificPermissionGrantCollectionResponse;
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
 * Provides operations to manage the permissionGrants property of the microsoft.graph.group entity.
 */
public class PermissionGrantsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to count the resources in the collection. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the delta method. */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getAvailableExtensionProperties method. */
    @javax.annotation.Nonnull
    public GetAvailableExtensionPropertiesRequestBuilder getAvailableExtensionProperties() {
        return new GetAvailableExtensionPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getByIds method. */
    @javax.annotation.Nonnull
    public GetByIdsRequestBuilder getByIds() {
        return new GetByIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the validateProperties method. */
    @javax.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PermissionGrantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PermissionGrantsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/permissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PermissionGrantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PermissionGrantsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/permissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List all resource-specific permission grants on the group. This list specifies the Azure AD apps that have access to the **group**, along with the corresponding kind of resource-specific access that each app has.
     * @return a CompletableFuture of ResourceSpecificPermissionGrantCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/group-list-permissiongrants?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrantCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all resource-specific permission grants on the group. This list specifies the Azure AD apps that have access to the **group**, along with the corresponding kind of resource-specific access that each app has.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ResourceSpecificPermissionGrantCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/group-list-permissiongrants?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrantCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to permissionGrants for groups
     * @param body The request body
     * @return a CompletableFuture of resourceSpecificPermissionGrant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> post(@javax.annotation.Nonnull final ResourceSpecificPermissionGrant body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to permissionGrants for groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of resourceSpecificPermissionGrant
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> post(@javax.annotation.Nonnull final ResourceSpecificPermissionGrant body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * List all resource-specific permission grants on the group. This list specifies the Azure AD apps that have access to the **group**, along with the corresponding kind of resource-specific access that each app has.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * List all resource-specific permission grants on the group. This list specifies the Azure AD apps that have access to the **group**, along with the corresponding kind of resource-specific access that each app has.
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
     * Create new navigation property to permissionGrants for groups
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ResourceSpecificPermissionGrant body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to permissionGrants for groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final ResourceSpecificPermissionGrant body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * List all resource-specific permission grants on the group. This list specifies the Azure AD apps that have access to the **group**, along with the corresponding kind of resource-specific access that each app has.
     */
    public class GetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
