package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantJoiningNotification extends Entity implements Parsable {
    /** The call property */
    private Call _call;
    /**
     * Instantiates a new ParticipantJoiningNotification and sets the default values.
     * @return a void
     */
    public ParticipantJoiningNotification() {
        super();
        this.setOdataType("#microsoft.graph.participantJoiningNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ParticipantJoiningNotification
     */
    @javax.annotation.Nonnull
    public static ParticipantJoiningNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantJoiningNotification();
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
        final ParticipantJoiningNotification currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("call", (n) -> { currentObject.setCall(n.getObjectValue(Call::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("call", this.getCall());
    }
    /**
     * Sets the call property value. The call property
     * @param value Value to set for the call property.
     * @return a void
     */
    public void setCall(@javax.annotation.Nullable final Call value) {
        this._call = value;
    }
}
