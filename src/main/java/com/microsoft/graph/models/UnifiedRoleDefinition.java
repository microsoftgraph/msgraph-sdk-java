package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleDefinition extends Entity implements Parsable {
    /** The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true. */
    private String _description;
    /** The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith operators only). */
    private String _displayName;
    /** Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute. */
    private java.util.List<UnifiedRoleDefinition> _inheritsPermissionsFrom;
    /** Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq operator only). */
    private Boolean _isBuiltIn;
    /** Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true. */
    private Boolean _isEnabled;
    /** List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment */
    private java.util.List<String> _resourceScopes;
    /** List of permissions included in the role. Read-only when isBuiltIn is true. Required. */
    private java.util.List<UnifiedRolePermission> _rolePermissions;
    /** Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true. */
    private String _templateId;
    /** Indicates version of the unifiedRoleDefinition. Read-only when isBuiltIn is true. */
    private String _version;
    /**
     * Instantiates a new unifiedRoleDefinition and sets the default values.
     * @return a void
     */
    public UnifiedRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleDefinition();
    }
    /**
     * Gets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith operators only).
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
        final UnifiedRoleDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("inheritsPermissionsFrom", (n) -> { currentObject.setInheritsPermissionsFrom(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("isBuiltIn", (n) -> { currentObject.setIsBuiltIn(n.getBooleanValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("resourceScopes", (n) -> { currentObject.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("rolePermissions", (n) -> { currentObject.setRolePermissions(n.getCollectionOfObjectValues(UnifiedRolePermission::createFromDiscriminatorValue)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getInheritsPermissionsFrom() {
        return this._inheritsPermissionsFrom;
    }
    /**
     * Gets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq operator only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this._isBuiltIn;
    }
    /**
     * Gets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this._resourceScopes;
    }
    /**
     * Gets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @return a unifiedRolePermission
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this._rolePermissions;
    }
    /**
     * Gets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Gets the version property value. Indicates version of the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
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
        writer.writeCollectionOfObjectValues("inheritsPermissionsFrom", this.getInheritsPermissionsFrom());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfPrimitiveValues("resourceScopes", this.getResourceScopes());
        writer.writeCollectionOfObjectValues("rolePermissions", this.getRolePermissions());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles support this attribute.
     * @param value Value to set for the inheritsPermissionsFrom property.
     * @return a void
     */
    public void setInheritsPermissionsFrom(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this._inheritsPermissionsFrom = value;
    }
    /**
     * Sets the isBuiltIn property value. Flag indicating if the unifiedRoleDefinition is part of the default set included with the product or custom. Read-only.  Supports $filter (eq operator only).
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this._isBuiltIn = value;
    }
    /**
     * Sets the isEnabled property value. Flag indicating if the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the resourceScopes property value. List of scopes permissions granted by the role definition apply to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resourceScopes = value;
    }
    /**
     * Sets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @param value Value to set for the rolePermissions property.
     * @return a void
     */
    public void setRolePermissions(@javax.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this._rolePermissions = value;
    }
    /**
     * Sets the templateId property value. Custom template identifier that can be set when isBuiltIn is false. This identifier is typically used if one needs an identifier to be the same across different directories. Read-only when isBuiltIn is true.
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
    /**
     * Sets the version property value. Indicates version of the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
