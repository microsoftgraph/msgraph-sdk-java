package com.microsoft.graph.me.authentication;

import com.microsoft.graph.me.authentication.emailmethods.EmailMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.emailmethods.item.EmailAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.fido2methods.Fido2MethodsRequestBuilder;
import com.microsoft.graph.me.authentication.fido2methods.item.Fido2AuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.methods.item.AuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.methods.MethodsRequestBuilder;
import com.microsoft.graph.me.authentication.microsoftauthenticatormethods.item.MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.microsoftauthenticatormethods.MicrosoftAuthenticatorMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.operations.item.LongRunningOperationItemRequestBuilder;
import com.microsoft.graph.me.authentication.operations.OperationsRequestBuilder;
import com.microsoft.graph.me.authentication.passwordmethods.item.PasswordAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.passwordmethods.PasswordMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.phonemethods.item.PhoneAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.phonemethods.PhoneMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.softwareoathmethods.item.SoftwareOathAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.softwareoathmethods.SoftwareOathMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.temporaryaccesspassmethods.item.TemporaryAccessPassAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.temporaryaccesspassmethods.TemporaryAccessPassMethodsRequestBuilder;
import com.microsoft.graph.me.authentication.windowshelloforbusinessmethods.item.WindowsHelloForBusinessAuthenticationMethodItemRequestBuilder;
import com.microsoft.graph.me.authentication.windowshelloforbusinessmethods.WindowsHelloForBusinessMethodsRequestBuilder;
import com.microsoft.graph.models.Authentication;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the authentication property of the microsoft.graph.user entity. */
public class AuthenticationRequestBuilder {
    /** The emailMethods property */
    @javax.annotation.Nonnull
    public EmailMethodsRequestBuilder emailMethods() {
        return new EmailMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The fido2Methods property */
    @javax.annotation.Nonnull
    public Fido2MethodsRequestBuilder fido2Methods() {
        return new Fido2MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The methods property */
    @javax.annotation.Nonnull
    public MethodsRequestBuilder methods() {
        return new MethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The microsoftAuthenticatorMethods property */
    @javax.annotation.Nonnull
    public MicrosoftAuthenticatorMethodsRequestBuilder microsoftAuthenticatorMethods() {
        return new MicrosoftAuthenticatorMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operations property */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The passwordMethods property */
    @javax.annotation.Nonnull
    public PasswordMethodsRequestBuilder passwordMethods() {
        return new PasswordMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The phoneMethods property */
    @javax.annotation.Nonnull
    public PhoneMethodsRequestBuilder phoneMethods() {
        return new PhoneMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The softwareOathMethods property */
    @javax.annotation.Nonnull
    public SoftwareOathMethodsRequestBuilder softwareOathMethods() {
        return new SoftwareOathMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The temporaryAccessPassMethods property */
    @javax.annotation.Nonnull
    public TemporaryAccessPassMethodsRequestBuilder temporaryAccessPassMethods() {
        return new TemporaryAccessPassMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The windowsHelloForBusinessMethods property */
    @javax.annotation.Nonnull
    public WindowsHelloForBusinessMethodsRequestBuilder windowsHelloForBusinessMethods() {
        return new WindowsHelloForBusinessMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AuthenticationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/authentication{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AuthenticationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AuthenticationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/authentication{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property authentication for me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authentication for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AuthenticationRequestBuilderDeleteRequestConfiguration requestConfig = new AuthenticationRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The authentication methods that are supported for the user.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final AuthenticationRequestBuilderGetRequestConfiguration requestConfig = new AuthenticationRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property authentication in me
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Authentication body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authentication in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Authentication body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AuthenticationRequestBuilderPatchRequestConfiguration requestConfig = new AuthenticationRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property authentication for me
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property authentication for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property authentication for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.emailMethods.item collection
     * @param id Unique identifier of the item
     * @return a EmailAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EmailAuthenticationMethodItemRequestBuilder emailMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("emailAuthenticationMethod%2Did", id);
        return new EmailAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.fido2Methods.item collection
     * @param id Unique identifier of the item
     * @return a Fido2AuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public Fido2AuthenticationMethodItemRequestBuilder fido2Methods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fido2AuthenticationMethod%2Did", id);
        return new Fido2AuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The authentication methods that are supported for the user.
     * @return a CompletableFuture of authentication
     */
    public java.util.concurrent.CompletableFuture<Authentication> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Authentication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authentication
     */
    public java.util.concurrent.CompletableFuture<Authentication> get(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Authentication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The authentication methods that are supported for the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of authentication
     */
    public java.util.concurrent.CompletableFuture<Authentication> get(@javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Authentication::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.methods.item collection
     * @param id Unique identifier of the item
     * @return a AuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AuthenticationMethodItemRequestBuilder methods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationMethod%2Did", id);
        return new AuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.microsoftAuthenticatorMethods.item collection
     * @param id Unique identifier of the item
     * @return a MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder microsoftAuthenticatorMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("microsoftAuthenticatorAuthenticationMethod%2Did", id);
        return new MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.operations.item collection
     * @param id Unique identifier of the item
     * @return a LongRunningOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LongRunningOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("longRunningOperation%2Did", id);
        return new LongRunningOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.passwordMethods.item collection
     * @param id Unique identifier of the item
     * @return a PasswordAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PasswordAuthenticationMethodItemRequestBuilder passwordMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("passwordAuthenticationMethod%2Did", id);
        return new PasswordAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property authentication in me
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Authentication body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property authentication in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Authentication body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property authentication in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Authentication body, @javax.annotation.Nullable final java.util.function.Consumer<AuthenticationRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.phoneMethods.item collection
     * @param id Unique identifier of the item
     * @return a PhoneAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PhoneAuthenticationMethodItemRequestBuilder phoneMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("phoneAuthenticationMethod%2Did", id);
        return new PhoneAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.softwareOathMethods.item collection
     * @param id Unique identifier of the item
     * @return a SoftwareOathAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SoftwareOathAuthenticationMethodItemRequestBuilder softwareOathMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("softwareOathAuthenticationMethod%2Did", id);
        return new SoftwareOathAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.temporaryAccessPassMethods.item collection
     * @param id Unique identifier of the item
     * @return a TemporaryAccessPassAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TemporaryAccessPassAuthenticationMethodItemRequestBuilder temporaryAccessPassMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("temporaryAccessPassAuthenticationMethod%2Did", id);
        return new TemporaryAccessPassAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.authentication.windowsHelloForBusinessMethods.item collection
     * @param id Unique identifier of the item
     * @return a WindowsHelloForBusinessAuthenticationMethodItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsHelloForBusinessAuthenticationMethodItemRequestBuilder windowsHelloForBusinessMethods(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsHelloForBusinessAuthenticationMethod%2Did", id);
        return new WindowsHelloForBusinessAuthenticationMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AuthenticationRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new authenticationRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The authentication methods that are supported for the user. */
    public class AuthenticationRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AuthenticationRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public AuthenticationRequestBuilderGetQueryParameters queryParameters = new AuthenticationRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new authenticationRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AuthenticationRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new authenticationRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public AuthenticationRequestBuilderPatchRequestConfiguration() {
        }
    }
}
