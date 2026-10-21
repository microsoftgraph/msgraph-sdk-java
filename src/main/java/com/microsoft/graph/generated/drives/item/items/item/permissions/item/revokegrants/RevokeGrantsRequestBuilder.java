package com.microsoft.graph.drives.item.items.item.permissions.item.revokegrants;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Permission;
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
 * Provides operations to call the revokeGrants method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RevokeGrantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RevokeGrantsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeGrantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/permissions/{permission%2Did}/revokeGrants", pathParameters);
    }
    /**
     * Instantiates a new {@link RevokeGrantsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeGrantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/permissions/{permission%2Did}/revokeGrants", rawUrl);
    }
    /**
     * Revoke access to a listItem or driveItem granted via a sharing link by removing the specified driveRecipient entries from the link. Recipients who already redeemed the link and recipients who only received an invitation both lose access. Revoking a grant removes the recipient from this sharing link only; it doesn&apos;t remove any access the recipient has through a different sharing link, a direct grant, or membership in a group that has access.
     * @param body The request body
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permission-revokegrants?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final RevokeGrantsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Revoke access to a listItem or driveItem granted via a sharing link by removing the specified driveRecipient entries from the link. Recipients who already redeemed the link and recipients who only received an invitation both lose access. Revoking a grant removes the recipient from this sharing link only; it doesn&apos;t remove any access the recipient has through a different sharing link, a direct grant, or membership in a group that has access.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permission-revokegrants?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final RevokeGrantsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Permission::createFromDiscriminatorValue);
    }
    /**
     * Revoke access to a listItem or driveItem granted via a sharing link by removing the specified driveRecipient entries from the link. Recipients who already redeemed the link and recipients who only received an invitation both lose access. Revoking a grant removes the recipient from this sharing link only; it doesn&apos;t remove any access the recipient has through a different sharing link, a direct grant, or membership in a group that has access.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RevokeGrantsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Revoke access to a listItem or driveItem granted via a sharing link by removing the specified driveRecipient entries from the link. Recipients who already redeemed the link and recipients who only received an invitation both lose access. Revoking a grant removes the recipient from this sharing link only; it doesn&apos;t remove any access the recipient has through a different sharing link, a direct grant, or membership in a group that has access.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RevokeGrantsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RevokeGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeGrantsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RevokeGrantsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
