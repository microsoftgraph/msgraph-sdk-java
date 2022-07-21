package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyAuthenticationContextRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** The value of the authentication context claim. */
    private String _claimValue;
    /** Whether this rule is enabled. */
    private Boolean _isEnabled;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyAuthenticationContextRule and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicyAuthenticationContextRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyAuthenticationContextRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyAuthenticationContextRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyAuthenticationContextRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyAuthenticationContextRule();
    }
    /**
     * Gets the claimValue property value. The value of the authentication context claim.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClaimValue() {
        return this._claimValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyAuthenticationContextRule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("claimValue", (n) -> { currentObject.setClaimValue(n.getStringValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. Whether this rule is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("claimValue", this.getClaimValue());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the claimValue property value. The value of the authentication context claim.
     * @param value Value to set for the claimValue property.
     * @return a void
     */
    public void setClaimValue(@javax.annotation.Nullable final String value) {
        this._claimValue = value;
    }
    /**
     * Sets the isEnabled property value. Whether this rule is enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
}
