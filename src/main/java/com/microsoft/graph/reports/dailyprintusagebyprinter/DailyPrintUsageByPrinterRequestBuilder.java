package com.microsoft.graph.reports.dailyprintusagebyprinter;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrintUsageByPrinter;
import com.microsoft.graph.models.PrintUsageByPrinterCollectionResponse;
import com.microsoft.graph.reports.dailyprintusagebyprinter.count.CountRequestBuilder;
import com.microsoft.graph.reports.dailyprintusagebyprinter.item.PrintUsageByPrinterItemRequestBuilder;
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
 * Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DailyPrintUsageByPrinterRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dailyPrintUsageByPrinter property of the microsoft.graph.reportRoot entity.
     * @param printUsageByPrinterId The unique identifier of printUsageByPrinter
     * @return a PrintUsageByPrinterItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrintUsageByPrinterItemRequestBuilder byPrintUsageByPrinterId(@jakarta.annotation.Nonnull final String printUsageByPrinterId) {
        Objects.requireNonNull(printUsageByPrinterId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printUsageByPrinter%2Did", printUsageByPrinterId);
        return new PrintUsageByPrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DailyPrintUsageByPrinterRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DailyPrintUsageByPrinterRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/dailyPrintUsageByPrinter{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DailyPrintUsageByPrinterRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DailyPrintUsageByPrinterRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/dailyPrintUsageByPrinter{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a CompletableFuture of PrintUsageByPrinterCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-dailyprintusagebyprinter?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintUsageByPrinterCollectionResponse> get() {
        return get(null);
    }
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PrintUsageByPrinterCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-dailyprintusagebyprinter?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintUsageByPrinterCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, PrintUsageByPrinterCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to dailyPrintUsageByPrinter for reports
     * @param body The request body
     * @return a CompletableFuture of PrintUsageByPrinter
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintUsageByPrinter> post(@jakarta.annotation.Nonnull final PrintUsageByPrinter body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to dailyPrintUsageByPrinter for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PrintUsageByPrinter
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintUsageByPrinter> post(@jakarta.annotation.Nonnull final PrintUsageByPrinter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, PrintUsageByPrinter::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
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
     * Create new navigation property to dailyPrintUsageByPrinter for reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrintUsageByPrinter body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to dailyPrintUsageByPrinter for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrintUsageByPrinter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DailyPrintUsageByPrinterRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DailyPrintUsageByPrinterRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DailyPrintUsageByPrinterRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
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
