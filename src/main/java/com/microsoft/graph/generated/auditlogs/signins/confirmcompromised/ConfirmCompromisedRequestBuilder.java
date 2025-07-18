package com.microsoft.graph.auditlogs.signins.confirmcompromised;

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
 * Provides operations to call the confirmCompromised method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfirmCompromisedRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConfirmCompromisedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfirmCompromisedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs/signIns/confirmCompromised", pathParameters);
    }
    /**
     * Instantiates a new {@link ConfirmCompromisedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfirmCompromisedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs/signIns/confirmCompromised", rawUrl);
    }
    /**
     * Mark an event in the Microsoft Entra sign-in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Microsoft Entra ID Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Microsoft Entra ID Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/signin-confirmcompromised?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body) {
        post(body, null);
    }
    /**
     * Mark an event in the Microsoft Entra sign-in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Microsoft Entra ID Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Microsoft Entra ID Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/signin-confirmcompromised?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Mark an event in the Microsoft Entra sign-in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Microsoft Entra ID Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Microsoft Entra ID Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Mark an event in the Microsoft Entra sign-in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Microsoft Entra ID Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Microsoft Entra ID Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ConfirmCompromisedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfirmCompromisedRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfirmCompromisedRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
