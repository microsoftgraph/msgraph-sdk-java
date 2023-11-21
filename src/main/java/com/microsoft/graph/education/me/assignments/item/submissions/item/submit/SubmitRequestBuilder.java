package com.microsoft.graph.education.me.assignments.item.submissions.item.submit;

import com.microsoft.graph.models.EducationSubmission;
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
 * Provides operations to call the submit method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmitRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SubmitRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubmitRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/submit", pathParameters);
    }
    /**
     * Instantiates a new SubmitRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubmitRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/submit", rawUrl);
    }
    /**
     * Indicate that a student is done with the work and is ready to hand in the assignment. Only teachers, students, and applications with application permissions can perform this operation. This method changes the status of the submission from working to submitted. During the submit process, all the resources are copied to the submittedResources bucket. The teacher will be looking at the submitted resources list for grading. A teacher can also submit a student's assignment on their behalf. This API is available in the following national cloud deployments.
     * @return a EducationSubmission
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-submit?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmission post() {
        return post(null);
    }
    /**
     * Indicate that a student is done with the work and is ready to hand in the assignment. Only teachers, students, and applications with application permissions can perform this operation. This method changes the status of the submission from working to submitted. During the submit process, all the resources are copied to the submittedResources bucket. The teacher will be looking at the submitted resources list for grading. A teacher can also submit a student's assignment on their behalf. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EducationSubmission
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-submit?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmission post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, EducationSubmission::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Indicate that a student is done with the work and is ready to hand in the assignment. Only teachers, students, and applications with application permissions can perform this operation. This method changes the status of the submission from working to submitted. During the submit process, all the resources are copied to the submittedResources bucket. The teacher will be looking at the submitted resources list for grading. A teacher can also submit a student's assignment on their behalf. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Indicate that a student is done with the work and is ready to hand in the assignment. Only teachers, students, and applications with application permissions can perform this operation. This method changes the status of the submission from working to submitted. During the submit process, all the resources are copied to the submittedResources bucket. The teacher will be looking at the submitted resources list for grading. A teacher can also submit a student's assignment on their behalf. This API is available in the following national cloud deployments.
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
     * @return a SubmitRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SubmitRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubmitRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
