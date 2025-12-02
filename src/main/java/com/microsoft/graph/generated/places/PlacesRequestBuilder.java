package com.microsoft.graph.places;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Place;
import com.microsoft.graph.places.count.CountRequestBuilder;
import com.microsoft.graph.places.graphbuilding.GraphBuildingRequestBuilder;
import com.microsoft.graph.places.graphdesk.GraphDeskRequestBuilder;
import com.microsoft.graph.places.graphfloor.GraphFloorRequestBuilder;
import com.microsoft.graph.places.graphroom.GraphRoomRequestBuilder;
import com.microsoft.graph.places.graphroomlist.GraphRoomListRequestBuilder;
import com.microsoft.graph.places.graphsection.GraphSectionRequestBuilder;
import com.microsoft.graph.places.graphworkspace.GraphWorkspaceRequestBuilder;
import com.microsoft.graph.places.item.PlaceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of place entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlacesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to building.
     * @return a {@link GraphBuildingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphBuildingRequestBuilder graphBuilding() {
        return new GraphBuildingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to desk.
     * @return a {@link GraphDeskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphDeskRequestBuilder graphDesk() {
        return new GraphDeskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to floor.
     * @return a {@link GraphFloorRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphFloorRequestBuilder graphFloor() {
        return new GraphFloorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to room.
     * @return a {@link GraphRoomRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphRoomRequestBuilder graphRoom() {
        return new GraphRoomRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to roomList.
     * @return a {@link GraphRoomListRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphRoomListRequestBuilder graphRoomList() {
        return new GraphRoomListRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to section.
     * @return a {@link GraphSectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphSectionRequestBuilder graphSection() {
        return new GraphSectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Casts the previous resource to workspace.
     * @return a {@link GraphWorkspaceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphWorkspaceRequestBuilder graphWorkspace() {
        return new GraphWorkspaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of place entities.
     * @param placeId The unique identifier of place
     * @return a {@link PlaceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlaceItemRequestBuilder byPlaceId(@jakarta.annotation.Nonnull final String placeId) {
        Objects.requireNonNull(placeId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("place%2Did", placeId);
        return new PlaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PlacesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlacesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places", pathParameters);
    }
    /**
     * Instantiates a new {@link PlacesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlacesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places", rawUrl);
    }
    /**
     * Add new entity to places
     * @param body The request body
     * @return a {@link Place}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Place post(@jakarta.annotation.Nonnull final Place body) {
        return post(body, null);
    }
    /**
     * Add new entity to places
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Place}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Place post(@jakarta.annotation.Nonnull final Place body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Place::createFromDiscriminatorValue);
    }
    /**
     * Add new entity to places
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Place body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to places
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Place body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PlacesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlacesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PlacesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
