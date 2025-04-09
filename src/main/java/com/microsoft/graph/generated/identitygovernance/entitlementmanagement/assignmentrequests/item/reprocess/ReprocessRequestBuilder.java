package com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentrequests.item.reprocess;

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
     * Instantiates a new {@link ReprocessRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests/{accessPackageAssignmentRequest%2Did}/reprocess", pathParameters);
    }
    /**
     * Instantiates a new {@link ReprocessRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReprocessRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentRequests/{accessPackageAssignmentRequest%2Did}/reprocess", rawUrl);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically retry a user&apos;s request for access to an access package. It&apos;s performed on an accessPackageAssignmentRequest object whose requestState is in a DeliveryFailed or PartiallyDelivered state.  You can only reprocess a request within 14 days from the time the original request was completed. For requests completed more than 14 days, you will need to ask the users to cancel the request(s) and make a new request in the MyAccess portal.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignmentrequest-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    public void post() {
        post(null);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically retry a user&apos;s request for access to an access package. It&apos;s performed on an accessPackageAssignmentRequest object whose requestState is in a DeliveryFailed or PartiallyDelivered state.  You can only reprocess a request within 14 days from the time the original request was completed. For requests completed more than 14 days, you will need to ask the users to cancel the request(s) and make a new request in the MyAccess portal.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackageassignmentrequest-reprocess?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically retry a user&apos;s request for access to an access package. It&apos;s performed on an accessPackageAssignmentRequest object whose requestState is in a DeliveryFailed or PartiallyDelivered state.  You can only reprocess a request within 14 days from the time the original request was completed. For requests completed more than 14 days, you will need to ask the users to cancel the request(s) and make a new request in the MyAccess portal.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * In Microsoft Entra entitlement management, callers can automatically retry a user&apos;s request for access to an access package. It&apos;s performed on an accessPackageAssignmentRequest object whose requestState is in a DeliveryFailed or PartiallyDelivered state.  You can only reprocess a request within 14 days from the time the original request was completed. For requests completed more than 14 days, you will need to ask the users to cancel the request(s) and make a new request in the MyAccess portal.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReprocessRequestBuilder}
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
