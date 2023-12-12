package com.microsoft.graph.identitygovernance.entitlementmanagement.assignments.additionalaccesswithaccesspackageidwithincompatibleaccesspackageid;

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
 * Provides operations to call the additionalAccess method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder and sets the default values.
     * @param accessPackageId Usage: accessPackageId='{accessPackageId}'
     * @param incompatibleAccessPackageId Usage: incompatibleAccessPackageId='{incompatibleAccessPackageId}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String accessPackageId, @jakarta.annotation.Nullable final String incompatibleAccessPackageId) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/additionalAccess(accessPackageId='{accessPackageId}',incompatibleAccessPackageId='{incompatibleAccessPackageId}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", pathParameters);
        this.pathParameters.put("accessPackageId", accessPackageId);
        this.pathParameters.put("incompatibleAccessPackageId", incompatibleAccessPackageId);
    }
    /**
     * Instantiates a new AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignments/additionalAccess(accessPackageId='{accessPackageId}',incompatibleAccessPackageId='{incompatibleAccessPackageId}'){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}", rawUrl);
    }
    /**
     * Invoke function additionalAccess
     * @return a AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdGetResponse
     */
    @jakarta.annotation.Nullable
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdGetResponse get() {
        return get(null);
    }
    /**
     * Invoke function additionalAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdGetResponse
     */
    @jakarta.annotation.Nullable
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke function additionalAccess
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function additionalAccess
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdditionalAccessWithAccessPackageIdWithIncompatibleAccessPackageIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Invoke function additionalAccess
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
