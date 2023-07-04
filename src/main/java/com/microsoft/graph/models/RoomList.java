package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoomList extends Place implements Parsable {
    /**
     * The email address of the room list.
     */
    private String emailAddress;
    /**
     * The rooms property
     */
    private java.util.List<Room> rooms;
    /**
     * Instantiates a new RoomList and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoomList() {
        super();
        this.setOdataType("#microsoft.graph.roomList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoomList
     */
    @javax.annotation.Nonnull
    public static RoomList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoomList();
    }
    /**
     * Gets the emailAddress property value. The email address of the room list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("rooms", (n) -> { this.setRooms(n.getCollectionOfObjectValues(Room::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rooms property value. The rooms property
     * @return a room
     */
    @javax.annotation.Nullable
    public java.util.List<Room> getRooms() {
        return this.rooms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeCollectionOfObjectValues("rooms", this.getRooms());
    }
    /**
     * Sets the emailAddress property value. The email address of the room list.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the rooms property value. The rooms property
     * @param value Value to set for the rooms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRooms(@javax.annotation.Nullable final java.util.List<Room> value) {
        this.rooms = value;
    }
}
