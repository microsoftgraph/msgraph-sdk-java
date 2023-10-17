package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupEligibilityScheduleInstance extends PrivilegedAccessScheduleInstance implements Parsable {
    /**
     * The identifier of the membership or ownership eligibility relationship to the group. Required. The possible values are: owner, member. Supports $filter (eq).
     */
    private PrivilegedAccessGroupRelationships accessId;
    /**
     * The identifier of the privilegedAccessGroupEligibilitySchedule from which this instance was created. Required. Supports $filter (eq, ne).
     */
    private String eligibilityScheduleId;
    /**
     * References the group that is the scope of the membership or ownership eligibility through PIM for groups. Supports $expand.
     */
    private Group group;
    /**
     * The identifier of the group representing the scope of the membership or ownership eligibility through PIM for groups. Required. Supports $filter (eq).
     */
    private String groupId;
    /**
     * Indicates whether the assignment is derived from a group assignment. It can further imply whether the calling principal can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     */
    private PrivilegedAccessGroupMemberType memberType;
    /**
     * References the principal that's in the scope of the membership or ownership eligibility request through the group that's governed by PIM. Supports $expand.
     */
    private DirectoryObject principal;
    /**
     * The identifier of the principal whose membership or ownership eligibility to the group is managed through PIM for groups. Required. Supports $filter (eq).
     */
    private String principalId;
    /**
     * Instantiates a new PrivilegedAccessGroupEligibilityScheduleInstance and sets the default values.
     */
    public PrivilegedAccessGroupEligibilityScheduleInstance() {
        super();
        this.setOdataType("#microsoft.graph.privilegedAccessGroupEligibilityScheduleInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessGroupEligibilityScheduleInstance
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupEligibilityScheduleInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupEligibilityScheduleInstance();
    }
    /**
     * Gets the accessId property value. The identifier of the membership or ownership eligibility relationship to the group. Required. The possible values are: owner, member. Supports $filter (eq).
     * @return a PrivilegedAccessGroupRelationships
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupRelationships getAccessId() {
        return this.accessId;
    }
    /**
     * Gets the eligibilityScheduleId property value. The identifier of the privilegedAccessGroupEligibilitySchedule from which this instance was created. Required. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEligibilityScheduleId() {
        return this.eligibilityScheduleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessId", (n) -> { this.setAccessId(n.getEnumValue(PrivilegedAccessGroupRelationships.class)); });
        deserializerMap.put("eligibilityScheduleId", (n) -> { this.setEligibilityScheduleId(n.getStringValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getEnumValue(PrivilegedAccessGroupMemberType.class)); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. References the group that is the scope of the membership or ownership eligibility through PIM for groups. Supports $expand.
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.group;
    }
    /**
     * Gets the groupId property value. The identifier of the group representing the scope of the membership or ownership eligibility through PIM for groups. Required. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the memberType property value. Indicates whether the assignment is derived from a group assignment. It can further imply whether the calling principal can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @return a PrivilegedAccessGroupMemberType
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupMemberType getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the principal property value. References the principal that's in the scope of the membership or ownership eligibility request through the group that's governed by PIM. Supports $expand.
     * @return a DirectoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. The identifier of the principal whose membership or ownership eligibility to the group is managed through PIM for groups. Required. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessId", this.getAccessId());
        writer.writeStringValue("eligibilityScheduleId", this.getEligibilityScheduleId());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeEnumValue("memberType", this.getMemberType());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
    }
    /**
     * Sets the accessId property value. The identifier of the membership or ownership eligibility relationship to the group. Required. The possible values are: owner, member. Supports $filter (eq).
     * @param value Value to set for the accessId property.
     */
    public void setAccessId(@jakarta.annotation.Nullable final PrivilegedAccessGroupRelationships value) {
        this.accessId = value;
    }
    /**
     * Sets the eligibilityScheduleId property value. The identifier of the privilegedAccessGroupEligibilitySchedule from which this instance was created. Required. Supports $filter (eq, ne).
     * @param value Value to set for the eligibilityScheduleId property.
     */
    public void setEligibilityScheduleId(@jakarta.annotation.Nullable final String value) {
        this.eligibilityScheduleId = value;
    }
    /**
     * Sets the group property value. References the group that is the scope of the membership or ownership eligibility through PIM for groups. Supports $expand.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.group = value;
    }
    /**
     * Sets the groupId property value. The identifier of the group representing the scope of the membership or ownership eligibility through PIM for groups. Required. Supports $filter (eq).
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the memberType property value. Indicates whether the assignment is derived from a group assignment. It can further imply whether the calling principal can manage the assignment schedule. Required. The possible values are: direct, group, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final PrivilegedAccessGroupMemberType value) {
        this.memberType = value;
    }
    /**
     * Sets the principal property value. References the principal that's in the scope of the membership or ownership eligibility request through the group that's governed by PIM. Supports $expand.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. The identifier of the principal whose membership or ownership eligibility to the group is managed through PIM for groups. Required. Supports $filter (eq).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.principalId = value;
    }
}
