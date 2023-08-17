package com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnenotePage;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.content.ContentRequestBuilder;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.copytosection.CopyToSectionRequestBuilder;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.onenotepatchcontent.OnenotePatchContentRequestBuilder;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.parentnotebook.ParentNotebookRequestBuilder;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.parentsection.ParentSectionRequestBuilder;
import com.microsoft.graph.sites.item.onenote.sectiongroups.item.sections.item.pages.item.preview.PreviewRequestBuilder;
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
 * Provides operations to manage the pages property of the microsoft.graph.onenoteSection entity.
 */
public class OnenotePageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the site entity.
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copyToSection method.
     */
    @jakarta.annotation.Nonnull
    public CopyToSectionRequestBuilder copyToSection() {
        return new CopyToSectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the onenotePatchContent method.
     */
    @jakarta.annotation.Nonnull
    public OnenotePatchContentRequestBuilder onenotePatchContent() {
        return new OnenotePatchContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentNotebook property of the microsoft.graph.onenotePage entity.
     */
    @jakarta.annotation.Nonnull
    public ParentNotebookRequestBuilder parentNotebook() {
        return new ParentNotebookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentSection property of the microsoft.graph.onenotePage entity.
     */
    @jakarta.annotation.Nonnull
    public ParentSectionRequestBuilder parentSection() {
        return new ParentSectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the preview method.
     */
    @jakarta.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OnenotePageItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenotePageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnenotePageItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenotePageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property pages for sites
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property pages for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @return a CompletableFuture of onenotePage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> get() {
        return get(null);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onenotePage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, OnenotePage::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @return a CompletableFuture of onenotePage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> patch(@jakarta.annotation.Nonnull final OnenotePage body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onenotePage
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> patch(@jakarta.annotation.Nonnull final OnenotePage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, OnenotePage::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property pages for sites
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property pages for sites
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
     * The collection of pages in the section.  Read-only. Nullable.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
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
     * Update the navigation property pages in sites
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenotePage body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenotePage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
