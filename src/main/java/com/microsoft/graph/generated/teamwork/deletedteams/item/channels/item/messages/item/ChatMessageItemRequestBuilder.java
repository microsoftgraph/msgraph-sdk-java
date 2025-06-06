package com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item;

import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.hostedcontents.HostedContentsRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.replies.RepliesRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.setreaction.SetReactionRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.softdelete.SoftDeleteRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.undosoftdelete.UndoSoftDeleteRequestBuilder;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.unsetreaction.UnsetReactionRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the messages property of the microsoft.graph.channel entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the hostedContents property of the microsoft.graph.chatMessage entity.
     * @return a {@link HostedContentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HostedContentsRequestBuilder hostedContents() {
        return new HostedContentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the replies property of the microsoft.graph.chatMessage entity.
     * @return a {@link RepliesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RepliesRequestBuilder replies() {
        return new RepliesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setReaction method.
     * @return a {@link SetReactionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetReactionRequestBuilder setReaction() {
        return new SetReactionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the softDelete method.
     * @return a {@link SoftDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SoftDeleteRequestBuilder softDelete() {
        return new SoftDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the undoSoftDelete method.
     * @return a {@link UndoSoftDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UndoSoftDeleteRequestBuilder undoSoftDelete() {
        return new UndoSoftDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unsetReaction method.
     * @return a {@link UnsetReactionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnsetReactionRequestBuilder unsetReaction() {
        return new UnsetReactionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChatMessageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatMessageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/messages/{chatMessage%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ChatMessageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatMessageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/messages/{chatMessage%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property messages for teamwork
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property messages for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     * @return a {@link ChatMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ChatMessage get() {
        return get(null);
    }
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ChatMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ChatMessage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessage::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property messages in teamwork
     * @param body The request body
     * @return a {@link ChatMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ChatMessage patch(@jakarta.annotation.Nonnull final ChatMessage body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property messages in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ChatMessage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ChatMessage patch(@jakarta.annotation.Nonnull final ChatMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessage::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property messages for teamwork
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property messages for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property messages in teamwork
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ChatMessage body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property messages in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ChatMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ChatMessageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChatMessageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChatMessageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
