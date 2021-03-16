// Template Source: BaseEntityRequest.java.tt
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
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Request.
 */
public class ServicePrincipalRequest extends BaseRequest implements IServicePrincipalRequest {
	
    /**
     * The request for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipal.class);
    }

    /**
     * Gets the ServicePrincipal from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ServicePrincipal from the service
     *
     * @return the ServicePrincipal from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ServicePrincipal get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ServicePrincipal sourceServicePrincipal, final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.PATCH, callback, sourceServicePrincipal);
    }

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @return the updated ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ServicePrincipal patch(final ServicePrincipal sourceServicePrincipal) throws ClientException {
        return send(HttpMethod.PATCH, sourceServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ServicePrincipal newServicePrincipal, final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.POST, callback, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @return the created ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ServicePrincipal post(final ServicePrincipal newServicePrincipal) throws ClientException {
        return send(HttpMethod.POST, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ServicePrincipal newServicePrincipal, final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.PUT, callback, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the object to create/update
     * @return the created ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ServicePrincipal put(final ServicePrincipal newServicePrincipal) throws ClientException {
        return send(HttpMethod.PUT, newServicePrincipal);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IServicePrincipalRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ServicePrincipalRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IServicePrincipalRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ServicePrincipalRequest)this;
     }

}

