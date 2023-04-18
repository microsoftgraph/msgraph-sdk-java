package com.microsoft.graph.education.classes.item;

import com.microsoft.graph.education.classes.item.assignmentcategories.AssignmentCategoriesRequestBuilder;
import com.microsoft.graph.education.classes.item.assignmentdefaults.AssignmentDefaultsRequestBuilder;
import com.microsoft.graph.education.classes.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.education.classes.item.assignmentsettings.AssignmentSettingsRequestBuilder;
import com.microsoft.graph.education.classes.item.group.GroupRequestBuilder;
import com.microsoft.graph.education.classes.item.members.MembersRequestBuilder;
import com.microsoft.graph.education.classes.item.schools.SchoolsRequestBuilder;
import com.microsoft.graph.education.classes.item.teachers.TeachersRequestBuilder;
import com.microsoft.graph.models.EducationClass;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the classes property of the microsoft.graph.educationRoot entity.
 */
public class EducationClassItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the assignmentCategories property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public AssignmentCategoriesRequestBuilder assignmentCategories() {
        return new AssignmentCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentDefaults property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public AssignmentDefaultsRequestBuilder assignmentDefaults() {
        return new AssignmentDefaultsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignmentSettings property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public AssignmentSettingsRequestBuilder assignmentSettings() {
        return new AssignmentSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the group property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the members property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the schools property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public SchoolsRequestBuilder schools() {
        return new SchoolsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the teachers property of the microsoft.graph.educationClass entity. */
    @javax.annotation.Nonnull
    public TeachersRequestBuilder teachers() {
        return new TeachersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EducationClassItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationClassItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EducationClassItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationClassItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property classes for education
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property classes for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get classes from education
     * @return a CompletableFuture of educationClass
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EducationClass::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EducationClass> executionException = new java.util.concurrent.CompletableFuture<EducationClass>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get classes from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationClass
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EducationClass::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EducationClass> executionException = new java.util.concurrent.CompletableFuture<EducationClass>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property classes in education
     * @param body The request body
     * @return a CompletableFuture of educationClass
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> patch(@javax.annotation.Nonnull final EducationClass body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EducationClass::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EducationClass> executionException = new java.util.concurrent.CompletableFuture<EducationClass>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property classes in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of educationClass
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> patch(@javax.annotation.Nonnull final EducationClass body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EducationClass::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EducationClass> executionException = new java.util.concurrent.CompletableFuture<EducationClass>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property classes for education
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property classes for education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get classes from education
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get classes from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property classes in education
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EducationClass body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property classes in education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EducationClass body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get classes from education
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
