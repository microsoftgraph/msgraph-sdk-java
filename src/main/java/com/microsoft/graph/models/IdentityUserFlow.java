package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityUserFlow extends Entity implements Parsable {
    /** The userFlowType property */
    private UserFlowType _userFlowType;
    /** The userFlowTypeVersion property */
    private Float _userFlowTypeVersion;
    /**
     * Instantiates a new identityUserFlow and sets the default values.
     * @return a void
     */
    public IdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityUserFlow
     */
    @javax.annotation.Nonnull
    public static IdentityUserFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityUserFlow();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityUserFlow currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("userFlowType", (n) -> { currentObject.setUserFlowType(n.getEnumValue(UserFlowType.class)); });
            this.put("userFlowTypeVersion", (n) -> { currentObject.setUserFlowTypeVersion(n.getFloatValue()); });
        }};
    }
    /**
     * Gets the userFlowType property value. The userFlowType property
     * @return a userFlowType
     */
    @javax.annotation.Nullable
    public UserFlowType getUserFlowType() {
        return this._userFlowType;
    }
    /**
     * Gets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getUserFlowTypeVersion() {
        return this._userFlowTypeVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userFlowType", this.getUserFlowType());
        writer.writeFloatValue("userFlowTypeVersion", this.getUserFlowTypeVersion());
    }
    /**
     * Sets the userFlowType property value. The userFlowType property
     * @param value Value to set for the userFlowType property.
     * @return a void
     */
    public void setUserFlowType(@javax.annotation.Nullable final UserFlowType value) {
        this._userFlowType = value;
    }
    /**
     * Sets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @param value Value to set for the userFlowTypeVersion property.
     * @return a void
     */
    public void setUserFlowTypeVersion(@javax.annotation.Nullable final Float value) {
        this._userFlowTypeVersion = value;
    }
}
