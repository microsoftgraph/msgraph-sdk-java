package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.IdentitySet;
public class ParticipantEndpoint extends Endpoint implements Parsable {
    /** The feedback provided by the user of this endpoint about the quality of the session. */
    private UserFeedback _feedback;
    /** Identity associated with the endpoint. */
    private IdentitySet _identity;
    /**
     * Instantiates a new ParticipantEndpoint and sets the default values.
     * @return a void
     */
    public ParticipantEndpoint() {
        super();
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
        return this._feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ParticipantEndpoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("feedback", (n) -> { currentObject.setFeedback(n.getObjectValue(UserFeedback::createFromDiscriminatorValue)); });
            this.put("identity", (n) -> { currentObject.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the identity property value. Identity associated with the endpoint.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getIdentity() {
        return this._identity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setFeedback(@javax.annotation.Nullable final UserFeedback value) {
        this._feedback = value;
    }
    /**
     * Sets the identity property value. Identity associated with the endpoint.
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._identity = value;
    }
}
