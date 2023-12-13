package com.microsoft.graph.drives.item.items.item.workbook;

import com.microsoft.graph.drives.item.items.item.workbook.application.ApplicationRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.closesession.CloseSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.comments.CommentsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.createsession.CreateSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.FunctionsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.names.NamesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.operations.OperationsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.refreshsession.RefreshSessionRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.sessioninforesourcewithkey.SessionInfoResourceWithKeyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tablerowoperationresultwithkey.TableRowOperationResultWithKeyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.TablesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.WorksheetsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Workbook;
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
 * Provides operations to manage the workbook property of the microsoft.graph.driveItem entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the application property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public ApplicationRequestBuilder application() {
        return new ApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the closeSession method.
     */
    @jakarta.annotation.Nonnull
    public CloseSessionRequestBuilder closeSession() {
        return new CloseSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the comments property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public CommentsRequestBuilder comments() {
        return new CommentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createSession method.
     */
    @jakarta.annotation.Nonnull
    public CreateSessionRequestBuilder createSession() {
        return new CreateSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the functions property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the names property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public NamesRequestBuilder names() {
        return new NamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the refreshSession method.
     */
    @jakarta.annotation.Nonnull
    public RefreshSessionRequestBuilder refreshSession() {
        return new RefreshSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tables property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public TablesRequestBuilder tables() {
        return new TablesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the worksheets property of the microsoft.graph.workbook entity.
     */
    @jakarta.annotation.Nonnull
    public WorksheetsRequestBuilder worksheets() {
        return new WorksheetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WorkbookRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkbookRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property workbook for drives
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property workbook for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * For files that are Excel spreadsheets, access to the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a Workbook
     */
    @jakarta.annotation.Nullable
    public Workbook get() {
        return get(null);
    }
    /**
     * For files that are Excel spreadsheets, access to the workbook API to work with the spreadsheet's contents. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Workbook
     */
    @jakarta.annotation.Nullable
    public Workbook get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Workbook::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @return a Workbook
     */
    @jakarta.annotation.Nullable
    public Workbook patch(@jakarta.annotation.Nonnull final Workbook body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Workbook
     */
    @jakarta.annotation.Nullable
    public Workbook patch(@jakarta.annotation.Nonnull final Workbook body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Workbook::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the sessionInfoResource method.
     * @param key Usage: key='{key}'
     * @return a SessionInfoResourceWithKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SessionInfoResourceWithKeyRequestBuilder sessionInfoResourceWithKey(@jakarta.annotation.Nonnull final String key) {
        Objects.requireNonNull(key);
        return new SessionInfoResourceWithKeyRequestBuilder(pathParameters, requestAdapter, key);
    }
    /**
     * Provides operations to call the tableRowOperationResult method.
     * @param key Usage: key='{key}'
     * @return a TableRowOperationResultWithKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TableRowOperationResultWithKeyRequestBuilder tableRowOperationResultWithKey(@jakarta.annotation.Nonnull final String key) {
        Objects.requireNonNull(key);
        return new TableRowOperationResultWithKeyRequestBuilder(pathParameters, requestAdapter, key);
    }
    /**
     * Delete navigation property workbook for drives
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property workbook for drives
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
     * For files that are Excel spreadsheets, access to the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * For files that are Excel spreadsheets, access to the workbook API to work with the spreadsheet's contents. Nullable.
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
     * Update the navigation property workbook in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workbook body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property workbook in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workbook body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WorkbookRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WorkbookRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkbookRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * For files that are Excel spreadsheets, access to the workbook API to work with the spreadsheet's contents. Nullable.
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
