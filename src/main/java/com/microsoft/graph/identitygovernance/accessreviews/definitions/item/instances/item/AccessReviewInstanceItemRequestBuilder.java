package com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item;

import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.acceptrecommendations.AcceptRecommendationsRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.applydecisions.ApplyDecisionsRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.batchrecorddecisions.BatchRecordDecisionsRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.contactedreviewers.ContactedReviewersRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.decisions.DecisionsRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.resetdecisions.ResetDecisionsRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.sendreminder.SendReminderRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.stages.StagesRequestBuilder;
import com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.stop.StopRequestBuilder;
import com.microsoft.graph.models.AccessReviewInstance;
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
 * Provides operations to manage the instances property of the microsoft.graph.accessReviewScheduleDefinition entity.
 */
public class AccessReviewInstanceItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the acceptRecommendations method. */
    @javax.annotation.Nonnull
    public AcceptRecommendationsRequestBuilder acceptRecommendations() {
        return new AcceptRecommendationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the applyDecisions method. */
    @javax.annotation.Nonnull
    public ApplyDecisionsRequestBuilder applyDecisions() {
        return new ApplyDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the batchRecordDecisions method. */
    @javax.annotation.Nonnull
    public BatchRecordDecisionsRequestBuilder batchRecordDecisions() {
        return new BatchRecordDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the contactedReviewers property of the microsoft.graph.accessReviewInstance entity. */
    @javax.annotation.Nonnull
    public ContactedReviewersRequestBuilder contactedReviewers() {
        return new ContactedReviewersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the decisions property of the microsoft.graph.accessReviewInstance entity. */
    @javax.annotation.Nonnull
    public DecisionsRequestBuilder decisions() {
        return new DecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the resetDecisions method. */
    @javax.annotation.Nonnull
    public ResetDecisionsRequestBuilder resetDecisions() {
        return new ResetDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sendReminder method. */
    @javax.annotation.Nonnull
    public SendReminderRequestBuilder sendReminder() {
        return new SendReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the stages property of the microsoft.graph.accessReviewInstance entity. */
    @javax.annotation.Nonnull
    public StagesRequestBuilder stages() {
        return new StagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the stop method. */
    @javax.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AccessReviewInstanceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/definitions/{accessReviewScheduleDefinition%2Did}/instances/{accessReviewInstance%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AccessReviewInstanceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/definitions/{accessReviewScheduleDefinition%2Did}/instances/{accessReviewInstance%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property instances for identityGovernance
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
     * Delete navigation property instances for identityGovernance
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
     * Read the properties and relationships of an accessReviewInstance object.
     * @return a CompletableFuture of accessReviewInstance
     * @see <a href="https://docs.microsoft.com/graph/api/accessreviewinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessReviewInstance> executionException = new java.util.concurrent.CompletableFuture<AccessReviewInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read the properties and relationships of an accessReviewInstance object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewInstance
     * @see <a href="https://docs.microsoft.com/graph/api/accessreviewinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessReviewInstance> executionException = new java.util.concurrent.CompletableFuture<AccessReviewInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of an accessReviewInstance object. Only the **reviewers** and **fallbackReviewers** properties can be updated but the **scope** property is also required in the request body. You can only add reviewers to the **fallbackReviewers** property but can't remove existing **fallbackReviewers**. To update an **accessReviewInstance**, it's **status** must be `InProgress`.
     * @param body The request body
     * @return a CompletableFuture of accessReviewInstance
     * @see <a href="https://docs.microsoft.com/graph/api/accessreviewinstance-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> patch(@javax.annotation.Nonnull final AccessReviewInstance body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessReviewInstance> executionException = new java.util.concurrent.CompletableFuture<AccessReviewInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of an accessReviewInstance object. Only the **reviewers** and **fallbackReviewers** properties can be updated but the **scope** property is also required in the request body. You can only add reviewers to the **fallbackReviewers** property but can't remove existing **fallbackReviewers**. To update an **accessReviewInstance**, it's **status** must be `InProgress`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewInstance
     * @see <a href="https://docs.microsoft.com/graph/api/accessreviewinstance-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> patch(@javax.annotation.Nonnull final AccessReviewInstance body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, AccessReviewInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<AccessReviewInstance> executionException = new java.util.concurrent.CompletableFuture<AccessReviewInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property instances for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property instances for identityGovernance
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
     * Read the properties and relationships of an accessReviewInstance object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an accessReviewInstance object.
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
     * Update the properties of an accessReviewInstance object. Only the **reviewers** and **fallbackReviewers** properties can be updated but the **scope** property is also required in the request body. You can only add reviewers to the **fallbackReviewers** property but can't remove existing **fallbackReviewers**. To update an **accessReviewInstance**, it's **status** must be `InProgress`.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccessReviewInstance body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of an accessReviewInstance object. Only the **reviewers** and **fallbackReviewers** properties can be updated but the **scope** property is also required in the request body. You can only add reviewers to the **fallbackReviewers** property but can't remove existing **fallbackReviewers**. To update an **accessReviewInstance**, it's **status** must be `InProgress`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final AccessReviewInstance body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Read the properties and relationships of an accessReviewInstance object.
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
