// Template Source: BaseEntityWithReferenceRequest.java.tt
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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal With Reference Request.
 */
public class ServicePrincipalWithReferenceRequest extends BaseRequest implements IServicePrincipalWithReferenceRequest {

    /**
     * The request for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipal.class);
    }

    public void post(final ServicePrincipal newServicePrincipal, final IJsonBackedObject payload, final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ServicePrincipal post(final ServicePrincipal newServicePrincipal, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newServicePrincipal;
        }
        return null;
    }

    public void get(final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ServicePrincipal get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super ServicePrincipal> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ServicePrincipal sourceServicePrincipal, final ICallback<? super ServicePrincipal> callback) {
		send(HttpMethod.PATCH, callback, sourceServicePrincipal);
	}

	public ServicePrincipal patch(final ServicePrincipal sourceServicePrincipal) throws ClientException {
		return send(HttpMethod.PATCH, sourceServicePrincipal);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IServicePrincipalWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IServicePrincipalWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IServicePrincipalWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ServicePrincipalWithReferenceRequest)this;
    }
}
