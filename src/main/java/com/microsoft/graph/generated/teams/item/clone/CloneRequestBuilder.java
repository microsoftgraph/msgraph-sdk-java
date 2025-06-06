package com.microsoft.graph.teams.item.clone;

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
 * Provides operations to call the clone method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloneRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CloneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/clone", pathParameters);
    }
    /**
     * Instantiates a new {@link CloneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/clone", rawUrl);
    }
    /**
     * Create a copy of a team. This operation also creates a copy of the corresponding group.You can specify which parts of the team to clone: When tabs are cloned, they aren&apos;t configured. The tabs are displayed on the tab bar in Microsoft Teams, and the first time a user opens them, they must go through the configuration screen. If the user who opens the tab doesn&apos;t have permission to configure apps, they see a message that says that the tab isn&apos;t configured. Cloning is a long-running operation. After the POST clone returns, you need to GET the operation returned by the Location: header to see if it&apos;s running, succeeded, or failed. You should continue to GET until the status isn&apos;t running. The recommended delay between GETs is 5 seconds.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-clone?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ClonePostRequestBody body) {
        post(body, null);
    }
    /**
     * Create a copy of a team. This operation also creates a copy of the corresponding group.You can specify which parts of the team to clone: When tabs are cloned, they aren&apos;t configured. The tabs are displayed on the tab bar in Microsoft Teams, and the first time a user opens them, they must go through the configuration screen. If the user who opens the tab doesn&apos;t have permission to configure apps, they see a message that says that the tab isn&apos;t configured. Cloning is a long-running operation. After the POST clone returns, you need to GET the operation returned by the Location: header to see if it&apos;s running, succeeded, or failed. You should continue to GET until the status isn&apos;t running. The recommended delay between GETs is 5 seconds.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/team-clone?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final ClonePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Create a copy of a team. This operation also creates a copy of the corresponding group.You can specify which parts of the team to clone: When tabs are cloned, they aren&apos;t configured. The tabs are displayed on the tab bar in Microsoft Teams, and the first time a user opens them, they must go through the configuration screen. If the user who opens the tab doesn&apos;t have permission to configure apps, they see a message that says that the tab isn&apos;t configured. Cloning is a long-running operation. After the POST clone returns, you need to GET the operation returned by the Location: header to see if it&apos;s running, succeeded, or failed. You should continue to GET until the status isn&apos;t running. The recommended delay between GETs is 5 seconds.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ClonePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a copy of a team. This operation also creates a copy of the corresponding group.You can specify which parts of the team to clone: When tabs are cloned, they aren&apos;t configured. The tabs are displayed on the tab bar in Microsoft Teams, and the first time a user opens them, they must go through the configuration screen. If the user who opens the tab doesn&apos;t have permission to configure apps, they see a message that says that the tab isn&apos;t configured. Cloning is a long-running operation. After the POST clone returns, you need to GET the operation returned by the Location: header to see if it&apos;s running, succeeded, or failed. You should continue to GET until the status isn&apos;t running. The recommended delay between GETs is 5 seconds.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ClonePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CloneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
