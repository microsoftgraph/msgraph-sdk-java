package com.microsoft.graph.security.collaboration.analyzedemails.microsoftgraphsecurityremediate;

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
 * Provides operations to call the remediate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityRemediateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityRemediateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityRemediateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/collaboration/analyzedEmails/microsoft.graph.security.remediate", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityRemediateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityRemediateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/collaboration/analyzedEmails/microsoft.graph.security.remediate", rawUrl);
    }
    /**
     * Remove a potential threat from end users&apos; mailboxes. Remediation means to take prescribed action against a threat. This API can trigger email purge actions like move to junk, move to deleted items, soft delete, hard delete, or move to Inbox. This API enables scenarios and use cases such as SOAR integration, playbooks, and automations. For more information read email remediation, trigger action and track actions. If there is false positives admins can take move to inbox action.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-analyzedemail-remediate?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final RemediatePostRequestBody body) {
        post(body, null);
    }
    /**
     * Remove a potential threat from end users&apos; mailboxes. Remediation means to take prescribed action against a threat. This API can trigger email purge actions like move to junk, move to deleted items, soft delete, hard delete, or move to Inbox. This API enables scenarios and use cases such as SOAR integration, playbooks, and automations. For more information read email remediation, trigger action and track actions. If there is false positives admins can take move to inbox action.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-analyzedemail-remediate?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final RemediatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Remove a potential threat from end users&apos; mailboxes. Remediation means to take prescribed action against a threat. This API can trigger email purge actions like move to junk, move to deleted items, soft delete, hard delete, or move to Inbox. This API enables scenarios and use cases such as SOAR integration, playbooks, and automations. For more information read email remediation, trigger action and track actions. If there is false positives admins can take move to inbox action.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RemediatePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Remove a potential threat from end users&apos; mailboxes. Remediation means to take prescribed action against a threat. This API can trigger email purge actions like move to junk, move to deleted items, soft delete, hard delete, or move to Inbox. This API enables scenarios and use cases such as SOAR integration, playbooks, and automations. For more information read email remediation, trigger action and track actions. If there is false positives admins can take move to inbox action.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RemediatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MicrosoftGraphSecurityRemediateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRemediateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityRemediateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
