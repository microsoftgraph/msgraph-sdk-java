package com.microsoft.graph.devicemanagement.virtualendpoint.cloudpcs.item.retrievecloudpclaunchdetail;

import com.microsoft.graph.models.CloudPcLaunchDetail;
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
 * Provides operations to call the retrieveCloudPcLaunchDetail method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveCloudPcLaunchDetailRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveCloudPcLaunchDetailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcLaunchDetailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs/{cloudPC%2Did}/retrieveCloudPcLaunchDetail()", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveCloudPcLaunchDetailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcLaunchDetailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs/{cloudPC%2Did}/retrieveCloudPcLaunchDetail()", rawUrl);
    }
    /**
     * Get the cloudPcLaunchDetail for a specific cloudPC that belongs to the current signed-in user.
     * @return a {@link CloudPcLaunchDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrievecloudpclaunchdetail?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcLaunchDetail get() {
        return get(null);
    }
    /**
     * Get the cloudPcLaunchDetail for a specific cloudPC that belongs to the current signed-in user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcLaunchDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-retrievecloudpclaunchdetail?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPcLaunchDetail get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcLaunchDetail::createFromDiscriminatorValue);
    }
    /**
     * Get the cloudPcLaunchDetail for a specific cloudPC that belongs to the current signed-in user.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the cloudPcLaunchDetail for a specific cloudPC that belongs to the current signed-in user.
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
     * @return a {@link RetrieveCloudPcLaunchDetailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveCloudPcLaunchDetailRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveCloudPcLaunchDetailRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
