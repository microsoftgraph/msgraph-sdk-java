package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class ProvisioningObjectSummary extends Entity implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _activityDateTime;
    /** Unique ID of this change in this cycle. */
    private String _changeId;
    /** Unique ID per job iteration. */
    private String _cycleId;
    /** Indicates how long this provisioning action took to finish. Measured in milliseconds. */
    private Integer _durationInMilliseconds;
    /** Details of who initiated this provisioning. */
    private Initiator _initiatedBy;
    /** The unique ID for the whole provisioning job. */
    private String _jobId;
    /** Details of each property that was modified in this provisioning action on this object. */
    private java.util.List<ModifiedProperty> _modifiedProperties;
    /** Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list. */
    private ProvisioningAction _provisioningAction;
    /** Details of provisioning status. */
    private ProvisioningStatusInfo _provisioningStatusInfo;
    /** Details of each step in provisioning. */
    private java.util.List<ProvisioningStep> _provisioningSteps;
    /** Represents the service principal used for provisioning. */
    private ProvisioningServicePrincipal _servicePrincipal;
    /** Details of source object being provisioned. */
    private ProvisionedIdentity _sourceIdentity;
    /** Details of source system of the object being provisioned. */
    private ProvisioningSystem _sourceSystem;
    /** Details of target object being provisioned. */
    private ProvisionedIdentity _targetIdentity;
    /** Details of target system of the object being provisioned. */
    private ProvisioningSystem _targetSystem;
    /** Unique Azure AD tenant ID. */
    private String _tenantId;
    /**
     * Instantiates a new provisioningObjectSummary and sets the default values.
     * @return a void
     */
    public ProvisioningObjectSummary() {
        super();
        this.setOdataType("#microsoft.graph.provisioningObjectSummary");
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
        return this._activityDateTime;
    }
    /**
     * Gets the changeId property value. Unique ID of this change in this cycle.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeId() {
        return this._changeId;
    }
    /**
     * Gets the cycleId property value. Unique ID per job iteration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCycleId() {
        return this._cycleId;
    }
    /**
     * Gets the durationInMilliseconds property value. Indicates how long this provisioning action took to finish. Measured in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInMilliseconds() {
        return this._durationInMilliseconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisioningObjectSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("changeId", (n) -> { currentObject.setChangeId(n.getStringValue()); });
            this.put("cycleId", (n) -> { currentObject.setCycleId(n.getStringValue()); });
            this.put("durationInMilliseconds", (n) -> { currentObject.setDurationInMilliseconds(n.getIntegerValue()); });
            this.put("initiatedBy", (n) -> { currentObject.setInitiatedBy(n.getObjectValue(Initiator::createFromDiscriminatorValue)); });
            this.put("jobId", (n) -> { currentObject.setJobId(n.getStringValue()); });
            this.put("modifiedProperties", (n) -> { currentObject.setModifiedProperties(n.getCollectionOfObjectValues(ModifiedProperty::createFromDiscriminatorValue)); });
            this.put("provisioningAction", (n) -> { currentObject.setProvisioningAction(n.getEnumValue(ProvisioningAction.class)); });
            this.put("provisioningStatusInfo", (n) -> { currentObject.setProvisioningStatusInfo(n.getObjectValue(ProvisioningStatusInfo::createFromDiscriminatorValue)); });
            this.put("provisioningSteps", (n) -> { currentObject.setProvisioningSteps(n.getCollectionOfObjectValues(ProvisioningStep::createFromDiscriminatorValue)); });
            this.put("servicePrincipal", (n) -> { currentObject.setServicePrincipal(n.getObjectValue(ProvisioningServicePrincipal::createFromDiscriminatorValue)); });
            this.put("sourceIdentity", (n) -> { currentObject.setSourceIdentity(n.getObjectValue(ProvisionedIdentity::createFromDiscriminatorValue)); });
            this.put("sourceSystem", (n) -> { currentObject.setSourceSystem(n.getObjectValue(ProvisioningSystem::createFromDiscriminatorValue)); });
            this.put("targetIdentity", (n) -> { currentObject.setTargetIdentity(n.getObjectValue(ProvisionedIdentity::createFromDiscriminatorValue)); });
            this.put("targetSystem", (n) -> { currentObject.setTargetSystem(n.getObjectValue(ProvisioningSystem::createFromDiscriminatorValue)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiatedBy property value. Details of who initiated this provisioning.
     * @return a initiator
     */
    @javax.annotation.Nullable
    public Initiator getInitiatedBy() {
        return this._initiatedBy;
    }
    /**
     * Gets the jobId property value. The unique ID for the whole provisioning job.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobId() {
        return this._jobId;
    }
    /**
     * Gets the modifiedProperties property value. Details of each property that was modified in this provisioning action on this object.
     * @return a modifiedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ModifiedProperty> getModifiedProperties() {
        return this._modifiedProperties;
    }
    /**
     * Gets the provisioningAction property value. Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list.
     * @return a provisioningAction
     */
    @javax.annotation.Nullable
    public ProvisioningAction getProvisioningAction() {
        return this._provisioningAction;
    }
    /**
     * Gets the provisioningStatusInfo property value. Details of provisioning status.
     * @return a provisioningStatusInfo
     */
    @javax.annotation.Nullable
    public ProvisioningStatusInfo getProvisioningStatusInfo() {
        return this._provisioningStatusInfo;
    }
    /**
     * Gets the provisioningSteps property value. Details of each step in provisioning.
     * @return a provisioningStep
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningStep> getProvisioningSteps() {
        return this._provisioningSteps;
    }
    /**
     * Gets the servicePrincipal property value. Represents the service principal used for provisioning.
     * @return a provisioningServicePrincipal
     */
    @javax.annotation.Nullable
    public ProvisioningServicePrincipal getServicePrincipal() {
        return this._servicePrincipal;
    }
    /**
     * Gets the sourceIdentity property value. Details of source object being provisioned.
     * @return a provisionedIdentity
     */
    @javax.annotation.Nullable
    public ProvisionedIdentity getSourceIdentity() {
        return this._sourceIdentity;
    }
    /**
     * Gets the sourceSystem property value. Details of source system of the object being provisioned.
     * @return a provisioningSystem
     */
    @javax.annotation.Nullable
    public ProvisioningSystem getSourceSystem() {
        return this._sourceSystem;
    }
    /**
     * Gets the targetIdentity property value. Details of target object being provisioned.
     * @return a provisionedIdentity
     */
    @javax.annotation.Nullable
    public ProvisionedIdentity getTargetIdentity() {
        return this._targetIdentity;
    }
    /**
     * Gets the targetSystem property value. Details of target system of the object being provisioned.
     * @return a provisioningSystem
     */
    @javax.annotation.Nullable
    public ProvisioningSystem getTargetSystem() {
        return this._targetSystem;
    }
    /**
     * Gets the tenantId property value. Unique Azure AD tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the changeId property value. Unique ID of this change in this cycle.
     * @param value Value to set for the changeId property.
     * @return a void
     */
    public void setChangeId(@javax.annotation.Nullable final String value) {
        this._changeId = value;
    }
    /**
     * Sets the cycleId property value. Unique ID per job iteration.
     * @param value Value to set for the cycleId property.
     * @return a void
     */
    public void setCycleId(@javax.annotation.Nullable final String value) {
        this._cycleId = value;
    }
    /**
     * Sets the durationInMilliseconds property value. Indicates how long this provisioning action took to finish. Measured in milliseconds.
     * @param value Value to set for the durationInMilliseconds property.
     * @return a void
     */
    public void setDurationInMilliseconds(@javax.annotation.Nullable final Integer value) {
        this._durationInMilliseconds = value;
    }
    /**
     * Sets the initiatedBy property value. Details of who initiated this provisioning.
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    public void setInitiatedBy(@javax.annotation.Nullable final Initiator value) {
        this._initiatedBy = value;
    }
    /**
     * Sets the jobId property value. The unique ID for the whole provisioning job.
     * @param value Value to set for the jobId property.
     * @return a void
     */
    public void setJobId(@javax.annotation.Nullable final String value) {
        this._jobId = value;
    }
    /**
     * Sets the modifiedProperties property value. Details of each property that was modified in this provisioning action on this object.
     * @param value Value to set for the modifiedProperties property.
     * @return a void
     */
    public void setModifiedProperties(@javax.annotation.Nullable final java.util.List<ModifiedProperty> value) {
        this._modifiedProperties = value;
    }
    /**
     * Sets the provisioningAction property value. Indicates the activity name or the operation name. Possible values are: create, update, delete, stageddelete, disable, other and unknownFutureValue. For a list of activities logged, refer to Azure AD activity list.
     * @param value Value to set for the provisioningAction property.
     * @return a void
     */
    public void setProvisioningAction(@javax.annotation.Nullable final ProvisioningAction value) {
        this._provisioningAction = value;
    }
    /**
     * Sets the provisioningStatusInfo property value. Details of provisioning status.
     * @param value Value to set for the provisioningStatusInfo property.
     * @return a void
     */
    public void setProvisioningStatusInfo(@javax.annotation.Nullable final ProvisioningStatusInfo value) {
        this._provisioningStatusInfo = value;
    }
    /**
     * Sets the provisioningSteps property value. Details of each step in provisioning.
     * @param value Value to set for the provisioningSteps property.
     * @return a void
     */
    public void setProvisioningSteps(@javax.annotation.Nullable final java.util.List<ProvisioningStep> value) {
        this._provisioningSteps = value;
    }
    /**
     * Sets the servicePrincipal property value. Represents the service principal used for provisioning.
     * @param value Value to set for the servicePrincipal property.
     * @return a void
     */
    public void setServicePrincipal(@javax.annotation.Nullable final ProvisioningServicePrincipal value) {
        this._servicePrincipal = value;
    }
    /**
     * Sets the sourceIdentity property value. Details of source object being provisioned.
     * @param value Value to set for the sourceIdentity property.
     * @return a void
     */
    public void setSourceIdentity(@javax.annotation.Nullable final ProvisionedIdentity value) {
        this._sourceIdentity = value;
    }
    /**
     * Sets the sourceSystem property value. Details of source system of the object being provisioned.
     * @param value Value to set for the sourceSystem property.
     * @return a void
     */
    public void setSourceSystem(@javax.annotation.Nullable final ProvisioningSystem value) {
        this._sourceSystem = value;
    }
    /**
     * Sets the targetIdentity property value. Details of target object being provisioned.
     * @param value Value to set for the targetIdentity property.
     * @return a void
     */
    public void setTargetIdentity(@javax.annotation.Nullable final ProvisionedIdentity value) {
        this._targetIdentity = value;
    }
    /**
     * Sets the targetSystem property value. Details of target system of the object being provisioned.
     * @param value Value to set for the targetSystem property.
     * @return a void
     */
    public void setTargetSystem(@javax.annotation.Nullable final ProvisioningSystem value) {
        this._targetSystem = value;
    }
    /**
     * Sets the tenantId property value. Unique Azure AD tenant ID.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
