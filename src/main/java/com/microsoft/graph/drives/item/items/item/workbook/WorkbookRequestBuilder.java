package com.microsoft.graph.drives.item.items.item.workbook;

import com.microsoft.graph.drives.item.items.item.workbook.application.ApplicationRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.closesession.CloseSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.comments.CommentsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.comments.item.WorkbookCommentItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.createsession.CreateSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.FunctionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.names.item.WorkbookNamedItemItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.names.NamesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.operations.item.WorkbookOperationItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.operations.OperationsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.refreshsession.RefreshSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.sessioninforesourcewithkey.SessionInfoResourceWithKeyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tablerowoperationresultwithkey.TableRowOperationResultWithKeyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.WorkbookTableItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.TablesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.WorkbookWorksheetItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.WorksheetsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Workbook;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
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
/**
 * Provides operations to manage the workbook property of the microsoft.graph.driveItem entity.
 */
public class WorkbookRequestBuilder {
    /** Provides operations to manage the application property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public ApplicationRequestBuilder application() {
        return new ApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the closeSession method. */
    @javax.annotation.Nonnull
    public CloseSessionRequestBuilder closeSession() {
        return new CloseSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the comments property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public CommentsRequestBuilder comments() {
        return new CommentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createSession method. */
    @javax.annotation.Nonnull
    public CreateSessionRequestBuilder createSession() {
        return new CreateSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the functions property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the names property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the refreshSession method. */
    @javax.annotation.Nonnull
    public RefreshSessionRequestBuilder refreshSession() {
        return new RefreshSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the tables property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public TablesRequestBuilder tables() {
        return new TablesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the worksheets property of the microsoft.graph.workbook entity. */
    @javax.annotation.Nonnull
    public WorksheetsRequestBuilder worksheets() {
        return new WorksheetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the comments property of the microsoft.graph.workbook entity.
     * @param id Unique identifier of the item
     * @return a WorkbookCommentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookCommentItemRequestBuilder comments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookComment%2Did", id);
        return new WorkbookCommentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WorkbookRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new WorkbookRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property workbook for drives
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property workbook for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a CompletableFuture of workbook
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workbook> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workbook::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workbook> executionException = new java.util.concurrent.CompletableFuture<Workbook>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbook
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workbook> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workbook::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workbook> executionException = new java.util.concurrent.CompletableFuture<Workbook>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.workbook entity.
     * @param id Unique identifier of the item
     * @return a WorkbookNamedItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookNamedItemItemRequestBuilder names(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookNamedItem%2Did", id);
        return new WorkbookNamedItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.workbook entity.
     * @param id Unique identifier of the item
     * @return a WorkbookOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookOperation%2Did", id);
        return new WorkbookOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @return a CompletableFuture of workbook
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workbook> patch(@javax.annotation.Nonnull final Workbook body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workbook::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workbook> executionException = new java.util.concurrent.CompletableFuture<Workbook>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbook
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workbook> patch(@javax.annotation.Nonnull final Workbook body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workbook::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workbook> executionException = new java.util.concurrent.CompletableFuture<Workbook>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the sessionInfoResource method.
     * @param key Usage: key='{key}'
     * @return a sessionInfoResourceWithKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public SessionInfoResourceWithKeyRequestBuilder sessionInfoResourceWithKey(@javax.annotation.Nonnull final String key) {
        Objects.requireNonNull(key);
        return new SessionInfoResourceWithKeyRequestBuilder(pathParameters, requestAdapter, key);
    }
    /**
     * Provides operations to call the tableRowOperationResult method.
     * @param key Usage: key='{key}'
     * @return a tableRowOperationResultWithKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public TableRowOperationResultWithKeyRequestBuilder tableRowOperationResultWithKey(@javax.annotation.Nonnull final String key) {
        Objects.requireNonNull(key);
        return new TableRowOperationResultWithKeyRequestBuilder(pathParameters, requestAdapter, key);
    }
    /**
     * Provides operations to manage the tables property of the microsoft.graph.workbook entity.
     * @param id Unique identifier of the item
     * @return a WorkbookTableItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookTableItemRequestBuilder tables(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookTable%2Did", id);
        return new WorkbookTableItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property workbook for drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property workbook for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
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
     * Update the navigation property workbook in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Workbook body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Workbook body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the worksheets property of the microsoft.graph.workbook entity.
     * @param id Unique identifier of the item
     * @return a WorkbookWorksheetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookWorksheetItemRequestBuilder worksheets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookWorksheet%2Did", id);
        return new WorkbookWorksheetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /**
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
