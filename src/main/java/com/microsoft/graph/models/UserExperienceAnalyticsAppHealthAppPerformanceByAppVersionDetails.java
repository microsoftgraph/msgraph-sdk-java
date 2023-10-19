package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics application performance entity contains application performance by application version details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails extends Entity implements Parsable {
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
     * The total number of devices that have reported one or more application crashes for this application and version. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer deviceCountWithCrashes;
    /**
     * When TRUE, indicates the version of application is the latest version for that application that is in use. When FALSE, indicates the version is not the latest version. FALSE by default. Supports: $select, $OrderBy.
     */
    private Boolean isLatestUsedVersion;
    /**
     * When TRUE, indicates the version of application is the most used version for that application. When FALSE, indicates the version is not the most used version. FALSE by default. Supports: $select, $OrderBy. Read-only.
     */
    private Boolean isMostUsedVersion;
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails and sets the default values.
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails();
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAppCrashCount() {
        return this.appCrashCount;
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appName property value. The name of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the appPublisher property value. The publisher of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppPublisher() {
        return this.appPublisher;
    }
    /**
     * Gets the appVersion property value. The version of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppVersion() {
        return this.appVersion;
    }
    /**
     * Gets the deviceCountWithCrashes property value. The total number of devices that have reported one or more application crashes for this application and version. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCountWithCrashes() {
        return this.deviceCountWithCrashes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appCrashCount", (n) -> { this.setAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appVersion", (n) -> { this.setAppVersion(n.getStringValue()); });
        deserializerMap.put("deviceCountWithCrashes", (n) -> { this.setDeviceCountWithCrashes(n.getIntegerValue()); });
        deserializerMap.put("isLatestUsedVersion", (n) -> { this.setIsLatestUsedVersion(n.getBooleanValue()); });
        deserializerMap.put("isMostUsedVersion", (n) -> { this.setIsMostUsedVersion(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isLatestUsedVersion property value. When TRUE, indicates the version of application is the latest version for that application that is in use. When FALSE, indicates the version is not the latest version. FALSE by default. Supports: $select, $OrderBy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLatestUsedVersion() {
        return this.isLatestUsedVersion;
    }
    /**
     * Gets the isMostUsedVersion property value. When TRUE, indicates the version of application is the most used version for that application. When FALSE, indicates the version is not the most used version. FALSE by default. Supports: $select, $OrderBy. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMostUsedVersion() {
        return this.isMostUsedVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeIntegerValue("deviceCountWithCrashes", this.getDeviceCountWithCrashes());
        writer.writeBooleanValue("isLatestUsedVersion", this.getIsLatestUsedVersion());
        writer.writeBooleanValue("isMostUsedVersion", this.getIsMostUsedVersion());
    }
    /**
     * Sets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     */
    public void setAppCrashCount(@jakarta.annotation.Nullable final Integer value) {
        this.appCrashCount = value;
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appName property value. The name of the application.
     * @param value Value to set for the appName property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the appPublisher property value. The publisher of the application.
     * @param value Value to set for the appPublisher property.
     */
    public void setAppPublisher(@jakarta.annotation.Nullable final String value) {
        this.appPublisher = value;
    }
    /**
     * Sets the appVersion property value. The version of the application.
     * @param value Value to set for the appVersion property.
     */
    public void setAppVersion(@jakarta.annotation.Nullable final String value) {
        this.appVersion = value;
    }
    /**
     * Sets the deviceCountWithCrashes property value. The total number of devices that have reported one or more application crashes for this application and version. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceCountWithCrashes property.
     */
    public void setDeviceCountWithCrashes(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCountWithCrashes = value;
    }
    /**
     * Sets the isLatestUsedVersion property value. When TRUE, indicates the version of application is the latest version for that application that is in use. When FALSE, indicates the version is not the latest version. FALSE by default. Supports: $select, $OrderBy.
     * @param value Value to set for the isLatestUsedVersion property.
     */
    public void setIsLatestUsedVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.isLatestUsedVersion = value;
    }
    /**
     * Sets the isMostUsedVersion property value. When TRUE, indicates the version of application is the most used version for that application. When FALSE, indicates the version is not the most used version. FALSE by default. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the isMostUsedVersion property.
     */
    public void setIsMostUsedVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.isMostUsedVersion = value;
    }
}
