package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.microsoftgraphidentitygovernanceactivateandwait;

import com.microsoft.graph.models.identitygovernance.AwaitedWorkflowProcessingResult;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the activateAndWait method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.activateAndWait", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.activateAndWait", rawUrl);
    }
    /**
     * Activate a lifecycle workflow for a specified subject and synchronously wait for execution to complete. This action returns an awaitedWorkflowProcessingResult with the execution outcome. Use this action when you need immediate confirmation of workflow completion, for example when provisioning a non-user subject.
     * @param body The request body
     * @return a {@link AwaitedWorkflowProcessingResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-activateandwait?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AwaitedWorkflowProcessingResult post(@jakarta.annotation.Nonnull final ActivateAndWaitPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Activate a lifecycle workflow for a specified subject and synchronously wait for execution to complete. This action returns an awaitedWorkflowProcessingResult with the execution outcome. Use this action when you need immediate confirmation of workflow completion, for example when provisioning a non-user subject.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AwaitedWorkflowProcessingResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-activateandwait?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AwaitedWorkflowProcessingResult post(@jakarta.annotation.Nonnull final ActivateAndWaitPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AwaitedWorkflowProcessingResult::createFromDiscriminatorValue);
    }
    /**
     * Activate a lifecycle workflow for a specified subject and synchronously wait for execution to complete. This action returns an awaitedWorkflowProcessingResult with the execution outcome. Use this action when you need immediate confirmation of workflow completion, for example when provisioning a non-user subject.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActivateAndWaitPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Activate a lifecycle workflow for a specified subject and synchronously wait for execution to complete. This action returns an awaitedWorkflowProcessingResult with the execution outcome. Use this action when you need immediate confirmation of workflow completion, for example when provisioning a non-user subject.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActivateAndWaitPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphIdentityGovernanceActivateAndWaitRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
