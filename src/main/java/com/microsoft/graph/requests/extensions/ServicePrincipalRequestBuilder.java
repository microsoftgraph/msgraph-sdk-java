// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Request Builder.
 */
public class ServicePrincipalRequestBuilder extends BaseRequestBuilder implements IServicePrincipalRequestBuilder {

    /**
     * The request builder for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    public IServicePrincipalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    public IServicePrincipalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ServicePrincipalRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignedTo() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignedTo"), getClient(), null);
    }

    public IAppRoleAssignmentRequestBuilder appRoleAssignedTo(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignedTo") + "/" + id, getClient(), null);
    }
    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    public IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    public IClaimsMappingPolicyCollectionWithReferencesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies"), getClient(), null);
    }

    public IClaimsMappingPolicyWithReferenceRequestBuilder claimsMappingPolicies(final String id) {
        return new ClaimsMappingPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder createdObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder createdObjectsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDelegatedPermissionClassificationCollectionRequestBuilder delegatedPermissionClassifications() {
        return new DelegatedPermissionClassificationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedPermissionClassifications"), getClient(), null);
    }

    public IDelegatedPermissionClassificationRequestBuilder delegatedPermissionClassifications(final String id) {
        return new DelegatedPermissionClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedPermissionClassifications") + "/" + id, getClient(), null);
    }
    public IEndpointCollectionRequestBuilder endpoints() {
        return new EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints"), getClient(), null);
    }

    public IEndpointRequestBuilder endpoints(final String id) {
        return new EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints") + "/" + id, getClient(), null);
    }
    public IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    public IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(final String id) {
        return new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder memberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder memberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants"), getClient(), null);
    }

    public IOAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    public IAppRoleAssignmentCollectionWithReferencesRequestBuilder ownedObjectsAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    public IAppRoleAssignmentWithReferenceRequestBuilder ownedObjectsAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder ownedObjectsAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder ownedObjectsAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IEndpointCollectionWithReferencesRequestBuilder ownedObjectsAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.endpoint", getClient(), null);
    }

    public IEndpointWithReferenceRequestBuilder ownedObjectsAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder ownedObjectsAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder ownedObjectsAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder ownedObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder ownedObjectsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public IAppRoleAssignmentCollectionWithReferencesRequestBuilder ownersAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    public IAppRoleAssignmentWithReferenceRequestBuilder ownersAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    public IEndpointCollectionWithReferencesRequestBuilder ownersAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.endpoint", getClient(), null);
    }

    public IEndpointWithReferenceRequestBuilder ownersAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder ownersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder ownersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public ITokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    public ITokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id) {
        return new TokenIssuancePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    public ITokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    public ITokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id) {
        return new TokenLifetimePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IServicePrincipalAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof) {
        return new ServicePrincipalAddKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addKey"), getClient(), null, keyCredential, passwordCredential, proof);
    }

    public IServicePrincipalAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential) {
        return new ServicePrincipalAddPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addPassword"), getClient(), null, passwordCredential);
    }

    public IServicePrincipalRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof) {
        return new ServicePrincipalRemoveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeKey"), getClient(), null, keyId, proof);
    }

    public IServicePrincipalRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId) {
        return new ServicePrincipalRemovePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removePassword"), getClient(), null, keyId);
    }
}
