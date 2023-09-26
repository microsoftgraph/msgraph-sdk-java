package com.microsoft.graph.chats.item.permissiongrants.item.getmembergroups;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the getMemberGroups method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMemberGroupsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetMemberGroupsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMemberGroupsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/chats/{chat%2Did}/permissionGrants/{resourceSpecificPermissionGrant%2Did}/getMemberGroups", pathParameters);
    }
    /**
     * Instantiates a new GetMemberGroupsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMemberGroupsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/chats/{chat%2Did}/permissionGrants/{resourceSpecificPermissionGrant%2Did}/getMemberGroups", rawUrl);
    }
    /**
     * Return all the group IDs for the groups that the specified user, group, service principal, organizational contact, device, or directory object is a member of. This function is transitive. This API returns up to 11,000 group IDs. If more than 11,000 results are available, it returns a 400 Bad Request error with the Directory_ResultSizeLimitExceeded error code. As a workaround, use the List group transitive memberOf API.
     * @param body The request body
     * @return a CompletableFuture of GetMemberGroupsResponse
     * @see <a href="https://learn.microsoft.com/graph/api/directoryobject-getmembergroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetMemberGroupsResponse> post(@jakarta.annotation.Nonnull final GetMemberGroupsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Return all the group IDs for the groups that the specified user, group, service principal, organizational contact, device, or directory object is a member of. This function is transitive. This API returns up to 11,000 group IDs. If more than 11,000 results are available, it returns a 400 Bad Request error with the Directory_ResultSizeLimitExceeded error code. As a workaround, use the List group transitive memberOf API.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of GetMemberGroupsResponse
     * @see <a href="https://learn.microsoft.com/graph/api/directoryobject-getmembergroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetMemberGroupsResponse> post(@jakarta.annotation.Nonnull final GetMemberGroupsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, GetMemberGroupsResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Return all the group IDs for the groups that the specified user, group, service principal, organizational contact, device, or directory object is a member of. This function is transitive. This API returns up to 11,000 group IDs. If more than 11,000 results are available, it returns a 400 Bad Request error with the Directory_ResultSizeLimitExceeded error code. As a workaround, use the List group transitive memberOf API.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetMemberGroupsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Return all the group IDs for the groups that the specified user, group, service principal, organizational contact, device, or directory object is a member of. This function is transitive. This API returns up to 11,000 group IDs. If more than 11,000 results are available, it returns a 400 Bad Request error with the Directory_ResultSizeLimitExceeded error code. As a workaround, use the List group transitive memberOf API.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetMemberGroupsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetMemberGroupsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetMemberGroupsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
