package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignmentSchedule extends UnifiedRoleScheduleBase implements Parsable {
    /**
     * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     */
    private UnifiedRoleEligibilitySchedule activatedUsing;
    /**
     * Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     */
    private String assignmentType;
    /**
     * How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     */
    private String memberType;
    /**
     * The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     */
    private RequestSchedule scheduleInfo;
    /**
     * Instantiates a new unifiedRoleAssignmentSchedule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleAssignmentSchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignmentSchedule
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignmentSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentSchedule();
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @return a unifiedRoleEligibilitySchedule
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getActivatedUsing() {
        return this.activatedUsing;
    }
    /**
     * Gets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentType() {
        return this.assignmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activatedUsing", (n) -> { this.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentType", (n) -> { this.setAssignmentType(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @return a requestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeStringValue("assignmentType", this.getAssignmentType());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActivatedUsing(@jakarta.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this.activatedUsing = value;
    }
    /**
     * Sets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @param value Value to set for the assignmentType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignmentType(@jakarta.annotation.Nullable final String value) {
        this.assignmentType = value;
    }
    /**
     * Sets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMemberType(@jakarta.annotation.Nullable final String value) {
        this.memberType = value;
    }
    /**
     * Sets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
}
