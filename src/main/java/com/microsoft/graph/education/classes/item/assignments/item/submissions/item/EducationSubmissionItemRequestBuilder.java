package com.microsoft.graph.education.classes.item.assignments.item.submissions.item;

import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.outcomes.item.EducationOutcomeItemRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.outcomes.OutcomesRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.reassign.ReassignRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.resources.item.EducationSubmissionResourceItemRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.resources.ResourcesRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.return_escaped.ReturnRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.setupresourcesfolder.SetUpResourcesFolderRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.submit.SubmitRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.submittedresources.SubmittedResourcesRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.item.submissions.item.unsubmit.UnsubmitRequestBuilder;
import com.microsoft.graph.models.EducationSubmission;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the submissions property of the microsoft.graph.educationAssignment entity. */
public class EducationSubmissionItemRequestBuilder {
    /** The outcomes property */
    @javax.annotation.Nonnull
    public OutcomesRequestBuilder outcomes() {
        return new OutcomesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The reassign property */
    @javax.annotation.Nonnull
    public ReassignRequestBuilder reassign() {
        return new ReassignRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The resources property */
    @javax.annotation.Nonnull
    public ResourcesRequestBuilder resources() {
        return new ResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The return property */
    @javax.annotation.Nonnull
    public ReturnRequestBuilder return_escaped() {
        return new ReturnRequestBuilder(pathParameters, requestAdapter);
    }
    /** The setUpResourcesFolder property */
    @javax.annotation.Nonnull
    public SetUpResourcesFolderRequestBuilder setUpResourcesFolder() {
        return new SetUpResourcesFolderRequestBuilder(pathParameters, requestAdapter);
    }
    /** The submit property */
    @javax.annotation.Nonnull
    public SubmitRequestBuilder submit() {
        return new SubmitRequestBuilder(pathParameters, requestAdapter);
    }
    /** The submittedResources property */
    @javax.annotation.Nonnull
    public SubmittedResourcesRequestBuilder submittedResources() {
        return new SubmittedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unsubmit property */
    @javax.annotation.Nonnull
    public UnsubmitRequestBuilder unsubmit() {
        return new UnsubmitRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new EducationSubmissionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSubmissionItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/education/classes/{educationClass%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EducationSubmissionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSubmissionItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/education/classes/{educationClass%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property submissions for education
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property submissions for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EducationSubmissionItemRequestBuilderDeleteRequestConfiguration requestConfig = new EducationSubmissionItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final EducationSubmissionItemRequestBuilderGetRequestConfiguration requestConfig = new EducationSubmissionItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property submissions in education
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EducationSubmission body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property submissions in education
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EducationSubmission body, @javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EducationSubmissionItemRequestBuilderPatchRequestConfiguration requestConfig = new EducationSubmissionItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property submissions for education
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property submissions for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @return a CompletableFuture of educationSubmission
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationSubmission> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationSubmission::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationSubmission>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationSubmission
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationSubmission> get(@javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationSubmission::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationSubmission>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.education.classes.item.assignments.item.submissions.item.outcomes.item collection
     * @param id Unique identifier of the item
     * @return a EducationOutcomeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationOutcomeItemRequestBuilder outcomes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationOutcome%2Did", id);
        return new EducationOutcomeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property submissions in education
     * @param body 
     * @return a CompletableFuture of educationSubmission
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationSubmission> patch(@javax.annotation.Nonnull final EducationSubmission body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationSubmission::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationSubmission>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property submissions in education
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationSubmission
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationSubmission> patch(@javax.annotation.Nonnull final EducationSubmission body, @javax.annotation.Nullable final java.util.function.Consumer<EducationSubmissionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationSubmission::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationSubmission>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.education.classes.item.assignments.item.submissions.item.resources.item collection
     * @param id Unique identifier of the item
     * @return a EducationSubmissionResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.education.classes.item.assignments.item.submissions.item.resources.item.EducationSubmissionResourceItemRequestBuilder resources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationSubmissionResource%2Did", id);
        return new com.microsoft.graph.education.classes.item.assignments.item.submissions.item.resources.item.EducationSubmissionResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.education.classes.item.assignments.item.submissions.item.submittedResources.item collection
     * @param id Unique identifier of the item
     * @return a EducationSubmissionResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.education.classes.item.assignments.item.submissions.item.submittedresources.item.EducationSubmissionResourceItemRequestBuilder submittedResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationSubmissionResource%2Did", id);
        return new com.microsoft.graph.education.classes.item.assignments.item.submissions.item.submittedresources.item.EducationSubmissionResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EducationSubmissionItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EducationSubmissionItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationSubmissionItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable. */
    public class EducationSubmissionItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EducationSubmissionItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EducationSubmissionItemRequestBuilderGetQueryParameters queryParameters = new EducationSubmissionItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new EducationSubmissionItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationSubmissionItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EducationSubmissionItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EducationSubmissionItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationSubmissionItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
