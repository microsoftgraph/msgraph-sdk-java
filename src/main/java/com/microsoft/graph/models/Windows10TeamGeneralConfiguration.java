package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the windows10TeamGeneralConfiguration resource.
 */
public class Windows10TeamGeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Indicates whether or not to Block Azure Operational Insights.
     */
    private Boolean azureOperationalInsightsBlockTelemetry;
    /**
     * The Azure Operational Insights workspace id.
     */
    private String azureOperationalInsightsWorkspaceId;
    /**
     * The Azure Operational Insights Workspace key.
     */
    private String azureOperationalInsightsWorkspaceKey;
    /**
     * Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     */
    private Boolean connectAppBlockAutoLaunch;
    /**
     * Indicates whether or not to Block setting a maintenance window for device updates.
     */
    private Boolean maintenanceWindowBlocked;
    /**
     * Maintenance window duration for device updates. Valid values 0 to 5
     */
    private Integer maintenanceWindowDurationInHours;
    /**
     * Maintenance window start time for device updates.
     */
    private LocalTime maintenanceWindowStartTime;
    /**
     * Indicates whether or not to Block wireless projection.
     */
    private Boolean miracastBlocked;
    /**
     * Possible values for Miracast channel.
     */
    private MiracastChannel miracastChannel;
    /**
     * Indicates whether or not to require a pin for wireless projection.
     */
    private Boolean miracastRequirePin;
    /**
     * Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     */
    private Boolean settingsBlockMyMeetingsAndFiles;
    /**
     * Specifies whether to allow the ability to resume a session when the session times out.
     */
    private Boolean settingsBlockSessionResume;
    /**
     * Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     */
    private Boolean settingsBlockSigninSuggestions;
    /**
     * Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     */
    private Integer settingsDefaultVolume;
    /**
     * Specifies the number of minutes until the Hub screen turns off.
     */
    private Integer settingsScreenTimeoutInMinutes;
    /**
     * Specifies the number of minutes until the session times out.
     */
    private Integer settingsSessionTimeoutInMinutes;
    /**
     * Specifies the number of minutes until the Hub enters sleep mode.
     */
    private Integer settingsSleepTimeoutInMinutes;
    /**
     * The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     */
    private String welcomeScreenBackgroundImageUrl;
    /**
     * Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     */
    private Boolean welcomeScreenBlockAutomaticWakeUp;
    /**
     * Possible values for welcome screen meeting information.
     */
    private WelcomeScreenMeetingInformation welcomeScreenMeetingInformation;
    /**
     * Instantiates a new windows10TeamGeneralConfiguration and sets the default values.
     */
    public Windows10TeamGeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10TeamGeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10TeamGeneralConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10TeamGeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10TeamGeneralConfiguration();
    }
    /**
     * Gets the azureOperationalInsightsBlockTelemetry property value. Indicates whether or not to Block Azure Operational Insights.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureOperationalInsightsBlockTelemetry() {
        return this.azureOperationalInsightsBlockTelemetry;
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceId() {
        return this.azureOperationalInsightsWorkspaceId;
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceKey() {
        return this.azureOperationalInsightsWorkspaceKey;
    }
    /**
     * Gets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAppBlockAutoLaunch() {
        return this.connectAppBlockAutoLaunch;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureOperationalInsightsBlockTelemetry", (n) -> { this.setAzureOperationalInsightsBlockTelemetry(n.getBooleanValue()); });
        deserializerMap.put("azureOperationalInsightsWorkspaceId", (n) -> { this.setAzureOperationalInsightsWorkspaceId(n.getStringValue()); });
        deserializerMap.put("azureOperationalInsightsWorkspaceKey", (n) -> { this.setAzureOperationalInsightsWorkspaceKey(n.getStringValue()); });
        deserializerMap.put("connectAppBlockAutoLaunch", (n) -> { this.setConnectAppBlockAutoLaunch(n.getBooleanValue()); });
        deserializerMap.put("maintenanceWindowBlocked", (n) -> { this.setMaintenanceWindowBlocked(n.getBooleanValue()); });
        deserializerMap.put("maintenanceWindowDurationInHours", (n) -> { this.setMaintenanceWindowDurationInHours(n.getIntegerValue()); });
        deserializerMap.put("maintenanceWindowStartTime", (n) -> { this.setMaintenanceWindowStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("miracastBlocked", (n) -> { this.setMiracastBlocked(n.getBooleanValue()); });
        deserializerMap.put("miracastChannel", (n) -> { this.setMiracastChannel(n.getEnumValue(MiracastChannel.class)); });
        deserializerMap.put("miracastRequirePin", (n) -> { this.setMiracastRequirePin(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockMyMeetingsAndFiles", (n) -> { this.setSettingsBlockMyMeetingsAndFiles(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSessionResume", (n) -> { this.setSettingsBlockSessionResume(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSigninSuggestions", (n) -> { this.setSettingsBlockSigninSuggestions(n.getBooleanValue()); });
        deserializerMap.put("settingsDefaultVolume", (n) -> { this.setSettingsDefaultVolume(n.getIntegerValue()); });
        deserializerMap.put("settingsScreenTimeoutInMinutes", (n) -> { this.setSettingsScreenTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("settingsSessionTimeoutInMinutes", (n) -> { this.setSettingsSessionTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("settingsSleepTimeoutInMinutes", (n) -> { this.setSettingsSleepTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("welcomeScreenBackgroundImageUrl", (n) -> { this.setWelcomeScreenBackgroundImageUrl(n.getStringValue()); });
        deserializerMap.put("welcomeScreenBlockAutomaticWakeUp", (n) -> { this.setWelcomeScreenBlockAutomaticWakeUp(n.getBooleanValue()); });
        deserializerMap.put("welcomeScreenMeetingInformation", (n) -> { this.setWelcomeScreenMeetingInformation(n.getEnumValue(WelcomeScreenMeetingInformation.class)); });
        return deserializerMap;
    }
    /**
     * Gets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMaintenanceWindowBlocked() {
        return this.maintenanceWindowBlocked;
    }
    /**
     * Gets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaintenanceWindowDurationInHours() {
        return this.maintenanceWindowDurationInHours;
    }
    /**
     * Gets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }
    /**
     * Gets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMiracastBlocked() {
        return this.miracastBlocked;
    }
    /**
     * Gets the miracastChannel property value. Possible values for Miracast channel.
     * @return a miracastChannel
     */
    @jakarta.annotation.Nullable
    public MiracastChannel getMiracastChannel() {
        return this.miracastChannel;
    }
    /**
     * Gets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMiracastRequirePin() {
        return this.miracastRequirePin;
    }
    /**
     * Gets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockMyMeetingsAndFiles() {
        return this.settingsBlockMyMeetingsAndFiles;
    }
    /**
     * Gets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSessionResume() {
        return this.settingsBlockSessionResume;
    }
    /**
     * Gets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSigninSuggestions() {
        return this.settingsBlockSigninSuggestions;
    }
    /**
     * Gets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsDefaultVolume() {
        return this.settingsDefaultVolume;
    }
    /**
     * Gets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsScreenTimeoutInMinutes() {
        return this.settingsScreenTimeoutInMinutes;
    }
    /**
     * Gets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsSessionTimeoutInMinutes() {
        return this.settingsSessionTimeoutInMinutes;
    }
    /**
     * Gets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsSleepTimeoutInMinutes() {
        return this.settingsSleepTimeoutInMinutes;
    }
    /**
     * Gets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWelcomeScreenBackgroundImageUrl() {
        return this.welcomeScreenBackgroundImageUrl;
    }
    /**
     * Gets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWelcomeScreenBlockAutomaticWakeUp() {
        return this.welcomeScreenBlockAutomaticWakeUp;
    }
    /**
     * Gets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @return a welcomeScreenMeetingInformation
     */
    @jakarta.annotation.Nullable
    public WelcomeScreenMeetingInformation getWelcomeScreenMeetingInformation() {
        return this.welcomeScreenMeetingInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAzureOperationalInsightsBlockTelemetry(@jakarta.annotation.Nullable final Boolean value) {
        this.azureOperationalInsightsBlockTelemetry = value;
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @param value Value to set for the azureOperationalInsightsWorkspaceId property.
     */
    public void setAzureOperationalInsightsWorkspaceId(@jakarta.annotation.Nullable final String value) {
        this.azureOperationalInsightsWorkspaceId = value;
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @param value Value to set for the azureOperationalInsightsWorkspaceKey property.
     */
    public void setAzureOperationalInsightsWorkspaceKey(@jakarta.annotation.Nullable final String value) {
        this.azureOperationalInsightsWorkspaceKey = value;
    }
    /**
     * Sets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @param value Value to set for the connectAppBlockAutoLaunch property.
     */
    public void setConnectAppBlockAutoLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.connectAppBlockAutoLaunch = value;
    }
    /**
     * Sets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @param value Value to set for the maintenanceWindowBlocked property.
     */
    public void setMaintenanceWindowBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.maintenanceWindowBlocked = value;
    }
    /**
     * Sets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @param value Value to set for the maintenanceWindowDurationInHours property.
     */
    public void setMaintenanceWindowDurationInHours(@jakarta.annotation.Nullable final Integer value) {
        this.maintenanceWindowDurationInHours = value;
    }
    /**
     * Sets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @param value Value to set for the maintenanceWindowStartTime property.
     */
    public void setMaintenanceWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.maintenanceWindowStartTime = value;
    }
    /**
     * Sets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @param value Value to set for the miracastBlocked property.
     */
    public void setMiracastBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.miracastBlocked = value;
    }
    /**
     * Sets the miracastChannel property value. Possible values for Miracast channel.
     * @param value Value to set for the miracastChannel property.
     */
    public void setMiracastChannel(@jakarta.annotation.Nullable final MiracastChannel value) {
        this.miracastChannel = value;
    }
    /**
     * Sets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @param value Value to set for the miracastRequirePin property.
     */
    public void setMiracastRequirePin(@jakarta.annotation.Nullable final Boolean value) {
        this.miracastRequirePin = value;
    }
    /**
     * Sets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @param value Value to set for the settingsBlockMyMeetingsAndFiles property.
     */
    public void setSettingsBlockMyMeetingsAndFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.settingsBlockMyMeetingsAndFiles = value;
    }
    /**
     * Sets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @param value Value to set for the settingsBlockSessionResume property.
     */
    public void setSettingsBlockSessionResume(@jakarta.annotation.Nullable final Boolean value) {
        this.settingsBlockSessionResume = value;
    }
    /**
     * Sets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @param value Value to set for the settingsBlockSigninSuggestions property.
     */
    public void setSettingsBlockSigninSuggestions(@jakarta.annotation.Nullable final Boolean value) {
        this.settingsBlockSigninSuggestions = value;
    }
    /**
     * Sets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @param value Value to set for the settingsDefaultVolume property.
     */
    public void setSettingsDefaultVolume(@jakarta.annotation.Nullable final Integer value) {
        this.settingsDefaultVolume = value;
    }
    /**
     * Sets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @param value Value to set for the settingsScreenTimeoutInMinutes property.
     */
    public void setSettingsScreenTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.settingsScreenTimeoutInMinutes = value;
    }
    /**
     * Sets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @param value Value to set for the settingsSessionTimeoutInMinutes property.
     */
    public void setSettingsSessionTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.settingsSessionTimeoutInMinutes = value;
    }
    /**
     * Sets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @param value Value to set for the settingsSleepTimeoutInMinutes property.
     */
    public void setSettingsSleepTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.settingsSleepTimeoutInMinutes = value;
    }
    /**
     * Sets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @param value Value to set for the welcomeScreenBackgroundImageUrl property.
     */
    public void setWelcomeScreenBackgroundImageUrl(@jakarta.annotation.Nullable final String value) {
        this.welcomeScreenBackgroundImageUrl = value;
    }
    /**
     * Sets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @param value Value to set for the welcomeScreenBlockAutomaticWakeUp property.
     */
    public void setWelcomeScreenBlockAutomaticWakeUp(@jakarta.annotation.Nullable final Boolean value) {
        this.welcomeScreenBlockAutomaticWakeUp = value;
    }
    /**
     * Sets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @param value Value to set for the welcomeScreenMeetingInformation property.
     */
    public void setWelcomeScreenMeetingInformation(@jakarta.annotation.Nullable final WelcomeScreenMeetingInformation value) {
        this.welcomeScreenMeetingInformation = value;
    }
}
