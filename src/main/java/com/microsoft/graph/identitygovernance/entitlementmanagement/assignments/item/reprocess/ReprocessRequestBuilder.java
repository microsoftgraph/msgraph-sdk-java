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
     * In Microsoft Entra entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Microsoft Entra entitlement management can perform this action.
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    public void post() {
        post(null);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Microsoft Entra entitlement management can perform this action.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignment-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Microsoft Entra entitlement management can perform this action.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically reevaluate and enforce an accessPackageAssignment object of a users assignments for a specific access package. The state of the access package assignment must be Delivered for the administrator to reprocess the user's assignment. Only admins with the Access Package Assignment Manager role, or higher, in Microsoft Entra entitlement management can perform this action.
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
     * @return a ReprocessRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReprocessRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReprocessRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
