package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDevicePerformance extends Entity implements Parsable {
    /** Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999 */
    private Double _averageBlueScreens;
    /** Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999 */
    private Double _averageRestarts;
    /** Number of Blue Screens in the last 14 days. Valid values 0 to 9999999 */
    private Integer _blueScreenCount;
    /** The user experience analytics device boot score. */
    private Integer _bootScore;
    /** The user experience analytics device core boot time in milliseconds. */
    private Integer _coreBootTimeInMs;
    /** The user experience analytics device core login time in milliseconds. */
    private Integer _coreLoginTimeInMs;
    /** User experience analytics summarized device count. */
    private Long _deviceCount;
    /** The user experience analytics device name. */
    private String _deviceName;
    /** The diskType property */
    private DiskType _diskType;
    /** The user experience analytics device group policy boot time in milliseconds. */
    private Integer _groupPolicyBootTimeInMs;
    /** The user experience analytics device group policy login time in milliseconds. */
    private Integer _groupPolicyLoginTimeInMs;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The user experience analytics device login score. */
    private Integer _loginScore;
    /** The user experience analytics device manufacturer. */
    private String _manufacturer;
    /** The user experience analytics device model. */
    private String _model;
    /** The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _modelStartupPerformanceScore;
    /** The user experience analytics device Operating System version. */
    private String _operatingSystemVersion;
    /** The user experience analytics responsive desktop time in milliseconds. */
    private Integer _responsiveDesktopTimeInMs;
    /** Number of Restarts in the last 14 days. Valid values 0 to 9999999 */
    private Integer _restartCount;
    /** The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _startupPerformanceScore;
    /**
     * Instantiates a new UserExperienceAnalyticsDevicePerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsDevicePerformance() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDevicePerformance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDevicePerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDevicePerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDevicePerformance();
    }
    /**
     * Gets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageBlueScreens() {
        return this._averageBlueScreens;
    }
    /**
     * Gets the averageRestarts property value. Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageRestarts() {
        return this._averageRestarts;
    }
    /**
     * Gets the blueScreenCount property value. Number of Blue Screens in the last 14 days. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlueScreenCount() {
        return this._blueScreenCount;
    }
    /**
     * Gets the bootScore property value. The user experience analytics device boot score.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBootScore() {
        return this._bootScore;
    }
    /**
     * Gets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreBootTimeInMs() {
        return this._coreBootTimeInMs;
    }
    /**
     * Gets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this._coreLoginTimeInMs;
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * Gets the deviceName property value. The user experience analytics device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the diskType property value. The diskType property
     * @return a diskType
     */
    @javax.annotation.Nullable
    public DiskType getDiskType() {
        return this._diskType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDevicePerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("averageBlueScreens", (n) -> { currentObject.setAverageBlueScreens(n.getDoubleValue()); });
            this.put("averageRestarts", (n) -> { currentObject.setAverageRestarts(n.getDoubleValue()); });
            this.put("blueScreenCount", (n) -> { currentObject.setBlueScreenCount(n.getIntegerValue()); });
            this.put("bootScore", (n) -> { currentObject.setBootScore(n.getIntegerValue()); });
            this.put("coreBootTimeInMs", (n) -> { currentObject.setCoreBootTimeInMs(n.getIntegerValue()); });
            this.put("coreLoginTimeInMs", (n) -> { currentObject.setCoreLoginTimeInMs(n.getIntegerValue()); });
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getLongValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("diskType", (n) -> { currentObject.setDiskType(n.getEnumValue(DiskType.class)); });
            this.put("groupPolicyBootTimeInMs", (n) -> { currentObject.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
            this.put("groupPolicyLoginTimeInMs", (n) -> { currentObject.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
            this.put("loginScore", (n) -> { currentObject.setLoginScore(n.getIntegerValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("modelStartupPerformanceScore", (n) -> { currentObject.setModelStartupPerformanceScore(n.getDoubleValue()); });
            this.put("operatingSystemVersion", (n) -> { currentObject.setOperatingSystemVersion(n.getStringValue()); });
            this.put("responsiveDesktopTimeInMs", (n) -> { currentObject.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
            this.put("restartCount", (n) -> { currentObject.setRestartCount(n.getIntegerValue()); });
            this.put("startupPerformanceScore", (n) -> { currentObject.setStartupPerformanceScore(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this._groupPolicyBootTimeInMs;
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this._groupPolicyLoginTimeInMs;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the loginScore property value. The user experience analytics device login score.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLoginScore() {
        return this._loginScore;
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getModelStartupPerformanceScore() {
        return this._modelStartupPerformanceScore;
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this._operatingSystemVersion;
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this._responsiveDesktopTimeInMs;
    }
    /**
     * Gets the restartCount property value. Number of Restarts in the last 14 days. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRestartCount() {
        return this._restartCount;
    }
    /**
     * Gets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this._startupPerformanceScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999
     * @param value Value to set for the averageBlueScreens property.
     * @return a void
     */
    public void setAverageBlueScreens(@javax.annotation.Nullable final Double value) {
        this._averageBlueScreens = value;
    }
    /**
     * Sets the averageRestarts property value. Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999
     * @param value Value to set for the averageRestarts property.
     * @return a void
     */
    public void setAverageRestarts(@javax.annotation.Nullable final Double value) {
        this._averageRestarts = value;
    }
    /**
     * Sets the blueScreenCount property value. Number of Blue Screens in the last 14 days. Valid values 0 to 9999999
     * @param value Value to set for the blueScreenCount property.
     * @return a void
     */
    public void setBlueScreenCount(@javax.annotation.Nullable final Integer value) {
        this._blueScreenCount = value;
    }
    /**
     * Sets the bootScore property value. The user experience analytics device boot score.
     * @param value Value to set for the bootScore property.
     * @return a void
     */
    public void setBootScore(@javax.annotation.Nullable final Integer value) {
        this._bootScore = value;
    }
    /**
     * Sets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @param value Value to set for the coreBootTimeInMs property.
     * @return a void
     */
    public void setCoreBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._coreBootTimeInMs = value;
    }
    /**
     * Sets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @param value Value to set for the coreLoginTimeInMs property.
     * @return a void
     */
    public void setCoreLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._coreLoginTimeInMs = value;
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Long value) {
        this._deviceCount = value;
    }
    /**
     * Sets the deviceName property value. The user experience analytics device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the diskType property value. The diskType property
     * @param value Value to set for the diskType property.
     * @return a void
     */
    public void setDiskType(@javax.annotation.Nullable final DiskType value) {
        this._diskType = value;
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     * @return a void
     */
    public void setGroupPolicyBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._groupPolicyBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     * @return a void
     */
    public void setGroupPolicyLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._groupPolicyLoginTimeInMs = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the loginScore property value. The user experience analytics device login score.
     * @param value Value to set for the loginScore property.
     * @return a void
     */
    public void setLoginScore(@javax.annotation.Nullable final Integer value) {
        this._loginScore = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the modelStartupPerformanceScore property.
     * @return a void
     */
    public void setModelStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this._modelStartupPerformanceScore = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this._operatingSystemVersion = value;
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     * @return a void
     */
    public void setResponsiveDesktopTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._responsiveDesktopTimeInMs = value;
    }
    /**
     * Sets the restartCount property value. Number of Restarts in the last 14 days. Valid values 0 to 9999999
     * @param value Value to set for the restartCount property.
     * @return a void
     */
    public void setRestartCount(@javax.annotation.Nullable final Integer value) {
        this._restartCount = value;
    }
    /**
     * Sets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     * @return a void
     */
    public void setStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this._startupPerformanceScore = value;
    }
}
