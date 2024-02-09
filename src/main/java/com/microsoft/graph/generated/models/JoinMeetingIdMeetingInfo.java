package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JoinMeetingIdMeetingInfo extends MeetingInfo implements Parsable {
    /**
     * Instantiates a new {@link JoinMeetingIdMeetingInfo} and sets the default values.
     */
    public JoinMeetingIdMeetingInfo() {
        super();
        this.setOdataType("#microsoft.graph.joinMeetingIdMeetingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link JoinMeetingIdMeetingInfo}
     */
    @jakarta.annotation.Nonnull
    public static JoinMeetingIdMeetingInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("joinMeetingId", (n) -> { this.setJoinMeetingId(n.getStringValue()); });
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinMeetingId property value. The ID used to join the meeting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoinMeetingId() {
        return this.backingStore.get("joinMeetingId");
    }
    /**
     * Gets the passcode property value. The passcode used to join the meeting. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.backingStore.get("passcode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the joinMeetingId property value. The ID used to join the meeting.
     * @param value Value to set for the joinMeetingId property.
     */
    public void setJoinMeetingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joinMeetingId", value);
    }
    /**
     * Sets the passcode property value. The passcode used to join the meeting. Optional.
     * @param value Value to set for the passcode property.
     */
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passcode", value);
    }
}
