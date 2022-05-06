package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodConfiguration extends Entity implements Parsable {
    /** The state of the policy. Possible values are: enabled, disabled.  */
    private AuthenticationMethodState _state;
    /**
     * Instantiates a new authenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    public AuthenticationMethodConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationMethodConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AuthenticationMethodState.class)); });
        }};
    }
    /**
     * Gets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @return a authenticationMethodState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final AuthenticationMethodState value) {
        this._state = value;
    }
}
