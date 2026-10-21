package com.microsoft.graph.devices.provision;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ProvisionResponse;
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
 * Provides operations to call the provision method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ProvisionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/provision", pathParameters);
    }
    /**
     * Instantiates a new {@link ProvisionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/provision", rawUrl);
    }
    /**
     * Provision a device on behalf of an approved Virtual Desktop Infrastructure (VDI) provider. This action wraps the Zero Touch Deployment (ZTD) protocol to create a device in a pending state in the customer&apos;s directory. The device can&apos;t be used for authentication until it completes its registration. The created device is stamped with a system label that identifies the approved VDI provider. Only VDI applications on Microsoft&apos;s approved list of VDI providers can successfully call this action. Calls from other applications are blocked even when the application is granted the required permission.
     * @param body The request body
     * @return a {@link ProvisionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-provision?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProvisionResponse post(@jakarta.annotation.Nonnull final ProvisionPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Provision a device on behalf of an approved Virtual Desktop Infrastructure (VDI) provider. This action wraps the Zero Touch Deployment (ZTD) protocol to create a device in a pending state in the customer&apos;s directory. The device can&apos;t be used for authentication until it completes its registration. The created device is stamped with a system label that identifies the approved VDI provider. Only VDI applications on Microsoft&apos;s approved list of VDI providers can successfully call this action. Calls from other applications are blocked even when the application is granted the required permission.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ProvisionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/device-provision?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProvisionResponse post(@jakarta.annotation.Nonnull final ProvisionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ProvisionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provision a device on behalf of an approved Virtual Desktop Infrastructure (VDI) provider. This action wraps the Zero Touch Deployment (ZTD) protocol to create a device in a pending state in the customer&apos;s directory. The device can&apos;t be used for authentication until it completes its registration. The created device is stamped with a system label that identifies the approved VDI provider. Only VDI applications on Microsoft&apos;s approved list of VDI providers can successfully call this action. Calls from other applications are blocked even when the application is granted the required permission.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProvisionPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Provision a device on behalf of an approved Virtual Desktop Infrastructure (VDI) provider. This action wraps the Zero Touch Deployment (ZTD) protocol to create a device in a pending state in the customer&apos;s directory. The device can&apos;t be used for authentication until it completes its registration. The created device is stamped with a system label that identifies the approved VDI provider. Only VDI applications on Microsoft&apos;s approved list of VDI providers can successfully call this action. Calls from other applications are blocked even when the application is granted the required permission.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProvisionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ProvisionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProvisionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
