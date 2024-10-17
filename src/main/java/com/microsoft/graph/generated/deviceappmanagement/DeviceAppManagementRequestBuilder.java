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
 * Provides operations to manage the deviceAppManagement singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the androidManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link AndroidManagedAppProtectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AndroidManagedAppProtectionsRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link DefaultManagedAppProtectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultManagedAppProtectionsRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the iosManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link IosManagedAppProtectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IosManagedAppProtectionsRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link ManagedAppPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedAppPoliciesRequestBuilder managedAppPolicies() {
        return new ManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link ManagedAppRegistrationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppStatuses property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link ManagedAppStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedAppStatusesRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedEBooks property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link ManagedEBooksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedEBooksRequestBuilder managedEBooks() {
        return new ManagedEBooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mdmWindowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link MdmWindowsInformationProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MdmWindowsInformationProtectionPoliciesRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppCategories property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link MobileAppCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppCategoriesRequestBuilder mobileAppCategories() {
        return new MobileAppCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link MobileAppConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppConfigurationsRequestBuilder mobileAppConfigurations() {
        return new MobileAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link MobileAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppsRequestBuilder mobileApps() {
        return new MobileAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syncMicrosoftStoreForBusinessApps method.
     * @return a {@link SyncMicrosoftStoreForBusinessAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new SyncMicrosoftStoreForBusinessAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the targetedManagedAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link TargetedManagedAppConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TargetedManagedAppConfigurationsRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the vppTokens property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link VppTokensRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VppTokensRequestBuilder vppTokens() {
        return new VppTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @return a {@link WindowsInformationProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionPoliciesRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceAppManagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceAppManagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceAppManagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceAppManagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement{?%24expand,%24select}", rawUrl);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @return a {@link DeviceAppManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-deviceappmanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagement get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceAppManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-deviceappmanagement-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagement get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceAppManagement::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @return a {@link DeviceAppManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-books-deviceappmanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagement patch(@jakarta.annotation.Nonnull final DeviceAppManagement body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceAppManagement}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-books-deviceappmanagement-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeviceAppManagement patch(@jakarta.annotation.Nonnull final DeviceAppManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceAppManagement::createFromDiscriminatorValue);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
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
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceAppManagement body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a deviceAppManagement object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceAppManagement body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeviceAppManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceAppManagementRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read properties and relationships of the deviceAppManagement object.
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
