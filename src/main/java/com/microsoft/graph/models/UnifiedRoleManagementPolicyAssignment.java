package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyAssignment extends Entity implements Parsable {
    /** The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy. */
    private UnifiedRoleManagementPolicy policy;
    /** The id of the policy. Inherited from entity. */
    private String policyId;
    /** The identifier of the role definition object where the policy applies. If not specified, the policy applies to all roles. Supports $filter (eq). */
    private String roleDefinitionId;
    /** The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required. */
    private String scopeId;
    /** The type of the scope where the policy is assigned. One of Directory, DirectoryRole. Required. */
    private String scopeType;
    /**
     * Instantiates a new unifiedRoleManagementPolicyAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicyAssignment
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a unifiedRoleManagementPolicy
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicy getPolicy() {
        return this.policy;
    }
    /**
     * Gets the policyId property value. The id of the policy. Inherited from entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the roleDefinitionId property value. The identifier of the role definition object where the policy applies. If not specified, the policy applies to all roles. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The type of the scope where the policy is assigned. One of Directory, DirectoryRole. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicy(@javax.annotation.Nullable final UnifiedRoleManagementPolicy value) {
        this.policy = value;
    }
    /**
     * Sets the policyId property value. The id of the policy. Inherited from entity.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the roleDefinitionId property value. The identifier of the role definition object where the policy applies. If not specified, the policy applies to all roles. Supports $filter (eq).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the policy is assigned.  Can be / for the tenant or a group ID. Required.
     * @param value Value to set for the scopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeId(@javax.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of the scope where the policy is assigned. One of Directory, DirectoryRole. Required.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}
