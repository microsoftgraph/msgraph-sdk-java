package com.microsoft.graph.admin.exchange.mailboxes.item.exportitems;

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
 * Provides operations to call the exportItems method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportItemsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ExportItemsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportItemsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/exchange/mailboxes/{mailbox%2Did}/exportItems", pathParameters);
    }
    /**
     * Instantiates a new {@link ExportItemsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportItemsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/exchange/mailboxes/{mailbox%2Did}/exportItems", rawUrl);
    }
    /**
     * Export Exchange mailboxItem objects in full fidelity. This API exports each item as an opaque stream. The data stream isn&apos;t intended for parsing, but can be used to import an item back into an Exchange mailbox. For more information, see Overview of the mailbox import and export APIs in Microsoft Graph. You can export up to 20 items in a single export request.
     * @param body The request body
     * @return a {@link ExportItemsPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/mailbox-exportitems?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ExportItemsPostResponse post(@jakarta.annotation.Nonnull final ExportItemsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Export Exchange mailboxItem objects in full fidelity. This API exports each item as an opaque stream. The data stream isn&apos;t intended for parsing, but can be used to import an item back into an Exchange mailbox. For more information, see Overview of the mailbox import and export APIs in Microsoft Graph. You can export up to 20 items in a single export request.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ExportItemsPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/mailbox-exportitems?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ExportItemsPostResponse post(@jakarta.annotation.Nonnull final ExportItemsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ExportItemsPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Export Exchange mailboxItem objects in full fidelity. This API exports each item as an opaque stream. The data stream isn&apos;t intended for parsing, but can be used to import an item back into an Exchange mailbox. For more information, see Overview of the mailbox import and export APIs in Microsoft Graph. You can export up to 20 items in a single export request.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ExportItemsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Export Exchange mailboxItem objects in full fidelity. This API exports each item as an opaque stream. The data stream isn&apos;t intended for parsing, but can be used to import an item back into an Exchange mailbox. For more information, see Overview of the mailbox import and export APIs in Microsoft Graph. You can export up to 20 items in a single export request.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ExportItemsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ExportItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportItemsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ExportItemsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
