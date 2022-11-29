package com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item;

import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.assignments.item.ManagedDeviceMobileAppConfigurationAssignmentItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatuses.item.ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.devicestatussummary.DeviceStatusSummaryRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.userstatuses.item.ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.userstatussummary.UserStatusSummaryRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfiguration;
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
/** Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity. */
public class ManagedDeviceMobileAppConfigurationItemRequestBuilder {
    /** Provides operations to call the assign method. */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the assignments property of the microsoft.graph.managedDeviceMobileAppConfiguration entity. */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity. */
    @javax.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceStatusSummary property of the microsoft.graph.managedDeviceMobileAppConfiguration entity. */
    @javax.annotation.Nonnull
    public DeviceStatusSummaryRequestBuilder deviceStatusSummary() {
        return new DeviceStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the userStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity. */
    @javax.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userStatusSummary property of the microsoft.graph.managedDeviceMobileAppConfiguration entity. */
    @javax.annotation.Nonnull
    public UserStatusSummaryRequestBuilder userStatusSummary() {
        return new UserStatusSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationAssignment%2Did", id);
        return new ManagedDeviceMobileAppConfigurationAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfiguration%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property mobileAppConfigurations for deviceAppManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property mobileAppConfigurations for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration requestConfig = new ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The Managed Device Mobile Application Configurations.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The Managed Device Mobile Application Configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration requestConfig = new ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property mobileAppConfigurations in deviceAppManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property mobileAppConfigurations in deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration requestConfig = new ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property mobileAppConfigurations for deviceAppManagement
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
     * Delete navigation property mobileAppConfigurations for deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder deviceStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationDeviceStatus%2Did", id);
        return new ManagedDeviceMobileAppConfigurationDeviceStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The Managed Device Mobile Application Configurations.
     * @return a CompletableFuture of managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The Managed Device Mobile Application Configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> get(@javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property mobileAppConfigurations in deviceAppManagement
     * @param body 
     * @return a CompletableFuture of managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> patch(@javax.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property mobileAppConfigurations in deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> patch(@javax.annotation.Nonnull final ManagedDeviceMobileAppConfiguration body, @javax.annotation.Nullable final java.util.function.Consumer<ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.managedDeviceMobileAppConfiguration entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder userStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfigurationUserStatus%2Did", id);
        return new ManagedDeviceMobileAppConfigurationUserStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedDeviceMobileAppConfigurationItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The Managed Device Mobile Application Configurations. */
    public class ManagedDeviceMobileAppConfigurationItemRequestBuilderGetQueryParameters {
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
    public class ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ManagedDeviceMobileAppConfigurationItemRequestBuilderGetQueryParameters queryParameters = new ManagedDeviceMobileAppConfigurationItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedDeviceMobileAppConfigurationItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ManagedDeviceMobileAppConfigurationItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
