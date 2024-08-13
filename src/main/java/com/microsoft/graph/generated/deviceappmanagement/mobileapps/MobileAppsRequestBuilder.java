package com.microsoft.graph.deviceappmanagement.mobileapps;

import com.microsoft.graph.deviceappmanagement.mobileapps.count.CountRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphandroidlobapp.GraphAndroidLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphandroidstoreapp.GraphAndroidStoreAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphioslobapp.GraphIosLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphiosstoreapp.GraphIosStoreAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphiosvppapp.GraphIosVppAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmacosdmgapp.GraphMacOSDmgAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmacoslobapp.GraphMacOSLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmanagedandroidlobapp.GraphManagedAndroidLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmanagedioslobapp.GraphManagedIOSLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmanagedmobilelobapp.GraphManagedMobileLobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphmicrosoftstoreforbusinessapp.GraphMicrosoftStoreForBusinessAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphwin32lobapp.GraphWin32LobAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphwindowsappx.GraphWindowsAppXRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphwindowsmobilemsi.GraphWindowsMobileMSIRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphwindowsuniversalappx.GraphWindowsUniversalAppXRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.graphwindowswebapp.GraphWindowsWebAppRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.MobileAppItemRequestBuilder;
import com.microsoft.graph.models.MobileApp;
import com.microsoft.graph.models.MobileAppCollectionResponse;
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
 * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidLobApp.
     * @return a {@link GraphAndroidLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidLobAppRequestBuilder graphAndroidLobApp() {
        return new GraphAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to androidStoreApp.
     * @return a {@link GraphAndroidStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidStoreAppRequestBuilder graphAndroidStoreApp() {
        return new GraphAndroidStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosLobApp.
     * @return a {@link GraphIosLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosLobAppRequestBuilder graphIosLobApp() {
        return new GraphIosLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosStoreApp.
     * @return a {@link GraphIosStoreAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosStoreAppRequestBuilder graphIosStoreApp() {
        return new GraphIosStoreAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to iosVppApp.
     * @return a {@link GraphIosVppAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphIosVppAppRequestBuilder graphIosVppApp() {
        return new GraphIosVppAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSDmgApp.
     * @return a {@link GraphMacOSDmgAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSDmgAppRequestBuilder graphMacOSDmgApp() {
        return new GraphMacOSDmgAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to macOSLobApp.
     * @return a {@link GraphMacOSLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMacOSLobAppRequestBuilder graphMacOSLobApp() {
        return new GraphMacOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedAndroidLobApp.
     * @return a {@link GraphManagedAndroidLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedAndroidLobAppRequestBuilder graphManagedAndroidLobApp() {
        return new GraphManagedAndroidLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedIOSLobApp.
     * @return a {@link GraphManagedIOSLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedIOSLobAppRequestBuilder graphManagedIOSLobApp() {
        return new GraphManagedIOSLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to managedMobileLobApp.
     * @return a {@link GraphManagedMobileLobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphManagedMobileLobAppRequestBuilder graphManagedMobileLobApp() {
        return new GraphManagedMobileLobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to microsoftStoreForBusinessApp.
     * @return a {@link GraphMicrosoftStoreForBusinessAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphMicrosoftStoreForBusinessAppRequestBuilder graphMicrosoftStoreForBusinessApp() {
        return new GraphMicrosoftStoreForBusinessAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to win32LobApp.
     * @return a {@link GraphWin32LobAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWin32LobAppRequestBuilder graphWin32LobApp() {
        return new GraphWin32LobAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsAppX.
     * @return a {@link GraphWindowsAppXRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsAppXRequestBuilder graphWindowsAppX() {
        return new GraphWindowsAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsMobileMSI.
     * @return a {@link GraphWindowsMobileMSIRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsMobileMSIRequestBuilder graphWindowsMobileMSI() {
        return new GraphWindowsMobileMSIRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsUniversalAppX.
     * @return a {@link GraphWindowsUniversalAppXRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsUniversalAppXRequestBuilder graphWindowsUniversalAppX() {
        return new GraphWindowsUniversalAppXRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to windowsWebApp.
     * @return a {@link GraphWindowsWebAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWindowsWebAppRequestBuilder graphWindowsWebApp() {
        return new GraphWindowsWebAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileApps property of the microsoft.graph.deviceAppManagement entity.
     * @param mobileAppId The unique identifier of mobileApp
     * @return a {@link MobileAppItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppItemRequestBuilder byMobileAppId(@jakarta.annotation.Nonnull final String mobileAppId) {
        Objects.requireNonNull(mobileAppId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileApp%2Did", mobileAppId);
        return new MobileAppItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MobileAppsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link MobileAppsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileAppsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List properties and relationships of the managedApp objects.
     * @return a {@link MobileAppCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-managedapp-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileAppCollectionResponse get() {
        return get(null);
    }
    /**
     * List properties and relationships of the managedApp objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MobileAppCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-managedapp-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileAppCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileAppCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new managedAndroidLobApp object.
     * @param body The request body
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-managedandroidlobapp-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp post(@jakarta.annotation.Nonnull final MobileApp body) {
        return post(body, null);
    }
    /**
     * Create a new managedAndroidLobApp object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MobileApp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/intune-apps-managedandroidlobapp-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileApp post(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileApp::createFromDiscriminatorValue);
    }
    /**
     * List properties and relationships of the managedApp objects.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List properties and relationships of the managedApp objects.
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
     * Create a new managedAndroidLobApp object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MobileApp body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new managedAndroidLobApp object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MobileApp body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MobileAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MobileAppsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List properties and relationships of the managedApp objects.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
