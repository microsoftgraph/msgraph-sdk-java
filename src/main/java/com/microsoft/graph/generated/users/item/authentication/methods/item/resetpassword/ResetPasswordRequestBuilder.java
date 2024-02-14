package com.microsoft.graph.users.item.authentication.methods.item.resetpassword;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PasswordResetResponse;
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
 * Provides operations to call the resetPassword method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResetPasswordRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ResetPasswordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResetPasswordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/methods/{authenticationMethod%2Did}/resetPassword", pathParameters);
    }
    /**
     * Instantiates a new {@link ResetPasswordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResetPasswordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/methods/{authenticationMethod%2Did}/resetPassword", rawUrl);
    }
    /**
     * Reset a user's password, represented by a password authentication method object. This can only be done by an administrator with appropriate permissions and can't be performed on a user's own account. This flow writes the new password to Microsoft Entra ID and pushes it to on-premises Active Directory if configured using password writeback. The admin can either provide a new password or have the system generate one. The user is prompted to change their password on their next sign in. This reset is a long-running operation and returns a Location header with a link where the caller can periodically check for the status of the reset operation.
     * @param body The request body
     * @return a {@link PasswordResetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationmethod-resetpassword?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordResetResponse post(@jakarta.annotation.Nonnull final ResetPasswordPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Reset a user's password, represented by a password authentication method object. This can only be done by an administrator with appropriate permissions and can't be performed on a user's own account. This flow writes the new password to Microsoft Entra ID and pushes it to on-premises Active Directory if configured using password writeback. The admin can either provide a new password or have the system generate one. The user is prompted to change their password on their next sign in. This reset is a long-running operation and returns a Location header with a link where the caller can periodically check for the status of the reset operation.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PasswordResetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authenticationmethod-resetpassword?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordResetResponse post(@jakarta.annotation.Nonnull final ResetPasswordPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PasswordResetResponse::createFromDiscriminatorValue);
    }
    /**
     * Reset a user's password, represented by a password authentication method object. This can only be done by an administrator with appropriate permissions and can't be performed on a user's own account. This flow writes the new password to Microsoft Entra ID and pushes it to on-premises Active Directory if configured using password writeback. The admin can either provide a new password or have the system generate one. The user is prompted to change their password on their next sign in. This reset is a long-running operation and returns a Location header with a link where the caller can periodically check for the status of the reset operation.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResetPasswordPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Reset a user's password, represented by a password authentication method object. This can only be done by an administrator with appropriate permissions and can't be performed on a user's own account. This flow writes the new password to Microsoft Entra ID and pushes it to on-premises Active Directory if configured using password writeback. The admin can either provide a new password or have the system generate one. The user is prompted to change their password on their next sign in. This reset is a long-running operation and returns a Location header with a link where the caller can periodically check for the status of the reset operation.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResetPasswordPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ResetPasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetPasswordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ResetPasswordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
