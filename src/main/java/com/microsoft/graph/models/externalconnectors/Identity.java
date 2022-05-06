package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Identity extends Entity implements Parsable {
    /** The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.  */
    private IdentityType _type;
    /**
     * Instantiates a new identity and sets the default values.
     * @return a void
     */
    public Identity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identity
     */
    @javax.annotation.Nonnull
    public static Identity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Identity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Identity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(IdentityType.class)); });
        }};
    }
    /**
     * Gets the type property value. The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.
     * @return a identityType
     */
    @javax.annotation.Nullable
    public IdentityType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the type property value. The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final IdentityType value) {
        this._type = value;
    }
}
