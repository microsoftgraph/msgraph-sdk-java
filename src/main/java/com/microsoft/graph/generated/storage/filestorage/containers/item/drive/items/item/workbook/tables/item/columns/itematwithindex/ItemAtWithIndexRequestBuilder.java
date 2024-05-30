package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookTableColumn;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex.databodyrange.DataBodyRangeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex.filter.FilterRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex.headerrowrange.HeaderRowRangeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex.range.RangeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.tables.item.columns.itematwithindex.totalrowrange.TotalRowRangeRequestBuilder;
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
     * Provides operations to call the dataBodyRange method.
     * @return a {@link DataBodyRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataBodyRangeRequestBuilder dataBodyRange() {
        return new DataBodyRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filter property of the microsoft.graph.workbookTableColumn entity.
     * @return a {@link FilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterRequestBuilder filter() {
        return new FilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the headerRowRange method.
     * @return a {@link HeaderRowRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HeaderRowRangeRequestBuilder headerRowRange() {
        return new HeaderRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the range method.
     * @return a {@link RangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RangeRequestBuilder range() {
        return new RangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the totalRowRange method.
     * @return a {@link TotalRowRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TotalRowRangeRequestBuilder totalRowRange() {
        return new TotalRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param index Usage: index={index}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Integer index) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/itemAt(index={index})", pathParameters);
        this.pathParameters.put("index", index);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/itemAt(index={index})", rawUrl);
    }
    /**
     * Gets a column based on its position in the collection.
     * @return a {@link WorkbookTableColumn}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tablecolumncollection-itemat?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTableColumn get() {
        return get(null);
    }
    /**
     * Gets a column based on its position in the collection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookTableColumn}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tablecolumncollection-itemat?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTableColumn get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookTableColumn::createFromDiscriminatorValue);
    }
    /**
     * Gets a column based on its position in the collection.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Gets a column based on its position in the collection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link ItemAtWithIndexRequestBuilder}
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
