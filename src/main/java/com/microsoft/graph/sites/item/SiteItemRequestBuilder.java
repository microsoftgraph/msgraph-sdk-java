package com.microsoft.graph.sites.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.sites.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.sites.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.sites.item.contenttypes.ContentTypesRequestBuilder;
import com.microsoft.graph.sites.item.contenttypes.item.ContentTypeItemRequestBuilder;
import com.microsoft.graph.sites.item.drive.DriveRequestBuilder;
import com.microsoft.graph.sites.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.sites.item.drives.item.DriveItemRequestBuilder;
import com.microsoft.graph.sites.item.externalcolumns.ExternalColumnsRequestBuilder;
import com.microsoft.graph.sites.item.externalcolumns.item.ColumnDefinitionItemRequestBuilder;
import com.microsoft.graph.sites.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getapplicablecontenttypesforlistwithlistid.GetApplicableContentTypesForListWithListIdRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.GetByPathWithPathRequestBuilder;
import com.microsoft.graph.sites.item.items.item.BaseItemItemRequestBuilder;
import com.microsoft.graph.sites.item.items.ItemsRequestBuilder;
import com.microsoft.graph.sites.item.lists.item.ListItemRequestBuilder;
import com.microsoft.graph.sites.item.lists.ListsRequestBuilder;
import com.microsoft.graph.sites.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.sites.item.operations.item.RichLongRunningOperationItemRequestBuilder;
import com.microsoft.graph.sites.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.sites.item.permissions.item.PermissionItemRequestBuilder;
import com.microsoft.graph.sites.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.sites.item.sites.SitesRequestBuilder;
import com.microsoft.graph.sites.item.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.sites.item.termstores.item.StoreItemRequestBuilder;
import com.microsoft.graph.sites.item.termstores.TermStoresRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of site entities. */
public class SiteItemRequestBuilder {
    /** The analytics property */
    @javax.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The columns property */
    @javax.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contentTypes property */
    @javax.annotation.Nonnull
    public ContentTypesRequestBuilder contentTypes() {
        return new ContentTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drive property */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drives property */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The externalColumns property */
    @javax.annotation.Nonnull
    public ExternalColumnsRequestBuilder externalColumns() {
        return new ExternalColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The items property */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The lists property */
    @javax.annotation.Nonnull
    public ListsRequestBuilder lists() {
        return new ListsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onenote property */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operations property */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The permissions property */
    @javax.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The sites property */
    @javax.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The termStore property */
    @javax.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The termStores property */
    @javax.annotation.Nonnull
    public TermStoresRequestBuilder termStores() {
        return new TermStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.columns.item collection
     * @param id Unique identifier of the item
     * @return a ColumnDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.sites.item.columns.item.ColumnDefinitionItemRequestBuilder columns(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("columnDefinition%2Did", id);
        return new com.microsoft.graph.sites.item.columns.item.ColumnDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SiteItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/sites/{site%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SiteItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/sites/{site%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.contentTypes.item collection
     * @param id Unique identifier of the item
     * @return a ContentTypeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContentTypeItemRequestBuilder contentTypes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contentType%2Did", id);
        return new ContentTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SiteItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final SiteItemRequestBuilderGetRequestConfiguration requestConfig = new SiteItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in sites
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Site body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in sites
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Site body, @javax.annotation.Nullable final java.util.function.Consumer<SiteItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final SiteItemRequestBuilderPatchRequestConfiguration requestConfig = new SiteItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.drives.item collection
     * @param id Unique identifier of the item
     * @return a DriveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.externalColumns.item collection
     * @param id Unique identifier of the item
     * @return a ColumnDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.sites.item.externalcolumns.item.ColumnDefinitionItemRequestBuilder externalColumns(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("columnDefinition%2Did", id);
        return new com.microsoft.graph.sites.item.externalcolumns.item.ColumnDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Site>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> get(@javax.annotation.Nullable final java.util.function.Consumer<SiteItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Site>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @return a getActivitiesByIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
     * @return a getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String interval, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Provides operations to call the getApplicableContentTypesForList method.
     * @param listId Usage: listId='{listId}'
     * @return a getApplicableContentTypesForListWithListIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetApplicableContentTypesForListWithListIdRequestBuilder getApplicableContentTypesForListWithListId(@javax.annotation.Nonnull final String listId) {
        Objects.requireNonNull(listId);
        return new GetApplicableContentTypesForListWithListIdRequestBuilder(pathParameters, requestAdapter, listId);
    }
    /**
     * Provides operations to call the getByPath method.
     * @param path Usage: path='{path}'
     * @return a getByPathWithPathRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetByPathWithPathRequestBuilder getByPathWithPath(@javax.annotation.Nonnull final String path) {
        Objects.requireNonNull(path);
        return new GetByPathWithPathRequestBuilder(pathParameters, requestAdapter, path);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.items.item collection
     * @param id Unique identifier of the item
     * @return a BaseItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BaseItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("baseItem%2Did", id);
        return new BaseItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.lists.item collection
     * @param id Unique identifier of the item
     * @return a ListItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ListItemRequestBuilder lists(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("list%2Did", id);
        return new ListItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.operations.item collection
     * @param id Unique identifier of the item
     * @return a RichLongRunningOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RichLongRunningOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("richLongRunningOperation%2Did", id);
        return new RichLongRunningOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in sites
     * @param body 
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> patch(@javax.annotation.Nonnull final Site body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Site>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update entity in sites
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> patch(@javax.annotation.Nonnull final Site body, @javax.annotation.Nullable final java.util.function.Consumer<SiteItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Site>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.permissions.item collection
     * @param id Unique identifier of the item
     * @return a PermissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PermissionItemRequestBuilder permissions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permission%2Did", id);
        return new PermissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.sites.item collection
     * @param id Unique identifier of the item
     * @return a SiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder sites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did1", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.sites.item.termStores.item collection
     * @param id Unique identifier of the item
     * @return a StoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public StoreItemRequestBuilder termStores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("store%2Did", id);
        return new StoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint. */
    public class SiteItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SiteItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public SiteItemRequestBuilderGetQueryParameters queryParameters = new SiteItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new SiteItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public SiteItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SiteItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new SiteItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public SiteItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
