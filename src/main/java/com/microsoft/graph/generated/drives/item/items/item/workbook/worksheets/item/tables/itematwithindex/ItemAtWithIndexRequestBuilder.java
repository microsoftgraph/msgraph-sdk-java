package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.clearfilters.ClearFiltersRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.columns.ColumnsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.converttorange.ConvertToRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.databodyrange.DataBodyRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.headerrowrange.HeaderRowRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.range.RangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.reapplyfilters.ReapplyFiltersRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.rows.RowsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.sort.SortRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.totalrowrange.TotalRowRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.itematwithindex.worksheet.WorksheetRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookTable;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the itemAt method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemAtWithIndexRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the clearFilters method.
     */
    @jakarta.annotation.Nonnull
    public ClearFiltersRequestBuilder clearFilters() {
        return new ClearFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the convertToRange method.
     */
    @jakarta.annotation.Nonnull
    public ConvertToRangeRequestBuilder convertToRange() {
        return new ConvertToRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dataBodyRange method.
     */
    @jakarta.annotation.Nonnull
    public DataBodyRangeRequestBuilder dataBodyRange() {
        return new DataBodyRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the headerRowRange method.
     */
    @jakarta.annotation.Nonnull
    public HeaderRowRangeRequestBuilder headerRowRange() {
        return new HeaderRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the range method.
     */
    @jakarta.annotation.Nonnull
    public RangeRequestBuilder range() {
        return new RangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reapplyFilters method.
     */
    @jakarta.annotation.Nonnull
    public ReapplyFiltersRequestBuilder reapplyFilters() {
        return new ReapplyFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rows property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public RowsRequestBuilder rows() {
        return new RowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sort property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public SortRequestBuilder sort() {
        return new SortRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the totalRowRange method.
     */
    @jakarta.annotation.Nonnull
    public TotalRowRangeRequestBuilder totalRowRange() {
        return new TotalRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the worksheet property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public WorksheetRequestBuilder worksheet() {
        return new WorksheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ItemAtWithIndexRequestBuilder and sets the default values.
     * @param index Usage: index={index}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Integer index) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/itemAt(index={index})", pathParameters);
        this.pathParameters.put("index", index);
    }
    /**
     * Instantiates a new ItemAtWithIndexRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/itemAt(index={index})", rawUrl);
    }
    /**
     * Invoke function itemAt
     * @return a WorkbookTable
     */
    @jakarta.annotation.Nullable
    public WorkbookTable get() {
        return get(null);
    }
    /**
     * Invoke function itemAt
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookTable
     */
    @jakarta.annotation.Nullable
    public WorkbookTable get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookTable::createFromDiscriminatorValue);
    }
    /**
     * Invoke function itemAt
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function itemAt
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ItemAtWithIndexRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ItemAtWithIndexRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ItemAtWithIndexRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
