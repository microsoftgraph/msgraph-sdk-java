package com.microsoft.graph.users.item.reprocesslicenseassignment;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
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
 * Provides operations to call the reprocessLicenseAssignment method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReprocessLicenseAssignmentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ReprocessLicenseAssignmentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessLicenseAssignmentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/reprocessLicenseAssignment", pathParameters);
    }
    /**
     * Instantiates a new ReprocessLicenseAssignmentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessLicenseAssignmentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/reprocessLicenseAssignment", rawUrl);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Microsoft Entra ID. Also see Identify and resolve license assignment problems for a group in Microsoft Entra ID for more details.
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/user-reprocesslicenseassignment?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User post() {
        return post(null);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Microsoft Entra ID. Also see Identify and resolve license assignment problems for a group in Microsoft Entra ID for more details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/user-reprocesslicenseassignment?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Microsoft Entra ID. Also see Identify and resolve license assignment problems for a group in Microsoft Entra ID for more details.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Microsoft Entra ID. Also see Identify and resolve license assignment problems for a group in Microsoft Entra ID for more details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ReprocessLicenseAssignmentRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReprocessLicenseAssignmentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
