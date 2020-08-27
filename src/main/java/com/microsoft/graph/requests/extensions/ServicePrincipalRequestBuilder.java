// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequest;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalAddKeyRequestBuilder;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRemovePasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRemovePasswordRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

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
     * @return the IServicePrincipalRequest instance
     */
    public IServicePrincipalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    public IServicePrincipalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ServicePrincipalRequest(getRequestUrl(), getClient(), requestOptions);
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
    public IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants"), getClient(), null);
    }

    public IOAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
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

