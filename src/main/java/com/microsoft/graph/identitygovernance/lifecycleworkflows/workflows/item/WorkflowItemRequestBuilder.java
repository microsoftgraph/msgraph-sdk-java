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
 * Provides operations to manage the workflows property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
 */
public class WorkflowItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the createdBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedByRequestBuilder createdBy() {
        return new CreatedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the executionScope property of the microsoft.graph.identityGovernance.workflow entity.
     */
    @jakarta.annotation.Nonnull
    public ExecutionScopeRequestBuilder executionScope() {
        return new ExecutionScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByRequestBuilder lastModifiedBy() {
        return new LastModifiedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the activate method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceActivateRequestBuilder microsoftGraphIdentityGovernanceActivate() {
        return new MicrosoftGraphIdentityGovernanceActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createNewVersion method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder microsoftGraphIdentityGovernanceCreateNewVersion() {
        return new MicrosoftGraphIdentityGovernanceCreateNewVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceRestoreRequestBuilder microsoftGraphIdentityGovernanceRestore() {
        return new MicrosoftGraphIdentityGovernanceRestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the runs property of the microsoft.graph.identityGovernance.workflow entity.
     */
    @jakarta.annotation.Nonnull
    public RunsRequestBuilder runs() {
        return new RunsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskReports property of the microsoft.graph.identityGovernance.workflow entity.
     */
    @jakarta.annotation.Nonnull
    public TaskReportsRequestBuilder taskReports() {
        return new TaskReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tasks property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
     */
    @jakarta.annotation.Nonnull
    public UserProcessingResultsRequestBuilder userProcessingResults() {
        return new UserProcessingResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.identityGovernance.workflow entity.
     */
    @jakarta.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WorkflowItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkflowItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Read the properties and relationships of a workflow object.
     * @return a CompletableFuture of workflow
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a workflow object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workflow
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @return a CompletableFuture of workflow
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> patch(@jakarta.annotation.Nonnull final Workflow body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workflow
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> patch(@jakarta.annotation.Nonnull final Workflow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a workflow object and its associated tasks, taskProcessingResults and versions. You can restore a deleted workflow and its associated objects within 30 days of deletion.
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
     * Read the properties and relationships of a workflow object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a workflow object.
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
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workflow body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a workflow object. Only the properties listed in the request body table can be updated. To update any other workflow properties, see workflow: createNewVersion.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Workflow body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Read the properties and relationships of a workflow object.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
