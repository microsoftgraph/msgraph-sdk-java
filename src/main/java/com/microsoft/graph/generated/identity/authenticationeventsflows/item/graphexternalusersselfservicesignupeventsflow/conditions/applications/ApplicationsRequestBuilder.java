package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.conditions.applications;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.conditions.applications.includeapplications.IncludeApplicationsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identity/authenticationEventsFlows/{authenticationEventsFlow-id}/graph.externalUsersSelfServiceSignUpEventsFlow/conditions/applications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the includeApplications property of the microsoft.graph.authenticationConditionsApplications entity.
     * @return a {@link IncludeApplicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IncludeApplicationsRequestBuilder includeApplications() {
        return new IncludeApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ApplicationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/conditions/applications", pathParameters);
    }
    /**
     * Instantiates a new {@link ApplicationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/conditions/applications", rawUrl);
    }
}
