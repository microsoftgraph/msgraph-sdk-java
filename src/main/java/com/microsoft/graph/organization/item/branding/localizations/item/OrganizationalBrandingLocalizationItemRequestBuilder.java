package com.microsoft.graph.organization.item.branding.localizations.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OrganizationalBrandingLocalization;
import com.microsoft.graph.organization.item.branding.localizations.item.backgroundimage.BackgroundImageRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.bannerlogo.BannerLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.customcss.CustomCSSRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.favicon.FaviconRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.headerlogo.HeaderLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.squarelogo.SquareLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.item.squarelogodark.SquareLogoDarkRequestBuilder;
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
 * Provides operations to manage the localizations property of the microsoft.graph.organizationalBranding entity.
 */
public class OrganizationalBrandingLocalizationItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public BackgroundImageRequestBuilder backgroundImage() {
        return new BackgroundImageRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public BannerLogoRequestBuilder bannerLogo() {
        return new BannerLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public CustomCSSRequestBuilder customCSS() {
        return new CustomCSSRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public FaviconRequestBuilder favicon() {
        return new FaviconRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public HeaderLogoRequestBuilder headerLogo() {
        return new HeaderLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public SquareLogoRequestBuilder squareLogo() {
        return new SquareLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the organization entity. */
    @javax.annotation.Nonnull
    public SquareLogoDarkRequestBuilder squareLogoDark() {
        return new SquareLogoDarkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OrganizationalBrandingLocalizationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalBrandingLocalizationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OrganizationalBrandingLocalizationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalBrandingLocalizationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @return a CompletableFuture of void
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of **id** in the URL.
     * @return a CompletableFuture of organizationalBrandingLocalization
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBrandingLocalization::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of **id** in the URL.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of organizationalBrandingLocalization
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBrandingLocalization::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @return a CompletableFuture of organizationalBrandingLocalization
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> patch(@javax.annotation.Nonnull final OrganizationalBrandingLocalization body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBrandingLocalization::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of organizationalBrandingLocalization
     * @see <a href="https://docs.microsoft.com/graph/api/organizationalbrandinglocalization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> patch(@javax.annotation.Nonnull final OrganizationalBrandingLocalization body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrganizationalBrandingLocalization::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization> executionException = new java.util.concurrent.CompletableFuture<OrganizationalBrandingLocalization>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of **id** in the URL.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of **id** in the URL.
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
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationalBrandingLocalization body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrganizationalBrandingLocalization body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of **id** in the URL.
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
