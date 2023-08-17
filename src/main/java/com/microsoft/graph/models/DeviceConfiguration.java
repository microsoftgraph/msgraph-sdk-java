package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
public class DeviceConfiguration extends Entity implements Parsable {
    /**
     * The list of assignments for the device configuration profile.
     */
    private java.util.List<DeviceConfigurationAssignment> assignments;
    /**
     * DateTime the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Admin provided description of the Device Configuration.
     */
    private String description;
    /**
     * Device Configuration Setting State Device Summary
     */
    private java.util.List<SettingStateDeviceSummary> deviceSettingStateSummaries;
    /**
     * Device configuration installation status by device.
     */
    private java.util.List<DeviceConfigurationDeviceStatus> deviceStatuses;
    /**
     * Device Configuration devices status overview
     */
    private DeviceConfigurationDeviceOverview deviceStatusOverview;
    /**
     * Admin provided name of the device configuration.
     */
    private String displayName;
    /**
     * DateTime the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Device configuration installation status by user.
     */
    private java.util.List<DeviceConfigurationUserStatus> userStatuses;
    /**
     * Device Configuration users status overview
     */
    private DeviceConfigurationUserOverview userStatusOverview;
    /**
     * Version of the device configuration.
     */
    private Integer version;
    /**
     * Instantiates a new deviceConfiguration and sets the default values.
     */
    public DeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidCustomConfiguration": return new AndroidCustomConfiguration();
                case "#microsoft.graph.androidGeneralDeviceConfiguration": return new AndroidGeneralDeviceConfiguration();
                case "#microsoft.graph.androidWorkProfileCustomConfiguration": return new AndroidWorkProfileCustomConfiguration();
                case "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration": return new AndroidWorkProfileGeneralDeviceConfiguration();
                case "#microsoft.graph.appleDeviceFeaturesConfigurationBase": return new AppleDeviceFeaturesConfigurationBase();
                case "#microsoft.graph.editionUpgradeConfiguration": return new EditionUpgradeConfiguration();
                case "#microsoft.graph.iosCertificateProfile": return new IosCertificateProfile();
                case "#microsoft.graph.iosCustomConfiguration": return new IosCustomConfiguration();
                case "#microsoft.graph.iosDeviceFeaturesConfiguration": return new IosDeviceFeaturesConfiguration();
                case "#microsoft.graph.iosGeneralDeviceConfiguration": return new IosGeneralDeviceConfiguration();
                case "#microsoft.graph.iosUpdateConfiguration": return new IosUpdateConfiguration();
                case "#microsoft.graph.macOSCustomConfiguration": return new MacOSCustomConfiguration();
                case "#microsoft.graph.macOSDeviceFeaturesConfiguration": return new MacOSDeviceFeaturesConfiguration();
                case "#microsoft.graph.macOSGeneralDeviceConfiguration": return new MacOSGeneralDeviceConfiguration();
                case "#microsoft.graph.sharedPCConfiguration": return new SharedPCConfiguration();
                case "#microsoft.graph.windows10CustomConfiguration": return new Windows10CustomConfiguration();
                case "#microsoft.graph.windows10EndpointProtectionConfiguration": return new Windows10EndpointProtectionConfiguration();
                case "#microsoft.graph.windows10EnterpriseModernAppManagementConfiguration": return new Windows10EnterpriseModernAppManagementConfiguration();
                case "#microsoft.graph.windows10GeneralConfiguration": return new Windows10GeneralConfiguration();
                case "#microsoft.graph.windows10SecureAssessmentConfiguration": return new Windows10SecureAssessmentConfiguration();
                case "#microsoft.graph.windows10TeamGeneralConfiguration": return new Windows10TeamGeneralConfiguration();
                case "#microsoft.graph.windows81GeneralConfiguration": return new Windows81GeneralConfiguration();
                case "#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration": return new WindowsDefenderAdvancedThreatProtectionConfiguration();
                case "#microsoft.graph.windowsPhone81CustomConfiguration": return new WindowsPhone81CustomConfiguration();
                case "#microsoft.graph.windowsPhone81GeneralConfiguration": return new WindowsPhone81GeneralConfiguration();
                case "#microsoft.graph.windowsUpdateForBusinessConfiguration": return new WindowsUpdateForBusinessConfiguration();
            }
        }
        return new DeviceConfiguration();
    }
    /**
     * Gets the assignments property value. The list of assignments for the device configuration profile.
     * @return a deviceConfigurationAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
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
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this.deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a deviceConfigurationDeviceStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a deviceConfigurationDeviceOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceSettingStateSummaries", (n) -> { this.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceConfigurationDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatusOverview", (n) -> { this.setDeviceStatusOverview(n.getObjectValue(DeviceConfigurationDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userStatuses", (n) -> { this.setUserStatuses(n.getCollectionOfObjectValues(DeviceConfigurationUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatusOverview", (n) -> { this.setUserStatusOverview(n.getObjectValue(DeviceConfigurationUserOverview::createFromDiscriminatorValue)); });
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
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a deviceConfigurationUserStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this.userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a deviceConfigurationUserOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
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
     */
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
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusOverview", this.getUserStatusOverview());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of assignments for the device configuration profile.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     */
    public void setDeviceSettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this.deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     */
    public void setDeviceStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this.deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     */
    public void setUserStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this.userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     */
    public void setUserStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this.userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
