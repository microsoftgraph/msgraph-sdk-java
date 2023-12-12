package com.microsoft.graph.teams.item.channels.item;

import com.microsoft.graph.models.Channel;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.teams.item.channels.item.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.doesuserhaveaccessuseriduseridtenantidtenantiduserprincipalnameuserprincipalname.DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.filesfolder.FilesFolderRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.members.MembersRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.provisionemail.ProvisionEmailRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.removeemail.RemoveEmailRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.sharedwithteams.SharedWithTeamsRequestBuilder;
import com.microsoft.graph.teams.item.channels.item.tabs.TabsRequestBuilder;
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
 * Provides operations to manage the channels property of the microsoft.graph.team entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the completeMigration method.
     */
    @jakarta.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the doesUserHaveAccess method.
     */
    @jakarta.annotation.Nonnull
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder doesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalName() {
        return new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filesFolder property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public FilesFolderRequestBuilder filesFolder() {
        return new FilesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the provisionEmail method.
     */
    @jakarta.annotation.Nonnull
    public ProvisionEmailRequestBuilder provisionEmail() {
        return new ProvisionEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeEmail method.
     */
    @jakarta.annotation.Nonnull
    public RemoveEmailRequestBuilder removeEmail() {
        return new RemoveEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedWithTeams property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public SharedWithTeamsRequestBuilder sharedWithTeams() {
        return new SharedWithTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tabs property of the microsoft.graph.channel entity.
     */
    @jakarta.annotation.Nonnull
    public TabsRequestBuilder tabs() {
        return new TabsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ChannelItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/channels/{channel%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ChannelItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/channels/{channel%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete the channel.
     * @see <a href="https://learn.microsoft.com/graph/api/channel-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete the channel.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/channel-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of a channel. This method supports federation. Only a user who is a member of the shared channel can retrieve channel information.
     * @return a Channel
     * @see <a href="https://learn.microsoft.com/graph/api/channel-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Channel get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a channel. This method supports federation. Only a user who is a member of the shared channel can retrieve channel information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Channel
     * @see <a href="https://learn.microsoft.com/graph/api/channel-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Channel get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of the specified channel.
     * @param body The request body
     * @return a Channel
     * @see <a href="https://learn.microsoft.com/graph/api/channel-patch?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body) {
        return patch(body, null);
    }
    /**
     * Update the properties of the specified channel.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Channel
     * @see <a href="https://learn.microsoft.com/graph/api/channel-patch?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Delete the channel.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete the channel.
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
     * Retrieve the properties and relationships of a channel. This method supports federation. Only a user who is a member of the shared channel can retrieve channel information.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a channel. This method supports federation. Only a user who is a member of the shared channel can retrieve channel information.
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
     * Update the properties of the specified channel.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Channel body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of the specified channel.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Channel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ChannelItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChannelItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChannelItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a channel. This method supports federation. Only a user who is a member of the shared channel can retrieve channel information.
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
