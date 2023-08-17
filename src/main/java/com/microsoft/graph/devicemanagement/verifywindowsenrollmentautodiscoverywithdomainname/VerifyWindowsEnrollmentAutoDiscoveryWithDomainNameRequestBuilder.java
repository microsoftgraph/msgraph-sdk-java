package com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the verifyWindowsEnrollmentAutoDiscovery method.
 */
public class VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder and sets the default values.
     * @param domainName Usage: domainName='{domainName}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String domainName) {
        super(requestAdapter, "{+baseurl}/deviceManagement/verifyWindowsEnrollmentAutoDiscovery(domainName='{domainName}')", pathParameters);
        this.pathParameters.put("domainName", domainName);
    }
    /**
     * Instantiates a new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/verifyWindowsEnrollmentAutoDiscovery(domainName='{domainName}')", rawUrl);
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @return a CompletableFuture of verifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> get() {
        return get(null);
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of verifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
