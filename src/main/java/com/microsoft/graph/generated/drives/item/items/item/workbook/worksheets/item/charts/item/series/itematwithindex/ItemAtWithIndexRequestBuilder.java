package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.series.itematwithindex;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.series.itematwithindex.format.FormatRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.series.itematwithindex.points.PointsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookChartSeries;
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
     * Provides operations to manage the format property of the microsoft.graph.workbookChartSeries entity.
     * @return a {@link FormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FormatRequestBuilder format() {
        return new FormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the points property of the microsoft.graph.workbookChartSeries entity.
     * @return a {@link PointsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PointsRequestBuilder points() {
        return new PointsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param index Usage: index={index}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final Integer index) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/{workbookChart%2Did}/series/itemAt(index={index})", pathParameters);
        this.pathParameters.put("index", index);
    }
    /**
     * Instantiates a new {@link ItemAtWithIndexRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemAtWithIndexRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/{workbookChart%2Did}/series/itemAt(index={index})", rawUrl);
    }
    /**
     * Retrieves a series based on its position in the collection
     * @return a {@link WorkbookChartSeries}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/chartseriescollection-itemat?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartSeries get() {
        return get(null);
    }
    /**
     * Retrieves a series based on its position in the collection
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookChartSeries}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/chartseriescollection-itemat?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartSeries get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookChartSeries::createFromDiscriminatorValue);
    }
    /**
     * Retrieves a series based on its position in the collection
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieves a series based on its position in the collection
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
