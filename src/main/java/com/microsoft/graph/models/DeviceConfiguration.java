package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceConfiguration extends Entity implements Parsable {
    /** The list of assignments for the device configuration profile.  */
    private java.util.List<DeviceConfigurationAssignment> _assignments;
    /** DateTime the object was created.  */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration.  */
    private String _description;
    /** Device Configuration Setting State Device Summary  */
    private java.util.List<SettingStateDeviceSummary> _deviceSettingStateSummaries;
    /** Device configuration installation status by device.  */
    private java.util.List<DeviceConfigurationDeviceStatus> _deviceStatuses;
    /** Device Configuration devices status overview  */
    private DeviceConfigurationDeviceOverview _deviceStatusOverview;
    /** Admin provided name of the device configuration.  */
    private String _displayName;
    /** DateTime the object was last modified.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** Device configuration installation status by user.  */
    private java.util.List<DeviceConfigurationUserStatus> _userStatuses;
    /** Device Configuration users status overview  */
    private DeviceConfigurationUserOverview _userStatusOverview;
    /** Version of the device configuration.  */
    private Integer _version;
    /**
     * Instantiates a new deviceConfiguration and sets the default values.
     * @return a void
     */
    public DeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfiguration();
    }
    /**
     * Gets the assignments property value. The list of assignments for the device configuration profile.
     * @return a deviceConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @javax.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this._deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a deviceConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a deviceConfigurationDeviceOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
        return this._deviceStatusOverview;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceSettingStateSummaries", (n) -> { currentObject.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceConfigurationDeviceStatus::createFromDiscriminatorValue)); });
            this.put("deviceStatusOverview", (n) -> { currentObject.setDeviceStatusOverview(n.getObjectValue(DeviceConfigurationDeviceOverview::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(DeviceConfigurationUserStatus::createFromDiscriminatorValue)); });
            this.put("userStatusOverview", (n) -> { currentObject.setUserStatusOverview(n.getObjectValue(DeviceConfigurationUserOverview::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a deviceConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a deviceConfigurationUserOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
        return this._userStatusOverview;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusOverview", this.getDeviceStatusOverview());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusOverview", this.getUserStatusOverview());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of assignments for the device configuration profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this._deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     * @return a void
     */
    public void setDeviceStatusOverview(@javax.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this._deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     * @return a void
     */
    public void setUserStatusOverview(@javax.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this._userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
