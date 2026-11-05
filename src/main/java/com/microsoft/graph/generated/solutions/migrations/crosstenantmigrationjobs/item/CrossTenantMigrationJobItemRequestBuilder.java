package com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item;

import com.microsoft.graph.models.CrossTenantMigrationJob;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item.migrate.MigrateRequestBuilder;
import com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item.users.UsersRequestBuilder;
import com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item.validate.ValidateRequestBuilder;
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
 * Provides operations to manage the crossTenantMigrationJobs property of the microsoft.graph.migrationsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantMigrationJobItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the cancel method.
     * @return a {@link CancelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the migrate method.
     * @return a {@link MigrateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MigrateRequestBuilder migrate() {
        return new MigrateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the users property of the microsoft.graph.crossTenantMigrationJob entity.
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validate method.
     * @return a {@link ValidateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidateRequestBuilder validate() {
        return new ValidateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CrossTenantMigrationJobItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossTenantMigrationJobItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/{crossTenantMigrationJob%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CrossTenantMigrationJobItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossTenantMigrationJobItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/{crossTenantMigrationJob%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a crossTenantMigrationJob object. Delete requests are long-running and finish within 48 hours. A crossTenantMigrationJob that is currently in progress can&apos;t be deleted. You can perform the deletion only after the crossTenantMigrationJob reaches a final state. If a crossTenantMigrationJob isn&apos;t in a final state, a 409 Conflict response is returned.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/migrationsroot-delete-crosstenantmigrationjobs?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a crossTenantMigrationJob object. Delete requests are long-running and finish within 48 hours. A crossTenantMigrationJob that is currently in progress can&apos;t be deleted. You can perform the deletion only after the crossTenantMigrationJob reaches a final state. If a crossTenantMigrationJob isn&apos;t in a final state, a 409 Conflict response is returned.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/migrationsroot-delete-crosstenantmigrationjobs?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a crossTenantMigrationJob object. This API provides details about the migration job, but not about the individual crossTenantMigrationTasks objects associated with the migration job.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a crossTenantMigrationJob object. This API provides details about the migration job, but not about the individual crossTenantMigrationTasks objects associated with the migration job.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantMigrationJob::createFromDiscriminatorValue);
    }
    /**
     * Update the completeAfterDateTime property of a crossTenantMigrationJob object. Only updates to completeAfterDateTime are supported. This property specifies when the migration job can proceed toward completion. If the value is in the past, the service treats it as already due and proceeds toward completion during its next processing cycle. This behavior doesn&apos;t bypass earlier validation or synchronization stages.
     * @param body The request body
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob patch(@jakarta.annotation.Nonnull final CrossTenantMigrationJob body) {
        return patch(body, null);
    }
    /**
     * Update the completeAfterDateTime property of a crossTenantMigrationJob object. Only updates to completeAfterDateTime are supported. This property specifies when the migration job can proceed toward completion. If the value is in the past, the service treats it as already due and proceeds toward completion during its next processing cycle. This behavior doesn&apos;t bypass earlier validation or synchronization stages.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob patch(@jakarta.annotation.Nonnull final CrossTenantMigrationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantMigrationJob::createFromDiscriminatorValue);
    }
    /**
     * Delete a crossTenantMigrationJob object. Delete requests are long-running and finish within 48 hours. A crossTenantMigrationJob that is currently in progress can&apos;t be deleted. You can perform the deletion only after the crossTenantMigrationJob reaches a final state. If a crossTenantMigrationJob isn&apos;t in a final state, a 409 Conflict response is returned.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a crossTenantMigrationJob object. Delete requests are long-running and finish within 48 hours. A crossTenantMigrationJob that is currently in progress can&apos;t be deleted. You can perform the deletion only after the crossTenantMigrationJob reaches a final state. If a crossTenantMigrationJob isn&apos;t in a final state, a 409 Conflict response is returned.
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
     * Read the properties and relationships of a crossTenantMigrationJob object. This API provides details about the migration job, but not about the individual crossTenantMigrationTasks objects associated with the migration job.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a crossTenantMigrationJob object. This API provides details about the migration job, but not about the individual crossTenantMigrationTasks objects associated with the migration job.
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
     * Update the completeAfterDateTime property of a crossTenantMigrationJob object. Only updates to completeAfterDateTime are supported. This property specifies when the migration job can proceed toward completion. If the value is in the past, the service treats it as already due and proceeds toward completion during its next processing cycle. This behavior doesn&apos;t bypass earlier validation or synchronization stages.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CrossTenantMigrationJob body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the completeAfterDateTime property of a crossTenantMigrationJob object. Only updates to completeAfterDateTime are supported. This property specifies when the migration job can proceed toward completion. If the value is in the past, the service treats it as already due and proceeds toward completion during its next processing cycle. This behavior doesn&apos;t bypass earlier validation or synchronization stages.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CrossTenantMigrationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CrossTenantMigrationJobItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CrossTenantMigrationJobItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CrossTenantMigrationJobItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a crossTenantMigrationJob object. This API provides details about the migration job, but not about the individual crossTenantMigrationTasks objects associated with the migration job.
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
