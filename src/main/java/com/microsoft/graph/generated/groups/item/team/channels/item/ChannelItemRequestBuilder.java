package com.microsoft.graph.groups.item.team.channels.item;

import com.microsoft.graph.groups.item.team.channels.item.archive.ArchiveRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.completemigration.CompleteMigrationRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.doesuserhaveaccessuseriduseridtenantidtenantiduserprincipalnameuserprincipalname.DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.filesfolder.FilesFolderRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.members.MembersRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.provisionemail.ProvisionEmailRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.removeemail.RemoveEmailRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.sharedwithteams.SharedWithTeamsRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.tabs.TabsRequestBuilder;
import com.microsoft.graph.groups.item.team.channels.item.unarchive.UnarchiveRequestBuilder;
import com.microsoft.graph.models.Channel;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the channels property of the microsoft.graph.team entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the archive method.
     * @return a {@link ArchiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ArchiveRequestBuilder archive() {
        return new ArchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the completeMigration method.
     * @return a {@link CompleteMigrationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompleteMigrationRequestBuilder completeMigration() {
        return new CompleteMigrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the doesUserHaveAccess method.
     * @return a {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder doesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalName() {
        return new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the filesFolder property of the microsoft.graph.channel entity.
     * @return a {@link FilesFolderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilesFolderRequestBuilder filesFolder() {
        return new FilesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.channel entity.
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.channel entity.
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the provisionEmail method.
     * @return a {@link ProvisionEmailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisionEmailRequestBuilder provisionEmail() {
        return new ProvisionEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeEmail method.
     * @return a {@link RemoveEmailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveEmailRequestBuilder removeEmail() {
        return new RemoveEmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharedWithTeams property of the microsoft.graph.channel entity.
     * @return a {@link SharedWithTeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharedWithTeamsRequestBuilder sharedWithTeams() {
        return new SharedWithTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tabs property of the microsoft.graph.channel entity.
     * @return a {@link TabsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TabsRequestBuilder tabs() {
        return new TabsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unarchive method.
     * @return a {@link UnarchiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnarchiveRequestBuilder unarchive() {
        return new UnarchiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChannelItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/channels/{channel%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ChannelItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChannelItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/channels/{channel%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property channels for groups
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property channels for groups
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
     * The collection of channels and messages associated with the team.
     * @return a {@link Channel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Channel get() {
        return get(null);
    }
    /**
     * The collection of channels and messages associated with the team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Channel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Channel get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property channels in groups
     * @param body The request body
     * @return a {@link Channel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property channels in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Channel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Channel patch(@jakarta.annotation.Nonnull final Channel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Channel::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property channels for groups
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property channels for groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The collection of channels and messages associated with the team.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of channels and messages associated with the team.
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
     * Update the navigation property channels in groups
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Channel body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property channels in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link ChannelItemRequestBuilder}
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
     * The collection of channels and messages associated with the team.
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
