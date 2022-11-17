package com.microsoft.graph.deviceappmanagement;

import com.microsoft.graph.deviceappmanagement.androidmanagedappprotections.AndroidManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.androidmanagedappprotections.item.AndroidManagedAppProtectionItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.defaultmanagedappprotections.DefaultManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.defaultmanagedappprotections.item.DefaultManagedAppProtectionItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.iosmanagedappprotections.IosManagedAppProtectionsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.iosmanagedappprotections.item.IosManagedAppProtectionItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedapppolicies.item.ManagedAppPolicyItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedapppolicies.ManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappstatuses.item.ManagedAppStatusItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedappstatuses.ManagedAppStatusesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedebooks.item.ManagedEBookItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.managedebooks.ManagedEBooksRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.item.MdmWindowsInformationProtectionPolicyItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mdmwindowsinformationprotectionpolicies.MdmWindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappcategories.item.MobileAppCategoryItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappcategories.MobileAppCategoriesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.item.ManagedDeviceMobileAppConfigurationItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileappconfigurations.MobileAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.MobileAppItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.MobileAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.syncmicrosoftstoreforbusinessapps.SyncMicrosoftStoreForBusinessAppsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.item.TargetedManagedAppConfigurationItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.TargetedManagedAppConfigurationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.vpptokens.item.VppTokenItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.vpptokens.VppTokensRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.item.WindowsInformationProtectionPolicyItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectionpolicies.WindowsInformationProtectionPoliciesRequestBuilder;
import com.microsoft.graph.models.DeviceAppManagement;
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
/** Provides operations to manage the deviceAppManagement singleton. */
public class DeviceAppManagementRequestBuilder {
    /** Provides operations to manage the androidManagedAppProtections property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public AndroidManagedAppProtectionsRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the defaultManagedAppProtections property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public DefaultManagedAppProtectionsRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the iosManagedAppProtections property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public IosManagedAppProtectionsRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedAppPolicies property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public ManagedAppPoliciesRequestBuilder managedAppPolicies() {
        return new ManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedAppRegistrations property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedAppStatuses property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public ManagedAppStatusesRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedEBooks property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public ManagedEBooksRequestBuilder managedEBooks() {
        return new ManagedEBooksRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mdmWindowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public MdmWindowsInformationProtectionPoliciesRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileAppCategories property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public MobileAppCategoriesRequestBuilder mobileAppCategories() {
        return new MobileAppCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public MobileAppConfigurationsRequestBuilder mobileAppConfigurations() {
        return new MobileAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public MobileAppsRequestBuilder mobileApps() {
        return new MobileAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the syncMicrosoftStoreForBusinessApps method. */
    @javax.annotation.Nonnull
    public SyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new SyncMicrosoftStoreForBusinessAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the targetedManagedAppConfigurations property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public TargetedManagedAppConfigurationsRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the vppTokens property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public VppTokensRequestBuilder vppTokens() {
        return new VppTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the windowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity. */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionPoliciesRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the androidManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a AndroidManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AndroidManagedAppProtectionItemRequestBuilder androidManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("androidManagedAppProtection%2Did", id);
        return new AndroidManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceAppManagement{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceAppManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceAppManagement{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get deviceAppManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the defaultManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a DefaultManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DefaultManagedAppProtectionItemRequestBuilder defaultManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("defaultManagedAppProtection%2Did", id);
        return new DefaultManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get deviceAppManagement
     * @return a CompletableFuture of deviceAppManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceAppManagement>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get deviceAppManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAppManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceAppManagement>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the iosManagedAppProtections property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a IosManagedAppProtectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IosManagedAppProtectionItemRequestBuilder iosManagedAppProtections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("iosManagedAppProtection%2Did", id);
        return new IosManagedAppProtectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a ManagedAppPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppPolicyItemRequestBuilder managedAppPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppPolicy%2Did", id);
        return new ManagedAppPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a ManagedAppRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationItemRequestBuilder managedAppRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppRegistration%2Did", id);
        return new ManagedAppRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppStatuses property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a ManagedAppStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppStatusItemRequestBuilder managedAppStatuses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppStatus%2Did", id);
        return new ManagedAppStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedEBooks property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a ManagedEBookItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedEBookItemRequestBuilder managedEBooks(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedEBook%2Did", id);
        return new ManagedEBookItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the mdmWindowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a MdmWindowsInformationProtectionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MdmWindowsInformationProtectionPolicyItemRequestBuilder mdmWindowsInformationProtectionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mdmWindowsInformationProtectionPolicy%2Did", id);
        return new MdmWindowsInformationProtectionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppCategories property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a MobileAppCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppCategoryItemRequestBuilder mobileAppCategories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileAppCategory%2Did", id);
        return new MobileAppCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceMobileAppConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceMobileAppConfigurationItemRequestBuilder mobileAppConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDeviceMobileAppConfiguration%2Did", id);
        return new ManagedDeviceMobileAppConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a MobileAppItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppItemRequestBuilder mobileApps(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileApp%2Did", id);
        return new MobileAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @return a CompletableFuture of deviceAppManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@javax.annotation.Nonnull final DeviceAppManagement body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceAppManagement>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update deviceAppManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAppManagement
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patch(@javax.annotation.Nonnull final DeviceAppManagement body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceAppManagement::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceAppManagement>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the targetedManagedAppConfigurations property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a TargetedManagedAppConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TargetedManagedAppConfigurationItemRequestBuilder targetedManagedAppConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("targetedManagedAppConfiguration%2Did", id);
        return new TargetedManagedAppConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the vppTokens property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a VppTokenItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public VppTokenItemRequestBuilder vppTokens(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("vppToken%2Did", id);
        return new VppTokenItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionPolicies property of the microsoft.graph.deviceAppManagement entity.
     * @param id Unique identifier of the item
     * @return a WindowsInformationProtectionPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionPolicyItemRequestBuilder windowsInformationProtectionPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionPolicy%2Did", id);
        return new WindowsInformationProtectionPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get deviceAppManagement */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
