package com.microsoft.graph.organization.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Organization;
import com.microsoft.graph.organization.item.branding.BrandingRequestBuilder;
import com.microsoft.graph.organization.item.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.organization.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.organization.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.organization.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.organization.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.organization.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.organization.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.organization.item.setmobiledevicemanagementauthority.SetMobileDeviceManagementAuthorityRequestBuilder;
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
 * Provides operations to manage the collection of organization entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the branding property of the microsoft.graph.organization entity.
     */
    @jakarta.annotation.Nonnull
    public BrandingRequestBuilder branding() {
        return new BrandingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the certificateBasedAuthConfiguration property of the microsoft.graph.organization entity.
     */
    @jakarta.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.organization entity.
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setMobileDeviceManagementAuthority method.
     */
    @jakarta.annotation.Nonnull
    public SetMobileDeviceManagementAuthorityRequestBuilder setMobileDeviceManagementAuthority() {
        return new SetMobileDeviceManagementAuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OrganizationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OrganizationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from organization
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete entity from organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get the properties and relationships of the currently authenticated organization. Since the organization resource supports extensions, you can also use the GET operation to get custom properties and extension data in an organization instance. This API is available in the following national cloud deployments.
     * @return a Organization
     * @see <a href="https://learn.microsoft.com/graph/api/organization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Organization get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of the currently authenticated organization. Since the organization resource supports extensions, you can also use the GET operation to get custom properties and extension data in an organization instance. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     * @see <a href="https://learn.microsoft.com/graph/api/organization-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Organization get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Organization::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of the currently authenticated organization. In this case, organization is defined as a collection of exactly one record, and so its ID must be specified in the request.  The ID is also known as the tenantId of the organization. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a Organization
     * @see <a href="https://learn.microsoft.com/graph/api/organization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final Organization body) {
        return patch(body, null);
    }
    /**
     * Update the properties of the currently authenticated organization. In this case, organization is defined as a collection of exactly one record, and so its ID must be specified in the request.  The ID is also known as the tenantId of the organization. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     * @see <a href="https://learn.microsoft.com/graph/api/organization-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final Organization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Organization::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete entity from organization
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get the properties and relationships of the currently authenticated organization. Since the organization resource supports extensions, you can also use the GET operation to get custom properties and extension data in an organization instance. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of the currently authenticated organization. Since the organization resource supports extensions, you can also use the GET operation to get custom properties and extension data in an organization instance. This API is available in the following national cloud deployments.
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
     * Update the properties of the currently authenticated organization. In this case, organization is defined as a collection of exactly one record, and so its ID must be specified in the request.  The ID is also known as the tenantId of the organization. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Organization body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of the currently authenticated organization. In this case, organization is defined as a collection of exactly one record, and so its ID must be specified in the request.  The ID is also known as the tenantId of the organization. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Organization body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a OrganizationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OrganizationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OrganizationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of the currently authenticated organization. Since the organization resource supports extensions, you can also use the GET operation to get custom properties and extension data in an organization instance. This API is available in the following national cloud deployments.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
