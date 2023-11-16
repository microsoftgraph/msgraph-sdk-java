package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroup extends Entity implements Parsable {
    /**
     * Instantiates a new PrivilegedAccessGroup and sets the default values.
     */
    public PrivilegedAccessGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessGroup
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroup();
    }
    /**
     * Gets the assignmentApprovals property value. The assignmentApprovals property
     * @return a java.util.List<Approval>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Approval> getAssignmentApprovals() {
        return this.BackingStore.get("assignmentApprovals");
    }
    /**
     * Gets the assignmentScheduleInstances property value. The instances of assignment schedules to activate a just-in-time access.
     * @return a java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> getAssignmentScheduleInstances() {
        return this.BackingStore.get("assignmentScheduleInstances");
    }
    /**
     * Gets the assignmentScheduleRequests property value. The schedule requests for operations to create, update, delete, extend, and renew an assignment.
     * @return a java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> getAssignmentScheduleRequests() {
        return this.BackingStore.get("assignmentScheduleRequests");
    }
    /**
     * Gets the assignmentSchedules property value. The assignment schedules to activate a just-in-time access.
     * @return a java.util.List<PrivilegedAccessGroupAssignmentSchedule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentSchedule> getAssignmentSchedules() {
        return this.BackingStore.get("assignmentSchedules");
    }
    /**
     * Gets the eligibilityScheduleInstances property value. The instances of eligibility schedules to activate a just-in-time access.
     * @return a java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> getEligibilityScheduleInstances() {
        return this.BackingStore.get("eligibilityScheduleInstances");
    }
    /**
     * Gets the eligibilityScheduleRequests property value. The schedule requests for operations to create, update, delete, extend, and renew an eligibility.
     * @return a java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest> getEligibilityScheduleRequests() {
        return this.BackingStore.get("eligibilityScheduleRequests");
    }
    /**
     * Gets the eligibilitySchedules property value. The eligibility schedules to activate a just-in-time access.
     * @return a java.util.List<PrivilegedAccessGroupEligibilitySchedule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupEligibilitySchedule> getEligibilitySchedules() {
        return this.BackingStore.get("eligibilitySchedules");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentApprovals", (n) -> { this.setAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentScheduleInstances", (n) -> { this.setAssignmentScheduleInstances(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentScheduleRequests", (n) -> { this.setAssignmentScheduleRequests(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentSchedules", (n) -> { this.setAssignmentSchedules(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilityScheduleInstances", (n) -> { this.setEligibilityScheduleInstances(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilityScheduleRequests", (n) -> { this.setEligibilityScheduleRequests(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilityScheduleRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("eligibilitySchedules", (n) -> { this.setEligibilitySchedules(n.getCollectionOfObjectValues(PrivilegedAccessGroupEligibilitySchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignmentApprovals", this.getAssignmentApprovals());
        writer.writeCollectionOfObjectValues("assignmentScheduleInstances", this.getAssignmentScheduleInstances());
        writer.writeCollectionOfObjectValues("assignmentScheduleRequests", this.getAssignmentScheduleRequests());
        writer.writeCollectionOfObjectValues("assignmentSchedules", this.getAssignmentSchedules());
        writer.writeCollectionOfObjectValues("eligibilityScheduleInstances", this.getEligibilityScheduleInstances());
        writer.writeCollectionOfObjectValues("eligibilityScheduleRequests", this.getEligibilityScheduleRequests());
        writer.writeCollectionOfObjectValues("eligibilitySchedules", this.getEligibilitySchedules());
    }
    /**
     * Sets the assignmentApprovals property value. The assignmentApprovals property
     * @param value Value to set for the assignmentApprovals property.
     */
    public void setAssignmentApprovals(@jakarta.annotation.Nullable final java.util.List<Approval> value) {
        this.BackingStore.set("assignmentApprovals", value);
    }
    /**
     * Sets the assignmentScheduleInstances property value. The instances of assignment schedules to activate a just-in-time access.
     * @param value Value to set for the assignmentScheduleInstances property.
     */
    public void setAssignmentScheduleInstances(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> value) {
        this.BackingStore.set("assignmentScheduleInstances", value);
    }
    /**
     * Sets the assignmentScheduleRequests property value. The schedule requests for operations to create, update, delete, extend, and renew an assignment.
     * @param value Value to set for the assignmentScheduleRequests property.
     */
    public void setAssignmentScheduleRequests(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> value) {
        this.BackingStore.set("assignmentScheduleRequests", value);
    }
    /**
     * Sets the assignmentSchedules property value. The assignment schedules to activate a just-in-time access.
     * @param value Value to set for the assignmentSchedules property.
     */
    public void setAssignmentSchedules(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentSchedule> value) {
        this.BackingStore.set("assignmentSchedules", value);
    }
    /**
     * Sets the eligibilityScheduleInstances property value. The instances of eligibility schedules to activate a just-in-time access.
     * @param value Value to set for the eligibilityScheduleInstances property.
     */
    public void setEligibilityScheduleInstances(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> value) {
        this.BackingStore.set("eligibilityScheduleInstances", value);
    }
    /**
     * Sets the eligibilityScheduleRequests property value. The schedule requests for operations to create, update, delete, extend, and renew an eligibility.
     * @param value Value to set for the eligibilityScheduleRequests property.
     */
    public void setEligibilityScheduleRequests(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilityScheduleRequest> value) {
        this.BackingStore.set("eligibilityScheduleRequests", value);
    }
    /**
     * Sets the eligibilitySchedules property value. The eligibility schedules to activate a just-in-time access.
     * @param value Value to set for the eligibilitySchedules property.
     */
    public void setEligibilitySchedules(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupEligibilitySchedule> value) {
        this.BackingStore.set("eligibilitySchedules", value);
    }
}
