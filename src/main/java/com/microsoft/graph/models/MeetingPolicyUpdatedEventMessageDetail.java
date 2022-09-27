package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingPolicyUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** Represents whether the meeting chat is enabled or not. */
    private Boolean _meetingChatEnabled;
    /** Unique identifier of the meeting chat. */
    private String _meetingChatId;
    /**
     * Instantiates a new MeetingPolicyUpdatedEventMessageDetail and sets the default values.
     * @return a void
     */
    public MeetingPolicyUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.meetingPolicyUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingPolicyUpdatedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static MeetingPolicyUpdatedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingPolicyUpdatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingPolicyUpdatedEventMessageDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("meetingChatEnabled", (n) -> { currentObject.setMeetingChatEnabled(n.getBooleanValue()); });
            this.put("meetingChatId", (n) -> { currentObject.setMeetingChatId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
    }
    /**
     * Gets the meetingChatEnabled property value. Represents whether the meeting chat is enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMeetingChatEnabled() {
        return this._meetingChatEnabled;
    }
    /**
     * Gets the meetingChatId property value. Unique identifier of the meeting chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeetingChatId() {
        return this._meetingChatId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeBooleanValue("meetingChatEnabled", this.getMeetingChatEnabled());
        writer.writeStringValue("meetingChatId", this.getMeetingChatId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
    /**
     * Sets the meetingChatEnabled property value. Represents whether the meeting chat is enabled or not.
     * @param value Value to set for the meetingChatEnabled property.
     * @return a void
     */
    public void setMeetingChatEnabled(@javax.annotation.Nullable final Boolean value) {
        this._meetingChatEnabled = value;
    }
    /**
     * Sets the meetingChatId property value. Unique identifier of the meeting chat.
     * @param value Value to set for the meetingChatId property.
     * @return a void
     */
    public void setMeetingChatId(@javax.annotation.Nullable final String value) {
        this._meetingChatId = value;
    }
}
