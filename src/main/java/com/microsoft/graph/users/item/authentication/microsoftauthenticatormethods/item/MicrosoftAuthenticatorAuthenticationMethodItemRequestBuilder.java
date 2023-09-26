package com.microsoft.graph.users.item.authentication.microsoftauthenticatormethods.item;

import com.microsoft.graph.models.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.authentication.microsoftauthenticatormethods.item.device.DeviceRequestBuilder;
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
 * Provides operations to manage the microsoftAuthenticatorMethods property of the microsoft.graph.authentication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the device property of the microsoft.graph.microsoftAuthenticatorAuthenticationMethod entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceRequestBuilder device() {
        return new DeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/microsoftAuthenticatorMethods/{microsoftAuthenticatorAuthenticationMethod%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/microsoftAuthenticatorMethods/{microsoftAuthenticatorAuthenticationMethod%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a microsoftAuthenticatorAuthenticationMethod object.
     * @see <a href="https://learn.microsoft.com/graph/api/microsoftauthenticatorauthenticationmethod-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Deletes a microsoftAuthenticatorAuthenticationMethod object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/microsoftauthenticatorauthenticationmethod-delete?view=graph-rest-1.0">Find more info here</a>
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
     * Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethod object.
     * @return a CompletableFuture of MicrosoftAuthenticatorAuthenticationMethod
     * @see <a href="https://learn.microsoft.com/graph/api/microsoftauthenticatorauthenticationmethod-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MicrosoftAuthenticatorAuthenticationMethod> get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethod object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of MicrosoftAuthenticatorAuthenticationMethod
     * @see <a href="https://learn.microsoft.com/graph/api/microsoftauthenticatorauthenticationmethod-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<MicrosoftAuthenticatorAuthenticationMethod> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, MicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Deletes a microsoftAuthenticatorAuthenticationMethod object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a microsoftAuthenticatorAuthenticationMethod object.
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
     * Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethod object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethod object.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftAuthenticatorAuthenticationMethodItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethod object.
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
}
