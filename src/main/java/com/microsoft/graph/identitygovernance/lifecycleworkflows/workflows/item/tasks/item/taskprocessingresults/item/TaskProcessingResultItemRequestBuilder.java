package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.tasks.item.taskprocessingresults.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.tasks.item.taskprocessingresults.item.microsoftgraphidentitygovernanceresume.MicrosoftGraphIdentityGovernanceResumeRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.tasks.item.taskprocessingresults.item.subject.SubjectRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.tasks.item.taskprocessingresults.item.task.TaskRequestBuilder;
import com.microsoft.graph.models.identitygovernance.TaskProcessingResult;
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
 * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.task entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskProcessingResultItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the resume method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceResumeRequestBuilder microsoftGraphIdentityGovernanceResume() {
        return new MicrosoftGraphIdentityGovernanceResumeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subject property of the microsoft.graph.identityGovernance.taskProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectRequestBuilder subject() {
        return new SubjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the task property of the microsoft.graph.identityGovernance.taskProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TaskProcessingResultItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/tasks/{task%2Did}/taskProcessingResults/{taskProcessingResult%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TaskProcessingResultItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/tasks/{task%2Did}/taskProcessingResults/{taskProcessingResult%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * The result of processing the task.
     * @return a TaskProcessingResult
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResult get() {
        return get(null);
    }
    /**
     * The result of processing the task.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TaskProcessingResult
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TaskProcessingResult::createFromDiscriminatorValue);
    }
    /**
     * The result of processing the task.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The result of processing the task.
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
     * @return a TaskProcessingResultItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskProcessingResultItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The result of processing the task.
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
}
