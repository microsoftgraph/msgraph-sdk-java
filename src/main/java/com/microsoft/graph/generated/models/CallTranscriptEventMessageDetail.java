package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallTranscriptEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Instantiates a new {@link CallTranscriptEventMessageDetail} and sets the default values.
     */
    public CallTranscriptEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callTranscriptEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallTranscriptEventMessageDetail}
     */
    @jakarta.annotation.Nonnull
    public static CallTranscriptEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallTranscriptEventMessageDetail();
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.backingStore.get("callId");
    }
    /**
     * Gets the callTranscriptICalUid property value. Unique identifier for a call transcript.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallTranscriptICalUid() {
        return this.backingStore.get("callTranscriptICalUid");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callTranscriptICalUid", (n) -> { this.setCallTranscriptICalUid(n.getStringValue()); });
        deserializerMap.put("meetingOrganizer", (n) -> { this.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the meetingOrganizer property value. The organizer of the meeting.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this.backingStore.get("meetingOrganizer");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callTranscriptICalUid", this.getCallTranscriptICalUid());
        writer.writeObjectValue("meetingOrganizer", this.getMeetingOrganizer());
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callId", value);
    }
    /**
     * Sets the callTranscriptICalUid property value. Unique identifier for a call transcript.
     * @param value Value to set for the callTranscriptICalUid property.
     */
    public void setCallTranscriptICalUid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callTranscriptICalUid", value);
    }
    /**
     * Sets the meetingOrganizer property value. The organizer of the meeting.
     * @param value Value to set for the meetingOrganizer property.
     */
    public void setMeetingOrganizer(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("meetingOrganizer", value);
    }
}
