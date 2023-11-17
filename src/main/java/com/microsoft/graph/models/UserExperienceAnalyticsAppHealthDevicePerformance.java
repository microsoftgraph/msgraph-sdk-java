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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthDevicePerformance extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthDevicePerformance and sets the default values.
     */
    public UserExperienceAnalyticsAppHealthDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthDevicePerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDevicePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDevicePerformance();
    }
    /**
     * Gets the appCrashCount property value. The number of application crashes for the device. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.backingStore.get("appCrashCount");
    }
    /**
     * Gets the appHangCount property value. The number of application hangs for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppHangCount() {
        return this.backingStore.get("appHangCount");
    }
    /**
     * Gets the crashedAppCount property value. The number of distinct application crashes for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCrashedAppCount() {
        return this.backingStore.get("crashedAppCount");
    }
    /**
     * Gets the deviceAppHealthScore property value. The application health score of the device. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getDeviceAppHealthScore() {
        return this.backingStore.get("deviceAppHealthScore");
    }
    /**
     * Gets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
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
     * Gets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.backingStore.get("deviceManufacturer");
    }
    /**
     * Gets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
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
     * @return a UserExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.backingStore.get("meanTimeToFailureInMinutes");
    }
    /**
     * Gets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProcessedDateTime() {
        return this.backingStore.get("processedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAppCrashCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("appCrashCount", value);
    }
    /**
     * Sets the appHangCount property value. The number of application hangs for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     */
    public void setAppHangCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("appHangCount", value);
    }
    /**
     * Sets the crashedAppCount property value. The number of distinct application crashes for the device. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the crashedAppCount property.
     */
    public void setCrashedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("crashedAppCount", value);
    }
    /**
     * Sets the deviceAppHealthScore property value. The application health score of the device. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the deviceAppHealthScore property.
     */
    public void setDeviceAppHealthScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("deviceAppHealthScore", value);
    }
    /**
     * Sets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceManufacturer property.
     */
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceManufacturer", value);
    }
    /**
     * Sets the deviceModel property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     */
    public void setMeanTimeToFailureInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("meanTimeToFailureInMinutes", value);
    }
    /**
     * Sets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the processedDateTime property.
     */
    public void setProcessedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("processedDateTime", value);
    }
}
