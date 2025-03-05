package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleManagementPolicyRule} and sets the default values.
     */
    public UnifiedRoleManagementPolicyRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementPolicyRule}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.unifiedRoleManagementPolicyApprovalRule": return new UnifiedRoleManagementPolicyApprovalRule();
                case "#microsoft.graph.unifiedRoleManagementPolicyAuthenticationContextRule": return new UnifiedRoleManagementPolicyAuthenticationContextRule();
                case "#microsoft.graph.unifiedRoleManagementPolicyEnablementRule": return new UnifiedRoleManagementPolicyEnablementRule();
                case "#microsoft.graph.unifiedRoleManagementPolicyExpirationRule": return new UnifiedRoleManagementPolicyExpirationRule();
                case "#microsoft.graph.unifiedRoleManagementPolicyNotificationRule": return new UnifiedRoleManagementPolicyNotificationRule();
            }
        }
        return new UnifiedRoleManagementPolicyRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(UnifiedRoleManagementPolicyRuleTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. Defines details of scope that&apos;s targeted by role management policy rule. The details can include the principal type, the role assignment type, and actions affecting a role. Supports $filter (eq, ne).
     * @return a {@link UnifiedRoleManagementPolicyRuleTarget}
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicyRuleTarget getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. Defines details of scope that&apos;s targeted by role management policy rule. The details can include the principal type, the role assignment type, and actions affecting a role. Supports $filter (eq, ne).
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final UnifiedRoleManagementPolicyRuleTarget value) {
        this.backingStore.set("target", value);
    }
}
