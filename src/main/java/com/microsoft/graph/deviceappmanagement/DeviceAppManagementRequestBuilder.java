package com.microsoft.graph.deviceappmanagement;

import com.microsoft.graph.deviceappmanagement.androidmanagedappprotections.AndroidManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.defaultmanagedappprotections.DefaultManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.iosmanagedappprotections.IosManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedapppolicies.ManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappstatuses.ManagedAppStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedebooks.ManagedEBooksRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.MdmWindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappcategories.MobileAppCategoriesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.MobileAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.MobileAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.syncmicrosoftstoreforbusinessapps.SyncMicrosoftStoreForBusinessAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.TargetedManagedAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.vpptokens.VppTokensRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.WindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.models.DeviceAppManagement;
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
 * Provides operations to manage the deviceAppManagement singleton.
 */
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the androidManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public AndroidManagedAppProtectionsRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public DefaultManagedAppProtectionsRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the iosManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public IosManagedAppProtectionsRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public ManagedAppPoliciesRequestBuilder managedAppPolicies() {
        return new ManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppStatuses property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public ManagedAppStatusesRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedEBooks property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public ManagedEBooksRequestBuilder managedEBooks() {
        return new ManagedEBooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mdmWindowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public MdmWindowsInformationProtectionPoliciesRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppCategories property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public MobileAppCategoriesRequestBuilder mobileAppCategories() {
        return new MobileAppCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public MobileAppConfigurationsRequestBuilder mobileAppConfigurations() {
        return new MobileAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public MobileAppsRequestBuilder mobileApps() {
        return new MobileAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncMicrosoftStoreForBusinessApps method.
     */
    @javax.annotation.Nonnull
    public SyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new SyncMicrosoftStoreForBusinessAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the targetedManagedAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public TargetedManagedAppConfigurationsRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the vppTokens property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public VppTokensRequestBuilder vppTokens() {
        return new VppTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionPoliciesRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24select,%24expand}", rawUrl);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @return a CompletableFuture of deviceAppManagement
     * @see <a href="https://docs.microsoft.com/graph/api/intune-policyset-deviceappmanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAppManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceAppManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAppManagement
     * @see <a href="https://docs.microsoft.com/graph/api/intune-policyset-deviceappmanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAppManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceAppManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @return a CompletableFuture of deviceAppManagement
     * @see <a href="https://docs.microsoft.com/graph/api/intune-partnerintegration-deviceappmanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@javax.annotation.Nonnull final DeviceAppManagement body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAppManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceAppManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAppManagement
     * @see <a href="https://docs.microsoft.com/graph/api/intune-partnerintegration-deviceappmanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAppManagement> executionException = new java.util.concurrent.CompletableFuture<DeviceAppManagement>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
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
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Read properties and relationships of the deviceAppManagement object.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
