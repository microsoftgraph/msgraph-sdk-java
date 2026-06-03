package com.microsoft.graph.groups.item.team.channels.item.doesuserhaveaccessuseriduseridtenantidtenantiduserprinc_363088ef;

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
 * Provides operations to call the doesUserHaveAccess method. Original name: DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameRequestBuilder
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/channels/{channel%2Did}/doesUserHaveAccess(userId='@userId',tenantId='@tenantId',userPrincipalName='@userPrincipalName'){?tenantId*,userId*,userPrincipalName*}", pathParameters);
    }
    /**
     * Instantiates a new {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/team/channels/{channel%2Did}/doesUserHaveAccess(userId='@userId',tenantId='@tenantId',userPrincipalName='@userPrincipalName'){?tenantId*,userId*,userPrincipalName*}", rawUrl);
    }
    /**
     * Determine whether a user has access to a channel.
     * @return a {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_db370633}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/channel-doesuserhaveaccess?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_db370633 get() {
        return get(null);
    }
    /**
     * Determine whether a user has access to a channel.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_db370633}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/channel-doesuserhaveaccess?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_db370633 get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_db370633::createFromDiscriminatorValue);
    }
    /**
     * Determine whether a user has access to a channel.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Determine whether a user has access to a channel.
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
     * @return a {@link DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e}
     */
    @jakarta.annotation.Nonnull
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrinc_40d13b0e(rawUrl, requestAdapter);
    }
    /**
     * Determine whether a user has access to a channel.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: tenantId=&apos;@tenantId&apos;
         */
        @jakarta.annotation.Nullable
        public String tenantId;
        /**
         * Usage: userId=&apos;@userId&apos;
         */
        @jakarta.annotation.Nullable
        public String userId;
        /**
         * Usage: userPrincipalName=&apos;@userPrincipalName&apos;
         */
        @jakarta.annotation.Nullable
        public String userPrincipalName;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("tenantId", tenantId);
            allQueryParams.put("userId", userId);
            allQueryParams.put("userPrincipalName", userPrincipalName);
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
