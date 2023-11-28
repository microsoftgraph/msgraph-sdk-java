package com.microsoft.graph.groups.item.checkgrantedpermissionsforapp;

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
 * Provides operations to call the checkGrantedPermissionsForApp method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CheckGrantedPermissionsForAppRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new CheckGrantedPermissionsForAppRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckGrantedPermissionsForAppRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/checkGrantedPermissionsForApp", pathParameters);
    }
    /**
     * Instantiates a new CheckGrantedPermissionsForAppRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckGrantedPermissionsForAppRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/checkGrantedPermissionsForApp", rawUrl);
    }
    /**
     * Invoke action checkGrantedPermissionsForApp
     * @return a CheckGrantedPermissionsForAppPostResponse
     */
    @jakarta.annotation.Nullable
    public CheckGrantedPermissionsForAppPostResponse post() {
        return post(null);
    }
    /**
     * Invoke action checkGrantedPermissionsForApp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CheckGrantedPermissionsForAppPostResponse
     */
    @jakarta.annotation.Nullable
    public CheckGrantedPermissionsForAppPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CheckGrantedPermissionsForAppPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke action checkGrantedPermissionsForApp
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Invoke action checkGrantedPermissionsForApp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CheckGrantedPermissionsForAppRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CheckGrantedPermissionsForAppRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CheckGrantedPermissionsForAppRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
