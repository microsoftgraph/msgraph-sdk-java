package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleAssignmentSchedule extends UnifiedRoleScheduleBase implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleAssignmentSchedule} and sets the default values.
     */
    public UnifiedRoleAssignmentSchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleAssignmentSchedule}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignmentSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentSchedule();
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter shows the related eligible assignment for that activation. Otherwise, it's null. Supports $expand.
     * @return a {@link UnifiedRoleEligibilitySchedule}
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getActivatedUsing() {
        return this.backingStore.get("activatedUsing");
    }
    /**
     * Gets the assignmentType property value. The type of the assignment that can either be Assigned or Activated. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentType() {
        return this.backingStore.get("assignmentType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the memberType property value. How the assignment is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMemberType() {
        return this.backingStore.get("memberType");
    }
    /**
     * Gets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @return a {@link RequestSchedule}
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.backingStore.get("scheduleInfo");
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
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter shows the related eligible assignment for that activation. Otherwise, it's null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     */
    public void setActivatedUsing(@jakarta.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this.backingStore.set("activatedUsing", value);
    }
    /**
     * Sets the assignmentType property value. The type of the assignment that can either be Assigned or Activated. Supports $filter (eq, ne).
     * @param value Value to set for the assignmentType property.
     */
    public void setAssignmentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentType", value);
    }
    /**
     * Sets the memberType property value. How the assignment is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberType", value);
    }
    /**
     * Sets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("scheduleInfo", value);
    }
}
