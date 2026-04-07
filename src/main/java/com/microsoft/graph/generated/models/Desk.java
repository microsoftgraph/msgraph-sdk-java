package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Desk extends Place implements Parsable {
    /**
     * Instantiates a new {@link Desk} and sets the default values.
     */
    public Desk() {
        super();
        this.setOdataType("#microsoft.graph.desk");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Desk}
     */
    @jakarta.annotation.Nonnull
    public static Desk createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Desk();
    }
    /**
     * Gets the displayDeviceName property value. The name of the display device (for example, monitor or projector) that is available at the desk.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayDeviceName() {
        return this.backingStore.get("displayDeviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayDeviceName", (n) -> { this.setDisplayDeviceName(n.getStringValue()); });
        deserializerMap.put("heightAdjustableState", (n) -> { this.setHeightAdjustableState(n.getEnumValue(PlaceFeatureEnablement::forValue)); });
        deserializerMap.put("mailboxDetails", (n) -> { this.setMailboxDetails(n.getObjectValue(MailboxDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getObjectValue(PlaceMode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the heightAdjustableState property value. The heightAdjustableState property
     * @return a {@link PlaceFeatureEnablement}
     */
    @jakarta.annotation.Nullable
    public PlaceFeatureEnablement getHeightAdjustableState() {
        return this.backingStore.get("heightAdjustableState");
    }
    /**
     * Gets the mailboxDetails property value. The mailbox object id and email address that are associated with the desk.
     * @return a {@link MailboxDetails}
     */
    @jakarta.annotation.Nullable
    public MailboxDetails getMailboxDetails() {
        return this.backingStore.get("mailboxDetails");
    }
    /**
     * Gets the mode property value. The mode of the desk. The supported modes are:assignedPlaceMode - Desks that are assigned to a user.reservablePlaceMode - Desks that can be booked in advance using desk reservation tools.dropInPlaceMode - First come, first served desks. When you plug into a peripheral on one of these desks, the desk is booked for you, assuming the peripheral is associated with the desk in the Microsoft Teams Rooms pro management portal.unavailablePlaceMode - Desks that are taken down for maintenance or marked as not reservable.
     * @return a {@link PlaceMode}
     */
    @jakarta.annotation.Nullable
    public PlaceMode getMode() {
        return this.backingStore.get("mode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayDeviceName", this.getDisplayDeviceName());
        writer.writeEnumValue("heightAdjustableState", this.getHeightAdjustableState());
        writer.writeObjectValue("mailboxDetails", this.getMailboxDetails());
        writer.writeObjectValue("mode", this.getMode());
    }
    /**
     * Sets the displayDeviceName property value. The name of the display device (for example, monitor or projector) that is available at the desk.
     * @param value Value to set for the displayDeviceName property.
     */
    public void setDisplayDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayDeviceName", value);
    }
    /**
     * Sets the heightAdjustableState property value. The heightAdjustableState property
     * @param value Value to set for the heightAdjustableState property.
     */
    public void setHeightAdjustableState(@jakarta.annotation.Nullable final PlaceFeatureEnablement value) {
        this.backingStore.set("heightAdjustableState", value);
    }
    /**
     * Sets the mailboxDetails property value. The mailbox object id and email address that are associated with the desk.
     * @param value Value to set for the mailboxDetails property.
     */
    public void setMailboxDetails(@jakarta.annotation.Nullable final MailboxDetails value) {
        this.backingStore.set("mailboxDetails", value);
    }
    /**
     * Sets the mode property value. The mode of the desk. The supported modes are:assignedPlaceMode - Desks that are assigned to a user.reservablePlaceMode - Desks that can be booked in advance using desk reservation tools.dropInPlaceMode - First come, first served desks. When you plug into a peripheral on one of these desks, the desk is booked for you, assuming the peripheral is associated with the desk in the Microsoft Teams Rooms pro management portal.unavailablePlaceMode - Desks that are taken down for maintenance or marked as not reservable.
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final PlaceMode value) {
        this.backingStore.set("mode", value);
    }
}
