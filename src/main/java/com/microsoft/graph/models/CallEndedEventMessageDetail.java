package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallEndedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Duration of the call.
     */
    private PeriodAndDuration callDuration;
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
     * Instantiates a new CallEndedEventMessageDetail and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static CallEndedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallEndedEventMessageDetail();
    }
    /**
     * Gets the callDuration property value. Duration of the call.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getCallDuration() {
        return this.callDuration;
    }
    /**
     * Gets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @return a TeamworkCallEventType
     */
    @jakarta.annotation.Nullable
    public TeamworkCallEventType getCallEventType() {
        return this.callEventType;
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.callId;
    }
    /**
     * Gets the callParticipants property value. List of call participants.
     * @return a java.util.List<CallParticipantInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallParticipantInfo> getCallParticipants() {
        return this.callParticipants;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callDuration", (n) -> { this.setCallDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("callEventType", (n) -> { this.setCallEventType(n.getEnumValue(TeamworkCallEventType.class)); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callParticipants", (n) -> { this.setCallParticipants(n.getCollectionOfObjectValues(CallParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("callDuration", this.getCallDuration());
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeCollectionOfObjectValues("callParticipants", this.getCallParticipants());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the callDuration property value. Duration of the call.
     * @param value Value to set for the callDuration property.
     */
    public void setCallDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.callDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @param value Value to set for the callEventType property.
     */
    public void setCallEventType(@jakarta.annotation.Nullable final TeamworkCallEventType value) {
        this.callEventType = value;
    }
    /**
     * Sets the callId property value. Unique identifier of the call.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.callId = value;
    }
    /**
     * Sets the callParticipants property value. List of call participants.
     * @param value Value to set for the callParticipants property.
     */
    public void setCallParticipants(@jakarta.annotation.Nullable final java.util.List<CallParticipantInfo> value) {
        this.callParticipants = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
