package com.microsoft.graph.admin.teams.policy.userassignments;

import com.microsoft.graph.admin.teams.policy.userassignments.count.CountRequestBuilder;
import com.microsoft.graph.admin.teams.policy.userassignments.item.TeamsPolicyUserAssignmentItemRequestBuilder;
import com.microsoft.graph.admin.teams.policy.userassignments.microsoftgraphteamsadministrationassign.MicrosoftGraphTeamsAdministrationAssignRequestBuilder;
import com.microsoft.graph.admin.teams.policy.userassignments.microsoftgraphteamsadministrationunassign.MicrosoftGraphTeamsAdministrationUnassignRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.teamsadministration.TeamsPolicyUserAssignment;
import com.microsoft.graph.models.teamsadministration.TeamsPolicyUserAssignmentCollectionResponse;
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
 * Provides operations to manage the userAssignments property of the microsoft.graph.teamsAdministration.teamsPolicyAssignment entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAssignmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assign method.
     * @return a {@link MicrosoftGraphTeamsAdministrationAssignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphTeamsAdministrationAssignRequestBuilder microsoftGraphTeamsAdministrationAssign() {
        return new MicrosoftGraphTeamsAdministrationAssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unassign method.
     * @return a {@link MicrosoftGraphTeamsAdministrationUnassignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphTeamsAdministrationUnassignRequestBuilder microsoftGraphTeamsAdministrationUnassign() {
        return new MicrosoftGraphTeamsAdministrationUnassignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userAssignments property of the microsoft.graph.teamsAdministration.teamsPolicyAssignment entity.
     * @param teamsPolicyUserAssignmentId The unique identifier of teamsPolicyUserAssignment
     * @return a {@link TeamsPolicyUserAssignmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsPolicyUserAssignmentItemRequestBuilder byTeamsPolicyUserAssignmentId(@jakarta.annotation.Nonnull final String teamsPolicyUserAssignmentId) {
        Objects.requireNonNull(teamsPolicyUserAssignmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsPolicyUserAssignment%2Did", teamsPolicyUserAssignmentId);
        return new TeamsPolicyUserAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserAssignmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "", pathParameters);
    }
    /**
     * Instantiates a new {@link UserAssignmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "", rawUrl);
    }
    /**
     * The collection of user policy assignments.
     * @return a {@link TeamsPolicyUserAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TeamsPolicyUserAssignmentCollectionResponse get() {
        return get(null);
    }
    /**
     * The collection of user policy assignments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TeamsPolicyUserAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TeamsPolicyUserAssignmentCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TeamsPolicyUserAssignmentCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to userAssignments for admin
     * @param body The request body
     * @return a {@link TeamsPolicyUserAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TeamsPolicyUserAssignment post(@jakarta.annotation.Nonnull final TeamsPolicyUserAssignment body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to userAssignments for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TeamsPolicyUserAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public TeamsPolicyUserAssignment post(@jakarta.annotation.Nonnull final TeamsPolicyUserAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TeamsPolicyUserAssignment::createFromDiscriminatorValue);
    }
    /**
     * The collection of user policy assignments.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of user policy assignments.
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
     * Create new navigation property to userAssignments for admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TeamsPolicyUserAssignment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to userAssignments for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TeamsPolicyUserAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserAssignmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserAssignmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The collection of user policy assignments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
