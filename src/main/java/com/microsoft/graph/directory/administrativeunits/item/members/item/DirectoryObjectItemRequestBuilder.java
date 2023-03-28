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
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /** Casts the previous resource to application. */
    @javax.annotation.Nonnull
    public GraphApplicationRequestBuilder graphApplication() {
        return new GraphApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to device. */
    @javax.annotation.Nonnull
    public GraphDeviceRequestBuilder graphDevice() {
        return new GraphDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to group. */
    @javax.annotation.Nonnull
    public GraphGroupRequestBuilder graphGroup() {
        return new GraphGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to orgContact. */
    @javax.annotation.Nonnull
    public GraphOrgContactRequestBuilder graphOrgContact() {
        return new GraphOrgContactRequestBuilder(pathParameters, requestAdapter);
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
    /** Provides operations to manage the collection of directory entities. */
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
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits/{administrativeUnit%2Did}/members/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/administrativeUnits/{administrativeUnit%2Did}/members/{directoryObject%2Did}", rawUrl);
    }
}
