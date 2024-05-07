package com.microsoft.graph.identity.b2xuserflows.item.apiconnectorconfiguration;

import com.microsoft.graph.identity.b2xuserflows.item.apiconnectorconfiguration.postattributecollection.PostAttributeCollectionRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.apiconnectorconfiguration.postfederationsignup.PostFederationSignupRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserFlowApiConnectorConfiguration;
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
 * Builds and executes requests for operations under /identity/b2xUserFlows/{b2xIdentityUserFlow-id}/apiConnectorConfiguration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiConnectorConfigurationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the postAttributeCollection property of the microsoft.graph.userFlowApiConnectorConfiguration entity.
     * @return a {@link PostAttributeCollectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostAttributeCollectionRequestBuilder postAttributeCollection() {
        return new PostAttributeCollectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the postFederationSignup property of the microsoft.graph.userFlowApiConnectorConfiguration entity.
     * @return a {@link PostFederationSignupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostFederationSignupRequestBuilder postFederationSignup() {
        return new PostFederationSignupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ApiConnectorConfigurationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiConnectorConfigurationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/apiConnectorConfiguration{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ApiConnectorConfigurationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiConnectorConfigurationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/apiConnectorConfiguration{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get the apiConnectorConfiguration property in a b2xIdentityUserFlow to detail the API connectors enabled for the user flow.
     * @return a {@link UserFlowApiConnectorConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-get-apiconnectorconfiguration?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UserFlowApiConnectorConfiguration get() {
        return get(null);
    }
    /**
     * Get the apiConnectorConfiguration property in a b2xIdentityUserFlow to detail the API connectors enabled for the user flow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserFlowApiConnectorConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-get-apiconnectorconfiguration?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public UserFlowApiConnectorConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserFlowApiConnectorConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Get the apiConnectorConfiguration property in a b2xIdentityUserFlow to detail the API connectors enabled for the user flow.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the apiConnectorConfiguration property in a b2xIdentityUserFlow to detail the API connectors enabled for the user flow.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ApiConnectorConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApiConnectorConfigurationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApiConnectorConfigurationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the apiConnectorConfiguration property in a b2xIdentityUserFlow to detail the API connectors enabled for the user flow.
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
}
