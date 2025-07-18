package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupAssignmentScheduleRequest extends PrivilegedAccessScheduleRequest implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedAccessGroupAssignmentScheduleRequest} and sets the default values.
     */
    public PrivilegedAccessGroupAssignmentScheduleRequest() {
        super();
        this.setOdataType("#microsoft.graph.privilegedAccessGroupAssignmentScheduleRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleRequest}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupAssignmentScheduleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupAssignmentScheduleRequest();
    }
    /**
     * Gets the accessId property value. The identifier of a membership or ownership assignment relationship to the group. Required. The possible values are: owner, member, unknownFutureValue.
     * @return a {@link PrivilegedAccessGroupRelationships}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupRelationships getAccessId() {
        return this.backingStore.get("accessId");
    }
    /**
     * Gets the activatedUsing property value. When the request activates a membership or ownership assignment in PIM for Groups, this object represents the eligibility policy for the group. Otherwise, it is null. Supports $expand.
     * @return a {@link PrivilegedAccessGroupEligibilitySchedule}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilitySchedule getActivatedUsing() {
        return this.backingStore.get("activatedUsing");
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
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("targetSchedule", (n) -> { this.setTargetSchedule(n.getObjectValue(PrivilegedAccessGroupEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("targetScheduleId", (n) -> { this.setTargetScheduleId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. References the group that is the scope of the membership or ownership assignment request through PIM for Groups. Supports $expand and $select nested in $expand for select properties like id, displayName, and mail.
     * @return a {@link Group}
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for Groups. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the principal property value. References the principal that&apos;s in the scope of this membership or ownership assignment request through the group that&apos;s governed by PIM. Supports $expand and $select nested in $expand for id only.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.backingStore.get("principal");
    }
    /**
     * Gets the principalId property value. The identifier of the principal whose membership or ownership assignment to the group is managed through PIM for Groups. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Gets the targetSchedule property value. Schedule created by this request. Supports $expand.
     * @return a {@link PrivilegedAccessGroupEligibilitySchedule}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilitySchedule getTargetSchedule() {
        return this.backingStore.get("targetSchedule");
    }
    /**
     * Gets the targetScheduleId property value. The identifier of the schedule that&apos;s created from the membership or ownership assignment request. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetScheduleId() {
        return this.backingStore.get("targetScheduleId");
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
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("targetSchedule", this.getTargetSchedule());
        writer.writeStringValue("targetScheduleId", this.getTargetScheduleId());
    }
    /**
     * Sets the accessId property value. The identifier of a membership or ownership assignment relationship to the group. Required. The possible values are: owner, member, unknownFutureValue.
     * @param value Value to set for the accessId property.
     */
    public void setAccessId(@jakarta.annotation.Nullable final PrivilegedAccessGroupRelationships value) {
        this.backingStore.set("accessId", value);
    }
    /**
     * Sets the activatedUsing property value. When the request activates a membership or ownership assignment in PIM for Groups, this object represents the eligibility policy for the group. Otherwise, it is null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     */
    public void setActivatedUsing(@jakarta.annotation.Nullable final PrivilegedAccessGroupEligibilitySchedule value) {
        this.backingStore.set("activatedUsing", value);
    }
    /**
     * Sets the group property value. References the group that is the scope of the membership or ownership assignment request through PIM for Groups. Supports $expand and $select nested in $expand for select properties like id, displayName, and mail.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the groupId property value. The identifier of the group representing the scope of the membership or ownership assignment through PIM for Groups. Required.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the principal property value. References the principal that&apos;s in the scope of this membership or ownership assignment request through the group that&apos;s governed by PIM. Supports $expand and $select nested in $expand for id only.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("principal", value);
    }
    /**
     * Sets the principalId property value. The identifier of the principal whose membership or ownership assignment to the group is managed through PIM for Groups. Supports $filter (eq, ne).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
    /**
     * Sets the targetSchedule property value. Schedule created by this request. Supports $expand.
     * @param value Value to set for the targetSchedule property.
     */
    public void setTargetSchedule(@jakarta.annotation.Nullable final PrivilegedAccessGroupEligibilitySchedule value) {
        this.backingStore.set("targetSchedule", value);
    }
    /**
     * Sets the targetScheduleId property value. The identifier of the schedule that&apos;s created from the membership or ownership assignment request. Supports $filter (eq, ne).
     * @param value Value to set for the targetScheduleId property.
     */
    public void setTargetScheduleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetScheduleId", value);
    }
}
