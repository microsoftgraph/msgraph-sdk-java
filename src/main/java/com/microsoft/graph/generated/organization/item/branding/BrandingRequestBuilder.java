package com.microsoft.graph.organization.item.branding;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OrganizationalBranding;
import com.microsoft.graph.organization.item.branding.backgroundimage.BackgroundImageRequestBuilder;
import com.microsoft.graph.organization.item.branding.bannerlogo.BannerLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.customcss.CustomCSSRequestBuilder;
import com.microsoft.graph.organization.item.branding.favicon.FaviconRequestBuilder;
import com.microsoft.graph.organization.item.branding.headerlogo.HeaderLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.localizations.LocalizationsRequestBuilder;
import com.microsoft.graph.organization.item.branding.squarelogo.SquareLogoRequestBuilder;
import com.microsoft.graph.organization.item.branding.squarelogodark.SquareLogoDarkRequestBuilder;
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
 * Provides operations to manage the branding property of the microsoft.graph.organization entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrandingRequestBuilder extends BaseRequestBuilder {
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
     * Provides operations to manage the localizations property of the microsoft.graph.organizationalBranding entity.
     * @return a {@link LocalizationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LocalizationsRequestBuilder localizations() {
        return new LocalizationsRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link BrandingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BrandingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link BrandingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BrandingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/branding{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete the default organizational branding object. To delete the organizationalBranding object, all images (Stream types) must first be removed from the object.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete the default organizational branding object. To delete the organizationalBranding object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the default organizational branding object, if the Accept-Language header is set to 0 or default. If no default organizational branding object exists, this method returns a 404 Not Found error. If the Accept-Language header is set to an existing locale identified by the value of its id, this method retrieves the branding for the specified locale. This method retrieves only non-Stream properties, for example, usernameHintText and signInPageText. To retrieve Stream types of the default branding, for example, bannerLogo and backgroundImage, use the GET organizationalBrandingLocalization method.
     * @return a {@link OrganizationalBranding}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBranding get() {
        return get(null);
    }
    /**
     * Retrieve the default organizational branding object, if the Accept-Language header is set to 0 or default. If no default organizational branding object exists, this method returns a 404 Not Found error. If the Accept-Language header is set to an existing locale identified by the value of its id, this method retrieves the branding for the specified locale. This method retrieves only non-Stream properties, for example, usernameHintText and signInPageText. To retrieve Stream types of the default branding, for example, bannerLogo and backgroundImage, use the GET organizationalBrandingLocalization method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationalBranding}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBranding get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationalBranding::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of the default branding object specified by the organizationalBranding resource.
     * @param body The request body
     * @return a {@link OrganizationalBranding}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBranding patch(@jakarta.annotation.Nonnull final OrganizationalBranding body) {
        return patch(body, null);
    }
    /**
     * Update the properties of the default branding object specified by the organizationalBranding resource.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationalBranding}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/organizationalbranding-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OrganizationalBranding patch(@jakarta.annotation.Nonnull final OrganizationalBranding body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationalBranding::createFromDiscriminatorValue);
    }
    /**
     * Delete the default organizational branding object. To delete the organizationalBranding object, all images (Stream types) must first be removed from the object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete the default organizational branding object. To delete the organizationalBranding object, all images (Stream types) must first be removed from the object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/organization/{organization%2Did}/branding", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the default organizational branding object, if the Accept-Language header is set to 0 or default. If no default organizational branding object exists, this method returns a 404 Not Found error. If the Accept-Language header is set to an existing locale identified by the value of its id, this method retrieves the branding for the specified locale. This method retrieves only non-Stream properties, for example, usernameHintText and signInPageText. To retrieve Stream types of the default branding, for example, bannerLogo and backgroundImage, use the GET organizationalBrandingLocalization method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the default organizational branding object, if the Accept-Language header is set to 0 or default. If no default organizational branding object exists, this method returns a 404 Not Found error. If the Accept-Language header is set to an existing locale identified by the value of its id, this method retrieves the branding for the specified locale. This method retrieves only non-Stream properties, for example, usernameHintText and signInPageText. To retrieve Stream types of the default branding, for example, bannerLogo and backgroundImage, use the GET organizationalBrandingLocalization method.
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
     * Update the properties of the default branding object specified by the organizationalBranding resource.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationalBranding body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of the default branding object specified by the organizationalBranding resource.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OrganizationalBranding body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/organization/{organization%2Did}/branding", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BrandingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BrandingRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BrandingRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the default organizational branding object, if the Accept-Language header is set to 0 or default. If no default organizational branding object exists, this method returns a 404 Not Found error. If the Accept-Language header is set to an existing locale identified by the value of its id, this method retrieves the branding for the specified locale. This method retrieves only non-Stream properties, for example, usernameHintText and signInPageText. To retrieve Stream types of the default branding, for example, bannerLogo and backgroundImage, use the GET organizationalBrandingLocalization method.
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
