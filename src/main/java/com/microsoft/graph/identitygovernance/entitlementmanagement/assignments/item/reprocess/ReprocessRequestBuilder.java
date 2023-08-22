package com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.item.reprocess;

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
 * Provides operations to call the reprocess method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReprocessRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ReprocessRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/{accessPackageAssignment%2Did}/reprocess", pathParameters);
    }
    /**
     * Instantiates a new ReprocessRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/{accessPackageAssignment%2Did}/reprocess", rawUrl);
    }
    /**
     * In Azure AD entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Azure AD entitlement management can perform this action.
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post() {
        return post(null);
    }
    /**
     * In Azure AD entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Azure AD entitlement management can perform this action.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * In Azure AD entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Azure AD entitlement management can perform this action.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * In Azure AD entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Azure AD entitlement management can perform this action.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
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
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
