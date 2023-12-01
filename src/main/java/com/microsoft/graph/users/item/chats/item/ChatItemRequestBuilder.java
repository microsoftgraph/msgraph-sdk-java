package com.microsoft.graph.users.item.chats.item;

import com.microsoft.graph.models.Chat;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.chats.item.hideforuser.HideForUserRequestBuilder;
import com.microsoft.graph.users.item.chats.item.installedapps.InstalledAppsRequestBuilder;
import com.microsoft.graph.users.item.chats.item.lastmessagepreview.LastMessagePreviewRequestBuilder;
import com.microsoft.graph.users.item.chats.item.markchatreadforuser.MarkChatReadForUserRequestBuilder;
import com.microsoft.graph.users.item.chats.item.markchatunreadforuser.MarkChatUnreadForUserRequestBuilder;
import com.microsoft.graph.users.item.chats.item.members.MembersRequestBuilder;
import com.microsoft.graph.users.item.chats.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.users.item.chats.item.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.users.item.chats.item.pinnedmessages.PinnedMessagesRequestBuilder;
import com.microsoft.graph.users.item.chats.item.sendactivitynotification.SendActivityNotificationRequestBuilder;
import com.microsoft.graph.users.item.chats.item.tabs.TabsRequestBuilder;
import com.microsoft.graph.users.item.chats.item.unhideforuser.UnhideForUserRequestBuilder;
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
 * Provides operations to manage the chats property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the hideForUser method.
     */
    @jakarta.annotation.Nonnull
    public HideForUserRequestBuilder hideForUser() {
        return new HideForUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the installedApps property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastMessagePreview property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public LastMessagePreviewRequestBuilder lastMessagePreview() {
        return new LastMessagePreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markChatReadForUser method.
     */
    @jakarta.annotation.Nonnull
    public MarkChatReadForUserRequestBuilder markChatReadForUser() {
        return new MarkChatReadForUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the markChatUnreadForUser method.
     */
    @jakarta.annotation.Nonnull
    public MarkChatUnreadForUserRequestBuilder markChatUnreadForUser() {
        return new MarkChatUnreadForUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pinnedMessages property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public PinnedMessagesRequestBuilder pinnedMessages() {
        return new PinnedMessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendActivityNotification method.
     */
    @jakarta.annotation.Nonnull
    public SendActivityNotificationRequestBuilder sendActivityNotification() {
        return new SendActivityNotificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tabs property of the microsoft.graph.chat entity.
     */
    @jakarta.annotation.Nonnull
    public TabsRequestBuilder tabs() {
        return new TabsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unhideForUser method.
     */
    @jakarta.annotation.Nonnull
    public UnhideForUserRequestBuilder unhideForUser() {
        return new UnhideForUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ChatItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/chats/{chat%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ChatItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/chats/{chat%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property chats for users
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property chats for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve a single chat (without its messages). This method supports federation. To access a chat, at least one chat member must belong to the tenant the request initiated from. This API is available in the following national cloud deployments.
     * @return a Chat
     * @see <a href="https://learn.microsoft.com/graph/api/chat-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Chat get() {
        return get(null);
    }
    /**
     * Retrieve a single chat (without its messages). This method supports federation. To access a chat, at least one chat member must belong to the tenant the request initiated from. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Chat
     * @see <a href="https://learn.microsoft.com/graph/api/chat-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Chat get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Chat::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property chats in users
     * @param body The request body
     * @return a Chat
     */
    @jakarta.annotation.Nullable
    public Chat patch(@jakarta.annotation.Nonnull final Chat body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property chats in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Chat
     */
    @jakarta.annotation.Nullable
    public Chat patch(@jakarta.annotation.Nonnull final Chat body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Chat::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property chats for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property chats for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve a single chat (without its messages). This method supports federation. To access a chat, at least one chat member must belong to the tenant the request initiated from. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a single chat (without its messages). This method supports federation. To access a chat, at least one chat member must belong to the tenant the request initiated from. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property chats in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Chat body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property chats in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Chat body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ChatItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChatItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChatItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve a single chat (without its messages). This method supports federation. To access a chat, at least one chat member must belong to the tenant the request initiated from. This API is available in the following national cloud deployments.
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
