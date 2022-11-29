package com.microsoft.graph.serviceprincipals.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.serviceprincipals.item.addkey.AddKeyRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.addpassword.AddPasswordRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.addtokensigningcertificate.AddTokenSigningCertificateRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.approleassignedto.AppRoleAssignedToRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.claimsmappingpolicies.ClaimsMappingPoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.claimsmappingpolicies.item.ClaimsMappingPolicyItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.delegatedpermissionclassifications.DelegatedPermissionClassificationsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.delegatedpermissionclassifications.item.DelegatedPermissionClassificationItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.endpoints.EndpointsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.endpoints.item.EndpointItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.federatedidentitycredentials.FederatedIdentityCredentialsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.federatedidentitycredentials.item.FederatedIdentityCredentialItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.homerealmdiscoverypolicies.item.HomeRealmDiscoveryPolicyItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.ownedobjects.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.OwnersRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.removekey.RemoveKeyRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.removepassword.RemovePasswordRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenissuancepolicies.item.TokenIssuancePolicyItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.item.TokenLifetimePolicyItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
/** Provides operations to manage the collection of servicePrincipal entities. */
public class ServicePrincipalItemRequestBuilder {
    /** Provides operations to call the addKey method. */
    @javax.annotation.Nonnull
    public AddKeyRequestBuilder addKey() {
        return new AddKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the addPassword method. */
    @javax.annotation.Nonnull
    public AddPasswordRequestBuilder addPassword() {
        return new AddPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the addTokenSigningCertificate method. */
    @javax.annotation.Nonnull
    public AddTokenSigningCertificateRequestBuilder addTokenSigningCertificate() {
        return new AddTokenSigningCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the appRoleAssignedTo property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public AppRoleAssignedToRequestBuilder appRoleAssignedTo() {
        return new AppRoleAssignedToRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the appRoleAssignments property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberGroups method. */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberObjects method. */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the createdObjects property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the delegatedPermissionClassifications property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public DelegatedPermissionClassificationsRequestBuilder delegatedPermissionClassifications() {
        return new DelegatedPermissionClassificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the endpoints property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public EndpointsRequestBuilder endpoints() {
        return new EndpointsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the federatedIdentityCredentials property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialsRequestBuilder federatedIdentityCredentials() {
        return new FederatedIdentityCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberGroups method. */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberObjects method. */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the memberOf property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the ownedObjects property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the owners property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the removeKey method. */
    @javax.annotation.Nonnull
    public RemoveKeyRequestBuilder removeKey() {
        return new RemoveKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the removePassword method. */
    @javax.annotation.Nonnull
    public RemovePasswordRequestBuilder removePassword() {
        return new RemovePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the transitiveMemberOf property of the microsoft.graph.servicePrincipal entity. */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the appRoleAssignedTo property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a AppRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.approleassignedto.item.AppRoleAssignmentItemRequestBuilder appRoleAssignedTo(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.approleassignedto.item.AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a AppRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder appRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.servicePrincipals.item.claimsMappingPolicies.item collection
     * @param id Unique identifier of the item
     * @return a ClaimsMappingPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ClaimsMappingPolicyItemRequestBuilder claimsMappingPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("claimsMappingPolicy%2Did", id);
        return new ClaimsMappingPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ServicePrincipalItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ServicePrincipalItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete a servicePrincipal object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderDeleteRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderGetRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in servicePrincipals
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ServicePrincipal body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in servicePrincipals
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ServicePrincipal body, @javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderPatchRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the delegatedPermissionClassifications property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a DelegatedPermissionClassificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DelegatedPermissionClassificationItemRequestBuilder delegatedPermissionClassifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("delegatedPermissionClassification%2Did", id);
        return new DelegatedPermissionClassificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete a servicePrincipal object.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the endpoints property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a EndpointItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EndpointItemRequestBuilder endpoints(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("endpoint%2Did", id);
        return new EndpointItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the federatedIdentityCredentials property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a FederatedIdentityCredentialItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialItemRequestBuilder federatedIdentityCredentials(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("federatedIdentityCredential%2Did", id);
        return new FederatedIdentityCredentialItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @return a CompletableFuture of servicePrincipal
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ServicePrincipal>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Retrieve the properties and relationships of a servicePrincipal object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of servicePrincipal
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> get(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ServicePrincipal>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.servicePrincipals.item.homeRealmDiscoveryPolicies.item collection
     * @param id Unique identifier of the item
     * @return a HomeRealmDiscoveryPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPolicyItemRequestBuilder homeRealmDiscoveryPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("homeRealmDiscoveryPolicy%2Did", id);
        return new HomeRealmDiscoveryPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a OAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.servicePrincipals.item.owners.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.owners.item.DirectoryObjectItemRequestBuilder owners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.owners.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in servicePrincipals
     * @param body 
     * @return a CompletableFuture of servicePrincipal
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> patch(@javax.annotation.Nonnull final ServicePrincipal body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ServicePrincipal>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update entity in servicePrincipals
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of servicePrincipal
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> patch(@javax.annotation.Nonnull final ServicePrincipal body, @javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ServicePrincipal>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a TokenIssuancePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenIssuancePolicyItemRequestBuilder tokenIssuancePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenIssuancePolicy%2Did", id);
        return new TokenIssuancePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a TokenLifetimePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenLifetimePolicyItemRequestBuilder tokenLifetimePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenLifetimePolicy%2Did", id);
        return new TokenLifetimePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.servicePrincipal entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.serviceprincipals.item.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.serviceprincipals.item.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ServicePrincipalItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ServicePrincipalItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Retrieve the properties and relationships of a servicePrincipal object. */
    public class ServicePrincipalItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ServicePrincipalItemRequestBuilderGetQueryParameters queryParameters = new ServicePrincipalItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ServicePrincipalItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ServicePrincipalItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ServicePrincipalItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ServicePrincipalItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
