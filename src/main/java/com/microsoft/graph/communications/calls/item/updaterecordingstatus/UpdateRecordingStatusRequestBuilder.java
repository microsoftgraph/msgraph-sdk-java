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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the updateRecordingStatus method.
 */
public class UpdateRecordingStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UpdateRecordingStatusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateRecordingStatusRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/updateRecordingStatus", pathParameters);
    }
    /**
     * Instantiates a new UpdateRecordingStatusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateRecordingStatusRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}/updateRecordingStatus", rawUrl);
    }
    /**
     * Invoke action updateRecordingStatus
     * @param body The request body
     * @return a CompletableFuture of updateRecordingStatusOperation
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation> post(@javax.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdateRecordingStatusOperation::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation> executionException = new java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke action updateRecordingStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of updateRecordingStatusOperation
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation> post(@javax.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UpdateRecordingStatusOperation::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation> executionException = new java.util.concurrent.CompletableFuture<UpdateRecordingStatusOperation>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke action updateRecordingStatus
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action updateRecordingStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UpdateRecordingStatusPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
