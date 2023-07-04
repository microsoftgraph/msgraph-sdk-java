package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleScheduleInstanceBase extends Entity implements Parsable {
    /**
     * Read-only property with details of the app-specific scope when the assignment or role eligibility is scoped to an app. Nullable.
     */
    private AppScope appScope;
    /**
     * Identifier of the app-specific scope when the assignment or role eligibility is scoped to an app. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     */
    private String appScopeId;
    /**
     * The directory object that is the scope of the assignment or role eligibility. Read-only.
     */
    private DirectoryObject directoryScope;
    /**
     * Identifier of the directory object representing the scope of the assignment or role eligibility. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     */
    private String directoryScopeId;
    /**
     * The principal that's getting a role assignment or role eligibility through the request.
     */
    private DirectoryObject principal;
    /**
     * Identifier of the principal that has been granted the role assignment or that's eligible for a role.
     */
    private String principalId;
    /**
     * Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     */
    private UnifiedRoleDefinition roleDefinition;
    /**
     * Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that the principal is eligible for.
     */
    private String roleDefinitionId;
    /**
     * Instantiates a new unifiedRoleScheduleInstanceBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleScheduleInstanceBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleScheduleInstanceBase
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleScheduleInstanceBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.unifiedRoleAssignmentScheduleInstance": return new UnifiedRoleAssignmentScheduleInstance();
                case "#microsoft.graph.unifiedRoleEligibilityScheduleInstance": return new UnifiedRoleEligibilityScheduleInstance();
            }
        }
        return new UnifiedRoleScheduleInstanceBase();
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app-specific scope when the assignment or role eligibility is scoped to an app. Nullable.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this.appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment or role eligibility is scoped to an app. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this.appScopeId;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the assignment or role eligibility. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this.directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or role eligibility. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDirectoryScopeId() {
        return this.directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScope", (n) -> { this.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { this.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { this.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { this.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principal property value. The principal that's getting a role assignment or role eligibility through the request.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the role assignment or that's eligible for a role.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that the principal is eligible for.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
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
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app-specific scope when the assignment or role eligibility is scoped to an app. Nullable.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this.appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment or role eligibility is scoped to an app. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this.appScopeId = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the assignment or role eligibility. Read-only.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this.directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or role eligibility. The scope of an assignment or role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this.directoryScopeId = value;
    }
    /**
     * Sets the principal property value. The principal that's getting a role assignment or role eligibility through the request.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the role assignment or that's eligible for a role.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this.principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this.roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that the principal is eligible for.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
}
