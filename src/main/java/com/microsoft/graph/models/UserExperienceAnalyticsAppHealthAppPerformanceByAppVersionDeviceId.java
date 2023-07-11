package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics application performance entity contains application performance by application version device id.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId extends Entity implements Parsable {
    /**
     * The number of crashes for the app. Valid values -2147483648 to 2147483647
     */
    private Integer appCrashCount;
    /**
     * The friendly name of the application.
     */
    private String appDisplayName;
    /**
     * The name of the application.
     */
    private String appName;
    /**
     * The publisher of the application.
     */
    private String appPublisher;
    /**
     * The version of the application.
     */
    private String appVersion;
    /**
     * The name of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceDisplayName;
    /**
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceId;
    /**
     * The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    private OffsetDateTime processedDateTime;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId();
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.appCrashCount;
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appName property value. The name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the appPublisher property value. The publisher of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this.appPublisher;
    }
    /**
     * Gets the appVersion property value. The version of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppVersion() {
        return this.appVersion;
    }
    /**
     * Gets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appCrashCount", (n) -> { this.setAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appVersion", (n) -> { this.setAppVersion(n.getStringValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("processedDateTime", (n) -> { this.setProcessedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProcessedDateTime() {
        return this.processedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("processedDateTime", this.getProcessedDateTime());
    }
    /**
     * Sets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppCrashCount(@javax.annotation.Nullable final Integer value) {
        this.appCrashCount = value;
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appName property value. The name of the application.
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the appPublisher property value. The publisher of the application.
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this.appPublisher = value;
    }
    /**
     * Sets the appVersion property value. The version of the application.
     * @param value Value to set for the appVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppVersion(@javax.annotation.Nullable final String value) {
        this.appVersion = value;
    }
    /**
     * Sets the deviceDisplayName property value. The name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the processedDateTime property value. The date and time when the statistics were last computed. The value cannot be modified and is automatically populated when the statistics are computed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the processedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.processedDateTime = value;
    }
}
