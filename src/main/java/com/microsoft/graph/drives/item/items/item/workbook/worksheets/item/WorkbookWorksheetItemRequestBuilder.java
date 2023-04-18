package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.cellwithrowwithcolumn.CellWithRowWithColumnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.ChartsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.names.NamesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.pivottables.PivotTablesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.protection.ProtectionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.range.RangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.rangewithaddress.RangeWithAddressRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.TablesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.usedrange.UsedRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.usedrangewithvaluesonly.UsedRangeWithValuesOnlyRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookWorksheet;
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
 * Provides operations to manage the worksheets property of the microsoft.graph.workbook entity.
 */
public class WorkbookWorksheetItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the charts property of the microsoft.graph.workbookWorksheet entity. */
    @javax.annotation.Nonnull
    public ChartsRequestBuilder charts() {
        return new ChartsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the names property of the microsoft.graph.workbookWorksheet entity. */
    @javax.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the pivotTables property of the microsoft.graph.workbookWorksheet entity. */
    @javax.annotation.Nonnull
    public PivotTablesRequestBuilder pivotTables() {
        return new PivotTablesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the protection property of the microsoft.graph.workbookWorksheet entity. */
    @javax.annotation.Nonnull
    public ProtectionRequestBuilder protection() {
        return new ProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the range method. */
    @javax.annotation.Nonnull
    public RangeRequestBuilder range() {
        return new RangeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tables property of the microsoft.graph.workbookWorksheet entity. */
    @javax.annotation.Nonnull
    public TablesRequestBuilder tables() {
        return new TablesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the usedRange method. */
    @javax.annotation.Nonnull
    public UsedRangeRequestBuilder usedRange() {
        return new UsedRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cell method.
     * @param column Usage: column={column}
     * @param row Usage: row={row}
     * @return a cellWithRowWithColumnRequestBuilder
     */
    @javax.annotation.Nonnull
    public CellWithRowWithColumnRequestBuilder cellWithRowWithColumn(@javax.annotation.Nonnull final Integer column, @javax.annotation.Nonnull final Integer row) {
        Objects.requireNonNull(column);
        Objects.requireNonNull(row);
        return new CellWithRowWithColumnRequestBuilder(pathParameters, requestAdapter, column, row);
    }
    /**
     * Instantiates a new WorkbookWorksheetItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookWorksheetItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkbookWorksheetItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookWorksheetItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property worksheets for drives
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
     * Delete navigation property worksheets for drives
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
     * Represents a collection of worksheets associated with the workbook. Read-only.
     * @return a CompletableFuture of workbookWorksheet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheet> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookWorksheet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookWorksheet> executionException = new java.util.concurrent.CompletableFuture<WorkbookWorksheet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Represents a collection of worksheets associated with the workbook. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookWorksheet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheet> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookWorksheet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookWorksheet> executionException = new java.util.concurrent.CompletableFuture<WorkbookWorksheet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property worksheets in drives
     * @param body The request body
     * @return a CompletableFuture of workbookWorksheet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheet> patch(@javax.annotation.Nonnull final WorkbookWorksheet body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookWorksheet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookWorksheet> executionException = new java.util.concurrent.CompletableFuture<WorkbookWorksheet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property worksheets in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookWorksheet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheet> patch(@javax.annotation.Nonnull final WorkbookWorksheet body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookWorksheet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookWorksheet> executionException = new java.util.concurrent.CompletableFuture<WorkbookWorksheet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the range method.
     * @param address Usage: address='{address}'
     * @return a rangeWithAddressRequestBuilder
     */
    @javax.annotation.Nonnull
    public RangeWithAddressRequestBuilder rangeWithAddress(@javax.annotation.Nonnull final String address) {
        Objects.requireNonNull(address);
        return new RangeWithAddressRequestBuilder(pathParameters, requestAdapter, address);
    }
    /**
     * Delete navigation property worksheets for drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property worksheets for drives
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
     * Represents a collection of worksheets associated with the workbook. Read-only.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Represents a collection of worksheets associated with the workbook. Read-only.
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
     * Update the navigation property worksheets in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookWorksheet body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property worksheets in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookWorksheet body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to call the usedRange method.
     * @param valuesOnly Usage: valuesOnly={valuesOnly}
     * @return a usedRangeWithValuesOnlyRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsedRangeWithValuesOnlyRequestBuilder usedRangeWithValuesOnly(@javax.annotation.Nonnull final Boolean valuesOnly) {
        Objects.requireNonNull(valuesOnly);
        return new UsedRangeWithValuesOnlyRequestBuilder(pathParameters, requestAdapter, valuesOnly);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Represents a collection of worksheets associated with the workbook. Read-only.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
