package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.microsoftgraphidentitygovernancepreviewtaskfailures;

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
 * Provides operations to call the previewTaskFailures method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.previewTaskFailures", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.previewTaskFailures", rawUrl);
    }
    /**
     * Validate the tasks configured in a workflow to check for configuration errors. This action identifies any tasks that would fail during execution, allowing you to fix issues before running the workflow. Returns an empty collection if no task failures are detected.
     * @return a {@link PreviewTaskFailuresPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-previewtaskfailures?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PreviewTaskFailuresPostResponse post() {
        return post(null);
    }
    /**
     * Validate the tasks configured in a workflow to check for configuration errors. This action identifies any tasks that would fail during execution, allowing you to fix issues before running the workflow. Returns an empty collection if no task failures are detected.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PreviewTaskFailuresPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-previewtaskfailures?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PreviewTaskFailuresPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PreviewTaskFailuresPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Validate the tasks configured in a workflow to check for configuration errors. This action identifies any tasks that would fail during execution, allowing you to fix issues before running the workflow. Returns an empty collection if no task failures are detected.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Validate the tasks configured in a workflow to check for configuration errors. This action identifies any tasks that would fail during execution, allowing you to fix issues before running the workflow. Returns an empty collection if no task failures are detected.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphIdentityGovernancePreviewTaskFailuresRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
