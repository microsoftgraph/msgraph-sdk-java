package com.microsoft.graph.storage.filestorage.containers.item;

import com.microsoft.graph.models.FileStorageContainer;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.storage.filestorage.containers.item.activate.ActivateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.DriveRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.lock.LockRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.migrationjobs.MigrationJobsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.permanentdelete.PermanentDeleteRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.provisionmigrationcontainers.ProvisionMigrationContainersRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.recyclebin.RecycleBinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.unlock.UnlockRequestBuilder;
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
 * Provides operations to manage the containers property of the microsoft.graph.fileStorage entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorageContainerItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the activate method.
     * @return a {@link ActivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivateRequestBuilder activate() {
        return new ActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.fileStorageContainer entity.
     * @return a {@link ColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.fileStorageContainer entity.
     * @return a {@link DriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lock method.
     * @return a {@link LockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LockRequestBuilder lock() {
        return new LockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the migrationJobs property of the microsoft.graph.fileStorageContainer entity.
     * @return a {@link MigrationJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MigrationJobsRequestBuilder migrationJobs() {
        return new MigrationJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permanentDelete method.
     * @return a {@link PermanentDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermanentDeleteRequestBuilder permanentDelete() {
        return new PermanentDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.fileStorageContainer entity.
     * @return a {@link PermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the provisionMigrationContainers method.
     * @return a {@link ProvisionMigrationContainersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisionMigrationContainersRequestBuilder provisionMigrationContainers() {
        return new ProvisionMigrationContainersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the recycleBin property of the microsoft.graph.fileStorageContainer entity.
     * @return a {@link RecycleBinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecycleBinRequestBuilder recycleBin() {
        return new RecycleBinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unlock method.
     * @return a {@link UnlockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnlockRequestBuilder unlock() {
        return new UnlockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FileStorageContainerItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FileStorageContainerItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link FileStorageContainerItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FileStorageContainerItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property containers for storage
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property containers for storage
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
     * The collection of active fileStorageContainer resources.
     * @return a {@link FileStorageContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public FileStorageContainer get() {
        return get(null);
    }
    /**
     * The collection of active fileStorageContainer resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FileStorageContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public FileStorageContainer get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, FileStorageContainer::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property containers in storage
     * @param body The request body
     * @return a {@link FileStorageContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public FileStorageContainer patch(@jakarta.annotation.Nonnull final FileStorageContainer body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property containers in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FileStorageContainer}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public FileStorageContainer patch(@jakarta.annotation.Nonnull final FileStorageContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, FileStorageContainer::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property containers for storage
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property containers for storage
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
     * The collection of active fileStorageContainer resources.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of active fileStorageContainer resources.
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
     * Update the navigation property containers in storage
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final FileStorageContainer body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property containers in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final FileStorageContainer body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FileStorageContainerItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FileStorageContainerItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FileStorageContainerItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The collection of active fileStorageContainer resources.
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
