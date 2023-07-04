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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the lifecycleWorkflows property of the microsoft.graph.identityGovernance entity.
 */
public class LifecycleWorkflowsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the customTaskExtensions property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public CustomTaskExtensionsRequestBuilder customTaskExtensions() {
        return new CustomTaskExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskDefinitions property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public TaskDefinitionsRequestBuilder taskDefinitions() {
        return new TaskDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workflows property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public WorkflowsRequestBuilder workflows() {
        return new WorkflowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workflowTemplates property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
     */
    @javax.annotation.Nonnull
    public WorkflowTemplatesRequestBuilder workflowTemplates() {
        return new WorkflowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> executionException = new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> executionException = new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> patch(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> executionException = new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> patch(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> executionException = new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
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
     * Get lifecycleWorkflows from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
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
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get lifecycleWorkflows from identityGovernance
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
