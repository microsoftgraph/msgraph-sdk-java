package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeeting extends OnlineMeetingBase implements Parsable {
    /**
     * Instantiates a new {@link OnlineMeeting} and sets the default values.
     */
    public OnlineMeeting() {
        super();
        this.setOdataType("#microsoft.graph.onlineMeeting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnlineMeeting}
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeeting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeeting();
    }
    /**
     * Gets the attendeeReport property value. The content stream of the attendee report of a Microsoft Teams live event. Read-only.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getAttendeeReport() {
        return this.backingStore.get("attendeeReport");
    }
    /**
     * Gets the broadcastSettings property value. Settings related to a live event.
     * @return a {@link BroadcastMeetingSettings}
     */
    @jakarta.annotation.Nullable
    public BroadcastMeetingSettings getBroadcastSettings() {
        return this.backingStore.get("broadcastSettings");
    }
    /**
     * Gets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.backingStore.get("creationDateTime");
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC. Required when you create an online meeting.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the externalId property value. The external ID that is a custom identifier. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attendeeReport", (n) -> { this.setAttendeeReport(n.getByteArrayValue()); });
        deserializerMap.put("broadcastSettings", (n) -> { this.setBroadcastSettings(n.getObjectValue(BroadcastMeetingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("isBroadcast", (n) -> { this.setIsBroadcast(n.getBooleanValue()); });
        deserializerMap.put("meetingTemplateId", (n) -> { this.setMeetingTemplateId(n.getStringValue()); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
        deserializerMap.put("recordings", (n) -> { this.setRecordings(n.getCollectionOfObjectValues(CallRecording::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("transcripts", (n) -> { this.setTranscripts(n.getCollectionOfObjectValues(CallTranscript::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBroadcast property value. Indicates whether this meeting is a Teams live event.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBroadcast() {
        return this.backingStore.get("isBroadcast");
    }
    /**
     * Gets the meetingTemplateId property value. The ID of the meeting template.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMeetingTemplateId() {
        return this.backingStore.get("meetingTemplateId");
    }
    /**
     * Gets the participants property value. The participants associated with the online meeting, including the organizer and the attendees.
     * @return a {@link MeetingParticipants}
     */
    @jakarta.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Gets the recordings property value. The recordings of an online meeting. Read-only.
     * @return a {@link java.util.List<CallRecording>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallRecording> getRecordings() {
        return this.backingStore.get("recordings");
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @return a {@link java.util.List<CallTranscript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallTranscript> getTranscripts() {
        return this.backingStore.get("transcripts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("attendeeReport", this.getAttendeeReport());
        writer.writeObjectValue("broadcastSettings", this.getBroadcastSettings());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeBooleanValue("isBroadcast", this.getIsBroadcast());
        writer.writeStringValue("meetingTemplateId", this.getMeetingTemplateId());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeCollectionOfObjectValues("recordings", this.getRecordings());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
    }
    /**
     * Sets the attendeeReport property value. The content stream of the attendee report of a Microsoft Teams live event. Read-only.
     * @param value Value to set for the attendeeReport property.
     */
    public void setAttendeeReport(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("attendeeReport", value);
    }
    /**
     * Sets the broadcastSettings property value. Settings related to a live event.
     * @param value Value to set for the broadcastSettings property.
     */
    public void setBroadcastSettings(@jakarta.annotation.Nullable final BroadcastMeetingSettings value) {
        this.backingStore.set("broadcastSettings", value);
    }
    /**
     * Sets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("creationDateTime", value);
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC. Required when you create an online meeting.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the externalId property value. The external ID that is a custom identifier. Optional.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the isBroadcast property value. Indicates whether this meeting is a Teams live event.
     * @param value Value to set for the isBroadcast property.
     */
    public void setIsBroadcast(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBroadcast", value);
    }
    /**
     * Sets the meetingTemplateId property value. The ID of the meeting template.
     * @param value Value to set for the meetingTemplateId property.
     */
    public void setMeetingTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("meetingTemplateId", value);
    }
    /**
     * Sets the participants property value. The participants associated with the online meeting, including the organizer and the attendees.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final MeetingParticipants value) {
        this.backingStore.set("participants", value);
    }
    /**
     * Sets the recordings property value. The recordings of an online meeting. Read-only.
     * @param value Value to set for the recordings property.
     */
    public void setRecordings(@jakarta.annotation.Nullable final java.util.List<CallRecording> value) {
        this.backingStore.set("recordings", value);
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @param value Value to set for the transcripts property.
     */
    public void setTranscripts(@jakarta.annotation.Nullable final java.util.List<CallTranscript> value) {
        this.backingStore.set("transcripts", value);
    }
}
