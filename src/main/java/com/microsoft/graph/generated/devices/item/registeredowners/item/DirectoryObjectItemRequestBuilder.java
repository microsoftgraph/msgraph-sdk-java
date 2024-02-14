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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Casts the previous resource to appRoleAssignment.
     * @return a {@link GraphAppRoleAssignmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphAppRoleAssignmentRequestBuilder graphAppRoleAssignment() {
        return new GraphAppRoleAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to endpoint.
     * @return a {@link GraphEndpointRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphEndpointRequestBuilder graphEndpoint() {
        return new GraphEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to servicePrincipal.
     * @return a {@link GraphServicePrincipalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphServicePrincipalRequestBuilder graphServicePrincipal() {
        return new GraphServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to user.
     * @return a {@link GraphUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphUserRequestBuilder graphUser() {
        return new GraphUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @return a {@link RefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DirectoryObjectItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryObjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link DirectoryObjectItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryObjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}", rawUrl);
    }
}
