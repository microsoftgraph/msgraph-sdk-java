package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device performance entity contains device performance details.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformance extends Entity implements Parsable {
    /**
     * The number of application crashes for the device. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer appCrashCount;
    /**
     * The number of application hangs for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer appHangCount;
    /**
     * The number of distinct application crashes for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer crashedAppCount;
    /**
     * The application health score of the device. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double deviceAppHealthScore;
    /**
     * The name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceDisplayName;
    /**
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceId;
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
     * The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    private OffsetDateTime processedDateTime;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthDevicePerformance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthDevicePerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDevicePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDevicePerformance();
    }
    /**
     * Gets the appCrashCount property value. The number of application crashes for the device. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.appCrashCount;
    }
    /**
     * Gets the appHangCount property value. The number of application hangs for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppHangCount() {
        return this.appHangCount;
    }
    /**
     * Gets the crashedAppCount property value. The number of distinct application crashes for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCrashedAppCount() {
        return this.crashedAppCount;
    }
    /**
     * Gets the deviceAppHealthScore property value. The application health score of the device. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getDeviceAppHealthScore() {
        return this.deviceAppHealthScore;
    }
    /**
     * Gets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
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
        deserializerMap.put("appCrashCount", (n) -> { this.setAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("appHangCount", (n) -> { this.setAppHangCount(n.getIntegerValue()); });
        deserializerMap.put("crashedAppCount", (n) -> { this.setCrashedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deviceAppHealthScore", (n) -> { this.setDeviceAppHealthScore(n.getDoubleValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { this.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("processedDateTime", (n) -> { this.setProcessedDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
    }
    /**
     * Gets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProcessedDateTime() {
        return this.processedDateTime;
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
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeIntegerValue("appHangCount", this.getAppHangCount());
        writer.writeIntegerValue("crashedAppCount", this.getCrashedAppCount());
        writer.writeDoubleValue("deviceAppHealthScore", this.getDeviceAppHealthScore());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeOffsetDateTimeValue("processedDateTime", this.getProcessedDateTime());
    }
    /**
     * Sets the appCrashCount property value. The number of application crashes for the device. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppCrashCount(@jakarta.annotation.Nullable final Integer value) {
        this.appCrashCount = value;
    }
    /**
     * Sets the appHangCount property value. The number of application hangs for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppHangCount(@jakarta.annotation.Nullable final Integer value) {
        this.appHangCount = value;
    }
    /**
     * Sets the crashedAppCount property value. The number of distinct application crashes for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the crashedAppCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCrashedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.crashedAppCount = value;
    }
    /**
     * Sets the deviceAppHealthScore property value. The application health score of the device. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the deviceAppHealthScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceAppHealthScore(@jakarta.annotation.Nullable final Double value) {
        this.deviceAppHealthScore = value;
    }
    /**
     * Sets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceManufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.deviceModel = value;
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
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeanTimeToFailureInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the processedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProcessedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.processedDateTime = value;
    }
}
