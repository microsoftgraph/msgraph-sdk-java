package com.microsoft.graph.education.users.item;

import com.microsoft.graph.education.users.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.education.users.item.assignments.item.EducationAssignmentItemRequestBuilder;
import com.microsoft.graph.education.users.item.classes.ClassesRequestBuilder;
import com.microsoft.graph.education.users.item.rubrics.item.EducationRubricItemRequestBuilder;
import com.microsoft.graph.education.users.item.rubrics.RubricsRequestBuilder;
import com.microsoft.graph.education.users.item.schools.item.EducationSchoolItemRequestBuilder;
import com.microsoft.graph.education.users.item.schools.SchoolsRequestBuilder;
import com.microsoft.graph.education.users.item.taughtclasses.item.EducationClassItemRequestBuilder;
import com.microsoft.graph.education.users.item.taughtclasses.TaughtClassesRequestBuilder;
import com.microsoft.graph.education.users.item.user.UserRequestBuilder;
import com.microsoft.graph.models.EducationUser;
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
/** Provides operations to manage the users property of the microsoft.graph.educationRoot entity. */
public class EducationUserItemRequestBuilder {
    /** Provides operations to manage the assignments property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the classes property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public ClassesRequestBuilder classes() {
        return new ClassesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the rubrics property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public RubricsRequestBuilder rubrics() {
        return new RubricsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the schools property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public SchoolsRequestBuilder schools() {
        return new SchoolsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the taughtClasses property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public TaughtClassesRequestBuilder taughtClasses() {
        return new TaughtClassesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the user property of the microsoft.graph.educationUser entity. */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.educationUser entity.
     * @param id Unique identifier of the item
     * @return a EducationAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationAssignment%2Did", id);
        return new EducationAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the classes property of the microsoft.graph.educationUser entity.
     * @param id Unique identifier of the item
     * @return a EducationClassItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.education.users.item.classes.item.EducationClassItemRequestBuilder classes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationClass%2Did", id);
        return new com.microsoft.graph.education.users.item.classes.item.EducationClassItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EducationUserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationUserItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/education/users/{educationUser%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EducationUserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationUserItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/education/users/{educationUser%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property users for education
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property users for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EducationUserItemRequestBuilderDeleteRequestConfiguration requestConfig = new EducationUserItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get users from education
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get users from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final EducationUserItemRequestBuilderGetRequestConfiguration requestConfig = new EducationUserItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property users in education
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EducationUser body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property users in education
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final EducationUser body, @javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EducationUserItemRequestBuilderPatchRequestConfiguration requestConfig = new EducationUserItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property users for education
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
     * Delete navigation property users for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Get users from education
     * @return a CompletableFuture of educationUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get users from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> get(@javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property users in education
     * @param body 
     * @return a CompletableFuture of educationUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> patch(@javax.annotation.Nonnull final EducationUser body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property users in education
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> patch(@javax.annotation.Nonnull final EducationUser body, @javax.annotation.Nullable final java.util.function.Consumer<EducationUserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, EducationUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<EducationUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the rubrics property of the microsoft.graph.educationUser entity.
     * @param id Unique identifier of the item
     * @return a EducationRubricItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationRubricItemRequestBuilder rubrics(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationRubric%2Did", id);
        return new EducationRubricItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the schools property of the microsoft.graph.educationUser entity.
     * @param id Unique identifier of the item
     * @return a EducationSchoolItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EducationSchoolItemRequestBuilder schools(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationSchool%2Did", id);
        return new EducationSchoolItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the taughtClasses property of the microsoft.graph.educationUser entity.
     * @param id Unique identifier of the item
     * @return a EducationClassItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.education.users.item.taughtclasses.item.EducationClassItemRequestBuilder taughtClasses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationClass%2Did", id);
        return new com.microsoft.graph.education.users.item.taughtclasses.item.EducationClassItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EducationUserItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EducationUserItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationUserItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get users from education */
    public class EducationUserItemRequestBuilderGetQueryParameters {
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
    public class EducationUserItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EducationUserItemRequestBuilderGetQueryParameters queryParameters = new EducationUserItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new EducationUserItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationUserItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EducationUserItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new EducationUserItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public EducationUserItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
