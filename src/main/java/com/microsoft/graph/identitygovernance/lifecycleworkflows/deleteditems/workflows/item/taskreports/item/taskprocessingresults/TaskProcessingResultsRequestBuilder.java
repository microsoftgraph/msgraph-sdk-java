package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.taskreports.item.taskprocessingresults;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.taskreports.item.taskprocessingresults.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.taskreports.item.taskprocessingresults.item.TaskProcessingResultItemRequestBuilder;
import com.microsoft.graph.models.identitygovernance.TaskProcessingResultCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.taskReport entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskProcessingResultsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.taskReport entity.
     * @param taskProcessingResultId The unique identifier of taskProcessingResult
     * @return a TaskProcessingResultItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultItemRequestBuilder byTaskProcessingResultId(@jakarta.annotation.Nonnull final String taskProcessingResultId) {
        Objects.requireNonNull(taskProcessingResultId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taskProcessingResult%2Did", taskProcessingResultId);
        return new TaskProcessingResultItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TaskProcessingResultsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/taskReports/{taskReport%2Did}/taskProcessingResults{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TaskProcessingResultsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/taskReports/{taskReport%2Did}/taskProcessingResults{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get the task processing result resources from the taskReport. This API is available in the following national cloud deployments.
     * @return a TaskProcessingResultCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-taskreport-list-taskprocessingresults?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResultCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the task processing result resources from the taskReport. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TaskProcessingResultCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-taskreport-list-taskprocessingresults?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResultCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, TaskProcessingResultCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get the task processing result resources from the taskReport. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the task processing result resources from the taskReport. This API is available in the following national cloud deployments.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TaskProcessingResultsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskProcessingResultsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the task processing result resources from the taskReport. This API is available in the following national cloud deployments.
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
}
