package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallEndedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Duration of the call. */
    private Period _callDuration;
    /** Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue. */
    private TeamworkCallEventType _callEventType;
    /** Unique identifier of the call. */
    private String _callId;
    /** List of call participants. */
    private java.util.List<CallParticipantInfo> _callParticipants;
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /**
     * Instantiates a new CallEndedEventMessageDetail and sets the default values.
     * @return a void
     */
    public CallEndedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callEndedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallEndedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static CallEndedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallEndedEventMessageDetail();
    }
    /**
     * Gets the callDuration property value. Duration of the call.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getCallDuration() {
        return this._callDuration;
    }
    /**
     * Gets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @return a teamworkCallEventType
     */
    @javax.annotation.Nullable
    public TeamworkCallEventType getCallEventType() {
        return this._callEventType;
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
     * Gets the callParticipants property value. List of call participants.
     * @return a callParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<CallParticipantInfo> getCallParticipants() {
        return this._callParticipants;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CallEndedEventMessageDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("callDuration", (n) -> { currentObject.setCallDuration(n.getPeriodValue()); });
            this.put("callEventType", (n) -> { currentObject.setCallEventType(n.getEnumValue(TeamworkCallEventType.class)); });
            this.put("callId", (n) -> { currentObject.setCallId(n.getStringValue()); });
            this.put("callParticipants", (n) -> { currentObject.setCallParticipants(n.getCollectionOfObjectValues(CallParticipantInfo::createFromDiscriminatorValue)); });
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodValue("callDuration", this.getCallDuration());
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeCollectionOfObjectValues("callParticipants", this.getCallParticipants());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the callDuration property value. Duration of the call.
     * @param value Value to set for the callDuration property.
     * @return a void
     */
    public void setCallDuration(@javax.annotation.Nullable final Period value) {
        this._callDuration = value;
    }
    /**
     * Sets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @param value Value to set for the callEventType property.
     * @return a void
     */
    public void setCallEventType(@javax.annotation.Nullable final TeamworkCallEventType value) {
        this._callEventType = value;
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     * @return a void
     */
    public void setCallId(@javax.annotation.Nullable final String value) {
        this._callId = value;
    }
    /**
     * Sets the callParticipants property value. List of call participants.
     * @param value Value to set for the callParticipants property.
     * @return a void
     */
    public void setCallParticipants(@javax.annotation.Nullable final java.util.List<CallParticipantInfo> value) {
        this._callParticipants = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
}
