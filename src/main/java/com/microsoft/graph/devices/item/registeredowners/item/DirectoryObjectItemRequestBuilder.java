package com.microsoft.graph.devices.item.registeredowners.item;

import com.microsoft.graph.devices.item.registeredowners.item.graphapproleassignment.GraphAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.devices.item.registeredowners.item.graphendpoint.GraphEndpointRequestBuilder;
import com.microsoft.graph.devices.item.registeredowners.item.graphserviceprincipal.GraphServicePrincipalRequestBuilder;
import com.microsoft.graph.devices.item.registeredowners.item.graphuser.GraphUserRequestBuilder;
import com.microsoft.graph.devices.item.registeredowners.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /devices/{device-id}/registeredOwners/{directoryObject-id}
 */
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /** Casts the previous resource to appRoleAssignment. */
    @javax.annotation.Nonnull
    public GraphAppRoleAssignmentRequestBuilder graphAppRoleAssignment() {
        return new GraphAppRoleAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to endpoint. */
    @javax.annotation.Nonnull
    public GraphEndpointRequestBuilder graphEndpoint() {
        return new GraphEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to servicePrincipal. */
    @javax.annotation.Nonnull
    public GraphServicePrincipalRequestBuilder graphServicePrincipal() {
        return new GraphServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to user. */
    @javax.annotation.Nonnull
    public GraphUserRequestBuilder graphUser() {
        return new GraphUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of device entities. */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}", rawUrl);
    }
}
