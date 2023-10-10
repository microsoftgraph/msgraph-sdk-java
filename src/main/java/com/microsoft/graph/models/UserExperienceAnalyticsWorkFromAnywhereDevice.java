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
     * When TRUE, indicates the intune device's autopilot profile is assigned. When FALSE, indicates it's not Assigned. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean autoPilotProfileAssigned;
    /**
     * When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean autoPilotRegistered;
    /**
     * The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     */
    private String azureAdDeviceId;
    /**
     * The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     */
    private String azureAdJoinType;
    /**
     * When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean azureAdRegistered;
    /**
     * Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudIdentityScore;
    /**
     * Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudManagementScore;
    /**
     * Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudProvisioningScore;
    /**
     * When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean compliancePolicySetToIntune;
    /**
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceId;
    /**
     * The name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceName;
    /**
     * The healthStatus property
     */
    private UserExperienceAnalyticsHealthState healthStatus;
    /**
     * When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean isCloudManagedGatewayEnabled;
    /**
     * The management agent of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String managedBy;
    /**
     * The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String manufacturer;
    /**
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String model;
    /**
     * When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean osCheckFailed;
    /**
     * The OS description of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String osDescription;
    /**
     * The OS version of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String osVersion;
    /**
     * When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean otherWorkloadsSetToIntune;
    /**
     * Ownership of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String ownership;
    /**
     * When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean processor64BitCheckFailed;
    /**
     * When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean processorCoreCountCheckFailed;
    /**
     * When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean processorFamilyCheckFailed;
    /**
     * When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean processorSpeedCheckFailed;
    /**
     * When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean ramCheckFailed;
    /**
     * When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean secureBootCheckFailed;
    /**
     * The serial number of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String serialNumber;
    /**
     * When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean storageCheckFailed;
    /**
     * When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean tenantAttached;
    /**
     * When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean tpmCheckFailed;
    /**
     * Work From Anywhere windows device upgrade eligibility status.
     */
    private OperatingSystemUpgradeEligibility upgradeEligibility;
    /**
     * Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double windowsScore;
    /**
     * Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double workFromAnywhereScore;
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
        return this.autoPilotProfileAssigned;
    }
    /**
     * Gets the autoPilotRegistered property value. When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this.autoPilotRegistered;
    }
    /**
     * Gets the azureAdDeviceId property value. The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.azureAdDeviceId;
    }
    /**
     * Gets the azureAdJoinType property value. The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdJoinType() {
        return this.azureAdJoinType;
    }
    /**
     * Gets the azureAdRegistered property value. When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this.azureAdRegistered;
    }
    /**
     * Gets the cloudIdentityScore property value. Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudIdentityScore() {
        return this.cloudIdentityScore;
    }
    /**
     * Gets the cloudManagementScore property value. Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudManagementScore() {
        return this.cloudManagementScore;
    }
    /**
     * Gets the cloudProvisioningScore property value. Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCloudProvisioningScore() {
        return this.cloudProvisioningScore;
    }
    /**
     * Gets the compliancePolicySetToIntune property value. When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCompliancePolicySetToIntune() {
        return this.compliancePolicySetToIntune;
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
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
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
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
        deserializerMap.put("upgradeEligibility", (n) -> { this.setUpgradeEligibility(n.getEnumValue(OperatingSystemUpgradeEligibility.class)); });
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
        return this.healthStatus;
    }
    /**
     * Gets the isCloudManagedGatewayEnabled property value. When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudManagedGatewayEnabled() {
        return this.isCloudManagedGatewayEnabled;
    }
    /**
     * Gets the managedBy property value. The management agent of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the osCheckFailed property value. When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOsCheckFailed() {
        return this.osCheckFailed;
    }
    /**
     * Gets the osDescription property value. The OS description of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. The OS version of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the otherWorkloadsSetToIntune property value. When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOtherWorkloadsSetToIntune() {
        return this.otherWorkloadsSetToIntune;
    }
    /**
     * Gets the ownership property value. Ownership of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnership() {
        return this.ownership;
    }
    /**
     * Gets the processor64BitCheckFailed property value. When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessor64BitCheckFailed() {
        return this.processor64BitCheckFailed;
    }
    /**
     * Gets the processorCoreCountCheckFailed property value. When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorCoreCountCheckFailed() {
        return this.processorCoreCountCheckFailed;
    }
    /**
     * Gets the processorFamilyCheckFailed property value. When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorFamilyCheckFailed() {
        return this.processorFamilyCheckFailed;
    }
    /**
     * Gets the processorSpeedCheckFailed property value. When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProcessorSpeedCheckFailed() {
        return this.processorSpeedCheckFailed;
    }
    /**
     * Gets the ramCheckFailed property value. When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRamCheckFailed() {
        return this.ramCheckFailed;
    }
    /**
     * Gets the secureBootCheckFailed property value. When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureBootCheckFailed() {
        return this.secureBootCheckFailed;
    }
    /**
     * Gets the serialNumber property value. The serial number of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the storageCheckFailed property value. When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageCheckFailed() {
        return this.storageCheckFailed;
    }
    /**
     * Gets the tenantAttached property value. When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTenantAttached() {
        return this.tenantAttached;
    }
    /**
     * Gets the tpmCheckFailed property value. When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTpmCheckFailed() {
        return this.tpmCheckFailed;
    }
    /**
     * Gets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status.
     * @return a OperatingSystemUpgradeEligibility
     */
    @jakarta.annotation.Nullable
    public OperatingSystemUpgradeEligibility getUpgradeEligibility() {
        return this.upgradeEligibility;
    }
    /**
     * Gets the windowsScore property value. Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getWindowsScore() {
        return this.windowsScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this.workFromAnywhereScore;
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
        this.autoPilotProfileAssigned = value;
    }
    /**
     * Sets the autoPilotRegistered property value. When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the autoPilotRegistered property.
     */
    public void setAutoPilotRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.autoPilotRegistered = value;
    }
    /**
     * Sets the azureAdDeviceId property value. The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.azureAdDeviceId = value;
    }
    /**
     * Sets the azureAdJoinType property value. The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdJoinType property.
     */
    public void setAzureAdJoinType(@jakarta.annotation.Nullable final String value) {
        this.azureAdJoinType = value;
    }
    /**
     * Sets the azureAdRegistered property value. When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the azureAdRegistered property.
     */
    public void setAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.azureAdRegistered = value;
    }
    /**
     * Sets the cloudIdentityScore property value. Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudIdentityScore property.
     */
    public void setCloudIdentityScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudIdentityScore = value;
    }
    /**
     * Sets the cloudManagementScore property value. Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudManagementScore property.
     */
    public void setCloudManagementScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudManagementScore = value;
    }
    /**
     * Sets the cloudProvisioningScore property value. Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudProvisioningScore property.
     */
    public void setCloudProvisioningScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudProvisioningScore = value;
    }
    /**
     * Sets the compliancePolicySetToIntune property value. When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the compliancePolicySetToIntune property.
     */
    public void setCompliancePolicySetToIntune(@jakarta.annotation.Nullable final Boolean value) {
        this.compliancePolicySetToIntune = value;
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the isCloudManagedGatewayEnabled property value. When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the isCloudManagedGatewayEnabled property.
     */
    public void setIsCloudManagedGatewayEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCloudManagedGatewayEnabled = value;
    }
    /**
     * Sets the managedBy property value. The management agent of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.managedBy = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the osCheckFailed property value. When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osCheckFailed property.
     */
    public void setOsCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.osCheckFailed = value;
    }
    /**
     * Sets the osDescription property value. The OS description of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. The OS version of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the otherWorkloadsSetToIntune property value. When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the otherWorkloadsSetToIntune property.
     */
    public void setOtherWorkloadsSetToIntune(@jakarta.annotation.Nullable final Boolean value) {
        this.otherWorkloadsSetToIntune = value;
    }
    /**
     * Sets the ownership property value. Ownership of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the ownership property.
     */
    public void setOwnership(@jakarta.annotation.Nullable final String value) {
        this.ownership = value;
    }
    /**
     * Sets the processor64BitCheckFailed property value. When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processor64BitCheckFailed property.
     */
    public void setProcessor64BitCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.processor64BitCheckFailed = value;
    }
    /**
     * Sets the processorCoreCountCheckFailed property value. When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorCoreCountCheckFailed property.
     */
    public void setProcessorCoreCountCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.processorCoreCountCheckFailed = value;
    }
    /**
     * Sets the processorFamilyCheckFailed property value. When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorFamilyCheckFailed property.
     */
    public void setProcessorFamilyCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.processorFamilyCheckFailed = value;
    }
    /**
     * Sets the processorSpeedCheckFailed property value. When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processorSpeedCheckFailed property.
     */
    public void setProcessorSpeedCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.processorSpeedCheckFailed = value;
    }
    /**
     * Sets the ramCheckFailed property value. When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the ramCheckFailed property.
     */
    public void setRamCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.ramCheckFailed = value;
    }
    /**
     * Sets the secureBootCheckFailed property value. When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the secureBootCheckFailed property.
     */
    public void setSecureBootCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.secureBootCheckFailed = value;
    }
    /**
     * Sets the serialNumber property value. The serial number of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the storageCheckFailed property value. When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the storageCheckFailed property.
     */
    public void setStorageCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.storageCheckFailed = value;
    }
    /**
     * Sets the tenantAttached property value. When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the tenantAttached property.
     */
    public void setTenantAttached(@jakarta.annotation.Nullable final Boolean value) {
        this.tenantAttached = value;
    }
    /**
     * Sets the tpmCheckFailed property value. When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the tpmCheckFailed property.
     */
    public void setTpmCheckFailed(@jakarta.annotation.Nullable final Boolean value) {
        this.tpmCheckFailed = value;
    }
    /**
     * Sets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status.
     * @param value Value to set for the upgradeEligibility property.
     */
    public void setUpgradeEligibility(@jakarta.annotation.Nullable final OperatingSystemUpgradeEligibility value) {
        this.upgradeEligibility = value;
    }
    /**
     * Sets the windowsScore property value. Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the windowsScore property.
     */
    public void setWindowsScore(@jakarta.annotation.Nullable final Double value) {
        this.windowsScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     */
    public void setWorkFromAnywhereScore(@jakarta.annotation.Nullable final Double value) {
        this.workFromAnywhereScore = value;
    }
}
