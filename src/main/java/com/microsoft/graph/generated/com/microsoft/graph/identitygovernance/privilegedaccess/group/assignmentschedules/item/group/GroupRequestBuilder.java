package com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedules.item.group;

import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedules.item.group.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the group property of the microsoft.graph.privilegedAccessGroupAssignmentSchedule entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupRequestBuilder extends BaseRequestBuilder {
    /**
     * The serviceProvisioningErrors property
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentSchedules/{privilegedAccessGroupAssignmentSchedule%2Did}/group{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentSchedules/{privilegedAccessGroupAssignmentSchedule%2Did}/group{?%24select,%24expand}", rawUrl);
    }
    /**
     * References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group get() {
        return get(null);
    }
    /**
     * References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Group::createFromDiscriminatorValue);
    }
    /**
     * References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GroupRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
}
