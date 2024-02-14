package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.item.task.TaskRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.item.taskdefinition.TaskDefinitionRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.item.taskprocessingresults.TaskProcessingResultsRequestBuilder;
import com.microsoft.graph.models.identitygovernance.TaskReport;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the taskReports property of the microsoft.graph.identityGovernance.workflow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskReportItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the task property of the microsoft.graph.identityGovernance.taskReport entity.
     * @return a {@link TaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskDefinition property of the microsoft.graph.identityGovernance.taskReport entity.
     * @return a {@link TaskDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskDefinitionRequestBuilder taskDefinition() {
        return new TaskDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.taskReport entity.
     * @return a {@link TaskProcessingResultsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultsRequestBuilder taskProcessingResults() {
        return new TaskProcessingResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TaskReportItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskReportItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/taskReports/{taskReport%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link TaskReportItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskReportItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/taskReports/{taskReport%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Represents the aggregation of task execution data for tasks within a workflow object.
     * @return a {@link TaskReport}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TaskReport get() {
        return get(null);
    }
    /**
     * Represents the aggregation of task execution data for tasks within a workflow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TaskReport}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TaskReport get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TaskReport::createFromDiscriminatorValue);
    }
    /**
     * Represents the aggregation of task execution data for tasks within a workflow object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents the aggregation of task execution data for tasks within a workflow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link TaskReportItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskReportItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskReportItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Represents the aggregation of task execution data for tasks within a workflow object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
