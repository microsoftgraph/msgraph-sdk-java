package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class UnifiedRoleAssignment extends Entity implements Parsable {
    /** Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity. Supports $expand. */
    private AppScope _appScope;
    /** Identifier of the app-specific scope when the assignment scope is app-specific.  Either this property or directoryScopeId is required. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, in). */
    private String _appScopeId;
    /** The condition property */
    private String _condition;
    /** The directory object that is the scope of the assignment. Read-only. Supports $expand. */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the assignment.  Either this property or appScopeId is required. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, in). */
    private String _directoryScopeId;
    /** Referencing the assigned principal. Read-only. Supports $expand. */
    private DirectoryObject _principal;
    /** Identifier of the principal to which the assignment is granted. Supports $filter (eq, in). */
    private String _principalId;
    /** The roleDefinition the assignment is for.  Supports $expand. roleDefinition.Id will be auto expanded. */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the role definition the assignment is for. Read only. Supports $filter (eq, in). */
    private String _roleDefinitionId;
    /**
     * Instantiates a new unifiedRoleAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignment();
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity. Supports $expand.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this._appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific.  Either this property or directoryScopeId is required. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this._appScopeId;
    }
    /**
     * Gets the condition property value. The condition property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCondition() {
        return this._condition;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this._directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment.  Either this property or appScopeId is required. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDirectoryScopeId() {
        return this._directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appScope", (n) -> { currentObject.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
            this.put("appScopeId", (n) -> { currentObject.setAppScopeId(n.getStringValue()); });
            this.put("condition", (n) -> { currentObject.setCondition(n.getStringValue()); });
            this.put("directoryScope", (n) -> { currentObject.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("directoryScopeId", (n) -> { currentObject.setDirectoryScopeId(n.getStringValue()); });
            this.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the principal property value. Referencing the assigned principal. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the roleDefinition property value. The roleDefinition the assignment is for.  Supports $expand. roleDefinition.Id will be auto expanded.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the role definition the assignment is for. Read only. Supports $filter (eq, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
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
        writer.writeStringValue("condition", this.getCondition());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity. Supports $expand.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this._appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific.  Either this property or directoryScopeId is required. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, in).
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCondition(@javax.annotation.Nullable final String value) {
        this._condition = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the assignment. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this._directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment.  Either this property or appScopeId is required. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, in).
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this._directoryScopeId = value;
    }
    /**
     * Sets the principal property value. Referencing the assigned principal. Read-only. Supports $expand.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this._principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq, in).
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the roleDefinition property value. The roleDefinition the assignment is for.  Supports $expand. roleDefinition.Id will be auto expanded.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the role definition the assignment is for. Read only. Supports $filter (eq, in).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
}
