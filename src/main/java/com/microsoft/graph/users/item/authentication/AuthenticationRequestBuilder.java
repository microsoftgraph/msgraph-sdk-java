package com.microsoft.graph.users.item.authentication;

import com.microsoft.graph.models.Authentication;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.authentication.emailmethods.EmailMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.fido2methods.Fido2MethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.methods.MethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.microsoftauthenticatormethods.MicrosoftAuthenticatorMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.operations.OperationsRequestBuilder;
import com.microsoft.graph.users.item.authentication.passwordmethods.PasswordMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.phonemethods.PhoneMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.softwareoathmethods.SoftwareOathMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.temporaryaccesspassmethods.TemporaryAccessPassMethodsRequestBuilder;
import com.microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.WindowsHelloForBusinessMethodsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the authentication property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the emailMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public EmailMethodsRequestBuilder emailMethods() {
        return new EmailMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the fido2Methods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public Fido2MethodsRequestBuilder fido2Methods() {
        return new Fido2MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the methods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public MethodsRequestBuilder methods() {
        return new MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the microsoftAuthenticatorMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftAuthenticatorMethodsRequestBuilder microsoftAuthenticatorMethods() {
        return new MicrosoftAuthenticatorMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passwordMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public PasswordMethodsRequestBuilder passwordMethods() {
        return new PasswordMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the phoneMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public PhoneMethodsRequestBuilder phoneMethods() {
        return new PhoneMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the softwareOathMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public SoftwareOathMethodsRequestBuilder softwareOathMethods() {
        return new SoftwareOathMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the temporaryAccessPassMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public TemporaryAccessPassMethodsRequestBuilder temporaryAccessPassMethods() {
        return new TemporaryAccessPassMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsHelloForBusinessMethods property of the microsoft.graph.authentication entity.
     */
    @jakarta.annotation.Nonnull
    public WindowsHelloForBusinessMethodsRequestBuilder windowsHelloForBusinessMethods() {
        return new WindowsHelloForBusinessMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property authentication for users
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property authentication for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * The authentication methods that are supported for the user.
     * @return a CompletableFuture of authentication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Authentication> get() {
        return get(null);
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authentication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Authentication> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Authentication::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @return a CompletableFuture of authentication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Authentication> patch(@jakarta.annotation.Nonnull final Authentication body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authentication
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Authentication> patch(@jakarta.annotation.Nonnull final Authentication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Authentication::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property authentication for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authentication for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The authentication methods that are supported for the user.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Authentication body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Authentication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a authenticationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The authentication methods that are supported for the user.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
