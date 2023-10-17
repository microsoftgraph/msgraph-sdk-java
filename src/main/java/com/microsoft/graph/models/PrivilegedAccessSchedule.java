package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessSchedule extends Entity implements Parsable {
    /**
     * When the schedule was created. Optional.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The identifier of the access assignment or eligibility request that created this schedule. Optional.
     */
    private String createdUsing;
    /**
     * When the schedule was last modified. Optional.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     */
    private RequestSchedule scheduleInfo;
    /**
     * The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     */
    private String status;
    /**
     * Instantiates a new PrivilegedAccessSchedule and sets the default values.
     */
    public PrivilegedAccessSchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessSchedule
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.privilegedAccessGroupAssignmentSchedule": return new PrivilegedAccessGroupAssignmentSchedule();
                case "#microsoft.graph.privilegedAccessGroupEligibilitySchedule": return new PrivilegedAccessGroupEligibilitySchedule();
            }
        }
        return new PrivilegedAccessSchedule();
    }
    /**
     * Gets the createdDateTime property value. When the schedule was created. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the createdUsing property value. The identifier of the access assignment or eligibility request that created this schedule. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedUsing() {
        return this.createdUsing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdUsing", (n) -> { this.setCreatedUsing(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. When the schedule was last modified. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the scheduleInfo property value. Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Gets the status property value. The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("createdUsing", this.getCreatedUsing());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. When the schedule was created. Optional.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the createdUsing property value. The identifier of the access assignment or eligibility request that created this schedule. Optional.
     * @param value Value to set for the createdUsing property.
     */
    public void setCreatedUsing(@jakarta.annotation.Nullable final String value) {
        this.createdUsing = value;
    }
    /**
     * Sets the modifiedDateTime property value. When the schedule was last modified. Optional.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the scheduleInfo property value. Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
    /**
     * Sets the status property value. The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
