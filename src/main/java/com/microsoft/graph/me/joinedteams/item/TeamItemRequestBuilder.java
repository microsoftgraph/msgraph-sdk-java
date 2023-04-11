package com.microsoft.graph.me.joinedteams.item;

import com.microsoft.graph.me.joinedteams.item.allchannels.AllChannelsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.archive.ArchiveRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.channels.ChannelsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.channels.item.ChannelItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.clone.CloneRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.group.GroupRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.incomingchannels.IncomingChannelsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.installedapps.InstalledAppsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.installedapps.item.TeamsAppInstallationItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.members.item.ConversationMemberItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.members.MembersRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.operations.item.TeamsAsyncOperationItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.photo.PhotoRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.primarychannel.PrimaryChannelRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.schedule.ScheduleRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.sendactivitynotification.SendActivityNotificationRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.tags.item.TeamworkTagItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.tags.TagsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.template.TemplateRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.unarchive.UnarchiveRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Team;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the joinedTeams property of the microsoft.graph.user entity.
 */
public class TeamItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the allChannels property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public AllChannelsRequestBuilder allChannels() {
        return new AllChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the archive method. */
    @javax.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the channels property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public ChannelsRequestBuilder channels() {
        return new ChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the clone method. */
    @javax.annotation.Nonnull
    public CloneRequestBuilder clone() {
        return new CloneRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the completeMigration method. */
    @javax.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the group property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the incomingChannels property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public IncomingChannelsRequestBuilder incomingChannels() {
        return new IncomingChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the installedApps property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the members property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the photo property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the primaryChannel property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public PrimaryChannelRequestBuilder primaryChannel() {
        return new PrimaryChannelRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the schedule property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sendActivityNotification method. */
    @javax.annotation.Nonnull
    public SendActivityNotificationRequestBuilder sendActivityNotification() {
        return new SendActivityNotificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tags property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the template property of the microsoft.graph.team entity. */
    @javax.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unarchive method. */
    @javax.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the allChannels property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a ChannelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.joinedteams.item.allchannels.item.ChannelItemRequestBuilder allChannels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new com.microsoft.graph.me.joinedteams.item.allchannels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the channels property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a ChannelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.joinedteams.item.channels.item.ChannelItemRequestBuilder channels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new com.microsoft.graph.me.joinedteams.item.channels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TeamItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/joinedTeams/{team%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TeamItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/joinedTeams/{team%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property joinedTeams for me
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property joinedTeams for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get joinedTeams from me
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get joinedTeams from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the incomingChannels property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a ChannelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.joinedteams.item.incomingchannels.item.ChannelItemRequestBuilder incomingChannels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new com.microsoft.graph.me.joinedteams.item.incomingchannels.item.ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the installedApps property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a TeamsAppInstallationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAppInstallationItemRequestBuilder installedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAppInstallation%2Did", id);
        return new TeamsAppInstallationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a ConversationMemberItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConversationMemberItemRequestBuilder members(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationMember%2Did", id);
        return new ConversationMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a TeamsAsyncOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAsyncOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAsyncOperation%2Did", id);
        return new TeamsAsyncOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property joinedTeams in me
     * @param body The request body
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> patch(@javax.annotation.Nonnull final Team body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property joinedTeams in me
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Team> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Team> executionException = new java.util.concurrent.CompletableFuture<Team>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the tags property of the microsoft.graph.team entity.
     * @param id Unique identifier of the item
     * @return a TeamworkTagItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamworkTagItemRequestBuilder tags(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamworkTag%2Did", id);
        return new TeamworkTagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property joinedTeams for me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property joinedTeams for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get joinedTeams from me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get joinedTeams from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the navigation property joinedTeams in me
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Team body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property joinedTeams in me
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get joinedTeams from me
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
