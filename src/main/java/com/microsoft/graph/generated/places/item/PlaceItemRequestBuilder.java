package com.microsoft.graph.places.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Place;
import com.microsoft.graph.places.item.checkins.CheckInsRequestBuilder;
import com.microsoft.graph.places.item.descendants.DescendantsRequestBuilder;
import com.microsoft.graph.places.item.graphbuilding.GraphBuildingRequestBuilder;
import com.microsoft.graph.places.item.graphdesk.GraphDeskRequestBuilder;
import com.microsoft.graph.places.item.graphfloor.GraphFloorRequestBuilder;
import com.microsoft.graph.places.item.graphroom.GraphRoomRequestBuilder;
import com.microsoft.graph.places.item.graphroomlist.GraphRoomListRequestBuilder;
import com.microsoft.graph.places.item.graphsection.GraphSectionRequestBuilder;
import com.microsoft.graph.places.item.graphworkspace.GraphWorkspaceRequestBuilder;
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
public class PlaceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the checkIns property of the microsoft.graph.place entity.
     * @return a {@link CheckInsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckInsRequestBuilder checkIns() {
        return new CheckInsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the descendants method.
     * @return a {@link DescendantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DescendantsRequestBuilder descendants() {
        return new DescendantsRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link PlaceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlaceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link PlaceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlaceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/places/{place%2Did}", rawUrl);
    }
    /**
     * Delete a place object. You can also use this method to delete the following child object types: building, floor, section, or desk.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a place object. You can also use this method to delete the following child object types: building, floor, section, or desk.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Update the properties of place object that can be a building, floor, section, desk, room, workspace, or roomList. You can identify the place by specifying the id property.
     * @param body The request body
     * @return a {@link Place}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Place patch(@jakarta.annotation.Nonnull final Place body) {
        return patch(body, null);
    }
    /**
     * Update the properties of place object that can be a building, floor, section, desk, room, workspace, or roomList. You can identify the place by specifying the id property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Place}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/place-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Place patch(@jakarta.annotation.Nonnull final Place body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Place::createFromDiscriminatorValue);
    }
    /**
     * Delete a place object. You can also use this method to delete the following child object types: building, floor, section, or desk.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a place object. You can also use this method to delete the following child object types: building, floor, section, or desk.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of place object that can be a building, floor, section, desk, room, workspace, or roomList. You can identify the place by specifying the id property.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Place body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of place object that can be a building, floor, section, desk, room, workspace, or roomList. You can identify the place by specifying the id property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Place body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PlaceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlaceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PlaceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
