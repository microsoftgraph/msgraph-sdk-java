package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new UnifiedRoleDefinition and sets the default values.
     */
    public UnifiedRoleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleDefinition
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleDefinition();
    }
    /**
     * Gets the description property value. The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq, in).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
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
        deserializerMap.put("inheritsPermissionsFrom", (n) -> { this.setInheritsPermissionsFrom(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rolePermissions", (n) -> { this.setRolePermissions(n.getCollectionOfObjectValues(UnifiedRolePermission::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Microsoft Entra built-in roles (isBuiltIn is true) support this attribute. Supports $expand.
     * @return a java.util.List<UnifiedRoleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getInheritsPermissionsFrom() {
        return this.getBackingStore().get("inheritsPermissionsFrom");
    }
    /**
     * Gets the isBuiltIn property value. Flag indicating whether the role definition is part of the default set included in Microsoft Entra or a custom definition. Read-only. Supports $filter (eq, in).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.getBackingStore().get("isBuiltIn");
    }
    /**
     * Gets the isEnabled property value. Flag indicating whether the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.getBackingStore().get("isEnabled");
    }
    /**
     * Gets the resourceScopes property value. List of the scopes or permissions the role definition applies to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this.getBackingStore().get("resourceScopes");
    }
    /**
     * Gets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @return a java.util.List<UnifiedRolePermission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRolePermission> getRolePermissions() {
        return this.getBackingStore().get("rolePermissions");
    }
    /**
     * Gets the templateId property value. Custom template identifier that can be set when isBuiltIn is false but is read-only when isBuiltIn is true. This identifier is typically used if one needs an identifier to be the same across different directories.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.getBackingStore().get("templateId");
    }
    /**
     * Gets the version property value. Indicates version of the role definition. Read-only when isBuiltIn is true.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.getBackingStore().get("version");
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required.  Supports $filter (eq, in).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the inheritsPermissionsFrom property value. Read-only collection of role definitions that the given role definition inherits from. Only Microsoft Entra built-in roles (isBuiltIn is true) support this attribute. Supports $expand.
     * @param value Value to set for the inheritsPermissionsFrom property.
     */
    public void setInheritsPermissionsFrom(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.getBackingStore().set("inheritsPermissionsFrom", value);
    }
    /**
     * Sets the isBuiltIn property value. Flag indicating whether the role definition is part of the default set included in Microsoft Entra or a custom definition. Read-only. Supports $filter (eq, in).
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isBuiltIn", value);
    }
    /**
     * Sets the isEnabled property value. Flag indicating whether the role is enabled for assignment. If false the role is not available for assignment. Read-only when isBuiltIn is true.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isEnabled", value);
    }
    /**
     * Sets the resourceScopes property value. List of the scopes or permissions the role definition applies to. Currently only / is supported. Read-only when isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
     * @param value Value to set for the resourceScopes property.
     */
    public void setResourceScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("resourceScopes", value);
    }
    /**
     * Sets the rolePermissions property value. List of permissions included in the role. Read-only when isBuiltIn is true. Required.
     * @param value Value to set for the rolePermissions property.
     */
    public void setRolePermissions(@jakarta.annotation.Nullable final java.util.List<UnifiedRolePermission> value) {
        this.getBackingStore().set("rolePermissions", value);
    }
    /**
     * Sets the templateId property value. Custom template identifier that can be set when isBuiltIn is false but is read-only when isBuiltIn is true. This identifier is typically used if one needs an identifier to be the same across different directories.
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("templateId", value);
    }
    /**
     * Sets the version property value. Indicates version of the role definition. Read-only when isBuiltIn is true.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("version", value);
    }
}
