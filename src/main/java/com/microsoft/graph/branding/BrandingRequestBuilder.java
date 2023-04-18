package com.microsoft.graph.branding;

import com.microsoft.graph.branding.backgroundimage.BackgroundImageRequestBuilder;
import com.microsoft.graph.branding.bannerlogo.BannerLogoRequestBuilder;
import com.microsoft.graph.branding.localizations.LocalizationsRequestBuilder;
import com.microsoft.graph.branding.squarelogo.SquareLogoRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OrganizationalBranding;
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
 * Provides operations to manage the organizationalBranding singleton.
 */
public class BrandingRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the media for the organizationalBranding entity. */
    @javax.annotation.Nonnull
    public BackgroundImageRequestBuilder backgroundImage() {
        return new BackgroundImageRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organizationalBranding entity. */
    @javax.annotation.Nonnull
    public BannerLogoRequestBuilder bannerLogo() {
        return new BannerLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the localizations property of the microsoft.graph.organizationalBranding entity. */
    @javax.annotation.Nonnull
    public LocalizationsRequestBuilder localizations() {
        return new LocalizationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organizationalBranding entity. */
    @javax.annotation.Nonnull
    public SquareLogoRequestBuilder squareLogo() {
        return new SquareLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new BrandingRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrandingRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/branding{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new BrandingRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrandingRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/branding{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get branding
     * @return a CompletableFuture of organizationalBranding
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBranding> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBranding::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBranding> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBranding>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get branding
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of organizationalBranding
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBranding> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBranding::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBranding> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBranding>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update branding
     * @param body The request body
     * @return a CompletableFuture of organizationalBranding
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBranding> patch(@javax.annotation.Nonnull final OrganizationalBranding body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBranding::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBranding> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBranding>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update branding
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of organizationalBranding
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBranding> patch(@javax.annotation.Nonnull final OrganizationalBranding body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBranding::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBranding> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBranding>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get branding
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get branding
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
     * Update branding
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationalBranding body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update branding
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationalBranding body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get branding
     */
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
