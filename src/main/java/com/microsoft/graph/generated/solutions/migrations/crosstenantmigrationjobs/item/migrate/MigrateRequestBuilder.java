package com.microsoft.graph.solutions.migrations.crosstenantmigrationjobs.item.migrate;

import com.microsoft.graph.models.CrossTenantMigrationJob;
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
 * Provides operations to call the migrate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MigrateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MigrateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MigrateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/{crossTenantMigrationJob%2Did}/migrate", pathParameters);
    }
    /**
     * Instantiates a new {@link MigrateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MigrateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/migrations/crossTenantMigrationJobs/{crossTenantMigrationJob%2Did}/migrate", rawUrl);
    }
    /**
     * Migrate a cross-tenant migration job asynchronously. The job must pass validation before migration can start. After a job is created by using the Create crossTenantMigrationJob method and validated by using the validate action, call this action to start the migration of user data from the source tenant to the target tenant for the specified workloads. Validation results expire after seven days; if expired, revalidate the job before you call the migrate API. This action is asynchronous. After you call the migrate API, poll the Get crossTenantMigrationJob endpoint to check for a terminal status of completed, completedWithErrors, or failed.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-migrate?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob post() {
        return post(null);
    }
    /**
     * Migrate a cross-tenant migration job asynchronously. The job must pass validation before migration can start. After a job is created by using the Create crossTenantMigrationJob method and validated by using the validate action, call this action to start the migration of user data from the source tenant to the target tenant for the specified workloads. Validation results expire after seven days; if expired, revalidate the job before you call the migrate API. This action is asynchronous. After you call the migrate API, poll the Get crossTenantMigrationJob endpoint to check for a terminal status of completed, completedWithErrors, or failed.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantMigrationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/crosstenantmigrationjob-migrate?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJob post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantMigrationJob::createFromDiscriminatorValue);
    }
    /**
     * Migrate a cross-tenant migration job asynchronously. The job must pass validation before migration can start. After a job is created by using the Create crossTenantMigrationJob method and validated by using the validate action, call this action to start the migration of user data from the source tenant to the target tenant for the specified workloads. Validation results expire after seven days; if expired, revalidate the job before you call the migrate API. This action is asynchronous. After you call the migrate API, poll the Get crossTenantMigrationJob endpoint to check for a terminal status of completed, completedWithErrors, or failed.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Migrate a cross-tenant migration job asynchronously. The job must pass validation before migration can start. After a job is created by using the Create crossTenantMigrationJob method and validated by using the validate action, call this action to start the migration of user data from the source tenant to the target tenant for the specified workloads. Validation results expire after seven days; if expired, revalidate the job before you call the migrate API. This action is asynchronous. After you call the migrate API, poll the Get crossTenantMigrationJob endpoint to check for a terminal status of completed, completedWithErrors, or failed.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link MigrateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MigrateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MigrateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
