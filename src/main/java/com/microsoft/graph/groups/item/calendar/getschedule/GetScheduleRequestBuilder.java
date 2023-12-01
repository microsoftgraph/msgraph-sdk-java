package com.microsoft.graph.groups.item.calendar.getschedule;

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
 * Provides operations to call the getSchedule method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetScheduleRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetScheduleRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetScheduleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/calendar/getSchedule", pathParameters);
    }
    /**
     * Instantiates a new GetScheduleRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetScheduleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/calendar/getSchedule", rawUrl);
    }
    /**
     * Get the free/busy availability information for a collection of users, distributions lists, or resources (rooms or equipment) for a specified time period. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a GetSchedulePostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-getschedule?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetSchedulePostResponse post(@jakarta.annotation.Nonnull final GetSchedulePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Get the free/busy availability information for a collection of users, distributions lists, or resources (rooms or equipment) for a specified time period. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a GetSchedulePostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-getschedule?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetSchedulePostResponse post(@jakarta.annotation.Nonnull final GetSchedulePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetSchedulePostResponse::createFromDiscriminatorValue);
    }
    /**
     * Get the free/busy availability information for a collection of users, distributions lists, or resources (rooms or equipment) for a specified time period. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetSchedulePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Get the free/busy availability information for a collection of users, distributions lists, or resources (rooms or equipment) for a specified time period. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetSchedulePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a GetScheduleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetScheduleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetScheduleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
