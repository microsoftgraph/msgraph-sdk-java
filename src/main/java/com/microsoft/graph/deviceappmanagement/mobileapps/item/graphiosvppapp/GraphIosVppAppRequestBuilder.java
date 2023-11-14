package com.microsoft.graph.deviceappmanagement.mobileapps.item.graphiosvppapp;

import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphiosvppapp.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphiosvppapp.categories.CategoriesRequestBuilder;
import com.microsoft.graph.models.IosVppApp;
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
 * Casts the previous resource to iosVppApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphIosVppAppRequestBuilder extends BaseRequestBuilder {
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
     * Instantiates a new GraphIosVppAppRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphIosVppAppRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/graph.iosVppApp{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new GraphIosVppAppRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphIosVppAppRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/graph.iosVppApp{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.iosVppApp
     * @return a IosVppApp
     */
    @jakarta.annotation.Nullable
    public IosVppApp get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.iosVppApp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IosVppApp
     */
    @jakarta.annotation.Nullable
    public IosVppApp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, IosVppApp::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.iosVppApp
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.iosVppApp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GraphIosVppAppRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GraphIosVppAppRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphIosVppAppRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.iosVppApp
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
}
