package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationFlowsPolicy extends Entity implements Parsable {
    /** Inherited property. A description of the policy. This property is not a key. Optional. Read-only.  */
    private String _description;
    /** Inherited property. The human-readable name of the policy. This property is not a key. Optional. Read-only.  */
    private String _displayName;
    /** Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. This property is not a key. Optional. Read-only.  */
    private SelfServiceSignUpAuthenticationFlowConfiguration _selfServiceSignUp;
    /**
     * Instantiates a new authenticationFlowsPolicy and sets the default values.
     * @return a void
     */
    public AuthenticationFlowsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationFlowsPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationFlowsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationFlowsPolicy();
    }
    /**
     * Gets the description property value. Inherited property. A description of the policy. This property is not a key. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Inherited property. The human-readable name of the policy. This property is not a key. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationFlowsPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("selfServiceSignUp", (n) -> { currentObject.setSelfServiceSignUp(n.getObjectValue(SelfServiceSignUpAuthenticationFlowConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the selfServiceSignUp property value. Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. This property is not a key. Optional. Read-only.
     * @return a selfServiceSignUpAuthenticationFlowConfiguration
     */
    @javax.annotation.Nullable
    public SelfServiceSignUpAuthenticationFlowConfiguration getSelfServiceSignUp() {
        return this._selfServiceSignUp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("selfServiceSignUp", this.getSelfServiceSignUp());
    }
    /**
     * Sets the description property value. Inherited property. A description of the policy. This property is not a key. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Inherited property. The human-readable name of the policy. This property is not a key. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the selfServiceSignUp property value. Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. This property is not a key. Optional. Read-only.
     * @param value Value to set for the selfServiceSignUp property.
     * @return a void
     */
    public void setSelfServiceSignUp(@javax.annotation.Nullable final SelfServiceSignUpAuthenticationFlowConfiguration value) {
        this._selfServiceSignUp = value;
    }
}
