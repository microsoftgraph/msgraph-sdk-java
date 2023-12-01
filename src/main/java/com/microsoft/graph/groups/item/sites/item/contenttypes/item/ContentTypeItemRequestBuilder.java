package com.microsoft.graph.groups.item.sites.item.contenttypes.item;

import com.microsoft.graph.groups.item.sites.item.contenttypes.item.associatewithhubsites.AssociateWithHubSitesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.base.BaseRequestBuilderEscaped;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.basetypes.BaseTypesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.columnlinks.ColumnLinksRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.columnpositions.ColumnPositionsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.copytodefaultcontentlocation.CopyToDefaultContentLocationRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.ispublished.IsPublishedRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.publish.PublishRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.contenttypes.item.unpublish.UnpublishRequestBuilder;
import com.microsoft.graph.models.ContentType;
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
 * Provides operations to manage the contentTypes property of the microsoft.graph.site entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the associateWithHubSites method.
     */
    @jakarta.annotation.Nonnull
    public AssociateWithHubSitesRequestBuilder associateWithHubSites() {
        return new AssociateWithHubSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the base property of the microsoft.graph.contentType entity.
     */
    @jakarta.annotation.Nonnull
    public BaseRequestBuilderEscaped base() {
        return new BaseRequestBuilderEscaped(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the baseTypes property of the microsoft.graph.contentType entity.
     */
    @jakarta.annotation.Nonnull
    public BaseTypesRequestBuilder baseTypes() {
        return new BaseTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columnLinks property of the microsoft.graph.contentType entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnLinksRequestBuilder columnLinks() {
        return new ColumnLinksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columnPositions property of the microsoft.graph.contentType entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnPositionsRequestBuilder columnPositions() {
        return new ColumnPositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.contentType entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copyToDefaultContentLocation method.
     */
    @jakarta.annotation.Nonnull
    public CopyToDefaultContentLocationRequestBuilder copyToDefaultContentLocation() {
        return new CopyToDefaultContentLocationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isPublished method.
     */
    @jakarta.annotation.Nonnull
    public IsPublishedRequestBuilder isPublished() {
        return new IsPublishedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the publish method.
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unpublish method.
     */
    @jakarta.annotation.Nonnull
    public UnpublishRequestBuilder unpublish() {
        return new UnpublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ContentTypeItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/contentTypes/{contentType%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ContentTypeItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContentTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/contentTypes/{contentType%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Remove a content type][contentType] from a [list][] or a [site][]. This API is available in the following [national cloud deployments.
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Remove a content type][contentType] from a [list][] or a [site][]. This API is available in the following [national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the metadata for a content type][contentType] in a [site][] or a [list][]. This API is available in the following [national cloud deployments.
     * @return a ContentType
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentType get() {
        return get(null);
    }
    /**
     * Retrieve the metadata for a content type][contentType] in a [site][] or a [list][]. This API is available in the following [national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ContentType
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentType get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContentType::createFromDiscriminatorValue);
    }
    /**
     * Update a content type][contentType]. This API is available in the following [national cloud deployments.
     * @param body The request body
     * @return a ContentType
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentType patch(@jakarta.annotation.Nonnull final ContentType body) {
        return patch(body, null);
    }
    /**
     * Update a content type][contentType]. This API is available in the following [national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ContentType
     * @see <a href="https://learn.microsoft.com/graph/api/contenttype-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentType patch(@jakarta.annotation.Nonnull final ContentType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContentType::createFromDiscriminatorValue);
    }
    /**
     * Remove a content type][contentType] from a [list][] or a [site][]. This API is available in the following [national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Remove a content type][contentType] from a [list][] or a [site][]. This API is available in the following [national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the metadata for a content type][contentType] in a [site][] or a [list][]. This API is available in the following [national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the metadata for a content type][contentType] in a [site][] or a [list][]. This API is available in the following [national cloud deployments.
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
     * Update a content type][contentType]. This API is available in the following [national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ContentType body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a content type][contentType]. This API is available in the following [national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ContentType body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ContentTypeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ContentTypeItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ContentTypeItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the metadata for a content type][contentType] in a [site][] or a [list][]. This API is available in the following [national cloud deployments.
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
