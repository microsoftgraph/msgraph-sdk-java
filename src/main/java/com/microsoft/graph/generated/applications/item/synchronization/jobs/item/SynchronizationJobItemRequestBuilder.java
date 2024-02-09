package com.microsoft.graph.applications.item.synchronization.jobs.item;

import com.microsoft.graph.applications.item.synchronization.jobs.item.bulkupload.BulkUploadRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.pause.PauseRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.provisionondemand.ProvisionOnDemandRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.restart.RestartRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.schema.SchemaRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.start.StartRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.validatecredentials.ValidateCredentialsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SynchronizationJob;
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
 * Provides operations to manage the jobs property of the microsoft.graph.synchronization entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationJobItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the bulkUpload property of the microsoft.graph.synchronizationJob entity.
     * @return a {@link BulkUploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUploadRequestBuilder bulkUpload() {
        return new BulkUploadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pause method.
     * @return a {@link PauseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PauseRequestBuilder pause() {
        return new PauseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the provisionOnDemand method.
     * @return a {@link ProvisionOnDemandRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvisionOnDemandRequestBuilder provisionOnDemand() {
        return new ProvisionOnDemandRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restart method.
     * @return a {@link RestartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestartRequestBuilder restart() {
        return new RestartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the schema property of the microsoft.graph.synchronizationJob entity.
     * @return a {@link SchemaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the start method.
     * @return a {@link StartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateCredentials method.
     * @return a {@link ValidateCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidateCredentialsRequestBuilder validateCredentials() {
        return new ValidateCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SynchronizationJobItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationJobItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/jobs/{synchronizationJob%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SynchronizationJobItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationJobItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/jobs/{synchronizationJob%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Stop the synchronization job, and permanently delete all the state associated with it. Synchronized accounts are left as-is.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationjob-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Stop the synchronization job, and permanently delete all the state associated with it. Synchronized accounts are left as-is.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationjob-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the existing synchronization job and its properties.
     * @return a {@link SynchronizationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationjob-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob get() {
        return get(null);
    }
    /**
     * Retrieve the existing synchronization job and its properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SynchronizationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationjob-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationJob::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property jobs in applications
     * @param body The request body
     * @return a {@link SynchronizationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob patch(@jakarta.annotation.Nonnull final SynchronizationJob body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property jobs in applications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SynchronizationJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob patch(@jakarta.annotation.Nonnull final SynchronizationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationJob::createFromDiscriminatorValue);
    }
    /**
     * Stop the synchronization job, and permanently delete all the state associated with it. Synchronized accounts are left as-is.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Stop the synchronization job, and permanently delete all the state associated with it. Synchronized accounts are left as-is.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/applications/{application%2Did}/synchronization/jobs/{synchronizationJob%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the existing synchronization job and its properties.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the existing synchronization job and its properties.
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
     * Update the navigation property jobs in applications
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SynchronizationJob body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property jobs in applications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SynchronizationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/applications/{application%2Did}/synchronization/jobs/{synchronizationJob%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SynchronizationJobItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SynchronizationJobItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SynchronizationJobItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the existing synchronization job and its properties.
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
