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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10TeamGeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10TeamGeneralConfiguration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static Windows10TeamGeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10TeamGeneralConfiguration();
    }
    /**
     * Gets the azureOperationalInsightsBlockTelemetry property value. Indicates whether or not to Block Azure Operational Insights.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureOperationalInsightsBlockTelemetry() {
        return this.backingStore.get("azureOperationalInsightsBlockTelemetry");
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceId() {
        return this.backingStore.get("azureOperationalInsightsWorkspaceId");
    }
    /**
     * Gets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureOperationalInsightsWorkspaceKey() {
        return this.backingStore.get("azureOperationalInsightsWorkspaceKey");
    }
    /**
     * Gets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectAppBlockAutoLaunch() {
        return this.backingStore.get("connectAppBlockAutoLaunch");
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
        deserializerMap.put("miracastChannel", (n) -> { this.setMiracastChannel(n.getEnumValue(MiracastChannel::forValue)); });
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
        deserializerMap.put("welcomeScreenMeetingInformation", (n) -> { this.setWelcomeScreenMeetingInformation(n.getEnumValue(WelcomeScreenMeetingInformation::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMaintenanceWindowBlocked() {
        return this.backingStore.get("maintenanceWindowBlocked");
    }
    /**
     * Gets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaintenanceWindowDurationInHours() {
        return this.backingStore.get("maintenanceWindowDurationInHours");
    }
    /**
     * Gets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getMaintenanceWindowStartTime() {
        return this.backingStore.get("maintenanceWindowStartTime");
    }
    /**
     * Gets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMiracastBlocked() {
        return this.backingStore.get("miracastBlocked");
    }
    /**
     * Gets the miracastChannel property value. Possible values for Miracast channel.
     * @return a MiracastChannel
     */
    @jakarta.annotation.Nullable
    public MiracastChannel getMiracastChannel() {
        return this.backingStore.get("miracastChannel");
    }
    /**
     * Gets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMiracastRequirePin() {
        return this.backingStore.get("miracastRequirePin");
    }
    /**
     * Gets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockMyMeetingsAndFiles() {
        return this.backingStore.get("settingsBlockMyMeetingsAndFiles");
    }
    /**
     * Gets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSessionResume() {
        return this.backingStore.get("settingsBlockSessionResume");
    }
    /**
     * Gets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSigninSuggestions() {
        return this.backingStore.get("settingsBlockSigninSuggestions");
    }
    /**
     * Gets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsDefaultVolume() {
        return this.backingStore.get("settingsDefaultVolume");
    }
    /**
     * Gets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsScreenTimeoutInMinutes() {
        return this.backingStore.get("settingsScreenTimeoutInMinutes");
    }
    /**
     * Gets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsSessionTimeoutInMinutes() {
        return this.backingStore.get("settingsSessionTimeoutInMinutes");
    }
    /**
     * Gets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingsSleepTimeoutInMinutes() {
        return this.backingStore.get("settingsSleepTimeoutInMinutes");
    }
    /**
     * Gets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWelcomeScreenBackgroundImageUrl() {
        return this.backingStore.get("welcomeScreenBackgroundImageUrl");
    }
    /**
     * Gets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWelcomeScreenBlockAutomaticWakeUp() {
        return this.backingStore.get("welcomeScreenBlockAutomaticWakeUp");
    }
    /**
     * Gets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @return a WelcomeScreenMeetingInformation
     */
    @jakarta.annotation.Nullable
    public WelcomeScreenMeetingInformation getWelcomeScreenMeetingInformation() {
        return this.backingStore.get("welcomeScreenMeetingInformation");
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
        this.backingStore.set("azureOperationalInsightsBlockTelemetry", value);
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceId property value. The Azure Operational Insights workspace id.
     * @param value Value to set for the azureOperationalInsightsWorkspaceId property.
     */
    public void setAzureOperationalInsightsWorkspaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureOperationalInsightsWorkspaceId", value);
    }
    /**
     * Sets the azureOperationalInsightsWorkspaceKey property value. The Azure Operational Insights Workspace key.
     * @param value Value to set for the azureOperationalInsightsWorkspaceKey property.
     */
    public void setAzureOperationalInsightsWorkspaceKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureOperationalInsightsWorkspaceKey", value);
    }
    /**
     * Sets the connectAppBlockAutoLaunch property value. Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     * @param value Value to set for the connectAppBlockAutoLaunch property.
     */
    public void setConnectAppBlockAutoLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectAppBlockAutoLaunch", value);
    }
    /**
     * Sets the maintenanceWindowBlocked property value. Indicates whether or not to Block setting a maintenance window for device updates.
     * @param value Value to set for the maintenanceWindowBlocked property.
     */
    public void setMaintenanceWindowBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("maintenanceWindowBlocked", value);
    }
    /**
     * Sets the maintenanceWindowDurationInHours property value. Maintenance window duration for device updates. Valid values 0 to 5
     * @param value Value to set for the maintenanceWindowDurationInHours property.
     */
    public void setMaintenanceWindowDurationInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maintenanceWindowDurationInHours", value);
    }
    /**
     * Sets the maintenanceWindowStartTime property value. Maintenance window start time for device updates.
     * @param value Value to set for the maintenanceWindowStartTime property.
     */
    public void setMaintenanceWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("maintenanceWindowStartTime", value);
    }
    /**
     * Sets the miracastBlocked property value. Indicates whether or not to Block wireless projection.
     * @param value Value to set for the miracastBlocked property.
     */
    public void setMiracastBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("miracastBlocked", value);
    }
    /**
     * Sets the miracastChannel property value. Possible values for Miracast channel.
     * @param value Value to set for the miracastChannel property.
     */
    public void setMiracastChannel(@jakarta.annotation.Nullable final MiracastChannel value) {
        this.backingStore.set("miracastChannel", value);
    }
    /**
     * Sets the miracastRequirePin property value. Indicates whether or not to require a pin for wireless projection.
     * @param value Value to set for the miracastRequirePin property.
     */
    public void setMiracastRequirePin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("miracastRequirePin", value);
    }
    /**
     * Sets the settingsBlockMyMeetingsAndFiles property value. Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     * @param value Value to set for the settingsBlockMyMeetingsAndFiles property.
     */
    public void setSettingsBlockMyMeetingsAndFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockMyMeetingsAndFiles", value);
    }
    /**
     * Sets the settingsBlockSessionResume property value. Specifies whether to allow the ability to resume a session when the session times out.
     * @param value Value to set for the settingsBlockSessionResume property.
     */
    public void setSettingsBlockSessionResume(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockSessionResume", value);
    }
    /**
     * Sets the settingsBlockSigninSuggestions property value. Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     * @param value Value to set for the settingsBlockSigninSuggestions property.
     */
    public void setSettingsBlockSigninSuggestions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockSigninSuggestions", value);
    }
    /**
     * Sets the settingsDefaultVolume property value. Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     * @param value Value to set for the settingsDefaultVolume property.
     */
    public void setSettingsDefaultVolume(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingsDefaultVolume", value);
    }
    /**
     * Sets the settingsScreenTimeoutInMinutes property value. Specifies the number of minutes until the Hub screen turns off.
     * @param value Value to set for the settingsScreenTimeoutInMinutes property.
     */
    public void setSettingsScreenTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingsScreenTimeoutInMinutes", value);
    }
    /**
     * Sets the settingsSessionTimeoutInMinutes property value. Specifies the number of minutes until the session times out.
     * @param value Value to set for the settingsSessionTimeoutInMinutes property.
     */
    public void setSettingsSessionTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingsSessionTimeoutInMinutes", value);
    }
    /**
     * Sets the settingsSleepTimeoutInMinutes property value. Specifies the number of minutes until the Hub enters sleep mode.
     * @param value Value to set for the settingsSleepTimeoutInMinutes property.
     */
    public void setSettingsSleepTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingsSleepTimeoutInMinutes", value);
    }
    /**
     * Sets the welcomeScreenBackgroundImageUrl property value. The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     * @param value Value to set for the welcomeScreenBackgroundImageUrl property.
     */
    public void setWelcomeScreenBackgroundImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("welcomeScreenBackgroundImageUrl", value);
    }
    /**
     * Sets the welcomeScreenBlockAutomaticWakeUp property value. Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     * @param value Value to set for the welcomeScreenBlockAutomaticWakeUp property.
     */
    public void setWelcomeScreenBlockAutomaticWakeUp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("welcomeScreenBlockAutomaticWakeUp", value);
    }
    /**
     * Sets the welcomeScreenMeetingInformation property value. Possible values for welcome screen meeting information.
     * @param value Value to set for the welcomeScreenMeetingInformation property.
     */
    public void setWelcomeScreenMeetingInformation(@jakarta.annotation.Nullable final WelcomeScreenMeetingInformation value) {
        this.backingStore.set("welcomeScreenMeetingInformation", value);
    }
}
