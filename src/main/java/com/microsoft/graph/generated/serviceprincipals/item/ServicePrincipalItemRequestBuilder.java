package com.microsoft.graph.serviceprincipals.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.serviceprincipals.item.addkey.AddKeyRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.addpassword.AddPasswordRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.addtokensigningcertificate.AddTokenSigningCertificateRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.appmanagementpolicies.AppManagementPoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.approleassignedto.AppRoleAssignedToRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.claimsmappingpolicies.ClaimsMappingPoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.delegatedpermissionclassifications.DelegatedPermissionClassificationsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.endpoints.EndpointsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.federatedidentitycredentials.FederatedIdentityCredentialsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.OwnersRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.remotedesktopsecurityconfiguration.RemoteDesktopSecurityConfigurationRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.removekey.RemoveKeyRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.removepassword.RemovePasswordRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.synchronization.SynchronizationRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.transitivememberof.TransitiveMemberOfRequestBuilder;
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
 * Provides operations to manage the collection of servicePrincipal entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addKey method.
     * @return a {@link AddKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddKeyRequestBuilder addKey() {
        return new AddKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addPassword method.
     * @return a {@link AddPasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddPasswordRequestBuilder addPassword() {
        return new AddPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addTokenSigningCertificate method.
     * @return a {@link AddTokenSigningCertificateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddTokenSigningCertificateRequestBuilder addTokenSigningCertificate() {
        return new AddTokenSigningCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appManagementPolicies property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link AppManagementPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppManagementPoliciesRequestBuilder appManagementPolicies() {
        return new AppManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignedTo property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link AppRoleAssignedToRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignedToRequestBuilder appRoleAssignedTo() {
        return new AppRoleAssignedToRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link AppRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     * @return a {@link CheckMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     * @return a {@link CheckMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link ClaimsMappingPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link CreatedObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the delegatedPermissionClassifications property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link DelegatedPermissionClassificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DelegatedPermissionClassificationsRequestBuilder delegatedPermissionClassifications() {
        return new DelegatedPermissionClassificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the endpoints property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link EndpointsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EndpointsRequestBuilder endpoints() {
        return new EndpointsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the federatedIdentityCredentials property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link FederatedIdentityCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FederatedIdentityCredentialsRequestBuilder federatedIdentityCredentials() {
        return new FederatedIdentityCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     * @return a {@link GetMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     * @return a {@link GetMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link HomeRealmDiscoveryPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link MemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link Oauth2PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link OwnedObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link OwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the remoteDesktopSecurityConfiguration property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link RemoteDesktopSecurityConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoteDesktopSecurityConfigurationRequestBuilder remoteDesktopSecurityConfiguration() {
        return new RemoteDesktopSecurityConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeKey method.
     * @return a {@link RemoveKeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveKeyRequestBuilder removeKey() {
        return new RemoveKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removePassword method.
     * @return a {@link RemovePasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemovePasswordRequestBuilder removePassword() {
        return new RemovePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the synchronization property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link SynchronizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SynchronizationRequestBuilder synchronization() {
        return new SynchronizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link TokenIssuancePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link TokenLifetimePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.servicePrincipal entity.
     * @return a {@link TransitiveMemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ServicePrincipalItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServicePrincipalItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ServicePrincipalItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServicePrincipalItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a servicePrincipal object.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @return a {@link ServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ServicePrincipal::createFromDiscriminatorValue);
    }
    /**
     * Update entity in servicePrincipals
     * @param body The request body
     * @return a {@link ServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal patch(@jakarta.annotation.Nonnull final ServicePrincipal body) {
        return patch(body, null);
    }
    /**
     * Update entity in servicePrincipals
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ServicePrincipal}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal patch(@jakarta.annotation.Nonnull final ServicePrincipal body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ServicePrincipal::createFromDiscriminatorValue);
    }
    /**
     * Delete a servicePrincipal object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
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
     * Update entity in servicePrincipals
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ServicePrincipal body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in servicePrincipals
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ServicePrincipal body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ServicePrincipalItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ServicePrincipalItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
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
