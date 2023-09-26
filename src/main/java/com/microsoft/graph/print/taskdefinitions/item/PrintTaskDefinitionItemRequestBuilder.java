package com.microsoft.graph.print.taskdefinitions.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrintTaskDefinition;
import com.microsoft.graph.print.taskdefinitions.item.tasks.TasksRequestBuilder;
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
 * Provides operations to manage the taskDefinitions property of the microsoft.graph.print entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintTaskDefinitionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the tasks property of the microsoft.graph.printTaskDefinition entity.
     */
    @jakarta.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PrintTaskDefinitionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrintTaskDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/taskDefinitions/{printTaskDefinition%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PrintTaskDefinitionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrintTaskDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/taskDefinitions/{printTaskDefinition%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a taskDefinition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @see <a href="https://learn.microsoft.com/graph/api/print-delete-taskdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete a taskDefinition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/print-delete-taskdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get details about a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @return a CompletableFuture of PrintTaskDefinition
     * @see <a href="https://learn.microsoft.com/graph/api/printtaskdefinition-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskDefinition> get() {
        return get(null);
    }
    /**
     * Get details about a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PrintTaskDefinition
     * @see <a href="https://learn.microsoft.com/graph/api/printtaskdefinition-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskDefinition> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, PrintTaskDefinition::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param body The request body
     * @return a CompletableFuture of PrintTaskDefinition
     * @see <a href="https://learn.microsoft.com/graph/api/print-update-taskdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskDefinition> patch(@jakarta.annotation.Nonnull final PrintTaskDefinition body) {
        return patch(body, null);
    }
    /**
     * Update a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PrintTaskDefinition
     * @see <a href="https://learn.microsoft.com/graph/api/print-update-taskdefinition?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskDefinition> patch(@jakarta.annotation.Nonnull final PrintTaskDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, PrintTaskDefinition::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete a taskDefinition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a taskDefinition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * Get details about a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get details about a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
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
     * Update a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrintTaskDefinition body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrintTaskDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a PrintTaskDefinitionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrintTaskDefinitionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrintTaskDefinitionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get details about a task definition. For details about how to use this API to add pull printing support to Universal Print, see Extending Universal Print to support pull printing.
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
