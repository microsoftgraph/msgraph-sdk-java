package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyAssignment extends Entity implements Parsable {
    /**
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     */
    private UnifiedRoleManagementPolicy policy;
    /**
     * The id of the policy. Inherited from entity.
     */
    private String policyId;
    /**
     * For Azure AD roles policy, it's the identifier of the role definition object where the policy applies. For PIM for groups membership and ownership, it's either member or owner. Supports $filter (eq).
     */
    private String roleDefinitionId;
    /**
     * The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required.
     */
    private String scopeId;
    /**
     * The type of the scope where the policy is assigned. One of Directory, DirectoryRole, Group. Required.
     */
    private String scopeType;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyAssignment and sets the default values.
     */
    public UnifiedRoleManagementPolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyAssignment
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     * @return a UnifiedRoleManagementPolicy
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementPolicy getPolicy() {
        return this.policy;
    }
    /**
     * Gets the policyId property value. The id of the policy. Inherited from entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the roleDefinitionId property value. For Azure AD roles policy, it's the identifier of the role definition object where the policy applies. For PIM for groups membership and ownership, it's either member or owner. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The type of the scope where the policy is assigned. One of Directory, DirectoryRole, Group. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the policy property value. The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final UnifiedRoleManagementPolicy value) {
        this.policy = value;
    }
    /**
     * Sets the policyId property value. The id of the policy. Inherited from entity.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the roleDefinitionId property value. For Azure AD roles policy, it's the identifier of the role definition object where the policy applies. For PIM for groups membership and ownership, it's either member or owner. Supports $filter (eq).
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required.
     * @param value Value to set for the scopeId property.
     */
    public void setScopeId(@jakarta.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of the scope where the policy is assigned. One of Directory, DirectoryRole, Group. Required.
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}
