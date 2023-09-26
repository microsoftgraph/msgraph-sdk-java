package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleAssignmentScheduleInstance extends UnifiedRoleScheduleInstanceBase implements Parsable {
    /**
     * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     */
    private UnifiedRoleEligibilityScheduleInstance activatedUsing;
    /**
     * Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     */
    private String assignmentType;
    /**
     * The end date of the schedule instance.
     */
    private OffsetDateTime endDateTime;
    /**
     * How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     */
    private String memberType;
    /**
     * The identifier of the role assignment in Azure AD. Supports $filter (eq, ne).
     */
    private String roleAssignmentOriginId;
    /**
     * The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. Supports $filter (eq, ne).
     */
    private String roleAssignmentScheduleId;
    /**
     * When this instance starts.
     */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new UnifiedRoleAssignmentScheduleInstance and sets the default values.
     */
    public UnifiedRoleAssignmentScheduleInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleAssignmentScheduleInstance
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignmentScheduleInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentScheduleInstance();
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @return a UnifiedRoleEligibilityScheduleInstance
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstance getActivatedUsing() {
        return this.activatedUsing;
    }
    /**
     * Gets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentType() {
        return this.assignmentType;
    }
    /**
     * Gets the endDateTime property value. The end date of the schedule instance.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activatedUsing", (n) -> { this.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentType", (n) -> { this.setAssignmentType(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("roleAssignmentOriginId", (n) -> { this.setRoleAssignmentOriginId(n.getStringValue()); });
        deserializerMap.put("roleAssignmentScheduleId", (n) -> { this.setRoleAssignmentScheduleId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the roleAssignmentOriginId property value. The identifier of the role assignment in Azure AD. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleAssignmentOriginId() {
        return this.roleAssignmentOriginId;
    }
    /**
     * Gets the roleAssignmentScheduleId property value. The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleAssignmentScheduleId() {
        return this.roleAssignmentScheduleId;
    }
    /**
     * Gets the startDateTime property value. When this instance starts.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeStringValue("assignmentType", this.getAssignmentType());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeStringValue("roleAssignmentOriginId", this.getRoleAssignmentOriginId());
        writer.writeStringValue("roleAssignmentScheduleId", this.getRoleAssignmentScheduleId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     */
    public void setActivatedUsing(@jakarta.annotation.Nullable final UnifiedRoleEligibilityScheduleInstance value) {
        this.activatedUsing = value;
    }
    /**
     * Sets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @param value Value to set for the assignmentType property.
     */
    public void setAssignmentType(@jakarta.annotation.Nullable final String value) {
        this.assignmentType = value;
    }
    /**
     * Sets the endDateTime property value. The end date of the schedule instance.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final String value) {
        this.memberType = value;
    }
    /**
     * Sets the roleAssignmentOriginId property value. The identifier of the role assignment in Azure AD. Supports $filter (eq, ne).
     * @param value Value to set for the roleAssignmentOriginId property.
     */
    public void setRoleAssignmentOriginId(@jakarta.annotation.Nullable final String value) {
        this.roleAssignmentOriginId = value;
    }
    /**
     * Sets the roleAssignmentScheduleId property value. The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. Supports $filter (eq, ne).
     * @param value Value to set for the roleAssignmentScheduleId property.
     */
    public void setRoleAssignmentScheduleId(@jakarta.annotation.Nullable final String value) {
        this.roleAssignmentScheduleId = value;
    }
    /**
     * Sets the startDateTime property value. When this instance starts.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}
