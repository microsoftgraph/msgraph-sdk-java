package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupAssignmentScheduleInstance extends PrivilegedAccessScheduleInstance implements Parsable {
    /**
     * Instantiates a new PrivilegedAccessGroupAssignmentScheduleInstance and sets the default values.
     */
    public PrivilegedAccessGroupAssignmentScheduleInstance() {
        super();
        this.setOdataType("#microsoft.graph.privilegedAccessGroupAssignmentScheduleInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessGroupAssignmentScheduleInstance
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupAssignmentScheduleInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupAssignmentScheduleInstance();
    }
    /**
     * Gets the accessId property value. The identifier of the membership or ownership assignment relationship to the group. Required. The possible values are: owner, member,  unknownFutureValue. Supports $filter (eq).
     * @return a PrivilegedAccessGroupAssignmentScheduleInstanceAccessId
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstanceAccessId getAccessId() {
        return this.backingStore.get("accessId");
    }
    /**
     * Gets the activatedUsing property value. When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
     * @return a PrivilegedAccessGroupEligibilityScheduleInstance
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance getActivatedUsing() {
        return this.backingStore.get("activatedUsing");
    }
    /**
     * Gets the assignmentScheduleId property value. The identifier of the privilegedAccessGroupAssignmentSchedule from which this instance was created. Required. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentScheduleId() {
        return this.backingStore.get("assignmentScheduleId");
    }
    /**
     * Gets the assignmentType property value. Indicates whether the membership or ownership assignment is granted through activation of an eligibility or through direct assignment. Required. The possible values are: assigned, activated, unknownFutureValue. Supports $filter (eq).
     * @return a PrivilegedAccessGroupAssignmentScheduleInstanceAssignmentType
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstanceAssignmentType getAssignmentType() {
        return this.backingStore.get("assignmentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessId", (n) -> { this.setAccessId(n.getEnumValue(PrivilegedAccessGroupAssignmentScheduleInstanceAccessId::forValue)); });
        deserializerMap.put("activatedUsing", (n) -> { this.setActivatedUsing(n.getObjectValue(PrivilegedAccessGroupEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentScheduleId", (n) -> { this.setAssignmentScheduleId(n.getStringValue()); });
        deserializerMap.put("assignmentType", (n) -> { this.setAssignmentType(n.getEnumValue(PrivilegedAccessGroupAssignmentScheduleInstanceAssignmentType::forValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getEnumValue(PrivilegedAccessGroupAssignmentScheduleInstanceMemberType::forValue)); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for groups. Optional. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the memberType property value. Indicates whether the assignment is derived from a group assignment. It can further imply whether the caller can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @return a PrivilegedAccessGroupAssignmentScheduleInstanceMemberType
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstanceMemberType getMemberType() {
        return this.backingStore.get("memberType");
    }
    /**
     * Gets the principal property value. References the principal that's in the scope of the membership or ownership assignment request through the group that's governed by PIM. Supports $expand.
     * @return a DirectoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.backingStore.get("principal");
    }
    /**
     * Gets the principalId property value. The identifier of the principal whose membership or ownership assignment to the group is managed through PIM for groups. Required. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessId", this.getAccessId());
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeStringValue("assignmentScheduleId", this.getAssignmentScheduleId());
        writer.writeEnumValue("assignmentType", this.getAssignmentType());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeEnumValue("memberType", this.getMemberType());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
    }
    /**
     * Sets the accessId property value. The identifier of the membership or ownership assignment relationship to the group. Required. The possible values are: owner, member,  unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the accessId property.
     */
    public void setAccessId(@jakarta.annotation.Nullable final PrivilegedAccessGroupAssignmentScheduleInstanceAccessId value) {
        this.backingStore.set("accessId", value);
    }
    /**
     * Sets the activatedUsing property value. When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
     * @param value Value to set for the activatedUsing property.
     */
    public void setActivatedUsing(@jakarta.annotation.Nullable final PrivilegedAccessGroupEligibilityScheduleInstance value) {
        this.backingStore.set("activatedUsing", value);
    }
    /**
     * Sets the assignmentScheduleId property value. The identifier of the privilegedAccessGroupAssignmentSchedule from which this instance was created. Required. Supports $filter (eq, ne).
     * @param value Value to set for the assignmentScheduleId property.
     */
    public void setAssignmentScheduleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentScheduleId", value);
    }
    /**
     * Sets the assignmentType property value. Indicates whether the membership or ownership assignment is granted through activation of an eligibility or through direct assignment. Required. The possible values are: assigned, activated, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the assignmentType property.
     */
    public void setAssignmentType(@jakarta.annotation.Nullable final PrivilegedAccessGroupAssignmentScheduleInstanceAssignmentType value) {
        this.backingStore.set("assignmentType", value);
    }
    /**
     * Sets the group property value. References the group that is the scope of the membership or ownership assignment through PIM for groups. Supports $expand.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for groups. Optional. Supports $filter (eq).
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the memberType property value. Indicates whether the assignment is derived from a group assignment. It can further imply whether the caller can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final PrivilegedAccessGroupAssignmentScheduleInstanceMemberType value) {
        this.backingStore.set("memberType", value);
    }
    /**
     * Sets the principal property value. References the principal that's in the scope of the membership or ownership assignment request through the group that's governed by PIM. Supports $expand.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("principal", value);
    }
    /**
     * Sets the principalId property value. The identifier of the principal whose membership or ownership assignment to the group is managed through PIM for groups. Required. Supports $filter (eq).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
}
