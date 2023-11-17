package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Request extends Entity implements Parsable {
    /**
     * Instantiates a new Request and sets the default values.
     */
    public Request() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Request
     */
    @jakarta.annotation.Nonnull
    public static Request createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.privilegedAccessGroupAssignmentScheduleRequest": return new PrivilegedAccessGroupAssignmentScheduleRequest();
                case "#microsoft.graph.privilegedAccessGroupEligibilityScheduleRequest": return new PrivilegedAccessGroupEligibilityScheduleRequest();
                case "#microsoft.graph.privilegedAccessScheduleRequest": return new PrivilegedAccessScheduleRequest();
                case "#microsoft.graph.unifiedRoleAssignmentScheduleRequest": return new UnifiedRoleAssignmentScheduleRequest();
                case "#microsoft.graph.unifiedRoleEligibilityScheduleRequest": return new UnifiedRoleEligibilityScheduleRequest();
                case "#microsoft.graph.userConsentRequest": return new UserConsentRequest();
            }
        }
        return new Request();
    }
    /**
     * Gets the approvalId property value. The identifier of the approval of the request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApprovalId() {
        return this.backingStore.get("approvalId");
    }
    /**
     * Gets the completedDateTime property value. The request completion date time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdBy property value. The principal that created the request.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The request creation date time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customData property value. Free text field to define any custom data for the request. Not used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomData() {
        return this.backingStore.get("customData");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalId", (n) -> { this.setApprovalId(n.getStringValue()); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("approvalId", this.getApprovalId());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("customData", this.getCustomData());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the approvalId property value. The identifier of the approval of the request.
     * @param value Value to set for the approvalId property.
     */
    public void setApprovalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("approvalId", value);
    }
    /**
     * Sets the completedDateTime property value. The request completion date time.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdBy property value. The principal that created the request.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The request creation date time.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customData property value. Free text field to define any custom data for the request. Not used.
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customData", value);
    }
    /**
     * Sets the status property value. The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
