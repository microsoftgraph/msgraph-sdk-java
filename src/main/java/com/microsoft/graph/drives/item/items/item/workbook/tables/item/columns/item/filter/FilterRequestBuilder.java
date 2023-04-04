package com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter;

import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.apply.ApplyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applybottomitemsfilter.ApplyBottomItemsFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applybottompercentfilter.ApplyBottomPercentFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applycellcolorfilter.ApplyCellColorFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applycustomfilter.ApplyCustomFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applydynamicfilter.ApplyDynamicFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applyfontcolorfilter.ApplyFontColorFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applyiconfilter.ApplyIconFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applytopitemsfilter.ApplyTopItemsFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applytoppercentfilter.ApplyTopPercentFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applyvaluesfilter.ApplyValuesFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.clear.ClearRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookFilter;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the filter property of the microsoft.graph.workbookTableColumn entity.
 */
public class FilterRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the apply method. */
    @javax.annotation.Nonnull
    public ApplyRequestBuilder apply() {
        return new ApplyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyBottomItemsFilter method. */
    @javax.annotation.Nonnull
    public ApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter() {
        return new ApplyBottomItemsFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyBottomPercentFilter method. */
    @javax.annotation.Nonnull
    public ApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter() {
        return new ApplyBottomPercentFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyCellColorFilter method. */
    @javax.annotation.Nonnull
    public ApplyCellColorFilterRequestBuilder applyCellColorFilter() {
        return new ApplyCellColorFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyCustomFilter method. */
    @javax.annotation.Nonnull
    public ApplyCustomFilterRequestBuilder applyCustomFilter() {
        return new ApplyCustomFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyDynamicFilter method. */
    @javax.annotation.Nonnull
    public ApplyDynamicFilterRequestBuilder applyDynamicFilter() {
        return new ApplyDynamicFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyFontColorFilter method. */
    @javax.annotation.Nonnull
    public ApplyFontColorFilterRequestBuilder applyFontColorFilter() {
        return new ApplyFontColorFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyIconFilter method. */
    @javax.annotation.Nonnull
    public ApplyIconFilterRequestBuilder applyIconFilter() {
        return new ApplyIconFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyTopItemsFilter method. */
    @javax.annotation.Nonnull
    public ApplyTopItemsFilterRequestBuilder applyTopItemsFilter() {
        return new ApplyTopItemsFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyTopPercentFilter method. */
    @javax.annotation.Nonnull
    public ApplyTopPercentFilterRequestBuilder applyTopPercentFilter() {
        return new ApplyTopPercentFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyValuesFilter method. */
    @javax.annotation.Nonnull
    public ApplyValuesFilterRequestBuilder applyValuesFilter() {
        return new ApplyValuesFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the clear method. */
    @javax.annotation.Nonnull
    public ClearRequestBuilder clear() {
        return new ClearRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new FilterRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public FilterRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new FilterRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public FilterRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property filter for drives
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property filter for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @return a CompletableFuture of workbookFilter
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFilter> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFilter::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFilter> executionException = new java.util.concurrent.CompletableFuture<WorkbookFilter>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookFilter
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFilter> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFilter::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFilter> executionException = new java.util.concurrent.CompletableFuture<WorkbookFilter>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @return a CompletableFuture of workbookFilter
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFilter> patch(@javax.annotation.Nonnull final WorkbookFilter body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFilter::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFilter> executionException = new java.util.concurrent.CompletableFuture<WorkbookFilter>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookFilter
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFilter> patch(@javax.annotation.Nonnull final WorkbookFilter body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFilter::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFilter> executionException = new java.util.concurrent.CompletableFuture<WorkbookFilter>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property filter for drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property filter for drives
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
     * Retrieve the filter applied to the column. Read-only.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
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
     * Update the navigation property filter in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookFilter body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookFilter body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
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
