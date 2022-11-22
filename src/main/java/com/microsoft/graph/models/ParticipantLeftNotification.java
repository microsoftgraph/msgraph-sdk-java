package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantLeftNotification extends Entity implements Parsable {
    /** The call property */
    private Call _call;
    /** ID of the participant under the policy who has left the meeting. */
    private String _participantId;
    /**
     * Instantiates a new ParticipantLeftNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ParticipantLeftNotification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ParticipantLeftNotification
     */
    @javax.annotation.Nonnull
    public static ParticipantLeftNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantLeftNotification();
    }
    /**
     * Gets the call property value. The call property
     * @return a call
     */
    @javax.annotation.Nullable
    public Call getCall() {
        return this._call;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("call", (n) -> { this.setCall(n.getObjectValue(Call::createFromDiscriminatorValue)); });
        deserializerMap.put("participantId", (n) -> { this.setParticipantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the participantId property value. ID of the participant under the policy who has left the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParticipantId() {
        return this._participantId;
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
        writer.writeObjectValue("call", this.getCall());
        writer.writeStringValue("participantId", this.getParticipantId());
    }
    /**
     * Sets the call property value. The call property
     * @param value Value to set for the call property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCall(@javax.annotation.Nullable final Call value) {
        this._call = value;
    }
    /**
     * Sets the participantId property value. ID of the participant under the policy who has left the meeting.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipantId(@javax.annotation.Nullable final String value) {
        this._participantId = value;
    }
}
