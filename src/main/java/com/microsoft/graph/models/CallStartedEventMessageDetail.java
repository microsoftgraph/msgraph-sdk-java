package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallStartedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     */
    private TeamworkCallEventType callEventType;
    /**
     * Unique identifier of the call.
     */
    private String callId;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Instantiates a new callStartedEventMessageDetail and sets the default values.
     */
    public CallStartedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callStartedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callStartedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static CallStartedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallStartedEventMessageDetail();
    }
    /**
     * Gets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @return a teamworkCallEventType
     */
    @jakarta.annotation.Nullable
    public TeamworkCallEventType getCallEventType() {
        return this.callEventType;
    }
    /**
     * Gets the callId property value. Unique identifier of the call.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.callId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callEventType", (n) -> { this.setCallEventType(n.getEnumValue(TeamworkCallEventType.class)); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
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
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeObjectValue("initiator", this.getInitiator());
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
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
