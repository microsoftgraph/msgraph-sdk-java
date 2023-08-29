package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.add.AddRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.count.CountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.WorkbookChartItemRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.itematwithindex.ItemAtWithIndexRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.itemwithname.ItemWithNameRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookChart;
import com.microsoft.graph.models.WorkbookChartCollectionResponse;
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
 * Provides operations to manage the charts property of the microsoft.graph.workbookWorksheet entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChartsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the add method.
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the count method.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the charts property of the microsoft.graph.workbookWorksheet entity.
     * @param workbookChartId The unique identifier of workbookChart
     * @return a WorkbookChartItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WorkbookChartItemRequestBuilder byWorkbookChartId(@jakarta.annotation.Nonnull final String workbookChartId) {
        Objects.requireNonNull(workbookChartId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workbookChart%2Did", workbookChartId);
        return new WorkbookChartItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ChartsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChartsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ChartsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChartsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of chart objects.
     * @return a CompletableFuture of workbookChartCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/chart-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve a list of chart objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookChartCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/chart-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WorkbookChartCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the itemAt method.
     * @param index Usage: index={index}
     * @return a itemAtWithIndexRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ItemAtWithIndexRequestBuilder itemAtWithIndex(@jakarta.annotation.Nonnull final Integer index) {
        Objects.requireNonNull(index);
        return new ItemAtWithIndexRequestBuilder(pathParameters, requestAdapter, index);
    }
    /**
     * Provides operations to call the item method.
     * @param name Usage: name='{name}'
     * @return a itemWithNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ItemWithNameRequestBuilder itemWithName(@jakarta.annotation.Nonnull final String name) {
        Objects.requireNonNull(name);
        return new ItemWithNameRequestBuilder(pathParameters, requestAdapter, name);
    }
    /**
     * Use this API to create a new Chart.
     * @param body The request body
     * @return a CompletableFuture of workbookChart
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-post-charts?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChart> post(@jakarta.annotation.Nonnull final WorkbookChart body) {
        return post(body, null);
    }
    /**
     * Use this API to create a new Chart.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookChart
     * @see <a href="https://learn.microsoft.com/graph/api/worksheet-post-charts?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChart> post(@jakarta.annotation.Nonnull final WorkbookChart body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WorkbookChart::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve a list of chart objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of chart objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Use this API to create a new Chart.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WorkbookChart body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this API to create a new Chart.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WorkbookChart body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Retrieve a list of chart objects.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
