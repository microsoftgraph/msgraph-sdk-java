package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookChart;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.axes.AxesRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.datalabels.DataLabelsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.format.FormatRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.image.ImageRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.imagewithwidth.ImageWithWidthRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.imagewithwidthwithheight.ImageWithWidthWithHeightRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.imagewithwidthwithheightwithfittingmode.ImageWithWidthWithHeightWithFittingModeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.legend.LegendRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.series.SeriesRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.setdata.SetDataRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.setposition.SetPositionRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.title.TitleRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.worksheets.item.charts.itemwithname.worksheet.WorksheetRequestBuilder;
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
 * Provides operations to call the item method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemWithNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the axes property of the microsoft.graph.workbookChart entity.
     * @return a {@link AxesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AxesRequestBuilder axes() {
        return new AxesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dataLabels property of the microsoft.graph.workbookChart entity.
     * @return a {@link DataLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataLabelsRequestBuilder dataLabels() {
        return new DataLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the format property of the microsoft.graph.workbookChart entity.
     * @return a {@link FormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FormatRequestBuilder format() {
        return new FormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the image method.
     * @return a {@link ImageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImageRequestBuilder image() {
        return new ImageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the legend property of the microsoft.graph.workbookChart entity.
     * @return a {@link LegendRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LegendRequestBuilder legend() {
        return new LegendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the series property of the microsoft.graph.workbookChart entity.
     * @return a {@link SeriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SeriesRequestBuilder series() {
        return new SeriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setData method.
     * @return a {@link SetDataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetDataRequestBuilder setData() {
        return new SetDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setPosition method.
     * @return a {@link SetPositionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetPositionRequestBuilder setPosition() {
        return new SetPositionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the title property of the microsoft.graph.workbookChart entity.
     * @return a {@link TitleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TitleRequestBuilder title() {
        return new TitleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the worksheet property of the microsoft.graph.workbookChart entity.
     * @return a {@link WorksheetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorksheetRequestBuilder worksheet() {
        return new WorksheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemWithNameRequestBuilder} and sets the default values.
     * @param name Usage: name='{name}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemWithNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String name) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/item(name='{name}')", pathParameters);
        this.pathParameters.put("name", name);
    }
    /**
     * Instantiates a new {@link ItemWithNameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemWithNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/item(name='{name}')", rawUrl);
    }
    /**
     * Invoke function item
     * @return a {@link WorkbookChart}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookChart get() {
        return get(null);
    }
    /**
     * Invoke function item
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookChart}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookChart get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookChart::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the image method.
     * @param width Usage: width={width}
     * @return a {@link ImageWithWidthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImageWithWidthRequestBuilder imageWithWidth(@jakarta.annotation.Nonnull final Integer width) {
        Objects.requireNonNull(width);
        return new ImageWithWidthRequestBuilder(pathParameters, requestAdapter, width);
    }
    /**
     * Provides operations to call the image method.
     * @param height Usage: height={height}
     * @param width Usage: width={width}
     * @return a {@link ImageWithWidthWithHeightRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImageWithWidthWithHeightRequestBuilder imageWithWidthWithHeight(@jakarta.annotation.Nonnull final Integer height, @jakarta.annotation.Nonnull final Integer width) {
        Objects.requireNonNull(height);
        Objects.requireNonNull(width);
        return new ImageWithWidthWithHeightRequestBuilder(pathParameters, requestAdapter, height, width);
    }
    /**
     * Provides operations to call the image method.
     * @param fittingMode Usage: fittingMode='{fittingMode}'
     * @param height Usage: height={height}
     * @param width Usage: width={width}
     * @return a {@link ImageWithWidthWithHeightWithFittingModeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImageWithWidthWithHeightWithFittingModeRequestBuilder imageWithWidthWithHeightWithFittingMode(@jakarta.annotation.Nonnull final String fittingMode, @jakarta.annotation.Nonnull final Integer height, @jakarta.annotation.Nonnull final Integer width) {
        Objects.requireNonNull(fittingMode);
        Objects.requireNonNull(height);
        Objects.requireNonNull(width);
        return new ImageWithWidthWithHeightWithFittingModeRequestBuilder(pathParameters, requestAdapter, fittingMode, height, width);
    }
    /**
     * Invoke function item
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function item
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
     * @return a {@link ItemWithNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemWithNameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ItemWithNameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
