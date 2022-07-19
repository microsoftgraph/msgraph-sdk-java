package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RbacApplication extends Entity implements Parsable {
    /** Resource to grant access to users or groups. */
    private java.util.List<UnifiedRoleAssignment> _roleAssignments;
    /** Instances for active role assignments. */
    private java.util.List<UnifiedRoleAssignmentScheduleInstance> _roleAssignmentScheduleInstances;
    /** Requests for active role assignments to principals through PIM. */
    private java.util.List<UnifiedRoleAssignmentScheduleRequest> _roleAssignmentScheduleRequests;
    /** Schedules for active role assignment operations. */
    private java.util.List<UnifiedRoleAssignmentSchedule> _roleAssignmentSchedules;
    /** Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles. */
    private java.util.List<UnifiedRoleDefinition> _roleDefinitions;
    /** Instances for role eligibility requests. */
    private java.util.List<UnifiedRoleEligibilityScheduleInstance> _roleEligibilityScheduleInstances;
    /** Requests for role eligibilities for principals through PIM. */
    private java.util.List<UnifiedRoleEligibilityScheduleRequest> _roleEligibilityScheduleRequests;
    /** Schedules for role eligibility operations. */
    private java.util.List<UnifiedRoleEligibilitySchedule> _roleEligibilitySchedules;
    /**
     * Instantiates a new RbacApplication and sets the default values.
     * @return a void
     */
    public RbacApplication() {
        super();
        this.setOdataType("#microsoft.graph.rbacApplication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RbacApplication
     */
    @javax.annotation.Nonnull
    public static RbacApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RbacApplication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RbacApplication currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("roleAssignments", (n) -> { currentObject.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
            this.put("roleAssignmentScheduleInstances", (n) -> { currentObject.setRoleAssignmentScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleInstance::createFromDiscriminatorValue)); });
            this.put("roleAssignmentScheduleRequests", (n) -> { currentObject.setRoleAssignmentScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleRequest::createFromDiscriminatorValue)); });
            this.put("roleAssignmentSchedules", (n) -> { currentObject.setRoleAssignmentSchedules(n.getCollectionOfObjectValues(UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue)); });
            this.put("roleDefinitions", (n) -> { currentObject.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleEligibilityScheduleInstances", (n) -> { currentObject.setRoleEligibilityScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue)); });
            this.put("roleEligibilityScheduleRequests", (n) -> { currentObject.setRoleEligibilityScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue)); });
            this.put("roleEligibilitySchedules", (n) -> { currentObject.setRoleEligibilitySchedules(n.getCollectionOfObjectValues(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the roleAssignments property value. Resource to grant access to users or groups.
     * @return a unifiedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleAssignmentScheduleInstances property value. Instances for active role assignments.
     * @return a unifiedRoleAssignmentScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleInstance> getRoleAssignmentScheduleInstances() {
        return this._roleAssignmentScheduleInstances;
    }
    /**
     * Gets the roleAssignmentScheduleRequests property value. Requests for active role assignments to principals through PIM.
     * @return a unifiedRoleAssignmentScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleRequest> getRoleAssignmentScheduleRequests() {
        return this._roleAssignmentScheduleRequests;
    }
    /**
     * Gets the roleAssignmentSchedules property value. Schedules for active role assignment operations.
     * @return a unifiedRoleAssignmentSchedule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentSchedule> getRoleAssignmentSchedules() {
        return this._roleAssignmentSchedules;
    }
    /**
     * Gets the roleDefinitions property value. Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Gets the roleEligibilityScheduleInstances property value. Instances for role eligibility requests.
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleInstance> getRoleEligibilityScheduleInstances() {
        return this._roleEligibilityScheduleInstances;
    }
    /**
     * Gets the roleEligibilityScheduleRequests property value. Requests for role eligibilities for principals through PIM.
     * @return a unifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleRequest> getRoleEligibilityScheduleRequests() {
        return this._roleEligibilityScheduleRequests;
    }
    /**
     * Gets the roleEligibilitySchedules property value. Schedules for role eligibility operations.
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilitySchedule> getRoleEligibilitySchedules() {
        return this._roleEligibilitySchedules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleAssignmentScheduleInstances", this.getRoleAssignmentScheduleInstances());
        writer.writeCollectionOfObjectValues("roleAssignmentScheduleRequests", this.getRoleAssignmentScheduleRequests());
        writer.writeCollectionOfObjectValues("roleAssignmentSchedules", this.getRoleAssignmentSchedules());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleEligibilityScheduleInstances", this.getRoleEligibilityScheduleInstances());
        writer.writeCollectionOfObjectValues("roleEligibilityScheduleRequests", this.getRoleEligibilityScheduleRequests());
        writer.writeCollectionOfObjectValues("roleEligibilitySchedules", this.getRoleEligibilitySchedules());
    }
    /**
     * Sets the roleAssignments property value. Resource to grant access to users or groups.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleAssignmentScheduleInstances property value. Instances for active role assignments.
     * @param value Value to set for the roleAssignmentScheduleInstances property.
     * @return a void
     */
    public void setRoleAssignmentScheduleInstances(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleInstance> value) {
        this._roleAssignmentScheduleInstances = value;
    }
    /**
     * Sets the roleAssignmentScheduleRequests property value. Requests for active role assignments to principals through PIM.
     * @param value Value to set for the roleAssignmentScheduleRequests property.
     * @return a void
     */
    public void setRoleAssignmentScheduleRequests(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleRequest> value) {
        this._roleAssignmentScheduleRequests = value;
    }
    /**
     * Sets the roleAssignmentSchedules property value. Schedules for active role assignment operations.
     * @param value Value to set for the roleAssignmentSchedules property.
     * @return a void
     */
    public void setRoleAssignmentSchedules(@javax.annotation.Nullable final java.util.List<UnifiedRoleAssignmentSchedule> value) {
        this._roleAssignmentSchedules = value;
    }
    /**
     * Sets the roleDefinitions property value. Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this._roleDefinitions = value;
    }
    /**
     * Sets the roleEligibilityScheduleInstances property value. Instances for role eligibility requests.
     * @param value Value to set for the roleEligibilityScheduleInstances property.
     * @return a void
     */
    public void setRoleEligibilityScheduleInstances(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleInstance> value) {
        this._roleEligibilityScheduleInstances = value;
    }
    /**
     * Sets the roleEligibilityScheduleRequests property value. Requests for role eligibilities for principals through PIM.
     * @param value Value to set for the roleEligibilityScheduleRequests property.
     * @return a void
     */
    public void setRoleEligibilityScheduleRequests(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleRequest> value) {
        this._roleEligibilityScheduleRequests = value;
    }
    /**
     * Sets the roleEligibilitySchedules property value. Schedules for role eligibility operations.
     * @param value Value to set for the roleEligibilitySchedules property.
     * @return a void
     */
    public void setRoleEligibilitySchedules(@javax.annotation.Nullable final java.util.List<UnifiedRoleEligibilitySchedule> value) {
        this._roleEligibilitySchedules = value;
    }
}
