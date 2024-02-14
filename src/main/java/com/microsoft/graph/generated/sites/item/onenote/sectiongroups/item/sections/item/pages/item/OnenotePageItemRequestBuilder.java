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
import com.microsoft.kiota.QueryParameters;
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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenotePageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the site entity.
     * @return a {@link ContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copyToSection method.
     * @return a {@link CopyToSectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CopyToSectionRequestBuilder copyToSection() {
        return new CopyToSectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the onenotePatchContent method.
     * @return a {@link OnenotePatchContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnenotePatchContentRequestBuilder onenotePatchContent() {
        return new OnenotePatchContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentNotebook property of the microsoft.graph.onenotePage entity.
     * @return a {@link ParentNotebookRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ParentNotebookRequestBuilder parentNotebook() {
        return new ParentNotebookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentSection property of the microsoft.graph.onenotePage entity.
     * @return a {@link ParentSectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ParentSectionRequestBuilder parentSection() {
        return new ParentSectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the preview method.
     * @return a {@link PreviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OnenotePageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenotePageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link OnenotePageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenotePageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property pages for sites
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property pages for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @return a {@link OnenotePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnenotePage get() {
        return get(null);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OnenotePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnenotePage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnenotePage::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @return a {@link OnenotePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnenotePage patch(@jakarta.annotation.Nonnull final OnenotePage body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OnenotePage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnenotePage patch(@jakarta.annotation.Nonnull final OnenotePage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnenotePage::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property pages for sites
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property pages for sites
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenotePage body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property pages in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenotePage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}/sections/{onenoteSection%2Did}/pages/{onenotePage%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OnenotePageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnenotePageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OnenotePageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
