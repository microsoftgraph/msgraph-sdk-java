package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantEndpoint extends Endpoint implements Parsable {
    /** The feedback provided by the user of this endpoint about the quality of the session. */
    private UserFeedback feedback;
    /** Identity associated with the endpoint. */
    private IdentitySet identity;
    /**
     * Instantiates a new ParticipantEndpoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ParticipantEndpoint() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.participantEndpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ParticipantEndpoint
     */
    @javax.annotation.Nonnull
    public static ParticipantEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantEndpoint();
    }
    /**
     * Gets the feedback property value. The feedback provided by the user of this endpoint about the quality of the session.
     * @return a userFeedback
     */
    @javax.annotation.Nullable
    public UserFeedback getFeedback() {
        return this.feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getObjectValue(UserFeedback::createFromDiscriminatorValue)); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity associated with the endpoint.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getIdentity() {
        return this.identity;
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
        writer.writeObjectValue("feedback", this.getFeedback());
        writer.writeObjectValue("identity", this.getIdentity());
    }
    /**
     * Sets the feedback property value. The feedback provided by the user of this endpoint about the quality of the session.
     * @param value Value to set for the feedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedback(@javax.annotation.Nullable final UserFeedback value) {
        this.feedback = value;
    }
    /**
     * Sets the identity property value. Identity associated with the endpoint.
     * @param value Value to set for the identity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this.identity = value;
    }
}
