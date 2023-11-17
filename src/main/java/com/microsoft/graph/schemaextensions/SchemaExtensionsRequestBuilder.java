package com.microsoft.graph.schemaextensions;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SchemaExtension;
import com.microsoft.graph.models.SchemaExtensionCollectionResponse;
import com.microsoft.graph.schemaextensions.count.CountRequestBuilder;
import com.microsoft.graph.schemaextensions.item.SchemaExtensionItemRequestBuilder;
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
 * Provides operations to manage the collection of schemaExtension entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchemaExtensionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of schemaExtension entities.
     * @param schemaExtensionId The unique identifier of schemaExtension
     * @return a SchemaExtensionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SchemaExtensionItemRequestBuilder bySchemaExtensionId(@jakarta.annotation.Nonnull final String schemaExtensionId) {
        Objects.requireNonNull(schemaExtensionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schemaExtension%2Did", schemaExtensionId);
        return new SchemaExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SchemaExtensionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaExtensionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schemaExtensions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SchemaExtensionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaExtensionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/schemaExtensions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of schemaExtension objects in your tenant. The schema extensions can be InDevelopment, Available, or Deprecated and includes schema extensions: This API is available in the following national cloud deployments.
     * @return a SchemaExtensionCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/schemaextension-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchemaExtensionCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of schemaExtension objects in your tenant. The schema extensions can be InDevelopment, Available, or Deprecated and includes schema extensions: This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SchemaExtensionCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/schemaextension-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchemaExtensionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, SchemaExtensionCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new schemaExtension definition and its associated schema extension property to extend a supporting resource type. Schema extensions let you add strongly-typed custom data to a resource. The app that creates a schema extension is the owner app. Depending on the state of the extension, the owner app, and only the owner app, may update or delete the extension.  See examples of how to define a schema extension that describes a training course, use the schema extension definition to create a new group with training course data, and add training course data to an existing group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a SchemaExtension
     * @see <a href="https://learn.microsoft.com/graph/api/schemaextension-post-schemaextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchemaExtension post(@jakarta.annotation.Nonnull final SchemaExtension body) {
        return post(body, null);
    }
    /**
     * Create a new schemaExtension definition and its associated schema extension property to extend a supporting resource type. Schema extensions let you add strongly-typed custom data to a resource. The app that creates a schema extension is the owner app. Depending on the state of the extension, the owner app, and only the owner app, may update or delete the extension.  See examples of how to define a schema extension that describes a training course, use the schema extension definition to create a new group with training course data, and add training course data to an existing group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SchemaExtension
     * @see <a href="https://learn.microsoft.com/graph/api/schemaextension-post-schemaextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchemaExtension post(@jakarta.annotation.Nonnull final SchemaExtension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, SchemaExtension::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a list of schemaExtension objects in your tenant. The schema extensions can be InDevelopment, Available, or Deprecated and includes schema extensions: This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of schemaExtension objects in your tenant. The schema extensions can be InDevelopment, Available, or Deprecated and includes schema extensions: This API is available in the following national cloud deployments.
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
     * Create a new schemaExtension definition and its associated schema extension property to extend a supporting resource type. Schema extensions let you add strongly-typed custom data to a resource. The app that creates a schema extension is the owner app. Depending on the state of the extension, the owner app, and only the owner app, may update or delete the extension.  See examples of how to define a schema extension that describes a training course, use the schema extension definition to create a new group with training course data, and add training course data to an existing group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SchemaExtension body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new schemaExtension definition and its associated schema extension property to extend a supporting resource type. Schema extensions let you add strongly-typed custom data to a resource. The app that creates a schema extension is the owner app. Depending on the state of the extension, the owner app, and only the owner app, may update or delete the extension.  See examples of how to define a schema extension that describes a training course, use the schema extension definition to create a new group with training course data, and add training course data to an existing group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SchemaExtension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SchemaExtensionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SchemaExtensionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SchemaExtensionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of schemaExtension objects in your tenant. The schema extensions can be InDevelopment, Available, or Deprecated and includes schema extensions: This API is available in the following national cloud deployments.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
