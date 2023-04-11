package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningObjectSummary extends Entity implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime activityDateTime;
    /** Unique ID of this change in this cycle. */
    private String changeId;
    /** Unique ID per job iteration. */
    private String cycleId;
    /** Indicates how long this provisioning action took to finish. Measured in milliseconds. */
    private Integer durationInMilliseconds;
    /** Details of who initiated this provisioning. */
    private Initiator initiatedBy;
    /** The unique ID for the whole provisioning job. */
    private String jobId;
    /** Details of each property that was modified in this provisioning action on this object. */
    private java.util.List<ModifiedProperty> modifiedProperties;
    /** Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list. */
    private ProvisioningAction provisioningAction;
    /** Details of provisioning status. */
    private ProvisioningStatusInfo provisioningStatusInfo;
    /** Details of each step in provisioning. */
    private java.util.List<ProvisioningStep> provisioningSteps;
    /** Represents the service principal used for provisioning. */
    private ProvisioningServicePrincipal servicePrincipal;
    /** Details of source object being provisioned. */
    private ProvisionedIdentity sourceIdentity;
    /** Details of source system of the object being provisioned. */
    private ProvisioningSystem sourceSystem;
    /** Details of target object being provisioned. */
    private ProvisionedIdentity targetIdentity;
    /** Details of target system of the object being provisioned. */
    private ProvisioningSystem targetSystem;
    /** Unique Azure AD tenant ID. */
    private String tenantId;
    /**
     * Instantiates a new provisioningObjectSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProvisioningObjectSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nonnull
    public static ProvisioningObjectSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningObjectSummary();
    }
    /**
     * Gets the activityDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the changeId property value. Unique ID of this change in this cycle.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeId() {
        return this.changeId;
    }
    /**
     * Gets the cycleId property value. Unique ID per job iteration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCycleId() {
        return this.cycleId;
    }
    /**
     * Gets the durationInMilliseconds property value. Indicates how long this provisioning action took to finish. Measured in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changeId", (n) -> { this.setChangeId(n.getStringValue()); });
        deserializerMap.put("cycleId", (n) -> { this.setCycleId(n.getStringValue()); });
        deserializerMap.put("durationInMilliseconds", (n) -> { this.setDurationInMilliseconds(n.getIntegerValue()); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getObjectValue(Initiator::createFromDiscriminatorValue)); });
        deserializerMap.put("jobId", (n) -> { this.setJobId(n.getStringValue()); });
        deserializerMap.put("modifiedProperties", (n) -> { this.setModifiedProperties(n.getCollectionOfObjectValues(ModifiedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningAction", (n) -> { this.setProvisioningAction(n.getEnumValue(ProvisioningAction.class)); });
        deserializerMap.put("provisioningStatusInfo", (n) -> { this.setProvisioningStatusInfo(n.getObjectValue(ProvisioningStatusInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningSteps", (n) -> { this.setProvisioningSteps(n.getCollectionOfObjectValues(ProvisioningStep::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipal", (n) -> { this.setServicePrincipal(n.getObjectValue(ProvisioningServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceIdentity", (n) -> { this.setSourceIdentity(n.getObjectValue(ProvisionedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceSystem", (n) -> { this.setSourceSystem(n.getObjectValue(ProvisioningSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("targetIdentity", (n) -> { this.setTargetIdentity(n.getObjectValue(ProvisionedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetSystem", (n) -> { this.setTargetSystem(n.getObjectValue(ProvisioningSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. Details of who initiated this provisioning.
     * @return a initiator
     */
    @javax.annotation.Nullable
    public Initiator getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Gets the jobId property value. The unique ID for the whole provisioning job.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobId() {
        return this.jobId;
    }
    /**
     * Gets the modifiedProperties property value. Details of each property that was modified in this provisioning action on this object.
     * @return a modifiedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ModifiedProperty> getModifiedProperties() {
        return this.modifiedProperties;
    }
    /**
     * Gets the provisioningAction property value. Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list.
     * @return a provisioningAction
     */
    @javax.annotation.Nullable
    public ProvisioningAction getProvisioningAction() {
        return this.provisioningAction;
    }
    /**
     * Gets the provisioningStatusInfo property value. Details of provisioning status.
     * @return a provisioningStatusInfo
     */
    @javax.annotation.Nullable
    public ProvisioningStatusInfo getProvisioningStatusInfo() {
        return this.provisioningStatusInfo;
    }
    /**
     * Gets the provisioningSteps property value. Details of each step in provisioning.
     * @return a provisioningStep
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningStep> getProvisioningSteps() {
        return this.provisioningSteps;
    }
    /**
     * Gets the servicePrincipal property value. Represents the service principal used for provisioning.
     * @return a provisioningServicePrincipal
     */
    @javax.annotation.Nullable
    public ProvisioningServicePrincipal getServicePrincipal() {
        return this.servicePrincipal;
    }
    /**
     * Gets the sourceIdentity property value. Details of source object being provisioned.
     * @return a provisionedIdentity
     */
    @javax.annotation.Nullable
    public ProvisionedIdentity getSourceIdentity() {
        return this.sourceIdentity;
    }
    /**
     * Gets the sourceSystem property value. Details of source system of the object being provisioned.
     * @return a provisioningSystem
     */
    @javax.annotation.Nullable
    public ProvisioningSystem getSourceSystem() {
        return this.sourceSystem;
    }
    /**
     * Gets the targetIdentity property value. Details of target object being provisioned.
     * @return a provisionedIdentity
     */
    @javax.annotation.Nullable
    public ProvisionedIdentity getTargetIdentity() {
        return this.targetIdentity;
    }
    /**
     * Gets the targetSystem property value. Details of target system of the object being provisioned.
     * @return a provisioningSystem
     */
    @javax.annotation.Nullable
    public ProvisioningSystem getTargetSystem() {
        return this.targetSystem;
    }
    /**
     * Gets the tenantId property value. Unique Azure AD tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
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
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("changeId", this.getChangeId());
        writer.writeStringValue("cycleId", this.getCycleId());
        writer.writeIntegerValue("durationInMilliseconds", this.getDurationInMilliseconds());
        writer.writeObjectValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("jobId", this.getJobId());
        writer.writeCollectionOfObjectValues("modifiedProperties", this.getModifiedProperties());
        writer.writeEnumValue("provisioningAction", this.getProvisioningAction());
        writer.writeObjectValue("provisioningStatusInfo", this.getProvisioningStatusInfo());
        writer.writeCollectionOfObjectValues("provisioningSteps", this.getProvisioningSteps());
        writer.writeObjectValue("servicePrincipal", this.getServicePrincipal());
        writer.writeObjectValue("sourceIdentity", this.getSourceIdentity());
        writer.writeObjectValue("sourceSystem", this.getSourceSystem());
        writer.writeObjectValue("targetIdentity", this.getTargetIdentity());
        writer.writeObjectValue("targetSystem", this.getTargetSystem());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the activityDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the changeId property value. Unique ID of this change in this cycle.
     * @param value Value to set for the changeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeId(@javax.annotation.Nullable final String value) {
        this.changeId = value;
    }
    /**
     * Sets the cycleId property value. Unique ID per job iteration.
     * @param value Value to set for the cycleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCycleId(@javax.annotation.Nullable final String value) {
        this.cycleId = value;
    }
    /**
     * Sets the durationInMilliseconds property value. Indicates how long this provisioning action took to finish. Measured in milliseconds.
     * @param value Value to set for the durationInMilliseconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationInMilliseconds(@javax.annotation.Nullable final Integer value) {
        this.durationInMilliseconds = value;
    }
    /**
     * Sets the initiatedBy property value. Details of who initiated this provisioning.
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiatedBy(@javax.annotation.Nullable final Initiator value) {
        this.initiatedBy = value;
    }
    /**
     * Sets the jobId property value. The unique ID for the whole provisioning job.
     * @param value Value to set for the jobId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobId(@javax.annotation.Nullable final String value) {
        this.jobId = value;
    }
    /**
     * Sets the modifiedProperties property value. Details of each property that was modified in this provisioning action on this object.
     * @param value Value to set for the modifiedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedProperties(@javax.annotation.Nullable final java.util.List<ModifiedProperty> value) {
        this.modifiedProperties = value;
    }
    /**
     * Sets the provisioningAction property value. Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list.
     * @param value Value to set for the provisioningAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningAction(@javax.annotation.Nullable final ProvisioningAction value) {
        this.provisioningAction = value;
    }
    /**
     * Sets the provisioningStatusInfo property value. Details of provisioning status.
     * @param value Value to set for the provisioningStatusInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningStatusInfo(@javax.annotation.Nullable final ProvisioningStatusInfo value) {
        this.provisioningStatusInfo = value;
    }
    /**
     * Sets the provisioningSteps property value. Details of each step in provisioning.
     * @param value Value to set for the provisioningSteps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningSteps(@javax.annotation.Nullable final java.util.List<ProvisioningStep> value) {
        this.provisioningSteps = value;
    }
    /**
     * Sets the servicePrincipal property value. Represents the service principal used for provisioning.
     * @param value Value to set for the servicePrincipal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipal(@javax.annotation.Nullable final ProvisioningServicePrincipal value) {
        this.servicePrincipal = value;
    }
    /**
     * Sets the sourceIdentity property value. Details of source object being provisioned.
     * @param value Value to set for the sourceIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIdentity(@javax.annotation.Nullable final ProvisionedIdentity value) {
        this.sourceIdentity = value;
    }
    /**
     * Sets the sourceSystem property value. Details of source system of the object being provisioned.
     * @param value Value to set for the sourceSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceSystem(@javax.annotation.Nullable final ProvisioningSystem value) {
        this.sourceSystem = value;
    }
    /**
     * Sets the targetIdentity property value. Details of target object being provisioned.
     * @param value Value to set for the targetIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetIdentity(@javax.annotation.Nullable final ProvisionedIdentity value) {
        this.targetIdentity = value;
    }
    /**
     * Sets the targetSystem property value. Details of target system of the object being provisioned.
     * @param value Value to set for the targetSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetSystem(@javax.annotation.Nullable final ProvisioningSystem value) {
        this.targetSystem = value;
    }
    /**
     * Sets the tenantId property value. Unique Azure AD tenant ID.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
