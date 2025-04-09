package com.microsoft.graph.identitygovernance.privilegedaccess.group;

import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentapprovals.AssignmentApprovalsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.AssignmentScheduleInstancesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.AssignmentScheduleRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedules.AssignmentSchedulesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityscheduleinstances.EligibilityScheduleInstancesRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedulerequests.EligibilityScheduleRequestsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.eligibilityschedules.EligibilitySchedulesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccessGroup;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the group property of the microsoft.graph.privilegedAccessRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the assignmentApprovals property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link AssignmentApprovalsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentApprovalsRequestBuilder assignmentApprovals() {
        return new AssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link AssignmentScheduleInstancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentScheduleInstancesRequestBuilder assignmentScheduleInstances() {
        return new AssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link AssignmentScheduleRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentScheduleRequestsRequestBuilder assignmentScheduleRequests() {
        return new AssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentSchedules property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link AssignmentSchedulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentSchedulesRequestBuilder assignmentSchedules() {
        return new AssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the eligibilityScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link EligibilityScheduleInstancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EligibilityScheduleInstancesRequestBuilder eligibilityScheduleInstances() {
        return new EligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the eligibilityScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link EligibilityScheduleRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EligibilityScheduleRequestsRequestBuilder eligibilityScheduleRequests() {
        return new EligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the eligibilitySchedules property of the microsoft.graph.privilegedAccessGroup entity.
     * @return a {@link EligibilitySchedulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EligibilitySchedulesRequestBuilder eligibilitySchedules() {
        return new EligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GroupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GroupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property group for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property group for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * A group that&apos;s governed through Privileged Identity Management (PIM).
     * @return a {@link PrivilegedAccessGroup}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup get() {
        return get(null);
    }
    /**
     * A group that&apos;s governed through Privileged Identity Management (PIM).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccessGroup}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroup::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @return a {@link PrivilegedAccessGroup}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup patch(@jakarta.annotation.Nonnull final PrivilegedAccessGroup body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccessGroup}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup patch(@jakarta.annotation.Nonnull final PrivilegedAccessGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroup::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property group for identityGovernance
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property group for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * A group that&apos;s governed through Privileged Identity Management (PIM).
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * A group that&apos;s governed through Privileged Identity Management (PIM).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroup body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property group in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * A group that&apos;s governed through Privileged Identity Management (PIM).
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
