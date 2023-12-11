package com.microsoft.graph.serviceprincipals.item.owners.item;

import com.microsoft.graph.serviceprincipals.item.owners.item.graphapproleassignment.GraphAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.item.graphendpoint.GraphEndpointRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.item.graphserviceprincipal.GraphServicePrincipalRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.item.graphuser.GraphUserRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.owners.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;

/**
 * Builds and executes requests for operations under /servicePrincipals/{servicePrincipal-id}/owners/{directoryObject-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Casts the previous resource to appRoleAssignment.
     */
    @jakarta.annotation.Nonnull
    public GraphAppRoleAssignmentRequestBuilder graphAppRoleAssignment() {
        return new GraphAppRoleAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to endpoint.
     */
    @jakarta.annotation.Nonnull
    public GraphEndpointRequestBuilder graphEndpoint() {
        return new GraphEndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to servicePrincipal.
     */
    @jakarta.annotation.Nonnull
    public GraphServicePrincipalRequestBuilder graphServicePrincipal() {
        return new GraphServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to user.
     */
    @jakarta.annotation.Nonnull
    public GraphUserRequestBuilder graphUser() {
        return new GraphUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryObjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/owners/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryObjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/owners/{directoryObject%2Did}", rawUrl);
    }
}
