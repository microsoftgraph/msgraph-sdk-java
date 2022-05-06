package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignment extends Entity implements Parsable {
    /** Details of the app specific scope when the assignment scope is app specific. Containment entity.  */
    private AppScope _appScope;
    /** Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.  */
    private String _appScopeId;
    /** The condition property  */
    private String _condition;
    /** The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.  */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.  */
    private String _directoryScopeId;
    /** The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.  */
    private DirectoryObject _principal;
    /** Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).  */
    private String _principalId;
    /** The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.  */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).  */
    private String _roleDefinitionId;
    /**
     * Instantiates a new unifiedRoleAssignment and sets the default values.
     * @return a void
     */
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
     * Gets the appScope property value. Details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this._appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
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
     * Gets the directoryScope property value. The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this._directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
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
        return new HashMap<>(super.getFieldDeserializers()) {{
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
     * Gets the principal property value. The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the roleDefinition property value. The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
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
     * Sets the appScope property value. Details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this._appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     * @return a void
     */
    public void setCondition(@javax.annotation.Nullable final String value) {
        this._condition = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this._directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this._directoryScopeId = value;
    }
    /**
     * Sets the principal property value. The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     * @param value Value to set for the principal property.
     * @return a void
     */
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this._principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the roleDefinition property value. The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
}
