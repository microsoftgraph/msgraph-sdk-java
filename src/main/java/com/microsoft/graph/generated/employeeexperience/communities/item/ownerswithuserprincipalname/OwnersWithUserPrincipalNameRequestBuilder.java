package com.microsoft.graph.employeeexperience.communities.item.ownerswithuserprincipalname;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
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
 * Provides operations to manage the owners property of the microsoft.graph.community entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OwnersWithUserPrincipalNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link OwnersWithUserPrincipalNameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param userPrincipalName Alternate key of user
     */
    public OwnersWithUserPrincipalNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String userPrincipalName) {
        super(requestAdapter, "{+baseurl}/employeeExperience/communities/{community%2Did}/owners(userPrincipalName='{userPrincipalName}'){?%24expand,%24select}", pathParameters);
        this.pathParameters.put("userPrincipalName", userPrincipalName);
    }
    /**
     * Instantiates a new {@link OwnersWithUserPrincipalNameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OwnersWithUserPrincipalNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/employeeExperience/communities/{community%2Did}/owners(userPrincipalName='{userPrincipalName}'){?%24expand,%24select}", rawUrl);
    }
    /**
     * The admins of the community. Limited to 100 users. If this property isn't specified when you create the community, the calling user is automatically assigned as the community owner.
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public User get() {
        return get(null);
    }
    /**
     * The admins of the community. Limited to 100 users. If this property isn't specified when you create the community, the calling user is automatically assigned as the community owner.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public User get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * The admins of the community. Limited to 100 users. If this property isn't specified when you create the community, the calling user is automatically assigned as the community owner.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The admins of the community. Limited to 100 users. If this property isn't specified when you create the community, the calling user is automatically assigned as the community owner.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OwnersWithUserPrincipalNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersWithUserPrincipalNameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OwnersWithUserPrincipalNameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The admins of the community. Limited to 100 users. If this property isn't specified when you create the community, the calling user is automatically assigned as the community owner.
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
}
