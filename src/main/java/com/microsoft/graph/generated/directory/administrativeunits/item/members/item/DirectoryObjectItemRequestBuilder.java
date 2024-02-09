package com.microsoft.graph.directory.administrativeunits.item.members.item;

import com.microsoft.graph.directory.administrativeunits.item.members.item.graphapplication.GraphApplicationRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.graphdevice.GraphDeviceRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.graphgroup.GraphGroupRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.graphorgcontact.GraphOrgContactRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.graphserviceprincipal.GraphServicePrincipalRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.graphuser.GraphUserRequestBuilder;
import com.microsoft.graph.directory.administrativeunits.item.members.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /directory/administrativeUnits/{administrativeUnit-id}/members/{directoryObject-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Casts the previous resource to application.
     * @return a {@link GraphApplicationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphApplicationRequestBuilder graphApplication() {
        return new GraphApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to device.
     * @return a {@link GraphDeviceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphDeviceRequestBuilder graphDevice() {
        return new GraphDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to group.
     * @return a {@link GraphGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphGroupRequestBuilder graphGroup() {
        return new GraphGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to orgContact.
     * @return a {@link GraphOrgContactRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphOrgContactRequestBuilder graphOrgContact() {
        return new GraphOrgContactRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the collection of directory entities.
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
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits/{administrativeUnit%2Did}/members/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link DirectoryObjectItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryObjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits/{administrativeUnit%2Did}/members/{directoryObject%2Did}", rawUrl);
    }
}
