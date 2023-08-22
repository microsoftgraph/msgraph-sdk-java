package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RbacApplication extends Entity implements Parsable {
    /**
     * The resourceNamespaces property
     */
    private java.util.List<UnifiedRbacResourceNamespace> resourceNamespaces;
    /**
     * Resource to grant access to users or groups.
     */
    private java.util.List<UnifiedRoleAssignment> roleAssignments;
    /**
     * Instances for active role assignments.
     */
    private java.util.List<UnifiedRoleAssignmentScheduleInstance> roleAssignmentScheduleInstances;
    /**
     * Requests for active role assignments to principals through PIM.
     */
    private java.util.List<UnifiedRoleAssignmentScheduleRequest> roleAssignmentScheduleRequests;
    /**
     * Schedules for active role assignment operations.
     */
    private java.util.List<UnifiedRoleAssignmentSchedule> roleAssignmentSchedules;
    /**
     * Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     */
    private java.util.List<UnifiedRoleDefinition> roleDefinitions;
    /**
     * Instances for role eligibility requests.
     */
    private java.util.List<UnifiedRoleEligibilityScheduleInstance> roleEligibilityScheduleInstances;
    /**
     * Requests for role eligibilities for principals through PIM.
     */
    private java.util.List<UnifiedRoleEligibilityScheduleRequest> roleEligibilityScheduleRequests;
    /**
     * Schedules for role eligibility operations.
     */
    private java.util.List<UnifiedRoleEligibilitySchedule> roleEligibilitySchedules;
    /**
     * Instantiates a new rbacApplication and sets the default values.
     */
    public RbacApplication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rbacApplication
     */
    @jakarta.annotation.Nonnull
    public static RbacApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RbacApplication();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceNamespaces", (n) -> { this.setResourceNamespaces(n.getCollectionOfObjectValues(UnifiedRbacResourceNamespace::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(UnifiedRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentScheduleInstances", (n) -> { this.setRoleAssignmentScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentScheduleRequests", (n) -> { this.setRoleAssignmentScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleAssignmentScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignmentSchedules", (n) -> { this.setRoleAssignmentSchedules(n.getCollectionOfObjectValues(UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilityScheduleInstances", (n) -> { this.setRoleEligibilityScheduleInstances(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilityScheduleRequests", (n) -> { this.setRoleEligibilityScheduleRequests(n.getCollectionOfObjectValues(UnifiedRoleEligibilityScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("roleEligibilitySchedules", (n) -> { this.setRoleEligibilitySchedules(n.getCollectionOfObjectValues(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceNamespaces property value. The resourceNamespaces property
     * @return a unifiedRbacResourceNamespace
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRbacResourceNamespace> getResourceNamespaces() {
        return this.resourceNamespaces;
    }
    /**
     * Gets the roleAssignments property value. Resource to grant access to users or groups.
     * @return a unifiedRoleAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignment> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Gets the roleAssignmentScheduleInstances property value. Instances for active role assignments.
     * @return a unifiedRoleAssignmentScheduleInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleInstance> getRoleAssignmentScheduleInstances() {
        return this.roleAssignmentScheduleInstances;
    }
    /**
     * Gets the roleAssignmentScheduleRequests property value. Requests for active role assignments to principals through PIM.
     * @return a unifiedRoleAssignmentScheduleRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentScheduleRequest> getRoleAssignmentScheduleRequests() {
        return this.roleAssignmentScheduleRequests;
    }
    /**
     * Gets the roleAssignmentSchedules property value. Schedules for active role assignment operations.
     * @return a unifiedRoleAssignmentSchedule
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleAssignmentSchedule> getRoleAssignmentSchedules() {
        return this.roleAssignmentSchedules;
    }
    /**
     * Gets the roleDefinitions property value. Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     * @return a unifiedRoleDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.roleDefinitions;
    }
    /**
     * Gets the roleEligibilityScheduleInstances property value. Instances for role eligibility requests.
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleInstance> getRoleEligibilityScheduleInstances() {
        return this.roleEligibilityScheduleInstances;
    }
    /**
     * Gets the roleEligibilityScheduleRequests property value. Requests for role eligibilities for principals through PIM.
     * @return a unifiedRoleEligibilityScheduleRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilityScheduleRequest> getRoleEligibilityScheduleRequests() {
        return this.roleEligibilityScheduleRequests;
    }
    /**
     * Gets the roleEligibilitySchedules property value. Schedules for role eligibility operations.
     * @return a unifiedRoleEligibilitySchedule
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleEligibilitySchedule> getRoleEligibilitySchedules() {
        return this.roleEligibilitySchedules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("resourceNamespaces", this.getResourceNamespaces());
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
     * Sets the resourceNamespaces property value. The resourceNamespaces property
     * @param value Value to set for the resourceNamespaces property.
     */
    public void setResourceNamespaces(@jakarta.annotation.Nullable final java.util.List<UnifiedRbacResourceNamespace> value) {
        this.resourceNamespaces = value;
    }
    /**
     * Sets the roleAssignments property value. Resource to grant access to users or groups.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignment> value) {
        this.roleAssignments = value;
    }
    /**
     * Sets the roleAssignmentScheduleInstances property value. Instances for active role assignments.
     * @param value Value to set for the roleAssignmentScheduleInstances property.
     */
    public void setRoleAssignmentScheduleInstances(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleInstance> value) {
        this.roleAssignmentScheduleInstances = value;
    }
    /**
     * Sets the roleAssignmentScheduleRequests property value. Requests for active role assignments to principals through PIM.
     * @param value Value to set for the roleAssignmentScheduleRequests property.
     */
    public void setRoleAssignmentScheduleRequests(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentScheduleRequest> value) {
        this.roleAssignmentScheduleRequests = value;
    }
    /**
     * Sets the roleAssignmentSchedules property value. Schedules for active role assignment operations.
     * @param value Value to set for the roleAssignmentSchedules property.
     */
    public void setRoleAssignmentSchedules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleAssignmentSchedule> value) {
        this.roleAssignmentSchedules = value;
    }
    /**
     * Sets the roleDefinitions property value. Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.roleDefinitions = value;
    }
    /**
     * Sets the roleEligibilityScheduleInstances property value. Instances for role eligibility requests.
     * @param value Value to set for the roleEligibilityScheduleInstances property.
     */
    public void setRoleEligibilityScheduleInstances(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleInstance> value) {
        this.roleEligibilityScheduleInstances = value;
    }
    /**
     * Sets the roleEligibilityScheduleRequests property value. Requests for role eligibilities for principals through PIM.
     * @param value Value to set for the roleEligibilityScheduleRequests property.
     */
    public void setRoleEligibilityScheduleRequests(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilityScheduleRequest> value) {
        this.roleEligibilityScheduleRequests = value;
    }
    /**
     * Sets the roleEligibilitySchedules property value. Schedules for role eligibility operations.
     * @param value Value to set for the roleEligibilitySchedules property.
     */
    public void setRoleEligibilitySchedules(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleEligibilitySchedule> value) {
        this.roleEligibilitySchedules = value;
    }
}
