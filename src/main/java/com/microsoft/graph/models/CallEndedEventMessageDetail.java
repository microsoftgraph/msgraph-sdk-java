package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallEndedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Duration of the call.
     */
    private Period callDuration;
    /**
     * Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     */
    private TeamworkCallEventType callEventType;
    /**
     * Unique identifier of the call.
     */
    private String callId;
    /**
     * List of call participants.
     */
    private java.util.List<CallParticipantInfo> callParticipants;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Instantiates a new callEndedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallEndedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callEndedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callEndedEventMessageDetail
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
        return this.callDuration;
    }
    /**
     * Gets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @return a teamworkCallEventType
     */
    @javax.annotation.Nullable
    public TeamworkCallEventType getCallEventType() {
        return this.callEventType;
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
     * Gets the callParticipants property value. List of call participants.
     * @return a callParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<CallParticipantInfo> getCallParticipants() {
        return this.callParticipants;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callDuration", (n) -> { this.setCallDuration(n.getPeriodValue()); });
        deserializerMap.put("callEventType", (n) -> { this.setCallEventType(n.getEnumValue(TeamworkCallEventType.class)); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callParticipants", (n) -> { this.setCallParticipants(n.getCollectionOfObjectValues(CallParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setCallDuration(@javax.annotation.Nullable final Period value) {
        this.callDuration = value;
    }
    /**
     * Sets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @param value Value to set for the callEventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallEventType(@javax.annotation.Nullable final TeamworkCallEventType value) {
        this.callEventType = value;
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
     * Sets the callParticipants property value. List of call participants.
     * @param value Value to set for the callParticipants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallParticipants(@javax.annotation.Nullable final java.util.List<CallParticipantInfo> value) {
        this.callParticipants = value;
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
}
