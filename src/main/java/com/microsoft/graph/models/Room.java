package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Room extends Place implements Parsable {
    /**
     * Specifies the name of the audio device in the room.
     */
    private String audioDeviceName;
    /**
     * Type of room. Possible values are standard, and reserved.
     */
    private BookingType bookingType;
    /**
     * Specifies the building name or building number that the room is in.
     */
    private String building;
    /**
     * Specifies the capacity of the room.
     */
    private Integer capacity;
    /**
     * Specifies the name of the display device in the room.
     */
    private String displayDeviceName;
    /**
     * Email address of the room.
     */
    private String emailAddress;
    /**
     * Specifies a descriptive label for the floor, for example, P.
     */
    private String floorLabel;
    /**
     * Specifies the floor number that the room is on.
     */
    private Integer floorNumber;
    /**
     * Specifies whether the room is wheelchair accessible.
     */
    private Boolean isWheelChairAccessible;
    /**
     * Specifies a descriptive label for the room, for example, a number or name.
     */
    private String label;
    /**
     * Specifies a nickname for the room, for example, 'conf room'.
     */
    private String nickname;
    /**
     * Specifies additional features of the room, for example, details like the type of view or furniture type.
     */
    private java.util.List<String> tags;
    /**
     * Specifies the name of the video device in the room.
     */
    private String videoDeviceName;
    /**
     * Instantiates a new room and sets the default values.
     */
    public Room() {
        super();
        this.setOdataType("#microsoft.graph.room");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a room
     */
    @jakarta.annotation.Nonnull
    public static Room createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Room();
    }
    /**
     * Gets the audioDeviceName property value. Specifies the name of the audio device in the room.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAudioDeviceName() {
        return this.audioDeviceName;
    }
    /**
     * Gets the bookingType property value. Type of room. Possible values are standard, and reserved.
     * @return a bookingType
     */
    @jakarta.annotation.Nullable
    public BookingType getBookingType() {
        return this.bookingType;
    }
    /**
     * Gets the building property value. Specifies the building name or building number that the room is in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBuilding() {
        return this.building;
    }
    /**
     * Gets the capacity property value. Specifies the capacity of the room.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * Gets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayDeviceName() {
        return this.displayDeviceName;
    }
    /**
     * Gets the emailAddress property value. Email address of the room.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audioDeviceName", (n) -> { this.setAudioDeviceName(n.getStringValue()); });
        deserializerMap.put("bookingType", (n) -> { this.setBookingType(n.getEnumValue(BookingType.class)); });
        deserializerMap.put("building", (n) -> { this.setBuilding(n.getStringValue()); });
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("displayDeviceName", (n) -> { this.setDisplayDeviceName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("floorLabel", (n) -> { this.setFloorLabel(n.getStringValue()); });
        deserializerMap.put("floorNumber", (n) -> { this.setFloorNumber(n.getIntegerValue()); });
        deserializerMap.put("isWheelChairAccessible", (n) -> { this.setIsWheelChairAccessible(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("nickname", (n) -> { this.setNickname(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("videoDeviceName", (n) -> { this.setVideoDeviceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFloorLabel() {
        return this.floorLabel;
    }
    /**
     * Gets the floorNumber property value. Specifies the floor number that the room is on.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFloorNumber() {
        return this.floorNumber;
    }
    /**
     * Gets the isWheelChairAccessible property value. Specifies whether the room is wheelchair accessible.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWheelChairAccessible() {
        return this.isWheelChairAccessible;
    }
    /**
     * Gets the label property value. Specifies a descriptive label for the room, for example, a number or name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the nickname property value. Specifies a nickname for the room, for example, 'conf room'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNickname() {
        return this.nickname;
    }
    /**
     * Gets the tags property value. Specifies additional features of the room, for example, details like the type of view or furniture type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVideoDeviceName() {
        return this.videoDeviceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAudioDeviceName(@jakarta.annotation.Nullable final String value) {
        this.audioDeviceName = value;
    }
    /**
     * Sets the bookingType property value. Type of room. Possible values are standard, and reserved.
     * @param value Value to set for the bookingType property.
     */
    public void setBookingType(@jakarta.annotation.Nullable final BookingType value) {
        this.bookingType = value;
    }
    /**
     * Sets the building property value. Specifies the building name or building number that the room is in.
     * @param value Value to set for the building property.
     */
    public void setBuilding(@jakarta.annotation.Nullable final String value) {
        this.building = value;
    }
    /**
     * Sets the capacity property value. Specifies the capacity of the room.
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.capacity = value;
    }
    /**
     * Sets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @param value Value to set for the displayDeviceName property.
     */
    public void setDisplayDeviceName(@jakarta.annotation.Nullable final String value) {
        this.displayDeviceName = value;
    }
    /**
     * Sets the emailAddress property value. Email address of the room.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @param value Value to set for the floorLabel property.
     */
    public void setFloorLabel(@jakarta.annotation.Nullable final String value) {
        this.floorLabel = value;
    }
    /**
     * Sets the floorNumber property value. Specifies the floor number that the room is on.
     * @param value Value to set for the floorNumber property.
     */
    public void setFloorNumber(@jakarta.annotation.Nullable final Integer value) {
        this.floorNumber = value;
    }
    /**
     * Sets the isWheelChairAccessible property value. Specifies whether the room is wheelchair accessible.
     * @param value Value to set for the isWheelChairAccessible property.
     */
    public void setIsWheelChairAccessible(@jakarta.annotation.Nullable final Boolean value) {
        this.isWheelChairAccessible = value;
    }
    /**
     * Sets the label property value. Specifies a descriptive label for the room, for example, a number or name.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the nickname property value. Specifies a nickname for the room, for example, 'conf room'.
     * @param value Value to set for the nickname property.
     */
    public void setNickname(@jakarta.annotation.Nullable final String value) {
        this.nickname = value;
    }
    /**
     * Sets the tags property value. Specifies additional features of the room, for example, details like the type of view or furniture type.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @param value Value to set for the videoDeviceName property.
     */
    public void setVideoDeviceName(@jakarta.annotation.Nullable final String value) {
        this.videoDeviceName = value;
    }
}
