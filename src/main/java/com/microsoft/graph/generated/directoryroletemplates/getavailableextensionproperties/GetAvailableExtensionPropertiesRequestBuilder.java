package com.microsoft.graph.directoryroletemplates.getavailableextensionproperties;

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
 * Provides operations to call the getAvailableExtensionProperties method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAvailableExtensionPropertiesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetAvailableExtensionPropertiesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAvailableExtensionPropertiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoleTemplates/getAvailableExtensionProperties", pathParameters);
    }
    /**
     * Instantiates a new {@link GetAvailableExtensionPropertiesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAvailableExtensionPropertiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoleTemplates/getAvailableExtensionProperties", rawUrl);
    }
    /**
     * Return all directory extension definitions that are registered in a directory, including through multitenant apps. The following entities support extension properties:
     * @param body The request body
     * @return a {@link GetAvailableExtensionPropertiesPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryobject-getavailableextensionproperties?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetAvailableExtensionPropertiesPostResponse post(@jakarta.annotation.Nonnull final GetAvailableExtensionPropertiesPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Return all directory extension definitions that are registered in a directory, including through multitenant apps. The following entities support extension properties:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAvailableExtensionPropertiesPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryobject-getavailableextensionproperties?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetAvailableExtensionPropertiesPostResponse post(@jakarta.annotation.Nonnull final GetAvailableExtensionPropertiesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetAvailableExtensionPropertiesPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Return all directory extension definitions that are registered in a directory, including through multitenant apps. The following entities support extension properties:
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetAvailableExtensionPropertiesPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Return all directory extension definitions that are registered in a directory, including through multitenant apps. The following entities support extension properties:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final GetAvailableExtensionPropertiesPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetAvailableExtensionPropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAvailableExtensionPropertiesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAvailableExtensionPropertiesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
