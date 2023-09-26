package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupEligibilitySchedule extends PrivilegedAccessSchedule implements Parsable {
    /**
     * The accessId property
     */
    private PrivilegedAccessGroupRelationships accessId;
    /**
     * The group property
     */
    private Group group;
    /**
     * The groupId property
     */
    private String groupId;
    /**
     * The memberType property
     */
    private PrivilegedAccessGroupMemberType memberType;
    /**
     * The principal property
     */
    private DirectoryObject principal;
    /**
     * The principalId property
     */
    private String principalId;
    /**
     * Instantiates a new PrivilegedAccessGroupEligibilitySchedule and sets the default values.
     */
    public PrivilegedAccessGroupEligibilitySchedule() {
        super();
        this.setOdataType("#microsoft.graph.privilegedAccessGroupEligibilitySchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessGroupEligibilitySchedule
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupEligibilitySchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupEligibilitySchedule();
    }
    /**
     * Gets the accessId property value. The accessId property
     * @return a PrivilegedAccessGroupRelationships
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupRelationships getAccessId() {
        return this.accessId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessId", (n) -> { this.setAccessId(n.getEnumValue(PrivilegedAccessGroupRelationships.class)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getEnumValue(PrivilegedAccessGroupMemberType.class)); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.group;
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the memberType property value. The memberType property
     * @return a PrivilegedAccessGroupMemberType
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupMemberType getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the principal property value. The principal property
     * @return a DirectoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. The principalId property
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
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeEnumValue("memberType", this.getMemberType());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
    }
    /**
     * Sets the accessId property value. The accessId property
     * @param value Value to set for the accessId property.
     */
    public void setAccessId(@jakarta.annotation.Nullable final PrivilegedAccessGroupRelationships value) {
        this.accessId = value;
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.group = value;
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the memberType property value. The memberType property
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final PrivilegedAccessGroupMemberType value) {
        this.memberType = value;
    }
    /**
     * Sets the principal property value. The principal property
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. The principalId property
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.principalId = value;
    }
}
