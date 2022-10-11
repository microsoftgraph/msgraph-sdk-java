package com.microsoft.graph.users.item.teamwork.associatedteams;

import com.microsoft.graph.models.AssociatedTeamInfo;
import com.microsoft.graph.models.AssociatedTeamInfoCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.teamwork.associatedteams.count.CountRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the associatedTeams property of the microsoft.graph.userTeamwork entity. */
public class AssociatedTeamsRequestBuilder {
    /** The Count property */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new AssociatedTeamsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssociatedTeamsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/teamwork/associatedTeams{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AssociatedTeamsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssociatedTeamsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/teamwork/associatedTeams{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the list of teams in Microsoft Teams that a user is associated with.Currently, a user can be associated with a team in two different ways:* A user can be a direct member of a team.* A user can be a member of a shared channel that is hosted inside a team.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the list of teams in Microsoft Teams that a user is associated with.Currently, a user can be associated with a team in two different ways:* A user can be a direct member of a team.* A user can be a member of a shared channel that is hosted inside a team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AssociatedTeamsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final AssociatedTeamsRequestBuilderGetRequestConfiguration requestConfig = new AssociatedTeamsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to associatedTeams for users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final AssociatedTeamInfo body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to associatedTeams for users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final AssociatedTeamInfo body, @javax.annotation.Nullable final java.util.function.Consumer<AssociatedTeamsRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AssociatedTeamsRequestBuilderPostRequestConfiguration requestConfig = new AssociatedTeamsRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the list of teams in Microsoft Teams that a user is associated with.Currently, a user can be associated with a team in two different ways:* A user can be a direct member of a team.* A user can be a member of a shared channel that is hosted inside a team.
     * @return a CompletableFuture of AssociatedTeamInfoCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AssociatedTeamInfoCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AssociatedTeamInfoCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AssociatedTeamInfoCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get the list of teams in Microsoft Teams that a user is associated with.Currently, a user can be associated with a team in two different ways:* A user can be a direct member of a team.* A user can be a member of a shared channel that is hosted inside a team.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of AssociatedTeamInfoCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AssociatedTeamInfoCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<AssociatedTeamsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AssociatedTeamInfoCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AssociatedTeamInfoCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Create new navigation property to associatedTeams for users
     * @param body 
     * @return a CompletableFuture of associatedTeamInfo
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AssociatedTeamInfo> post(@javax.annotation.Nonnull final AssociatedTeamInfo body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AssociatedTeamInfo::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AssociatedTeamInfo>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Create new navigation property to associatedTeams for users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of associatedTeamInfo
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AssociatedTeamInfo> post(@javax.annotation.Nonnull final AssociatedTeamInfo body, @javax.annotation.Nullable final java.util.function.Consumer<AssociatedTeamsRequestBuilderPostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AssociatedTeamInfo::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AssociatedTeamInfo>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Get the list of teams in Microsoft Teams that a user is associated with.Currently, a user can be associated with a team in two different ways:* A user can be a direct member of a team.* A user can be a member of a shared channel that is hosted inside a team. */
    public class AssociatedTeamsRequestBuilderGetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AssociatedTeamsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public AssociatedTeamsRequestBuilderGetQueryParameters queryParameters = new AssociatedTeamsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new associatedTeamsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public AssociatedTeamsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AssociatedTeamsRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new associatedTeamsRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public AssociatedTeamsRequestBuilderPostRequestConfiguration() {
        }
    }
}
