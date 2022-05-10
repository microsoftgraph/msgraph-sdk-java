package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignmentScheduleRequest extends Request implements Parsable {
    /** Represents the type of the operation on the role assignment. The possible values are: AdminAssign: For administrators to assign roles to users or groups.AdminRemove: For administrators to remove users or groups from roles. AdminUpdate: For administrators to change existing role assignments.AdminExtend: For administrators to extend expiring assignments.AdminRenew: For administrators to renew expired assignments.SelfActivate: For users to activate their assignments.SelfDeactivate: For users to deactivate their active assignments.SelfExtend: For users to request to extend their expiring assignments.SelfRenew: For users to request to renew their expired assignments. */
    private UnifiedRoleScheduleRequestActions _action;
    /** If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. */
    private UnifiedRoleEligibilitySchedule _activatedUsing;
    /** Read-only property with details of the app specific scope when the assignment scope is app specific. Containment entity. */
    private AppScope _appScope;
    /** Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. */
    private String _appScopeId;
    /** Property referencing the directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. */
    private String _directoryScopeId;
    /** A boolean that determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request. */
    private Boolean _isValidationOnly;
    /** A message provided by users and administrators when create the request about why it is needed. */
    private String _justification;
    /** Property referencing the principal that is getting a role assignment through the request. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. */
    private DirectoryObject _principal;
    /** Identifier of the principal to which the assignment is being granted to. */
    private String _principalId;
    /** Property indicating the roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.Id will be auto expanded. */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition the assignment is for. Read only. */
    private String _roleDefinitionId;
    /** The schedule object of the role assignment request. */
    private RequestSchedule _scheduleInfo;
    /** Property indicating the schedule for an eligible role assignment. */
    private UnifiedRoleAssignmentSchedule _targetSchedule;
    /** Identifier of the schedule object attached to the assignment. */
    private String _targetScheduleId;
    /** The ticketInfo object attached to the role assignment request which includes details of the ticket number and ticket system. */
    private TicketInfo _ticketInfo;
    /**
     * Instantiates a new unifiedRoleAssignmentScheduleRequest and sets the default values.
     * @return a void
     */
    public UnifiedRoleAssignmentScheduleRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignmentScheduleRequest
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleAssignmentScheduleRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentScheduleRequest();
    }
    /**
     * Gets the action property value. Represents the type of the operation on the role assignment. The possible values are: AdminAssign: For administrators to assign roles to users or groups.AdminRemove: For administrators to remove users or groups from roles. AdminUpdate: For administrators to change existing role assignments.AdminExtend: For administrators to extend expiring assignments.AdminRenew: For administrators to renew expired assignments.SelfActivate: For users to activate their assignments.SelfDeactivate: For users to deactivate their active assignments.SelfExtend: For users to request to extend their expiring assignments.SelfRenew: For users to request to renew their expired assignments.
     * @return a unifiedRoleScheduleRequestActions
     */
    @javax.annotation.Nullable
    public UnifiedRoleScheduleRequestActions getAction() {
        return this._action;
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation.
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getActivatedUsing() {
        return this._activatedUsing;
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
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this._appScopeId;
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
        final UnifiedRoleAssignmentScheduleRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(UnifiedRoleScheduleRequestActions.class)); });
            this.put("activatedUsing", (n) -> { currentObject.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
            this.put("appScope", (n) -> { currentObject.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
            this.put("appScopeId", (n) -> { currentObject.setAppScopeId(n.getStringValue()); });
            this.put("directoryScope", (n) -> { currentObject.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("directoryScopeId", (n) -> { currentObject.setDirectoryScopeId(n.getStringValue()); });
            this.put("isValidationOnly", (n) -> { currentObject.setIsValidationOnly(n.getBooleanValue()); });
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
            this.put("scheduleInfo", (n) -> { currentObject.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
            this.put("targetSchedule", (n) -> { currentObject.setTargetSchedule(n.getObjectValue(UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue)); });
            this.put("targetScheduleId", (n) -> { currentObject.setTargetScheduleId(n.getStringValue()); });
            this.put("ticketInfo", (n) -> { currentObject.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isValidationOnly property value. A boolean that determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this._isValidationOnly;
    }
    /**
     * Gets the justification property value. A message provided by users and administrators when create the request about why it is needed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
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
     * Gets the principalId property value. Identifier of the principal to which the assignment is being granted to.
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
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the scheduleInfo property value. The schedule object of the role assignment request.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this._scheduleInfo;
    }
    /**
     * Gets the targetSchedule property value. Property indicating the schedule for an eligible role assignment.
     * @return a unifiedRoleAssignmentSchedule
     */
    @javax.annotation.Nullable
    public UnifiedRoleAssignmentSchedule getTargetSchedule() {
        return this._targetSchedule;
    }
    /**
     * Gets the targetScheduleId property value. Identifier of the schedule object attached to the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetScheduleId() {
        return this._targetScheduleId;
    }
    /**
     * Gets the ticketInfo property value. The ticketInfo object attached to the role assignment request which includes details of the ticket number and ticket system.
     * @return a ticketInfo
     */
    @javax.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this._ticketInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeObjectValue("targetSchedule", this.getTargetSchedule());
        writer.writeStringValue("targetScheduleId", this.getTargetScheduleId());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. Represents the type of the operation on the role assignment. The possible values are: AdminAssign: For administrators to assign roles to users or groups.AdminRemove: For administrators to remove users or groups from roles. AdminUpdate: For administrators to change existing role assignments.AdminExtend: For administrators to extend expiring assignments.AdminRenew: For administrators to renew expired assignments.SelfActivate: For users to activate their assignments.SelfDeactivate: For users to deactivate their active assignments.SelfExtend: For users to request to extend their expiring assignments.SelfRenew: For users to request to renew their expired assignments.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final UnifiedRoleScheduleRequestActions value) {
        this._action = value;
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation.
     * @param value Value to set for the activatedUsing property.
     * @return a void
     */
    public void setActivatedUsing(@javax.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this._activatedUsing = value;
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
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment scope is app-specific. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units.
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
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
     * Sets the isValidationOnly property value. A boolean that determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @param value Value to set for the isValidationOnly property.
     * @return a void
     */
    public void setIsValidationOnly(@javax.annotation.Nullable final Boolean value) {
        this._isValidationOnly = value;
    }
    /**
     * Sets the justification property value. A message provided by users and administrators when create the request about why it is needed.
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
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
     * Sets the principalId property value. Identifier of the principal to which the assignment is being granted to.
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
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition the assignment is for. Read only.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the scheduleInfo property value. The schedule object of the role assignment request.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this._scheduleInfo = value;
    }
    /**
     * Sets the targetSchedule property value. Property indicating the schedule for an eligible role assignment.
     * @param value Value to set for the targetSchedule property.
     * @return a void
     */
    public void setTargetSchedule(@javax.annotation.Nullable final UnifiedRoleAssignmentSchedule value) {
        this._targetSchedule = value;
    }
    /**
     * Sets the targetScheduleId property value. Identifier of the schedule object attached to the assignment.
     * @param value Value to set for the targetScheduleId property.
     * @return a void
     */
    public void setTargetScheduleId(@javax.annotation.Nullable final String value) {
        this._targetScheduleId = value;
    }
    /**
     * Sets the ticketInfo property value. The ticketInfo object attached to the role assignment request which includes details of the ticket number and ticket system.
     * @param value Value to set for the ticketInfo property.
     * @return a void
     */
    public void setTicketInfo(@javax.annotation.Nullable final TicketInfo value) {
        this._ticketInfo = value;
    }
}
