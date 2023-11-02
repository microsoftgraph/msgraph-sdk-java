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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfiguration and sets the default values.
     */
    public DeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfiguration
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
     * @return a java.util.List<DeviceConfigurationAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this.getBackingStore().get("assignments");
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.getBackingStore().get("createdDateTime");
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a java.util.List<SettingStateDeviceSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this.getBackingStore().get("deviceSettingStateSummaries");
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a java.util.List<DeviceConfigurationDeviceStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this.getBackingStore().get("deviceStatuses");
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a DeviceConfigurationDeviceOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
        return this.getBackingStore().get("deviceStatusOverview");
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
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
        return this.getBackingStore().get("lastModifiedDateTime");
    }
    /**
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a java.util.List<DeviceConfigurationUserStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this.getBackingStore().get("userStatuses");
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a DeviceConfigurationUserOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
        return this.getBackingStore().get("userStatusOverview");
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.getBackingStore().get("version");
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
        this.getBackingStore().set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     */
    public void setDeviceSettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this.getBackingStore().set("deviceSettingStateSummaries", value);
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this.getBackingStore().set("deviceStatuses", value);
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     */
    public void setDeviceStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this.getBackingStore().set("deviceStatusOverview", value);
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastModifiedDateTime", value);
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     */
    public void setUserStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this.getBackingStore().set("userStatuses", value);
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     */
    public void setUserStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this.getBackingStore().set("userStatusOverview", value);
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("version", value);
    }
}
