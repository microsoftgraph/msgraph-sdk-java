package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.microsoftgraphidentitygovernanceclearquarantine;

import com.microsoft.graph.models.identitygovernance.Workflow;
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
 * Provides operations to call the clearQuarantine method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.clearQuarantine", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.clearQuarantine", rawUrl);
    }
    /**
     * Release a quarantined workflow so that it resumes processing. A workflow is automatically quarantined when a run exceeds the threshold conditions defined in its quarantineConfiguration. After an administrator reviews the cause of the quarantine, calling this action clears the quarantine state and allows the workflow to run again.
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-clearquarantine?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow post() {
        return post(null);
    }
    /**
     * Release a quarantined workflow so that it resumes processing. A workflow is automatically quarantined when a run exceeds the threshold conditions defined in its quarantineConfiguration. After an administrator reviews the cause of the quarantine, calling this action clears the quarantine state and allows the workflow to run again.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Workflow}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-clearquarantine?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Workflow post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Workflow::createFromDiscriminatorValue);
    }
    /**
     * Release a quarantined workflow so that it resumes processing. A workflow is automatically quarantined when a run exceeds the threshold conditions defined in its quarantineConfiguration. After an administrator reviews the cause of the quarantine, calling this action clears the quarantine state and allows the workflow to run again.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Release a quarantined workflow so that it resumes processing. A workflow is automatically quarantined when a run exceeds the threshold conditions defined in its quarantineConfiguration. After an administrator reviews the cause of the quarantine, calling this action clears the quarantine state and allows the workflow to run again.
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
     * @return a {@link MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphIdentityGovernanceClearQuarantineRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
