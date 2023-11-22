package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device for work from anywhere report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsWorkFromAnywhereDevice extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsWorkFromAnywhereDevice and sets the default values.
     */
    public UserExperienceAnalyticsWorkFromAnywhereDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsWorkFromAnywhereDevice
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereDevice();
    }
    /**
     * Gets the autoPilotProfileAssigned property value. When TRUE, indicates the intune device's autopilot profile is assigned. When FALSE, indicates it's not Assigned. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotProfileAssigned() {
        return this.backingStore.get("autoPilotProfileAssigned");
    }
    /**
     * Gets the autoPilotRegistered property value. When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this.backingStore.get("autoPilotRegistered");
    }
    /**
     * Gets the azureAdDeviceId property value. The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.backingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the azureAdJoinType property value. The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdJoinType() {
        return this.backingStore.get("azureAdJoinType");
    }
    /**
     * Gets the azureAdRegistered property value. When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this.backingStore.get("azureAdRegistered");
    }
    /**
     * Gets the cloudIdentityScore property value. Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudIdentityScore() {
        return this.backingStore.get("cloudIdentityScore");
    }
    /**
     * Gets the cloudManagementScore property value. Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudManagementScore() {
        return this.backingStore.get("cloudManagementScore");
    }
    /**
     * Gets the cloudProvisioningScore property value. Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudProvisioningScore() {
        return this.backingStore.get("cloudProvisioningScore");
    }
    /**
     * Gets the compliancePolicySetToIntune property value. When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCompliancePolicySetToIntune() {
        return this.backingStore.get("compliancePolicySetToIntune");
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoPilotProfileAssigned", (n) -> { this.setAutoPilotProfileAssigned(n.getBooleanValue()); });
        deserializerMap.put("autoPilotRegistered", (n) -> { this.setAutoPilotRegistered(n.getBooleanValue()); });
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("azureAdJoinType", (n) -> { this.setAzureAdJoinType(n.getStringValue()); });
        deserializerMap.put("azureAdRegistered", (n) -> { this.setAzureAdRegistered(n.getBooleanValue()); });
        deserializerMap.put("cloudIdentityScore", (n) -> { this.setCloudIdentityScore(n.getDoubleValue()); });
        deserializerMap.put("cloudManagementScore", (n) -> { this.setCloudManagementScore(n.getDoubleValue()); });
        deserializerMap.put("cloudProvisioningScore", (n) -> { this.setCloudProvisioningScore(n.getDoubleValue()); });
        deserializerMap.put("compliancePolicySetToIntune", (n) -> { this.setCompliancePolicySetToIntune(n.getBooleanValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        deserializerMap.put("isCloudManagedGatewayEnabled", (n) -> { this.setIsCloudManagedGatewayEnabled(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("osCheckFailed", (n) -> { this.setOsCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("otherWorkloadsSetToIntune", (n) -> { this.setOtherWorkloadsSetToIntune(n.getBooleanValue()); });
        deserializerMap.put("ownership", (n) -> { this.setOwnership(n.getStringValue()); });
        deserializerMap.put("processor64BitCheckFailed", (n) -> { this.setProcessor64BitCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorCoreCountCheckFailed", (n) -> { this.setProcessorCoreCountCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorFamilyCheckFailed", (n) -> { this.setProcessorFamilyCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorSpeedCheckFailed", (n) -> { this.setProcessorSpeedCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("ramCheckFailed", (n) -> { this.setRamCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("secureBootCheckFailed", (n) -> { this.setSecureBootCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("storageCheckFailed", (n) -> { this.setStorageCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("tenantAttached", (n) -> { this.setTenantAttached(n.getBooleanValue()); });
        deserializerMap.put("tpmCheckFailed", (n) -> { this.setTpmCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("upgradeEligibility", (n) -> { this.setUpgradeEligibility(n.getEnumValue(OperatingSystemUpgradeEligibility::forValue)); });
        deserializerMap.put("windowsScore", (n) -> { this.setWindowsScore(n.getDoubleValue()); });
        deserializerMap.put("workFromAnywhereScore", (n) -> { this.setWorkFromAnywhereScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the isCloudManagedGatewayEnabled property value. When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudManagedGatewayEnabled() {
        return this.backingStore.get("isCloudManagedGatewayEnabled");
    }
    /**
     * Gets the managedBy property value. The management agent of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the osCheckFailed property value. When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOsCheckFailed() {
        return this.backingStore.get("osCheckFailed");
    }
    /**
     * Gets the osDescription property value. The OS description of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.backingStore.get("osDescription");
    }
    /**
     * Gets the osVersion property value. The OS version of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the otherWorkloadsSetToIntune property value. When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOtherWorkloadsSetToIntune() {
        return this.backingStore.get("otherWorkloadsSetToIntune");
    }
    /**
     * Gets the ownership property value. Ownership of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnership() {
        return this.backingStore.get("ownership");
    }
    /**
     * Gets the processor64BitCheckFailed property value. When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessor64BitCheckFailed() {
        return this.backingStore.get("processor64BitCheckFailed");
    }
    /**
     * Gets the processorCoreCountCheckFailed property value. When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorCoreCountCheckFailed() {
        return this.backingStore.get("processorCoreCountCheckFailed");
    }
    /**
     * Gets the processorFamilyCheckFailed property value. When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorFamilyCheckFailed() {
        return this.backingStore.get("processorFamilyCheckFailed");
    }
    /**
     * Gets the processorSpeedCheckFailed property value. When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorSpeedCheckFailed() {
        return this.backingStore.get("processorSpeedCheckFailed");
    }
    /**
     * Gets the ramCheckFailed property value. When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRamCheckFailed() {
        return this.backingStore.get("ramCheckFailed");
    }
    /**
     * Gets the secureBootCheckFailed property value. When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureBootCheckFailed() {
        return this.backingStore.get("secureBootCheckFailed");
    }
    /**
     * Gets the serialNumber property value. The serial number of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the storageCheckFailed property value. When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageCheckFailed() {
        return this.backingStore.get("storageCheckFailed");
    }
    /**
     * Gets the tenantAttached property value. When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTenantAttached() {
        return this.backingStore.get("tenantAttached");
    }
    /**
     * Gets the tpmCheckFailed property value. When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTpmCheckFailed() {
        return this.backingStore.get("tpmCheckFailed");
    }
    /**
     * Gets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status.
     * @return a OperatingSystemUpgradeEligibility
     */
    @jakarta.annotation.Nullable
    public OperatingSystemUpgradeEligibility getUpgradeEligibility() {
        return this.backingStore.get("upgradeEligibility");
    }
    /**
     * Gets the windowsScore property value. Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getWindowsScore() {
        return this.backingStore.get("windowsScore");
    }
    /**
     * Gets the workFromAnywhereScore property value. Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this.backingStore.get("workFromAnywhereScore");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("autoPilotProfileAssigned", this.getAutoPilotProfileAssigned());
        writer.writeBooleanValue("autoPilotRegistered", this.getAutoPilotRegistered());
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeStringValue("azureAdJoinType", this.getAzureAdJoinType());
        writer.writeBooleanValue("azureAdRegistered", this.getAzureAdRegistered());
        writer.writeDoubleValue("cloudIdentityScore", this.getCloudIdentityScore());
        writer.writeDoubleValue("cloudManagementScore", this.getCloudManagementScore());
        writer.writeDoubleValue("cloudProvisioningScore", this.getCloudProvisioningScore());
        writer.writeBooleanValue("compliancePolicySetToIntune", this.getCompliancePolicySetToIntune());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeBooleanValue("isCloudManagedGatewayEnabled", this.getIsCloudManagedGatewayEnabled());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeBooleanValue("osCheckFailed", this.getOsCheckFailed());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeBooleanValue("otherWorkloadsSetToIntune", this.getOtherWorkloadsSetToIntune());
        writer.writeStringValue("ownership", this.getOwnership());
        writer.writeBooleanValue("processor64BitCheckFailed", this.getProcessor64BitCheckFailed());
        writer.writeBooleanValue("processorCoreCountCheckFailed", this.getProcessorCoreCountCheckFailed());
        writer.writeBooleanValue("processorFamilyCheckFailed", this.getProcessorFamilyCheckFailed());
        writer.writeBooleanValue("processorSpeedCheckFailed", this.getProcessorSpeedCheckFailed());
        writer.writeBooleanValue("ramCheckFailed", this.getRamCheckFailed());
        writer.writeBooleanValue("secureBootCheckFailed", this.getSecureBootCheckFailed());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeBooleanValue("storageCheckFailed", this.getStorageCheckFailed());
        writer.writeBooleanValue("tenantAttached", this.getTenantAttached());
        writer.writeBooleanValue("tpmCheckFailed", this.getTpmCheckFailed());
        writer.writeEnumValue("upgradeEligibility", this.getUpgradeEligibility());
        writer.writeDoubleValue("windowsScore", this.getWindowsScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the autoPilotProfileAssigned property value. When TRUE, indicates the intune device's autopilot profile is assigned. When FALSE, indicates it's not Assigned. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the autoPilotProfileAssigned property.
     */
    public void setAutoPilotProfileAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoPilotProfileAssigned", value);
    }
    /**
     * Sets the autoPilotRegistered property value. When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the autoPilotRegistered property.
     */
    public void setAutoPilotRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoPilotRegistered", value);
    }
    /**
     * Sets the azureAdDeviceId property value. The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdDeviceId", value);
    }
    /**
     * Sets the azureAdJoinType property value. The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdJoinType property.
     */
    public void setAzureAdJoinType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdJoinType", value);
    }
    /**
     * Sets the azureAdRegistered property value. When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdRegistered property.
     */
    public void setAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("azureAdRegistered", value);
    }
    /**
     * Sets the cloudIdentityScore property value. Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudIdentityScore property.
     */
    public void setCloudIdentityScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cloudIdentityScore", value);
    }
    /**
     * Sets the cloudManagementScore property value. Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudManagementScore property.
     */
    public void setCloudManagementScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cloudManagementScore", value);
    }
    /**
     * Sets the cloudProvisioningScore property value. Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudProvisioningScore property.
     */
    public void setCloudProvisioningScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cloudProvisioningScore", value);
    }
    /**
     * Sets the compliancePolicySetToIntune property value. When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the compliancePolicySetToIntune property.
     */
    public void setCompliancePolicySetToIntune(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("compliancePolicySetToIntune", value);
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the isCloudManagedGatewayEnabled property value. When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the isCloudManagedGatewayEnabled property.
     */
    public void setIsCloudManagedGatewayEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudManagedGatewayEnabled", value);
    }
    /**
     * Sets the managedBy property value. The management agent of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the osCheckFailed property value. When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osCheckFailed property.
     */
    public void setOsCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("osCheckFailed", value);
    }
    /**
     * Sets the osDescription property value. The OS description of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osDescription", value);
    }
    /**
     * Sets the osVersion property value. The OS version of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the otherWorkloadsSetToIntune property value. When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the otherWorkloadsSetToIntune property.
     */
    public void setOtherWorkloadsSetToIntune(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("otherWorkloadsSetToIntune", value);
    }
    /**
     * Sets the ownership property value. Ownership of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the ownership property.
     */
    public void setOwnership(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownership", value);
    }
    /**
     * Sets the processor64BitCheckFailed property value. When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processor64BitCheckFailed property.
     */
    public void setProcessor64BitCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("processor64BitCheckFailed", value);
    }
    /**
     * Sets the processorCoreCountCheckFailed property value. When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorCoreCountCheckFailed property.
     */
    public void setProcessorCoreCountCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("processorCoreCountCheckFailed", value);
    }
    /**
     * Sets the processorFamilyCheckFailed property value. When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorFamilyCheckFailed property.
     */
    public void setProcessorFamilyCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("processorFamilyCheckFailed", value);
    }
    /**
     * Sets the processorSpeedCheckFailed property value. When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorSpeedCheckFailed property.
     */
    public void setProcessorSpeedCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("processorSpeedCheckFailed", value);
    }
    /**
     * Sets the ramCheckFailed property value. When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the ramCheckFailed property.
     */
    public void setRamCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ramCheckFailed", value);
    }
    /**
     * Sets the secureBootCheckFailed property value. When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the secureBootCheckFailed property.
     */
    public void setSecureBootCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("secureBootCheckFailed", value);
    }
    /**
     * Sets the serialNumber property value. The serial number of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the storageCheckFailed property value. When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the storageCheckFailed property.
     */
    public void setStorageCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageCheckFailed", value);
    }
    /**
     * Sets the tenantAttached property value. When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the tenantAttached property.
     */
    public void setTenantAttached(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tenantAttached", value);
    }
    /**
     * Sets the tpmCheckFailed property value. When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the tpmCheckFailed property.
     */
    public void setTpmCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tpmCheckFailed", value);
    }
    /**
     * Sets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status.
     * @param value Value to set for the upgradeEligibility property.
     */
    public void setUpgradeEligibility(@jakarta.annotation.Nullable final OperatingSystemUpgradeEligibility value) {
        this.backingStore.set("upgradeEligibility", value);
    }
    /**
     * Sets the windowsScore property value. Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the windowsScore property.
     */
    public void setWindowsScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("windowsScore", value);
    }
    /**
     * Sets the workFromAnywhereScore property value. Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     */
    public void setWorkFromAnywhereScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("workFromAnywhereScore", value);
    }
}
