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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the worksheets property of the microsoft.graph.workbook entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookWorksheetItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the charts property of the microsoft.graph.workbookWorksheet entity.
     */
    @jakarta.annotation.Nonnull
    public ChartsRequestBuilder charts() {
        return new ChartsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.workbookWorksheet entity.
     */
    @jakarta.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pivotTables property of the microsoft.graph.workbookWorksheet entity.
     */
    @jakarta.annotation.Nonnull
    public PivotTablesRequestBuilder pivotTables() {
        return new PivotTablesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the protection property of the microsoft.graph.workbookWorksheet entity.
     */
    @jakarta.annotation.Nonnull
    public ProtectionRequestBuilder protection() {
        return new ProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the range method.
     */
    @jakarta.annotation.Nonnull
    public RangeRequestBuilder range() {
        return new RangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tables property of the microsoft.graph.workbookWorksheet entity.
     */
    @jakarta.annotation.Nonnull
    public TablesRequestBuilder tables() {
        return new TablesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usedRange method.
     */
    @jakarta.annotation.Nonnull
    public UsedRangeRequestBuilder usedRange() {
        return new UsedRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cell method.
     * @param column Usage: column={column}
     * @param row Usage: row={row}
     * @return a CellWithRowWithColumnRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CellWithRowWithColumnRequestBuilder cellWithRowWithColumn(@jakarta.annotation.Nonnull final Integer column, @jakarta.annotation.Nonnull final Integer row) {
        Objects.requireNonNull(column);
        Objects.requireNonNull(row);
        return new CellWithRowWithColumnRequestBuilder(pathParameters, requestAdapter, column, row);
    }
    /**
     * Instantiates a new WorkbookWorksheetItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookWorksheetItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkbookWorksheetItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookWorksheetItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes the worksheet from the workbook.
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes the worksheet from the workbook.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of worksheet object.
     * @return a WorkbookWorksheet
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of worksheet object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookWorksheet
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookWorksheet::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of worksheet object.
     * @param body The request body
     * @return a WorkbookWorksheet
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet patch(@jakarta.annotation.Nonnull final WorkbookWorksheet body) {
        return patch(body, null);
    }
    /**
     * Update the properties of worksheet object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookWorksheet
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet patch(@jakarta.annotation.Nonnull final WorkbookWorksheet body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookWorksheet::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the range method.
     * @param address Usage: address='{address}'
     * @return a RangeWithAddressRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RangeWithAddressRequestBuilder rangeWithAddress(@jakarta.annotation.Nonnull final String address) {
        Objects.requireNonNull(address);
        return new RangeWithAddressRequestBuilder(pathParameters, requestAdapter, address);
    }
    /**
     * Deletes the worksheet from the workbook.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes the worksheet from the workbook.
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
     * Retrieve the properties and relationships of worksheet object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of worksheet object.
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
     * Update the properties of worksheet object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookWorksheet body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of worksheet object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookWorksheet body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Provides operations to call the usedRange method.
     * @param valuesOnly Usage: valuesOnly={valuesOnly}
     * @return a UsedRangeWithValuesOnlyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsedRangeWithValuesOnlyRequestBuilder usedRangeWithValuesOnly(@jakarta.annotation.Nonnull final Boolean valuesOnly) {
        Objects.requireNonNull(valuesOnly);
        return new UsedRangeWithValuesOnlyRequestBuilder(pathParameters, requestAdapter, valuesOnly);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WorkbookWorksheetItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WorkbookWorksheetItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkbookWorksheetItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of worksheet object.
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
