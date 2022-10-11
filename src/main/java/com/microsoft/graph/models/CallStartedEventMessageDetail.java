package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallStartedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue. */
    private TeamworkCallEventType _callEventType;
    /** Unique identifier of the call. */
    private String _callId;
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /**
     * Instantiates a new CallStartedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallStartedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.callStartedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallStartedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static CallStartedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallStartedEventMessageDetail();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CallStartedEventMessageDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("callEventType", (n) -> { currentObject.setCallEventType(n.getEnumValue(TeamworkCallEventType.class)); });
            this.put("callId", (n) -> { currentObject.setCallId(n.getStringValue()); });
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the callEventType property value. Represents the call event type. Possible values are: call, meeting, screenShare, unknownFutureValue.
     * @param value Value to set for the callEventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallEventType(@javax.annotation.Nullable final TeamworkCallEventType value) {
        this._callEventType = value;
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
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
}
