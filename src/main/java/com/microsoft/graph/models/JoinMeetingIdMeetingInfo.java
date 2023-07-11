package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class JoinMeetingIdMeetingInfo extends MeetingInfo implements Parsable {
    /**
     * The ID used to join the meeting.
     */
    private String joinMeetingId;
    /**
     * The passcode used to join the meeting. Optional.
     */
    private String passcode;
    /**
     * Instantiates a new joinMeetingIdMeetingInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public JoinMeetingIdMeetingInfo() {
        super();
        this.setOdataType("#microsoft.graph.joinMeetingIdMeetingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a joinMeetingIdMeetingInfo
     */
    @javax.annotation.Nonnull
    public static JoinMeetingIdMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("joinMeetingId", (n) -> { this.setJoinMeetingId(n.getStringValue()); });
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinMeetingId property value. The ID used to join the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinMeetingId() {
        return this.joinMeetingId;
    }
    /**
     * Gets the passcode property value. The passcode used to join the meeting. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasscode() {
        return this.passcode;
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
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the joinMeetingId property value. The ID used to join the meeting.
     * @param value Value to set for the joinMeetingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinMeetingId(@javax.annotation.Nullable final String value) {
        this.joinMeetingId = value;
    }
    /**
     * Sets the passcode property value. The passcode used to join the meeting. Optional.
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this.passcode = value;
    }
}
