package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallRecordingEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Unique identifier of the call.
     */
    private String callId;
    /**
     * Display name for the call recording.
     */
    private String callRecordingDisplayName;
    /**
     * Duration of the call recording.
     */
    private Period callRecordingDuration;
    /**
     * Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
     */
    private CallRecordingStatus callRecordingStatus;
    /**
     * Call recording URL.
     */
    private String callRecordingUrl;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Organizer of the meeting.
     */
    private IdentitySet meetingOrganizer;
    /**
     * Instantiates a new CallRecordingEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallRecordingEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callRecordingEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallRecordingEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static CallRecordingEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRecordingEventMessageDetail();
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallId() {
        return this.callId;
    }
    /**
     * Gets the callRecordingDisplayName property value. Display name for the call recording.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallRecordingDisplayName() {
        return this.callRecordingDisplayName;
    }
    /**
     * Gets the callRecordingDuration property value. Duration of the call recording.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getCallRecordingDuration() {
        return this.callRecordingDuration;
    }
    /**
     * Gets the callRecordingStatus property value. Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
     * @return a callRecordingStatus
     */
    @javax.annotation.Nullable
    public CallRecordingStatus getCallRecordingStatus() {
        return this.callRecordingStatus;
    }
    /**
     * Gets the callRecordingUrl property value. Call recording URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallRecordingUrl() {
        return this.callRecordingUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callRecordingDisplayName", (n) -> { this.setCallRecordingDisplayName(n.getStringValue()); });
        deserializerMap.put("callRecordingDuration", (n) -> { this.setCallRecordingDuration(n.getPeriodValue()); });
        deserializerMap.put("callRecordingStatus", (n) -> { this.setCallRecordingStatus(n.getEnumValue(CallRecordingStatus.class)); });
        deserializerMap.put("callRecordingUrl", (n) -> { this.setCallRecordingUrl(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingOrganizer", (n) -> { this.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the meetingOrganizer property value. Organizer of the meeting.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this.meetingOrganizer;
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
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callRecordingDisplayName", this.getCallRecordingDisplayName());
        writer.writePeriodValue("callRecordingDuration", this.getCallRecordingDuration());
        writer.writeEnumValue("callRecordingStatus", this.getCallRecordingStatus());
        writer.writeStringValue("callRecordingUrl", this.getCallRecordingUrl());
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeObjectValue("meetingOrganizer", this.getMeetingOrganizer());
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallId(@javax.annotation.Nullable final String value) {
        this.callId = value;
    }
    /**
     * Sets the callRecordingDisplayName property value. Display name for the call recording.
     * @param value Value to set for the callRecordingDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallRecordingDisplayName(@javax.annotation.Nullable final String value) {
        this.callRecordingDisplayName = value;
    }
    /**
     * Sets the callRecordingDuration property value. Duration of the call recording.
     * @param value Value to set for the callRecordingDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallRecordingDuration(@javax.annotation.Nullable final Period value) {
        this.callRecordingDuration = value;
    }
    /**
     * Sets the callRecordingStatus property value. Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
     * @param value Value to set for the callRecordingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallRecordingStatus(@javax.annotation.Nullable final CallRecordingStatus value) {
        this.callRecordingStatus = value;
    }
    /**
     * Sets the callRecordingUrl property value. Call recording URL.
     * @param value Value to set for the callRecordingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallRecordingUrl(@javax.annotation.Nullable final String value) {
        this.callRecordingUrl = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the meetingOrganizer property value. Organizer of the meeting.
     * @param value Value to set for the meetingOrganizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this.meetingOrganizer = value;
    }
}
