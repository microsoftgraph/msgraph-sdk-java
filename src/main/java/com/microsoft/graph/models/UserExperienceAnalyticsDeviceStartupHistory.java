package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device startup history entity contains device boot performance history details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceStartupHistory extends Entity implements Parsable {
    /**
     * The device core boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer coreBootTimeInMs;
    /**
     * The device core login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer coreLoginTimeInMs;
    /**
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String deviceId;
    /**
     * The impact of device feature updates on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer featureUpdateBootTimeInMs;
    /**
     * The impact of device group policy client on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer groupPolicyBootTimeInMs;
    /**
     * The impact of device group policy client on login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer groupPolicyLoginTimeInMs;
    /**
     * When TRUE, indicates the device boot record is associated with feature updates. When FALSE, indicates the device boot record is not associated with feature updates. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean isFeatureUpdate;
    /**
     * When TRUE, indicates the device login is the first login after a reboot. When FALSE, indicates the device login is not the first login after a reboot. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean isFirstLogin;
    /**
     * The user experience analytics device boot record's operating system version. Supports: $select, $OrderBy. Read-only.
     */
    private String operatingSystemVersion;
    /**
     * The time for desktop to become responsive during login process in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer responsiveDesktopTimeInMs;
    /**
     * Operating System restart category.
     */
    private UserExperienceAnalyticsOperatingSystemRestartCategory restartCategory;
    /**
     * OS restart fault bucket. The fault bucket is used to find additional information about a system crash. Supports: $select, $OrderBy. Read-only.
     */
    private String restartFaultBucket;
    /**
     * OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason. Supports: $select, $OrderBy. Read-only.
     */
    private String restartStopCode;
    /**
     * The device boot start time. The value cannot be modified and is automatically populated when the device performs a reboot. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    private OffsetDateTime startTime;
    /**
     * The device total boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer totalBootTimeInMs;
    /**
     * The device total login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer totalLoginTimeInMs;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceStartupHistory and sets the default values.
     */
    public UserExperienceAnalyticsDeviceStartupHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceStartupHistory
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupHistory();
    }
    /**
     * Gets the coreBootTimeInMs property value. The device core boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCoreBootTimeInMs() {
        return this.coreBootTimeInMs;
    }
    /**
     * Gets the coreLoginTimeInMs property value. The device core login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this.coreLoginTimeInMs;
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
     * Gets the featureUpdateBootTimeInMs property value. The impact of device feature updates on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFeatureUpdateBootTimeInMs() {
        return this.featureUpdateBootTimeInMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("coreBootTimeInMs", (n) -> { this.setCoreBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("coreLoginTimeInMs", (n) -> { this.setCoreLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("featureUpdateBootTimeInMs", (n) -> { this.setFeatureUpdateBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyBootTimeInMs", (n) -> { this.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyLoginTimeInMs", (n) -> { this.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("isFeatureUpdate", (n) -> { this.setIsFeatureUpdate(n.getBooleanValue()); });
        deserializerMap.put("isFirstLogin", (n) -> { this.setIsFirstLogin(n.getBooleanValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("responsiveDesktopTimeInMs", (n) -> { this.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("restartCategory", (n) -> { this.setRestartCategory(n.getEnumValue(UserExperienceAnalyticsOperatingSystemRestartCategory.class)); });
        deserializerMap.put("restartFaultBucket", (n) -> { this.setRestartFaultBucket(n.getStringValue()); });
        deserializerMap.put("restartStopCode", (n) -> { this.setRestartStopCode(n.getStringValue()); });
        deserializerMap.put("startTime", (n) -> { this.setStartTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalBootTimeInMs", (n) -> { this.setTotalBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("totalLoginTimeInMs", (n) -> { this.setTotalLoginTimeInMs(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The impact of device group policy client on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this.groupPolicyBootTimeInMs;
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The impact of device group policy client on login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this.groupPolicyLoginTimeInMs;
    }
    /**
     * Gets the isFeatureUpdate property value. When TRUE, indicates the device boot record is associated with feature updates. When FALSE, indicates the device boot record is not associated with feature updates. Supports: $select, $OrderBy. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatureUpdate() {
        return this.isFeatureUpdate;
    }
    /**
     * Gets the isFirstLogin property value. When TRUE, indicates the device login is the first login after a reboot. When FALSE, indicates the device login is not the first login after a reboot. Supports: $select, $OrderBy. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFirstLogin() {
        return this.isFirstLogin;
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The time for desktop to become responsive during login process in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this.responsiveDesktopTimeInMs;
    }
    /**
     * Gets the restartCategory property value. Operating System restart category.
     * @return a userExperienceAnalyticsOperatingSystemRestartCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsOperatingSystemRestartCategory getRestartCategory() {
        return this.restartCategory;
    }
    /**
     * Gets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRestartFaultBucket() {
        return this.restartFaultBucket;
    }
    /**
     * Gets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRestartStopCode() {
        return this.restartStopCode;
    }
    /**
     * Gets the startTime property value. The device boot start time. The value cannot be modified and is automatically populated when the device performs a reboot. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }
    /**
     * Gets the totalBootTimeInMs property value. The device total boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalBootTimeInMs() {
        return this.totalBootTimeInMs;
    }
    /**
     * Gets the totalLoginTimeInMs property value. The device total login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLoginTimeInMs() {
        return this.totalLoginTimeInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("coreBootTimeInMs", this.getCoreBootTimeInMs());
        writer.writeIntegerValue("coreLoginTimeInMs", this.getCoreLoginTimeInMs());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("featureUpdateBootTimeInMs", this.getFeatureUpdateBootTimeInMs());
        writer.writeIntegerValue("groupPolicyBootTimeInMs", this.getGroupPolicyBootTimeInMs());
        writer.writeIntegerValue("groupPolicyLoginTimeInMs", this.getGroupPolicyLoginTimeInMs());
        writer.writeBooleanValue("isFeatureUpdate", this.getIsFeatureUpdate());
        writer.writeBooleanValue("isFirstLogin", this.getIsFirstLogin());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeIntegerValue("responsiveDesktopTimeInMs", this.getResponsiveDesktopTimeInMs());
        writer.writeEnumValue("restartCategory", this.getRestartCategory());
        writer.writeStringValue("restartFaultBucket", this.getRestartFaultBucket());
        writer.writeStringValue("restartStopCode", this.getRestartStopCode());
        writer.writeOffsetDateTimeValue("startTime", this.getStartTime());
        writer.writeIntegerValue("totalBootTimeInMs", this.getTotalBootTimeInMs());
        writer.writeIntegerValue("totalLoginTimeInMs", this.getTotalLoginTimeInMs());
    }
    /**
     * Sets the coreBootTimeInMs property value. The device core boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the coreBootTimeInMs property.
     */
    public void setCoreBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.coreBootTimeInMs = value;
    }
    /**
     * Sets the coreLoginTimeInMs property value. The device core login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the coreLoginTimeInMs property.
     */
    public void setCoreLoginTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.coreLoginTimeInMs = value;
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the featureUpdateBootTimeInMs property value. The impact of device feature updates on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the featureUpdateBootTimeInMs property.
     */
    public void setFeatureUpdateBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.featureUpdateBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The impact of device group policy client on boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     */
    public void setGroupPolicyBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.groupPolicyBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The impact of device group policy client on login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     */
    public void setGroupPolicyLoginTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.groupPolicyLoginTimeInMs = value;
    }
    /**
     * Sets the isFeatureUpdate property value. When TRUE, indicates the device boot record is associated with feature updates. When FALSE, indicates the device boot record is not associated with feature updates. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the isFeatureUpdate property.
     */
    public void setIsFeatureUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.isFeatureUpdate = value;
    }
    /**
     * Sets the isFirstLogin property value. When TRUE, indicates the device login is the first login after a reboot. When FALSE, indicates the device login is not the first login after a reboot. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the isFirstLogin property.
     */
    public void setIsFirstLogin(@jakarta.annotation.Nullable final Boolean value) {
        this.isFirstLogin = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the operatingSystemVersion property.
     */
    public void setOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.operatingSystemVersion = value;
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The time for desktop to become responsive during login process in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     */
    public void setResponsiveDesktopTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.responsiveDesktopTimeInMs = value;
    }
    /**
     * Sets the restartCategory property value. Operating System restart category.
     * @param value Value to set for the restartCategory property.
     */
    public void setRestartCategory(@jakarta.annotation.Nullable final UserExperienceAnalyticsOperatingSystemRestartCategory value) {
        this.restartCategory = value;
    }
    /**
     * Sets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the restartFaultBucket property.
     */
    public void setRestartFaultBucket(@jakarta.annotation.Nullable final String value) {
        this.restartFaultBucket = value;
    }
    /**
     * Sets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the restartStopCode property.
     */
    public void setRestartStopCode(@jakarta.annotation.Nullable final String value) {
        this.restartStopCode = value;
    }
    /**
     * Sets the startTime property value. The device boot start time. The value cannot be modified and is automatically populated when the device performs a reboot. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2022 would look like this: '2022-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the startTime property.
     */
    public void setStartTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startTime = value;
    }
    /**
     * Sets the totalBootTimeInMs property value. The device total boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the totalBootTimeInMs property.
     */
    public void setTotalBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.totalBootTimeInMs = value;
    }
    /**
     * Sets the totalLoginTimeInMs property value. The device total login time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the totalLoginTimeInMs property.
     */
    public void setTotalLoginTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.totalLoginTimeInMs = value;
    }
}
