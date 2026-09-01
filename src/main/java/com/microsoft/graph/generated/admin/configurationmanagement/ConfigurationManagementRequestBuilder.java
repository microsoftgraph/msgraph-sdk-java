package com.microsoft.graph.admin.configurationmanagement;

import com.microsoft.graph.admin.configurationmanagement.configurationdrifts.ConfigurationDriftsRequestBuilder;
import com.microsoft.graph.admin.configurationmanagement.configurationmonitoringresults.ConfigurationMonitoringResultsRequestBuilder;
import com.microsoft.graph.admin.configurationmanagement.configurationmonitors.ConfigurationMonitorsRequestBuilder;
import com.microsoft.graph.admin.configurationmanagement.configurationsnapshotjobs.ConfigurationSnapshotJobsRequestBuilder;
import com.microsoft.graph.admin.configurationmanagement.configurationsnapshots.ConfigurationSnapshotsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /admin/configurationManagement
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the configurationDrifts property of the microsoft.graph.configurationManagement entity.
     * @return a {@link ConfigurationDriftsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationDriftsRequestBuilder configurationDrifts() {
        return new ConfigurationDriftsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configurationMonitoringResults property of the microsoft.graph.configurationManagement entity.
     * @return a {@link ConfigurationMonitoringResultsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationMonitoringResultsRequestBuilder configurationMonitoringResults() {
        return new ConfigurationMonitoringResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configurationMonitors property of the microsoft.graph.configurationManagement entity.
     * @return a {@link ConfigurationMonitorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationMonitorsRequestBuilder configurationMonitors() {
        return new ConfigurationMonitorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configurationSnapshotJobs property of the microsoft.graph.configurationManagement entity.
     * @return a {@link ConfigurationSnapshotJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationSnapshotJobsRequestBuilder configurationSnapshotJobs() {
        return new ConfigurationSnapshotJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the configurationSnapshots property of the microsoft.graph.configurationManagement entity.
     * @return a {@link ConfigurationSnapshotsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfigurationSnapshotsRequestBuilder configurationSnapshots() {
        return new ConfigurationSnapshotsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConfigurationManagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigurationManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/configurationManagement", pathParameters);
    }
    /**
     * Instantiates a new {@link ConfigurationManagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfigurationManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/configurationManagement", rawUrl);
    }
}
