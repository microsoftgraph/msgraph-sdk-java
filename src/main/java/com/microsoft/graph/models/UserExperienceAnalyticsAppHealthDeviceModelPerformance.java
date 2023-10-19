package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device model performance entity contains device model performance details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthDeviceModelPerformance extends Entity implements Parsable {
    /**
     * The number of active devices for the model. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer activeDeviceCount;
    /**
     * The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceManufacturer;
    /**
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceModel;
    /**
     * The healthStatus property
     */
    private UserExperienceAnalyticsHealthState healthStatus;
    /**
     * The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer meanTimeToFailureInMinutes;
    /**
     * The application health score of the device model. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double modelAppHealthScore;
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthDeviceModelPerformance and sets the default values.
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthDeviceModelPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDeviceModelPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDeviceModelPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The number of active devices for the model. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.activeDeviceCount;
    }
    /**
     * Gets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDeviceCount", (n) -> { this.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { this.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("modelAppHealthScore", (n) -> { this.setModelAppHealthScore(n.getDoubleValue()); });
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
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
    }
    /**
     * Gets the modelAppHealthScore property value. The application health score of the device model. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getModelAppHealthScore() {
        return this.modelAppHealthScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeDoubleValue("modelAppHealthScore", this.getModelAppHealthScore());
    }
    /**
     * Sets the activeDeviceCount property value. The number of active devices for the model. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     */
    public void setActiveDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.activeDeviceCount = value;
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceManufacturer property.
     */
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     */
    public void setMeanTimeToFailureInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the modelAppHealthScore property value. The application health score of the device model. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the modelAppHealthScore property.
     */
    public void setModelAppHealthScore(@jakarta.annotation.Nullable final Double value) {
        this.modelAppHealthScore = value;
    }
}
