package com.microsoft.graph.users.item.presence.setautomaticlocation;

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
 * Provides operations to call the setAutomaticLocation method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetAutomaticLocationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SetAutomaticLocationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetAutomaticLocationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/presence/setAutomaticLocation", pathParameters);
    }
    /**
     * Instantiates a new {@link SetAutomaticLocationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetAutomaticLocationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/presence/setAutomaticLocation", rawUrl);
    }
    /**
     * Update the automatic work location for a user. The automatic layer participates in the standard precedence model: Use this operation from clients or services that automatically detect location (for example, Teams, network and location agents, or OEM docking apps). It doesn&apos;t clear manual or scheduled signals.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/presence-setautomaticlocation?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final SetAutomaticLocationPostRequestBody body) {
        post(body, null);
    }
    /**
     * Update the automatic work location for a user. The automatic layer participates in the standard precedence model: Use this operation from clients or services that automatically detect location (for example, Teams, network and location agents, or OEM docking apps). It doesn&apos;t clear manual or scheduled signals.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/presence-setautomaticlocation?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final SetAutomaticLocationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Update the automatic work location for a user. The automatic layer participates in the standard precedence model: Use this operation from clients or services that automatically detect location (for example, Teams, network and location agents, or OEM docking apps). It doesn&apos;t clear manual or scheduled signals.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetAutomaticLocationPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Update the automatic work location for a user. The automatic layer participates in the standard precedence model: Use this operation from clients or services that automatically detect location (for example, Teams, network and location agents, or OEM docking apps). It doesn&apos;t clear manual or scheduled signals.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetAutomaticLocationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SetAutomaticLocationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetAutomaticLocationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SetAutomaticLocationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
