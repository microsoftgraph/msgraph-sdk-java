package com.microsoft.graph.devicemanagement.virtualendpoint.report.retrievecloudpcrecommendationreports;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the retrieveCloudPcRecommendationReports method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveCloudPcRecommendationReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveCloudPcRecommendationReportsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcRecommendationReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/report/retrieveCloudPcRecommendationReports", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveCloudPcRecommendationReportsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveCloudPcRecommendationReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/report/retrieveCloudPcRecommendationReports", rawUrl);
    }
    /**
     * Retrieve Cloud PC recommendation reports for usage optimization and cost savings. The usage category report categorizes a Cloud PC as Undersized, Oversized, Rightsized, or Underutilized, and also provides the recommended SKU when the Cloud PC isn&apos;t Rightsized.
     * @param body The request body
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreport-retrievecloudpcrecommendationreports?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final RetrieveCloudPcRecommendationReportsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Retrieve Cloud PC recommendation reports for usage optimization and cost savings. The usage category report categorizes a Cloud PC as Undersized, Oversized, Rightsized, or Underutilized, and also provides the recommended SKU when the Cloud PC isn&apos;t Rightsized.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreport-retrievecloudpcrecommendationreports?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final RetrieveCloudPcRecommendationReportsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * Retrieve Cloud PC recommendation reports for usage optimization and cost savings. The usage category report categorizes a Cloud PC as Undersized, Oversized, Rightsized, or Underutilized, and also provides the recommended SKU when the Cloud PC isn&apos;t Rightsized.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RetrieveCloudPcRecommendationReportsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Retrieve Cloud PC recommendation reports for usage optimization and cost savings. The usage category report categorizes a Cloud PC as Undersized, Oversized, Rightsized, or Underutilized, and also provides the recommended SKU when the Cloud PC isn&apos;t Rightsized.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RetrieveCloudPcRecommendationReportsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RetrieveCloudPcRecommendationReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveCloudPcRecommendationReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveCloudPcRecommendationReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
