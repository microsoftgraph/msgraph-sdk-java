package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Presence extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Presence} and sets the default values.
     */
    public Presence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Presence}
     */
    @jakarta.annotation.Nonnull
    public static Presence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Presence();
    }
    /**
     * Gets the activity property value. The supplemental information to a user's availability. Possible values are Available, Away, BeRightBack, Busy, DoNotDisturb, InACall, InAConferenceCall, Inactive, InAMeeting, Offline, OffWork, OutOfOffice, PresenceUnknown, Presenting, UrgentInterruptionsOnly.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the availability property value. The base presence information for a user. Possible values are Available, AvailableIdle,  Away, BeRightBack, Busy, BusyIdle, DoNotDisturb, Offline, PresenceUnknown
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailability() {
        return this.backingStore.get("availability");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getStringValue()); });
        deserializerMap.put("statusMessage", (n) -> { this.setStatusMessage(n.getObjectValue(PresenceStatusMessage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the statusMessage property value. The presence status message of a user.
     * @return a {@link PresenceStatusMessage}
     */
    @jakarta.annotation.Nullable
    public PresenceStatusMessage getStatusMessage() {
        return this.backingStore.get("statusMessage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeStringValue("availability", this.getAvailability());
        writer.writeObjectValue("statusMessage", this.getStatusMessage());
    }
    /**
     * Sets the activity property value. The supplemental information to a user's availability. Possible values are Available, Away, BeRightBack, Busy, DoNotDisturb, InACall, InAConferenceCall, Inactive, InAMeeting, Offline, OffWork, OutOfOffice, PresenceUnknown, Presenting, UrgentInterruptionsOnly.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the availability property value. The base presence information for a user. Possible values are Available, AvailableIdle,  Away, BeRightBack, Busy, BusyIdle, DoNotDisturb, Offline, PresenceUnknown
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("availability", value);
    }
    /**
     * Sets the statusMessage property value. The presence status message of a user.
     * @param value Value to set for the statusMessage property.
     */
    public void setStatusMessage(@jakarta.annotation.Nullable final PresenceStatusMessage value) {
        this.backingStore.set("statusMessage", value);
    }
}
