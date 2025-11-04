package com.microsoft.graph.education.users.item.assignments.item;

import com.microsoft.graph.education.users.item.assignments.item.activate.ActivateRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.categories.CategoriesRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.deactivate.DeactivateRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.gradingcategory.GradingCategoryRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.gradingscheme.GradingSchemeRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.publish.PublishRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.resources.ResourcesRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.rubric.RubricRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.setupfeedbackresourcesfolder.SetUpFeedbackResourcesFolderRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.setupresourcesfolder.SetUpResourcesFolderRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.submissions.SubmissionsRequestBuilder;
import com.microsoft.graph.models.EducationAssignment;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the assignments property of the microsoft.graph.educationUser entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the activate method.
     * @return a {@link ActivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivateRequestBuilder activate() {
        return new ActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.educationAssignment entity.
     * @return a {@link CategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deactivate method.
     * @return a {@link DeactivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeactivateRequestBuilder deactivate() {
        return new DeactivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the gradingCategory property of the microsoft.graph.educationAssignment entity.
     * @return a {@link GradingCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GradingCategoryRequestBuilder gradingCategory() {
        return new GradingCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the gradingScheme property of the microsoft.graph.educationAssignment entity.
     * @return a {@link GradingSchemeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GradingSchemeRequestBuilder gradingScheme() {
        return new GradingSchemeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the publish method.
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the resources property of the microsoft.graph.educationAssignment entity.
     * @return a {@link ResourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResourcesRequestBuilder resources() {
        return new ResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rubric property of the microsoft.graph.educationAssignment entity.
     * @return a {@link RubricRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RubricRequestBuilder rubric() {
        return new RubricRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setUpFeedbackResourcesFolder method.
     * @return a {@link SetUpFeedbackResourcesFolderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetUpFeedbackResourcesFolderRequestBuilder setUpFeedbackResourcesFolder() {
        return new SetUpFeedbackResourcesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setUpResourcesFolder method.
     * @return a {@link SetUpResourcesFolderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetUpResourcesFolderRequestBuilder setUpResourcesFolder() {
        return new SetUpResourcesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the submissions property of the microsoft.graph.educationAssignment entity.
     * @return a {@link SubmissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubmissionsRequestBuilder submissions() {
        return new SubmissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EducationAssignmentItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/users/{educationUser%2Did}/assignments/{educationAssignment%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link EducationAssignmentItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationAssignmentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/users/{educationUser%2Did}/assignments/{educationAssignment%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property assignments for education
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property assignments for education
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
     * Assignments belonging to the user.
     * @return a {@link EducationAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EducationAssignment get() {
        return get(null);
    }
    /**
     * Assignments belonging to the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EducationAssignment get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationAssignment::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property assignments in education
     * @param body The request body
     * @return a {@link EducationAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EducationAssignment patch(@jakarta.annotation.Nonnull final EducationAssignment body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignments in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EducationAssignment patch(@jakarta.annotation.Nonnull final EducationAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationAssignment::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property assignments for education
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignments for education
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
     * Assignments belonging to the user.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Assignments belonging to the user.
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
     * Update the navigation property assignments in education
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EducationAssignment body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignments in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final EducationAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link EducationAssignmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EducationAssignmentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EducationAssignmentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Assignments belonging to the user.
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
