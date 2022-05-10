package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicy extends Entity implements Parsable {
    /** Description for the policy. */
    private String _description;
    /** Display name for the policy. */
    private String _displayName;
    /** Not implemented. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. */
    private java.util.List<UnifiedRoleManagementPolicyRule> _effectiveRules;
    /** This can only be set to true for a single tenant wide policy which will apply to all scopes and roles. Set the scopeId to '/' and scopeType to Directory. */
    private Boolean _isOrganizationDefault;
    /** The identity who last modified the role setting. */
    private Identity _lastModifiedBy;
    /** The time when the role setting was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The collection of rules like approval rules and expiration rules. */
    private java.util.List<UnifiedRoleManagementPolicyRule> _rules;
    /** The id of the scope where the policy is created. Can be / for the tenant or a group ID. Required. */
    private String _scopeId;
    /** The type of the scope where the policy is created. One of Directory, DirectoryRole. Required. */
    private String _scopeType;
    /**
     * Instantiates a new unifiedRoleManagementPolicy and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicy
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicy();
    }
    /**
     * Gets the description property value. Description for the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name for the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the effectiveRules property value. Not implemented. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval.
     * @return a unifiedRoleManagementPolicyRule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyRule> getEffectiveRules() {
        return this._effectiveRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("effectiveRules", (n) -> { currentObject.setEffectiveRules(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue)); });
            this.put("isOrganizationDefault", (n) -> { currentObject.setIsOrganizationDefault(n.getBooleanValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("rules", (n) -> { currentObject.setRules(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue)); });
            this.put("scopeId", (n) -> { currentObject.setScopeId(n.getStringValue()); });
            this.put("scopeType", (n) -> { currentObject.setScopeType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isOrganizationDefault property value. This can only be set to true for a single tenant wide policy which will apply to all scopes and roles. Set the scopeId to '/' and scopeType to Directory.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOrganizationDefault() {
        return this._isOrganizationDefault;
    }
    /**
     * Gets the lastModifiedBy property value. The identity who last modified the role setting.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The time when the role setting was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the rules property value. The collection of rules like approval rules and expiration rules.
     * @return a unifiedRoleManagementPolicyRule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyRule> getRules() {
        return this._rules;
    }
    /**
     * Gets the scopeId property value. The id of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeId() {
        return this._scopeId;
    }
    /**
     * Gets the scopeType property value. The type of the scope where the policy is created. One of Directory, DirectoryRole. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this._scopeType;
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
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name for the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the effectiveRules property value. Not implemented. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval.
     * @param value Value to set for the effectiveRules property.
     * @return a void
     */
    public void setEffectiveRules(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyRule> value) {
        this._effectiveRules = value;
    }
    /**
     * Sets the isOrganizationDefault property value. This can only be set to true for a single tenant wide policy which will apply to all scopes and roles. Set the scopeId to '/' and scopeType to Directory.
     * @param value Value to set for the isOrganizationDefault property.
     * @return a void
     */
    public void setIsOrganizationDefault(@javax.annotation.Nullable final Boolean value) {
        this._isOrganizationDefault = value;
    }
    /**
     * Sets the lastModifiedBy property value. The identity who last modified the role setting.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final Identity value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The time when the role setting was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the rules property value. The collection of rules like approval rules and expiration rules.
     * @param value Value to set for the rules property.
     * @return a void
     */
    public void setRules(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyRule> value) {
        this._rules = value;
    }
    /**
     * Sets the scopeId property value. The id of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
     * @param value Value to set for the scopeId property.
     * @return a void
     */
    public void setScopeId(@javax.annotation.Nullable final String value) {
        this._scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of the scope where the policy is created. One of Directory, DirectoryRole. Required.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this._scopeType = value;
    }
}
