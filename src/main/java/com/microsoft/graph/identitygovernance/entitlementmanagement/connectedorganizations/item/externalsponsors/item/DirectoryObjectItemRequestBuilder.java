package com.microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.item.externalsponsors.item;

import com.microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.item.externalsponsors.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /identityGovernance/entitlementManagement/connectedOrganizations/{connectedOrganization-id}/externalSponsors/{directoryObject-id}
 */
public class DirectoryObjectItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the collection of identityGovernance entities. */
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
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/connectedOrganizations/{connectedOrganization%2Did}/externalSponsors/{directoryObject%2Did}", pathParameters);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/connectedOrganizations/{connectedOrganization%2Did}/externalSponsors/{directoryObject%2Did}", rawUrl);
    }
}
