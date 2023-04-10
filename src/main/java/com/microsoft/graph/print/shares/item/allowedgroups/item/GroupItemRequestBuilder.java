package com.microsoft.graph.print.shares.item.allowedgroups.item;

import com.microsoft.graph.print.shares.item.allowedgroups.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /print/shares/{printerShare-id}/allowedGroups/{group-id}
 */
public class GroupItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the collection of print entities. */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/shares/{printerShare%2Did}/allowedGroups/{group%2Did}", pathParameters);
    }
    /**
     * Instantiates a new GroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print/shares/{printerShare%2Did}/allowedGroups/{group%2Did}", rawUrl);
    }
}
