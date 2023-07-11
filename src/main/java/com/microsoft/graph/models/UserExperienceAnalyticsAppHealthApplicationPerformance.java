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
public class UserExperienceAnalyticsAppHealthApplicationPerformance extends Entity implements Parsable {
    /**
     * The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
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
     * The number of hangs for the application. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer appHangCount;
    /**
     * The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double appHealthScore;
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
     * Instantiates a new userExperienceAnalyticsAppHealthApplicationPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAppHealthApplicationPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthApplicationPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthApplicationPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthApplicationPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
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
     * Gets the appHangCount property value. The number of hangs for the application. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppHangCount() {
        return this.appHangCount;
    }
    /**
     * Gets the appHealthScore property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAppHealthScore() {
        return this.appHealthScore;
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
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
     * Sets the appHangCount property value. The number of hangs for the application. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppHangCount(@javax.annotation.Nullable final Integer value) {
        this.appHangCount = value;
    }
    /**
     * Sets the appHealthScore property value. The health score of the application. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appHealthScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppHealthScore(@javax.annotation.Nullable final Double value) {
        this.appHealthScore = value;
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
}
