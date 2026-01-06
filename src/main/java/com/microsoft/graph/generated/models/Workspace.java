package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Workspace extends Place implements Parsable {
    /**
     * Instantiates a new {@link Workspace} and sets the default values.
     */
    public Workspace() {
        super();
        this.setOdataType("#microsoft.graph.workspace");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Workspace}
     */
    @jakarta.annotation.Nonnull
    public static Workspace createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workspace();
    }
    /**
     * Gets the capacity property value. The maximum number of individual desks within a workspace.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.backingStore.get("capacity");
    }
    /**
     * Gets the displayDeviceName property value. The name of the display device (for example, monitor or projector) that is available in the workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayDeviceName() {
        return this.backingStore.get("displayDeviceName");
    }
    /**
     * Gets the emailAddress property value. The email address that is associated with the workspace. This email address is used for booking.
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
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("displayDeviceName", (n) -> { this.setDisplayDeviceName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getObjectValue(PlaceMode::createFromDiscriminatorValue)); });
        deserializerMap.put("nickname", (n) -> { this.setNickname(n.getStringValue()); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mode property value. The mode for a workspace. The supported modes are:reservablePlaceMode - Workspaces that can be booked in advance using desk pool reservation tools.dropInPlaceMode - First come, first served desks. When you plug into a peripheral on one of these desks in the workspace, the desk is booked for you, assuming that the peripheral has been associated with the desk in the Microsoft Teams Rooms pro management portal.unavailablePlaceMode - Workspaces that are taken down for maintenance or marked as not reservable.
     * @return a {@link PlaceMode}
     */
    @jakarta.annotation.Nullable
    public PlaceMode getMode() {
        return this.backingStore.get("mode");
    }
    /**
     * Gets the nickname property value. A short, friendly name for the workspace, often used for easier identification or display in the UI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNickname() {
        return this.backingStore.get("nickname");
    }
    /**
     * Gets the placeId property value. An alternative immutable unique identifier of the workspace. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeStringValue("displayDeviceName", this.getDisplayDeviceName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeObjectValue("mode", this.getMode());
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeStringValue("placeId", this.getPlaceId());
    }
    /**
     * Sets the capacity property value. The maximum number of individual desks within a workspace.
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("capacity", value);
    }
    /**
     * Sets the displayDeviceName property value. The name of the display device (for example, monitor or projector) that is available in the workspace.
     * @param value Value to set for the displayDeviceName property.
     */
    public void setDisplayDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayDeviceName", value);
    }
    /**
     * Sets the emailAddress property value. The email address that is associated with the workspace. This email address is used for booking.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the mode property value. The mode for a workspace. The supported modes are:reservablePlaceMode - Workspaces that can be booked in advance using desk pool reservation tools.dropInPlaceMode - First come, first served desks. When you plug into a peripheral on one of these desks in the workspace, the desk is booked for you, assuming that the peripheral has been associated with the desk in the Microsoft Teams Rooms pro management portal.unavailablePlaceMode - Workspaces that are taken down for maintenance or marked as not reservable.
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final PlaceMode value) {
        this.backingStore.set("mode", value);
    }
    /**
     * Sets the nickname property value. A short, friendly name for the workspace, often used for easier identification or display in the UI.
     * @param value Value to set for the nickname property.
     */
    public void setNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nickname", value);
    }
    /**
     * Sets the placeId property value. An alternative immutable unique identifier of the workspace. Read-only.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
}
