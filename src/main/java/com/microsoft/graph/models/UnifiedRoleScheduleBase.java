package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleScheduleBase extends Entity implements Parsable {
    /** Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity.  */
    private AppScope _appScope;
    /** Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units or all users.  */
    private String _appScopeId;
    /** Time that the schedule was created.  */
    private OffsetDateTime _createdDateTime;
    /** Identifier of the roleAssignmentScheduleRequest that created this schedule.  */
    private String _createdUsing;
    /** Property referencing the directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only.  */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.  */
    private String _directoryScopeId;
    /** Last time the schedule was updated.  */
    private OffsetDateTime _modifiedDateTime;
    /** Property referencing the principal that is getting a role assignment through the request. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only.  */
    private DirectoryObject _principal;
    /** Identifier of the principal to which the assignment is being granted to. Supports $filter (eq).  */
    private String _principalId;
    /** Property indicating the roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.Id will be auto expanded.  */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition the assignment is for. Read only. Supports $filter (eq).  */
    private String _roleDefinitionId;
    /** Status for the roleAssignmentSchedule. It can include state related messages like Provisioned, Revoked, Pending Provisioning, and Pending Approval. Supports $filter (eq).  */
    private String _status;
    /**
     * Instantiates a new unifiedRoleScheduleBase and sets the default values.
     * @return a void
     */
    public UnifiedRoleScheduleBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleScheduleBase
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleScheduleBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleScheduleBase();
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this._appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units or all users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this._appScopeId;
    }
    /**
     * Gets the createdDateTime property value. Time that the schedule was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the createdUsing property value. Identifier of the roleAssignmentScheduleRequest that created this schedule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedUsing() {
        return this._createdUsing;
    }
    /**
     * Gets the directoryScope property value. Property referencing the directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this._directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
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
        final UnifiedRoleScheduleBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appScope", (n) -> { currentObject.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
            this.put("appScopeId", (n) -> { currentObject.setAppScopeId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdUsing", (n) -> { currentObject.setCreatedUsing(n.getStringValue()); });
            this.put("directoryScope", (n) -> { currentObject.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("directoryScopeId", (n) -> { currentObject.setDirectoryScopeId(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the modifiedDateTime property value. Last time the schedule was updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the principal property value. Property referencing the principal that is getting a role assignment through the request. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal to which the assignment is being granted to. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the roleDefinition property value. Property indicating the roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.Id will be auto expanded.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read only. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the status property value. Status for the roleAssignmentSchedule. It can include state related messages like Provisioned, Revoked, Pending Provisioning, and Pending Approval. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("createdUsing", this.getCreatedUsing());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this._appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units or all users.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
    }
    /**
     * Sets the createdDateTime property value. Time that the schedule was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the createdUsing property value. Identifier of the roleAssignmentScheduleRequest that created this schedule.
     * @param value Value to set for the createdUsing property.
     * @return a void
     */
    public void setCreatedUsing(@javax.annotation.Nullable final String value) {
        this._createdUsing = value;
    }
    /**
     * Sets the directoryScope property value. Property referencing the directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this._directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this._directoryScopeId = value;
    }
    /**
     * Sets the modifiedDateTime property value. Last time the schedule was updated.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the principal property value. Property referencing the principal that is getting a role assignment through the request. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only.
     * @param value Value to set for the principal property.
     * @return a void
     */
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this._principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal to which the assignment is being granted to. Supports $filter (eq).
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Property indicating the roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.Id will be auto expanded.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read only. Supports $filter (eq).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the status property value. Status for the roleAssignmentSchedule. It can include state related messages like Provisioned, Revoked, Pending Provisioning, and Pending Approval. Supports $filter (eq).
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
