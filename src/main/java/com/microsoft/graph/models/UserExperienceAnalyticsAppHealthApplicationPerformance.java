package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics application performance entity contains application performance details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthApplicationPerformance extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthApplicationPerformance and sets the default values.
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthApplicationPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthApplicationPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthApplicationPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.backingStore.get("activeDeviceCount");
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.backingStore.get("appCrashCount");
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appHangCount property value. The number of hangs for the application. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppHangCount() {
        return this.backingStore.get("appHangCount");
    }
    /**
     * Gets the appHealthScore property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAppHealthScore() {
        return this.backingStore.get("appHealthScore");
    }
    /**
     * Gets the appName property value. The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.backingStore.get("appName");
    }
    /**
     * Gets the appPublisher property value. The publisher of the application. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppPublisher() {
        return this.backingStore.get("appPublisher");
    }
    /**
     * Gets the appUsageDuration property value. The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppUsageDuration() {
        return this.backingStore.get("appUsageDuration");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDeviceCount", (n) -> { this.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("appCrashCount", (n) -> { this.setAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appHangCount", (n) -> { this.setAppHangCount(n.getIntegerValue()); });
        deserializerMap.put("appHealthScore", (n) -> { this.setAppHealthScore(n.getDoubleValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appUsageDuration", (n) -> { this.setAppUsageDuration(n.getIntegerValue()); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.backingStore.get("meanTimeToFailureInMinutes");
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
        writer.writeIntegerValue("appHangCount", this.getAppHangCount());
        writer.writeDoubleValue("appHealthScore", this.getAppHealthScore());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeIntegerValue("appUsageDuration", this.getAppUsageDuration());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
    }
    /**
     * Sets the activeDeviceCount property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
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
     * Sets the appHangCount property value. The number of hangs for the application. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     */
    public void setAppHangCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("appHangCount", value);
    }
    /**
     * Sets the appHealthScore property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appHealthScore property.
     */
    public void setAppHealthScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("appHealthScore", value);
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
}
