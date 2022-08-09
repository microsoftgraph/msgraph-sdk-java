package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceCompliancePolicy extends Entity implements Parsable {
    /** The collection of assignments for this compliance policy. */
    private java.util.List<DeviceCompliancePolicyAssignment> _assignments;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String _description;
    /** Compliance Setting State Device Summary */
    private java.util.List<SettingStateDeviceSummary> _deviceSettingStateSummaries;
    /** List of DeviceComplianceDeviceStatus. */
    private java.util.List<DeviceComplianceDeviceStatus> _deviceStatuses;
    /** Device compliance devices status overview */
    private DeviceComplianceDeviceOverview _deviceStatusOverview;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The list of scheduled action for this rule */
    private java.util.List<DeviceComplianceScheduledActionForRule> _scheduledActionsForRule;
    /** List of DeviceComplianceUserStatus. */
    private java.util.List<DeviceComplianceUserStatus> _userStatuses;
    /** Device compliance users status overview */
    private DeviceComplianceUserOverview _userStatusOverview;
    /** Version of the device configuration. */
    private Integer _version;
    /**
     * Instantiates a new DeviceCompliancePolicy and sets the default values.
     * @return a void
     */
    public DeviceCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.deviceCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCompliancePolicy
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidCompliancePolicy": return new AndroidCompliancePolicy();
                case "#microsoft.graph.androidWorkProfileCompliancePolicy": return new AndroidWorkProfileCompliancePolicy();
                case "#microsoft.graph.iosCompliancePolicy": return new IosCompliancePolicy();
                case "#microsoft.graph.macOSCompliancePolicy": return new MacOSCompliancePolicy();
                case "#microsoft.graph.windows10CompliancePolicy": return new Windows10CompliancePolicy();
                case "#microsoft.graph.windows10MobileCompliancePolicy": return new Windows10MobileCompliancePolicy();
                case "#microsoft.graph.windows81CompliancePolicy": return new Windows81CompliancePolicy();
                case "#microsoft.graph.windowsPhone81CompliancePolicy": return new WindowsPhone81CompliancePolicy();
            }
        }
        return new DeviceCompliancePolicy();
    }
    /**
     * Gets the assignments property value. The collection of assignments for this compliance policy.
     * @return a deviceCompliancePolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Compliance Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @javax.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this._deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. List of DeviceComplianceDeviceStatus.
     * @return a deviceComplianceDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device compliance devices status overview
     * @return a deviceComplianceDeviceOverview
     */
    @javax.annotation.Nullable
    public DeviceComplianceDeviceOverview getDeviceStatusOverview() {
        return this._deviceStatusOverview;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceCompliancePolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceCompliancePolicyAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceSettingStateSummaries", (n) -> { currentObject.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceComplianceDeviceStatus::createFromDiscriminatorValue)); });
            this.put("deviceStatusOverview", (n) -> { currentObject.setDeviceStatusOverview(n.getObjectValue(DeviceComplianceDeviceOverview::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("scheduledActionsForRule", (n) -> { currentObject.setScheduledActionsForRule(n.getCollectionOfObjectValues(DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
            this.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(DeviceComplianceUserStatus::createFromDiscriminatorValue)); });
            this.put("userStatusOverview", (n) -> { currentObject.setUserStatusOverview(n.getObjectValue(DeviceComplianceUserOverview::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the scheduledActionsForRule property value. The list of scheduled action for this rule
     * @return a deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScheduledActionForRule> getScheduledActionsForRule() {
        return this._scheduledActionsForRule;
    }
    /**
     * Gets the userStatuses property value. List of DeviceComplianceUserStatus.
     * @return a deviceComplianceUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device compliance users status overview
     * @return a deviceComplianceUserOverview
     */
    @javax.annotation.Nullable
    public DeviceComplianceUserOverview getUserStatusOverview() {
        return this._userStatusOverview;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusOverview", this.getDeviceStatusOverview());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("scheduledActionsForRule", this.getScheduledActionsForRule());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusOverview", this.getUserStatusOverview());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The collection of assignments for this compliance policy.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Compliance Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this._deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. List of DeviceComplianceDeviceStatus.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<DeviceComplianceDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device compliance devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     * @return a void
     */
    public void setDeviceStatusOverview(@javax.annotation.Nullable final DeviceComplianceDeviceOverview value) {
        this._deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the scheduledActionsForRule property value. The list of scheduled action for this rule
     * @param value Value to set for the scheduledActionsForRule property.
     * @return a void
     */
    public void setScheduledActionsForRule(@javax.annotation.Nullable final java.util.List<DeviceComplianceScheduledActionForRule> value) {
        this._scheduledActionsForRule = value;
    }
    /**
     * Sets the userStatuses property value. List of DeviceComplianceUserStatus.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<DeviceComplianceUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device compliance users status overview
     * @param value Value to set for the userStatusOverview property.
     * @return a void
     */
    public void setUserStatusOverview(@javax.annotation.Nullable final DeviceComplianceUserOverview value) {
        this._userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
