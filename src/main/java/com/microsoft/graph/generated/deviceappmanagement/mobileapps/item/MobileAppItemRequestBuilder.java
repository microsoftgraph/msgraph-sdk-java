package com.microsoft.graph.deviceappmanagement.mobileapps.item;

import com.microsoft.graph.deviceappmanagement.mobileapps.item.assign.AssignRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.categories.CategoriesRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphandroidlobapp.GraphAndroidLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphandroidstoreapp.GraphAndroidStoreAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphioslobapp.GraphIosLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphiosstoreapp.GraphIosStoreAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphiosvppapp.GraphIosVppAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmacosdmgapp.GraphMacOSDmgAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmacoslobapp.GraphMacOSLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmanagedandroidlobapp.GraphManagedAndroidLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmanagedioslobapp.GraphManagedIOSLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmanagedmobilelobapp.GraphManagedMobileLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphmicrosoftstoreforbusinessapp.GraphMicrosoftStoreForBusinessAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphwin32lobapp.GraphWin32LobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphwindowsappx.GraphWindowsAppXRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphwindowsmobilemsi.GraphWindowsMobileMSIRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphwindowsuniversalappx.GraphWindowsUniversalAppXRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphwindowswebapp.GraphWindowsWebAppRequestBuilder;
import com.microsoft.graph.models.MobileApp;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.mobileApp entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.mobileApp entity.
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidLobAppRequestBuilder graphAndroidLobApp() {
        return new GraphAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidStoreApp.
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidStoreAppRequestBuilder graphAndroidStoreApp() {
        return new GraphAndroidStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphIosLobAppRequestBuilder graphIosLobApp() {
        return new GraphIosLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosStoreApp.
     */
    @jakarta.annotation.Nonnull
    public GraphIosStoreAppRequestBuilder graphIosStoreApp() {
        return new GraphIosStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosVppApp.
     */
    @jakarta.annotation.Nonnull
    public GraphIosVppAppRequestBuilder graphIosVppApp() {
        return new GraphIosVppAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSDmgApp.
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSDmgAppRequestBuilder graphMacOSDmgApp() {
        return new GraphMacOSDmgAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSLobAppRequestBuilder graphMacOSLobApp() {
        return new GraphMacOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedAndroidLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphManagedAndroidLobAppRequestBuilder graphManagedAndroidLobApp() {
        return new GraphManagedAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedIOSLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphManagedIOSLobAppRequestBuilder graphManagedIOSLobApp() {
        return new GraphManagedIOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedMobileLobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphManagedMobileLobAppRequestBuilder graphManagedMobileLobApp() {
        return new GraphManagedMobileLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to microsoftStoreForBusinessApp.
     */
    @jakarta.annotation.Nonnull
    public GraphMicrosoftStoreForBusinessAppRequestBuilder graphMicrosoftStoreForBusinessApp() {
        return new GraphMicrosoftStoreForBusinessAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to win32LobApp.
     */
    @jakarta.annotation.Nonnull
    public GraphWin32LobAppRequestBuilder graphWin32LobApp() {
        return new GraphWin32LobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsAppX.
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsAppXRequestBuilder graphWindowsAppX() {
        return new GraphWindowsAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsMobileMSI.
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsMobileMSIRequestBuilder graphWindowsMobileMSI() {
        return new GraphWindowsMobileMSIRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsUniversalAppX.
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsUniversalAppXRequestBuilder graphWindowsUniversalAppX() {
        return new GraphWindowsUniversalAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsWebApp.
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsWebAppRequestBuilder graphWindowsWebApp() {
        return new GraphWindowsWebAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MobileAppItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MobileAppItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a windowsMobileMSI.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-windowsmobilemsi-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes a windowsMobileMSI.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-windowsmobilemsi-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read properties and relationships of the windowsAppX object.
     * @return a MobileApp
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-windowsappx-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp get() {
        return get(null);
    }
    /**
     * Read properties and relationships of the windowsAppX object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MobileApp
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-windowsappx-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileApp::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a win32LobApp object.
     * @param body The request body
     * @return a MobileApp
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-win32lobapp-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp patch(@jakarta.annotation.Nonnull final MobileApp body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a win32LobApp object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MobileApp
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-win32lobapp-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp patch(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileApp::createFromDiscriminatorValue);
    }
    /**
     * Deletes a windowsMobileMSI.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a windowsMobileMSI.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read properties and relationships of the windowsAppX object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read properties and relationships of the windowsAppX object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a win32LobApp object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MobileApp body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a win32LobApp object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a MobileAppItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MobileAppItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MobileAppItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read properties and relationships of the windowsAppX object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
