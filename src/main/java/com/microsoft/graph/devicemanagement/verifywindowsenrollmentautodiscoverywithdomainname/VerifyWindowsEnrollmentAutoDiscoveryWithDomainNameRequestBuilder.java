package com.microsoft.graph.devicemanagement.verifywindowsenrollmentautodiscoverywithdomainname;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
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
/** Provides operations to call the verifyWindowsEnrollmentAutoDiscovery method. */
public class VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder and sets the default values.
     * @param domainName Usage: domainName='{domainName}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final String domainName) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/microsoft.graph.verifyWindowsEnrollmentAutoDiscovery(domainName='{domainName}')";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        urlTplParams.put("domainName", domainName);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/microsoft.graph.verifyWindowsEnrollmentAutoDiscovery(domainName='{domainName}')";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @return a CompletableFuture of verifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> executionException = new java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function verifyWindowsEnrollmentAutoDiscovery
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of verifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse> executionException = new java.util.concurrent.CompletableFuture<VerifyWindowsEnrollmentAutoDiscoveryWithDomainNameResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
}
