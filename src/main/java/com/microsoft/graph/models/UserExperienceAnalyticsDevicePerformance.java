package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device performance entity contains device boot performance details.
 */
public class UserExperienceAnalyticsDevicePerformance extends Entity implements Parsable {
    /**
     * Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     */
    private Double averageBlueScreens;
    /**
     * Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     */
    private Double averageRestarts;
    /**
     * Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     */
    private Integer blueScreenCount;
    /**
     * The user experience analytics device boot score.
     */
    private Integer bootScore;
    /**
     * The user experience analytics device core boot time in milliseconds.
     */
    private Integer coreBootTimeInMs;
    /**
     * The user experience analytics device core login time in milliseconds.
     */
    private Integer coreLoginTimeInMs;
    /**
     * User experience analytics summarized device count.
     */
    private Long deviceCount;
    /**
     * The user experience analytics device name.
     */
    private String deviceName;
    /**
     * The diskType property
     */
    private DiskType diskType;
    /**
     * The user experience analytics device group policy boot time in milliseconds.
     */
    private Integer groupPolicyBootTimeInMs;
    /**
     * The user experience analytics device group policy login time in milliseconds.
     */
    private Integer groupPolicyLoginTimeInMs;
    /**
     * The healthStatus property
     */
    private UserExperienceAnalyticsHealthState healthStatus;
    /**
     * The user experience analytics device login score.
     */
    private Integer loginScore;
    /**
     * The user experience analytics device manufacturer.
     */
    private String manufacturer;
    /**
     * The user experience analytics device model.
     */
    private String model;
    /**
     * The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double modelStartupPerformanceScore;
    /**
     * The user experience analytics device Operating System version.
     */
    private String operatingSystemVersion;
    /**
     * The user experience analytics responsive desktop time in milliseconds.
     */
    private Integer responsiveDesktopTimeInMs;
    /**
     * Number of Restarts in the last 30 days. Valid values 0 to 9999999
     */
    private Integer restartCount;
    /**
     * The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double startupPerformanceScore;
    /**
     * Instantiates a new userExperienceAnalyticsDevicePerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDevicePerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDevicePerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDevicePerformance();
    }
    /**
     * Gets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageBlueScreens() {
        return this.averageBlueScreens;
    }
    /**
     * Gets the averageRestarts property value. Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageRestarts() {
        return this.averageRestarts;
    }
    /**
     * Gets the blueScreenCount property value. Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlueScreenCount() {
        return this.blueScreenCount;
    }
    /**
     * Gets the bootScore property value. The user experience analytics device boot score.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBootScore() {
        return this.bootScore;
    }
    /**
     * Gets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreBootTimeInMs() {
        return this.coreBootTimeInMs;
    }
    /**
     * Gets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this.coreLoginTimeInMs;
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * Gets the deviceName property value. The user experience analytics device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the diskType property value. The diskType property
     * @return a DiskType
     */
    @javax.annotation.Nullable
    public DiskType getDiskType() {
        return this.diskType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageBlueScreens", (n) -> { this.setAverageBlueScreens(n.getDoubleValue()); });
        deserializerMap.put("averageRestarts", (n) -> { this.setAverageRestarts(n.getDoubleValue()); });
        deserializerMap.put("blueScreenCount", (n) -> { this.setBlueScreenCount(n.getIntegerValue()); });
        deserializerMap.put("bootScore", (n) -> { this.setBootScore(n.getIntegerValue()); });
        deserializerMap.put("coreBootTimeInMs", (n) -> { this.setCoreBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("coreLoginTimeInMs", (n) -> { this.setCoreLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("diskType", (n) -> { this.setDiskType(n.getEnumValue(DiskType.class)); });
        deserializerMap.put("groupPolicyBootTimeInMs", (n) -> { this.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyLoginTimeInMs", (n) -> { this.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("loginScore", (n) -> { this.setLoginScore(n.getIntegerValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelStartupPerformanceScore", (n) -> { this.setModelStartupPerformanceScore(n.getDoubleValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("responsiveDesktopTimeInMs", (n) -> { this.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("restartCount", (n) -> { this.setRestartCount(n.getIntegerValue()); });
        deserializerMap.put("startupPerformanceScore", (n) -> { this.setStartupPerformanceScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this.groupPolicyBootTimeInMs;
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this.groupPolicyLoginTimeInMs;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the loginScore property value. The user experience analytics device login score.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLoginScore() {
        return this.loginScore;
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getModelStartupPerformanceScore() {
        return this.modelStartupPerformanceScore;
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this.responsiveDesktopTimeInMs;
    }
    /**
     * Gets the restartCount property value. Number of Restarts in the last 30 days. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRestartCount() {
        return this.restartCount;
    }
    /**
     * Gets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this.startupPerformanceScore;
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
        writer.writeDoubleValue("averageBlueScreens", this.getAverageBlueScreens());
        writer.writeDoubleValue("averageRestarts", this.getAverageRestarts());
        writer.writeIntegerValue("blueScreenCount", this.getBlueScreenCount());
        writer.writeIntegerValue("bootScore", this.getBootScore());
        writer.writeIntegerValue("coreBootTimeInMs", this.getCoreBootTimeInMs());
        writer.writeIntegerValue("coreLoginTimeInMs", this.getCoreLoginTimeInMs());
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("diskType", this.getDiskType());
        writer.writeIntegerValue("groupPolicyBootTimeInMs", this.getGroupPolicyBootTimeInMs());
        writer.writeIntegerValue("groupPolicyLoginTimeInMs", this.getGroupPolicyLoginTimeInMs());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("loginScore", this.getLoginScore());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeDoubleValue("modelStartupPerformanceScore", this.getModelStartupPerformanceScore());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeIntegerValue("responsiveDesktopTimeInMs", this.getResponsiveDesktopTimeInMs());
        writer.writeIntegerValue("restartCount", this.getRestartCount());
        writer.writeDoubleValue("startupPerformanceScore", this.getStartupPerformanceScore());
    }
    /**
     * Sets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the averageBlueScreens property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageBlueScreens(@javax.annotation.Nullable final Double value) {
        this.averageBlueScreens = value;
    }
    /**
     * Sets the averageRestarts property value. Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the averageRestarts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageRestarts(@javax.annotation.Nullable final Double value) {
        this.averageRestarts = value;
    }
    /**
     * Sets the blueScreenCount property value. Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the blueScreenCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlueScreenCount(@javax.annotation.Nullable final Integer value) {
        this.blueScreenCount = value;
    }
    /**
     * Sets the bootScore property value. The user experience analytics device boot score.
     * @param value Value to set for the bootScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootScore(@javax.annotation.Nullable final Integer value) {
        this.bootScore = value;
    }
    /**
     * Sets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @param value Value to set for the coreBootTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoreBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.coreBootTimeInMs = value;
    }
    /**
     * Sets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @param value Value to set for the coreLoginTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoreLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.coreLoginTimeInMs = value;
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCount(@javax.annotation.Nullable final Long value) {
        this.deviceCount = value;
    }
    /**
     * Sets the deviceName property value. The user experience analytics device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the diskType property value. The diskType property
     * @param value Value to set for the diskType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiskType(@javax.annotation.Nullable final DiskType value) {
        this.diskType = value;
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.groupPolicyBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.groupPolicyLoginTimeInMs = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the loginScore property value. The user experience analytics device login score.
     * @param value Value to set for the loginScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginScore(@javax.annotation.Nullable final Integer value) {
        this.loginScore = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the modelStartupPerformanceScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this.modelStartupPerformanceScore = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this.operatingSystemVersion = value;
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsiveDesktopTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.responsiveDesktopTimeInMs = value;
    }
    /**
     * Sets the restartCount property value. Number of Restarts in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the restartCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartCount(@javax.annotation.Nullable final Integer value) {
        this.restartCount = value;
    }
    /**
     * Sets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this.startupPerformanceScore = value;
    }
}
