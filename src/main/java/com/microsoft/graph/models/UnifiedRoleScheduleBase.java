package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleScheduleBase extends Entity implements Parsable {
    /**
     * Read-only property with details of the app-specific scope when the role eligibility or assignment is scoped to an app. Nullable.
     */
    private AppScope appScope;
    /**
     * Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     */
    private String appScopeId;
    /**
     * When the schedule was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Identifier of the object through which this schedule was created.
     */
    private String createdUsing;
    /**
     * The directory object that is the scope of the role eligibility or assignment. Read-only.
     */
    private DirectoryObject directoryScope;
    /**
     * Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     */
    private String directoryScopeId;
    /**
     * When the schedule was last modified.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The principal that's getting a role assignment or that's eligible for a role through the request.
     */
    private DirectoryObject principal;
    /**
     * Identifier of the principal that has been granted the role assignment or eligibility.
     */
    private String principalId;
    /**
     * Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     */
    private UnifiedRoleDefinition roleDefinition;
    /**
     * Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for.
     */
    private String roleDefinitionId;
    /**
     * The status of the role assignment or eligibility request.
     */
    private String status;
    /**
     * Instantiates a new unifiedRoleScheduleBase and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleScheduleBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleScheduleBase
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleScheduleBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public AppScope getAppScope() {
        return this.appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppScopeId() {
        return this.appScopeId;
    }
    /**
     * Gets the createdDateTime property value. When the schedule was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the createdUsing property value. Identifier of the object through which this schedule was created.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedUsing() {
        return this.createdUsing;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the role eligibility or assignment. Read-only.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this.directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDirectoryScopeId() {
        return this.directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appScope", (n) -> { this.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { this.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdUsing", (n) -> { this.setCreatedUsing(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { this.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { this.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. When the schedule was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the principal property value. The principal that's getting a role assignment or that's eligible for a role through the request.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the role assignment or eligibility.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @return a unifiedRoleDefinition
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the status property value. The status of the role assignment or eligibility request.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAppScope(@jakarta.annotation.Nullable final AppScope value) {
        this.appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment or eligibility is scoped to an app. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppScopeId(@jakarta.annotation.Nullable final String value) {
        this.appScopeId = value;
    }
    /**
     * Sets the createdDateTime property value. When the schedule was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the createdUsing property value. Identifier of the object through which this schedule was created.
     * @param value Value to set for the createdUsing property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedUsing(@jakarta.annotation.Nullable final String value) {
        this.createdUsing = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the role eligibility or assignment. Read-only.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDirectoryScope(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment or eligibility. The scope of an assignment or eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only.
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDirectoryScopeId(@jakarta.annotation.Nullable final String value) {
        this.directoryScopeId = value;
    }
    /**
     * Sets the modifiedDateTime property value. When the schedule was last modified.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the principal property value. The principal that's getting a role assignment or that's eligible for a role through the request.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the role assignment or eligibility.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the roleDefinition object that is referenced through the roleDefinitionId property.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleDefinition(@jakarta.annotation.Nullable final UnifiedRoleDefinition value) {
        this.roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal or that a principal is eligible for.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the status property value. The status of the role assignment or eligibility request.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
