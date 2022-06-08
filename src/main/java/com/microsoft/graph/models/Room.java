package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to room. */
public class Room extends Place implements Parsable {
    /** Specifies the name of the audio device in the room. */
    private String _audioDeviceName;
    /** Type of room. Possible values are standard, and reserved. */
    private BookingType _bookingType;
    /** Specifies the building name or building number that the room is in. */
    private String _building;
    /** Specifies the capacity of the room. */
    private Integer _capacity;
    /** Specifies the name of the display device in the room. */
    private String _displayDeviceName;
    /** Email address of the room. */
    private String _emailAddress;
    /** Specifies a descriptive label for the floor, for example, P. */
    private String _floorLabel;
    /** Specifies the floor number that the room is on. */
    private Integer _floorNumber;
    /** Specifies whether the room is wheelchair accessible. */
    private Boolean _isWheelChairAccessible;
    /** Specifies a descriptive label for the room, for example, a number or name. */
    private String _label;
    /** Specifies a nickname for the room, for example, 'conf room'. */
    private String _nickname;
    /** Specifies additional features of the room, for example, details like the type of view or furniture type. */
    private java.util.List<String> _tags;
    /** Specifies the name of the video device in the room. */
    private String _videoDeviceName;
    /**
     * Instantiates a new room and sets the default values.
     * @return a void
     */
    public Room() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a room
     */
    @javax.annotation.Nonnull
    public static Room createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Room();
    }
    /**
     * Gets the audioDeviceName property value. Specifies the name of the audio device in the room.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAudioDeviceName() {
        return this._audioDeviceName;
    }
    /**
     * Gets the bookingType property value. Type of room. Possible values are standard, and reserved.
     * @return a bookingType
     */
    @javax.annotation.Nullable
    public BookingType getBookingType() {
        return this._bookingType;
    }
    /**
     * Gets the building property value. Specifies the building name or building number that the room is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuilding() {
        return this._building;
    }
    /**
     * Gets the capacity property value. Specifies the capacity of the room.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCapacity() {
        return this._capacity;
    }
    /**
     * Gets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayDeviceName() {
        return this._displayDeviceName;
    }
    /**
     * Gets the emailAddress property value. Email address of the room.
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
        final Room currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("audioDeviceName", (n) -> { currentObject.setAudioDeviceName(n.getStringValue()); });
            this.put("bookingType", (n) -> { currentObject.setBookingType(n.getEnumValue(BookingType.class)); });
            this.put("building", (n) -> { currentObject.setBuilding(n.getStringValue()); });
            this.put("capacity", (n) -> { currentObject.setCapacity(n.getIntegerValue()); });
            this.put("displayDeviceName", (n) -> { currentObject.setDisplayDeviceName(n.getStringValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("floorLabel", (n) -> { currentObject.setFloorLabel(n.getStringValue()); });
            this.put("floorNumber", (n) -> { currentObject.setFloorNumber(n.getIntegerValue()); });
            this.put("isWheelChairAccessible", (n) -> { currentObject.setIsWheelChairAccessible(n.getBooleanValue()); });
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("nickname", (n) -> { currentObject.setNickname(n.getStringValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("videoDeviceName", (n) -> { currentObject.setVideoDeviceName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloorLabel() {
        return this._floorLabel;
    }
    /**
     * Gets the floorNumber property value. Specifies the floor number that the room is on.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFloorNumber() {
        return this._floorNumber;
    }
    /**
     * Gets the isWheelChairAccessible property value. Specifies whether the room is wheelchair accessible.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsWheelChairAccessible() {
        return this._isWheelChairAccessible;
    }
    /**
     * Gets the label property value. Specifies a descriptive label for the room, for example, a number or name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the nickname property value. Specifies a nickname for the room, for example, 'conf room'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickname() {
        return this._nickname;
    }
    /**
     * Gets the tags property value. Specifies additional features of the room, for example, details like the type of view or furniture type.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVideoDeviceName() {
        return this._videoDeviceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("audioDeviceName", this.getAudioDeviceName());
        writer.writeEnumValue("bookingType", this.getBookingType());
        writer.writeStringValue("building", this.getBuilding());
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeStringValue("displayDeviceName", this.getDisplayDeviceName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeStringValue("floorLabel", this.getFloorLabel());
        writer.writeIntegerValue("floorNumber", this.getFloorNumber());
        writer.writeBooleanValue("isWheelChairAccessible", this.getIsWheelChairAccessible());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("videoDeviceName", this.getVideoDeviceName());
    }
    /**
     * Sets the audioDeviceName property value. Specifies the name of the audio device in the room.
     * @param value Value to set for the audioDeviceName property.
     * @return a void
     */
    public void setAudioDeviceName(@javax.annotation.Nullable final String value) {
        this._audioDeviceName = value;
    }
    /**
     * Sets the bookingType property value. Type of room. Possible values are standard, and reserved.
     * @param value Value to set for the bookingType property.
     * @return a void
     */
    public void setBookingType(@javax.annotation.Nullable final BookingType value) {
        this._bookingType = value;
    }
    /**
     * Sets the building property value. Specifies the building name or building number that the room is in.
     * @param value Value to set for the building property.
     * @return a void
     */
    public void setBuilding(@javax.annotation.Nullable final String value) {
        this._building = value;
    }
    /**
     * Sets the capacity property value. Specifies the capacity of the room.
     * @param value Value to set for the capacity property.
     * @return a void
     */
    public void setCapacity(@javax.annotation.Nullable final Integer value) {
        this._capacity = value;
    }
    /**
     * Sets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @param value Value to set for the displayDeviceName property.
     * @return a void
     */
    public void setDisplayDeviceName(@javax.annotation.Nullable final String value) {
        this._displayDeviceName = value;
    }
    /**
     * Sets the emailAddress property value. Email address of the room.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @param value Value to set for the floorLabel property.
     * @return a void
     */
    public void setFloorLabel(@javax.annotation.Nullable final String value) {
        this._floorLabel = value;
    }
    /**
     * Sets the floorNumber property value. Specifies the floor number that the room is on.
     * @param value Value to set for the floorNumber property.
     * @return a void
     */
    public void setFloorNumber(@javax.annotation.Nullable final Integer value) {
        this._floorNumber = value;
    }
    /**
     * Sets the isWheelChairAccessible property value. Specifies whether the room is wheelchair accessible.
     * @param value Value to set for the isWheelChairAccessible property.
     * @return a void
     */
    public void setIsWheelChairAccessible(@javax.annotation.Nullable final Boolean value) {
        this._isWheelChairAccessible = value;
    }
    /**
     * Sets the label property value. Specifies a descriptive label for the room, for example, a number or name.
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the nickname property value. Specifies a nickname for the room, for example, 'conf room'.
     * @param value Value to set for the nickname property.
     * @return a void
     */
    public void setNickname(@javax.annotation.Nullable final String value) {
        this._nickname = value;
    }
    /**
     * Sets the tags property value. Specifies additional features of the room, for example, details like the type of view or furniture type.
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @param value Value to set for the videoDeviceName property.
     * @return a void
     */
    public void setVideoDeviceName(@javax.annotation.Nullable final String value) {
        this._videoDeviceName = value;
    }
}
