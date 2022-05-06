package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Initiator extends Identity implements Parsable {
    /** Type of initiator. Possible values are: user, application, system, unknownFutureValue.  */
    private InitiatorType _initiatorType;
    /**
     * Instantiates a new initiator and sets the default values.
     * @return a void
     */
    public Initiator() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a initiator
     */
    @javax.annotation.Nonnull
    public static Initiator createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Initiator();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Initiator currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("initiatorType", (n) -> { currentObject.setInitiatorType(n.getEnumValue(InitiatorType.class)); });
        }};
    }
    /**
     * Gets the initiatorType property value. Type of initiator. Possible values are: user, application, system, unknownFutureValue.
     * @return a initiatorType
     */
    @javax.annotation.Nullable
    public InitiatorType getInitiatorType() {
        return this._initiatorType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("initiatorType", this.getInitiatorType());
    }
    /**
     * Sets the initiatorType property value. Type of initiator. Possible values are: user, application, system, unknownFutureValue.
     * @param value Value to set for the initiatorType property.
     * @return a void
     */
    public void setInitiatorType(@javax.annotation.Nullable final InitiatorType value) {
        this._initiatorType = value;
    }
}
