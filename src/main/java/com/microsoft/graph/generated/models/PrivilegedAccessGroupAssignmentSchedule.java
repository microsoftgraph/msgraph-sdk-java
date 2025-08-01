package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupAssignmentSchedule extends PrivilegedAccessSchedule implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedAccessGroupAssignmentSchedule} and sets the default values.
     */
    public PrivilegedAccessGroupAssignmentSchedule() {
        super();
        this.setOdataType("#microsoft.graph.privilegedAccessGroupAssignmentSchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedAccessGroupAssignmentSchedule}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupAssignmentSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupAssignmentSchedule();
    }
    /**
     * Gets the accessId property value. The identifier of the membership or ownership assignment to the group that is governed through PIM. Required. The possible values are: owner, member, unknownFutureValue. Supports $filter (eq).
     * @return a {@link PrivilegedAccessGroupRelationships}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupRelationships getAccessId() {
        return this.backingStore.get("accessId");
    }
    /**
     * Gets the activatedUsing property value. When the request activates an ownership or membership assignment in PIM for Groups, this object represents the eligibility relationship. Otherwise, it&apos;s null. Supports $expand.
     * @return a {@link PrivilegedAccessGroupEligibilitySchedule}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilitySchedule getActivatedUsing() {
        return this.backingStore.get("activatedUsing");
    }
    /**
     * Gets the assignmentType property value. Indicates whether the membership or ownership assignment for the principal is granted through activation or direct assignment. Required. The possible values are: assigned, activated, unknownFutureValue. Supports $filter (eq).
     * @return a {@link PrivilegedAccessGroupAssignmentType}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentType getAssignmentType() {
        return this.backingStore.get("assignmentType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessId", (n) -> { this.setAccessId(n.getEnumValue(PrivilegedAccessGroupRelationships::forValue)); });
        deserializerMap.put("activatedUsing", (n) -> { this.setActivatedUsing(n.getObjectValue(PrivilegedAccessGroupEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentType", (n) -> { this.setAssignmentType(n.getEnumValue(PrivilegedAccessGroupAssignmentType::forValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getEnumValue(PrivilegedAccessGroupMemberType::forValue)); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. References the group that is the scope of the membership or ownership assignment through PIM for Groups. Supports $expand and $select nested in $expand for select properties like id, displayName, and mail.
     * @return a {@link Group}
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for Groups. Required. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the memberType property value. Indicates whether the assignment is derived from a direct group assignment or through a transitive assignment. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @return a {@link PrivilegedAccessGroupMemberType}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupMemberType getMemberType() {
        return this.backingStore.get("memberType");
    }
    /**
     * Gets the principal property value. References the principal that&apos;s in the scope of this membership or ownership assignment request to the group that&apos;s governed through PIM. Supports $expand and $select nested in $expand for id only.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.backingStore.get("principal");
    }
    /**
     * Gets the principalId property value. The identifier of the principal whose membership or ownership assignment is granted through PIM for Groups. Required. Supports $filter (eq).
     * @return a {@link String}
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
        writer.writeEnumValue("assignmentType", this.getAssignmentType());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeEnumValue("memberType", this.getMemberType());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
    }
    /**
     * Sets the accessId property value. The identifier of the membership or ownership assignment to the group that is governed through PIM. Required. The possible values are: owner, member, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the accessId property.
     */
    public void setAccessId(@jakarta.annotation.Nullable final PrivilegedAccessGroupRelationships value) {
        this.backingStore.set("accessId", value);
    }
    /**
     * Sets the activatedUsing property value. When the request activates an ownership or membership assignment in PIM for Groups, this object represents the eligibility relationship. Otherwise, it&apos;s null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     */
    public void setActivatedUsing(@jakarta.annotation.Nullable final PrivilegedAccessGroupEligibilitySchedule value) {
        this.backingStore.set("activatedUsing", value);
    }
    /**
     * Sets the assignmentType property value. Indicates whether the membership or ownership assignment for the principal is granted through activation or direct assignment. Required. The possible values are: assigned, activated, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the assignmentType property.
     */
    public void setAssignmentType(@jakarta.annotation.Nullable final PrivilegedAccessGroupAssignmentType value) {
        this.backingStore.set("assignmentType", value);
    }
    /**
     * Sets the group property value. References the group that is the scope of the membership or ownership assignment through PIM for Groups. Supports $expand and $select nested in $expand for select properties like id, displayName, and mail.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for Groups. Required. Supports $filter (eq).
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the memberType property value. Indicates whether the assignment is derived from a direct group assignment or through a transitive assignment. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final PrivilegedAccessGroupMemberType value) {
        this.backingStore.set("memberType", value);
    }
    /**
     * Sets the principal property value. References the principal that&apos;s in the scope of this membership or ownership assignment request to the group that&apos;s governed through PIM. Supports $expand and $select nested in $expand for id only.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("principal", value);
    }
    /**
     * Sets the principalId property value. The identifier of the principal whose membership or ownership assignment is granted through PIM for Groups. Required. Supports $filter (eq).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
}
