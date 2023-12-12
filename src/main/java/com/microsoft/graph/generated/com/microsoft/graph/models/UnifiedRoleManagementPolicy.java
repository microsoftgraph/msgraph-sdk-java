package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new UnifiedRoleManagementPolicy and sets the default values.
     */
    public UnifiedRoleManagementPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicy
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicy();
    }
    /**
     * Gets the description property value. Description for the policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the effectiveRules property value. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @return a java.util.List<UnifiedRoleManagementPolicyRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyRule> getEffectiveRules() {
        return this.backingStore.get("effectiveRules");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("effectiveRules", (n) -> { this.setEffectiveRules(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("isOrganizationDefault", (n) -> { this.setIsOrganizationDefault(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isOrganizationDefault property value. This can only be set to true for a single tenant-wide policy which will apply to all scopes and roles. Set the scopeId to / and scopeType to Directory. Supports $filter (eq, ne).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizationDefault() {
        return this.backingStore.get("isOrganizationDefault");
    }
    /**
     * Gets the lastModifiedBy property value. The identity who last modified the role setting.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The time when the role setting was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the rules property value. The collection of rules like approval rules and expiration rules. Supports $expand.
     * @return a java.util.List<UnifiedRoleManagementPolicyRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyRule> getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeId() {
        return this.backingStore.get("scopeId");
    }
    /**
     * Gets the scopeType property value. The type of the scope where the policy is created. One of Directory, DirectoryRole, Group. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeType() {
        return this.backingStore.get("scopeType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("effectiveRules", this.getEffectiveRules());
        writer.writeBooleanValue("isOrganizationDefault", this.getIsOrganizationDefault());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the description property value. Description for the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the effectiveRules property value. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @param value Value to set for the effectiveRules property.
     */
    public void setEffectiveRules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyRule> value) {
        this.backingStore.set("effectiveRules", value);
    }
    /**
     * Sets the isOrganizationDefault property value. This can only be set to true for a single tenant-wide policy which will apply to all scopes and roles. Set the scopeId to / and scopeType to Directory. Supports $filter (eq, ne).
     * @param value Value to set for the isOrganizationDefault property.
     */
    public void setIsOrganizationDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOrganizationDefault", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity who last modified the role setting.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The time when the role setting was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the rules property value. The collection of rules like approval rules and expiration rules. Supports $expand.
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyRule> value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
     * @param value Value to set for the scopeId property.
     */
    public void setScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeId", value);
    }
    /**
     * Sets the scopeType property value. The type of the scope where the policy is created. One of Directory, DirectoryRole, Group. Required.
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeType", value);
    }
}
