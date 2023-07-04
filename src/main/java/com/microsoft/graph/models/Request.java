package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Request extends Entity implements Parsable {
    /**
     * The identifier of the approval of the request.
     */
    private String approvalId;
    /**
     * The request completion date time.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The principal that created the request.
     */
    private IdentitySet createdBy;
    /**
     * The request creation date time.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Free text field to define any custom data for the request. Not used.
     */
    private String customData;
    /**
     * The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     */
    private String status;
    /**
     * Instantiates a new request and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Request() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a request
     */
    @javax.annotation.Nonnull
    public static Request createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.unifiedRoleAssignmentScheduleRequest": return new UnifiedRoleAssignmentScheduleRequest();
                case "#microsoft.graph.unifiedRoleEligibilityScheduleRequest": return new UnifiedRoleEligibilityScheduleRequest();
                case "#microsoft.graph.userConsentRequest": return new UserConsentRequest();
            }
        }
        return new Request();
    }
    /**
     * Gets the approvalId property value. The identifier of the approval of the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApprovalId() {
        return this.approvalId;
    }
    /**
     * Gets the completedDateTime property value. The request completion date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the createdBy property value. The principal that created the request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The request creation date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customData property value. Free text field to define any custom data for the request. Not used.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomData() {
        return this.customData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalId(@javax.annotation.Nullable final String value) {
        this.approvalId = value;
    }
    /**
     * Sets the completedDateTime property value. The request completion date time.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. The principal that created the request.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The request creation date time.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customData property value. Free text field to define any custom data for the request. Not used.
     * @param value Value to set for the customData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomData(@javax.annotation.Nullable final String value) {
        this.customData = value;
    }
    /**
     * Sets the status property value. The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
