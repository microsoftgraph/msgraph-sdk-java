package com.microsoft.graph.security.identities.sensors.microsoftgraphsecuritygetdeploymentpackageuri;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.SensorDeploymentPackage;
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
 * Provides operations to call the getDeploymentPackageUri method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/identities/sensors/microsoft.graph.security.getDeploymentPackageUri()", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/identities/sensors/microsoft.graph.security.getDeploymentPackageUri()", rawUrl);
    }
    /**
     * Get the sensor deployment package URL and version. You can use this URL to download the installer to install the sensor on a server.
     * @return a {@link SensorDeploymentPackage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-sensor-getdeploymentpackageuri?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SensorDeploymentPackage get() {
        return get(null);
    }
    /**
     * Get the sensor deployment package URL and version. You can use this URL to download the installer to install the sensor on a server.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SensorDeploymentPackage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-sensor-getdeploymentpackageuri?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SensorDeploymentPackage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SensorDeploymentPackage::createFromDiscriminatorValue);
    }
    /**
     * Get the sensor deployment package URL and version. You can use this URL to download the installer to install the sensor on a server.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the sensor deployment package URL and version. You can use this URL to download the installer to install the sensor on a server.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphSecurityGetDeploymentPackageUriRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
