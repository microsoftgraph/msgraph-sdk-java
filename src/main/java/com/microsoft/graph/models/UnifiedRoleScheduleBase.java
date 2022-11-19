package com.microsoft.graph.models;

import com.microsoft.graph.models.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.UnifiedRoleEligibilitySchedule;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleScheduleBase extends Entity implements Parsable {
    /** Read-only property with details of the app-specific scope when the role eligibility or assignment is scoped to an app. Nullable. */
    private AppScope _appScope;
    /** Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. */
    private String _appScopeId;
    /** When the schedule was created. */
    private OffsetDateTime _createdDateTime;
    /** Identifier of the object through which this schedule was created. */
    private String _createdUsing;
    /** The directory object that is the scope of the role eligibility or assignment. Read-only. */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. */
    private String _directoryScopeId;
    /** When the schedule was last modified. */
    private OffsetDateTime _modifiedDateTime;
    /** The principal that's getting a role assignment or that's eligible for a role through the request. */
    private DirectoryObject _principal;
    /** Identifier of the principal that has been granted the role assignment or eligibility. */
    private String _principalId;
    /** Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property. */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for. */
    private String _roleDefinitionId;
    /** The status of the role assignment or eligibility request. */
    private String _status;
    /**
     * Instantiates a new unifiedRoleScheduleBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleScheduleBase() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleScheduleBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleScheduleBase
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleScheduleBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.unifiedRoleAssignmentSchedule": return new UnifiedRoleAssignmentSchedule();
                case "#microsoft.graph.unifiedRoleEligibilitySchedule": return new UnifiedRoleEligibilitySchedule();
            }
        }
        return new UnifiedRoleScheduleBase();
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility or assignment is scoped to an app. Nullable.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this._appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this._appScopeId;
    }
    /**
     * Gets the createdDateTime property value. When the schedule was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the createdUsing property value. Identifier of the object through which this schedule was created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedUsing() {
        return this._createdUsing;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the role eligibility or assignment. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this._directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScope", (n) -> { currentObject.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { currentObject.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdUsing", (n) -> { currentObject.setCreatedUsing(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { currentObject.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { currentObject.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the modifiedDateTime property value. When the schedule was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the principal property value. The principal that's getting a role assignment or that's eligible for a role through the request.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the role assignment or eligibility.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the status property value. The status of the role assignment or eligibility request.
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
    @javax.annotation.Nonnull
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
     * Sets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility or assignment is scoped to an app. Nullable.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this._appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
    }
    /**
     * Sets the createdDateTime property value. When the schedule was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the createdUsing property value. Identifier of the object through which this schedule was created.
     * @param value Value to set for the createdUsing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedUsing(@javax.annotation.Nullable final String value) {
        this._createdUsing = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the role eligibility or assignment. Read-only.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this._directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this._directoryScopeId = value;
    }
    /**
     * Sets the modifiedDateTime property value. When the schedule was last modified.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the principal property value. The principal that's getting a role assignment or that's eligible for a role through the request.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this._principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the role assignment or eligibility.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the status property value. The status of the role assignment or eligibility request.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
