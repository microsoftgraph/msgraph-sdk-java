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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion} and sets the default values.
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion();
    }
    /**
     * Gets the activeDeviceCount property value. The number of devices where the application has been active. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.backingStore.get("activeDeviceCount");
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.backingStore.get("appCrashCount");
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appName property value. The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.backingStore.get("appName");
    }
    /**
     * Gets the appPublisher property value. The publisher of the application. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppPublisher() {
        return this.backingStore.get("appPublisher");
    }
    /**
     * Gets the appUsageDuration property value. The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAppUsageDuration() {
        return this.backingStore.get("appUsageDuration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.backingStore.get("meanTimeToFailureInMinutes");
    }
    /**
     * Gets the osBuildNumber property value. The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsBuildNumber() {
        return this.backingStore.get("osBuildNumber");
    }
    /**
     * Gets the osVersion property value. The OS version of the application. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActiveDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDeviceCount", value);
    }
    /**
     * Sets the appCrashCount property value. The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     */
    public void setAppCrashCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("appCrashCount", value);
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appName property value. The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appName property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appName", value);
    }
    /**
     * Sets the appPublisher property value. The publisher of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the appPublisher property.
     */
    public void setAppPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appPublisher", value);
    }
    /**
     * Sets the appUsageDuration property value. The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appUsageDuration property.
     */
    public void setAppUsageDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("appUsageDuration", value);
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     */
    public void setMeanTimeToFailureInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("meanTimeToFailureInMinutes", value);
    }
    /**
     * Sets the osBuildNumber property value. The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osBuildNumber property.
     */
    public void setOsBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osBuildNumber", value);
    }
    /**
     * Sets the osVersion property value. The OS version of the application. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
}
