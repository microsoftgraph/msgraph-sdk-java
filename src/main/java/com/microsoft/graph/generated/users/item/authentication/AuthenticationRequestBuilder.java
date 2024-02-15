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
 * Provides operations to manage the authentication property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the emailMethods property of the microsoft.graph.authentication entity.
     * @return a {@link EmailMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailMethodsRequestBuilder emailMethods() {
        return new EmailMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the fido2Methods property of the microsoft.graph.authentication entity.
     * @return a {@link Fido2MethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Fido2MethodsRequestBuilder fido2Methods() {
        return new Fido2MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the methods property of the microsoft.graph.authentication entity.
     * @return a {@link MethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MethodsRequestBuilder methods() {
        return new MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the microsoftAuthenticatorMethods property of the microsoft.graph.authentication entity.
     * @return a {@link MicrosoftAuthenticatorMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftAuthenticatorMethodsRequestBuilder microsoftAuthenticatorMethods() {
        return new MicrosoftAuthenticatorMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.authentication entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passwordMethods property of the microsoft.graph.authentication entity.
     * @return a {@link PasswordMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PasswordMethodsRequestBuilder passwordMethods() {
        return new PasswordMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the phoneMethods property of the microsoft.graph.authentication entity.
     * @return a {@link PhoneMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneMethodsRequestBuilder phoneMethods() {
        return new PhoneMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the softwareOathMethods property of the microsoft.graph.authentication entity.
     * @return a {@link SoftwareOathMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SoftwareOathMethodsRequestBuilder softwareOathMethods() {
        return new SoftwareOathMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the temporaryAccessPassMethods property of the microsoft.graph.authentication entity.
     * @return a {@link TemporaryAccessPassMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemporaryAccessPassMethodsRequestBuilder temporaryAccessPassMethods() {
        return new TemporaryAccessPassMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsHelloForBusinessMethods property of the microsoft.graph.authentication entity.
     * @return a {@link WindowsHelloForBusinessMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsHelloForBusinessMethodsRequestBuilder windowsHelloForBusinessMethods() {
        return new WindowsHelloForBusinessMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AuthenticationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AuthenticationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property authentication for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property authentication for users
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
     * The authentication methods that are supported for the user.
     * @return a {@link Authentication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Authentication get() {
        return get(null);
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Authentication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Authentication get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Authentication::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @return a {@link Authentication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Authentication patch(@jakarta.annotation.Nonnull final Authentication body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Authentication}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Authentication patch(@jakarta.annotation.Nonnull final Authentication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Authentication::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property authentication for users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authentication for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/users/{user%2Did}/authentication", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The authentication methods that are supported for the user.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The authentication methods that are supported for the user.
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
     * Update the navigation property authentication in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Authentication body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authentication in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Authentication body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/users/{user%2Did}/authentication", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AuthenticationRequestBuilder}
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
