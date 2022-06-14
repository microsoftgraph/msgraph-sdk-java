package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoomList extends Place implements Parsable {
    /** The email address of the room list. */
    private String _emailAddress;
    /** The rooms property */
    private java.util.List<Room> _rooms;
    /**
     * Instantiates a new RoomList and sets the default values.
     * @return a void
     */
    public RoomList() {
        super();
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
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoomList currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("rooms", (n) -> { currentObject.setRooms(n.getCollectionOfObjectValues(Room::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the rooms property value. The rooms property
     * @return a room
     */
    @javax.annotation.Nullable
    public java.util.List<Room> getRooms() {
        return this._rooms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the rooms property value. The rooms property
     * @param value Value to set for the rooms property.
     * @return a void
     */
    public void setRooms(@javax.annotation.Nullable final java.util.List<Room> value) {
        this._rooms = value;
    }
}
