package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyRule extends Entity implements Parsable {
    /** The target for the policy rule. */
    private UnifiedRoleManagementPolicyRuleTarget _target;
    /**
     * Instantiates a new unifiedRoleManagementPolicyRule and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicyRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicyRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyRule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(UnifiedRoleManagementPolicyRuleTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the target property value. The target for the policy rule.
     * @return a unifiedRoleManagementPolicyRuleTarget
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicyRuleTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. The target for the policy rule.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final UnifiedRoleManagementPolicyRuleTarget value) {
        this._target = value;
    }
}
