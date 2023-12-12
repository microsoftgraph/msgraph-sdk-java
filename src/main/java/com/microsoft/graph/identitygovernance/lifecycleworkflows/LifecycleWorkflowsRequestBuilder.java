package com.microsoft.graph.identitygovernance.lifecycleworkflows;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.customtaskextensions.CustomTaskExtensionsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.settings.SettingsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.taskdefinitions.TaskDefinitionsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.WorkflowsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflowtemplates.WorkflowTemplatesRequestBuilder;
import com.microsoft.graph.models.identitygovernance.LifecycleWorkflowsContainer;
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
 * Provides operations to manage the lifecycleWorkflows property of the microsoft.graph.identityGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecycleWorkflowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the customTaskExtensions property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public CustomTaskExtensionsRequestBuilder customTaskExtensions() {
        return new CustomTaskExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskDefinitions property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public TaskDefinitionsRequestBuilder taskDefinitions() {
        return new TaskDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workflows property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public WorkflowsRequestBuilder workflows() {
        return new WorkflowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workflowTemplates property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @jakarta.annotation.Nonnull
    public WorkflowTemplatesRequestBuilder workflowTemplates() {
        return new WorkflowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecycleWorkflowsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LifecycleWorkflowsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
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
     * Get lifecycleWorkflows from identityGovernance
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer get() {
        return get(null);
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecycleWorkflowsContainer::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer patch(@jakarta.annotation.Nonnull final LifecycleWorkflowsContainer body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer patch(@jakarta.annotation.Nonnull final LifecycleWorkflowsContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LifecycleWorkflowsContainer::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
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
     * Get lifecycleWorkflows from identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
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
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final LifecycleWorkflowsContainer body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final LifecycleWorkflowsContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a LifecycleWorkflowsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public LifecycleWorkflowsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LifecycleWorkflowsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
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
