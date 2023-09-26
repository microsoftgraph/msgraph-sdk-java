package com.microsoft.graph.drives.item.items.item.workbook.createsession;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookSessionInfo;
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
 * Provides operations to call the createSession method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSessionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new CreateSessionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateSessionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/createSession", pathParameters);
    }
    /**
     * Instantiates a new CreateSessionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateSessionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/createSession", rawUrl);
    }
    /**
     * Create a new workbook session.  Excel APIs can be called in one of two modes:  To represent the session in the API, use the workbook-session-id: {session-id} header.  In some cases, creating a new session requires an indeterminate time to complete. Microsoft Graph also provides a long running operations pattern. This pattern provides a way to poll for creation status updates, without waiting for the creation to complete. The following are the steps:
     * @param body The request body
     * @return a CompletableFuture of WorkbookSessionInfo
     * @see <a href="https://learn.microsoft.com/graph/api/workbook-createsession?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookSessionInfo> post(@jakarta.annotation.Nonnull final CreateSessionPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new workbook session.  Excel APIs can be called in one of two modes:  To represent the session in the API, use the workbook-session-id: {session-id} header.  In some cases, creating a new session requires an indeterminate time to complete. Microsoft Graph also provides a long running operations pattern. This pattern provides a way to poll for creation status updates, without waiting for the creation to complete. The following are the steps:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of WorkbookSessionInfo
     * @see <a href="https://learn.microsoft.com/graph/api/workbook-createsession?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookSessionInfo> post(@jakarta.annotation.Nonnull final CreateSessionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WorkbookSessionInfo::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new workbook session.  Excel APIs can be called in one of two modes:  To represent the session in the API, use the workbook-session-id: {session-id} header.  In some cases, creating a new session requires an indeterminate time to complete. Microsoft Graph also provides a long running operations pattern. This pattern provides a way to poll for creation status updates, without waiting for the creation to complete. The following are the steps:
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSessionPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new workbook session.  Excel APIs can be called in one of two modes:  To represent the session in the API, use the workbook-session-id: {session-id} header.  In some cases, creating a new session requires an indeterminate time to complete. Microsoft Graph also provides a long running operations pattern. This pattern provides a way to poll for creation status updates, without waiting for the creation to complete. The following are the steps:
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSessionPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CreateSessionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CreateSessionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateSessionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
