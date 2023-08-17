package com.microsoft.graph.users.item.revokesigninsessions;

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
 * Provides operations to call the revokeSignInSessions method.
 */
public class RevokeSignInSessionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RevokeSignInSessionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeSignInSessionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/revokeSignInSessions", pathParameters);
    }
    /**
     * Instantiates a new RevokeSignInSessionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeSignInSessionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/revokeSignInSessions", rawUrl);
    }
    /**
     * Invalidates all the refresh tokens issued to applications for a user (as well as session cookies in a user's browser), by resetting the signInSessionsValidFromDateTime user property to the current date-time. Typically, this operation is performed (by the user or an administrator) if the user has a lost or stolen device. This operation prevents access to the organization's data through applications on the device by requiring the user to sign in again to all applications that they have previously consented to, independent of device.
     * @return a CompletableFuture of revokeSignInSessionsResponse
     * @see <a href="https://learn.microsoft.com/graph/api/user-revokesigninsessions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RevokeSignInSessionsResponse> post() {
        return post(null);
    }
    /**
     * Invalidates all the refresh tokens issued to applications for a user (as well as session cookies in a user's browser), by resetting the signInSessionsValidFromDateTime user property to the current date-time. Typically, this operation is performed (by the user or an administrator) if the user has a lost or stolen device. This operation prevents access to the organization's data through applications on the device by requiring the user to sign in again to all applications that they have previously consented to, independent of device.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of revokeSignInSessionsResponse
     * @see <a href="https://learn.microsoft.com/graph/api/user-revokesigninsessions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RevokeSignInSessionsResponse> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, RevokeSignInSessionsResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invalidates all the refresh tokens issued to applications for a user (as well as session cookies in a user's browser), by resetting the signInSessionsValidFromDateTime user property to the current date-time. Typically, this operation is performed (by the user or an administrator) if the user has a lost or stolen device. This operation prevents access to the organization's data through applications on the device by requiring the user to sign in again to all applications that they have previously consented to, independent of device.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Invalidates all the refresh tokens issued to applications for a user (as well as session cookies in a user's browser), by resetting the signInSessionsValidFromDateTime user property to the current date-time. Typically, this operation is performed (by the user or an administrator) if the user has a lost or stolen device. This operation prevents access to the organization's data through applications on the device by requiring the user to sign in again to all applications that they have previously consented to, independent of device.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
