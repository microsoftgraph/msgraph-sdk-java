package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.createdby.CreatedByRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.executionscope.ExecutionScopeRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.lastmodifiedby.LastModifiedByRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.microsoftgraphidentitygovernanceactivate.MicrosoftGraphIdentityGovernanceActivateRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.microsoftgraphidentitygovernancecreatenewversion.MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.microsoftgraphidentitygovernancerestore.MicrosoftGraphIdentityGovernanceRestoreRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.runs.RunsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.TaskReportsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.tasks.TasksRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.UserProcessingResultsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.VersionsRequestBuilder;
import com.microsoft.graph.models.identitygovernance.Workflow;
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
 * Provides operations to manage the workflows property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkflowItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the createdBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     * @return a {@link CreatedByRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedByRequestBuilder createdBy() {
        return new CreatedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the executionScope property of the microsoft.graph.identityGovernance.workflow entity.
     * @return a {@link ExecutionScopeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExecutionScopeRequestBuilder executionScope() {
        return new ExecutionScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     * @return a {@link LastModifiedByRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByRequestBuilder lastModifiedBy() {
        return new LastModifiedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the activate method.
     * @return a {@link MicrosoftGraphIdentityGovernanceActivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceActivateRequestBuilder microsoftGraphIdentityGovernanceActivate() {
        return new MicrosoftGraphIdentityGovernanceActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createNewVersion method.
     * @return a {@link MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder microsoftGraphIdentityGovernanceCreateNewVersion() {
        return new MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link MicrosoftGraphIdentityGovernanceRestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceRestoreRequestBuilder microsoftGraphIdentityGovernanceRestore() {
        return new MicrosoftGraphIdentityGovernanceRestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the runs property of the microsoft.graph.identityGovernance.workflow entity.
     * @return a {@link RunsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RunsRequestBuilder runs() {
        return new RunsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskReports property of the microsoft.graph.identityGovernance.workflow entity.
     * @return a {@link TaskReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskReportsRequestBuilder taskReports() {
        return new TaskReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tasks property of the microsoft.graph.identityGovernance.workflowBase entity.
     * @return a {@link TasksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
     * @return a {@link UserProcessingResultsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserProcessingResultsRequestBuilder userProcessingResults() {
        return new UserProcessingResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.identityGovernance.workflow entity.
     * @return a {@link VersionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WorkflowItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link WorkflowItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a workflow object.
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a workflow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Workflow::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow patch(@jakarta.annotation.Nonnull final Workflow body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow patch(@jakarta.annotation.Nonnull final Workflow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Workflow::createFromDiscriminatorValue);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a workflow object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a workflow object.
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
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workflow body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workflow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WorkflowItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkflowItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkflowItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a workflow object.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
