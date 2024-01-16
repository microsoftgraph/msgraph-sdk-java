package com.microsoft.graph.education.users.item.assignments.item.submissions.item.submittedresources;

import com.microsoft.graph.education.users.item.assignments.item.submissions.item.submittedresources.count.CountRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.submissions.item.submittedresources.item.EducationSubmissionResourceItemRequestBuilder;
import com.microsoft.graph.models.EducationSubmissionResource;
import com.microsoft.graph.models.EducationSubmissionResourceCollectionResponse;
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
 * Provides operations to manage the submittedResources property of the microsoft.graph.educationSubmission entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmittedResourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the submittedResources property of the microsoft.graph.educationSubmission entity.
     * @param educationSubmissionResourceId The unique identifier of educationSubmissionResource
     * @return a EducationSubmissionResourceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EducationSubmissionResourceItemRequestBuilder byEducationSubmissionResourceId(@jakarta.annotation.Nonnull final String educationSubmissionResourceId) {
        Objects.requireNonNull(educationSubmissionResourceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationSubmissionResource%2Did", educationSubmissionResourceId);
        return new EducationSubmissionResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SubmittedResourcesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubmittedResourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/users/{educationUser%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/submittedResources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SubmittedResourcesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubmittedResourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/users/{educationUser%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/submittedResources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List the educationSubmissionResource objects that were officially submitted for grading. Only teachers, students, and applications with application permissions can perform this operation. The student who owns the submission can't change the submitted list without resubmitting the assignment. This resource is a wrapper around the real resource and can contain a pointer back to the actual assignment resource if this resource was copied from the assignment.
     * @return a EducationSubmissionResourceCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-list-submittedresources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionResourceCollectionResponse get() {
        return get(null);
    }
    /**
     * List the educationSubmissionResource objects that were officially submitted for grading. Only teachers, students, and applications with application permissions can perform this operation. The student who owns the submission can't change the submitted list without resubmitting the assignment. This resource is a wrapper around the real resource and can contain a pointer back to the actual assignment resource if this resource was copied from the assignment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EducationSubmissionResourceCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-list-submittedresources?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionResourceCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSubmissionResourceCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to submittedResources for education
     * @param body The request body
     * @return a EducationSubmissionResource
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionResource post(@jakarta.annotation.Nonnull final EducationSubmissionResource body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to submittedResources for education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EducationSubmissionResource
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionResource post(@jakarta.annotation.Nonnull final EducationSubmissionResource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSubmissionResource::createFromDiscriminatorValue);
    }
    /**
     * List the educationSubmissionResource objects that were officially submitted for grading. Only teachers, students, and applications with application permissions can perform this operation. The student who owns the submission can't change the submitted list without resubmitting the assignment. This resource is a wrapper around the real resource and can contain a pointer back to the actual assignment resource if this resource was copied from the assignment.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List the educationSubmissionResource objects that were officially submitted for grading. Only teachers, students, and applications with application permissions can perform this operation. The student who owns the submission can't change the submitted list without resubmitting the assignment. This resource is a wrapper around the real resource and can contain a pointer back to the actual assignment resource if this resource was copied from the assignment.
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
     * Create new navigation property to submittedResources for education
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationSubmissionResource body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to submittedResources for education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationSubmissionResource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SubmittedResourcesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SubmittedResourcesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubmittedResourcesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List the educationSubmissionResource objects that were officially submitted for grading. Only teachers, students, and applications with application permissions can perform this operation. The student who owns the submission can't change the submitted list without resubmitting the assignment. This resource is a wrapper around the real resource and can contain a pointer back to the actual assignment resource if this resource was copied from the assignment.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
