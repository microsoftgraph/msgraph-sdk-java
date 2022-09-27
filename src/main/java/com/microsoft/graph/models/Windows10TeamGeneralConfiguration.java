package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10TeamGeneralConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to Block Azure Operational Insights. */
    private Boolean _azureOperationalInsightsBlockTelemetry;
    /** The Azure Operational Insights workspace id. */
    private String _azureOperationalInsightsWorkspaceId;
    /** The Azure Operational Insights Workspace key. */
    private String _azureOperationalInsightsWorkspaceKey;
    /** Specifies whether to automatically launch the Connect app whenever a projection is initiated. */
    private Boolean _connectAppBlockAutoLaunch;
    /** Indicates whether or not to Block setting a maintenance window for device updates. */
    private Boolean _maintenanceWindowBlocked;
    /** Maintenance window duration for device updates. Valid values 0 to 5 */
    private Integer _maintenanceWindowDurationInHours;
    /** Maintenance window start time for device updates. */
    private LocalTime _maintenanceWindowStartTime;
    /** Indicates whether or not to Block wireless projection. */
    private Boolean _miracastBlocked;
    /** Possible values for Miracast channel. */
    private MiracastChannel _miracastChannel;
    /** Indicates whether or not to require a pin for wireless projection. */
    private Boolean _miracastRequirePin;
    /** Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365. */
    private Boolean _settingsBlockMyMeetingsAndFiles;
    /** Specifies whether to allow the ability to resume a session when the session times out. */
    private Boolean _settingsBlockSessionResume;
    /** Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings. */
    private Boolean _settingsBlockSigninSuggestions;
    /** Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100 */
    private Integer _settingsDefaultVolume;
    /** Specifies the number of minutes until the Hub screen turns off. */
    private Integer _settingsScreenTimeoutInMinutes;
    /** Specifies the number of minutes until the session times out. */
    private Integer _settingsSessionTimeoutInMinutes;
    /** Specifies the number of minutes until the Hub enters sleep mode. */
    private Integer _settingsSleepTimeoutInMinutes;
    /** The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image. */
    private String _welcomeScreenBackgroundImageUrl;
    /** Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room. */
    private Boolean _welcomeScreenBlockAutomaticWakeUp;
    /** Possible values for welcome screen meeting information. */
    private WelcomeScreenMeetingInformation _welcomeScreenMeetingInformation;
    /**
     * Instantiates a new Windows10TeamGeneralConfiguration and sets the default values.
     * @return a void
     */
    public Windows10TeamGeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10TeamGeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10TeamGeneralConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10TeamGeneralConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10TeamGeneralConfiguration();
    }
    /**
     * Gets the azureOperationalInsightsBlockTelemetry property value. Indicates whether or not to Block Azure Operational Insights.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureOperationalInsightsBlockTelemetry() {
        return this._azureOperationalInsightsBlockTelemetry;
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceId() {
        return this._azureOperationalInsightsWorkspaceId;
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceKey() {
        return this._azureOperationalInsightsWorkspaceKey;
    }
    /**
     * Gets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectAppBlockAutoLaunch() {
        return this._connectAppBlockAutoLaunch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10TeamGeneralConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("azureOperationalInsightsBlockTelemetry", (n) -> { currentObject.setAzureOperationalInsightsBlockTelemetry(n.getBooleanValue()); });
            this.put("azureOperationalInsightsWorkspaceId", (n) -> { currentObject.setAzureOperationalInsightsWorkspaceId(n.getStringValue()); });
            this.put("azureOperationalInsightsWorkspaceKey", (n) -> { currentObject.setAzureOperationalInsightsWorkspaceKey(n.getStringValue()); });
            this.put("connectAppBlockAutoLaunch", (n) -> { currentObject.setConnectAppBlockAutoLaunch(n.getBooleanValue()); });
            this.put("maintenanceWindowBlocked", (n) -> { currentObject.setMaintenanceWindowBlocked(n.getBooleanValue()); });
            this.put("maintenanceWindowDurationInHours", (n) -> { currentObject.setMaintenanceWindowDurationInHours(n.getIntegerValue()); });
            this.put("maintenanceWindowStartTime", (n) -> { currentObject.setMaintenanceWindowStartTime(n.getLocalTimeValue()); });
            this.put("miracastBlocked", (n) -> { currentObject.setMiracastBlocked(n.getBooleanValue()); });
            this.put("miracastChannel", (n) -> { currentObject.setMiracastChannel(n.getEnumValue(MiracastChannel.class)); });
            this.put("miracastRequirePin", (n) -> { currentObject.setMiracastRequirePin(n.getBooleanValue()); });
            this.put("settingsBlockMyMeetingsAndFiles", (n) -> { currentObject.setSettingsBlockMyMeetingsAndFiles(n.getBooleanValue()); });
            this.put("settingsBlockSessionResume", (n) -> { currentObject.setSettingsBlockSessionResume(n.getBooleanValue()); });
            this.put("settingsBlockSigninSuggestions", (n) -> { currentObject.setSettingsBlockSigninSuggestions(n.getBooleanValue()); });
            this.put("settingsDefaultVolume", (n) -> { currentObject.setSettingsDefaultVolume(n.getIntegerValue()); });
            this.put("settingsScreenTimeoutInMinutes", (n) -> { currentObject.setSettingsScreenTimeoutInMinutes(n.getIntegerValue()); });
            this.put("settingsSessionTimeoutInMinutes", (n) -> { currentObject.setSettingsSessionTimeoutInMinutes(n.getIntegerValue()); });
            this.put("settingsSleepTimeoutInMinutes", (n) -> { currentObject.setSettingsSleepTimeoutInMinutes(n.getIntegerValue()); });
            this.put("welcomeScreenBackgroundImageUrl", (n) -> { currentObject.setWelcomeScreenBackgroundImageUrl(n.getStringValue()); });
            this.put("welcomeScreenBlockAutomaticWakeUp", (n) -> { currentObject.setWelcomeScreenBlockAutomaticWakeUp(n.getBooleanValue()); });
            this.put("welcomeScreenMeetingInformation", (n) -> { currentObject.setWelcomeScreenMeetingInformation(n.getEnumValue(WelcomeScreenMeetingInformation.class)); });
        }};
    }
    /**
     * Gets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMaintenanceWindowBlocked() {
        return this._maintenanceWindowBlocked;
    }
    /**
     * Gets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaintenanceWindowDurationInHours() {
        return this._maintenanceWindowDurationInHours;
    }
    /**
     * Gets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getMaintenanceWindowStartTime() {
        return this._maintenanceWindowStartTime;
    }
    /**
     * Gets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMiracastBlocked() {
        return this._miracastBlocked;
    }
    /**
     * Gets the miracastChannel property value. Possible values for Miracast channel.
     * @return a miracastChannel
     */
    @javax.annotation.Nullable
    public MiracastChannel getMiracastChannel() {
        return this._miracastChannel;
    }
    /**
     * Gets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMiracastRequirePin() {
        return this._miracastRequirePin;
    }
    /**
     * Gets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockMyMeetingsAndFiles() {
        return this._settingsBlockMyMeetingsAndFiles;
    }
    /**
     * Gets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSessionResume() {
        return this._settingsBlockSessionResume;
    }
    /**
     * Gets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSigninSuggestions() {
        return this._settingsBlockSigninSuggestions;
    }
    /**
     * Gets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingsDefaultVolume() {
        return this._settingsDefaultVolume;
    }
    /**
     * Gets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingsScreenTimeoutInMinutes() {
        return this._settingsScreenTimeoutInMinutes;
    }
    /**
     * Gets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingsSessionTimeoutInMinutes() {
        return this._settingsSessionTimeoutInMinutes;
    }
    /**
     * Gets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingsSleepTimeoutInMinutes() {
        return this._settingsSleepTimeoutInMinutes;
    }
    /**
     * Gets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWelcomeScreenBackgroundImageUrl() {
        return this._welcomeScreenBackgroundImageUrl;
    }
    /**
     * Gets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWelcomeScreenBlockAutomaticWakeUp() {
        return this._welcomeScreenBlockAutomaticWakeUp;
    }
    /**
     * Gets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @return a welcomeScreenMeetingInformation
     */
    @javax.annotation.Nullable
    public WelcomeScreenMeetingInformation getWelcomeScreenMeetingInformation() {
        return this._welcomeScreenMeetingInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("azureOperationalInsightsBlockTelemetry", this.getAzureOperationalInsightsBlockTelemetry());
        writer.writeStringValue("azureOperationalInsightsWorkspaceId", this.getAzureOperationalInsightsWorkspaceId());
        writer.writeStringValue("azureOperationalInsightsWorkspaceKey", this.getAzureOperationalInsightsWorkspaceKey());
        writer.writeBooleanValue("connectAppBlockAutoLaunch", this.getConnectAppBlockAutoLaunch());
        writer.writeBooleanValue("maintenanceWindowBlocked", this.getMaintenanceWindowBlocked());
        writer.writeIntegerValue("maintenanceWindowDurationInHours", this.getMaintenanceWindowDurationInHours());
        writer.writeLocalTimeValue("maintenanceWindowStartTime", this.getMaintenanceWindowStartTime());
        writer.writeBooleanValue("miracastBlocked", this.getMiracastBlocked());
        writer.writeEnumValue("miracastChannel", this.getMiracastChannel());
        writer.writeBooleanValue("miracastRequirePin", this.getMiracastRequirePin());
        writer.writeBooleanValue("settingsBlockMyMeetingsAndFiles", this.getSettingsBlockMyMeetingsAndFiles());
        writer.writeBooleanValue("settingsBlockSessionResume", this.getSettingsBlockSessionResume());
        writer.writeBooleanValue("settingsBlockSigninSuggestions", this.getSettingsBlockSigninSuggestions());
        writer.writeIntegerValue("settingsDefaultVolume", this.getSettingsDefaultVolume());
        writer.writeIntegerValue("settingsScreenTimeoutInMinutes", this.getSettingsScreenTimeoutInMinutes());
        writer.writeIntegerValue("settingsSessionTimeoutInMinutes", this.getSettingsSessionTimeoutInMinutes());
        writer.writeIntegerValue("settingsSleepTimeoutInMinutes", this.getSettingsSleepTimeoutInMinutes());
        writer.writeStringValue("welcomeScreenBackgroundImageUrl", this.getWelcomeScreenBackgroundImageUrl());
        writer.writeBooleanValue("welcomeScreenBlockAutomaticWakeUp", this.getWelcomeScreenBlockAutomaticWakeUp());
        writer.writeEnumValue("welcomeScreenMeetingInformation", this.getWelcomeScreenMeetingInformation());
    }
    /**
     * Sets the azureOperationalInsightsBlockTelemetry property value. Indicates whether or not to Block Azure Operational Insights.
     * @param value Value to set for the azureOperationalInsightsBlockTelemetry property.
     * @return a void
     */
    public void setAzureOperationalInsightsBlockTelemetry(@javax.annotation.Nullable final Boolean value) {
        this._azureOperationalInsightsBlockTelemetry = value;
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @param value Value to set for the azureOperationalInsightsWorkspaceId property.
     * @return a void
     */
    public void setAzureOperationalInsightsWorkspaceId(@javax.annotation.Nullable final String value) {
        this._azureOperationalInsightsWorkspaceId = value;
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @param value Value to set for the azureOperationalInsightsWorkspaceKey property.
     * @return a void
     */
    public void setAzureOperationalInsightsWorkspaceKey(@javax.annotation.Nullable final String value) {
        this._azureOperationalInsightsWorkspaceKey = value;
    }
    /**
     * Sets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @param value Value to set for the connectAppBlockAutoLaunch property.
     * @return a void
     */
    public void setConnectAppBlockAutoLaunch(@javax.annotation.Nullable final Boolean value) {
        this._connectAppBlockAutoLaunch = value;
    }
    /**
     * Sets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @param value Value to set for the maintenanceWindowBlocked property.
     * @return a void
     */
    public void setMaintenanceWindowBlocked(@javax.annotation.Nullable final Boolean value) {
        this._maintenanceWindowBlocked = value;
    }
    /**
     * Sets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @param value Value to set for the maintenanceWindowDurationInHours property.
     * @return a void
     */
    public void setMaintenanceWindowDurationInHours(@javax.annotation.Nullable final Integer value) {
        this._maintenanceWindowDurationInHours = value;
    }
    /**
     * Sets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @param value Value to set for the maintenanceWindowStartTime property.
     * @return a void
     */
    public void setMaintenanceWindowStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._maintenanceWindowStartTime = value;
    }
    /**
     * Sets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @param value Value to set for the miracastBlocked property.
     * @return a void
     */
    public void setMiracastBlocked(@javax.annotation.Nullable final Boolean value) {
        this._miracastBlocked = value;
    }
    /**
     * Sets the miracastChannel property value. Possible values for Miracast channel.
     * @param value Value to set for the miracastChannel property.
     * @return a void
     */
    public void setMiracastChannel(@javax.annotation.Nullable final MiracastChannel value) {
        this._miracastChannel = value;
    }
    /**
     * Sets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @param value Value to set for the miracastRequirePin property.
     * @return a void
     */
    public void setMiracastRequirePin(@javax.annotation.Nullable final Boolean value) {
        this._miracastRequirePin = value;
    }
    /**
     * Sets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @param value Value to set for the settingsBlockMyMeetingsAndFiles property.
     * @return a void
     */
    public void setSettingsBlockMyMeetingsAndFiles(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockMyMeetingsAndFiles = value;
    }
    /**
     * Sets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @param value Value to set for the settingsBlockSessionResume property.
     * @return a void
     */
    public void setSettingsBlockSessionResume(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSessionResume = value;
    }
    /**
     * Sets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @param value Value to set for the settingsBlockSigninSuggestions property.
     * @return a void
     */
    public void setSettingsBlockSigninSuggestions(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSigninSuggestions = value;
    }
    /**
     * Sets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @param value Value to set for the settingsDefaultVolume property.
     * @return a void
     */
    public void setSettingsDefaultVolume(@javax.annotation.Nullable final Integer value) {
        this._settingsDefaultVolume = value;
    }
    /**
     * Sets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @param value Value to set for the settingsScreenTimeoutInMinutes property.
     * @return a void
     */
    public void setSettingsScreenTimeoutInMinutes(@javax.annotation.Nullable final Integer value) {
        this._settingsScreenTimeoutInMinutes = value;
    }
    /**
     * Sets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @param value Value to set for the settingsSessionTimeoutInMinutes property.
     * @return a void
     */
    public void setSettingsSessionTimeoutInMinutes(@javax.annotation.Nullable final Integer value) {
        this._settingsSessionTimeoutInMinutes = value;
    }
    /**
     * Sets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @param value Value to set for the settingsSleepTimeoutInMinutes property.
     * @return a void
     */
    public void setSettingsSleepTimeoutInMinutes(@javax.annotation.Nullable final Integer value) {
        this._settingsSleepTimeoutInMinutes = value;
    }
    /**
     * Sets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @param value Value to set for the welcomeScreenBackgroundImageUrl property.
     * @return a void
     */
    public void setWelcomeScreenBackgroundImageUrl(@javax.annotation.Nullable final String value) {
        this._welcomeScreenBackgroundImageUrl = value;
    }
    /**
     * Sets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @param value Value to set for the welcomeScreenBlockAutomaticWakeUp property.
     * @return a void
     */
    public void setWelcomeScreenBlockAutomaticWakeUp(@javax.annotation.Nullable final Boolean value) {
        this._welcomeScreenBlockAutomaticWakeUp = value;
    }
    /**
     * Sets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @param value Value to set for the welcomeScreenMeetingInformation property.
     * @return a void
     */
    public void setWelcomeScreenMeetingInformation(@javax.annotation.Nullable final WelcomeScreenMeetingInformation value) {
        this._welcomeScreenMeetingInformation = value;
    }
}
