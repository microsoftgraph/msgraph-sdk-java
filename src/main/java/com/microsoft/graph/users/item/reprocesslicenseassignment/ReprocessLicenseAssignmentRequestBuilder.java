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
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Azure Active Directory. Also see Identify and resolve license assignment problems for a group in Azure Active Directory for more details.
     * @return a CompletableFuture of user
     * @see <a href="https://learn.microsoft.com/graph/api/user-reprocesslicenseassignment?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> post() {
        return post(null);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Azure Active Directory. Also see Identify and resolve license assignment problems for a group in Azure Active Directory for more details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     * @see <a href="https://learn.microsoft.com/graph/api/user-reprocesslicenseassignment?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Azure Active Directory. Also see Identify and resolve license assignment problems for a group in Azure Active Directory for more details.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Reprocess all group-based license assignments for the user. To learn more about group-based licensing, see What is group-based licensing in Azure Active Directory. Also see Identify and resolve license assignment problems for a group in Azure Active Directory for more details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
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
