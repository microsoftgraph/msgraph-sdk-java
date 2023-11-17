package com.microsoft.graph.users.item.calendars.item.events.item.tentativelyaccept;

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
 * Provides operations to call the tentativelyAccept method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TentativelyAcceptRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new TentativelyAcceptRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TentativelyAcceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/events/{event%2Did}/tentativelyAccept", pathParameters);
    }
    /**
     * Instantiates a new TentativelyAcceptRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TentativelyAcceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/events/{event%2Did}/tentativelyAccept", rawUrl);
    }
    /**
     * Tentatively accept the specified event in a user calendar. If the event allows proposals for new times, on responding tentative to the event, an invitee can choose to suggest an alternative time by including the proposedNewTime parameter. For more information on how to propose a time, and how to receive and accept a new time proposal, see Propose new meeting times. This API is available in the following national cloud deployments.
     * @param body The request body
     * @see <a href="https://learn.microsoft.com/graph/api/event-tentativelyaccept?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final TentativelyAcceptPostRequestBody body) {
        post(body, null);
    }
    /**
     * Tentatively accept the specified event in a user calendar. If the event allows proposals for new times, on responding tentative to the event, an invitee can choose to suggest an alternative time by including the proposedNewTime parameter. For more information on how to propose a time, and how to receive and accept a new time proposal, see Propose new meeting times. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/event-tentativelyaccept?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final TentativelyAcceptPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Tentatively accept the specified event in a user calendar. If the event allows proposals for new times, on responding tentative to the event, an invitee can choose to suggest an alternative time by including the proposedNewTime parameter. For more information on how to propose a time, and how to receive and accept a new time proposal, see Propose new meeting times. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TentativelyAcceptPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Tentatively accept the specified event in a user calendar. If the event allows proposals for new times, on responding tentative to the event, an invitee can choose to suggest an alternative time by including the proposedNewTime parameter. For more information on how to propose a time, and how to receive and accept a new time proposal, see Propose new meeting times. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TentativelyAcceptPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a TentativelyAcceptRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TentativelyAcceptRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TentativelyAcceptRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
