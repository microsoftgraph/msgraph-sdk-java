package com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments;

import com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.count.CountRequestBuilder;
import com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.item.NumberAssignmentItemRequestBuilder;
import com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.microsoftgraphteamsadministrationassignnumber.MicrosoftGraphTeamsAdministrationAssignNumberRequestBuilder;
import com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.microsoftgraphteamsadministrationunassignnumber.MicrosoftGraphTeamsAdministrationUnassignNumberRequestBuilder;
import com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.microsoftgraphteamsadministrationupdatenumber.MicrosoftGraphTeamsAdministrationUpdateNumberRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.teamsadministration.NumberAssignment;
import com.microsoft.graph.models.teamsadministration.NumberAssignmentCollectionResponse;
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
 * Provides operations to manage the numberAssignments property of the microsoft.graph.teamsAdministration.telephoneNumberManagementRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NumberAssignmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignNumber method.
     * @return a {@link MicrosoftGraphTeamsAdministrationAssignNumberRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphTeamsAdministrationAssignNumberRequestBuilder microsoftGraphTeamsAdministrationAssignNumber() {
        return new MicrosoftGraphTeamsAdministrationAssignNumberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unassignNumber method.
     * @return a {@link MicrosoftGraphTeamsAdministrationUnassignNumberRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphTeamsAdministrationUnassignNumberRequestBuilder microsoftGraphTeamsAdministrationUnassignNumber() {
        return new MicrosoftGraphTeamsAdministrationUnassignNumberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateNumber method.
     * @return a {@link MicrosoftGraphTeamsAdministrationUpdateNumberRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphTeamsAdministrationUpdateNumberRequestBuilder microsoftGraphTeamsAdministrationUpdateNumber() {
        return new MicrosoftGraphTeamsAdministrationUpdateNumberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the numberAssignments property of the microsoft.graph.teamsAdministration.telephoneNumberManagementRoot entity.
     * @param numberAssignmentId The unique identifier of numberAssignment
     * @return a {@link NumberAssignmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NumberAssignmentItemRequestBuilder byNumberAssignmentId(@jakarta.annotation.Nonnull final String numberAssignmentId) {
        Objects.requireNonNull(numberAssignmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("numberAssignment%2Did", numberAssignmentId);
        return new NumberAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NumberAssignmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NumberAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/teams/telephoneNumberManagement/numberAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link NumberAssignmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NumberAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/teams/telephoneNumberManagement/numberAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Read the properties and relationships of microsoft.graph.teamsAdministration.numberAssignment object.
     * @return a {@link NumberAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teamsadministration-telephonenumbermanagementroot-list-numberassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public NumberAssignmentCollectionResponse get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of microsoft.graph.teamsAdministration.numberAssignment object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NumberAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teamsadministration-telephonenumbermanagementroot-list-numberassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public NumberAssignmentCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NumberAssignmentCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to numberAssignments for admin
     * @param body The request body
     * @return a {@link NumberAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NumberAssignment post(@jakarta.annotation.Nonnull final NumberAssignment body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to numberAssignments for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NumberAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public NumberAssignment post(@jakarta.annotation.Nonnull final NumberAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NumberAssignment::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of microsoft.graph.teamsAdministration.numberAssignment object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of microsoft.graph.teamsAdministration.numberAssignment object.
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
     * Create new navigation property to numberAssignments for admin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NumberAssignment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to numberAssignments for admin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NumberAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link NumberAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NumberAssignmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NumberAssignmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of microsoft.graph.teamsAdministration.numberAssignment object.
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
