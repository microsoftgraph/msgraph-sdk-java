package com.microsoft.graph.users.item.findmeetingtimes;

import com.microsoft.graph.models.MeetingTimeSuggestionsResult;
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
 * Provides operations to call the findMeetingTimes method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindMeetingTimesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new FindMeetingTimesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindMeetingTimesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/findMeetingTimes", pathParameters);
    }
    /**
     * Instantiates a new FindMeetingTimesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindMeetingTimesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/findMeetingTimes", rawUrl);
    }
    /**
     * Suggest meeting times and locations based on organizer and attendee availability, and time or location constraints specified as parameters. If findMeetingTimes cannot return any meeting suggestions, the response would indicate a reason in the emptySuggestionsReason property. Based on this value, you can better adjust the parameters and call findMeetingTimes again. The algorithm used to suggest meeting times and locations undergoes fine-tuning from time to time. In scenarios like test environments where the input parameters and calendar data remain static, expect that the suggested results may differ over time.
     * @param body The request body
     * @return a CompletableFuture of meetingTimeSuggestionsResult
     * @see <a href="https://learn.microsoft.com/graph/api/user-findmeetingtimes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MeetingTimeSuggestionsResult> post(@jakarta.annotation.Nonnull final FindMeetingTimesPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Suggest meeting times and locations based on organizer and attendee availability, and time or location constraints specified as parameters. If findMeetingTimes cannot return any meeting suggestions, the response would indicate a reason in the emptySuggestionsReason property. Based on this value, you can better adjust the parameters and call findMeetingTimes again. The algorithm used to suggest meeting times and locations undergoes fine-tuning from time to time. In scenarios like test environments where the input parameters and calendar data remain static, expect that the suggested results may differ over time.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of meetingTimeSuggestionsResult
     * @see <a href="https://learn.microsoft.com/graph/api/user-findmeetingtimes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MeetingTimeSuggestionsResult> post(@jakarta.annotation.Nonnull final FindMeetingTimesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, MeetingTimeSuggestionsResult::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Suggest meeting times and locations based on organizer and attendee availability, and time or location constraints specified as parameters. If findMeetingTimes cannot return any meeting suggestions, the response would indicate a reason in the emptySuggestionsReason property. Based on this value, you can better adjust the parameters and call findMeetingTimes again. The algorithm used to suggest meeting times and locations undergoes fine-tuning from time to time. In scenarios like test environments where the input parameters and calendar data remain static, expect that the suggested results may differ over time.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FindMeetingTimesPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Suggest meeting times and locations based on organizer and attendee availability, and time or location constraints specified as parameters. If findMeetingTimes cannot return any meeting suggestions, the response would indicate a reason in the emptySuggestionsReason property. Based on this value, you can better adjust the parameters and call findMeetingTimes again. The algorithm used to suggest meeting times and locations undergoes fine-tuning from time to time. In scenarios like test environments where the input parameters and calendar data remain static, expect that the suggested results may differ over time.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FindMeetingTimesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a findMeetingTimesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FindMeetingTimesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FindMeetingTimesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
