package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics work from anywhere model performance.
 */
public class UserExperienceAnalyticsWorkFromAnywhereModelPerformance extends Entity implements Parsable {
    /**
     * The cloud identity score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudIdentityScore;
    /**
     * The cloud management score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudManagementScore;
    /**
     * The cloud provisioning score of the device model.  Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double cloudProvisioningScore;
    /**
     * The healthStatus property
     */
    private UserExperienceAnalyticsHealthState healthStatus;
    /**
     * The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String manufacturer;
    /**
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String model;
    /**
     * The devices count for the model. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer modelDeviceCount;
    /**
     * The window score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double windowsScore;
    /**
     * The work from anywhere score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double workFromAnywhereScore;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereModelPerformance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereModelPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereModelPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereModelPerformance();
    }
    /**
     * Gets the cloudIdentityScore property value. The cloud identity score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudIdentityScore() {
        return this.cloudIdentityScore;
    }
    /**
     * Gets the cloudManagementScore property value. The cloud management score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudManagementScore() {
        return this.cloudManagementScore;
    }
    /**
     * Gets the cloudProvisioningScore property value. The cloud provisioning score of the device model.  Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCloudProvisioningScore() {
        return this.cloudProvisioningScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudIdentityScore", (n) -> { this.setCloudIdentityScore(n.getDoubleValue()); });
        deserializerMap.put("cloudManagementScore", (n) -> { this.setCloudManagementScore(n.getDoubleValue()); });
        deserializerMap.put("cloudProvisioningScore", (n) -> { this.setCloudProvisioningScore(n.getDoubleValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelDeviceCount", (n) -> { this.setModelDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("windowsScore", (n) -> { this.setWindowsScore(n.getDoubleValue()); });
        deserializerMap.put("workFromAnywhereScore", (n) -> { this.setWorkFromAnywhereScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the modelDeviceCount property value. The devices count for the model. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getModelDeviceCount() {
        return this.modelDeviceCount;
    }
    /**
     * Gets the windowsScore property value. The window score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getWindowsScore() {
        return this.windowsScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. The work from anywhere score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this.workFromAnywhereScore;
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
        writer.writeDoubleValue("cloudIdentityScore", this.getCloudIdentityScore());
        writer.writeDoubleValue("cloudManagementScore", this.getCloudManagementScore());
        writer.writeDoubleValue("cloudProvisioningScore", this.getCloudProvisioningScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeIntegerValue("modelDeviceCount", this.getModelDeviceCount());
        writer.writeDoubleValue("windowsScore", this.getWindowsScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the cloudIdentityScore property value. The cloud identity score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudIdentityScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudIdentityScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudIdentityScore = value;
    }
    /**
     * Sets the cloudManagementScore property value. The cloud management score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudManagementScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudManagementScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudManagementScore = value;
    }
    /**
     * Sets the cloudProvisioningScore property value. The cloud provisioning score of the device model.  Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudProvisioningScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudProvisioningScore(@jakarta.annotation.Nullable final Double value) {
        this.cloudProvisioningScore = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the modelDeviceCount property value. The devices count for the model. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the modelDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModelDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.modelDeviceCount = value;
    }
    /**
     * Sets the windowsScore property value. The window score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the windowsScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsScore(@jakarta.annotation.Nullable final Double value) {
        this.windowsScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. The work from anywhere score of the device model. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWorkFromAnywhereScore(@jakarta.annotation.Nullable final Double value) {
        this.workFromAnywhereScore = value;
    }
}
