package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleEligibilityScheduleInstance extends UnifiedRoleScheduleInstanceBase implements Parsable {
    /**
     * The end date of the schedule instance.
     */
    private OffsetDateTime endDateTime;
    /**
     * How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     */
    private String memberType;
    /**
     * The identifier of the unifiedRoleEligibilitySchedule object from which this instance was created. Supports $filter (eq, ne).
     */
    private String roleEligibilityScheduleId;
    /**
     * When this instance starts.
     */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new unifiedRoleEligibilityScheduleInstance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleEligibilityScheduleInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilityScheduleInstance();
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
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("roleEligibilityScheduleId", (n) -> { this.setRoleEligibilityScheduleId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memberType property value. How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the roleEligibilityScheduleId property value. The identifier of the unifiedRoleEligibilitySchedule object from which this instance was created. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleEligibilityScheduleId() {
        return this.roleEligibilityScheduleId;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeStringValue("roleEligibilityScheduleId", this.getRoleEligibilityScheduleId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the endDateTime property value. The end date of the schedule instance.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the memberType property value. How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMemberType(@jakarta.annotation.Nullable final String value) {
        this.memberType = value;
    }
    /**
     * Sets the roleEligibilityScheduleId property value. The identifier of the unifiedRoleEligibilitySchedule object from which this instance was created. Supports $filter (eq, ne).
     * @param value Value to set for the roleEligibilityScheduleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleEligibilityScheduleId(@jakarta.annotation.Nullable final String value) {
        this.roleEligibilityScheduleId = value;
    }
    /**
     * Sets the startDateTime property value. When this instance starts.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}
