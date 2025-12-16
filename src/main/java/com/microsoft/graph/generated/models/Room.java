package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Room extends Place implements Parsable {
    /**
     * Instantiates a new {@link Room} and sets the default values.
     */
    public Room() {
        super();
        this.setOdataType("#microsoft.graph.room");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Room}
     */
    @jakarta.annotation.Nonnull
    public static Room createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Room();
    }
    /**
     * Gets the audioDeviceName property value. Specifies the name of the audio device in the room.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAudioDeviceName() {
        return this.backingStore.get("audioDeviceName");
    }
    /**
     * Gets the bookingType property value. Type of room. Possible values are: unknown, standard, reserved.
     * @return a {@link BookingType}
     */
    @jakarta.annotation.Nullable
    public BookingType getBookingType() {
        return this.backingStore.get("bookingType");
    }
    /**
     * Gets the building property value. Specifies the building name or building number that the room is in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuilding() {
        return this.backingStore.get("building");
    }
    /**
     * Gets the capacity property value. Specifies the capacity of the room.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.backingStore.get("capacity");
    }
    /**
     * Gets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayDeviceName() {
        return this.backingStore.get("displayDeviceName");
    }
    /**
     * Gets the emailAddress property value. Email address of the room.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audioDeviceName", (n) -> { this.setAudioDeviceName(n.getStringValue()); });
        deserializerMap.put("bookingType", (n) -> { this.setBookingType(n.getEnumValue(BookingType::forValue)); });
        deserializerMap.put("building", (n) -> { this.setBuilding(n.getStringValue()); });
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("displayDeviceName", (n) -> { this.setDisplayDeviceName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("floorLabel", (n) -> { this.setFloorLabel(n.getStringValue()); });
        deserializerMap.put("floorNumber", (n) -> { this.setFloorNumber(n.getIntegerValue()); });
        deserializerMap.put("nickname", (n) -> { this.setNickname(n.getStringValue()); });
        deserializerMap.put("videoDeviceName", (n) -> { this.setVideoDeviceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFloorLabel() {
        return this.backingStore.get("floorLabel");
    }
    /**
     * Gets the floorNumber property value. Specifies the floor number that the room is on.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFloorNumber() {
        return this.backingStore.get("floorNumber");
    }
    /**
     * Gets the nickname property value. Specifies a nickname for the room, for example, &apos;conf room&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNickname() {
        return this.backingStore.get("nickname");
    }
    /**
     * Gets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoDeviceName() {
        return this.backingStore.get("videoDeviceName");
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
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeStringValue("videoDeviceName", this.getVideoDeviceName());
    }
    /**
     * Sets the audioDeviceName property value. Specifies the name of the audio device in the room.
     * @param value Value to set for the audioDeviceName property.
     */
    public void setAudioDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("audioDeviceName", value);
    }
    /**
     * Sets the bookingType property value. Type of room. Possible values are: unknown, standard, reserved.
     * @param value Value to set for the bookingType property.
     */
    public void setBookingType(@jakarta.annotation.Nullable final BookingType value) {
        this.backingStore.set("bookingType", value);
    }
    /**
     * Sets the building property value. Specifies the building name or building number that the room is in.
     * @param value Value to set for the building property.
     */
    public void setBuilding(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("building", value);
    }
    /**
     * Sets the capacity property value. Specifies the capacity of the room.
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("capacity", value);
    }
    /**
     * Sets the displayDeviceName property value. Specifies the name of the display device in the room.
     * @param value Value to set for the displayDeviceName property.
     */
    public void setDisplayDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayDeviceName", value);
    }
    /**
     * Sets the emailAddress property value. Email address of the room.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @param value Value to set for the floorLabel property.
     */
    public void setFloorLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("floorLabel", value);
    }
    /**
     * Sets the floorNumber property value. Specifies the floor number that the room is on.
     * @param value Value to set for the floorNumber property.
     */
    public void setFloorNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("floorNumber", value);
    }
    /**
     * Sets the nickname property value. Specifies a nickname for the room, for example, &apos;conf room&apos;.
     * @param value Value to set for the nickname property.
     */
    public void setNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nickname", value);
    }
    /**
     * Sets the videoDeviceName property value. Specifies the name of the video device in the room.
     * @param value Value to set for the videoDeviceName property.
     */
    public void setVideoDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("videoDeviceName", value);
    }
}
