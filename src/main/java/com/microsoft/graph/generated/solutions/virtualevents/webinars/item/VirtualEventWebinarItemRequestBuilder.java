package com.microsoft.graph.solutions.virtualevents.webinars.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEventWebinar;
import com.microsoft.graph.solutions.virtualevents.webinars.item.presenters.PresentersRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.registrationconfiguration.RegistrationConfigurationRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.registrations.RegistrationsRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.registrationswithemail.RegistrationsWithEmailRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.registrationswithuserid.RegistrationsWithUserIdRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.SessionsRequestBuilder;
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
 * Provides operations to manage the webinars property of the microsoft.graph.virtualEventsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventWebinarItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the presenters property of the microsoft.graph.virtualEvent entity.
     * @return a {@link PresentersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PresentersRequestBuilder presenters() {
        return new PresentersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registrationConfiguration property of the microsoft.graph.virtualEventWebinar entity.
     * @return a {@link RegistrationConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegistrationConfigurationRequestBuilder registrationConfiguration() {
        return new RegistrationConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registrations property of the microsoft.graph.virtualEventWebinar entity.
     * @return a {@link RegistrationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegistrationsRequestBuilder registrations() {
        return new RegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sessions property of the microsoft.graph.virtualEvent entity.
     * @return a {@link SessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SessionsRequestBuilder sessions() {
        return new SessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VirtualEventWebinarItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEventWebinarItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/{virtualEventWebinar%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link VirtualEventWebinarItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEventWebinarItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/{virtualEventWebinar%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property webinars for solutions
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property webinars for solutions
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
     * Read the properties and relationships of a virtualEventWebinar object.
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventwebinar-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a virtualEventWebinar object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventwebinar-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventWebinar::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a virtualEventWebinar object.
     * @param body The request body
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventwebinar-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar patch(@jakarta.annotation.Nonnull final VirtualEventWebinar body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a virtualEventWebinar object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventwebinar-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar patch(@jakarta.annotation.Nonnull final VirtualEventWebinar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventWebinar::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the registrations property of the microsoft.graph.virtualEventWebinar entity.
     * @param email Alternate key of virtualEventRegistration
     * @return a {@link RegistrationsWithEmailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegistrationsWithEmailRequestBuilder registrationsWithEmail(@jakarta.annotation.Nonnull final String email) {
        Objects.requireNonNull(email);
        return new RegistrationsWithEmailRequestBuilder(pathParameters, requestAdapter, email);
    }
    /**
     * Provides operations to manage the registrations property of the microsoft.graph.virtualEventWebinar entity.
     * @param userId Alternate key of virtualEventRegistration
     * @return a {@link RegistrationsWithUserIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegistrationsWithUserIdRequestBuilder registrationsWithUserId(@jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(userId);
        return new RegistrationsWithUserIdRequestBuilder(pathParameters, requestAdapter, userId);
    }
    /**
     * Delete navigation property webinars for solutions
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property webinars for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a virtualEventWebinar object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a virtualEventWebinar object.
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
     * Update the properties of a virtualEventWebinar object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEventWebinar body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a virtualEventWebinar object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEventWebinar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link VirtualEventWebinarItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEventWebinarItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VirtualEventWebinarItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a virtualEventWebinar object.
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
