package com.microsoft.graph.communications.calls.item.mute;

import com.microsoft.graph.models.MuteParticipantOperation;
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
 * Provides operations to call the mute method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MuteRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MuteRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MuteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/mute", pathParameters);
    }
    /**
     * Instantiates a new MuteRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MuteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/mute", rawUrl);
    }
    /**
     * Allows the application to mute itself. This is a server mute, meaning that the server will drop all audio packets for this participant, even if the participant continues to stream audio. For more details about how to handle mute operations, see muteParticipantOperation
     * @param body The request body
     * @return a CompletableFuture of MuteParticipantOperation
     * @see <a href="https://learn.microsoft.com/graph/api/call-mute?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MuteParticipantOperation> post(@jakarta.annotation.Nonnull final MutePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Allows the application to mute itself. This is a server mute, meaning that the server will drop all audio packets for this participant, even if the participant continues to stream audio. For more details about how to handle mute operations, see muteParticipantOperation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of MuteParticipantOperation
     * @see <a href="https://learn.microsoft.com/graph/api/call-mute?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MuteParticipantOperation> post(@jakarta.annotation.Nonnull final MutePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, MuteParticipantOperation::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Allows the application to mute itself. This is a server mute, meaning that the server will drop all audio packets for this participant, even if the participant continues to stream audio. For more details about how to handle mute operations, see muteParticipantOperation
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MutePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Allows the application to mute itself. This is a server mute, meaning that the server will drop all audio packets for this participant, even if the participant continues to stream audio. For more details about how to handle mute operations, see muteParticipantOperation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MutePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a MuteRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MuteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MuteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
