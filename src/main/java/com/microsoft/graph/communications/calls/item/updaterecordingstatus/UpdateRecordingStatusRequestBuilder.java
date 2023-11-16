package com.microsoft.graph.communications.calls.item.updaterecordingstatus;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UpdateRecordingStatusOperation;
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
 * Provides operations to call the updateRecordingStatus method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateRecordingStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UpdateRecordingStatusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateRecordingStatusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/updateRecordingStatus", pathParameters);
    }
    /**
     * Instantiates a new UpdateRecordingStatusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateRecordingStatusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/updateRecordingStatus", rawUrl);
    }
    /**
     * Update the application's recording status associated with a call. This requires the use of the Teams policy-based recording solution. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a UpdateRecordingStatusOperation
     * @see <a href="https://learn.microsoft.com/graph/api/call-updaterecordingstatus?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UpdateRecordingStatusOperation post(@jakarta.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Update the application's recording status associated with a call. This requires the use of the Teams policy-based recording solution. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UpdateRecordingStatusOperation
     * @see <a href="https://learn.microsoft.com/graph/api/call-updaterecordingstatus?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UpdateRecordingStatusOperation post(@jakarta.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, UpdateRecordingStatusOperation::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the application's recording status associated with a call. This requires the use of the Teams policy-based recording solution. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Update the application's recording status associated with a call. This requires the use of the Teams policy-based recording solution. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UpdateRecordingStatusRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UpdateRecordingStatusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateRecordingStatusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
