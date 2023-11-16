package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallRecordingEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Instantiates a new CallRecordingEventMessageDetail and sets the default values.
     */
    public CallRecordingEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callRecordingEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallRecordingEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static CallRecordingEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRecordingEventMessageDetail();
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.BackingStore.get("callId");
    }
    /**
     * Gets the callRecordingDisplayName property value. Display name for the call recording.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallRecordingDisplayName() {
        return this.BackingStore.get("callRecordingDisplayName");
    }
    /**
     * Gets the callRecordingDuration property value. Duration of the call recording.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getCallRecordingDuration() {
        return this.BackingStore.get("callRecordingDuration");
    }
    /**
     * Gets the callRecordingStatus property value. Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
     * @return a CallRecordingStatus
     */
    @jakarta.annotation.Nullable
    public CallRecordingStatus getCallRecordingStatus() {
        return this.BackingStore.get("callRecordingStatus");
    }
    /**
     * Gets the callRecordingUrl property value. Call recording URL.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallRecordingUrl() {
        return this.BackingStore.get("callRecordingUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callRecordingDisplayName", (n) -> { this.setCallRecordingDisplayName(n.getStringValue()); });
        deserializerMap.put("callRecordingDuration", (n) -> { this.setCallRecordingDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("callRecordingStatus", (n) -> { this.setCallRecordingStatus(n.getEnumValue(CallRecordingStatus.class)); });
        deserializerMap.put("callRecordingUrl", (n) -> { this.setCallRecordingUrl(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingOrganizer", (n) -> { this.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.BackingStore.get("initiator");
    }
    /**
     * Gets the meetingOrganizer property value. Organizer of the meeting.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this.BackingStore.get("meetingOrganizer");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callRecordingDisplayName", this.getCallRecordingDisplayName());
        writer.writePeriodAndDurationValue("callRecordingDuration", this.getCallRecordingDuration());
        writer.writeEnumValue("callRecordingStatus", this.getCallRecordingStatus());
        writer.writeStringValue("callRecordingUrl", this.getCallRecordingUrl());
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeObjectValue("meetingOrganizer", this.getMeetingOrganizer());
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("callId", value);
    }
    /**
     * Sets the callRecordingDisplayName property value. Display name for the call recording.
     * @param value Value to set for the callRecordingDisplayName property.
     */
    public void setCallRecordingDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("callRecordingDisplayName", value);
    }
    /**
     * Sets the callRecordingDuration property value. Duration of the call recording.
     * @param value Value to set for the callRecordingDuration property.
     */
    public void setCallRecordingDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("callRecordingDuration", value);
    }
    /**
     * Sets the callRecordingStatus property value. Status of the call recording. Possible values are: success, failure, initial, chunkFinished, unknownFutureValue.
     * @param value Value to set for the callRecordingStatus property.
     */
    public void setCallRecordingStatus(@jakarta.annotation.Nullable final CallRecordingStatus value) {
        this.BackingStore.set("callRecordingStatus", value);
    }
    /**
     * Sets the callRecordingUrl property value. Call recording URL.
     * @param value Value to set for the callRecordingUrl property.
     */
    public void setCallRecordingUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("callRecordingUrl", value);
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("initiator", value);
    }
    /**
     * Sets the meetingOrganizer property value. Organizer of the meeting.
     * @param value Value to set for the meetingOrganizer property.
     */
    public void setMeetingOrganizer(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("meetingOrganizer", value);
    }
}
