package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallTranscriptEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Unique identifier of the call. */
    private String _callId;
    /** Unique identifier for a call transcript. */
    private String _callTranscriptICalUid;
    /** The organizer of the meeting. */
    private IdentitySet _meetingOrganizer;
    /**
     * Instantiates a new CallTranscriptEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallTranscriptEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callTranscriptEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallTranscriptEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static CallTranscriptEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallTranscriptEventMessageDetail();
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallId() {
        return this._callId;
    }
    /**
     * Gets the callTranscriptICalUid property value. Unique identifier for a call transcript.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallTranscriptICalUid() {
        return this._callTranscriptICalUid;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CallTranscriptEventMessageDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callId", (n) -> { currentObject.setCallId(n.getStringValue()); });
        deserializerMap.put("callTranscriptICalUid", (n) -> { currentObject.setCallTranscriptICalUid(n.getStringValue()); });
        deserializerMap.put("meetingOrganizer", (n) -> { currentObject.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the meetingOrganizer property value. The organizer of the meeting.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this._meetingOrganizer;
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
        writer.writeStringValue("callTranscriptICalUid", this.getCallTranscriptICalUid());
        writer.writeObjectValue("meetingOrganizer", this.getMeetingOrganizer());
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallId(@javax.annotation.Nullable final String value) {
        this._callId = value;
    }
    /**
     * Sets the callTranscriptICalUid property value. Unique identifier for a call transcript.
     * @param value Value to set for the callTranscriptICalUid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallTranscriptICalUid(@javax.annotation.Nullable final String value) {
        this._callTranscriptICalUid = value;
    }
    /**
     * Sets the meetingOrganizer property value. The organizer of the meeting.
     * @param value Value to set for the meetingOrganizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this._meetingOrganizer = value;
    }
}
