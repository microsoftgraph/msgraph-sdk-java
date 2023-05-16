package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.rows;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.rows.add.AddRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.rows.count.CountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.rows.item.WorkbookTableRowItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.rows.itematwithindex.ItemAtWithIndexRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookTableRow;
import com.microsoft.graph.models.WorkbookTableRowCollectionResponse;
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
 * Provides operations to manage the rows property of the microsoft.graph.workbookTable entity.
 */
public class RowsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the add method. */
    @javax.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the count method. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rows property of the microsoft.graph.workbookTable entity.
     * @param workbookTableRowId Unique identifier of the item
     * @return a WorkbookTableRowItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkbookTableRowItemRequestBuilder byWorkbookTableRowId(@javax.annotation.Nonnull final String workbookTableRowId) {
        Objects.requireNonNull(workbookTableRowId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookTableRow%2Did", workbookTableRowId);
        return new WorkbookTableRowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new RowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RowsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/rows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RowsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/rows{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of tablerow objects.
     * @return a CompletableFuture of WorkbookTableRowCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/tablerow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookTableRowCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve a list of tablerow objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of WorkbookTableRowCollectionResponse
     * @see <a href="https://docs.microsoft.com/graph/api/tablerow-list?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookTableRowCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<WorkbookTableRowCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the itemAt method.
     * @param index Usage: index={index}
     * @return a itemAtWithIndexRequestBuilder
     */
    @javax.annotation.Nonnull
    public ItemAtWithIndexRequestBuilder itemAtWithIndex(@javax.annotation.Nonnull final Integer index) {
        Objects.requireNonNull(index);
        return new ItemAtWithIndexRequestBuilder(pathParameters, requestAdapter, index);
    }
    /**
     * Adds rows to the end of a table.  Note that this API can accept multiple rows of data. Adding one row at a time can affect performance. The recommended approach is to batch the rows together in a single call rather than inserting single rows. For best results, collect the rows to be inserted on the application side and perform a single row add operation. Experiment with the number of rows to determine the ideal number of rows to use in a single API call.  This request might occasionally result in a `504 HTTP` error. The appropriate response to this error is to repeat the request.
     * @param body The request body
     * @return a CompletableFuture of workbookTableRow
     * @see <a href="https://docs.microsoft.com/graph/api/table-post-rows?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableRow> post(@javax.annotation.Nonnull final WorkbookTableRow body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookTableRow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookTableRow> executionException = new java.util.concurrent.CompletableFuture<WorkbookTableRow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Adds rows to the end of a table.  Note that this API can accept multiple rows of data. Adding one row at a time can affect performance. The recommended approach is to batch the rows together in a single call rather than inserting single rows. For best results, collect the rows to be inserted on the application side and perform a single row add operation. Experiment with the number of rows to determine the ideal number of rows to use in a single API call.  This request might occasionally result in a `504 HTTP` error. The appropriate response to this error is to repeat the request.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookTableRow
     * @see <a href="https://docs.microsoft.com/graph/api/table-post-rows?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableRow> post(@javax.annotation.Nonnull final WorkbookTableRow body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookTableRow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookTableRow> executionException = new java.util.concurrent.CompletableFuture<WorkbookTableRow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve a list of tablerow objects.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of tablerow objects.
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
     * Adds rows to the end of a table.  Note that this API can accept multiple rows of data. Adding one row at a time can affect performance. The recommended approach is to batch the rows together in a single call rather than inserting single rows. For best results, collect the rows to be inserted on the application side and perform a single row add operation. Experiment with the number of rows to determine the ideal number of rows to use in a single API call.  This request might occasionally result in a `504 HTTP` error. The appropriate response to this error is to repeat the request.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final WorkbookTableRow body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Adds rows to the end of a table.  Note that this API can accept multiple rows of data. Adding one row at a time can affect performance. The recommended approach is to batch the rows together in a single call rather than inserting single rows. For best results, collect the rows to be inserted on the application side and perform a single row add operation. Experiment with the number of rows to determine the ideal number of rows to use in a single API call.  This request might occasionally result in a `504 HTTP` error. The appropriate response to this error is to repeat the request.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final WorkbookTableRow body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Retrieve a list of tablerow objects.
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
