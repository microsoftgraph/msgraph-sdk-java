package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RestrictedSignIn extends SignIn implements Parsable {
    /** The targetTenantId property */
    private String _targetTenantId;
    /**
     * Instantiates a new restrictedSignIn and sets the default values.
     * @return a void
     */
    public RestrictedSignIn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a restrictedSignIn
     */
    @javax.annotation.Nonnull
    public static RestrictedSignIn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestrictedSignIn();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RestrictedSignIn currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("targetTenantId", (n) -> { currentObject.setTargetTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the targetTenantId property value. The targetTenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetTenantId() {
        return this._targetTenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetTenantId", this.getTargetTenantId());
    }
    /**
     * Sets the targetTenantId property value. The targetTenantId property
     * @param value Value to set for the targetTenantId property.
     * @return a void
     */
    public void setTargetTenantId(@javax.annotation.Nullable final String value) {
        this._targetTenantId = value;
    }
}
