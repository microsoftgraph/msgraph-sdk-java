package microsoft.graph.teams.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.Team;
import microsoft.graph.teams.item.archive.ArchiveRequestBuilder;
import microsoft.graph.teams.item.channels.ChannelsRequestBuilder;
import microsoft.graph.teams.item.channels.item.ChannelItemRequestBuilder;
import microsoft.graph.teams.item.clone.CloneRequestBuilder;
import microsoft.graph.teams.item.completemigration.CompleteMigrationRequestBuilder;
import microsoft.graph.teams.item.group.GroupRequestBuilder;
import microsoft.graph.teams.item.installedapps.InstalledAppsRequestBuilder;
import microsoft.graph.teams.item.installedapps.item.TeamsAppInstallationItemRequestBuilder;
import microsoft.graph.teams.item.members.item.ConversationMemberItemRequestBuilder;
import microsoft.graph.teams.item.members.MembersRequestBuilder;
import microsoft.graph.teams.item.operations.item.TeamsAsyncOperationItemRequestBuilder;
import microsoft.graph.teams.item.operations.OperationsRequestBuilder;
import microsoft.graph.teams.item.primarychannel.PrimaryChannelRequestBuilder;
import microsoft.graph.teams.item.schedule.ScheduleRequestBuilder;
import microsoft.graph.teams.item.sendactivitynotification.SendActivityNotificationRequestBuilder;
import microsoft.graph.teams.item.template.TemplateRequestBuilder;
import microsoft.graph.teams.item.unarchive.UnarchiveRequestBuilder;
/** Provides operations to manage the collection of team entities.  */
public class TeamItemRequestBuilder {
    /** The archive property  */
    @javax.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The channels property  */
    @javax.annotation.Nonnull
    public ChannelsRequestBuilder channels() {
        return new ChannelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The clone property  */
    @javax.annotation.Nonnull
    public CloneRequestBuilder clone() {
        return new CloneRequestBuilder(pathParameters, requestAdapter);
    }
    /** The completeMigration property  */
    @javax.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The group property  */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** The installedApps property  */
    @javax.annotation.Nonnull
    public InstalledAppsRequestBuilder installedApps() {
        return new InstalledAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The members property  */
    @javax.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operations property  */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The primaryChannel property  */
    @javax.annotation.Nonnull
    public PrimaryChannelRequestBuilder primaryChannel() {
        return new PrimaryChannelRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The schedule property  */
    @javax.annotation.Nonnull
    public ScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendActivityNotification property  */
    @javax.annotation.Nonnull
    public SendActivityNotificationRequestBuilder sendActivityNotification() {
        return new SendActivityNotificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The template property  */
    @javax.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unarchive property  */
    @javax.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.teams.item.channels.item collection
     * @param id Unique identifier of the item
     * @return a channelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChannelItemRequestBuilder channels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel%2Did", id);
        return new ChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TeamItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public TeamItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new TeamItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public TeamItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete entity from teams
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete entity from teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TeamItemRequestBuilderDeleteRequestConfiguration requestConfig = new TeamItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entity from teams by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entity from teams by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final TeamItemRequestBuilderGetRequestConfiguration requestConfig = new TeamItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in teams
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Team body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final TeamItemRequestBuilderPatchRequestConfiguration requestConfig = new TeamItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete entity from teams
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete entity from teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete entity from teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entity from teams by key
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entity from teams by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entity from teams by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of team
     */
    public java.util.concurrent.CompletableFuture<Team> get(@javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Team::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.teams.item.installedApps.item collection
     * @param id Unique identifier of the item
     * @return a teamsAppInstallationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAppInstallationItemRequestBuilder installedApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAppInstallation%2Did", id);
        return new TeamsAppInstallationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.teams.item.members.item collection
     * @param id Unique identifier of the item
     * @return a conversationMemberItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConversationMemberItemRequestBuilder members(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationMember%2Did", id);
        return new ConversationMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.teams.item.operations.item collection
     * @param id Unique identifier of the item
     * @return a teamsAsyncOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsAsyncOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsAsyncOperation%2Did", id);
        return new TeamsAsyncOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in teams
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update entity in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update entity in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Team body, @javax.annotation.Nullable final java.util.function.Consumer<TeamItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class TeamItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new teamItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get entity from teams by key  */
    public class TeamItemRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class TeamItemRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public TeamItemRequestBuilderGetQueryParameters queryParameters = new TeamItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new teamItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class TeamItemRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new teamItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public TeamItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
