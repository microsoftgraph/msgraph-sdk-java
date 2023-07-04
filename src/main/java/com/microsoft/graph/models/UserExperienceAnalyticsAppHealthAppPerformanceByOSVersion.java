package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics application performance entity contains app performance details by OS version.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion extends Entity implements Parsable {
    /**
     * The number of devices where the application has been active. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer activeDeviceCount;
    /**
     * The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer appCrashCount;
    /**
     * The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     */
    private String appDisplayName;
    /**
     * The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     */
    private String appName;
    /**
     * The publisher of the application. Supports: $select, $OrderBy. Read-only.
     */
    private String appPublisher;
    /**
     * The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer appUsageDuration;
    /**
     * The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer meanTimeToFailureInMinutes;
    /**
     * The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     */
    private String osBuildNumber;
    /**
     * The OS version of the application. Supports: $select, $OrderBy. Read-only.
     */
    private String osVersion;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion();
    }
    /**
     * Gets the activeDeviceCount property value. The number of devices where the application has been active. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.activeDeviceCount;
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.appCrashCount;
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appName property value. The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the appPublisher property value. The publisher of the application. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this.appPublisher;
    }
    /**
     * Gets the appUsageDuration property value. The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppUsageDuration() {
        return this.appUsageDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDeviceCount", (n) -> { this.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("appCrashCount", (n) -> { this.setAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appUsageDuration", (n) -> { this.setAppUsageDuration(n.getIntegerValue()); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
    }
    /**
     * Gets the osBuildNumber property value. The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this.osBuildNumber;
    }
    /**
     * Gets the osVersion property value. The OS version of the application. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
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
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeIntegerValue("appUsageDuration", this.getAppUsageDuration());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("osVersion", this.getOsVersion());
    }
    /**
     * Sets the activeDeviceCount property value. The number of devices where the application has been active. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.activeDeviceCount = value;
    }
    /**
     * Sets the appCrashCount property value. The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppCrashCount(@javax.annotation.Nullable final Integer value) {
        this.appCrashCount = value;
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appName property value. The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the appPublisher property value. The publisher of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this.appPublisher = value;
    }
    /**
     * Sets the appUsageDuration property value. The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appUsageDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUsageDuration(@javax.annotation.Nullable final Integer value) {
        this.appUsageDuration = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this.meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the osBuildNumber property value. The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this.osBuildNumber = value;
    }
    /**
     * Sets the osVersion property value. The OS version of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
}
