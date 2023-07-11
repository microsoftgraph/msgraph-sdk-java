package com.microsoft.graph.places;

import com.microsoft.graph.places.count.CountRequestBuilder;
import com.microsoft.graph.places.graphroom.GraphRoomRequestBuilder;
import com.microsoft.graph.places.graphroomlist.GraphRoomListRequestBuilder;
import com.microsoft.graph.places.item.PlaceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /places
 */
public class PlacesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to room.
     */
    @javax.annotation.Nonnull
    public GraphRoomRequestBuilder graphRoom() {
        return new GraphRoomRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to roomList.
     */
    @javax.annotation.Nonnull
    public GraphRoomListRequestBuilder graphRoomList() {
        return new GraphRoomListRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of place entities.
     * @param placeId Unique identifier of the item
     * @return a PlaceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PlaceItemRequestBuilder byPlaceId(@javax.annotation.Nonnull final String placeId) {
        Objects.requireNonNull(placeId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("place%2Did", placeId);
        return new PlaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PlacesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlacesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places", pathParameters);
    }
    /**
     * Instantiates a new PlacesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlacesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places", rawUrl);
    }
}
