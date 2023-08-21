package com.microsoft.graph.users.item.mailfolders.item.messages.item;

import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.copy.CopyRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.createforward.CreateForwardRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.createreply.CreateReplyRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.createreplyall.CreateReplyAllRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.forward.ForwardRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.move.MoveRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.reply.ReplyRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.replyall.ReplyAllRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.send.SendRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.messages.item.value.ContentRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the messages property of the microsoft.graph.mailFolder entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.message entity.
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the user entity.
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the copy method.
     */
    @jakarta.annotation.Nonnull
    public CopyRequestBuilder copy() {
        return new CopyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createForward method.
     */
    @jakarta.annotation.Nonnull
    public CreateForwardRequestBuilder createForward() {
        return new CreateForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createReply method.
     */
    @jakarta.annotation.Nonnull
    public CreateReplyRequestBuilder createReply() {
        return new CreateReplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createReplyAll method.
     */
    @jakarta.annotation.Nonnull
    public CreateReplyAllRequestBuilder createReplyAll() {
        return new CreateReplyAllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.message entity.
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the forward method.
     */
    @jakarta.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the move method.
     */
    @jakarta.annotation.Nonnull
    public MoveRequestBuilder move() {
        return new MoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reply method.
     */
    @jakarta.annotation.Nonnull
    public ReplyRequestBuilder reply() {
        return new ReplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replyAll method.
     */
    @jakarta.annotation.Nonnull
    public ReplyAllRequestBuilder replyAll() {
        return new ReplyAllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the send method.
     */
    @jakarta.annotation.Nonnull
    public SendRequestBuilder send() {
        return new SendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MessageItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MessageItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property messages for users
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property messages for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * The collection of messages in the mailFolder.
     * @return a CompletableFuture of message
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Message> get() {
        return get(null);
    }
    /**
     * The collection of messages in the mailFolder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of message
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Message> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Message::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @return a CompletableFuture of message
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Message> patch(@jakarta.annotation.Nonnull final Message body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of message
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Message> patch(@jakarta.annotation.Nonnull final Message body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Message::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property messages for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property messages for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The collection of messages in the mailFolder.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of messages in the mailFolder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Message body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property messages in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Message body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of messages in the mailFolder.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
