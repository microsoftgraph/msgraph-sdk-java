package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This is the base class for Compliance policy. Compliance policies are platform specific and individual per-platform compliance policies inherit from here. 
 */
public class DeviceCompliancePolicy extends Entity implements Parsable {
    /**
     * The collection of assignments for this compliance policy.
     */
    private java.util.List<DeviceCompliancePolicyAssignment> assignments;
    /**
     * DateTime the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Admin provided description of the Device Configuration.
     */
    private String description;
    /**
     * Compliance Setting State Device Summary
     */
    private java.util.List<SettingStateDeviceSummary> deviceSettingStateSummaries;
    /**
     * List of DeviceComplianceDeviceStatus.
     */
    private java.util.List<DeviceComplianceDeviceStatus> deviceStatuses;
    /**
     * Device compliance devices status overview
     */
    private DeviceComplianceDeviceOverview deviceStatusOverview;
    /**
     * Admin provided name of the device configuration.
     */
    private String displayName;
    /**
     * DateTime the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     */
    private java.util.List<DeviceComplianceScheduledActionForRule> scheduledActionsForRule;
    /**
     * List of DeviceComplianceUserStatus.
     */
    private java.util.List<DeviceComplianceUserStatus> userStatuses;
    /**
     * Device compliance users status overview
     */
    private DeviceComplianceUserOverview userStatusOverview;
    /**
     * Version of the device configuration.
     */
    private Integer version;
    /**
     * Instantiates a new deviceCompliancePolicy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Compliance Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this.deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. List of DeviceComplianceDeviceStatus.
     * @return a deviceComplianceDeviceStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceDeviceStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device compliance devices status overview
     * @return a deviceComplianceDeviceOverview
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceDeviceOverview getDeviceStatusOverview() {
        return this.deviceStatusOverview;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceCompliancePolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceSettingStateSummaries", (n) -> { this.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceComplianceDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatusOverview", (n) -> { this.setDeviceStatusOverview(n.getObjectValue(DeviceComplianceDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduledActionsForRule", (n) -> { this.setScheduledActionsForRule(n.getCollectionOfObjectValues(DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatuses", (n) -> { this.setUserStatuses(n.getCollectionOfObjectValues(DeviceComplianceUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatusOverview", (n) -> { this.setUserStatusOverview(n.getObjectValue(DeviceComplianceUserOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the scheduledActionsForRule property value. The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @return a deviceComplianceScheduledActionForRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScheduledActionForRule> getScheduledActionsForRule() {
        return this.scheduledActionsForRule;
    }
    /**
     * Gets the userStatuses property value. List of DeviceComplianceUserStatus.
     * @return a deviceComplianceUserStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceUserStatus> getUserStatuses() {
        return this.userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device compliance users status overview
     * @return a deviceComplianceUserOverview
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceUserOverview getUserStatusOverview() {
        return this.userStatusOverview;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicyAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Compliance Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceSettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this.deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. List of DeviceComplianceDeviceStatus.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceDeviceStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device compliance devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStatusOverview(@jakarta.annotation.Nullable final DeviceComplianceDeviceOverview value) {
        this.deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the scheduledActionsForRule property value. The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @param value Value to set for the scheduledActionsForRule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduledActionsForRule(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScheduledActionForRule> value) {
        this.scheduledActionsForRule = value;
    }
    /**
     * Sets the userStatuses property value. List of DeviceComplianceUserStatus.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceUserStatus> value) {
        this.userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device compliance users status overview
     * @param value Value to set for the userStatusOverview property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserStatusOverview(@jakarta.annotation.Nullable final DeviceComplianceUserOverview value) {
        this.userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
