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
 * Provides operations to manage the localizations property of the microsoft.graph.organizationalBranding entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationalBrandingLocalizationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link BackgroundImageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BackgroundImageRequestBuilder backgroundImage() {
        return new BackgroundImageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link BannerLogoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BannerLogoRequestBuilder bannerLogo() {
        return new BannerLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link CustomCSSRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomCSSRequestBuilder customCSS() {
        return new CustomCSSRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link FaviconRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FaviconRequestBuilder favicon() {
        return new FaviconRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link HeaderLogoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HeaderLogoRequestBuilder headerLogo() {
        return new HeaderLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link SquareLogoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SquareLogoRequestBuilder squareLogo() {
        return new SquareLogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the organization entity.
     * @return a {@link SquareLogoDarkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SquareLogoDarkRequestBuilder squareLogoDark() {
        return new SquareLogoDarkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrganizationalBrandingLocalizationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationalBrandingLocalizationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrganizationalBrandingLocalizationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationalBrandingLocalizationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of id in the URL.
     * @return a {@link OrganizationalBrandingLocalization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBrandingLocalization get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of id in the URL.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationalBrandingLocalization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBrandingLocalization get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationalBrandingLocalization::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @return a {@link OrganizationalBrandingLocalization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBrandingLocalization patch(@jakarta.annotation.Nonnull final OrganizationalBrandingLocalization body) {
        return patch(body, null);
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationalBrandingLocalization}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbrandinglocalization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBrandingLocalization patch(@jakarta.annotation.Nonnull final OrganizationalBrandingLocalization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationalBrandingLocalization::createFromDiscriminatorValue);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a localized branding object. To delete the organizationalBrandingLocalization object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of id in the URL.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of id in the URL.
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
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationalBrandingLocalization body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of an organizationalBrandingLocalization object for a specific localization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationalBrandingLocalization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/organization/{organization%2Did}/branding/localizations/{organizationalBrandingLocalization%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link OrganizationalBrandingLocalizationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationalBrandingLocalizationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrganizationalBrandingLocalizationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of an organizationalBrandingLocalization object. To retrieve a localization branding object, specify the value of id in the URL.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
